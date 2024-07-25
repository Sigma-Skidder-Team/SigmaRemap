package remapped;

public class class_4456 {
   private static String[] field_21711;
   private final int[][] field_21714;
   private final int field_21713;
   private final int field_21710;
   private final int field_21712;

   public class_4456(int var1, int var2, int var3) {
      this.field_21713 = var1;
      this.field_21710 = var2;
      this.field_21712 = var3;
      this.field_21714 = new int[var1][var2];
   }

   public void method_20658(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < this.field_21713 && var2 >= 0 && var2 < this.field_21710) {
         this.field_21714[var1][var2] = var3;
      }
   }

   public void method_20659(int var1, int var2, int var3, int var4, int var5) {
      for (int var8 = var2; var8 <= var4; var8++) {
         for (int var9 = var1; var9 <= var3; var9++) {
            this.method_20658(var9, var8, var5);
         }
      }
   }

   public int method_20665(int var1, int var2) {
      return var1 >= 0 && var1 < this.field_21713 && var2 >= 0 && var2 < this.field_21710 ? this.field_21714[var1][var2] : this.field_21712;
   }

   public void method_20661(int var1, int var2, int var3, int var4) {
      if (this.method_20665(var1, var2) == var3) {
         this.method_20658(var1, var2, var4);
      }
   }

   public boolean method_20663(int var1, int var2, int var3) {
      return this.method_20665(var1 - 1, var2) == var3
         || this.method_20665(var1 + 1, var2) == var3
         || this.method_20665(var1, var2 + 1) == var3
         || this.method_20665(var1, var2 - 1) == var3;
   }
}
