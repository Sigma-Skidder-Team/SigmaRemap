package remapped;

import java.util.List;
import java.util.Random;

public class class_1588 {
   private static String[] field_8298;
   private static final class_1608[] field_8300 = new class_1608[]{
      new class_1608(class_2349.class, 30, 0, true),
      new class_1608(class_8757.class, 10, 4),
      new class_1608(class_8608.class, 10, 4),
      new class_1608(class_8445.class, 10, 3),
      new class_1608(class_1443.class, 5, 2),
      new class_1608(class_3806.class, 5, 1)
   };
   private static final class_1608[] field_8299 = new class_1608[]{
      new class_1608(class_6182.class, 25, 0, true),
      new class_1608(class_114.class, 15, 5),
      new class_1608(class_9021.class, 5, 10),
      new class_1608(class_3413.class, 5, 10),
      new class_1608(class_4535.class, 10, 3, true),
      new class_1608(class_5881.class, 7, 2),
      new class_1608(class_235.class, 5, 2)
   };

   private static class_6315 method_7132(class_1608 var0, List<class_7060> var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      Class var10 = var0.field_8344;
      Object var11 = null;
      if (var10 != class_2349.class) {
         if (var10 != class_8757.class) {
            if (var10 != class_8608.class) {
               if (var10 != class_8445.class) {
                  if (var10 != class_1443.class) {
                     if (var10 != class_3806.class) {
                        if (var10 != class_6182.class) {
                           if (var10 != class_9021.class) {
                              if (var10 != class_3413.class) {
                                 if (var10 != class_4535.class) {
                                    if (var10 != class_5881.class) {
                                       if (var10 != class_114.class) {
                                          if (var10 == class_235.class) {
                                             var11 = class_235.method_992(var1, var3, var4, var5, var6, var7);
                                          }
                                       } else {
                                          var11 = class_114.method_342(var1, var3, var4, var5, var6, var7);
                                       }
                                    } else {
                                       var11 = class_5881.method_26822(var1, var3, var4, var5, var6, var7);
                                    }
                                 } else {
                                    var11 = class_4535.method_21055(var1, var3, var4, var5, var6, var7);
                                 }
                              } else {
                                 var11 = class_3413.method_15757(var1, var2, var3, var4, var5, var6, var7);
                              }
                           } else {
                              var11 = class_9021.method_41387(var1, var2, var3, var4, var5, var6, var7);
                           }
                        } else {
                           var11 = class_6182.method_28308(var1, var3, var4, var5, var6, var7);
                        }
                     } else {
                        var11 = class_3806.method_17721(var1, var2, var3, var4, var5, var6, var7);
                     }
                  } else {
                     var11 = class_1443.method_6618(var1, var3, var4, var5, var7, var6);
                  }
               } else {
                  var11 = class_8445.method_38843(var1, var3, var4, var5, var7, var6);
               }
            } else {
               var11 = class_8608.method_39567(var1, var3, var4, var5, var6, var7);
            }
         } else {
            var11 = class_8757.method_40202(var1, var3, var4, var5, var6, var7);
         }
      } else {
         var11 = class_2349.method_10752(var1, var2, var3, var4, var5, var6, var7);
      }

      return (class_6315)var11;
   }
}
