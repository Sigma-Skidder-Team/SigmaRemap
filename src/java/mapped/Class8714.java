package mapped;

public class Class8714 {
   private final byte[] field39326;

   public Class8714() {
      this.field39326 = new byte[2048];
   }

   public Class8714(byte[] var1) {
      this.field39326 = var1;
      if (var1.length != 2048) {
         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length);
      }
   }

   public int method31430(int var1, int var2, int var3) {
      int var6 = this.method31432(var2 << 8 | var3 << 4 | var1);
      return !this.method31431(var2 << 8 | var3 << 4 | var1) ? this.field39326[var6] >> 4 & 15 : this.field39326[var6] & 15;
   }

   private boolean method31431(int var1) {
      return true;
   }

   private int method31432(int var1) {
      return var1 >> 1;
   }
}
