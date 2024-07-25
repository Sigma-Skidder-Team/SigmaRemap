package remapped;

import java.util.Arrays;
import java.util.logging.Level;
import net.sourceforge.jaad.aac.AACException;

public class class_9143 implements class_3471, class_2019, class_3140, class_707 {
   private static final int field_46757 = 60;
   private static final int field_46759 = 200;
   private static int field_46750 = 523124044;
   private final int field_46745;
   private final class_2568 field_46753;
   private final int[] field_46746;
   private final int[] field_46748;
   private final float[] field_46762;
   private final float[] field_46751;
   private int field_46763;
   private boolean field_46755;
   private boolean field_46764;
   private boolean field_46747;
   private class_4867 field_46749;
   private class_4157 field_46754;
   private int[] field_46758;
   private int[] field_46761;
   private int field_46752;
   private int field_46760;
   private boolean field_46767;
   private int field_46765;
   private int field_46768;
   private class_4301 field_46756;

   public class_9143(int var1) {
      this.field_46745 = var1;
      this.field_46753 = new class_2568(var1);
      this.field_46746 = new int[120];
      this.field_46748 = new int[120];
      this.field_46762 = new float[var1];
      this.field_46751 = new float[120];
   }

   public void method_42062(class_7390 var1, boolean var2, class_6616 var3) throws AACException {
      if (var3.method_30406() && this.field_46756 == null) {
         this.field_46756 = new class_4301();
      }

      boolean var6 = var3.method_30415().method_38276();
      this.field_46763 = var1.method_33662(8);
      if (!var2) {
         this.field_46753.method_11657(var1, var3, var2);
      }

      this.method_42064(var1, var3.method_30407());
      this.method_42068(var1);
      this.field_46755 = var1.method_33660();
      if (this.field_46755) {
         if (this.field_46753.method_11676()) {
            throw new class_5060("pulse data not allowed for short frames");
         }

         field_17021.log(Level.FINE, "PULSE");
         this.method_42065(var1);
      }

      this.field_46764 = var1.method_33660();
      if (this.field_46764 && !var6) {
         if (this.field_46749 == null) {
            this.field_46749 = new class_4867();
         }

         this.field_46749.method_22370(var1, this.field_46753);
      }

      this.field_46747 = var1.method_33660();
      if (this.field_46747) {
         if (this.field_46754 == null) {
            this.field_46754 = new class_4157(this.field_46745);
         }

         field_17021.log(Level.FINE, "GAIN");
         this.field_46754.method_19282(var1, this.field_46753.method_11669());
      }

      if (!var3.method_30413()) {
         this.method_42076(var1);
      } else {
         int var7 = var3.method_30410() != class_6871.field_35385 ? 12288 : 6144;
         this.field_46765 = Math.max(var1.method_33662(14), var7);
         this.field_46768 = Math.max(var1.method_33662(6), 49);
      }
   }

   public void method_42064(class_7390 var1, boolean var2) throws AACException {
      Arrays.fill(this.field_46746, 0);
      Arrays.fill(this.field_46748, 0);
      int var5 = !this.field_46753.method_11676() ? 5 : 3;
      int var6 = (1 << var5) - 1;
      int var7 = this.field_46753.method_11670();
      int var8 = this.field_46753.method_11671();
      int var9 = 0;

      for (int var10 = 0; var10 < var7; var10++) {
         int var11 = 0;

         while (var11 < var8) {
            int var12 = var11;
            int var13 = var1.method_33662(4);
            if (var13 == 12) {
               throw new class_5060("invalid huffman codebook: 12");
            }

            int var14;
            while ((var14 = var1.method_33662(var5)) == var6) {
               var12 += var14;
            }

            var12 += var14;
            if (var12 > var8) {
               throw new class_5060("too many bands: " + var12 + ", allowed: " + var8);
            }

            while (var11 < var12) {
               this.field_46746[var9] = var13;
               this.field_46748[var9++] = var12;
               var11++;
            }
         }
      }
   }

   private void method_42065(class_7390 var1) throws AACException {
      this.field_46752 = var1.method_33662(2) + 1;
      this.field_46760 = var1.method_33662(6);
      if (this.field_46760 >= this.field_46753.method_11659()) {
         throw new class_5060("pulse SWB out of range: " + this.field_46760 + " > " + this.field_46753.method_11659());
      } else {
         if (this.field_46758 == null || this.field_46752 != this.field_46758.length) {
            this.field_46758 = new int[this.field_46752];
            this.field_46761 = new int[this.field_46752];
         }

         this.field_46758[0] = this.field_46753.method_11674()[this.field_46760];
         this.field_46758[0] = this.field_46758[0] + var1.method_33662(5);
         this.field_46761[0] = var1.method_33662(4);

         for (int var4 = 1; var4 < this.field_46752; var4++) {
            this.field_46758[var4] = var1.method_33662(5) + this.field_46758[var4 - 1];
            if (this.field_46758[var4] > 1023) {
               throw new class_5060("pulse offset out of range: " + this.field_46758[0]);
            }

            this.field_46761[var4] = var1.method_33662(4);
         }
      }
   }

   public void method_42068(class_7390 var1) throws AACException {
      int var4 = this.field_46753.method_11670();
      int var5 = this.field_46753.method_11671();
      int[] var6 = new int[]{this.field_46763, this.field_46763 - 90, 0};
      boolean var7 = true;
      int var8 = 0;

      for (int var9 = 0; var9 < var4; var9++) {
         int var10 = 0;

         while (var10 < var5) {
            int var11 = this.field_46748[var8];
            switch (this.field_46746[var8]) {
               case 0:
                  while (var10 < var11) {
                     this.field_46751[var8] = 0.0F;
                     var10++;
                     var8++;
                  }
                  break;
               case 13:
                  while (var10 < var11) {
                     if (var7) {
                        var6[1] += var1.method_33662(9) - 256;
                        var7 = false;
                     } else {
                        var6[1] += class_4883.method_22401(var1) - 60;
                     }

                     int var13 = Math.min(Math.max(var6[1], -100), 155);
                     this.field_46751[var8] = -field_15628[var13 + 200];
                     var10++;
                     var8++;
                  }
                  break;
               case 14:
               case 15:
                  while (var10 < var11) {
                     var6[2] += class_4883.method_22401(var1) - 60;
                     int var12 = Math.min(Math.max(var6[2], -155), 100);
                     this.field_46751[var8] = field_15628[-var12 + 200];
                     var10++;
                     var8++;
                  }
                  break;
               default:
                  while (var10 < var11) {
                     var6[0] += class_4883.method_22401(var1) - 60;
                     if (var6[0] > 255) {
                        throw new class_5060("scalefactor out of range: " + var6[0]);
                     }

                     this.field_46751[var8] = field_15628[var6[0] - 100 + 200];
                     var10++;
                     var8++;
                  }
            }
         }
      }
   }

   private void method_42076(class_7390 var1) throws AACException {
      Arrays.fill(this.field_46762, 0.0F);
      int var4 = this.field_46753.method_11671();
      int var5 = this.field_46753.method_11670();
      int[] var6 = this.field_46753.method_11674();
      int[] var7 = new int[4];
      int var8 = 0;
      int var9 = 0;

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = this.field_46753.method_11665(var10);

         for (int var12 = 0; var12 < var4; var9++) {
            int var13 = this.field_46746[var9];
            int var14 = var8 + var6[var12];
            int var15 = var6[var12 + 1] - var6[var12];
            if (var13 != 0 && var13 != 15 && var13 != 14) {
               if (var13 != 13) {
                  for (int var23 = 0; var23 < var11; var14 += 128) {
                     int var20 = var13 < 5 ? 4 : 2;

                     for (int var25 = 0; var25 < var15; var25 += var20) {
                        class_4883.method_22400(var1, var13, var7, 0);

                        for (int var21 = 0; var21 < var20; var21++) {
                           this.field_46762[var14 + var25 + var21] = var7[var21] <= 0 ? -field_3885[-var7[var21]] : field_3885[var7[var21]];
                           this.field_46762[var14 + var25 + var21] = this.field_46762[var14 + var25 + var21] * this.field_46751[var9];
                        }
                     }

                     var23++;
                  }
               } else {
                  for (int var22 = 0; var22 < var11; var14 += 128) {
                     float var17 = 0.0F;

                     for (int var18 = 0; var18 < var15; var18++) {
                        field_46750 *= 1015568748;
                        this.field_46762[var14 + var18] = (float)field_46750;
                        var17 += this.field_46762[var14 + var18] * this.field_46762[var14 + var18];
                     }

                     float var19 = (float)((double)this.field_46751[var9] / Math.sqrt((double)var17));

                     for (int var24 = 0; var24 < var15; var24++) {
                        this.field_46762[var14 + var24] = this.field_46762[var14 + var24] * var19;
                     }

                     var22++;
                  }
               }
            } else {
               for (int var16 = 0; var16 < var11; var14 += 128) {
                  Arrays.fill(this.field_46762, var14, var14 + var15, 0.0F);
                  var16++;
               }
            }

            var12++;
         }

         var8 += var11 << 7;
      }
   }

   public float[] method_42059() throws AACException {
      return this.field_46762;
   }

   public class_2568 method_42072() {
      return this.field_46753;
   }

   public int[] method_42074() {
      return this.field_46748;
   }

   public int[] method_42067() {
      return this.field_46746;
   }

   public float[] method_42077() {
      return this.field_46751;
   }

   public boolean method_42060() {
      return this.field_46764;
   }

   public class_4867 method_42061() {
      return this.field_46749;
   }

   public int method_42063() {
      return this.field_46763;
   }

   public boolean method_42075() {
      return this.field_46767;
   }

   public int method_42071() {
      return this.field_46768;
   }

   public int method_42066() {
      return this.field_46765;
   }

   public boolean method_42073() {
      return this.field_46747;
   }

   public class_4157 method_42070() {
      return this.field_46754;
   }
}
