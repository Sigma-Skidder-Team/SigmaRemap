package remapped;

public class class_2556 {
   private int field_12646;
   private int field_12643;
   private int field_12645;
   private String field_12647;

   public class_2556(int var1, int var2) {
      this(var1, var2, 0);
   }

   public class_2556(int var1, int var2, int var3) {
      this(var1, var2, var3, (String)null);
   }

   public class_2556(int var1, int var2, int var3, String var4) {
      this.field_12646 = var1;
      this.field_12643 = var2;
      this.field_12645 = var3;
      this.field_12647 = var4;
   }

   public int method_11606() {
      return this.field_12646;
   }

   public int method_11605() {
      return this.field_12643;
   }

   public int method_11604() {
      return this.field_12645;
   }

   public int method_11608() {
      if (this.field_12643 <= 9) {
         return this.field_12645 <= 9 ? this.field_12646 * 100 + this.field_12643 * 10 + this.field_12645 : this.field_12646 * 100 + this.field_12643 * 10 + 9;
      } else {
         return this.field_12646 * 100 + this.field_12643;
      }
   }

   @Override
   public String toString() {
      return this.field_12647 != null
         ? "" + this.field_12646 + "." + this.field_12643 + "." + this.field_12645 + this.field_12647
         : "" + this.field_12646 + "." + this.field_12643 + "." + this.field_12645;
   }
}
