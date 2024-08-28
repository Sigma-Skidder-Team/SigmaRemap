package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class9446 {
   private static Class8138 field43880 = new Class8138();
   private static Map<String, Integer> field43881 = new HashMap<String, Integer>();
   private static Map<Class3257, Integer> field43882 = new HashMap<Class3257, Integer>();
   private static long field43883 = 0L;
   private static final double field43884 = 7.5;
   private static final double field43885 = 56.25;
   private static final int field43886 = 15;
   private static final int field43887 = 15;
   private static final int field43888 = 10;
   private static final int field43889 = 8;
   private static final int field43890 = 13;
   private static final int field43891 = 8;
   private static final int field43892 = 8;
   private static final Class9289<Class8848> field43893 = (Class9289<Class8848>)Class9299.field43007.method20234();
   private static boolean field43894;

   public static void method36307(Entity var0, Class264 var1) {
   }

   public static void method36308(Entity var0, Class264 var1) {
      synchronized (field43880) {
         Class9701 var5 = field43880.method28216(var0.method3205());
         if (var5 != null) {
            var5.method38011(var1);
         }
      }
   }

   public static void method36309(Class264 var0) {
      long var3 = System.currentTimeMillis();
      if (var3 >= field43883 + 50L) {
         field43883 = var3;
         if (!field43894) {
            method36310();
         }

         synchronized (field43880) {
            method36313(var0);
            if (field43880.method28215() > 0) {
               List var6 = field43880.method28219();

               for (int var7 = 0; var7 < var6.size(); var7++) {
                  Class9701 var8 = (Class9701)var6.get(var7);
                  var8.method38008(var0);
               }
            }
         }
      }
   }

   private static void method36310() {
      field43894 = true;
      field43881.clear();
      field43882.clear();
      String[] var2 = Class9561.method37049();

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];

         try {
            ResourceLocation var5 = new ResourceLocation(var4, "optifine/dynamic_lights.properties");
            InputStream var6 = Class7944.method26863(var5);
            method36311(var6, var5.toString(), var4);
         } catch (IOException var7) {
         }
      }

      if (field43881.size() > 0) {
         Class7944.method26810("DynamicLights entities: " + field43881.size());
      }

      if (field43882.size() > 0) {
         Class7944.method26810("DynamicLights items: " + field43882.size());
      }
   }

   private static void method36311(InputStream var0, String var1, String var2) {
      if (var0 != null) {
         try {
            Class20 var5 = new Class20();
            var5.load(var0);
            var0.close();
            Class7944.method26810("DynamicLights: Parsing " + var1);
            Class8896 var6 = new Class8896("DynamicLights");
            method36312(var5.getProperty("entities"), field43881, new Class6022(), var6, var1, var2);
            method36312(var5.getProperty("items"), field43882, new Class6020(), var6, var1, var2);
         } catch (IOException var7) {
            Class7944.method26811("DynamicLights: Error reading " + var1);
         }
      }
   }

   private static <T> void method36312(String var0, Map<T, Integer> var1, Class6021<T> var2, Class8896 var3, String var4, String var5) {
      if (var0 != null) {
         String[] var8 = Class7944.method26903(var0, " ");

         for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            String[] var11 = Class7944.method26903(var10, ":");
            if (var11.length == 2) {
               String var12 = var11[0];
               String var13 = var11[1];
               String var14 = var5 + ":" + var12;
               ResourceLocation var15 = new ResourceLocation(var14);
               T var16 = var2.method18648(var15);
               if (var16 != null) {
                  int var17 = var3.method32398(var13, -1);
                  if (var17 >= 0 && var17 <= 15) {
                     var1.put(var16, new Integer(var17));
                  } else {
                     var3.method32403("Invalid light level: " + var10);
                  }
               } else {
                  var3.method32403("Object not found: " + var14);
               }
            } else {
               var3.method32403("Invalid entry: " + var10 + ", in:" + var4);
            }
         }
      }
   }

   private static void method36313(Class264 var0) {
      Class1656 var3 = var0.method930();
      if (var3 != null) {
         for (Entity var5 : var3.method6835()) {
            int var6 = method36319(var5);
            if (var6 <= 0) {
               int var7 = var5.method3205();
               Class9701 var8 = field43880.method28216(var7);
               if (var8 != null) {
                  var8.method38011(var0);
               }
            } else {
               int var9 = var5.method3205();
               Class9701 var10 = field43880.method28214(var9);
               if (var10 == null) {
                  var10 = new Class9701(var5);
                  field43880.method28213(var9, var10);
               }
            }
         }
      }
   }

   public static int method36314(BlockPos var0, int var1) {
      double var4 = method36317(var0);
      return method36316(var4, var1);
   }

   public static int method36315(Entity var0, int var1) {
      double var4 = method36317(var0.method3432());
      if (var0 == Class7944.method26860().field1339) {
         double var6 = (double)method36319(var0);
         var4 = Math.max(var4, var6);
      }

      return method36316(var4, var1);
   }

   public static int method36316(double var0, int var2) {
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

   public static double method36317(BlockPos var0) {
      double var3 = 0.0;
      synchronized (field43880) {
         List var6 = field43880.method28219();
         int var7 = var6.size();

         for (int var8 = 0; var8 < var7; var8++) {
            Class9701 var9 = (Class9701)var6.get(var8);
            int var10 = var9.method38016();
            if (var10 > 0) {
               double var11 = var9.method38013();
               double var13 = var9.method38014();
               double var15 = var9.method38015();
               double var17 = (double)var0.method8304() - var11;
               double var19 = (double)var0.getY() - var13;
               double var21 = (double)var0.method8306() - var15;
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

      return Class7944.method26833(var3, 0.0, 15.0);
   }

   public static int method36318(Class8848 var0) {
      if (var0 != null) {
         Class3257 var3 = var0.method32107();
         if (var3 instanceof Class3292) {
            Class3292 var4 = (Class3292)var3;
            Block var5 = var4.method11845();
            if (var5 != null) {
               return var5.method11579().method23392();
            }
         }

         if (var3 != Class8514.field37884) {
            if (var3 == Class8514.field37967 || var3 == Class8514.field37975) {
               return 10;
            } else if (var3 == Class8514.field37908) {
               return 8;
            } else if (var3 == Class8514.field38076) {
               return 8;
            } else if (var3 == Class8514.field37976) {
               return 8;
            } else if (var3 != Class8514.field38066) {
               if (!field43882.isEmpty()) {
                  Integer var6 = field43882.get(var3);
                  if (var6 != null) {
                     return var6;
                  }
               }

               return 0;
            } else {
               return Blocks.field36665.method11579().method23392() / 2;
            }
         } else {
            return Blocks.LAVA.method11579().method23392();
         }
      } else {
         return 0;
      }
   }

   public static int method36319(Entity var0) {
      if (var0 == Class7944.method26860().method1550() && !Class7944.method26972()) {
         return 0;
      } else {
         if (var0 instanceof PlayerEntity) {
            PlayerEntity var3 = (PlayerEntity)var0;
            if (var3.method2800()) {
               return 0;
            }
         }

         if (!var0.method3327()) {
            if (!field43881.isEmpty()) {
               String var11 = Class6022.method18649(var0);
               Integer var4 = field43881.get(var11);
               if (var4 != null) {
                  return var4;
               }
            }

            if (!(var0 instanceof Class901)) {
               if (!(var0 instanceof Class1004)) {
                  if (!(var0 instanceof Class1103)) {
                     if (!(var0 instanceof Class1109)) {
                        if (var0 instanceof Class1081) {
                           Class1081 var14 = (Class1081)var0;
                           if ((double)var14.method5019(0.0F) > 0.001) {
                              return 15;
                           }
                        }

                        if (!(var0 instanceof Class880)) {
                           if (!(var0 instanceof Class1000)) {
                              return 0;
                           } else {
                              Class1000 var16 = (Class1000)var0;
                              Class8848 var18 = method36323(var16);
                              return method36318(var18);
                           }
                        } else {
                           Class880 var15 = (Class880)var0;
                           Class8848 var17 = var15.method3090();
                           int var5 = method36318(var17);
                           Class8848 var6 = var15.method3091();
                           int var7 = method36318(var6);
                           Class8848 var8 = var15.method2943(Class2106.field13736);
                           int var9 = method36318(var8);
                           int var10 = Math.max(var5, var7);
                           return Math.max(var10, var9);
                        }
                     } else {
                        Class1109 var13 = (Class1109)var0;
                        return !((double)var13.field6083 > 0.6) ? 8 : 13;
                     }
                  } else {
                     Class1103 var12 = (Class1103)var0;
                     return !var12.method3327() ? 10 : 15;
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

   public static void method36320(Class264 var0) {
      synchronized (field43880) {
         List var4 = field43880.method28219();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            Class9701 var6 = (Class9701)var4.get(var5);
            var6.method38011(var0);
         }

         field43880.method28217();
      }
   }

   public static void method36321() {
      synchronized (field43880) {
         field43880.method28217();
      }
   }

   public static int method36322() {
      synchronized (field43880) {
         return field43880.method28215();
      }
   }

   public static Class8848 method36323(Class1000 var0) {
      return var0.method3210().<Class8848>method35445(field43893);
   }
}
