package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class class_7965 {
   private static String[] field_40806;
   private static final class_1817[] field_40807 = new class_1817[]{
      new class_1817(class_2091.class, 40, 0),
      new class_1817(class_7153.class, 5, 5),
      new class_1817(class_2090.class, 20, 0),
      new class_1817(class_6576.class, 20, 0),
      new class_1817(class_5271.class, 10, 6),
      new class_1817(class_5259.class, 5, 5),
      new class_1817(class_3236.class, 5, 5),
      new class_1817(class_1118.class, 5, 4),
      new class_1817(class_2372.class, 5, 4),
      new class_7558(class_4122.class, 10, 2),
      new class_9579(class_8651.class, 20, 1)
   };
   private static List<class_1817> field_40808;
   private static Class<? extends class_8549> field_40809;
   private static int field_40805;
   private static final class_9642 field_40810 = new class_9642(null);

   public static void method_36049() {
      field_40808 = Lists.newArrayList();

      for (class_1817 var5 : field_40807) {
         var5.field_9224 = 0;
         field_40808.add(var5);
      }

      field_40809 = null;
   }

   private static boolean method_36056() {
      boolean var2 = false;
      field_40805 = 0;

      for (class_1817 var4 : field_40808) {
         if (var4.field_9226 > 0 && var4.field_9224 < var4.field_9226) {
            var2 = true;
         }

         field_40805 = field_40805 + var4.field_9227;
      }

      return var2;
   }

   private static class_8549 method_36050(
      Class<? extends class_8549> var0, List<class_7060> var1, Random var2, int var3, int var4, int var5, class_240 var6, int var7
   ) {
      Object var10 = null;
      if (var0 != class_2091.class) {
         if (var0 != class_7153.class) {
            if (var0 != class_2090.class) {
               if (var0 != class_6576.class) {
                  if (var0 != class_5271.class) {
                     if (var0 != class_5259.class) {
                        if (var0 != class_3236.class) {
                           if (var0 != class_1118.class) {
                              if (var0 != class_2372.class) {
                                 if (var0 != class_4122.class) {
                                    if (var0 == class_8651.class) {
                                       var10 = class_8651.method_39669(var1, var3, var4, var5, var6, var7);
                                    }
                                 } else {
                                    var10 = class_4122.method_19137(var1, var2, var3, var4, var5, var6, var7);
                                 }
                              } else {
                                 var10 = class_2372.method_10852(var1, var2, var3, var4, var5, var6, var7);
                              }
                           } else {
                              var10 = class_1118.method_4934(var1, var2, var3, var4, var5, var6, var7);
                           }
                        } else {
                           var10 = class_3236.method_14829(var1, var2, var3, var4, var5, var6, var7);
                        }
                     } else {
                        var10 = class_5259.method_24025(var1, var2, var3, var4, var5, var6, var7);
                     }
                  } else {
                     var10 = class_5271.method_24056(var1, var2, var3, var4, var5, var6, var7);
                  }
               } else {
                  var10 = class_6576.method_30026(var1, var2, var3, var4, var5, var6, var7);
               }
            } else {
               var10 = class_2090.method_9791(var1, var2, var3, var4, var5, var6, var7);
            }
         } else {
            var10 = class_7153.method_32844(var1, var2, var3, var4, var5, var6, var7);
         }
      } else {
         var10 = class_2091.method_9792(var1, var2, var3, var4, var5, var6, var7);
      }

      return (class_8549)var10;
   }

   private static class_8549 method_36054(class_4960 var0, List<class_7060> var1, Random var2, int var3, int var4, int var5, class_240 var6, int var7) {
      if (!method_36056()) {
         return null;
      } else {
         if (field_40809 != null) {
            class_8549 var10 = method_36050(field_40809, var1, var2, var3, var4, var5, var6, var7);
            field_40809 = null;
            if (var10 != null) {
               return var10;
            }
         }

         int var15 = 0;

         while (var15 < 5) {
            var15++;
            int var11 = var2.nextInt(field_40805);

            for (class_1817 var13 : field_40808) {
               var11 -= var13.field_9227;
               if (var11 < 0) {
                  if (!var13.method_8050(var7) || var13 == var0.field_25658) {
                     break;
                  }

                  class_8549 var14 = method_36050(var13.field_9228, var1, var2, var3, var4, var5, var6, var7);
                  if (var14 != null) {
                     var13.field_9224++;
                     var0.field_25658 = var13;
                     if (!var13.method_8052()) {
                        field_40808.remove(var13);
                     }

                     return var14;
                  }
               }
            }
         }

         class_9616 var16 = class_8225.method_37659(var1, var2, var3, var4, var5, var6);
         return var16 != null && var16.field_48995 > 1 ? new class_8225(var7, var16, var6) : null;
      }
   }

   private static class_7060 method_36055(class_4960 var0, List<class_7060> var1, Random var2, int var3, int var4, int var5, class_240 var6, int var7) {
      if (var7 <= 50) {
         if (Math.abs(var3 - var0.method_32512().field_48996) <= 112 && Math.abs(var5 - var0.method_32512().field_48992) <= 112) {
            class_8549 var10 = method_36054(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
            if (var10 != null) {
               var1.add(var10);
               var0.field_25657.add(var10);
            }

            return var10;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
