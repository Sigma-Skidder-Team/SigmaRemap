package remapped;

public final class class_879 {
   private static String[] field_4531;
   private class_2522 field_4529;
   private class_2522 field_4533;
   private Direction field_4530;
   private int field_4532;

   private class_879(class_2522 var1, class_2522 var2, Direction var3) {
      this.field_4529 = var1;
      this.field_4533 = var2;
      this.field_4530 = var3;
   }

   private void method_3784(class_2522 var1, class_2522 var2, Direction var3) {
      this.field_4529 = var1;
      this.field_4533 = var2;
      this.field_4530 = var3;
      this.field_4532 = 0;
   }

   public class_879 method_3785() {
      return new class_879(this.field_4529, this.field_4533, this.field_4530);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_879)) {
            return false;
         } else {
            class_879 var4 = (class_879)var1;
            return this.field_4529 == var4.field_4529 && this.field_4533 == var4.field_4533 && this.field_4530 == var4.field_4530;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      if (this.field_4532 == 0) {
         this.field_4532 = 31 * this.field_4532 + this.field_4529.hashCode();
         this.field_4532 = 31 * this.field_4532 + this.field_4533.hashCode();
         this.field_4532 = 31 * this.field_4532 + this.field_4530.hashCode();
      }

      return this.field_4532;
   }
}
