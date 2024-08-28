package mapped;

public class Class2377 extends Class2373 {
   private static final long field16244 = 15533907580310407L;
   private Class2381 field16245;
   private Class2381 field16246;

   public Class2377(long var1) {
      this(var1, true);
   }

   public Class2377(long var1, boolean var3) {
      this.field16233 = Class2178.field14304;
      this.field16235 = 8L;
      if (var1 > 0L) {
         this.field16234 = var1;
         this.field16245 = new Class2381(var1, var3);
         this.field16246 = new Class2381(var1, var3);
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2377(long var1, double[] var3) {
      this.field16233 = Class2178.field14304;
      this.field16235 = 8L;
      if (var1 > 0L) {
         if (var3 != null && var3.length == 2) {
            this.field16234 = var1;
            this.field16236 = true;
            this.field16245 = new Class2381(var1, var3[0]);
            this.field16246 = new Class2381(var1, var3[1]);
         } else {
            throw new IllegalArgumentException("constantValue == null || constantValue.length != 2");
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2377(double[] var1) {
      this(new Class2381(var1));
   }

   public Class2377(Class2381 var1) {
      if (var1.method9634() % 2L == 0L) {
         if (var1.method9634() <= 0L) {
            throw new IllegalArgumentException(var1.method9634() + " is not a positive long value");
         } else {
            this.field16233 = Class2178.field14304;
            this.field16235 = 8L;
            this.field16234 = var1.field16234 / 2L;
            this.field16236 = var1.field16236;
            if (!this.field16236) {
               this.field16245 = new Class2381(this.field16234, false);
               this.field16246 = new Class2381(this.field16234, false);

               for (long var4 = 0L; var4 < this.field16234; var4++) {
                  this.field16245.method9687(var4, var1.method9653(2L * var4));
                  this.field16246.method9687(var4, var1.method9653(2L * var4 + 1L));
               }
            } else {
               this.field16245 = new Class2381(this.field16234, var1.method9653(0L));
               this.field16246 = new Class2381(this.field16234, var1.method9653(1L));
            }
         }
      } else {
         throw new IllegalArgumentException("The length of the data array must be even.");
      }
   }

   public Class2377(double[] var1, double[] var2) {
      this(new Class2381(var1), new Class2381(var2));
   }

   public Class2377(Class2381 var1, Class2381 var2) {
      if (var1.method9634() == var2.method9634()) {
         if (var1.method9634() > 0L) {
            if (var1.method9689() == var2.method9689()) {
               this.field16233 = Class2178.field14304;
               this.field16235 = 8L;
               this.field16234 = var1.method9634();
               this.field16245 = var1;
               this.field16246 = var2;
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

   public Class2377 clone() {
      if (!this.field16236) {
         Class2377 var3 = new Class2377(this.field16234, false);
         Class8133.method28181(this, 0L, var3, 0L, this.field16234);
         return var3;
      } else {
         return new Class2377(this.field16234, new double[]{this.field16245.method9653(0L), this.field16246.method9653(0L)});
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         Class2377 var4 = (Class2377)var1;
         return this.field16245.equals(var4.field16245) && this.field16246.equals(var4.field16246);
      }
   }

   @Override
   public int hashCode() {
      int var3 = 29 * super.hashCode() + (this.field16245 == null ? 0 : this.field16245.hashCode());
      return 29 * var3 + (this.field16246 == null ? 0 : this.field16246.hashCode());
   }

   @Override
   public boolean method9689() {
      return this.field16245.method9689();
   }

   public final Class2381 method9695() {
      return this.field16245;
   }

   public final Class2381 method9696() {
      return this.field16246;
   }

   public final Class2381 method9697() {
      Class2381 var3 = new Class2381(this.field16234, false);

      for (long var4 = 0L; var4 < this.field16234; var4++) {
         double var6 = this.field16245.method9653(var4);
         double var8 = this.field16246.method9653(var4);
         var3.method9687(var4, Class9044.method33546(var6 * var6 + var8 * var8));
      }

      return var3;
   }

   public final Class2381 method9698() {
      Class2381 var3 = new Class2381(this.field16234, false);

      for (long var4 = 0L; var4 < this.field16234; var4++) {
         double var6 = this.field16245.method9653(var4);
         double var8 = this.field16246.method9653(var4);
         var3.method9687(var4, Class9044.method33582(var8, var6));
      }

      return var3;
   }

   public final double[] method9636(long var1) {
      return this.method9700(var1);
   }

   public final double[] method9638(long var1) {
      return new double[]{this.field16245.method9638(var1), this.field16246.method9638(var1)};
   }

   @Override
   public final boolean method9639(long var1) {
      return this.field16245.method9639(var1);
   }

   @Override
   public final byte method9641(long var1) {
      return this.field16245.method9641(var1);
   }

   @Override
   public final short method9643(long var1) {
      return this.field16245.method9643(var1);
   }

   @Override
   public final short method9645(long var1) {
      return this.field16245.method9645(var1);
   }

   @Override
   public final int method9647(long var1) {
      return this.field16245.method9647(var1);
   }

   @Override
   public final long method9649(long var1) {
      return this.field16245.method9649(var1);
   }

   @Override
   public final float method9651(long var1) {
      return this.field16245.method9651(var1);
   }

   @Override
   public final double method9653(long var1) {
      return this.field16245.method9653(var1);
   }

   public final float[] method9699(long var1) {
      return new float[]{this.field16245.method9651(var1), this.field16246.method9651(var1)};
   }

   public final double[] method9700(long var1) {
      return new double[]{this.field16245.method9653(var1), this.field16246.method9653(var1)};
   }

   public final double[][] method9655() {
      return !this.method9689() ? new double[][]{this.field16245.method9655(), this.field16246.method9655()} : (double[][])null;
   }

   @Override
   public final boolean[] method9656() {
      return this.field16245.method9656();
   }

   @Override
   public final boolean[] method9657(boolean[] var1, long var2, long var4, long var6) {
      return this.field16245.method9657(var1, var2, var4, var6);
   }

   @Override
   public final byte[] method9658() {
      return this.field16245.method9658();
   }

   @Override
   public final byte[] method9659(byte[] var1, long var2, long var4, long var6) {
      return this.field16245.method9659(var1, var2, var4, var6);
   }

   @Override
   public final short[] method9660() {
      return this.field16245.method9660();
   }

   @Override
   public final short[] method9661(short[] var1, long var2, long var4, long var6) {
      return this.field16245.method9661(var1, var2, var4, var6);
   }

   @Override
   public final int[] method9662() {
      return this.field16245.method9662();
   }

   @Override
   public final int[] method9663(int[] var1, long var2, long var4, long var6) {
      return this.field16245.method9663(var1, var2, var4, var6);
   }

   @Override
   public final long[] method9664() {
      return this.field16245.method9664();
   }

   @Override
   public final long[] method9665(long[] var1, long var2, long var4, long var6) {
      return this.field16245.method9665(var1, var2, var4, var6);
   }

   @Override
   public final float[] method9666() {
      return this.field16245.method9666();
   }

   @Override
   public final float[] method9667(float[] var1, long var2, long var4, long var6) {
      return this.field16245.method9667(var1, var2, var4, var6);
   }

   @Override
   public final double[] method9668() {
      return this.field16245.method9668();
   }

   @Override
   public final double[] method9669(double[] var1, long var2, long var4, long var6) {
      return this.field16245.method9669(var1, var2, var4, var6);
   }

   public final double[] method9701() {
      if (2L * this.field16234 > 1073741824L) {
         return null;
      } else {
         double[] var3 = new double[(int)(2L * this.field16234)];

         for (int var4 = 0; (long)var4 < this.field16234; var4++) {
            var3[2 * var4] = this.field16245.method9653((long)var4);
            var3[2 * var4 + 1] = this.field16246.method9653((long)var4);
         }

         return var3;
      }
   }

   public final double[] method9702(double[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = 2L * (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            double[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new double[(int)var10];
            }

            int var13 = 0;

            for (long var14 = var2; var14 < var4; var14 += var6) {
               var12[var13++] = this.field16245.method9653(var14);
               var12[var13++] = this.field16246.method9653(var14);
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final void method9671(long var1, Object var3) {
      if (var3 instanceof double[]) {
         this.field16245.method9671(var1, ((double[])var3)[0]);
         this.field16246.method9671(var1, ((double[])var3)[1]);
      } else {
         throw new IllegalArgumentException(var3 + " is not an array of doubles.");
      }
   }

   @Override
   public final void method9673(long var1, boolean var3) {
      this.field16245.method9673(var1, var3);
      this.field16246.method9673(var1, false);
   }

   @Override
   public final void method9675(long var1, byte var3) {
      this.field16245.method9675(var1, var3);
      this.field16246.method9675(var1, (byte)0);
   }

   @Override
   public final void method9677(long var1, short var3) {
      this.field16245.method9677(var1, var3);
      this.field16246.method9677(var1, (short)0);
   }

   @Override
   public final void method9679(long var1, short var3) {
      this.field16245.method9679(var1, var3);
      this.field16246.method9679(var1, (short)0);
   }

   @Override
   public final void method9681(long var1, int var3) {
      this.field16245.method9681(var1, var3);
      this.field16246.method9681(var1, 0);
   }

   @Override
   public final void method9683(long var1, long var3) {
      this.field16245.method9683(var1, var3);
      this.field16246.method9683(var1, 0L);
   }

   @Override
   public final void method9685(long var1, float var3) {
      this.field16245.method9685(var1, var3);
      this.field16246.method9685(var1, 0.0F);
   }

   @Override
   public final void method9687(long var1, double var3) {
      this.field16245.method9687(var1, var3);
      this.field16246.method9687(var1, 0.0);
   }

   @Override
   public final void method9670(long var1, Object var3) {
      if (var3 instanceof double[]) {
         this.method9704(var1, (double[])var3);
      } else {
         throw new IllegalArgumentException(var3 + " is not an array of doubles.");
      }
   }

   public final void method9703(long var1, float[] var3) {
      this.field16245.method9685(var1, var3[0]);
      this.field16246.method9685(var1, var3[1]);
   }

   public final void method9704(long var1, double[] var3) {
      this.field16245.method9687(var1, var3[0]);
      this.field16246.method9687(var1, var3[1]);
   }
}
