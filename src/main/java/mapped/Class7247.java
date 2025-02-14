package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class7247 {
   private static String[] field31112;
   private static final Class7258[] field31113 = new Class7258[]{
      new Class7258(Class4168.class, 30, 0, true),
      new Class7258(Class4174.class, 10, 4),
      new Class7258(Class4177.class, 10, 4),
      new Class7258(Class4228.class, 10, 3),
      new Class7258(Class4227.class, 5, 2),
      new Class7258(Class4170.class, 5, 1)
   };
   private static final Class7258[] field31114 = new Class7258[]{
      new Class7258(Class4226.class, 25, 0, true),
      new Class7258(Class4166.class, 15, 5),
      new Class7258(Class4229.class, 5, 10),
      new Class7258(Class4169.class, 5, 10),
      new Class7258(Class4176.class, 10, 3, true),
      new Class7258(Class4173.class, 7, 2),
      new Class7258(Class4172.class, 5, 2)
   };

   private static Class4167 method22747(Class7258 var0, List<Class4178> var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      Class var10 = var0.field31141;
      Object var11 = null;
      if (var10 != Class4168.class) {
         if (var10 != Class4174.class) {
            if (var10 != Class4177.class) {
               if (var10 != Class4228.class) {
                  if (var10 != Class4227.class) {
                     if (var10 != Class4170.class) {
                        if (var10 != Class4226.class) {
                           if (var10 != Class4229.class) {
                              if (var10 != Class4169.class) {
                                 if (var10 != Class4176.class) {
                                    if (var10 != Class4173.class) {
                                       if (var10 != Class4166.class) {
                                          if (var10 == Class4172.class) {
                                             var11 = Class4172.method12909(var1, var3, var4, var5, var6, var7);
                                          }
                                       } else {
                                          var11 = Class4166.method12895(var1, var3, var4, var5, var6, var7);
                                       }
                                    } else {
                                       var11 = Class4173.method12910(var1, var3, var4, var5, var6, var7);
                                    }
                                 } else {
                                    var11 = Class4176.method12912(var1, var3, var4, var5, var6, var7);
                                 }
                              } else {
                                 var11 = Class4169.method12906(var1, var2, var3, var4, var5, var6, var7);
                              }
                           } else {
                              var11 = Class4229.method13021(var1, var2, var3, var4, var5, var6, var7);
                           }
                        } else {
                           var11 = Class4226.method13018(var1, var3, var4, var5, var6, var7);
                        }
                     } else {
                        var11 = Class4170.method12907(var1, var2, var3, var4, var5, var6, var7);
                     }
                  } else {
                     var11 = Class4227.method13019(var1, var3, var4, var5, var7, var6);
                  }
               } else {
                  var11 = Class4228.method13020(var1, var3, var4, var5, var7, var6);
               }
            } else {
               var11 = Class4177.method12913(var1, var3, var4, var5, var6, var7);
            }
         } else {
            var11 = Class4174.method12911(var1, var3, var4, var5, var6, var7);
         }
      } else {
         var11 = Class4168.method12905(var1, var2, var3, var4, var5, var6, var7);
      }

      return (Class4167)var11;
   }

   // $VF: synthetic method
   public static Class4167 method22748(Class7258 var0, List var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      return method22747(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $VF: synthetic method
   public static Class7258[] method22749() {
      return field31113;
   }

   // $VF: synthetic method
   public static Class7258[] method22750() {
      return field31114;
   }
}
