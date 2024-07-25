package remapped;

import java.io.IOException;

public class class_4609 implements Packet<class_1243> {
   private static String[] field_22420;
   public double field_22423;
   public double field_22424;
   public double field_22419;
   public float field_22421;
   public float field_22422;
   public boolean field_22416;
   public boolean field_22417;
   public boolean field_22418;

   public class_4609() {
   }

   public class_4609(boolean var1) {
      this.field_22416 = var1;
   }

   public void method_21370(class_1243 var1) {
      var1.method_5568(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22416 = var1.readUnsignedByte() != 0;
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(!this.field_22416 ? 0 : 1);
   }

   public double method_21364(double var1) {
      return !this.field_22417 ? var1 : this.field_22423;
   }

   public double method_21368(double var1) {
      return !this.field_22417 ? var1 : this.field_22424;
   }

   public double method_21367(double var1) {
      return !this.field_22417 ? var1 : this.field_22419;
   }

   public float method_21366(float var1) {
      return !this.field_22418 ? var1 : this.field_22421;
   }

   public float method_21369(float var1) {
      return !this.field_22418 ? var1 : this.field_22422;
   }

   public boolean method_21365() {
      return this.field_22416;
   }
}
