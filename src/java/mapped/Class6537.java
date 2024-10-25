package mapped;

import java.util.Arrays;

public class Class6537 implements Class6515 {
   private static final float[] field28838 = new float[]{0.570829F, 0.696616F, 0.813004F, 0.911304F, 0.9849F, 1.067894F, 1.194601F, 1.369533F};
   private final int field28839;
   private final int[] field28840;
   private int field28841;
   private int field28842;
   private int field28843;
   private boolean field28844;
   private boolean[] field28845;
   private boolean[] field28846;
   private boolean[] field28847;
   private int[] field28848;

   public Class6537(int var1) {
      this.field28839 = var1;
      this.field28840 = new int[4 * var1];
   }

   public void method19858(Class9189 var1, Class6538 var2, Class1955 var3) throws AACException {
      this.field28842 = 0;
      if (!var3.equals(Class1955.field12736)) {
         this.field28842 = var1.method34397(11);
      } else {
         this.field28844 = var1.method34399();
         if (this.field28844) {
            this.field28842 = var1.method34397(10);
         }
      }

      if (this.field28842 > this.field28839 << 1) {
         throw new AACException("LTP lag too large: " + this.field28842);
      } else {
         this.field28841 = var1.method34397(3);
         int var6 = var2.method19870();
         if (!var2.method19874()) {
            this.field28843 = Math.min(var2.method19866(), 40);
            this.field28847 = new boolean[this.field28843];

            for (int var7 = 0; var7 < this.field28843; var7++) {
               this.field28847[var7] = var1.method34399();
            }
         } else {
            this.field28845 = new boolean[var6];
            this.field28846 = new boolean[var6];
            this.field28848 = new int[var6];

            for (int var8 = 0; var8 < var6; var8++) {
               if (this.field28845[var8] = var1.method34399()) {
                  this.field28846[var8] = var1.method34399();
                  if (this.field28846[var8]) {
                     this.field28848[var8] = var1.method34397(4);
                  }
               }
            }
         }
      }
   }

   public void method19859(int var1) {
      if (this.field28847 != null) {
         this.field28847[var1] = false;
      }
   }

   public void method19860(Class6512 var1, float[] var2, Class6518 var3, Class2288 var4) {
      Class6538 var7 = var1.method19720();
      if (!var7.method19874()) {
         int var8 = this.field28839 << 1;
         float[] var9 = new float[2048];
         float[] var10 = new float[2048];

         for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (float)this.field28840[var8 + var11 - this.field28842] * field28838[this.field28841];
         }

         var3.method19763(var7.method19873(), var7.method19875(1), var7.method19875(0), var9, var10);
         if (var1.method19724()) {
            var1.method19725().method19885(var1, var10, var4, true);
         }

         int[] var17 = var7.method19868();
         int var12 = var7.method19869();

         for (int var13 = 0; var13 < this.field28843; var13++) {
            if (this.field28847[var13]) {
               int var14 = var17[var13];
               int var15 = Math.min(var17[var13 + 1], var12);

               for (int var16 = var14; var16 < var15; var16++) {
                  var2[var16] += var10[var16];
               }
            }
         }
      }
   }

   public void method19861(float[] var1, float[] var2, Class1955 var3) {
      if (!var3.equals(Class1955.field12736)) {
         for (int var6 = 0; var6 < this.field28839; var6++) {
            this.field28840[var6] = this.field28840[var6 + this.field28839];
            this.field28840[this.field28839 + var6] = Math.round(var1[var6]);
            this.field28840[this.field28839 * 2 + var6] = Math.round(var2[var6]);
         }
      } else {
         for (int var7 = 0; var7 < this.field28839; var7++) {
            this.field28840[var7] = this.field28840[var7 + this.field28839];
            this.field28840[this.field28839 + var7] = this.field28840[var7 + this.field28839 * 2];
            this.field28840[this.field28839 * 2 + var7] = Math.round(var1[var7]);
            this.field28840[this.field28839 * 3 + var7] = Math.round(var2[var7]);
         }
      }
   }

   public static boolean method19862(Class1955 var0) {
      return var0.equals(Class1955.field12732) || var0.equals(Class1955.field12739) || var0.equals(Class1955.field12736);
   }

   public void method19863(Class6537 var1) {
      System.arraycopy(var1.field28840, 0, this.field28840, 0, this.field28840.length);
      this.field28841 = var1.field28841;
      this.field28842 = var1.field28842;
      this.field28843 = var1.field28843;
      this.field28844 = var1.field28844;
      this.field28845 = Arrays.copyOf(var1.field28845, var1.field28845.length);
      this.field28846 = Arrays.copyOf(var1.field28846, var1.field28846.length);
      this.field28848 = Arrays.copyOf(var1.field28848, var1.field28848.length);
      this.field28847 = Arrays.copyOf(var1.field28847, var1.field28847.length);
   }
}
