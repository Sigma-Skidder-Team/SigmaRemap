package remapped;

public class class_8697 {
   private static String[] field_44596;
   private int field_44597;
   private int field_44598;
   private int field_44595;
   private int field_44594;

   public class_8697(int var1, int var2, int var3, int var4) {
      this.field_44597 = var1;
      this.field_44598 = var2;
      this.field_44595 = var3;
      this.field_44594 = var4;
   }

   public int method_39928() {
      return this.field_44597;
   }

   public int method_39924() {
      return this.field_44598;
   }

   public int method_39926() {
      return this.field_44595;
   }

   public int method_39927() {
      return this.field_44594;
   }

   public boolean method_39929(int var1, int var2) {
      return var1 >= this.field_44597 && var1 <= this.field_44597 + this.field_44595 && var2 >= this.field_44598 && var2 <= this.field_44598 + this.field_44594;
   }
}
