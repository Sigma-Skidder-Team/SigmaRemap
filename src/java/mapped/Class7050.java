package mapped;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Class7050 {
   private static Minecraft field30438 = Class7944.method26860();
   private static Class7316 field30439 = null;
   private static Class8149[][] field30440 = (Class8149[][])null;
   public static boolean field30441 = method21972();

   public static ResourceLocation method21963(ResourceLocation var0) {
      if (field30440 != null) {
         Screen var3 = field30438.currentScreen;
         if (var3 instanceof Class851) {
            if (!var0.getNamespace().equals("minecraft") || !var0.getPath().startsWith("textures/gui/")) {
               return var0;
            } else if (field30439 != null) {
               ClientWorld var4 = field30438.world;
               if (var4 == null) {
                  return var0;
               } else if (var3 instanceof CreativeScreen) {
                  return method21964(Class2295.field15265, field30438.player.getPosition(), var4, var0, var3);
               } else if (!(var3 instanceof InventoryScreen)) {
                  BlockPos var5 = field30439.method23163();
                  if (var5 != null) {
                     if (var3 instanceof Class1124) {
                        return method21964(Class2295.field15253, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class872) {
                        return method21964(Class2295.field15254, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class863) {
                        return method21964(Class2295.field15255, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class868) {
                        return method21964(Class2295.field15256, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class853) {
                        return method21964(Class2295.field15257, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class874) {
                        return method21964(Class2295.field15258, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class871) {
                        return method21964(Class2295.field15259, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class856) {
                        return method21964(Class2295.field15260, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class866) {
                        return method21964(Class2295.field15261, var5, var4, var0, var3);
                     }

                     if (var3 instanceof Class873) {
                        return method21964(Class2295.field15264, var5, var4, var0, var3);
                     }
                  }

                  Entity var6 = field30439.method23164();
                  if (var6 != null) {
                     if (var3 instanceof Class1125) {
                        return method21965(Class2295.field15262, var6, var4, var0);
                     }

                     if (var3 instanceof Class862) {
                        return method21965(Class2295.field15263, var6, var4, var0);
                     }
                  }

                  return var0;
               } else {
                  return method21964(Class2295.field15266, field30438.player.getPosition(), var4, var0, var3);
               }
            } else {
               return var0;
            }
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   private static ResourceLocation method21964(Class2295 var0, BlockPos var1, Class1662 var2, ResourceLocation var3, Screen var4) {
      Class8149[] var7 = field30440[var0.ordinal()];
      if (var7 == null) {
         return var3;
      } else {
         for (int var8 = 0; var8 < var7.length; var8++) {
            Class8149 var9 = var7[var8];
            if (var9.method28262(var0, var1, var2, var4)) {
               return var9.method28277(var3);
            }
         }

         return var3;
      }
   }

   private static ResourceLocation method21965(Class2295 var0, Entity var1, Class1662 var2, ResourceLocation var3) {
      Class8149[] var6 = field30440[var0.ordinal()];
      if (var6 == null) {
         return var3;
      } else {
         for (int var7 = 0; var7 < var6.length; var7++) {
            Class8149 var8 = var6[var7];
            if (var8.method28272(var0, var1, var2)) {
               return var8.method28277(var3);
            }
         }

         return var3;
      }
   }

   public static void method21966() {
      field30440 = (Class8149[][])null;
      if (Class7944.method26974()) {
         ArrayList var2 = new ArrayList();
         IResourcePack[] var3 = Class7944.method26869();

         for (int var4 = var3.length - 1; var4 >= 0; var4--) {
            IResourcePack var5 = var3[var4];
            method21968(var5, var2);
         }

         field30440 = method21967(var2);
      }
   }

   private static Class8149[][] method21967(List<List<Class8149>> var0) {
      if (!var0.isEmpty()) {
         Class8149[][] var3 = new Class8149[Class2295.values().length][];

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var0.size() > var4) {
               List<Class8149> var5 = (List)var0.get(var4);
               if (var5 != null) {
                  Class8149[] var6 = var5.toArray(new Class8149[var5.size()]);
                  var3[var4] = var6;
               }
            }
         }

         return var3;
      } else {
         return (Class8149[][])null;
      }
   }

   private static void method21968(IResourcePack var0, List<List<Class8149>> var1) {
      String[] var4 = Class9772.method38438(var0, "optifine/gui/container/", ".properties", (String[])null);
      Arrays.sort(var4);

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var4[var5];
         Class7944.method26810("CustomGuis: " + var6);

         try {
            ResourceLocation var7 = new ResourceLocation(var6);
            InputStream var8 = var0.getResourceStream(ResourcePackType.CLIENT_RESOURCES, var7);
            if (var8 == null) {
               Class7944.method26811("CustomGuis file not found: " + var6);
            } else {
               Class20 var9 = new Class20();
               var9.load(var8);
               var8.close();
               Class8149 var10 = new Class8149(var9, var6);
               if (var10.method28259(var6)) {
                  method21969(var10, var1);
               }
            }
         } catch (FileNotFoundException var11) {
            Class7944.method26811("CustomGuis file not found: " + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }
   }

   private static void method21969(Class8149 var0, List<List<Class8149>> var1) {
      if (var0.method28276() != null) {
         int var4 = var0.method28276().ordinal();

         while (var1.size() <= var4) {
            var1.add((List)null);
         }

         List<Class8149> var5 = var1.get(var4);
         if (var5 == null) {
            var5 = new ArrayList();
            var1.set(var4, var5);
         }

         var5.add(var0);
      } else {
         method21973("Invalid container: " + var0.method28276());
      }
   }

   public static Class7316 method21970() {
      return field30439;
   }

   public static void method21971(Class7316 var0) {
      field30439 = var0;
   }

   private static boolean method21972() {
      Calendar var2 = Calendar.getInstance();
      return var2.get(2) + 1 == 12 && var2.get(5) >= 24 && var2.get(5) <= 26;
   }

   private static void method21973(String var0) {
      Class7944.method26811("[CustomGuis] " + var0);
   }
}
