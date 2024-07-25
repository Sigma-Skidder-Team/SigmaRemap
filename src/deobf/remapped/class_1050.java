package remapped;

public abstract class class_1050 implements class_3560 {
   public class_2049 field_5770;
   public final class_562 field_5772;
   public final Identifier field_5771;
   public float field_5766 = 1.0F;
   public float field_5773 = 1.0F;
   public double field_5761;
   public double field_5765;
   public double field_5762;
   public boolean field_5768;
   public int field_5764;
   public class_6656 field_5763 = class_6656.field_34440;
   public boolean field_5767;
   public boolean field_5769;

   public class_1050(class_8461 var1, class_562 var2) {
      this(var1.method_38928(), var2);
   }

   public class_1050(Identifier var1, class_562 var2) {
      this.field_5771 = var1;
      this.field_5772 = var2;
   }

   @Override
   public Identifier method_16556() {
      return this.field_5771;
   }

   @Override
   public class_7633 method_16553(class_3541 var1) {
      class_7633 var4 = var1.method_16334(this.field_5771);
      if (var4 != null) {
         this.field_5770 = var4.method_34587();
      } else {
         this.field_5770 = class_3541.field_17316;
      }

      return var4;
   }

   @Override
   public class_2049 method_16551() {
      return this.field_5770;
   }

   @Override
   public class_562 method_16549() {
      return this.field_5772;
   }

   @Override
   public boolean method_16552() {
      return this.field_5768;
   }

   @Override
   public int method_16555() {
      return this.field_5764;
   }

   @Override
   public float method_16562() {
      return this.field_5766 * this.field_5770.method_9584();
   }

   @Override
   public float method_16560() {
      return this.field_5773 * this.field_5770.method_9583();
   }

   @Override
   public double method_16548() {
      return this.field_5761;
   }

   @Override
   public double method_16557() {
      return this.field_5765;
   }

   @Override
   public double method_16561() {
      return this.field_5762;
   }

   @Override
   public class_6656 method_16559() {
      return this.field_5763;
   }

   @Override
   public boolean method_16550() {
      return this.field_5769;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.field_5771 + "]";
   }
}
