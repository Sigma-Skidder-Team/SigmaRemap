package mapped;

public class Class2380 extends Class2373 {
   private static final long field16256 = 155390537810310407L;
   private Class2378 field16257;
   private Class2378 field16258;

   public Class2380(long var1) {
      this(var1, true);
   }

   public Class2380(long var1, boolean var3) {
      this.field16233 = Class2178.field14303;
      this.field16235 = 4L;
      if (var1 > 0L) {
         this.field16234 = var1;
         this.field16257 = new Class2378(var1, var3);
         this.field16258 = new Class2378(var1, var3);
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2380(long var1, float[] var3) {
      this.field16233 = Class2178.field14303;
      this.field16235 = 4L;
      if (var1 > 0L) {
         if (var3 != null && var3.length == 2) {
            this.field16234 = var1;
            this.field16236 = true;
            this.field16257 = new Class2378(var1, var3[0]);
            this.field16258 = new Class2378(var1, var3[1]);
         } else {
            throw new IllegalArgumentException("constantValue == null || constantValue.length != 2");
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2380(float[] var1) {
      this(new Class2378(var1));
   }

   public Class2380(Class2378 var1) {
      if (var1.method9634() % 2L == 0L) {
         if (var1.method9634() <= 0L) {
            throw new IllegalArgumentException(var1.method9634() + " is not a positive long value");
         } else {
            this.field16233 = Class2178.field14303;
            this.field16235 = 4L;
            this.field16234 = var1.field16234 / 2L;
            this.field16236 = var1.field16236;
            if (!this.field16236) {
               this.field16257 = new Class2378(this.field16234, false);
               this.field16258 = new Class2378(this.field16234, false);

               for (long var4 = 0L; var4 < this.field16234; var4++) {
                  this.field16257.method9685(var4, var1.method9651(2L * var4));
                  this.field16258.method9685(var4, var1.method9651(2L * var4 + 1L));
               }
            } else {
               this.field16257 = new Class2378(this.field16234, var1.method9651(0L));
               this.field16258 = new Class2378(this.field16234, var1.method9651(1L));
            }
         }
      } else {
         throw new IllegalArgumentException("The length of the data array must be even.");
      }
   }

   public Class2380(float[] var1, float[] var2) {
      this(new Class2378(var1), new Class2378(var2));
   }

   public Class2380(Class2378 var1, Class2378 var2) {
      if (var1.method9634() == var2.method9634()) {
         if (var1.method9634() > 0L) {
            if (var1.method9689() == var2.method9689()) {
               this.field16233 = Class2178.field14303;
               this.field16235 = 4L;
               this.field16234 = var1.method9634();
               this.field16257 = var1;
               this.field16258 = var2;
            } else {
               throw new IllegalArgumentException("dataRe.isLarge() != dataIm.isLarge()");
            }
         } else {
            throw new IllegalArgumentException(var1.method9634() + " is not a positive long value");
         }
      } else {
         throw new IllegalArgumentException("The length of the dataRe must be equal to the length of dataIm.");
      }
   }

   public Class2380 clone() {
      if (!this.field16236) {
         Class2380 var3 = new Class2380(this.field16234, false);
         Class8133.method28179(this, 0L, var3, 0L, this.field16234);
         return var3;
      } else {
         return new Class2380(this.field16234, new float[]{this.field16257.method9651(0L), this.field16258.method9651(0L)});
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         Class2380 var4 = (Class2380)var1;
         return this.field16257.equals(var4.field16257) && this.field16258.equals(var4.field16258);
      }
   }

   @Override
   public int hashCode() {
      int var3 = 29 * super.hashCode() + (this.field16257 == null ? 0 : this.field16257.hashCode());
      return 29 * var3 + (this.field16258 == null ? 0 : this.field16258.hashCode());
   }

   @Override
   public boolean method9689() {
      return this.field16257.method9689();
   }

   public final Class2378 method9706() {
      return this.field16257;
   }

   public final Class2378 method9707() {
      return this.field16258;
   }

   public final Class2378 method9708() {
      Class2378 var3 = new Class2378(this.field16234, false);

      for (long var4 = 0L; var4 < this.field16234; var4++) {
         double var6 = (double)this.field16257.method9651(var4);
         double var8 = (double)this.field16258.method9651(var4);
         var3.method9685(var4, (float)Class9044.method33546(var6 * var6 + var8 * var8));
      }

      return var3;
   }

   public final Class2378 method9709() {
      Class2378 var3 = new Class2378(this.field16234, false);

      for (long var4 = 0L; var4 < this.field16234; var4++) {
         double var6 = (double)this.field16257.method9651(var4);
         double var8 = (double)this.field16258.method9651(var4);
         var3.method9685(var4, (float)Class9044.method33582(var8, var6));
      }

      return var3;
   }

   public final float[] method9636(long var1) {
      return this.method9710(var1);
   }

   public final float[] method9638(long var1) {
      return new float[]{this.field16257.method9638(var1), this.field16258.method9638(var1)};
   }

   @Override
   public final boolean method9639(long var1) {
      return this.field16257.method9639(var1);
   }

   @Override
   public final byte method9641(long var1) {
      return this.field16257.method9641(var1);
   }

   @Override
   public final short method9643(long var1) {
      return this.field16257.method9643(var1);
   }

   @Override
   public final short method9645(long var1) {
      return this.field16257.method9645(var1);
   }

   @Override
   public final int method9647(long var1) {
      return this.field16257.method9647(var1);
   }

   @Override
   public final long method9649(long var1) {
      return this.field16257.method9649(var1);
   }

   @Override
   public final float method9651(long var1) {
      return this.field16257.method9651(var1);
   }

   @Override
   public final double method9653(long var1) {
      return this.field16257.method9653(var1);
   }

   public final float[] method9710(long var1) {
      return new float[]{this.field16257.method9651(var1), this.field16258.method9651(var1)};
   }

   public final double[] method9711(long var1) {
      return new double[]{this.field16257.method9653(var1), this.field16258.method9653(var1)};
   }

   public final float[][] method9655() {
      return !this.method9689() ? new float[][]{this.field16257.method9655(), this.field16258.method9655()} : (float[][])null;
   }

   @Override
   public final boolean[] method9656() {
      return this.field16257.method9656();
   }

   @Override
   public final boolean[] method9657(boolean[] var1, long var2, long var4, long var6) {
      return this.field16257.method9657(var1, var2, var4, var6);
   }

   @Override
   public final byte[] method9658() {
      return this.field16257.method9658();
   }

   @Override
   public final byte[] method9659(byte[] var1, long var2, long var4, long var6) {
      return this.field16257.method9659(var1, var2, var4, var6);
   }

   @Override
   public final short[] method9660() {
      return this.field16257.method9660();
   }

   @Override
   public final short[] method9661(short[] var1, long var2, long var4, long var6) {
      return this.field16257.method9661(var1, var2, var4, var6);
   }

   @Override
   public final int[] method9662() {
      return this.field16257.method9662();
   }

   @Override
   public final int[] method9663(int[] var1, long var2, long var4, long var6) {
      return this.field16257.method9663(var1, var2, var4, var6);
   }

   @Override
   public final long[] method9664() {
      return this.field16257.method9664();
   }

   @Override
   public final long[] method9665(long[] var1, long var2, long var4, long var6) {
      return this.field16257.method9665(var1, var2, var4, var6);
   }

   @Override
   public final float[] method9666() {
      return this.field16257.method9666();
   }

   @Override
   public final float[] method9667(float[] var1, long var2, long var4, long var6) {
      return this.field16257.method9667(var1, var2, var4, var6);
   }

   @Override
   public final double[] method9668() {
      return this.field16257.method9668();
   }

   @Override
   public final double[] method9669(double[] var1, long var2, long var4, long var6) {
      return this.field16257.method9669(var1, var2, var4, var6);
   }

   public final float[] method9712() {
      if (2L * this.field16234 > 1073741824L) {
         return null;
      } else {
         float[] var3 = new float[(int)(2L * this.field16234)];

         for (int var4 = 0; (long)var4 < this.field16234; var4++) {
            var3[2 * var4] = this.field16257.method9651((long)var4);
            var3[2 * var4 + 1] = this.field16258.method9651((long)var4);
         }

         return var3;
      }
   }

   public final float[] method9713(float[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = 2L * (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            float[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new float[(int)var10];
            }

            int var13 = 0;

            for (long var14 = var2; var14 < var4; var14 += var6) {
               var12[var13++] = this.field16257.method9651(var14);
               var12[var13++] = this.field16258.method9651(var14);
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final void method9671(long var1, Object var3) {
      if (var3 instanceof float[]) {
         this.field16257.method9671(var1, ((float[])var3)[0]);
         this.field16258.method9671(var1, ((float[])var3)[1]);
      } else {
         throw new IllegalArgumentException(var3 + " is not an array of floats.");
      }
   }

   @Override
   public final void method9673(long var1, boolean var3) {
      this.field16257.method9673(var1, var3);
      this.field16258.method9673(var1, false);
   }

   @Override
   public final void method9675(long var1, byte var3) {
      this.field16257.method9675(var1, var3);
      this.field16258.method9675(var1, (byte)0);
   }

   @Override
   public final void method9677(long var1, short var3) {
      this.field16257.method9677(var1, var3);
      this.field16258.method9677(var1, (short)0);
   }

   @Override
   public final void method9679(long var1, short var3) {
      this.field16257.method9679(var1, var3);
      this.field16258.method9679(var1, (short)0);
   }

   @Override
   public final void method9681(long var1, int var3) {
      this.field16257.method9681(var1, var3);
      this.field16258.method9681(var1, 0);
   }

   @Override
   public final void method9683(long var1, long var3) {
      this.field16257.method9683(var1, var3);
      this.field16258.method9683(var1, 0L);
   }

   @Override
   public final void method9685(long var1, float var3) {
      this.field16257.method9685(var1, var3);
      this.field16258.method9685(var1, 0.0F);
   }

   @Override
   public final void method9687(long var1, double var3) {
      this.field16257.method9687(var1, var3);
      this.field16258.method9687(var1, 0.0);
   }

   @Override
   public final void method9670(long var1, Object var3) {
      if (var3 instanceof float[]) {
         this.method9714(var1, (float[])var3);
      } else {
         throw new IllegalArgumentException(var3 + " is not an array of floats.");
      }
   }

   public final void method9714(long var1, float[] var3) {
      this.field16257.method9685(var1, var3[0]);
      this.field16258.method9685(var1, var3[1]);
   }

   public final void method9715(long var1, double[] var3) {
      this.field16257.method9687(var1, var3[0]);
      this.field16258.method9687(var1, var3[1]);
   }
}
