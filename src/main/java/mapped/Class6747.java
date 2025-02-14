package mapped;

public class Class6747 extends Class6748 {
   private static String[] field29451;
   private short[] field29452 = new short[2304];
   private int[] field29453 = new int[2];
   private int field29454;
   private int field29455;

   public Class6747(int var1, int var2) {
      this.field29454 = var2;
      this.field29455 = var1;

      for (int var5 = 0; var5 < var2; var5++) {
         this.field29453[var5] = (short)var5;
      }
   }

   public int method20561() {
      return this.field29454;
   }

   public int method20562() {
      return this.field29455;
   }

   public short[] method20563() {
      return this.field29452;
   }

   public int method20564() {
      return this.field29453[0];
   }

   @Override
   public void method20565(int var1, short var2) {
      this.field29452[this.field29453[var1]] = var2;
      this.field29453[var1] = this.field29453[var1] + this.field29454;
   }

   @Override
   public void method20566(int var1, float[] var2) {
      int var5 = this.field29453[var1];

      for (int var6 = 0; var6 < 32; var5 += this.field29454) {
         float var7 = var2[var6++];
         var7 = !(var7 > 32767.0F) ? (!(var7 < -32767.0F) ? var7 : -32767.0F) : 32767.0F;
         short var8 = (short)((int)var7);
         this.field29452[var5] = var8;
      }

      this.field29453[var1] = var5;
   }

   @Override
   public void method20567(int var1) {
   }

   @Override
   public void method20568() {
   }

   @Override
   public void method20569() {
      for (int var3 = 0; var3 < this.field29454; var3++) {
         this.field29453[var3] = (short)var3;
      }
   }

   @Override
   public void method20570() {
   }
}
