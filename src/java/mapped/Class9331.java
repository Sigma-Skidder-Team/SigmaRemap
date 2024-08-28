package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class Class9331 {
   private static String[] field43303;
   private static final Class7336[] field43304 = new Class7336[]{
      new Class7336(Class4201.class, 40, 0),
      new Class7336(Class4207.class, 5, 5),
      new Class7336(Class4199.class, 20, 0),
      new Class7336(Class4198.class, 20, 0),
      new Class7336(Class4205.class, 10, 6),
      new Class7336(Class4203.class, 5, 5),
      new Class7336(Class4195.class, 5, 5),
      new Class7336(Class4200.class, 5, 4),
      new Class7336(Class4206.class, 5, 4),
      new Class7337(Class4202.class, 10, 2),
      new Class7338(Class4204.class, 20, 1)
   };
   private static List<Class7336> field43305;
   private static Class<? extends Class4194> field43306;
   private static int field43307;
   private static final Class8348 field43308 = new Class8348(null);

   public static void method35283() {
      field43305 = Lists.newArrayList();

      for (Class7336 var5 : field43304) {
         var5.field31438 = 0;
         field43305.add(var5);
      }

      field43306 = null;
   }

   private static boolean method35284() {
      boolean var2 = false;
      field43307 = 0;

      for (Class7336 var4 : field43305) {
         if (var4.field31439 > 0 && var4.field31438 < var4.field31439) {
            var2 = true;
         }

         field43307 = field43307 + var4.field31437;
      }

      return var2;
   }

   private static Class4194 method35285(
           Class<? extends Class4194> var0, List<Class4178> var1, Random var2, int var3, int var4, int var5, Direction var6, int var7
   ) {
      Object var10 = null;
      if (var0 != Class4201.class) {
         if (var0 != Class4207.class) {
            if (var0 != Class4199.class) {
               if (var0 != Class4198.class) {
                  if (var0 != Class4205.class) {
                     if (var0 != Class4203.class) {
                        if (var0 != Class4195.class) {
                           if (var0 != Class4200.class) {
                              if (var0 != Class4206.class) {
                                 if (var0 != Class4202.class) {
                                    if (var0 == Class4204.class) {
                                       var10 = Class4204.method12997(var1, var3, var4, var5, var6, var7);
                                    }
                                 } else {
                                    var10 = Class4202.method12995(var1, var2, var3, var4, var5, var6, var7);
                                 }
                              } else {
                                 var10 = Class4206.method12999(var1, var2, var3, var4, var5, var6, var7);
                              }
                           } else {
                              var10 = Class4200.method12993(var1, var2, var3, var4, var5, var6, var7);
                           }
                        } else {
                           var10 = Class4195.method12990(var1, var2, var3, var4, var5, var6, var7);
                        }
                     } else {
                        var10 = Class4203.method12996(var1, var2, var3, var4, var5, var6, var7);
                     }
                  } else {
                     var10 = Class4205.method12998(var1, var2, var3, var4, var5, var6, var7);
                  }
               } else {
                  var10 = Class4198.method12991(var1, var2, var3, var4, var5, var6, var7);
               }
            } else {
               var10 = Class4199.method12992(var1, var2, var3, var4, var5, var6, var7);
            }
         } else {
            var10 = Class4207.method13000(var1, var2, var3, var4, var5, var6, var7);
         }
      } else {
         var10 = Class4201.method12994(var1, var2, var3, var4, var5, var6, var7);
      }

      return (Class4194)var10;
   }

   private static Class4194 method35286(Class4196 var0, List<Class4178> var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      if (!method35284()) {
         return null;
      } else {
         if (field43306 != null) {
            Class4194 var10 = method35285(field43306, var1, var2, var3, var4, var5, var6, var7);
            field43306 = null;
            if (var10 != null) {
               return var10;
            }
         }

         int var15 = 0;

         while (var15 < 5) {
            var15++;
            int var11 = var2.nextInt(field43307);

            for (Class7336 var13 : field43305) {
               var11 -= var13.field31437;
               if (var11 < 0) {
                  if (!var13.method23253(var7) || var13 == var0.field20498) {
                     break;
                  }

                  Class4194 var14 = method35285(var13.field31436, var1, var2, var3, var4, var5, var6, var7);
                  if (var14 != null) {
                     var13.field31438++;
                     var0.field20498 = var13;
                     if (!var13.method23254()) {
                        field43305.remove(var13);
                     }

                     return var14;
                  }
               }
            }
         }

         Class9764 var16 = Class4208.method13001(var1, var2, var3, var4, var5, var6);
         return var16 != null && var16.field45679 > 1 ? new Class4208(var7, var16, var6) : null;
      }
   }

   private static Class4178 method35287(Class4196 var0, List<Class4178> var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      if (var7 <= 50) {
         if (Math.abs(var3 - var0.method12915().field45678) <= 112 && Math.abs(var5 - var0.method12915().field45680) <= 112) {
            Class4194 var10 = method35286(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
            if (var10 != null) {
               var1.add(var10);
               var0.field20500.add(var10);
            }

            return var10;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $VF: synthetic method
   public static Class8348 method35288() {
      return field43308;
   }

   // $VF: synthetic method
   public static Class method35289(Class var0) {
      field43306 = var0;
      return var0;
   }

   // $VF: synthetic method
   public static Class4178 method35290(Class4196 var0, List var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      return method35287(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
