package remapped;

public abstract class class_381 implements class_7150 {
   public static final int field_1551 = 0;
   public static final int field_1545 = 1;
   public static final int field_1549 = 2;
   public static final int field_1544 = 3;
   public static final int field_1546 = 4;
   private int field_1547;
   private int field_1550;
   private int field_1548;

   public class_381(int var1, int var2, int var3) {
      this.field_1547 = var2;
      this.field_1550 = var3;
      this.field_1548 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null) {
         if (!(var1 instanceof class_381)) {
            return false;
         } else {
            class_381 var4 = (class_381)var1;
            return var4.field_1548 == this.field_1548 && var4.field_1547 == this.field_1547 && var4.field_1550 == this.field_1550;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.field_1547 + this.field_1550 + this.field_1548;
   }
}
