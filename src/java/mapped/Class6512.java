package mapped;

import java.util.Arrays;
import java.util.logging.Level;


public class Class6512 implements Class6515, Class6513, Class6545, Class6511 {
   private static final int field28499 = 60;
   private static final int field28500 = 200;
   private static int field28501 = 523124044;
   private final int field28502;
   private final Class6538 field28503;
   private final int[] field28504;
   private final int[] field28505;
   private final float[] field28506;
   private final float[] field28507;
   private int field28508;
   private boolean field28509;
   private boolean field28510;
   private boolean field28511;
   private Class6540 field28512;
   private Class8288 field28513;
   private int[] field28514;
   private int[] field28515;
   private int field28516;
   private int field28517;
   private boolean field28518;
   private int field28519;
   private int field28520;
   private Class8333 field28521;

   public Class6512(int var1) {
      this.field28502 = var1;
      this.field28503 = new Class6538(var1);
      this.field28504 = new int[120];
      this.field28505 = new int[120];
      this.field28506 = new float[var1];
      this.field28507 = new float[120];
   }

   public void method19714(Class9189 var1, boolean var2, Class6516 var3) throws AACException {
      if (var3.method19752() && this.field28521 == null) {
         this.field28521 = new Class8333();
      }

      boolean var6 = var3.method19744().method8218();
      this.field28508 = var1.method34397(8);
      if (!var2) {
         this.field28503.method19864(var1, var3, var2);
      }

      this.method19715(var1, var3.method19753());
      this.method19717(var1);
      this.field28509 = var1.method34399();
      if (this.field28509) {
         if (this.field28503.method19874()) {
            throw new AACException("pulse data not allowed for short frames");
         }

         field28529.log(Level.FINE, "PULSE");
         this.method19716(var1);
      }

      this.field28510 = var1.method34399();
      if (this.field28510 && !var6) {
         if (this.field28512 == null) {
            this.field28512 = new Class6540();
         }

         this.field28512.method19884(var1, this.field28503);
      }

      this.field28511 = var1.method34399();
      if (this.field28511) {
         if (this.field28513 == null) {
            this.field28513 = new Class8288(this.field28502);
         }

         field28529.log(Level.FINE, "GAIN");
         this.field28513.method28976(var1, this.field28503.method19873());
      }

      if (!var3.method19754()) {
         this.method19718(var1);
      } else {
         int var7 = var3.method19733() != Class188.field707 ? 12288 : 6144;
         this.field28519 = Math.max(var1.method34397(14), var7);
         this.field28520 = Math.max(var1.method34397(6), 49);
      }
   }

   public void method19715(Class9189 var1, boolean var2) throws AACException {
      Arrays.fill(this.field28504, 0);
      Arrays.fill(this.field28505, 0);
      int var5 = !this.field28503.method19874() ? 5 : 3;
      int var6 = (1 << var5) - 1;
      int var7 = this.field28503.method19871();
      int var8 = this.field28503.method19866();
      int var9 = 0;

      for (int var10 = 0; var10 < var7; var10++) {
         int var11 = 0;

         while (var11 < var8) {
            int var12 = var11;
            int var13 = var1.method34397(4);
            if (var13 == 12) {
               throw new AACException("invalid huffman codebook: 12");
            }

            int var14;
            while ((var14 = var1.method34397(var5)) == var6) {
               var12 += var14;
            }

            var12 += var14;
            if (var12 > var8) {
               throw new AACException("too many bands: " + var12 + ", allowed: " + var8);
            }

            while (var11 < var12) {
               this.field28504[var9] = var13;
               this.field28505[var9++] = var12;
               var11++;
            }
         }
      }
   }

   private void method19716(Class9189 var1) throws AACException {
      this.field28516 = var1.method34397(2) + 1;
      this.field28517 = var1.method34397(6);
      if (this.field28517 >= this.field28503.method19867()) {
         throw new AACException("pulse SWB out of range: " + this.field28517 + " > " + this.field28503.method19867());
      } else {
         if (this.field28514 == null || this.field28516 != this.field28514.length) {
            this.field28514 = new int[this.field28516];
            this.field28515 = new int[this.field28516];
         }

         this.field28514[0] = this.field28503.method19868()[this.field28517];
         this.field28514[0] = this.field28514[0] + var1.method34397(5);
         this.field28515[0] = var1.method34397(4);

         for (int var4 = 1; var4 < this.field28516; var4++) {
            this.field28514[var4] = var1.method34397(5) + this.field28514[var4 - 1];
            if (this.field28514[var4] > 1023) {
               throw new AACException("pulse offset out of range: " + this.field28514[0]);
            }

            this.field28515[var4] = var1.method34397(4);
         }
      }
   }

   public void method19717(Class9189 var1) throws AACException {
      int var4 = this.field28503.method19871();
      int var5 = this.field28503.method19866();
      int[] var6 = new int[]{this.field28508, this.field28508 - 90, 0};
      boolean var7 = true;
      int var8 = 0;

      for (int var9 = 0; var9 < var4; var9++) {
         int var10 = 0;

         while (var10 < var5) {
            int var11 = this.field28505[var8];
            switch (this.field28504[var8]) {
               case 0:
                  while (var10 < var11) {
                     this.field28507[var8] = 0.0F;
                     var10++;
                     var8++;
                  }
                  break;
               case 13:
                  while (var10 < var11) {
                     if (var7) {
                        var6[1] += var1.method34397(9) - 256;
                        var7 = false;
                     } else {
                        var6[1] += Class8253.method28777(var1) - 60;
                     }

                     int var13 = Math.min(Math.max(var6[1], -100), 155);
                     this.field28507[var8] = -field28905[var13 + 200];
                     var10++;
                     var8++;
                  }
                  break;
               case 14:
               case 15:
                  while (var10 < var11) {
                     var6[2] += Class8253.method28777(var1) - 60;
                     int var12 = Math.min(Math.max(var6[2], -155), 100);
                     this.field28507[var8] = field28905[-var12 + 200];
                     var10++;
                     var8++;
                  }
                  break;
               default:
                  while (var10 < var11) {
                     var6[0] += Class8253.method28777(var1) - 60;
                     if (var6[0] > 255) {
                        throw new AACException("scalefactor out of range: " + var6[0]);
                     }

                     this.field28507[var8] = field28905[var6[0] - 100 + 200];
                     var10++;
                     var8++;
                  }
            }
         }
      }
   }

   private void method19718(Class9189 var1) throws AACException {
      Arrays.fill(this.field28506, 0.0F);
      int var4 = this.field28503.method19866();
      int var5 = this.field28503.method19871();
      int[] var6 = this.field28503.method19868();
      int[] var7 = new int[4];
      int var8 = 0;
      int var9 = 0;

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = this.field28503.method19872(var10);

         for (int var12 = 0; var12 < var4; var9++) {
            int var13 = this.field28504[var9];
            int var14 = var8 + var6[var12];
            int var15 = var6[var12 + 1] - var6[var12];
            if (var13 != 0 && var13 != 15 && var13 != 14) {
               if (var13 != 13) {
                  for (int var23 = 0; var23 < var11; var14 += 128) {
                     int var20 = var13 < 5 ? 4 : 2;

                     for (int var25 = 0; var25 < var15; var25 += var20) {
                        Class8253.method28778(var1, var13, var7, 0);

                        for (int var21 = 0; var21 < var20; var21++) {
                           this.field28506[var14 + var25 + var21] = var7[var21] <= 0 ? -field28498[-var7[var21]] : field28498[var7[var21]];
                           this.field28506[var14 + var25 + var21] = this.field28506[var14 + var25 + var21] * this.field28507[var9];
                        }
                     }

                     var23++;
                  }
               } else {
                  for (int var22 = 0; var22 < var11; var14 += 128) {
                     float var17 = 0.0F;

                     for (int var18 = 0; var18 < var15; var18++) {
                        field28501 *= 1015568748;
                        this.field28506[var14 + var18] = (float)field28501;
                        var17 += this.field28506[var14 + var18] * this.field28506[var14 + var18];
                     }

                     float var19 = (float)((double)this.field28507[var9] / Math.sqrt((double)var17));

                     for (int var24 = 0; var24 < var15; var24++) {
                        this.field28506[var14 + var24] = this.field28506[var14 + var24] * var19;
                     }

                     var22++;
                  }
               }
            } else {
               for (int var16 = 0; var16 < var11; var14 += 128) {
                  Arrays.fill(this.field28506, var14, var14 + var15, 0.0F);
                  var16++;
               }
            }

            var12++;
         }

         var8 += var11 << 7;
      }
   }

   public float[] method19719() throws AACException {
      return this.field28506;
   }

   public Class6538 method19720() {
      return this.field28503;
   }

   public int[] method19721() {
      return this.field28505;
   }

   public int[] method19722() {
      return this.field28504;
   }

   public float[] method19723() {
      return this.field28507;
   }

   public boolean method19724() {
      return this.field28510;
   }

   public Class6540 method19725() {
      return this.field28512;
   }

   public int method19726() {
      return this.field28508;
   }

   public boolean method19727() {
      return this.field28518;
   }

   public int method19728() {
      return this.field28520;
   }

   public int method19729() {
      return this.field28519;
   }

   public boolean method19730() {
      return this.field28511;
   }

   public Class8288 method19731() {
      return this.field28513;
   }
}
