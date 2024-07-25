package remapped;

import java.util.Optional;

public class class_3643 implements class_2565 {
   private static String[] field_17769;
   private final class_3758 field_17768;
   private final class_3758 field_17773 = class_2565.method_11648(new class_9633(256));
   private int field_17772 = 255;
   private int field_17770 = 255;
   private int field_17767 = 255;
   private int field_17771 = 255;

   public class_3643(class_3758 var1) {
      this.field_17768 = var1;
   }

   @Override
   public class_7907 method_11645(class_3581 var1) {
      if (!var1.method_16709()) {
         class_7907 var8 = this.field_17768.method_11645(var1);
         Optional var5 = var1.method_16772();
         if (!var5.isPresent()) {
            return var8;
         } else {
            class_7907 var6 = this.field_17773.method_11645((class_3581)var5.get());
            class_7873 var7 = new class_7873(var6, this.field_17772, this.field_17770, this.field_17767, this.field_17771, null);
            return class_2764.method_12575(var7, var8);
         }
      } else {
         class_7907 var4 = this.field_17773.method_11645(var1);
         return new class_7873(var4, this.field_17772, this.field_17770, this.field_17767, this.field_17771, null);
      }
   }

   public void method_16962(int var1, int var2, int var3, int var4) {
      this.field_17772 = var1;
      this.field_17770 = var2;
      this.field_17767 = var3;
      this.field_17771 = var4;
   }

   public void method_16961() {
      this.field_17773.method_17415();
   }
}
