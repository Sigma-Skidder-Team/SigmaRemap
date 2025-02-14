package mapped;

public class SampleBuffer {
   private static String[] field35252;
   private int field35253;
   private int field35254;
   private int field35255;
   private double field35256;
   private double field35257;
   private double field35258;
   private byte[] field35259 = new byte[0];
   private boolean field35260;

   public SampleBuffer() {
      this.field35253 = 0;
      this.field35254 = 0;
      this.field35255 = 0;
      this.field35260 = true;
   }

   public byte[] getData() {
      return this.field35259;
   }

   public int method28524() {
      return this.field35253;
   }

   public int method28525() {
      return this.field35254;
   }

   public int method28526() {
      return this.field35255;
   }

   public double method28527() {
      return this.field35256;
   }

   public double method28528() {
      return this.field35257;
   }

   public double method28529() {
      return this.field35258;
   }

   public boolean method28530() {
      return this.field35260;
   }

   public void method28531(boolean var1) {
      if (var1 != this.field35260) {
         for (int var4 = 0; var4 < this.field35259.length; var4 += 2) {
            byte var5 = this.field35259[var4];
            this.field35259[var4] = this.field35259[var4 + 1];
            this.field35259[var4 + 1] = var5;
         }

         this.field35260 = var1;
      }
   }

   public void method28532(byte[] var1, int var2, int var3, int var4, int var5) {
      this.field35259 = var1;
      this.field35253 = var2;
      this.field35254 = var3;
      this.field35255 = var4;
      if (var2 != 0) {
         int var8 = var4 / 8;
         int var9 = var1.length / (var8 * var3);
         this.field35256 = (double)var9 / (double)var2;
         this.field35257 = (double)(var9 * var4 * var3) / this.field35256;
         this.field35258 = (double)var5 / this.field35256;
      } else {
         this.field35256 = 0.0;
         this.field35257 = 0.0;
         this.field35258 = 0.0;
      }
   }
}
