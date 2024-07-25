package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_4867 implements class_3471, class_7108 {
   private static final int field_24229 = 20;
   private static final int[] field_24225 = new int[]{1, 4, 3};
   private static final int[] field_24230 = new int[]{2, 6, 5};
   private int[] field_24227 = new int[8];
   private int[][] field_24228 = new int[8][4];
   private int[][] field_24224;
   private boolean[][] field_24231 = new boolean[8][4];
   private float[][][] field_24232;

   public class_4867() {
      this.field_24224 = new int[8][4];
      this.field_24232 = new float[8][4][20];
   }

   public void method_22370(class_7390 var1, class_2568 var2) throws AACException {
      int var5 = var2.method_11661();
      int[] var6 = !var2.method_11676() ? field_24230 : field_24225;

      for (int var7 = 0; var7 < var5; var7++) {
         if ((this.field_24227[var7] = var1.method_33662(var6[0])) != 0) {
            int var8 = var1.method_33655();

            for (int var9 = 0; var9 < this.field_24227[var7]; var9++) {
               this.field_24228[var7][var9] = var1.method_33662(var6[1]);
               if ((this.field_24224[var7][var9] = var1.method_33662(var6[2])) > 20) {
                  throw new class_5060("TNS filter out of range: " + this.field_24224[var7][var9]);
               }

               if (this.field_24224[var7][var9] != 0) {
                  this.field_24231[var7][var9] = var1.method_33660();
                  int var10 = var1.method_33655();
                  int var11 = var8 + 3 - var10;
                  int var12 = 2 * var10 + var8;

                  for (int var13 = 0; var13 < this.field_24224[var7][var9]; var13++) {
                     this.field_24232[var7][var9][var13] = field_36658[var12][var1.method_33662(var11)];
                  }
               }
            }
         }
      }
   }

   public void method_22371(class_9143 var1, float[] var2, class_8965 var3, boolean var4) {
   }
}
