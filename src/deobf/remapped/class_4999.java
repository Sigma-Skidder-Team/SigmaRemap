package remapped;

public class class_4999 {
   private final class_1730 field_25865;
   private final int field_25866;

   public class_4999(class_1730 var1, int var2) {
      this.field_25865 = var1;
      this.field_25866 = var2;
   }

   public class_1730 method_23013() {
      return this.field_25865;
   }

   public int method_23012() {
      return this.field_25866;
   }

   @Override
   public String toString() {
      return "Packet{state=" + this.field_25865 + ", packetId=" + this.field_25866 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_4999 var4 = (class_4999)var1;
         return this.field_25866 == var4.field_25866 && this.field_25865 == var4.field_25865;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_25865 == null ? 0 : this.field_25865.hashCode();
      return 31 * var3 + this.field_25866;
   }
}
