package remapped;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class class_1322 {
   private static MinecraftClient field_7279 = class_3111.method_14327();
   private static class_4717 field_7283 = null;
   private static class_3739[][] field_7281 = (class_3739[][])null;
   public static boolean field_7282 = method_6036();

   public static Identifier method_6042(Identifier var0) {
      if (field_7281 != null) {
         class_266 var3 = field_7279.field_9623;
         if (var3 instanceof class_2208) {
            if (!var0.method_21461().equals("minecraft") || !var0.method_21456().startsWith("textures/gui/")) {
               return var0;
            } else if (field_7283 != null) {
               class_174 var4 = field_7279.field_9601;
               if (var4 == null) {
                  return var0;
               } else if (var3 instanceof class_2546) {
                  return method_6039(class_1614.field_8385, field_7279.field_9632.method_37075(), var4, var0, var3);
               } else if (!(var3 instanceof class_3431)) {
                  class_1331 var5 = field_7283.method_21812();
                  if (var5 != null) {
                     if (var3 instanceof class_2713) {
                        return method_6039(class_1614.field_8384, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_340) {
                        return method_6039(class_1614.field_8379, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_8547) {
                        return method_6039(class_1614.field_8374, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_2141) {
                        return method_6039(class_1614.field_8377, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_9831) {
                        return method_6039(class_1614.field_8373, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_1399) {
                        return method_6039(class_1614.field_8387, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_8226) {
                        return method_6039(class_1614.field_8383, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_309) {
                        return method_6039(class_1614.field_8378, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_395) {
                        return method_6039(class_1614.field_8376, var5, var4, var0, var3);
                     }

                     if (var3 instanceof class_8097) {
                        return method_6039(class_1614.field_8380, var5, var4, var0, var3);
                     }
                  }

                  class_8145 var6 = field_7283.method_21814();
                  if (var6 != null) {
                     if (var3 instanceof class_4401) {
                        return method_6044(class_1614.field_8386, var6, var4, var0);
                     }

                     if (var3 instanceof class_57) {
                        return method_6044(class_1614.field_8372, var6, var4, var0);
                     }
                  }

                  return var0;
               } else {
                  return method_6039(class_1614.field_8382, field_7279.field_9632.method_37075(), var4, var0, var3);
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

   private static Identifier method_6039(class_1614 var0, class_1331 var1, class_4924 var2, Identifier var3, class_266 var4) {
      class_3739[] var7 = field_7281[var0.ordinal()];
      if (var7 == null) {
         return var3;
      } else {
         for (int var8 = 0; var8 < var7.length; var8++) {
            class_3739 var9 = var7[var8];
            if (var9.method_17316(var0, var1, var2, var4)) {
               return var9.method_17329(var3);
            }
         }

         return var3;
      }
   }

   private static Identifier method_6044(class_1614 var0, class_8145 var1, class_4924 var2, Identifier var3) {
      class_3739[] var6 = field_7281[var0.ordinal()];
      if (var6 == null) {
         return var3;
      } else {
         for (int var7 = 0; var7 < var6.length; var7++) {
            class_3739 var8 = var6[var7];
            if (var8.method_17317(var0, var1, var2)) {
               return var8.method_17329(var3);
            }
         }

         return var3;
      }
   }

   public static void method_6046() {
      field_7281 = (class_3739[][])null;
      if (class_3111.method_14373()) {
         ArrayList var2 = new ArrayList();
         class_8169[] var3 = class_3111.method_14347();

         for (int var4 = var3.length - 1; var4 >= 0; var4--) {
            class_8169 var5 = var3[var4];
            method_6047(var5, var2);
         }

         field_7281 = method_6037(var2);
      }
   }

   private static class_3739[][] method_6037(List<List<class_3739>> var0) {
      if (!var0.isEmpty()) {
         class_3739[][] var3 = new class_3739[class_1614.values().length][];

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var0.size() > var4) {
               List var5 = (List)var0.get(var4);
               if (var5 != null) {
                  class_3739[] var6 = var5.<class_3739>toArray(new class_3739[var5.size()]);
                  var3[var4] = var6;
               }
            }
         }

         return var3;
      } else {
         return (class_3739[][])null;
      }
   }

   private static void method_6047(class_8169 var0, List<List<class_3739>> var1) {
      String[] var4 = class_9654.method_44543(var0, "optifine/gui/container/", ".properties", (String[])null);
      Arrays.sort(var4);

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var4[var5];
         class_3111.method_14277("CustomGuis: " + var6);

         try {
            Identifier var7 = new Identifier(var6);
            InputStream var8 = var0.method_37466(class_3168.field_15844, var7);
            if (var8 == null) {
               class_3111.method_14317("CustomGuis file not found: " + var6);
            } else {
               class_8407 var9 = new class_8407();
               var9.load(var8);
               var8.close();
               class_3739 var10 = new class_3739(var9, var6);
               if (var10.method_17313(var6)) {
                  method_6040(var10, var1);
               }
            }
         } catch (FileNotFoundException var11) {
            class_3111.method_14317("CustomGuis file not found: " + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }
   }

   private static void method_6040(class_3739 var0, List<List<class_3739>> var1) {
      if (var0.method_17335() != null) {
         int var4 = var0.method_17335().ordinal();

         while (var1.size() <= var4) {
            var1.add((List)null);
         }

         Object var5 = (List)var1.get(var4);
         if (var5 == null) {
            var5 = new ArrayList();
            var1.set(var4, var5);
         }

         var5.add(var0);
      } else {
         method_6045("Invalid container: " + var0.method_17335());
      }
   }

   public static class_4717 method_6043() {
      return field_7283;
   }

   public static void method_6041(class_4717 var0) {
      field_7283 = var0;
   }

   private static boolean method_6036() {
      Calendar var2 = Calendar.getInstance();
      return var2.get(2) + 1 == 12 && var2.get(5) >= 24 && var2.get(5) <= 26;
   }

   private static void method_6045(String var0) {
      class_3111.method_14317("[CustomGuis] " + var0);
   }
}
