package remapped;

import com.google.common.collect.ImmutableMap;

public class class_3424<E extends class_5886 & class_3832, T extends class_5834> extends class_5920<E> {
   private static String[] field_16857;
   private int field_16856;
   private class_2151 field_16858 = class_2151.field_10757;

   public class_3424() {
      super(ImmutableMap.of(class_6044.field_30874, class_561.field_3319, class_6044.field_30884, class_561.field_3320), 1200);
   }

   public boolean method_15830(class_6331 var1, E var2) {
      class_5834 var5 = method_15825(var2);
      return var2.method_26443(class_4897.field_25030) && class_1225.method_5449(var2, var5) && class_1225.method_5451(var2, var5, 0);
   }

   public boolean method_15828(class_6331 var1, E var2, long var3) {
      return var2.method_26525().method_5117(class_6044.field_30884) && this.method_15830(var1, (E)var2);
   }

   public void method_15826(class_6331 var1, E var2, long var3) {
      class_5834 var7 = method_15825(var2);
      this.method_15829(var2, var7);
      this.method_15831((E)var2, var7);
   }

   public void method_15827(class_6331 var1, E var2, long var3) {
      if (var2.method_26554()) {
         var2.method_26529();
      }

      if (var2.method_26443(class_4897.field_25030)) {
         ((class_3832)var2).method_17810(false);
         class_4380.method_20412(var2.method_26576(), false);
      }
   }

   private void method_15831(E var1, class_5834 var2) {
      if (this.field_16858 != class_2151.field_10757) {
         if (this.field_16858 != class_2151.field_10759) {
            if (this.field_16858 != class_2151.field_10761) {
               if (this.field_16858 == class_2151.field_10758) {
                  ((class_2354)var1).method_10805(var2, 1.0F);
                  ItemStack var5 = var1.method_26617(class_8462.method_38934(var1, class_4897.field_25030));
                  class_4380.method_20412(var5, false);
                  this.field_16858 = class_2151.field_10757;
               }
            } else {
               this.field_16856--;
               if (this.field_16856 == 0) {
                  this.field_16858 = class_2151.field_10758;
               }
            }
         } else {
            if (!var1.method_26554()) {
               this.field_16858 = class_2151.field_10757;
            }

            int var7 = var1.method_26613();
            ItemStack var6 = var1.method_26576();
            if (var7 >= class_4380.method_20403(var6)) {
               var1.method_26474();
               this.field_16858 = class_2151.field_10761;
               this.field_16856 = 20 + var1.method_26594().nextInt(20);
               ((class_3832)var1).method_17810(false);
            }
         }
      } else {
         var1.method_26462(class_8462.method_38934(var1, class_4897.field_25030));
         this.field_16858 = class_2151.field_10759;
         ((class_3832)var1).method_17810(true);
      }
   }

   private void method_15829(class_5886 var1, class_5834 var2) {
      var1.method_26525().method_5105(class_6044.field_30874, new class_4843(var2, true));
   }

   private static class_5834 method_15825(class_5834 var0) {
      return var0.method_26525().<class_5834>method_5138(class_6044.field_30884).get();
   }
}
