package remapped;

public class class_6916 {
   private static String[] field_35544;
   public final byte[] field_35541;
   private final int field_35542;
   private final int field_35543;

   public class_6916(byte[] var1, int var2) {
      this.field_35541 = var1;
      this.field_35542 = var2;
      this.field_35543 = var2 + 4;
   }

   public int method_31671(int var1, int var2, int var3) {
      int var6 = var1 << this.field_35543 | var3 << this.field_35542 | var2;
      int var7 = var6 >> 1;
      int var8 = var6 & 1;
      return var8 != 0 ? this.field_35541[var7] >> 4 & 15 : this.field_35541[var7] & 15;
   }
}
