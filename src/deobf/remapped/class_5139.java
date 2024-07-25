package remapped;

public class class_5139 extends class_4382 {
   private static String[] field_26488;
   public final class_1849 field_26489;

   public class_5139(class_5855 var1, class_1849 var2, class_6943... var3) {
      super(var1, var2 != class_1849.field_9387 ? class_8718.field_44691 : class_8718.field_44694, var3);
      this.field_26489 = var2;
   }

   @Override
   public int method_20433(int var1) {
      return this.field_26489.method_8173() + (var1 - 1) * this.field_26489.method_8172();
   }

   @Override
   public int method_20437(int var1) {
      return this.method_20433(var1) + this.field_26489.method_8172();
   }

   @Override
   public int method_20417() {
      return 4;
   }

   @Override
   public int method_20438(int var1, DamageSource var2) {
      if (var2.method_28346()) {
         return 0;
      } else if (this.field_26489 != class_1849.field_9384) {
         if (this.field_26489 == class_1849.field_9379 && var2.method_28360()) {
            return var1 * 2;
         } else if (this.field_26489 == class_1849.field_9387 && var2 == DamageSource.field_31684) {
            return var1 * 3;
         } else if (this.field_26489 == class_1849.field_9388 && var2.method_28367()) {
            return var1 * 2;
         } else {
            return this.field_26489 == class_1849.field_9386 && var2.method_28357() ? var1 * 2 : 0;
         }
      } else {
         return var1;
      }
   }

   @Override
   public boolean method_20426(class_4382 var1) {
      if (!(var1 instanceof class_5139)) {
         return super.method_20426(var1);
      } else {
         class_5139 var4 = (class_5139)var1;
         return this.field_26489 == var4.field_26489 ? false : this.field_26489 == class_1849.field_9387 || var4.field_26489 == class_1849.field_9387;
      }
   }

   public static int method_23552(LivingEntity var0, int var1) {
      int var4 = class_2931.method_13399(class_3668.field_17878, var0);
      if (var4 > 0) {
         var1 -= class_9299.method_42848((float)var1 * (float)var4 * 0.15F);
      }

      return var1;
   }

   public static double method_23553(LivingEntity var0, double var1) {
      int var5 = class_2931.method_13399(class_3668.field_17880, var0);
      if (var5 > 0) {
         var1 -= (double)class_9299.method_42847(var1 * (double)((float)var5 * 0.15F));
      }

      return var1;
   }
}
