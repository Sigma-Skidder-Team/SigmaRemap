package remapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class class_9214 implements class_3471 {
   private static final float[] field_47131 = new float[]{0.570829F, 0.696616F, 0.813004F, 0.911304F, 0.9849F, 1.067894F, 1.194601F, 1.369533F};
   private final int field_47128;
   private final int[] field_47125;
   private int field_47127;
   private int field_47134;
   private int field_47132;
   private boolean field_47136;
   private boolean[] field_47130;
   private boolean[] field_47133;
   private boolean[] field_47126;
   private int[] field_47129;

   public class_9214(int var1) {
      this.field_47128 = var1;
      this.field_47125 = new int[4 * var1];
   }

   public void method_42556(class_7390 var1, class_2568 var2, class_8296 var3) throws AACException {
      this.field_47134 = 0;
      if (!var3.equals(class_8296.field_42505)) {
         this.field_47134 = var1.method_33662(11);
      } else {
         this.field_47136 = var1.method_33660();
         if (this.field_47136) {
            this.field_47134 = var1.method_33662(10);
         }
      }

      if (this.field_47134 > this.field_47128 << 1) {
         throw new class_5060("LTP lag too large: " + this.field_47134);
      } else {
         this.field_47127 = var1.method_33662(3);
         int var6 = var2.method_11661();
         if (!var2.method_11676()) {
            this.field_47132 = Math.min(var2.method_11671(), 40);
            this.field_47126 = new boolean[this.field_47132];

            for (int var7 = 0; var7 < this.field_47132; var7++) {
               this.field_47126[var7] = var1.method_33660();
            }
         } else {
            this.field_47130 = new boolean[var6];
            this.field_47133 = new boolean[var6];
            this.field_47129 = new int[var6];

            for (int var8 = 0; var8 < var6; var8++) {
               if (this.field_47130[var8] = var1.method_33660()) {
                  this.field_47133[var8] = var1.method_33660();
                  if (this.field_47133[var8]) {
                     this.field_47129[var8] = var1.method_33662(4);
                  }
               }
            }
         }
      }
   }

   public void method_42554(int var1) {
      if (this.field_47126 != null) {
         this.field_47126[var1] = false;
      }
   }

   public void method_42555(class_9143 var1, float[] var2, class_5346 var3, class_8965 var4) {
      class_2568 var7 = var1.method_42072();
      if (!var7.method_11676()) {
         int var8 = this.field_47128 << 1;
         float[] var9 = new float[2048];
         float[] var10 = new float[2048];

         for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (float)this.field_47125[var8 + var11 - this.field_47134] * field_47131[this.field_47127];
         }

         var3.method_24369(var7.method_11669(), var7.method_11677(1), var7.method_11677(0), var9, var10);
         if (var1.method_42060()) {
            var1.method_42061().method_22371(var1, var10, var4, true);
         }

         int[] var17 = var7.method_11674();
         int var12 = var7.method_11660();

         for (int var13 = 0; var13 < this.field_47132; var13++) {
            if (this.field_47126[var13]) {
               int var14 = var17[var13];
               int var15 = Math.min(var17[var13 + 1], var12);

               for (int var16 = var14; var16 < var15; var16++) {
                  var2[var16] += var10[var16];
               }
            }
         }
      }
   }

   public void method_42557(float[] var1, float[] var2, class_8296 var3) {
      if (!var3.equals(class_8296.field_42505)) {
         for (int var6 = 0; var6 < this.field_47128; var6++) {
            this.field_47125[var6] = this.field_47125[var6 + this.field_47128];
            this.field_47125[this.field_47128 + var6] = Math.round(var1[var6]);
            this.field_47125[this.field_47128 * 2 + var6] = Math.round(var2[var6]);
         }
      } else {
         for (int var7 = 0; var7 < this.field_47128; var7++) {
            this.field_47125[var7] = this.field_47125[var7 + this.field_47128];
            this.field_47125[this.field_47128 + var7] = this.field_47125[var7 + this.field_47128 * 2];
            this.field_47125[this.field_47128 * 2 + var7] = Math.round(var1[var7]);
            this.field_47125[this.field_47128 * 3 + var7] = Math.round(var2[var7]);
         }
      }
   }

   public static boolean method_42560(class_8296 var0) {
      return var0.equals(class_8296.field_42522) || var0.equals(class_8296.field_42503) || var0.equals(class_8296.field_42505);
   }

   public void method_42558(class_9214 var1) {
      System.arraycopy(var1.field_47125, 0, this.field_47125, 0, this.field_47125.length);
      this.field_47127 = var1.field_47127;
      this.field_47134 = var1.field_47134;
      this.field_47132 = var1.field_47132;
      this.field_47136 = var1.field_47136;
      this.field_47130 = Arrays.copyOf(var1.field_47130, var1.field_47130.length);
      this.field_47133 = Arrays.copyOf(var1.field_47133, var1.field_47133.length);
      this.field_47129 = Arrays.copyOf(var1.field_47129, var1.field_47129.length);
      this.field_47126 = Arrays.copyOf(var1.field_47126, var1.field_47126.length);
   }
}
