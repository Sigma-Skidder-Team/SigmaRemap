package mapped;

public class Class8390 {
   private static String[] field35974;
   private final int[][] field35975;
   private final int field35976;
   private final int field35977;
   private final int field35978;

   public Class8390(int var1, int var2, int var3) {
      this.field35976 = var1;
      this.field35977 = var2;
      this.field35978 = var3;
      this.field35975 = new int[var1][var2];
   }

   public void method29404(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < this.field35976 && var2 >= 0 && var2 < this.field35977) {
         this.field35975[var1][var2] = var3;
      }
   }

   public void method29405(int var1, int var2, int var3, int var4, int var5) {
      for (int var8 = var2; var8 <= var4; var8++) {
         for (int var9 = var1; var9 <= var3; var9++) {
            this.method29404(var9, var8, var5);
         }
      }
   }

   public int method29406(int var1, int var2) {
      return var1 >= 0 && var1 < this.field35976 && var2 >= 0 && var2 < this.field35977 ? this.field35975[var1][var2] : this.field35978;
   }

   public void method29407(int var1, int var2, int var3, int var4) {
      if (this.method29406(var1, var2) == var3) {
         this.method29404(var1, var2, var4);
      }
   }

   public boolean method29408(int var1, int var2, int var3) {
      return this.method29406(var1 - 1, var2) == var3
         || this.method29406(var1 + 1, var2) == var3
         || this.method29406(var1, var2 + 1) == var3
         || this.method29406(var1, var2 - 1) == var3;
   }

   // $VF: synthetic method
   public static int method29409(Class8390 var0) {
      return var0.field35976;
   }

   // $VF: synthetic method
   public static int method29410(Class8390 var0) {
      return var0.field35977;
   }
}
