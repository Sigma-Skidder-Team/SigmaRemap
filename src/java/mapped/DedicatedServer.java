package mapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.filter.ChatFilterClient;
import net.minecraft.util.text.filter.IChatFilter;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;

public class DedicatedServer extends MinecraftServer implements Class1646 {
   private static final Logger field1208 = LogManager.getLogger();
   private static final Pattern field8928 = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final List<Class9335> field8929 = Collections.<Class9335>synchronizedList(Lists.newArrayList());
   private Class442 field8930;
   private final Class914 field8931;
   private Class441 field8932;
   private final Class6816 field8933;
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
      Class8216 var12
   ) {
      super(var1, var2, var3, var6, var4, Proxy.NO_PROXY, var8, var5, var9, var10, var11, var12);
      this.field8933 = var7;
      this.field8931 = new Class914(this);
      this.field8935 = null;
   }

   @Override
   public boolean method1277() throws IOException {
      Class372 var3 = new Class372(this, "Server console handler");
      var3.setDaemon(true);
      var3.setUncaughtExceptionHandler(new Class6030(field1208));
      var3.start();
      field1208.info("Starting minecraft server version " + SharedConstants.getVersion().getName());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         field1208.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      field1208.info("Loading properties");
      Class9437 var4 = this.field8933.method20779();
      if (this.method1334()) {
         this.method1294("127.0.0.1");
      } else {
         this.method1351(var4.field43785);
         this.method1353(var4.field43786);
         this.method1294(var4.field43787);
      }

      this.method1358(var4.field43790);
      this.method1360(var4.field43791);
      this.method1346(var4.field43792, this.method6497());
      this.method1363(var4.field43793);
      this.method1379(var4.field43794);
      super.method1383((Integer)var4.field43831.get());
      this.method1416(var4.field43795);
      this.field1269.method20073(var4.field43797);
      field1208.info("Default game type: {}", var4.field43797);
      InetAddress var5 = null;
      if (!this.method1293().isEmpty()) {
         var5 = InetAddress.getByName(this.method1293());
      }

      if (this.method1330() < 0) {
         this.method1331(var4.field43799);
      }

      this.method1335();
      field1208.info("Starting Minecraft server on {}:{}", this.method1293().isEmpty() ? "*" : this.method1293(), this.method1330());

      try {
         this.getNetworkSystem().method33398(var5, this.method1330());
      } catch (IOException var13) {
         field1208.warn("**** FAILED TO BIND TO PORT!");
         field1208.warn("The exception was: {}", var13.toString());
         field1208.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.method1350()) {
         field1208.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         field1208.warn("The server will make no attempt to authenticate usernames. Beware.");
         field1208.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         field1208.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.method6505()) {
         this.method1386().method31796();
      }

      if (!Class9061.method33735(this)) {
         return false;
      } else {
         this.method1368(new Class6394(this, this.field1224, this.field1212));
         long var7 = Util.nanoTime();
         this.method1365(var4.field43800);
         SkullTileEntity.setProfileCache(this.method1386());
         SkullTileEntity.setSessionService(this.method1384());
         PlayerProfileCache.setOnlineMode(this.method1350());
         field1208.info("Preparing level \"{}\"", this.method6511());
         this.method1279();
         long var9 = Util.nanoTime() - var7;
         String var11 = String.format(Locale.ROOT, "%.3fs", (double)var9 / 1.0E9);
         field1208.info("Done ({})! For help, type \"help\"", var11);
         if (var4.field43801 != null) {
            this.method1413().<Class7466>method17128(Class5462.field24245).method24175(var4.field43801, this);
         }

         if (var4.field43802) {
            field1208.info("Starting GS4 status listener");
            this.field8930 = Class442.method1874(this);
         }

         if (var4.field43804) {
            field1208.info("Starting remote control listener");
            this.field8932 = Class441.method1871(this);
         }

         if (this.method6507() > 0L) {
            Thread var12 = new Thread(new Class1470(this));
            var12.setUncaughtExceptionHandler(new Class6031(field1208));
            var12.setName("Server Watchdog");
            var12.setDaemon(true);
            var12.start();
         }

         Items.field37222.fillItemGroup(ItemGroup.SEARCH, NonNullList.<ItemStack>create());
         if (var4.field43827) {
            Class9126.method34052(this);
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
      return this.field8933.method20779().field43811 && super.method1341();
   }

   @Override
   public boolean method1355() {
      return this.field8933.method20779().field43789 && super.method1355();
   }

   public String method6497() {
      Class9437 var3 = this.field8933.method20779();
      String var4;
      if (var3.field43808.isEmpty()) {
         if (Strings.isNullOrEmpty(var3.field43807)) {
            var4 = "";
         } else {
            field1208.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            var4 = var3.field43807;
         }
      } else {
         var4 = var3.field43808;
         if (!Strings.isNullOrEmpty(var3.field43807)) {
            field1208.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
         }
      }

      if (!var4.isEmpty() && !field8928.matcher(var4).matches()) {
         field1208.warn("Invalid sha1 for ressource-pack-sha1");
      }

      if (!var3.field43792.isEmpty() && var4.isEmpty()) {
         field1208.warn(
            "You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack."
         );
      }

      return var4;
   }

   @Override
   public Class9437 method6498() {
      return this.field8933.method20779();
   }

   @Override
   public void method1280() {
      this.method1336(this.method6498().field43796, true);
   }

   @Override
   public boolean method1287() {
      return this.method6498().field43809;
   }

   @Override
   public CrashReport method1326(CrashReport var1) {
      var1 = super.method1326(var1);
      var1.getCategory().addDetail("Is Modded", () -> this.method1327().orElse("Unknown (can't tell)"));
      var1.getCategory().addDetail("Type", () -> "Dedicated Server (map_server.txt)");
      return var1;
   }

   @Override
   public Optional<String> method1327() {
      String var3 = this.method1325();
      return "vanilla".equals(var3) ? Optional.<String>empty() : Optional.<String>of("Definitely; Server brand changed to '" + var3 + "'");
   }

   @Override
   public void method1309() {
      if (this.field8935 != null) {
         this.field8935.close();
      }

      if (this.field8934 != null) {
         this.field8934.method10556();
      }

      if (this.field8932 != null) {
         this.field8932.method1868();
      }

      if (this.field8930 != null) {
         this.field8930.method1868();
      }
   }

   @Override
   public void method1311(BooleanSupplier var1) {
      super.method1311(var1);
      this.method6500();
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

   public void method6499(String var1, Class6619 var2) {
      this.field8929.add(new Class9335(var1, var2));
   }

   public void method6500() {
      while (!this.field8929.isEmpty()) {
         Class9335 var3 = this.field8929.remove(0);
         this.getCommandManager().handleCommand(var3.field43317, var3.field43316);
      }
   }

   @Override
   public boolean method1348() {
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

   public Class6394 getPlayerList() {
      return (Class6394)super.getPlayerList();
   }

   @Override
   public boolean getPublic() {
      return true;
   }

   @Override
   public String method6501() {
      return this.method1293();
   }

   @Override
   public int method6502() {
      return this.method1330();
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
                  BlockPos var6 = var1.method6947();
                  int var7 = MathHelper.method37772(var2.getX() - var6.getX());
                  int var8 = MathHelper.method37772(var2.getZ() - var6.getZ());
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
   public int method1289() {
      return this.method6498().field43817;
   }

   @Override
   public void method1383(int var1) {
      super.method1383(var1);
      this.field8933.method20781(var2 -> (Class9437)var2.field43831.method15917(this.method1437(), var1));
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
   public int method1392() {
      return this.method6498().field43822;
   }

   public boolean method6505() {
      boolean var3 = false;

      for (int var4 = 0; !var3 && var4 <= 2; var4++) {
         if (var4 > 0) {
            field1208.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.method6506();
         }

         var3 = Class9061.method33728(this);
      }

      boolean var9 = false;

      for (int var5 = 0; !var9 && var5 <= 2; var5++) {
         if (var5 > 0) {
            field1208.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.method6506();
         }

         var9 = Class9061.method33729(this);
      }

      boolean var10 = false;

      for (int var6 = 0; !var10 && var6 <= 2; var6++) {
         if (var6 > 0) {
            field1208.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.method6506();
         }

         var10 = Class9061.method33730(this);
      }

      boolean var11 = false;

      for (int var7 = 0; !var11 && var7 <= 2; var7++) {
         if (var7 > 0) {
            field1208.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.method6506();
         }

         var11 = Class9061.method33731(this);
      }

      boolean var12 = false;

      for (int var8 = 0; !var12 && var8 <= 2; var8++) {
         if (var8 > 0) {
            field1208.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.method6506();
         }

         var12 = Class9061.method33733(this);
      }

      return var3 || var9 || var10 || var11 || var12;
   }

   private void method6506() {

   }

   public long method6507() {
      return this.method6498().field43818;
   }

   @Override
   public String method6508() {
      return "";
   }

   @Override
   public String method6509(String var1) {
      this.field8931.method3578();
      this.method1635(() -> this.getCommandManager().handleCommand(this.field8931.method3580(), var1));
      return this.field8931.method3579();
   }

   public void method6510(boolean var1) {
      this.field8933.method20781(var2 -> (Class9437)var2.field43832.method15917(this.method1437(), var1));
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
   public String method6511() {
      return this.field1211.method7990();
   }

   @Override
   public boolean method1434() {
      return this.field8933.method20779().field43826;
   }

   @Nullable
   @Override
   public IChatFilter method1438(ServerPlayerEntity var1) {
      return this.field8935 == null ? null : this.field8935.func_244566_a(var1.getGameProfile());
   }

   // $VF: synthetic method
   public static Logger method1453() {
      return field1208;
   }
}
