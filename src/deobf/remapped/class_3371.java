package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class class_3371 extends class_5920<LivingEntity> {
   private static String[] field_16616;
   private class_5851 field_16618;
   private int field_16617;

   public class_3371() {
      super(ImmutableMap.of(class_6044.field_30888, class_561.field_3320, class_6044.field_30872, class_561.field_3319));
   }

   @Override
   public boolean method_27088(class_6331 var1, LivingEntity var2) {
      class_3998 var5 = var2.method_26525().<class_3998>method_5138(class_6044.field_30888).get();
      if (!var5.method_18440() && !var5.method_18436()) {
         if (Objects.equals(this.field_16618, var5.method_18438())) {
            if (this.field_16617 > 0) {
               this.field_16617--;
            }

            return this.field_16617 == 0;
         } else {
            this.field_16617 = 20;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_27080(class_6331 var1, LivingEntity var2, long var3) {
      class_3998 var7 = var2.method_26525().<class_3998>method_5138(class_6044.field_30888).get();
      this.field_16618 = var7.method_18438();
      class_5851 var8 = var7.method_18442();
      class_5851 var9 = var7.method_18438();
      BlockPos var10 = var8.method_26686();
      class_2522 var11 = var1.method_28262(var10);
      if (var11.method_8349(class_2351.field_11787)) {
         class_4115 var12 = (class_4115)var11.method_8360();
         if (!var12.method_19104(var11)) {
            var12.method_19110(var1, var11, var10, true);
         }

         this.method_15545(var1, var2, var10);
      }

      BlockPos var15 = var9.method_26686();
      class_2522 var13 = var1.method_28262(var15);
      if (var13.method_8349(class_2351.field_11787)) {
         class_4115 var14 = (class_4115)var13.method_8360();
         if (!var14.method_19104(var13)) {
            var14.method_19110(var1, var13, var15, true);
            this.method_15545(var1, var2, var15);
         }
      }

      method_15548(var1, var2, var8, var9);
   }

   public static void method_15548(class_6331 var0, LivingEntity var1, class_5851 var2, class_5851 var3) {
      class_1150 var6 = var1.method_26525();
      if (var6.method_5117(class_6044.field_30872)) {
         Iterator var7 = var6.<Set<class_8150>>method_5138(class_6044.field_30872).get().iterator();

         while (var7.hasNext()) {
            class_8150 var8 = (class_8150)var7.next();
            BlockPos var9 = var8.method_37409();
            if ((var2 == null || !var2.method_26686().equals(var9)) && (var3 == null || !var3.method_26686().equals(var9))) {
               if (!method_15547(var0, var1, var8)) {
                  class_2522 var10 = var0.method_28262(var9);
                  if (var10.method_8349(class_2351.field_11787)) {
                     class_4115 var11 = (class_4115)var10.method_8360();
                     if (var11.method_19104(var10)) {
                        if (!method_15546(var0, var1, var9)) {
                           var11.method_19110(var0, var10, var9, false);
                           var7.remove();
                        } else {
                           var7.remove();
                        }
                     } else {
                        var7.remove();
                     }
                  } else {
                     var7.remove();
                  }
               } else {
                  var7.remove();
               }
            }
         }
      }
   }

   private static boolean method_15546(class_6331 var0, LivingEntity var1, BlockPos var2) {
      class_1150 var5 = var1.method_26525();
      return var5.method_5117(class_6044.field_30907)
         ? var5.<List<LivingEntity>>method_5138(class_6044.field_30907)
            .get()
            .stream()
            .filter(var1x -> var1x.method_37387() == var1.getType())
            .filter(var1x -> var2.method_12170(var1x.method_37245(), 2.0))
            .anyMatch(var2x -> method_15544(var0, var2x, var2))
         : false;
   }

   private static boolean method_15544(class_6331 var0, LivingEntity var1, BlockPos var2) {
      if (!var1.method_26525().method_5117(class_6044.field_30888)) {
         return false;
      } else {
         class_3998 var5 = var1.method_26525().<class_3998>method_5138(class_6044.field_30888).get();
         if (!var5.method_18436()) {
            class_5851 var6 = var5.method_18442();
            if (var6 == null) {
               return false;
            } else {
               class_5851 var7 = var5.method_18438();
               return var2.equals(var6.method_26686()) || var2.equals(var7.method_26686());
            }
         } else {
            return false;
         }
      }
   }

   private static boolean method_15547(class_6331 var0, LivingEntity var1, class_8150 var2) {
      return var2.method_37408() != var0.method_29545() || !var2.method_37409().method_12170(var1.method_37245(), 2.0);
   }

   private void method_15545(class_6331 var1, LivingEntity var2, BlockPos var3) {
      class_1150 var6 = var2.method_26525();
      class_8150 var7 = class_8150.method_37410(var1.method_29545(), var3);
      if (!var6.<Set<class_8150>>method_5138(class_6044.field_30872).isPresent()) {
         var6.method_5105(class_6044.field_30872, Sets.newHashSet(new class_8150[]{var7}));
      } else {
         var6.<Set<class_8150>>method_5138(class_6044.field_30872).get().add(var7);
      }
   }
}
