package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class class_2740 {
   private static String[] field_13374;
   private static final class_1893 field_13375 = class_1893.method_8510();

   public static boolean method_12342(int var0) {
      class_6098 var3 = field_13375.field_9632.field_3869.method_18878(var0).method_35898();
      return var3 == null || var3.method_27960() instanceof class_221;
   }

   public static int method_12358() {
      float var2 = 0.0F;
      int var3 = -1;

      for (int var4 = 44; var4 >= 9; var4--) {
         class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
         if (!method_12342(var4) && var5.method_28013()) {
            float var6 = var5.method_27960().method_11227().method_38407() * (float)var5.field_31206;
            if (var6 > var2) {
               var3 = var4;
               var2 = var6;
            }
         }
      }

      return var3;
   }

   public static int method_12316(Class<? extends class_2451> var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         class_6098 var6 = field_13375.field_9632.field_3869.method_18878(var5).method_35898();
         if (!method_12342(var5) && var0.isInstance(var6.method_27960())) {
            int var7 = var6.field_31206;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method_12318(class_2451 var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         class_6098 var6 = field_13375.field_9632.field_3869.method_18878(var5).method_35898();
         if (!method_12342(var5) && var6.method_27960() == var0) {
            int var7 = var6.field_31206;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method_12319(class_2451... var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         class_6098 var6 = field_13375.field_9632.field_3869.method_18878(var5).method_35898();
         if (!method_12342(var5)) {
            for (class_2451 var10 : var0) {
               if (var6.method_27960() == var10) {
                  int var11 = var6.field_31206;
                  if (var11 > var3) {
                     var4 = var5;
                     var3 = var11;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static int method_12317(Class<? extends class_2451> var0, int... var1) {
      int var4 = 0;
      int var5 = -1;
      List var6 = Arrays.<int[]>asList(var1);

      for (int var7 = 44; var7 >= 9; var7--) {
         class_6098 var8 = field_13375.field_9632.field_3869.method_18878(var7).method_35898();
         if (!method_12342(var7) && var0.isInstance(var8.method_27960()) && !var6.contains(class_2451.method_11244(var8.method_27960()))) {
            int var9 = var8.field_31206;
            if (var9 > var4) {
               var5 = var7;
               var4 = var9;
            }
         }
      }

      return var5;
   }

   public static int method_12315(int var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         class_6098 var6 = field_13375.field_9632.field_3869.method_18878(var5).method_35898();
         if (!method_12342(var5) && class_2451.method_11244(var6.method_27960()) == var0) {
            int var7 = var6.field_31206;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static void method_12350(int var0, int var1, boolean var2) {
      field_13375.field_9647
         .method_42134(
            field_13375.field_9632.field_3869.field_19925, var0, var1, !var2 ? class_6269.field_32024 : class_6269.field_32019, field_13375.field_9632
         );
   }

   public static void method_12328(int var0) {
      field_13375.field_9647.method_42134(field_13375.field_9632.field_3869.field_19925, var0, 1, class_6269.field_32026, field_13375.field_9632);
   }

   public static boolean method_12320(class_8228 var0, byte var1) {
      return var1 == 5 && method_12341(var0) || var1 == 6 && method_12337(var0) || var1 == 7 && method_12314(var0) || var1 == 8 && method_12352(var0);
   }

   public static boolean method_12341(class_8228 var0) {
      return var0.method_37669() == class_6943.field_35704;
   }

   public static boolean method_12337(class_8228 var0) {
      return var0.method_37669() == class_6943.field_35708;
   }

   public static boolean method_12314(class_8228 var0) {
      return var0.method_37669() == class_6943.field_35698;
   }

   public static boolean method_12352(class_8228 var0) {
      return var0.method_37669() == class_6943.field_35700;
   }

   public static int method_12353() {
      int var2 = -1;
      float var3 = -1.0F;

      for (int var4 = 9; var4 <= 44; var4++) {
         class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
         if (!method_12342(var4) && var5.method_27960() instanceof class_2235) {
            float var6 = ((class_2235)var5.method_27960()).method_10287()
               + (float)class_2931.method_13423(class_3668.field_17864, var5)
               + (float)class_2931.method_13423(class_3668.field_17868, var5);
            if (var6 > var3 || var6 == var3 && var4 == 36) {
               var2 = var4;
               var3 = var6;
            }
         }
      }

      return var2;
   }

   public static int method_12346() {
      class_2522 var2 = class_6414.method_29293(1);
      return method_12348(var2);
   }

   public static int method_12332() {
      class_2522 var2 = class_6414.method_29293(5);
      return method_12348(var2);
   }

   public static int method_12324() {
      class_2522 var2 = class_6414.method_29293(3);
      return method_12348(var2);
   }

   public static int method_12348(class_2522 var0) {
      int var3 = -1;
      float var4 = 1.0F;

      for (int var5 = 44; var5 >= 9; var5--) {
         class_6098 var6 = field_13375.field_9632.field_3869.method_18878(var5).method_35898();
         if (var6 != null) {
            float var7 = 0.0F;
            if (var0 == null) {
               if (!(var6.method_27960() instanceof class_2235)) {
                  continue;
               }

               var7 = ((class_2235)var6.method_27960()).method_10287();
            } else {
               var7 = var6.method_28035(var0);
            }

            if (var7 > var4) {
               var3 = var5;
               var4 = var7;
            }
         }
      }

      return var3;
   }

   public static int method_12344(Class<? extends class_2451> var0) {
      int var3 = 0;

      for (int var4 = 44; var4 >= 9; var4--) {
         class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
         if (!method_12342(var4) && var0.isInstance(var5.method_27960())) {
            var3 += var5.field_31206;
         }
      }

      return var3;
   }

   public static int method_12321(Class<? extends class_2451> var0) {
      int var3 = 64;

      for (int var4 = 44; var4 >= 9; var4--) {
         class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
         if (!method_12342(var4) && var0.isInstance(var5.method_27960()) && var5.field_31206 < var3) {
            var3 = var5.field_31206;
         }
      }

      return var3;
   }

   public static int method_12368(Class<? extends class_2451> var0) {
      HashSet var3 = new HashSet();

      for (int var4 = 44; var4 >= 9; var4--) {
         class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
         if (!method_12342(var4) && var0.isInstance(var5.method_27960())) {
            var3.add(var4);
         }
      }

      return var3.size();
   }

   public static int method_12349() {
      int var2 = -1;
      float var3 = -1.0F;

      for (int var4 = 44; var4 >= 9; var4--) {
         class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
         if (!method_12342(var4) && var5.method_27960() instanceof class_2100) {
            float var6 = (float)class_2931.method_13423(class_3668.field_17850, var5);
            if (var6 > var3) {
               var2 = var4;
               var3 = var6;
            }
         }
      }

      return var2;
   }

   public static int method_12334(Class<? extends class_2451> var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         class_6098 var6 = field_13375.field_9632.field_3853.method_31498(var5);
         if (var6 != null && var0.isInstance(var6.method_27960())) {
            int var7 = var6.field_31206;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method_12336(class_2451... var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         class_6098 var6 = field_13375.field_9632.field_3853.method_31498(var5);
         if (var6 != null) {
            for (class_2451 var10 : var0) {
               if (var6.method_27960() == var10) {
                  int var11 = var6.field_31206;
                  if (var11 > var3) {
                     var4 = var5;
                     var3 = var11;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static int method_12335(Class<? extends class_2451> var0, int... var1) {
      int var4 = 0;
      int var5 = -1;
      List var6 = Arrays.<int[]>asList(var1);

      for (int var7 = 0; var7 < 9; var7++) {
         class_6098 var8 = field_13375.field_9632.field_3853.method_31498(var7);
         if (var8 != null && var0.isInstance(var8.method_27960()) && !var6.contains(class_2451.method_11244(var8.method_27960()))) {
            int var9 = var8.field_31206;
            if (var9 > var4) {
               var5 = var7;
               var4 = var9;
            }
         }
      }

      return var5;
   }

   public static int method_12333(int var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         class_6098 var6 = field_13375.field_9632.field_3853.method_31498(var5);
         if (var6 != null && class_2451.method_11244(var6.method_27960()) == var0) {
            int var7 = var6.field_31206;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method_12347() {
      for (int var2 = 0; var2 < 9; var2++) {
         class_6098 var3 = field_13375.field_9632.field_3853.method_31498(var2);
         if (var3 == null) {
            return var2;
         }
      }

      return 0;
   }

   public static boolean method_12361(int var0) {
      return method_12362(field_13375.field_9632.field_3869.method_18878(var0).method_35898());
   }

   public static boolean method_12362(class_6098 var0) {
      if (var0.method_27960() instanceof class_8228) {
         class_8228 var3 = (class_8228)var0.method_27960();
         int var4 = method_12323(var0);
         if (!method_12341(var3)) {
            if (!method_12337(var3)) {
               if (!method_12314(var3)) {
                  return !method_12352(var3) ? false : var4 > method_12322(8);
               } else {
                  return var4 > method_12322(7);
               }
            } else {
               return var4 > method_12322(6);
            }
         } else {
            return var4 > method_12322(5);
         }
      } else {
         return false;
      }
   }

   public static int method_12322(int var0) {
      if (field_13375.field_9632.field_3869.method_18878(var0).method_35898() != null) {
         if (field_13375.field_9632.field_3869.method_18878(var0).method_35898().method_27960() instanceof class_8228) {
            class_8228 var3 = (class_8228)field_13375.field_9632.field_3869.method_18878(var0).method_35898().method_27960();
            return var3.field_42244 + class_2931.method_13423(class_4382.method_20431(0), field_13375.field_9632.field_3869.method_18878(var0).method_35898());
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public static int method_12323(class_6098 var0) {
      if (var0 != null) {
         return var0.method_27960() instanceof class_8228
            ? ((class_8228)var0.method_27960()).field_42244 + class_2931.method_13423(class_3668.field_17859, var0)
            : 0;
      } else {
         return 0;
      }
   }

   public static int method_12329(class_704 var0) {
      int var3 = 0;

      for (byte var4 = 5; var4 <= 8; var4++) {
         var3 += method_12323(var0.field_3853.method_31498(var4));
      }

      return var3;
   }

   public static float method_12338(class_704 var0) {
      float var3 = (float)method_12329(var0);
      float var4 = 0.0F;
      float var5 = method_12343(var0.method_26446());
      return var5 * (1.0F - Math.min(20.0F, Math.max(var3 / 5.0F, var3 - var5 / (var4 / 4.0F + 2.0F))) / 25.0F);
   }

   public static float method_12343(class_6098 var0) {
      return var0 != null && var0.method_27960() instanceof class_2235
         ? ((class_2235)var0.method_27960()).method_10287()
            + (float)class_2931.method_13423(class_3668.field_17864, var0)
            + (float)class_2931.method_13423(class_3668.field_17868, var0)
         : 1.0F;
   }

   public static float method_12325(class_6098 var0) {
      if (var0 != null) {
         class_2451 var3 = var0.method_27960();
         if (!(var3 instanceof class_2235)) {
            if (!(var3 instanceof class_3997)) {
               if (!(var3 instanceof class_8036)) {
                  if (!(var3 instanceof class_3077)) {
                     if (!(var3 instanceof class_2100)) {
                        if (!(var3 instanceof class_5518)) {
                           if (!(var3 instanceof class_6201)) {
                              if (var0.method_28013() && var0.method_27960().method_11227() == class_5465.field_27849) {
                                 return 1.0F;
                              } else if (!(var3 instanceof class_4715)) {
                                 if (!var0.method_28013()) {
                                    if (!(var3 instanceof class_2504)) {
                                       return !(var3 instanceof class_7547) ? 0.0F : 0.25F;
                                    } else {
                                       return 0.25F;
                                    }
                                 } else {
                                    return 0.5F;
                                 }
                              } else {
                                 return 1.0F;
                              }
                           } else {
                              return 1.0F;
                           }
                        } else {
                           return 1.25F;
                        }
                     } else {
                        return 1.5F;
                     }
                  } else {
                     return 1.5F;
                  }
               } else {
                  return 1.5F;
               }
            } else {
               return 1.5F;
            }
         } else {
            return 2.0F;
         }
      } else {
         return -1.0F;
      }
   }

   public static HashMap<Integer, Float> method_12371() {
      HashMap var2 = new HashMap();

      for (int var3 = 0; var3 < 9; var3++) {
         class_6098 var4 = field_13375.field_9632.field_3853.method_31498(var3);
         var2.put(var3, method_12325(var4) * (float)(field_13375.field_9632.field_3853.field_36404 != var3 ? 1 : 2));
      }

      return var2;
   }

   public static int method_12359() {
      HashMap var2 = method_12371();
      TreeMap var3 = new TreeMap(Collections.reverseOrder());
      var3.putAll(var2);
      Entry var4 = null;

      for (Entry var6 : var3.entrySet()) {
         if (var4 == null || (Float)var4.getValue() > (Float)var6.getValue()) {
            var4 = var6;
         }
      }

      return (Integer)var4.getKey();
   }

   public static int method_12363(int var0) {
      int var3 = method_12359();
      method_12355(field_13375.field_9632.field_3869.field_19925, var0, var3, class_6269.field_32026, field_13375.field_9632);
      return var3;
   }

   public static List<class_2250> method_12313(class_6098 var0) {
      if (var0 != null) {
         return var0.method_27960() instanceof class_5518 ? class_9541.method_43993(var0) : null;
      } else {
         return null;
      }
   }

   public static boolean method_12351(class_6098 var0) {
      return var0 != null ? var0.method_27960() instanceof class_6947 : false;
   }

   public static float method_12330(class_6098 var0) {
      List var3 = method_12313(var0);
      if (var3 != null) {
         float var4 = 0.0F;

         for (class_2250 var6 : var3) {
            if (var6.method_10339() == class_4054.field_19749) {
               var4 = (float)(var6.method_10333() + 1);
            }

            if (var6.method_10339() != class_4054.field_19742) {
               if (var6.method_10339() == class_4054.field_19723) {
                  var4 = (float)(-var6.method_10333() + 1);
               }
            } else {
               var4 = (float)(var6.method_10333() + 1) / 2.0F;
            }
         }

         return var4;
      } else {
         return 0.0F;
      }
   }

   public static float method_12326(class_6098 var0) {
      List var3 = method_12313(var0);
      if (var3 != null) {
         float var4 = 0.0F;

         for (class_2250 var6 : var3) {
            if (var6.method_10339() != class_4054.field_19739) {
               if (var6.method_10339() == class_4054.field_19743) {
                  var4 = (float)(-var6.method_10333() + 1);
               }
            } else {
               var4 = (float)(var6.method_10333() + 1);
            }
         }

         return var4;
      } else {
         return 0.0F;
      }
   }

   public static HashMap<Integer, class_6098> method_12327() {
      HashMap var2 = new HashMap();

      for (int var3 = 44; var3 >= 9; var3--) {
         class_6098 var4 = field_13375.field_9632.field_3869.method_18878(var3).method_35898();
         if (!method_12342(var3) && var4.method_27960() instanceof class_5518) {
            var2.put(var3, var4);
         }
      }

      return var2;
   }

   public static HashMap<Integer, class_6098> method_12357() {
      HashMap var2 = new HashMap();

      for (int var3 = 44; var3 >= 9; var3--) {
         class_6098 var4 = field_13375.field_9632.field_3869.method_18878(var3).method_35898();
         var2.put(var3, var4);
      }

      return var2;
   }

   public static boolean method_12370(Class<? extends class_2451> var0) {
      for (Entry var4 : method_12357().entrySet()) {
         if (var4 != null && var0.isInstance(var4.getValue())) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_12339(int var0) {
      return var0 > 35;
   }

   public static class_6098 method_12311(int var0) {
      return field_13375.field_9632.field_3869.method_18878(var0).method_35898();
   }

   public static boolean method_12354(class_6098 var0) {
      if (var0 != null) {
         if (var0.method_28013()) {
            float var3 = var0.method_27960().method_11227().method_38407() * (float)var0.field_31206;
            int var4 = method_12358();
            if (var4 != -1) {
               class_6098 var5 = method_12311(var4);
               float var6 = var5.method_27960().method_11227().method_38407() * (float)var5.field_31206;
               return var3 > var6;
            } else {
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean method_12331(class_6098 var0) {
      if (var0 != null) {
         if (var0.method_27960() instanceof class_603) {
            int var3 = method_12316(class_603.class);
            if (var3 != -1) {
               class_6098 var4 = method_12311(var3);
               int var5 = var4.field_31206;
               int var6 = var0.field_31206;
               return var6 > var5;
            } else {
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static class_6098 method_12355(int var0, int var1, int var2, class_6269 var3, class_704 var4) {
      return method_12356(var0, var1, var2, var3, var4, false);
   }

   public static class_6098 method_12356(int var0, int var1, int var2, class_6269 var3, class_704 var4, boolean var5) {
      class_6098 var8 = null;
      if (var1 >= 0) {
         var8 = var4.field_3874.method_18878(var1).method_35898().method_27973();
      }

      short var9 = var4.field_3874.method_18884(field_13375.field_9632.field_3853);
      class_6098 var10 = var4.field_3874.method_18865(var1, var2, var3, var4);
      if (var8 == null || class_3347.method_15348().method_2055() > class_412.field_1740.method_2055() && !var5 || var3 == class_6269.field_32026) {
         var8 = var10;
      }

      field_13375.method_8614().method_4813(new class_5955(var0, var1, var2, var3, var8, var9));
      return var10;
   }

   public static void method_12365(int var0) {
      field_13375.field_9647.method_42134(field_13375.field_9632.field_3869.field_19925, var0, 1, class_6269.field_32024, field_13375.field_9632);
   }

   public static boolean method_12364(class_6098 var0) {
      if (var0 != null && var0.method_27960() instanceof class_8228) {
         float var3 = (float)method_12323(var0);

         for (int var4 = 5; var4 < 45; var4++) {
            if (field_13375.field_9632.field_3869.method_18878(var4).method_35884()) {
               class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
               class_2451 var6 = var5.method_27960();
               if (var6 instanceof class_8228) {
                  class_8228 var7 = (class_8228)var6;
                  if ((float)method_12323(var5) > var3 && var7.method_37669() == ((class_8228)var0.method_27960()).method_37669()) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void method_12312(int var0, int var1) {
      field_13375.field_9647.method_42134(field_13375.field_9632.field_3869.field_19925, var0, var1, class_6269.field_32026, field_13375.field_9632);
   }

   public static boolean method_12360(class_6098 var0) {
      if (var0 != null && var0.method_27960() instanceof class_5518) {
         for (class_2250 var4 : method_12313(var0)) {
            if (var4.method_10339() == class_4054.field_19718
               || var4.method_10339() == class_4054.field_19723
               || var4.method_10339() == class_4054.field_19743
               || var4.method_10339() == class_4054.field_19737) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean method_12366() {
      for (class_7934 var3 : field_13375.field_9632.field_3869.field_19926) {
         if (!var3.method_35884() && var3.field_40588 > 8 && var3.field_40588 < 45) {
            return false;
         }
      }

      return true;
   }

   public static boolean method_12369(class_6098 var0) {
      return var0 != null && !var0.method_27960().equals(class_4897.field_25302);
   }

   public static List<class_6098> method_12340(class_704 var0) {
      ArrayList var3 = new ArrayList();

      for (class_7934 var5 : var0.field_3869.field_19926) {
         if (method_12369(var5.method_35898())) {
            var3.add(var5.method_35898());
         }
      }

      return var3;
   }

   public static int method_12345(class_2451 var0) {
      int var3 = 0;

      for (int var4 = 44; var4 >= 9; var4--) {
         class_6098 var5 = field_13375.field_9632.field_3869.method_18878(var4).method_35898();
         if (!method_12342(var4) && var5.method_27960() == var0) {
            var3 += var5.field_31206;
         }
      }

      return var3;
   }
}
