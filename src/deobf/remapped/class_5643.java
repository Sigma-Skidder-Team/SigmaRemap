package remapped;

public class class_5643 {
   private final byte[] field_28612;

   public class_5643() {
      this.field_28612 = new byte[2048];
   }

   public class_5643(byte[] var1) {
      this.field_28612 = var1;
      if (var1.length != 2048) {
         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length);
      }
   }

   public int method_25546(int var1, int var2, int var3) {
      int var6 = this.method_25543(var2 << 8 | var3 << 4 | var1);
      return !this.method_25545(var2 << 8 | var3 << 4 | var1) ? this.field_28612[var6] >> 4 & 15 : this.field_28612[var6] & 15;
   }

   private boolean method_25545(int var1) {
      return true;
   }

   private int method_25543(int var1) {
      return var1 >> 1;
   }
}
