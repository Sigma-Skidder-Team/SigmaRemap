package mapped;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.ShoulderRidingEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.optifine.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

public class Class9387 {
   private static Map<String, Class7978> field43550 = new HashMap<String, Class7978>();
   private static boolean field43551 = false;
   private static WorldRenderer field43552;
   private static Class7460 field43553 = new Class7460();
   private static TileEntityRendererDispatcher field43554;
   private static Class7459 field43555 = new Class7459();
   private static boolean field43556 = false;
   public static final String field43557 = ".png";
   public static final String field43558 = ".properties";
   public static final String field43559 = "textures/entity/";
   public static final String field43560 = "textures/painting/";
   public static final String field43561 = "textures/";
   public static final String field43562 = "optifine/random/";
   public static final String field43563 = "optifine/mob/";
   private static final String[] field43564 = new String[]{
      "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"
   };
   private static final String field43565 = "horse/";
   private static final String[] field43566 = (String[])Class9694.method37956(null, Class1074.class, String[].class, 0);
   private static final String[] field43567 = (String[])Class9694.method37956(null, Class1074.class, String[].class, 1);

   public static void method35629(Entity var0, World var1) {
      if (var1 != null) {
         EntityDataManager var4 = var0.getDataManager();
         var4.field43438 = var0.getPosition();
         var4.field43437 = var1.getBiome(var4.field43438);
         if (var0 instanceof ShoulderRidingEntity) {
            ShoulderRidingEntity var5 = (ShoulderRidingEntity)var0;
            method35631(var5, false);
         }
      }
   }

   public static void method35630(Entity var0, World var1) {
      if (var0 instanceof ShoulderRidingEntity) {
         ShoulderRidingEntity var4 = (ShoulderRidingEntity)var0;
         method35631(var4, true);
      }
   }

   private static void method35631(ShoulderRidingEntity var0, boolean var1) {
      Object var4 = var0.method4400();
      if (var4 == null) {
         var4 = Config.method26860().player;
      }

      if (var4 instanceof AbstractClientPlayerEntity) {
         AbstractClientPlayerEntity var5 = (AbstractClientPlayerEntity)var4;
         UUID var6 = var0.getUniqueID();
         if (!var1) {
            EntityDataManager var7 = var0.getDataManager();
            if (var5.entityShoulderLeft != null && Config.equals(var5.entityShoulderLeft.getUniqueID(), var6)) {
               EntityDataManager var8 = var5.entityShoulderLeft.getDataManager();
               var7.field43438 = var8.field43438;
               var7.field43437 = var8.field43437;
               var5.entityShoulderLeft = null;
            }

            if (var5.entityShoulderRight != null && Config.equals(var5.entityShoulderRight.getUniqueID(), var6)) {
               EntityDataManager var10 = var5.entityShoulderRight.getDataManager();
               var7.field43438 = var10.field43438;
               var7.field43437 = var10.field43437;
               var5.entityShoulderRight = null;
            }
         } else {
            CompoundNBT var9 = var5.method2969();
            if (var9 != null && var9.contains("UUID") && Config.equals(var9.getUniqueID("UUID"), var6)) {
               var5.entityShoulderLeft = var0;
            }

            CompoundNBT var11 = var5.method2971();
            if (var11 != null && var11.contains("UUID") && Config.equals(var11.getUniqueID("UUID"), var6)) {
               var5.entityShoulderRight = var0;
            }
         }
      }
   }

   public static void method35632(World var0, World var1) {
      if (var1 instanceof ClientWorld) {
         ClientWorld var4 = (ClientWorld)var1;

         for (Entity var6 : var4.getAllEntities()) {
            method35629(var6, var1);
         }
      }

      field43553.method24132((Entity)null);
      field43555.method24130((TileEntity)null);
   }

   public static ResourceLocation method35633(ResourceLocation var0) {
      if (!field43551) {
         return var0;
      } else if (field43556) {
         return var0;
      } else {
         ResourceLocation var5;
         try {
            field43556 = true;
            Class7458 var3 = method35635();
            if (var3 == null) {
               return var0;
            }

            String var4 = var0.getPath();
            if (var4.startsWith("horse/")) {
               var4 = method35634(var4, "horse/".length());
            }

            if (var4.startsWith("textures/entity/") || var4.startsWith("textures/painting/")) {
               Class7978 var11 = field43550.get(var4);
               if (var11 != null) {
                  return var11.method27113(var0, var3);
               }

               return var0;
            }

            var5 = var0;
         } finally {
            field43556 = false;
         }

         return var5;
      }
   }

   private static String method35634(String var0, int var1) {
      if (field43566 != null && field43567 != null) {
         for (int var4 = 0; var4 < field43567.length; var4++) {
            String var5 = field43567[var4];
            if (var0.startsWith(var5, var1)) {
               return field43566[var4];
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   private static Class7458 method35635() {
      if (field43552.field1000 == null) {
         if (field43554.field34750 != null) {
            TileEntity var2 = field43554.field34750;
            if (var2.method3734() != null) {
               field43555.method24130(var2);
               return field43555;
            }
         }

         return null;
      } else {
         field43553.method24132(field43552.field1000);
         return field43553;
      }
   }

   private static Class7978 method35636(ResourceLocation var0, boolean var1) {
      String var4 = var0.getPath();
      ResourceLocation var5 = method35638(var0, var1);
      if (var5 != null) {
         Class7978 var6 = method35637(var5, var0);
         if (var6 != null) {
            return var6;
         }
      }

      ResourceLocation[] var7 = method35643(var0, var1);
      return var7 != null ? new Class7978(var4, var7) : null;
   }

   private static Class7978 method35637(ResourceLocation var0, ResourceLocation var1) {
      try {
         String var4 = var0.getPath();
         method35646(var1.getPath() + ", properties: " + var4);
         InputStream var5 = Config.method26863(var0);
         if (var5 == null) {
            method35647("Properties not found: " + var4);
            return null;
         } else {
            Class20 var6 = new Class20();
            var6.load(var5);
            var5.close();
            Class7978 var7 = new Class7978(var6, var4, var1);
            return !var7.method27115(var4) ? null : var7;
         }
      } catch (FileNotFoundException var8) {
         method35647("File not found: " + var1.getPath());
         return null;
      } catch (IOException var9) {
         var9.printStackTrace();
         return null;
      }
   }

   private static ResourceLocation method35638(ResourceLocation var0, boolean var1) {
      ResourceLocation var4 = method35639(var0, var1);
      if (var4 != null) {
         String var5 = var4.getNamespace();
         String var6 = var4.getPath();
         String var7 = Class9402.method35763(var6, ".png");
         String var8 = var7 + ".properties";
         ResourceLocation var9 = new ResourceLocation(var5, var8);
         if (!Config.method26866(var9)) {
            String var10 = method35642(var7);
            if (var10 != null) {
               ResourceLocation var11 = new ResourceLocation(var5, var10 + ".properties");
               return !Config.method26866(var11) ? null : var11;
            } else {
               return null;
            }
         } else {
            return var9;
         }
      } else {
         return null;
      }
   }

   public static ResourceLocation method35639(ResourceLocation var0, boolean var1) {
      String var4 = var0.getNamespace();
      String var5 = var0.getPath();
      String var6 = "textures/";
      String var7 = "optifine/random/";
      if (var1) {
         var6 = "textures/entity/";
         var7 = "optifine/mob/";
      }

      if (var5.startsWith(var6)) {
         String var8 = Class9402.method35765(var5, var6, var7);
         return new ResourceLocation(var4, var8);
      } else {
         return null;
      }
   }

   private static String method35640(String var0) {
      if (!var0.startsWith("optifine/random/")) {
         return !var0.startsWith("optifine/mob/") ? null : Class9402.method35765(var0, "optifine/mob/", "textures/entity/");
      } else {
         return Class9402.method35765(var0, "optifine/random/", "textures/");
      }
   }

   public static ResourceLocation method35641(ResourceLocation var0, int var1) {
      if (var0 != null) {
         String var4 = var0.getPath();
         int var5 = var4.lastIndexOf(46);
         if (var5 >= 0) {
            String var6 = var4.substring(0, var5);
            String var7 = var4.substring(var5);
            String var8 = var6 + var1 + var7;
            return new ResourceLocation(var0.getNamespace(), var8);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String method35642(String var0) {
      for (int var3 = 0; var3 < field43564.length; var3++) {
         String var4 = field43564[var3];
         if (var0.endsWith(var4)) {
            return Class9402.method35763(var0, var4);
         }
      }

      return null;
   }

   private static ResourceLocation[] method35643(ResourceLocation var0, boolean var1) {
      ArrayList<ResourceLocation> var4 = new ArrayList();
      var4.add(var0);
      ResourceLocation var5 = method35639(var0, var1);
      if (var5 != null) {
         for (int var6 = 1; var6 < var4.size() + 10; var6++) {
            int var7 = var6 + 1;
            ResourceLocation var8 = method35641(var5, var7);
            if (Config.method26866(var8)) {
               var4.add(var8);
            }
         }

         if (var4.size() > 1) {
            ResourceLocation[] var9 = var4.toArray(new ResourceLocation[var4.size()]);
            method35646(var0.getPath() + ", variants: " + var9.length);
            return var9;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void method35644() {
      field43550.clear();
      field43551 = false;
      if (Config.method26907()) {
         method35645();
      }
   }

   private static void method35645() {
      field43552 = Config.method26874();
      field43554 = TileEntityRendererDispatcher.instance;
      String[] var2 = new String[]{"optifine/random/", "optifine/mob/"};
      String[] var3 = new String[]{".png", ".properties"};
      String[] var4 = Class9772.method38437(var2, var3);
      HashSet var5 = new HashSet();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         var7 = Class9402.method35769(var7, var3);
         var7 = Class9402.method35778(var7, "0123456789");
         var7 = var7 + ".png";
         String var8 = method35640(var7);
         if (!var5.contains(var8)) {
            var5.add(var8);
            ResourceLocation var9 = new ResourceLocation(var8);
            if (Config.method26866(var9)) {
               Class7978 var10 = field43550.get(var8);
               if (var10 == null) {
                  var10 = method35636(var9, false);
                  if (var10 == null) {
                     var10 = method35636(var9, true);
                  }

                  if (var10 != null) {
                     field43550.put(var8, var10);
                  }
               }
            }
         }
      }

      field43551 = !field43550.isEmpty();
   }

   public static void method35646(String var0) {
      Config.method26810("RandomEntities: " + var0);
   }

   public static void method35647(String var0) {
      Config.method26811("RandomEntities: " + var0);
   }
}
