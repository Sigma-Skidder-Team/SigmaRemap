package remapped;

public class class_9371 {
   private final int field_47913;
   private final short field_47916;
   private final int field_47914;

   public class_9371(int var1, short var2, int var3) {
      this.field_47913 = var1;
      this.field_47916 = var2;
      this.field_47914 = var3;
   }

   public class_9371(class_9371 var1) {
      this(var1.method_43340(), var1.method_43342(), var1.method_43343());
   }

   public class_9371 method_43341(class_2391 var1) {
      return new class_9371(this.field_47913 + var1.method_10896(), (short)(this.field_47916 + var1.method_10898()), this.field_47914 + var1.method_10899());
   }

   public int method_43340() {
      return this.field_47913;
   }

   public short method_43342() {
      return this.field_47916;
   }

   public int method_43343() {
      return this.field_47914;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_9371 var4 = (class_9371)var1;
            if (this.field_47913 != var4.field_47913) {
               return false;
            } else {
               return this.field_47916 == var4.field_47916 ? this.field_47914 == var4.field_47914 : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_47913;
      var3 = 31 * var3 + this.field_47916;
      return 31 * var3 + this.field_47914;
   }

   @Override
   public String toString() {
      return "Position{x=" + this.field_47913 + ", y=" + this.field_47916 + ", z=" + this.field_47914 + '}';
   }
}
