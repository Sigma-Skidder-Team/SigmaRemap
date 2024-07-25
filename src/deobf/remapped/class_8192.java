package remapped;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

public class class_8192 {
   private static Map<String, class_3207> field_41923 = new HashMap<String, class_3207>();
   private static boolean field_41919 = false;
   private static WorldRenderer field_41922;
   private static class_7908 field_41911 = new class_7908();
   private static class_3569 field_41918;
   private static class_4790 field_41916 = new class_4790();
   private static boolean field_41917 = false;
   public static final String field_41920 = ".png";
   public static final String field_41925 = ".properties";
   public static final String field_41915 = "textures/entity/";
   public static final String field_41912 = "textures/painting/";
   public static final String field_41928 = "textures/";
   public static final String field_41913 = "optifine/random/";
   public static final String field_41910 = "optifine/mob/";
   private static final String[] field_41927 = new String[]{
      "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"
   };
   private static final String field_41926 = "horse/";
   private static final String[] field_41914 = (String[])class_9367.method_43328(null, class_3551.class, String[].class, 0);
   private static final String[] field_41921 = (String[])class_9367.method_43328(null, class_3551.class, String[].class, 1);

   public static void method_37536(Entity var0, World var1) {
      if (var1 != null) {
         class_8073 var4 = var0.method_37372();
         var4.field_41301 = var0.method_37075();
         var4.field_41296 = var1.method_22561(var4.field_41301);
         if (var0 instanceof class_7819) {
            class_7819 var5 = (class_7819)var0;
            method_37531(var5, false);
         }
      }
   }

   public static void method_37534(Entity var0, World var1) {
      if (var0 instanceof class_7819) {
         class_7819 var4 = (class_7819)var0;
         method_37531(var4, true);
      }
   }

   private static void method_37531(class_7819 var0, boolean var1) {
      Object var4 = var0.method_41207();
      if (var4 == null) {
         var4 = Config.method_14327().thePlayer;
      }

      if (var4 instanceof AbstractClientPlayerEntity) {
         AbstractClientPlayerEntity var5 = (AbstractClientPlayerEntity)var4;
         UUID var6 = var0.method_37328();
         if (!var1) {
            class_8073 var7 = var0.method_37372();
            if (var5.field_49383 != null && Config.equals(var5.field_49383.method_37328(), var6)) {
               class_8073 var8 = var5.field_49383.method_37372();
               var7.field_41301 = var8.field_41301;
               var7.field_41296 = var8.field_41296;
               var5.field_49383 = null;
            }

            if (var5.field_49395 != null && Config.equals(var5.field_49395.method_37328(), var6)) {
               class_8073 var10 = var5.field_49395.method_37372();
               var7.field_41301 = var10.field_41301;
               var7.field_41296 = var10.field_41296;
               var5.field_49395 = null;
            }
         } else {
            CompoundNBT var9 = var5.method_3160();
            if (var9 != null && var9.method_25938("UUID") && Config.equals(var9.method_25926("UUID"), var6)) {
               var5.field_49383 = var0;
            }

            CompoundNBT var11 = var5.method_3171();
            if (var11 != null && var11.method_25938("UUID") && Config.equals(var11.method_25926("UUID"), var6)) {
               var5.field_49395 = var0;
            }
         }
      }
   }

   public static void method_37524(World var0, World var1) {
      if (var1 instanceof ClientWorld) {
         ClientWorld var4 = (ClientWorld)var1;

         for (Entity var6 : var4.method_736()) {
            method_37536(var6, var1);
         }
      }

      field_41911.method_35766((Entity)null);
      field_41916.method_22088((class_3757)null);
   }

   public static Identifier method_37530(Identifier var0) {
      if (!field_41919) {
         return var0;
      } else if (field_41917) {
         return var0;
      } else {
         Identifier var5;
         try {
            field_41917 = true;
            class_1979 var3 = method_37525();
            if (var3 == null) {
               return var0;
            }

            String var4 = var0.method_21456();
            if (var4.startsWith("horse/")) {
               var4 = method_37540(var4, "horse/".length());
            }

            if (var4.startsWith("textures/entity/") || var4.startsWith("textures/painting/")) {
               class_3207 var11 = field_41923.get(var4);
               if (var11 != null) {
                  return var11.method_14746(var0, var3);
               }

               return var0;
            }

            var5 = var0;
         } finally {
            field_41917 = false;
         }

         return var5;
      }
   }

   private static String method_37540(String var0, int var1) {
      if (field_41914 != null && field_41921 != null) {
         for (int var4 = 0; var4 < field_41921.length; var4++) {
            String var5 = field_41921[var4];
            if (var0.startsWith(var5, var1)) {
               return field_41914[var4];
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   private static class_1979 method_37525() {
      if (field_41922.field_21016 == null) {
         if (field_41918.field_17469 != null) {
            class_3757 var2 = field_41918.field_17469;
            if (var2.method_17402() != null) {
               field_41916.method_22088(var2);
               return field_41916;
            }
         }

         return null;
      } else {
         field_41911.method_35766(field_41922.field_21016);
         return field_41911;
      }
   }

   private static class_3207 method_37523(Identifier var0, boolean var1) {
      String var4 = var0.method_21456();
      Identifier var5 = method_37532(var0, var1);
      if (var5 != null) {
         class_3207 var6 = method_37538(var5, var0);
         if (var6 != null) {
            return var6;
         }
      }

      Identifier[] var7 = method_37535(var0, var1);
      return var7 != null ? new class_3207(var4, var7) : null;
   }

   private static class_3207 method_37538(Identifier var0, Identifier var1) {
      try {
         String var4 = var0.method_21456();
         method_37526(var1.method_21456() + ", properties: " + var4);
         InputStream var5 = Config.method_14374(var0);
         if (var5 == null) {
            method_37529("Properties not found: " + var4);
            return null;
         } else {
            class_8407 var6 = new class_8407();
            var6.load(var5);
            var5.close();
            class_3207 var7 = new class_3207(var6, var4, var1);
            return !var7.method_14745(var4) ? null : var7;
         }
      } catch (FileNotFoundException var8) {
         method_37529("File not found: " + var1.method_21456());
         return null;
      } catch (IOException var9) {
         var9.printStackTrace();
         return null;
      }
   }

   private static Identifier method_37532(Identifier var0, boolean var1) {
      Identifier var4 = method_37527(var0, var1);
      if (var4 != null) {
         String var5 = var4.method_21461();
         String var6 = var4.method_21456();
         String var7 = class_8251.method_37822(var6, ".png");
         String var8 = var7 + ".properties";
         Identifier var9 = new Identifier(var5, var8);
         if (!Config.method_14362(var9)) {
            String var10 = method_37537(var7);
            if (var10 != null) {
               Identifier var11 = new Identifier(var5, var10 + ".properties");
               return !Config.method_14362(var11) ? null : var11;
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

   public static Identifier method_37527(Identifier var0, boolean var1) {
      String var4 = var0.method_21461();
      String var5 = var0.method_21456();
      String var6 = "textures/";
      String var7 = "optifine/random/";
      if (var1) {
         var6 = "textures/entity/";
         var7 = "optifine/mob/";
      }

      if (var5.startsWith(var6)) {
         String var8 = class_8251.method_37807(var5, var6, var7);
         return new Identifier(var4, var8);
      } else {
         return null;
      }
   }

   private static String method_37521(String var0) {
      if (!var0.startsWith("optifine/random/")) {
         return !var0.startsWith("optifine/mob/") ? null : class_8251.method_37807(var0, "optifine/mob/", "textures/entity/");
      } else {
         return class_8251.method_37807(var0, "optifine/random/", "textures/");
      }
   }

   public static Identifier method_37539(Identifier var0, int var1) {
      if (var0 != null) {
         String var4 = var0.method_21456();
         int var5 = var4.lastIndexOf(46);
         if (var5 >= 0) {
            String var6 = var4.substring(0, var5);
            String var7 = var4.substring(var5);
            String var8 = var6 + var1 + var7;
            return new Identifier(var0.method_21461(), var8);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String method_37537(String var0) {
      for (int var3 = 0; var3 < field_41927.length; var3++) {
         String var4 = field_41927[var3];
         if (var0.endsWith(var4)) {
            return class_8251.method_37822(var0, var4);
         }
      }

      return null;
   }

   private static Identifier[] method_37535(Identifier var0, boolean var1) {
      ArrayList var4 = new ArrayList();
      var4.add(var0);
      Identifier var5 = method_37527(var0, var1);
      if (var5 != null) {
         for (int var6 = 1; var6 < var4.size() + 10; var6++) {
            int var7 = var6 + 1;
            Identifier var8 = method_37539(var5, var7);
            if (Config.method_14362(var8)) {
               var4.add(var8);
            }
         }

         if (var4.size() > 1) {
            Identifier[] var9 = var4.<Identifier>toArray(new Identifier[var4.size()]);
            method_37526(var0.method_21456() + ", variants: " + var9.length);
            return var9;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void method_37528() {
      field_41923.clear();
      field_41919 = false;
      if (Config.method_14394()) {
         method_37533();
      }
   }

   private static void method_37533() {
      field_41922 = Config.method_14387();
      field_41918 = class_3569.field_17468;
      String[] var2 = new String[]{"optifine/random/", "optifine/mob/"};
      String[] var3 = new String[]{".png", ".properties"};
      String[] var4 = class_9654.method_44546(var2, var3);
      HashSet var5 = new HashSet();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         var7 = class_8251.method_37823(var7, var3);
         var7 = class_8251.method_37818(var7, "0123456789");
         var7 = var7 + ".png";
         String var8 = method_37521(var7);
         if (!var5.contains(var8)) {
            var5.add(var8);
            Identifier var9 = new Identifier(var8);
            if (Config.method_14362(var9)) {
               class_3207 var10 = field_41923.get(var8);
               if (var10 == null) {
                  var10 = method_37523(var9, false);
                  if (var10 == null) {
                     var10 = method_37523(var9, true);
                  }

                  if (var10 != null) {
                     field_41923.put(var8, var10);
                  }
               }
            }
         }
      }

      field_41919 = !field_41923.isEmpty();
   }

   public static void method_37526(String var0) {
      Config.method_14277("RandomEntities: " + var0);
   }

   public static void method_37529(String var0) {
      Config.method_14317("RandomEntities: " + var0);
   }
}
