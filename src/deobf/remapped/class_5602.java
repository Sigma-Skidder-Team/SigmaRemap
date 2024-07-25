package remapped;

public class class_5602 extends class_3599 {
   private static String[] field_28410;
   private final class_4359 field_28412;
   private final double field_28411;
   private final int field_28413;
   private boolean field_28409;

   public class_5602(class_4359 var1, double var2, int var4) {
      this.field_28412 = var1;
      this.field_28411 = var2;
      this.field_28413 = var4;
   }

   @Override
   public boolean method_16795() {
      return !this.field_28412.world.method_29602()
         && this.field_28412.method_37285()
         && this.field_28412.method_37309() < (double)(this.field_28413 - 2);
   }

   @Override
   public boolean method_16799() {
      return this.method_16795() && !this.field_28409;
   }

   @Override
   public void method_16794() {
      if (this.field_28412.method_37309() < (double)(this.field_28413 - 1)
         && (this.field_28412.method_26927().method_5591() || this.field_28412.method_20223())) {
         class_1343 var3 = class_3425.method_15837(
            this.field_28412, 4, 8, new class_1343(this.field_28412.getPosX(), (double)(this.field_28413 - 1), this.field_28412.getPosZ())
         );
         if (var3 == null) {
            this.field_28409 = true;
            return;
         }

         this.field_28412.method_26927().method_5595(var3.field_7336, var3.field_7333, var3.field_7334, this.field_28411);
      }
   }

   @Override
   public void method_16796() {
      this.field_28412.method_20220(true);
      this.field_28409 = false;
   }

   @Override
   public void method_16793() {
      this.field_28412.method_20220(false);
   }
}
