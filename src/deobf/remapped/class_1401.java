package remapped;

public class class_1401 {
   private int field_7623;
   private int field_7622;
   private final int field_7621;

   public class_1401(int var1, int var2) {
      this.field_7623 = var1;
      this.field_7622 = var2;
      this.field_7621 = var1 + 37 * var2;
   }

   public static class_1401 method_6476(int var0, int var1) {
      return new class_1401(var0, var1);
   }

   public int method_6475() {
      return this.field_7623;
   }

   public int method_6478() {
      return this.field_7622;
   }

   @Override
   public int hashCode() {
      return this.field_7621;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (!(var1 instanceof class_1401)) {
            return false;
         } else {
            class_1401 var4 = (class_1401)var1;
            return this.field_7623 == var4.field_7623 && this.field_7622 == var4.field_7622;
         }
      } else {
         return true;
      }
   }

   @Override
   public String toString() {
      return "(" + this.field_7623 + ", " + this.field_7622 + ")";
   }
}
