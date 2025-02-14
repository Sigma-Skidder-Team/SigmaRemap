package mapped;

public class Class9586 {
   private static String[] field44812;
   private int field44813 = 18;
   private int field44814 = 128;
   private int field44815 = 18;
   private int field44816 = 0;
   private int field44817 = 0;
   private int field44818 = 0;
   private int[][][] field44819 = (int[][][])null;
   private int[] field44820 = null;
   private int field44821 = 0;

   public Class9586(int var1, int var2, int var3) {
      this.field44813 = var1;
      this.field44814 = var2;
      this.field44815 = var3;
      this.field44819 = new int[var1][var2][var3];
      this.method37218();
   }

   public void method37218() {
      for (int var3 = 0; var3 < this.field44813; var3++) {
         int[][] var4 = this.field44819[var3];

         for (int var5 = 0; var5 < this.field44814; var5++) {
            int[] var6 = var4[var5];

            for (int var7 = 0; var7 < this.field44815; var7++) {
               var6[var7] = -1;
            }
         }
      }
   }

   public void method37219(int var1, int var2, int var3) {
      this.field44816 = var1;
      this.field44817 = var2;
      this.field44818 = var3;
      this.method37218();
   }

   public int method37220(int var1, int var2, int var3) {
      try {
         this.field44820 = this.field44819[var1 - this.field44816][var2 - this.field44817];
         this.field44821 = var3 - this.field44818;
         return this.field44820[this.field44821];
      } catch (ArrayIndexOutOfBoundsException var7) {
         var7.printStackTrace();
         return -1;
      }
   }

   public void method37221(int var1) {
      try {
         this.field44820[this.field44821] = var1;
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}
