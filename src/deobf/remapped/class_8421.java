package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_8421 {
   private static class_3698 field_43070 = new class_3698();
   private static Map<String, Integer> field_43065 = new HashMap<String, Integer>();
   private static Map<class_2451, Integer> field_43069 = new HashMap<class_2451, Integer>();
   private static long field_43062 = 0L;
   private static final double field_43071 = 7.5;
   private static final double field_43064 = 56.25;
   private static final int field_43063 = 15;
   private static final int field_43068 = 15;
   private static final int field_43072 = 10;
   private static final int field_43066 = 8;
   private static final int field_43073 = 13;
   private static final int field_43060 = 8;
   private static final int field_43061 = 8;
   private static final class_7821<ItemStack> field_43074 = (class_7821<ItemStack>)class_7860.field_40217.method_7979();
   private static boolean field_43059;

   public static void method_38758(Entity var0, WorldRenderer var1) {
   }

   public static void method_38775(Entity var0, WorldRenderer var1) {
      synchronized (field_43070) {
         class_9396 var5 = field_43070.method_17187(var0.method_37145());
         if (var5 != null) {
            var5.method_43473(var1);
         }
      }
   }

   public static void method_38763(WorldRenderer var0) {
      long var3 = System.currentTimeMillis();
      if (var3 >= field_43062 + 50L) {
         field_43062 = var3;
         if (!field_43059) {
            method_38767();
         }

         synchronized (field_43070) {
            method_38760(var0);
            if (field_43070.method_17185() > 0) {
               List var6 = field_43070.method_17191();

               for (int var7 = 0; var7 < var6.size(); var7++) {
                  class_9396 var8 = (class_9396)var6.get(var7);
                  var8.method_43470(var0);
               }
            }
         }
      }
   }

   private static void method_38767() {
      field_43059 = true;
      field_43065.clear();
      field_43069.clear();
      String[] var2 = class_8835.method_40646();

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];

         try {
            Identifier var5 = new Identifier(var4, "optifine/dynamic_lights.properties");
            InputStream var6 = Config.method_14374(var5);
            method_38762(var6, var5.toString(), var4);
         } catch (IOException var7) {
         }
      }

      if (field_43065.size() > 0) {
         Config.method_14277("DynamicLights entities: " + field_43065.size());
      }

      if (field_43069.size() > 0) {
         Config.method_14277("DynamicLights items: " + field_43069.size());
      }
   }

   private static void method_38762(InputStream var0, String var1, String var2) {
      if (var0 != null) {
         try {
            class_8407 var5 = new class_8407();
            var5.load(var0);
            var0.close();
            Config.method_14277("DynamicLights: Parsing " + var1);
            class_6284 var6 = new class_6284("DynamicLights");
            method_38759(var5.getProperty("entities"), field_43065, new class_4260(), var6, var1, var2);
            method_38759(var5.getProperty("items"), field_43069, new class_438(), var6, var1, var2);
         } catch (IOException var7) {
            Config.method_14317("DynamicLights: Error reading " + var1);
         }
      }
   }

   private static <T> void method_38759(String var0, Map<T, Integer> var1, class_9434<T> var2, class_6284 var3, String var4, String var5) {
      if (var0 != null) {
         String[] var8 = Config.method_14302(var0, " ");

         for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            String[] var11 = Config.method_14302(var10, ":");
            if (var11.length == 2) {
               String var12 = var11[0];
               String var13 = var11[1];
               String var14 = var5 + ":" + var12;
               Identifier var15 = new Identifier(var14);
               Object var16 = var2.method_43654(var15);
               if (var16 != null) {
                  int var17 = var3.method_28676(var13, -1);
                  if (var17 >= 0 && var17 <= 15) {
                     var1.put(var16, new Integer(var17));
                  } else {
                     var3.method_28663("Invalid light level: " + var10);
                  }
               } else {
                  var3.method_28663("Object not found: " + var14);
               }
            } else {
               var3.method_28663("Invalid entry: " + var10 + ", in:" + var4);
            }
         }
      }
   }

   private static void method_38760(WorldRenderer var0) {
      class_174 var3 = var0.method_20043();
      if (var3 != null) {
         for (Entity var5 : var3.method_736()) {
            int var6 = method_38772(var5);
            if (var6 <= 0) {
               int var7 = var5.method_37145();
               class_9396 var8 = field_43070.method_17187(var7);
               if (var8 != null) {
                  var8.method_43473(var0);
               }
            } else {
               int var9 = var5.method_37145();
               class_9396 var10 = field_43070.method_17186(var9);
               if (var10 == null) {
                  var10 = new class_9396(var5);
                  field_43070.method_17188(var9, var10);
               }
            }
         }
      }
   }

   public static int method_38765(class_1331 var0, int var1) {
      double var4 = method_38770(var0);
      return method_38764(var4, var1);
   }

   public static int method_38766(Entity var0, int var1) {
      double var4 = method_38770(var0.method_37075());
      if (var0 == Config.method_14327().thePlayer) {
         double var6 = (double)method_38772(var0);
         var4 = Math.max(var4, var6);
      }

      return method_38764(var4, var1);
   }

   public static int method_38764(double var0, int var2) {
      if (var0 > 0.0) {
         int var5 = (int)(var0 * 16.0);
         int var6 = var2 & 0xFF;
         if (var5 > var6) {
            var2 &= -256;
            var2 |= var5;
         }
      }

      return var2;
   }

   public static double method_38770(class_1331 var0) {
      double var3 = 0.0;
      synchronized (field_43070) {
         List var6 = field_43070.method_17191();
         int var7 = var6.size();

         for (int var8 = 0; var8 < var7; var8++) {
            class_9396 var9 = (class_9396)var6.get(var8);
            int var10 = var9.method_43476();
            if (var10 > 0) {
               double var11 = var9.method_43472();
               double var13 = var9.method_43475();
               double var15 = var9.method_43468();
               double var17 = (double)var0.method_12173() - var11;
               double var19 = (double)var0.method_12165() - var13;
               double var21 = (double)var0.method_12185() - var15;
               double var23 = var17 * var17 + var19 * var19 + var21 * var21;
               if (!(var23 > 56.25)) {
                  double var25 = Math.sqrt(var23);
                  double var27 = 1.0 - var25 / 7.5;
                  double var29 = var27 * (double)var10;
                  if (var29 > var3) {
                     var3 = var29;
                  }
               }
            }
         }
      }

      return Config.method_14261(var3, 0.0, 15.0);
   }

   public static int method_38771(ItemStack var0) {
      if (var0 != null) {
         class_2451 var3 = var0.method_27960();
         if (var3 instanceof class_6201) {
            class_6201 var4 = (class_6201)var3;
            class_6414 var5 = var4.method_28392();
            if (var5 != null) {
               return var5.method_29260().method_8339();
            }
         }

         if (var3 != class_4897.field_24938) {
            if (var3 == class_4897.field_25294 || var3 == class_4897.field_24348) {
               return 10;
            } else if (var3 == class_4897.field_24777) {
               return 8;
            } else if (var3 == class_4897.field_24810) {
               return 8;
            } else if (var3 == class_4897.field_24675) {
               return 8;
            } else if (var3 != class_4897.field_24381) {
               if (!field_43069.isEmpty()) {
                  Integer var6 = field_43069.get(var3);
                  if (var6 != null) {
                     return var6;
                  }
               }

               return 0;
            } else {
               return class_4783.field_23862.method_29260().method_8339() / 2;
            }
         } else {
            return class_4783.field_23811.method_29260().method_8339();
         }
      } else {
         return 0;
      }
   }

   public static int method_38772(Entity var0) {
      if (var0 == Config.method_14327().getRenderViewEntity() && !Config.method_14451()) {
         return 0;
      } else {
         if (var0 instanceof class_704) {
            class_704 var3 = (class_704)var0;
            if (var3.method_37221()) {
               return 0;
            }
         }

         if (!var0.method_37264()) {
            if (!field_43065.isEmpty()) {
               String var11 = class_4260.method_19842(var0);
               Integer var4 = field_43065.get(var11);
               if (var4 != null) {
                  return var4;
               }
            }

            if (!(var0 instanceof class_8388)) {
               if (!(var0 instanceof class_1356)) {
                  if (!(var0 instanceof class_2806)) {
                     if (!(var0 instanceof class_3252)) {
                        if (var0 instanceof class_9490) {
                           class_9490 var14 = (class_9490)var0;
                           if ((double)var14.method_43830(0.0F) > 0.001) {
                              return 15;
                           }
                        }

                        if (!(var0 instanceof class_5834)) {
                           if (!(var0 instanceof class_91)) {
                              return 0;
                           } else {
                              class_91 var16 = (class_91)var0;
                              ItemStack var18 = method_38774(var16);
                              return method_38771(var18);
                           }
                        } else {
                           class_5834 var15 = (class_5834)var0;
                           ItemStack var17 = var15.method_26446();
                           int var5 = method_38771(var17);
                           ItemStack var6 = var15.method_26568();
                           int var7 = method_38771(var6);
                           ItemStack var8 = var15.method_26520(class_6943.field_35704);
                           int var9 = method_38771(var8);
                           int var10 = Math.max(var5, var7);
                           return Math.max(var10, var9);
                        }
                     } else {
                        class_3252 var13 = (class_3252)var0;
                        return !((double)var13.field_1538 > 0.6) ? 8 : 13;
                     }
                  } else {
                     class_2806 var12 = (class_2806)var0;
                     return !var12.method_37264() ? 10 : 15;
                  }
               } else {
                  return 15;
               }
            } else {
               return 15;
            }
         } else {
            return 15;
         }
      }
   }

   public static void method_38769(WorldRenderer var0) {
      synchronized (field_43070) {
         List var4 = field_43070.method_17191();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            class_9396 var6 = (class_9396)var4.get(var5);
            var6.method_43473(var0);
         }

         field_43070.method_17189();
      }
   }

   public static void method_38768() {
      synchronized (field_43070) {
         field_43070.method_17189();
      }
   }

   public static int method_38761() {
      synchronized (field_43070) {
         return field_43070.method_17185();
      }
   }

   public static ItemStack method_38774(class_91 var0) {
      return var0.method_37372().<ItemStack>method_36640(field_43074);
   }
}
