package remapped;

public class class_9777 {
   private boolean field_49633;
   private int field_49635;

   public class_9777() {
      this(false, 1029);
   }

   public class_9777(boolean var1) {
      this(var1, 1029);
   }

   public class_9777(boolean var1, int var2) {
      this.field_49633 = var1;
      this.field_49635 = var2;
   }

   public void method_45128(boolean var1, int var2) {
      this.field_49633 = var1;
      this.field_49635 = var2;
   }

   public void method_45127(class_9777 var1) {
      this.field_49633 = var1.field_49633;
      this.field_49635 = var1.field_49635;
   }

   public void method_45134(int var1) {
      this.field_49635 = var1;
   }

   public void method_45131(boolean var1) {
      this.field_49633 = var1;
   }

   public void method_45130() {
      this.field_49633 = true;
   }

   public void method_45132() {
      this.field_49633 = false;
   }

   public boolean method_45133() {
      return this.field_49633;
   }

   public int method_45129() {
      return this.field_49635;
   }

   @Override
   public String toString() {
      return "enabled: " + this.field_49633 + ", mode: " + this.field_49635;
   }
}
