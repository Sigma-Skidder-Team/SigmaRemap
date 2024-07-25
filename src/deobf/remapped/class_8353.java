package remapped;

public final class class_8353 {
   private final Identifier field_42773;
   private int field_42774;
   private int field_42772;
   private final class_4016 field_42770;
   private double field_42769 = 1.0;

   public class_8353(Identifier var1, int var2, int var3, class_4016 var4) {
      this.field_42773 = var1;
      this.field_42774 = var2;
      this.field_42772 = var3;
      this.field_42770 = var4;
   }

   public Identifier method_38459() {
      return this.field_42773;
   }

   public int method_38453() {
      return this.field_42774;
   }

   public int method_38456() {
      return this.field_42772;
   }

   public void method_38463(int var1) {
      this.field_42774 = var1;
   }

   public void method_38458(int var1) {
      this.field_42772 = var1;
   }

   public class_4016 method_38457() {
      return this.field_42770;
   }

   public double method_38464() {
      return this.field_42769;
   }

   public void method_38454(double var1) {
      this.field_42769 = var1;
   }

   @Override
   public String toString() {
      return ""
         + this.field_42773
         + ", width: "
         + this.field_42774
         + ", height: "
         + this.field_42772
         + ", frames: "
         + this.field_42770.method_18507()
         + ", scale: "
         + this.field_42769;
   }
}
