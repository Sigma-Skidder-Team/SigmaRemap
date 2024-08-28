package mapped;

public class Class9074 {
   private static String[] field41518;
   public final byte[] field41519;
   private final int field41520;
   private final int field41521;

   public Class9074(byte[] var1, int var2) {
      this.field41519 = var1;
      this.field41520 = var2;
      this.field41521 = var2 + 4;
   }

   public int method33815(int var1, int var2, int var3) {
      int var6 = var1 << this.field41521 | var3 << this.field41520 | var2;
      int var7 = var6 >> 1;
      int var8 = var6 & 1;
      return var8 != 0 ? this.field41519[var7] >> 4 & 15 : this.field41519[var7] & 15;
   }
}
