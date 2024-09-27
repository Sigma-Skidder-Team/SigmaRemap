package mapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;

public class IntegratedServer extends MinecraftServer {
   private static final Logger field1208 = LogManager.getLogger();
   private final Minecraft field8920;
   private boolean field8921;
   private int field1223 = -1;
   private Class384 field8922;
   private UUID field8923;
   private long field8924 = 0L;
   public World field8925 = null;
   public BlockPos field8926 = null;
   public Class9755 field8927 = null;

   public IntegratedServer(
      Thread var1,
      Minecraft var2,
      DynamicRegistriesImpl var3,
      SaveFormat.LevelSave var4,
      ResourcePackList var5,
      DataPackRegistries var6,
      IServerConfiguration var7,
      MinecraftSessionService var8,
      GameProfileRepository var9,
      PlayerProfileCache var10,
      Class8216 var11
   ) {
      super(var1, var3, var4, var7, var5, var2.getProxy(), var2.getDataFixer(), var6, var8, var9, var10, var11);
      this.method1333(var2.getSession().getUsername());
      this.method1343(var2.isDemo());
      this.method1365(256);
      this.method1368(new Class6396(this, this.field1224, this.field1212));
      this.field8920 = var2;
   }

   @Override
   public boolean method1277() {
      field1208.info("Starting integrated minecraft server version " + SharedConstants.getVersion().getName());
      this.method1351(true);
      this.method1358(true);
      this.method1360(true);
      this.method1335();
      if (Reflector.field43001.exists() && !Reflector.method35056(Reflector.field43001, this)) {
         return false;
      } else {
         this.method1279();
         this.method1363(this.method1332() + " - " + this.method1436().method20054());
         return !Reflector.field43002.exists() ? true : Reflector.method35056(Reflector.field43002, this);
      }
   }

   @Override
   public void method1310(BooleanSupplier var1) {
      this.method6490();
      boolean var4 = this.field8921;
      this.field8921 = Minecraft.getInstance().getConnection() != null && Minecraft.getInstance().isGamePaused();
      IProfiler var5 = this.method1420();
      if (!var4 && this.field8921) {
         var5.startSection("autoSave");
         field1208.info("Saving and pausing game...");
         this.getPlayerList().saveAllPlayerData();
         this.method1291(false, false, false);
         var5.endSection();
      }

      if (!this.field8921) {
         super.method1310(var1);
         int var6 = Math.max(2, this.field8920.gameSettings.field44574 + -1);
         if (var6 != this.getPlayerList().method19478()) {
            field1208.info("Changing view distance to {}, from {}", var6, this.getPlayerList().method19478());
            this.getPlayerList().method19487(var6);
         }
      }
   }

   @Override
   public boolean method1290() {
      return true;
   }

   @Override
   public boolean method3425() {
      return true;
   }

   @Override
   public File method1307() {
      return this.field8920.gameDir;
   }

   @Override
   public boolean isDedicatedServer() {
      return false;
   }

   @Override
   public int method1349() {
      return 0;
   }

   @Override
   public boolean method1356() {
      return false;
   }

   @Override
   public void method1308(CrashReport var1) {
      this.field8920.crashed(var1);
   }

   @Override
   public CrashReport method1326(CrashReport var1) {
      var1 = super.method1326(var1);
      var1.getCategory().addDetail("Type", "Integrated Server (map_client.txt)");
      var1.getCategory()
         .addDetail("Is Modded", () -> this.method1327().orElse("Probably not. Jar signature remains and both client + server brands are untouched."));
      return var1;
   }

   @Override
   public Optional<String> method1327() {
      String var3 = ClientBrandRetriever.getClientModName();
      if (var3.equals("vanilla")) {
         var3 = this.method1325();
         if ("vanilla".equals(var3)) {
            return Minecraft.class.getSigners() != null ? Optional.<String>empty() : Optional.<String>of("Very likely; Jar signature invalidated");
         } else {
            return Optional.<String>of("Definitely; Server brand changed to '" + var3 + "'");
         }
      } else {
         return Optional.<String>of("Definitely; Client brand changed to '" + var3 + "'");
      }
   }

   @Override
   public void fillSnooper(Snooper var1) {
      super.fillSnooper(var1);
      var1.addClientStat("snooper_partner", this.field8920.getSnooper().getUniqueID());
   }

   @Override
   public boolean method1374(GameType var1, boolean var2, int var3) {
      try {
         this.getNetworkSystem().method33398((InetAddress)null, var3);
         field1208.info("Started serving on {}", var3);
         this.field1223 = var3;
         this.field8922 = new Class384(this.method1362(), var3 + "");
         this.field8922.start();
         this.getPlayerList().method19480(var1);
         this.getPlayerList().method19482(var2);
         int var6 = this.method1418(this.field8920.player.getGameProfile());
         this.field8920.player.method5399(var6);

         for (ServerPlayerEntity var8 : this.getPlayerList().method19488()) {
            this.getCommandManager().method18837(var8);
         }

         return true;
      } catch (IOException var9) {
         return false;
      }
   }

   @Override
   public void method1292() {
      super.method1292();
      if (this.field8922 != null) {
         this.field8922.interrupt();
         this.field8922 = null;
      }
   }

   @Override
   public void initiateShutdown(boolean var1) {
      if (!Reflector.field42967.method20245() || this.method1295()) {
         this.method1635(() -> {
            for (ServerPlayerEntity var4 : Lists.newArrayList(this.getPlayerList().method19488())) {
               if (!var4.getUniqueID().equals(this.field8923)) {
                  this.getPlayerList().method19450(var4);
               }
            }
         });
      }

      super.initiateShutdown(var1);
      if (this.field8922 != null) {
         this.field8922.interrupt();
         this.field8922 = null;
      }
   }

   @Override
   public boolean getPublic() {
      return this.field1223 > -1;
   }

   @Override
   public int method1330() {
      return this.field1223;
   }

   @Override
   public void method1370(GameType var1) {
      super.method1370(var1);
      this.getPlayerList().method19480(var1);
   }

   @Override
   public boolean method1361() {
      return true;
   }

   @Override
   public int method1288() {
      return 2;
   }

   @Override
   public int getFunctionLevel() {
      return 2;
   }

   public void method6489(UUID var1) {
      this.field8923 = var1;
   }

   @Override
   public boolean method1421(GameProfile var1) {
      return var1.getName().equalsIgnoreCase(this.method1332());
   }

   @Override
   public int method1337(int var1) {
      return (int)(this.field8920.gameSettings.field44575 * (float)var1);
   }

   @Override
   public boolean method1434() {
      return this.field8920.gameSettings.field44677;
   }

   private void method6490() {
      for (ServerWorld var4 : this.method1320()) {
         this.method6491(var4);
      }
   }

   private void method6491(ServerWorld var1) {
      if (!Class7944.method26887()) {
         this.method6494(var1);
      }

      if (!Class7944.method26878()) {
         this.method6493(var1);
      }

      if (this.field8925 == var1 && this.field8926 != null) {
         this.field8927 = var1.method6807(this.field8926);
         this.field8925 = null;
         this.field8926 = null;
      }
   }

   public Class9755 method6492(World var1, BlockPos var2) {
      this.field8925 = var1;
      this.field8926 = var2;
      return this.field8927;
   }

   private void method6493(ServerWorld var1) {
      if (var1.method6792(1.0F) > 0.0F || var1.method6794()) {
         var1.method6892(6000, 0, false, false);
      }
   }

   private void method6494(ServerWorld var1) {
      if (this.method1286() == GameType.field11103) {
         long var4 = var1.method6784();
         long var6 = var4 % 24000L;
         if (Class7944.method26886()) {
            if (var6 <= 1000L) {
               var1.method6896(var4 - var6 + 1001L);
            }

            if (var6 >= 11000L) {
               var1.method6896(var4 - var6 + 24001L);
            }
         }

         if (Class7944.method26888()) {
            if (var6 <= 14000L) {
               var1.method6896(var4 - var6 + 14001L);
            }

            if (var6 >= 22000L) {
               var1.method6896(var4 - var6 + 24000L + 14001L);
            }
         }
      }
   }

   @Override
   public boolean method1291(boolean var1, boolean var2, boolean var3) {
      if (var1) {
         int var6 = this.method1375();
         int var7 = this.field8920.gameSettings.field44696;
         if ((long)var6 < this.field8924 + (long)var7) {
            return false;
         }

         this.field8924 = (long)var6;
      }

      return super.method1291(var1, var2, var3);
   }
}
