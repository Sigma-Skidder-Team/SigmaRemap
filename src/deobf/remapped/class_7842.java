package remapped;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_7842 {
   private static String[] field_39756;

   @class_2378
   private void method_35493(boolean var1, class_1565 var2, boolean var3, boolean var4) {
      class_845 var7 = SigmaMainClass.method_3328().method_3322();
      if (var7.field_4419 == null) {
         while (!class_890.field_4585) {
            try {
               Thread.sleep(999L);
            } catch (InterruptedException var21) {
               var21.printStackTrace();
            }
         }

         var7.field_4419 = var2;
         if (!(var2 instanceof class_5205) && var2 instanceof class_9159) {
            for (Object var9 : class_890.field_4584) {
               boolean var10 = false;

               for (Class var11 = var9.getClass(); var11 != null; var11 = var11.getSuperclass()) {
                  for (Method var15 : var11.getDeclaredMethods()) {
                     if (SigmaMainClass.method_3328().method_3302().method_7910(var15)) {
                        var15.setAccessible(true);
                        class_863 var16 = SigmaMainClass.method_3328().method_3302().method_7907(var15);
                        Class var17 = var15.getParameterTypes()[0];
                        class_4182 var18 = new class_4182(var9, var11, var15, var16);
                        Map var19 = SigmaMainClass.method_3328()
                           .method_3302()
                           .field_9083
                           .getOrDefault(var11, new HashMap<Class<? extends class_8142>, List<class_4182>>());
                        Object var20 = (List)var19.get(var17);
                        if (var20 == null) {
                           var19.put(var17, var20 = new ArrayList());
                        }

                        var20.add(var18);
                        var19.put(var17, var20);
                        SigmaMainClass.method_3328().method_3302().field_9083.put(var11, var19);
                     }
                  }
               }
            }

            SigmaMainClass.method_3328().method_3302().method_7913();

            for (class_9128 var23 : SigmaMainClass.method_3328().method_3298().method_843().values()) {
               for (class_5004 var28 : var23.method_41996().values()) {
                  var28.method_23040();
               }

               if (var23 instanceof class_3620) {
                  for (class_9128 var33 : ((class_3620)var23).field_17661) {
                     for (class_5004 var37 : var33.method_41996().values()) {
                        var37.method_23040();
                     }
                  }
               }

               if (var23.method_42015()) {
                  SigmaMainClass.method_3328().method_3302().method_7917(var23);
                  if (var23 instanceof class_3620) {
                     class_3620 var27 = (class_3620)var23;
                     if (var27.field_17664 != null) {
                        SigmaMainClass.method_3328().method_3302().method_7917(var27.field_17664);
                     }
                  }
               } else {
                  SigmaMainClass.method_3328().method_3302().method_7915(var23);
                  if (var23 instanceof class_3620) {
                     class_3620 var26 = (class_3620)var23;

                     for (class_9128 var36 : var26.field_17661) {
                        SigmaMainClass.method_3328().method_3302().method_7915(var36);
                     }
                  }
               }
            }
         }
      }
   }
}
