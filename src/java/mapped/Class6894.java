package mapped;

public final class Class6894 {
   private static String[] field29871;
   private static final int field29872 = 32768;
   private static final int field29873 = 32767;
   private int field29874;
   private int field29875;
   private int field29876;
   private final int[] field29877 = new int[32768];
   private int field29878;

   public Class6894() {
      this.field29874 = 0;
      this.field29875 = 0;
      this.field29876 = 0;
   }

   public int method21057() {
      return this.field29875;
   }

   public int method21058(int var1) {
      this.field29875 += var1;
      int var4 = 0;
      int var5 = this.field29876;
      if (var5 + var1 >= 32768) {
         while (var1-- > 0) {
            var4 <<= 1;
            var4 |= this.field29877[var5] == 0 ? 0 : 1;
            var5 = var5 + 1 & 32767;
         }
      } else {
         while (var1-- > 0) {
            var4 <<= 1;
            var4 |= this.field29877[var5++] == 0 ? 0 : 1;
         }
      }

      this.field29876 = var5;
      return var4;
   }

   public int method21059() {
      this.field29875++;
      int var3 = this.field29877[this.field29876];
      this.field29876 = this.field29876 + 1 & 32767;
      return var3;
   }

   public void method21060(int var1) {
      int var4 = this.field29874;
      this.field29877[var4++] = var1 & 128;
      this.field29877[var4++] = var1 & 64;
      this.field29877[var4++] = var1 & 32;
      this.field29877[var4++] = var1 & 16;
      this.field29877[var4++] = var1 & 8;
      this.field29877[var4++] = var1 & 4;
      this.field29877[var4++] = var1 & 2;
      this.field29877[var4++] = var1 & 1;
      if (var4 != 32768) {
         this.field29874 = var4;
      } else {
         this.field29874 = 0;
      }
   }

   public void method21061(int var1) {
      this.field29875 -= var1;
      this.field29876 -= var1;
      if (this.field29876 < 0) {
         this.field29876 += 32768;
      }
   }

   public void method21062(int var1) {
      int var4 = var1 << 3;
      this.field29875 -= var4;
      this.field29876 -= var4;
      if (this.field29876 < 0) {
         this.field29876 += 32768;
      }
   }
}
