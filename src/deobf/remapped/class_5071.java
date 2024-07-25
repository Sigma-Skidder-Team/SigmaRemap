package remapped;

public final class class_5071 {
   private static String[] field_26204;
   private final class_2522 field_26202;
   private final class_2522 field_26203;
   private final Direction field_26205;

   public class_5071(class_2522 var1, class_2522 var2, Direction var3) {
      this.field_26202 = var1;
      this.field_26203 = var2;
      this.field_26205 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_5071)) {
            return false;
         } else {
            class_5071 var4 = (class_5071)var1;
            return this.field_26202 == var4.field_26202 && this.field_26203 == var4.field_26203 && this.field_26205 == var4.field_26205;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_26202.hashCode();
      var3 = 31 * var3 + this.field_26203.hashCode();
      return 31 * var3 + this.field_26205.hashCode();
   }
}
