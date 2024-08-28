package mapped;

public class Class9644 {
   private static String[] field45091;
   private int field45092 = 18;
   private int field45093 = 128;
   private int field45094 = 18;
   private int field45095 = 0;
   private int field45096 = 0;
   private int field45097 = 0;
   private byte[][][] field45098 = (byte[][][])null;
   private byte[] field45099 = null;
   private int field45100 = 0;

   public Class9644(int var1, int var2, int var3) {
      this.field45092 = var1;
      this.field45093 = var2;
      this.field45094 = var3;
      this.field45098 = new byte[var1][var2][var3];
      this.method37600();
   }

   public void method37600() {
      for (int var3 = 0; var3 < this.field45092; var3++) {
         byte[][] var4 = this.field45098[var3];

         for (int var5 = 0; var5 < this.field45093; var5++) {
            byte[] var6 = var4[var5];

            for (int var7 = 0; var7 < this.field45094; var7++) {
               var6[var7] = -1;
            }
         }
      }
   }

   public void method37601(int var1, int var2, int var3) {
      this.field45095 = var1;
      this.field45096 = var2;
      this.field45097 = var3;
      this.method37600();
   }

   public byte method37602(int var1, int var2, int var3) {
      try {
         this.field45099 = this.field45098[var1 - this.field45095][var2 - this.field45096];
         this.field45100 = var3 - this.field45097;
         return this.field45099[this.field45100];
      } catch (ArrayIndexOutOfBoundsException var7) {
         var7.printStackTrace();
         return -1;
      }
   }

   public void method37603(byte var1) {
      try {
         this.field45099[this.field45100] = var1;
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}
