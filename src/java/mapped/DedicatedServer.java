package mapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Util;
import net.minecraft.command.CommandSource;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.network.rcon.MainThread;
import net.minecraft.network.rcon.QueryThread;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.server.dedicated.DedicatedPlayerList;
import net.minecraft.server.dedicated.PendingCommand;
import net.minecraft.server.dedicated.ServerHangWatchdog;
import net.minecraft.server.dedicated.ServerInfoMBean;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.util.DefaultUncaughtExceptionHandler;
import net.minecraft.util.DefaultWithNameUncaughtExceptionHandler;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.filter.ChatFilterClient;
import net.minecraft.util.text.filter.IChatFilter;
import net.minecraft.world.GameRules;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;

public class DedicatedServer extends MinecraftServer implements Class1646 {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final Pattern field8928 = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final List<PendingCommand> pendingCommandList = Collections
         .<PendingCommand>synchronizedList(Lists.newArrayList());
   private QueryThread rconQueryThread;
   private final Class914 rconConsoleSource;
   private MainThread rconThread;
   private final Class6816 settings;
   private MinecraftServerGui field8934;
   private final ChatFilterClient field8935;

   public DedicatedServer(
         Thread var1,
         DynamicRegistriesImpl var2,
         SaveFormat.LevelSave var3,
         ResourcePackList var4,
         DataPackRegistries var5,
         IServerConfiguration var6,
         Class6816 var7,
         DataFixer var8,
         MinecraftSessionService var9,
         GameProfileRepository var10,
         PlayerProfileCache var11,
         Class8216 var12) {
      super(var1, var2, var3, var6, var4, Proxy.NO_PROXY, var8, var5, var9, var10, var11, var12);
      this.settings = var7;
      this.rconConsoleSource = new Class914(this);
      this.field8935 = null;
   }

   @Override
   public boolean init() throws IOException {
      Thread thread = new Thread("Server console handler") {
         public void run() {
            BufferedReader bufferedreader = new BufferedReader(
                  new InputStreamReader(System.in, StandardCharsets.UTF_8));
            String s1;

            try {
               while (!DedicatedServer.this.isServerStopped() && DedicatedServer.this.isServerRunning()
                     && (s1 = bufferedreader.readLine()) != null) {
                  DedicatedServer.this.handleConsoleInput(s1, DedicatedServer.this.getCommandSource());
               }
            } catch (IOException ioexception1) {
               DedicatedServer.LOGGER.error("Exception handling console input", (Throwable) ioexception1);
            }
         }
      };
      thread.setDaemon(true);
      thread.setUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler(LOGGER));
      thread.start();
      LOGGER.info("Starting minecraft server version " + SharedConstants.getVersion().getName());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         LOGGER.warn(
               "To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      LOGGER.info("Loading properties");
      ServerProperties serverproperties = this.settings.getProperties();
      if (this.isSinglePlayer()) {
         this.setHostname("127.0.0.1");
      } else {
         this.setOnlineMode(serverproperties.onlineMode);
         this.setPreventProxyConnections(serverproperties.preventProxyConnections);
         this.setHostname(serverproperties.serverIp);
      }

      this.setAllowPvp(serverproperties.allowPvp);
      this.setAllowFlight(serverproperties.allowFlight);
      this.setResourcePack(serverproperties.resourcePack, this.loadResourcePackSHA());
      this.setMOTD(serverproperties.motd);
      this.setForceGamemode(serverproperties.forceGamemode);
      super.setPlayerIdleTimeout(serverproperties.playerIdleTimeout.get());
      this.setWhitelistEnabled(serverproperties.enforceWhitelist);
      this.field_240768_i_.setGameType(serverproperties.gamemode);
      LOGGER.info("Default game type: {}", serverproperties.gamemode);
      InetAddress inetaddress = null;
      if (!this.getServerHostname().isEmpty()) {
         inetaddress = InetAddress.getByName(this.getServerHostname());
      }

      if (this.getServerPort() < 0) {
         this.setServerPort(serverproperties.serverPort);
      }

      this.func_244801_P();
      LOGGER.info("Starting Minecraft server on {}:{}",
            this.getServerHostname().isEmpty() ? "*" : this.getServerHostname(), this.getServerPort());

      try {
         this.getNetworkSystem().addEndpoint(inetaddress, this.getServerPort());
      } catch (IOException var13) {
         LOGGER.warn("**** FAILED TO BIND TO PORT!");
         LOGGER.warn("The exception was: {}", var13.toString());
         LOGGER.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.isServerInOnlineMode()) {
         LOGGER.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         LOGGER.warn("The server will make no attempt to authenticate usernames. Beware.");
         LOGGER.warn(
               "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
         LOGGER.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.convertFiles()) {
         this.getPlayerProfileCache().save();
      }

      if (!PreYggdrasilConverter.func_219587_e(this)) {
         return false;
      } else {
         this.setPlayerList(new DedicatedPlayerList(this, this.field_240767_f_, this.playerDataManager));
         long i = Util.nanoTime();
         this.setBuildLimit(serverproperties.maxBuildHeight);
         SkullTileEntity.setProfileCache(this.getPlayerProfileCache());
         SkullTileEntity.setSessionService(this.getMinecraftSessionService());
         PlayerProfileCache.setOnlineMode(this.isServerInOnlineMode());
         LOGGER.info("Preparing level \"{}\"", this.func_230542_k__());
         this.func_240800_l__();
         long j = Util.nanoTime() - i;
         String s = String.format(Locale.ROOT, "%.3fs", (double) j / 1.0E9);
         LOGGER.info("Done ({})! For help, type \"help\"", s);
         if (serverproperties.announceAdvancements != null) {
            this.getGameRules().get(GameRules.ANNOUNCE_ADVANCEMENTS).set(serverproperties.announceAdvancements, this);
         }

         if (serverproperties.enableQuery) {
            LOGGER.info("Starting GS4 status listener");
            this.rconQueryThread = QueryThread.func_242129_a(this);
         }

         if (serverproperties.enableRcon) {
            LOGGER.info("Starting remote control listener");
            this.rconThread = MainThread.func_242130_a(this);
         }

         if (this.getMaxTickTime() > 0L) {
            Thread thread1 = new Thread(new ServerHangWatchdog(this));
            thread1.setUncaughtExceptionHandler(new DefaultWithNameUncaughtExceptionHandler(LOGGER));
            thread1.setName("Server Watchdog");
            thread1.setDaemon(true);
            thread1.start();
         }

         Items.AIR.fillItemGroup(ItemGroup.SEARCH, NonNullList.create());
         if (serverproperties.field_241079_P_) {
            ServerInfoMBean.func_233490_a_(this);
         }

         return true;
      }
   }

   @Override
   public boolean method1354() {
      return this.method6498().field43788 && super.method1354();
   }

   @Override
   public boolean method1341() {
      return this.settings.getProperties().field43811 && super.method1341();
   }

   @Override
   public boolean method1355() {
      return this.settings.getProperties().field43789 && super.method1355();
   }

   public String loadResourcePackSHA() {
      ServerProperties var3 = this.settings.getProperties();
      String var4;
      if (var3.field43808.isEmpty()) {
         if (Strings.isNullOrEmpty(var3.field43807)) {
            var4 = "";
         } else {
            LOGGER.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            var4 = var3.field43807;
         }
      } else {
         var4 = var3.field43808;
         if (!Strings.isNullOrEmpty(var3.field43807)) {
            LOGGER.warn(
                  "resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
         }
      }

      if (!var4.isEmpty() && !field8928.matcher(var4).matches()) {
         LOGGER.warn("Invalid sha1 for ressource-pack-sha1");
      }

      if (!var3.resourcePack.isEmpty() && var4.isEmpty()) {
         LOGGER.warn(
               "You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
      }

      return var4;
   }

   @Override
   public ServerProperties method6498() {
      return this.settings.getProperties();
   }

   @Override
   public void func_230543_p_() {
      this.setDifficultyForAllWorlds(this.method6498().field43796, true);
   }

   @Override
   public boolean method1287() {
      return this.method6498().field43809;
   }

   @Override
   public CrashReport method1326(CrashReport var1) {
      var1 = super.method1326(var1);
      var1.getCategory().addDetail("Is Modded", () -> this.func_230045_q_().orElse("Unknown (can't tell)"));
      var1.getCategory().addDetail("Type", () -> "Dedicated Server (map_server.txt)");
      return var1;
   }

   @Override
   public Optional<String> func_230045_q_() {
      String var3 = this.getServerModName();
      return "vanilla".equals(var3) ? Optional.<String>empty()
            : Optional.<String>of("Definitely; Server brand changed to '" + var3 + "'");
   }

   @Override
   public void method1309() {
      if (this.field8935 != null) {
         this.field8935.close();
      }

      if (this.field8934 != null) {
         this.field8934.method10556();
      }

      if (this.rconThread != null) {
         this.rconThread.method1868();
      }

      if (this.rconQueryThread != null) {
         this.rconQueryThread.method1868();
      }
   }

   @Override
   public void method1311(BooleanSupplier var1) {
      super.method1311(var1);
      this.executePendingCommands();
   }

   @Override
   public boolean method1312() {
      return this.method6498().field43810;
   }

   @Override
   public void fillSnooper(Snooper var1) {
      var1.addClientStat("whitelist_enabled", this.getPlayerList().method19476());
      var1.addClientStat("whitelist_count", this.getPlayerList().method19469().length);
      super.fillSnooper(var1);
   }

   public void handleConsoleInput(String var1, CommandSource var2) {
      this.pendingCommandList.add(new PendingCommand(var1, var2));
   }

   public void executePendingCommands() {
      while (!this.pendingCommandList.isEmpty()) {
         PendingCommand var3 = this.pendingCommandList.remove(0);
         this.commandManager.handleCommand(var3.field43317, var3.field43316);
      }
   }

   @Override
   public boolean isDedicatedServer() {
      return true;
   }

   @Override
   public int method1349() {
      return this.method6498().field43819;
   }

   @Override
   public boolean method1356() {
      return this.method6498().field43813;
   }

   public DedicatedPlayerList getPlayerList() {
      return (DedicatedPlayerList) super.getPlayerList();
   }

   @Override
   public boolean getPublic() {
      return true;
   }

   @Override
   public String method6501() {
      return this.getServerHostname();
   }

   @Override
   public int method6502() {
      return this.getServerPort();
   }

   @Override
   public String method6503() {
      return this.method1362();
   }

   public void method6504() {
      if (this.field8934 == null) {
         this.field8934 = MinecraftServerGui.func_219048_a(this);
      }
   }

   @Override
   public boolean method1373() {
      return this.field8934 != null;
   }

   @Override
   public boolean method1374(GameType var1, boolean var2, int var3) {
      return false;
   }

   @Override
   public boolean method1361() {
      return this.method6498().field43814;
   }

   @Override
   public int method1377() {
      return this.method6498().field43815;
   }

   @Override
   public boolean method1378(ServerWorld var1, BlockPos var2, PlayerEntity var3) {
      if (var1.getDimensionKey() == World.OVERWORLD) {
         if (!this.getPlayerList().method19470().method14440()) {
            if (!this.getPlayerList().canSendCommands(var3.getGameProfile())) {
               if (this.method1377() > 0) {
                  BlockPos var6 = var1.getSpawnPoint();
                  int var7 = MathHelper.abs(var2.getX() - var6.getX());
                  int var8 = MathHelper.abs(var2.getZ() - var6.getZ());
                  int var9 = Math.max(var7, var8);
                  return var9 <= this.method1377();
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method1381() {
      return this.method6498().field43828;
   }

   @Override
   public int method1288() {
      return this.method6498().field43816;
   }

   @Override
   public int getFunctionLevel() {
      return this.method6498().field43817;
   }

   @Override
   public void setPlayerIdleTimeout(int var1) {
      super.setPlayerIdleTimeout(var1);
      this.settings.method20781(var2 -> (ServerProperties) var2.playerIdleTimeout.method15917(this.method1437(), var1));
   }

   @Override
   public boolean method1290() {
      return this.method6498().field43823;
   }

   @Override
   public boolean method3425() {
      return this.method6498().field43824;
   }

   @Override
   public int method1389() {
      return this.method6498().field43825;
   }

   @Override
   public int getNetworkCompressionThreshold() {
      return this.method6498().field43822;
   }

   public boolean convertFiles() {
      boolean var3 = false;

      for (int var4 = 0; !var3 && var4 <= 2; var4++) {
         if (var4 > 0) {
            LOGGER.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.method6506();
         }

         var3 = PreYggdrasilConverter.method33728(this);
      }

      boolean var9 = false;

      for (int var5 = 0; !var9 && var5 <= 2; var5++) {
         if (var5 > 0) {
            LOGGER.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.method6506();
         }

         var9 = PreYggdrasilConverter.method33729(this);
      }

      boolean var10 = false;

      for (int var6 = 0; !var10 && var6 <= 2; var6++) {
         if (var6 > 0) {
            LOGGER.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.method6506();
         }

         var10 = PreYggdrasilConverter.method33730(this);
      }

      boolean var11 = false;

      for (int var7 = 0; !var11 && var7 <= 2; var7++) {
         if (var7 > 0) {
            LOGGER.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.method6506();
         }

         var11 = PreYggdrasilConverter.method33731(this);
      }

      boolean var12 = false;

      for (int var8 = 0; !var12 && var8 <= 2; var8++) {
         if (var8 > 0) {
            LOGGER.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.method6506();
         }

         var12 = PreYggdrasilConverter.method33733(this);
      }

      return var3 || var9 || var10 || var11 || var12;
   }

   private void method6506() {

   }

   public long getMaxTickTime() {
      return this.method6498().field43818;
   }

   @Override
   public String method6508() {
      return "";
   }

   public String handleRConCommand(String var1) {
      this.rconConsoleSource.resetLog();
      this.runImmediately(() -> this.commandManager.handleCommand(this.rconConsoleSource.getCommandSource(), var1));
      return this.rconConsoleSource.getLogContents();
   }

   public void method6510(boolean var1) {
      this.settings.method20781(var2 -> (ServerProperties) var2.field43832.method15917(this.method1437(), var1));
   }

   @Override
   public void method1292() {
      super.method1292();
      Util.shutdown();
   }

   @Override
   public boolean method1421(GameProfile var1) {
      return false;
   }

   @Override
   public int method1337(int var1) {
      return this.method6498().field43829 * var1 / 100;
   }

   @Override
   public String func_230542_k__() {
      return this.field1211.method7990();
   }

   @Override
   public boolean method1434() {
      return this.settings.getProperties().field43826;
   }

   @Nullable
   @Override
   public IChatFilter method1438(ServerPlayerEntity var1) {
      return this.field8935 == null ? null : this.field8935.func_244566_a(var1.getGameProfile());
   }

   // $VF: synthetic method
   public static Logger method1453() {
      return LOGGER;
   }
}
