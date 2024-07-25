package remapped;

public class class_5584 {
   private int field_28360 = -1;
   private int field_28359 = 0;
   private class_2418<class_5584> field_28361 = new class_2418<class_5584>(this);

   public int method_25378() {
      return this.field_28360;
   }

   public int method_25376() {
      return this.field_28359;
   }

   public int method_25374() {
      return this.field_28360 + this.field_28359;
   }

   public void method_25373(int var1) {
      this.field_28360 = var1;
   }

   public void method_25371(int var1) {
      this.field_28359 = var1;
   }

   public class_2418<class_5584> method_25370() {
      return this.field_28361;
   }

   public class_5584 method_25372() {
      class_2418 var3 = this.field_28361.method_11034();
      return var3 != null ? (class_5584)var3.method_11037() : null;
   }

   public class_5584 method_25375() {
      class_2418 var3 = this.field_28361.method_11027();
      return var3 != null ? (class_5584)var3.method_11037() : null;
   }

   @Override
   public String toString() {
      return "" + this.field_28360 + "/" + this.field_28359 + "/" + (this.field_28360 + this.field_28359);
   }
}
