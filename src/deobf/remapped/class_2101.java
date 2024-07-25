package remapped;

public class class_2101 extends class_2833 {
   private static String[] field_10541;
   private final class_4359 field_10540;

   public class_2101(class_4359 var1) {
      super(var1);
      this.field_10540 = var1;
   }

   @Override
   public void method_12883() {
      class_5834 var3 = this.field_10540.method_17809();
      if (class_4359.method_20228(this.field_10540) && this.field_10540.method_37285()) {
         if (var3 != null && var3.method_37309() > this.field_10540.method_37309() || class_4359.method_20222(this.field_10540)) {
            this.field_10540.method_37215(this.field_10540.method_37098().method_6214(0.0, 0.002, 0.0));
         }

         if (this.field_13878 != class_1737.field_8946 || this.field_10540.method_26927().method_5591()) {
            this.field_10540.method_26461(0.0F);
            return;
         }

         double var4 = this.field_13884 - this.field_10540.method_37302();
         double var6 = this.field_13886 - this.field_10540.method_37309();
         double var8 = this.field_13880 - this.field_10540.method_37156();
         double var10 = (double)class_9299.method_42842(var4 * var4 + var6 * var6 + var8 * var8);
         var6 /= var10;
         float var12 = (float)(class_9299.method_42821(var8, var4) * 180.0F / (float)Math.PI) - 90.0F;
         this.field_10540.field_41701 = this.method_12882(this.field_10540.field_41701, var12, 90.0F);
         this.field_10540.field_29605 = this.field_10540.field_41701;
         float var13 = (float)(this.field_13885 * this.field_10540.method_26575(class_7331.field_37465));
         float var14 = class_9299.method_42795(0.125F, this.field_10540.method_26423(), var13);
         this.field_10540.method_26461(var14);
         this.field_10540
            .method_37215(this.field_10540.method_37098().method_6214((double)var14 * var4 * 0.005, (double)var14 * var6 * 0.1, (double)var14 * var8 * 0.005));
      } else {
         if (!this.field_10540.field_41726) {
            this.field_10540.method_37215(this.field_10540.method_37098().method_6214(0.0, -0.008, 0.0));
         }

         super.method_12883();
      }
   }
}
