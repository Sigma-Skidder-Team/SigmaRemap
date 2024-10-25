package mapped;



public class Class6518 implements Class6515, Class6519, Class6520 {
   private static String[] field28575;
   private final float[][] field28576;
   private final float[][] field28577;
   private final int field28578;
   private final int field28579;
   private final int field28580;
   private final int field28581;
   private final Class8242 field28582;
   private final Class8242 field28583;
   private final float[] field28584;
   private final float[][] field28585;

   public Class6518(boolean var1, int var2) throws AACException {
      if (!var1) {
         this.field28578 = 1024;
         this.field28579 = 128;
         this.field28576 = new float[][]{field28586, field28590};
         this.field28577 = new float[][]{field28587, field28591};
      } else {
         this.field28578 = 960;
         this.field28579 = 120;
         this.field28576 = new float[][]{field28588, field28592};
         this.field28577 = new float[][]{field28589, field28593};
      }

      this.field28580 = (this.field28578 - this.field28579) / 2;
      this.field28581 = this.field28579 / 2;
      this.field28582 = new Class8242(this.field28579 * 2);
      this.field28583 = new Class8242(this.field28578 * 2);
      this.field28585 = new float[var2][this.field28578];
      this.field28584 = new float[2 * this.field28578];
   }

   public void method19762(Class1973 var1, int var2, int var3, float[] var4, float[] var5, int var6) {
      float[] var9 = this.field28585[var6];
      switch (Class7455.field32069[var1.ordinal()]) {
         case 1:
            this.field28583.method28739(var4, 0, this.field28584, 0);

            for (int var23 = 0; var23 < this.field28578; var23++) {
               var5[var23] = var9[var23] + this.field28584[var23] * this.field28576[var3][var23];
            }

            for (int var24 = 0; var24 < this.field28578; var24++) {
               var9[var24] = this.field28584[this.field28578 + var24] * this.field28576[var2][this.field28578 - 1 - var24];
            }
            break;
         case 2:
            this.field28583.method28739(var4, 0, this.field28584, 0);

            for (int var19 = 0; var19 < this.field28578; var19++) {
               var5[var19] = var9[var19] + this.field28584[var19] * this.field28576[var3][var19];
            }

            for (int var20 = 0; var20 < this.field28580; var20++) {
               var9[var20] = this.field28584[this.field28578 + var20];
            }

            for (int var21 = 0; var21 < this.field28579; var21++) {
               var9[this.field28580 + var21] = this.field28584[this.field28578 + this.field28580 + var21] * this.field28577[var2][this.field28579 - var21 - 1];
            }

            for (int var22 = 0; var22 < this.field28580; var22++) {
               var9[this.field28580 + this.field28579 + var22] = 0.0F;
            }
            break;
         case 3:
            for (int var14 = 0; var14 < 8; var14++) {
               this.field28582.method28739(var4, var14 * this.field28579, this.field28584, 2 * var14 * this.field28579);
            }

            for (int var15 = 0; var15 < this.field28580; var15++) {
               var5[var15] = var9[var15];
            }

            for (int var16 = 0; var16 < this.field28579; var16++) {
               var5[this.field28580 + var16] = var9[this.field28580 + var16] + this.field28584[var16] * this.field28577[var3][var16];
               var5[this.field28580 + 1 * this.field28579 + var16] = var9[this.field28580 + this.field28579 * 1 + var16]
                  + this.field28584[this.field28579 * 1 + var16] * this.field28577[var2][this.field28579 - 1 - var16]
                  + this.field28584[this.field28579 * 2 + var16] * this.field28577[var2][var16];
               var5[this.field28580 + 2 * this.field28579 + var16] = var9[this.field28580 + this.field28579 * 2 + var16]
                  + this.field28584[this.field28579 * 3 + var16] * this.field28577[var2][this.field28579 - 1 - var16]
                  + this.field28584[this.field28579 * 4 + var16] * this.field28577[var2][var16];
               var5[this.field28580 + 3 * this.field28579 + var16] = var9[this.field28580 + this.field28579 * 3 + var16]
                  + this.field28584[this.field28579 * 5 + var16] * this.field28577[var2][this.field28579 - 1 - var16]
                  + this.field28584[this.field28579 * 6 + var16] * this.field28577[var2][var16];
               if (var16 < this.field28581) {
                  var5[this.field28580 + 4 * this.field28579 + var16] = var9[this.field28580 + this.field28579 * 4 + var16]
                     + this.field28584[this.field28579 * 7 + var16] * this.field28577[var2][this.field28579 - 1 - var16]
                     + this.field28584[this.field28579 * 8 + var16] * this.field28577[var2][var16];
               }
            }

            for (int var17 = 0; var17 < this.field28579; var17++) {
               if (var17 >= this.field28581) {
                  var9[this.field28580 + 4 * this.field28579 + var17 - this.field28578] = this.field28584[this.field28579 * 7 + var17]
                        * this.field28577[var2][this.field28579 - 1 - var17]
                     + this.field28584[this.field28579 * 8 + var17] * this.field28577[var2][var17];
               }

               var9[this.field28580 + 5 * this.field28579 + var17 - this.field28578] = this.field28584[this.field28579 * 9 + var17]
                     * this.field28577[var2][this.field28579 - 1 - var17]
                  + this.field28584[this.field28579 * 10 + var17] * this.field28577[var2][var17];
               var9[this.field28580 + 6 * this.field28579 + var17 - this.field28578] = this.field28584[this.field28579 * 11 + var17]
                     * this.field28577[var2][this.field28579 - 1 - var17]
                  + this.field28584[this.field28579 * 12 + var17] * this.field28577[var2][var17];
               var9[this.field28580 + 7 * this.field28579 + var17 - this.field28578] = this.field28584[this.field28579 * 13 + var17]
                     * this.field28577[var2][this.field28579 - 1 - var17]
                  + this.field28584[this.field28579 * 14 + var17] * this.field28577[var2][var17];
               var9[this.field28580 + 8 * this.field28579 + var17 - this.field28578] = this.field28584[this.field28579 * 15 + var17]
                  * this.field28577[var2][this.field28579 - 1 - var17];
            }

            for (int var18 = 0; var18 < this.field28580; var18++) {
               var9[this.field28580 + this.field28579 + var18] = 0.0F;
            }
            break;
         case 4:
            this.field28583.method28739(var4, 0, this.field28584, 0);

            for (int var10 = 0; var10 < this.field28580; var10++) {
               var5[var10] = var9[var10];
            }

            for (int var11 = 0; var11 < this.field28579; var11++) {
               var5[this.field28580 + var11] = var9[this.field28580 + var11] + this.field28584[this.field28580 + var11] * this.field28577[var3][var11];
            }

            for (int var12 = 0; var12 < this.field28580; var12++) {
               var5[this.field28580 + this.field28579 + var12] = var9[this.field28580 + this.field28579 + var12]
                  + this.field28584[this.field28580 + this.field28579 + var12];
            }

            for (int var13 = 0; var13 < this.field28578; var13++) {
               var9[var13] = this.field28584[this.field28578 + var13] * this.field28576[var2][this.field28578 - 1 - var13];
            }
      }
   }

   public void method19763(Class1973 var1, int var2, int var3, float[] var4, float[] var5) {
      switch (Class7455.field32069[var1.ordinal()]) {
         case 1:
            for (int var16 = this.field28578 - 1; var16 >= 0; var16--) {
               this.field28584[var16] = var4[var16] * this.field28576[var3][var16];
               this.field28584[var16 + this.field28578] = var4[var16 + this.field28578] * this.field28576[var2][this.field28578 - 1 - var16];
            }
            break;
         case 2:
            for (int var12 = 0; var12 < this.field28578; var12++) {
               this.field28584[var12] = var4[var12] * this.field28576[var3][var12];
            }

            for (int var13 = 0; var13 < this.field28580; var13++) {
               this.field28584[var13 + this.field28578] = var4[var13 + this.field28578];
            }

            for (int var14 = 0; var14 < this.field28579; var14++) {
               this.field28584[var14 + this.field28578 + this.field28580] = var4[var14 + this.field28578 + this.field28580]
                  * this.field28577[var2][this.field28579 - 1 - var14];
            }

            for (int var15 = 0; var15 < this.field28580; var15++) {
               this.field28584[var15 + this.field28578 + this.field28580 + this.field28579] = 0.0F;
            }
         case 3:
         default:
            break;
         case 4:
            for (int var8 = 0; var8 < this.field28580; var8++) {
               this.field28584[var8] = 0.0F;
            }

            for (int var9 = 0; var9 < this.field28579; var9++) {
               this.field28584[var9 + this.field28580] = var4[var9 + this.field28580] * this.field28577[var3][var9];
            }

            for (int var10 = 0; var10 < this.field28580; var10++) {
               this.field28584[var10 + this.field28580 + this.field28579] = var4[var10 + this.field28580 + this.field28579];
            }

            for (int var11 = 0; var11 < this.field28578; var11++) {
               this.field28584[var11 + this.field28578] = var4[var11 + this.field28578] * this.field28576[var2][this.field28578 - 1 - var11];
            }
      }

      this.field28583.method28740(this.field28584, var5);
   }

   public float[] method19764(int var1) {
      return this.field28585[var1];
   }
}
