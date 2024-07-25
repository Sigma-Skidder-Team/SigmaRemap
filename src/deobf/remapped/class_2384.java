package remapped;

public class class_2384 extends class_7975 {
   private static final long field_11898 = 155390537810310407L;
   private class_4330 field_11897;
   private class_4330 field_11895;

   public class_2384(long var1) {
      this(var1, true);
   }

   public class_2384(long var1, boolean var3) {
      this.field_40836 = class_4903.field_25352;
      this.field_40844 = 4L;
      if (var1 > 0L) {
         this.field_40837 = var1;
         this.field_11897 = new class_4330(var1, var3);
         this.field_11895 = new class_4330(var1, var3);
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public class_2384(long var1, float[] var3) {
      this.field_40836 = class_4903.field_25352;
      this.field_40844 = 4L;
      if (var1 > 0L) {
         if (var3 != null && var3.length == 2) {
            this.field_40837 = var1;
            this.field_40838 = true;
            this.field_11897 = new class_4330(var1, var3[0]);
            this.field_11895 = new class_4330(var1, var3[1]);
         } else {
            throw new IllegalArgumentException("constantValue == null || constantValue.length != 2");
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public class_2384(float[] var1) {
      this(new class_4330(var1));
   }

   public class_2384(class_4330 var1) {
      if (var1.method_36136() % 2L == 0L) {
         if (var1.method_36136() <= 0L) {
            throw new IllegalArgumentException(var1.method_36136() + " is not a positive long value");
         } else {
            this.field_40836 = class_4903.field_25352;
            this.field_40844 = 4L;
            this.field_40837 = var1.field_40837 / 2L;
            this.field_40838 = var1.field_40838;
            if (!this.field_40838) {
               this.field_11897 = new class_4330(this.field_40837, false);
               this.field_11895 = new class_4330(this.field_40837, false);

               for (long var4 = 0L; var4 < this.field_40837; var4++) {
                  this.field_11897.method_36123(var4, var1.method_36133(2L * var4));
                  this.field_11895.method_36123(var4, var1.method_36133(2L * var4 + 1L));
               }
            } else {
               this.field_11897 = new class_4330(this.field_40837, var1.method_36133(0L));
               this.field_11895 = new class_4330(this.field_40837, var1.method_36133(1L));
            }
         }
      } else {
         throw new IllegalArgumentException("The length of the data array must be even.");
      }
   }

   public class_2384(float[] var1, float[] var2) {
      this(new class_4330(var1), new class_4330(var2));
   }

   public class_2384(class_4330 var1, class_4330 var2) {
      if (var1.method_36136() == var2.method_36136()) {
         if (var1.method_36136() > 0L) {
            if (var1.method_36106() == var2.method_36106()) {
               this.field_40836 = class_4903.field_25352;
               this.field_40844 = 4L;
               this.field_40837 = var1.method_36136();
               this.field_11897 = var1;
               this.field_11895 = var2;
            } else {
               throw new IllegalArgumentException("dataRe.isLarge() != dataIm.isLarge()");
            }
         } else {
            throw new IllegalArgumentException(var1.method_36136() + " is not a positive long value");
         }
      } else {
         throw new IllegalArgumentException("The length of the dataRe must be equal to the length of dataIm.");
      }
   }

   public class_2384 clone() {
      if (!this.field_40838) {
         class_2384 var3 = new class_2384(this.field_40837, false);
         class_3685.method_17116(this, 0L, var3, 0L, this.field_40837);
         return var3;
      } else {
         return new class_2384(this.field_40837, new float[]{this.field_11897.method_36133(0L), this.field_11895.method_36133(0L)});
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         class_2384 var4 = (class_2384)var1;
         return this.field_11897.equals(var4.field_11897) && this.field_11895.equals(var4.field_11895);
      }
   }

   @Override
   public int hashCode() {
      int var3 = 29 * super.hashCode() + (this.field_11897 == null ? 0 : this.field_11897.hashCode());
      return 29 * var3 + (this.field_11895 == null ? 0 : this.field_11895.hashCode());
   }

   @Override
   public boolean method_36106() {
      return this.field_11897.method_36106();
   }

   public final class_4330 method_10887() {
      return this.field_11897;
   }

   public final class_4330 method_10879() {
      return this.field_11895;
   }

   public final class_4330 method_10888() {
      class_4330 var3 = new class_4330(this.field_40837, false);

      for (long var4 = 0L; var4 < this.field_40837; var4++) {
         double var6 = (double)this.field_11897.method_36133(var4);
         double var8 = (double)this.field_11895.method_36133(var4);
         var3.method_36123(var4, (float)class_6806.method_31206(var6 * var6 + var8 * var8));
      }

      return var3;
   }

   public final class_4330 method_10881() {
      class_4330 var3 = new class_4330(this.field_40837, false);

      for (long var4 = 0L; var4 < this.field_40837; var4++) {
         double var6 = (double)this.field_11897.method_36133(var4);
         double var8 = (double)this.field_11895.method_36133(var4);
         var3.method_36123(var4, (float)class_6806.method_31213(var8, var6));
      }

      return var3;
   }

   public final float[] method_10883(long var1) {
      return this.method_10878(var1);
   }

   public final float[] method_10880(long var1) {
      return new float[]{this.field_11897.method_20153(var1), this.field_11895.method_20153(var1)};
   }

   @Override
   public final boolean method_36084(long var1) {
      return this.field_11897.method_36084(var1);
   }

   @Override
   public final byte method_36121(long var1) {
      return this.field_11897.method_36121(var1);
   }

   @Override
   public final short method_36103(long var1) {
      return this.field_11897.method_36103(var1);
   }

   @Override
   public final short method_36124(long var1) {
      return this.field_11897.method_36124(var1);
   }

   @Override
   public final int method_36079(long var1) {
      return this.field_11897.method_36079(var1);
   }

   @Override
   public final long method_36076(long var1) {
      return this.field_11897.method_36076(var1);
   }

   @Override
   public final float method_36133(long var1) {
      return this.field_11897.method_36133(var1);
   }

   @Override
   public final double method_36107(long var1) {
      return this.field_11897.method_36107(var1);
   }

   public final float[] method_10878(long var1) {
      return new float[]{this.field_11897.method_36133(var1), this.field_11895.method_36133(var1)};
   }

   public final double[] method_10882(long var1) {
      return new double[]{this.field_11897.method_36107(var1), this.field_11895.method_36107(var1)};
   }

   public final float[][] method_10885() {
      return !this.method_36106() ? new float[][]{this.field_11897.method_20155(), this.field_11895.method_20155()} : (float[][])null;
   }

   @Override
   public final boolean[] method_36110() {
      return this.field_11897.method_36110();
   }

   @Override
   public final boolean[] method_36111(boolean[] var1, long var2, long var4, long var6) {
      return this.field_11897.method_36111(var1, var2, var4, var6);
   }

   @Override
   public final byte[] method_36104() {
      return this.field_11897.method_36104();
   }

   @Override
   public final byte[] method_36105(byte[] var1, long var2, long var4, long var6) {
      return this.field_11897.method_36105(var1, var2, var4, var6);
   }

   @Override
   public final short[] method_36090() {
      return this.field_11897.method_36090();
   }

   @Override
   public final short[] method_36091(short[] var1, long var2, long var4, long var6) {
      return this.field_11897.method_36091(var1, var2, var4, var6);
   }

   @Override
   public final int[] method_36087() {
      return this.field_11897.method_36087();
   }

   @Override
   public final int[] method_36088(int[] var1, long var2, long var4, long var6) {
      return this.field_11897.method_36088(var1, var2, var4, var6);
   }

   @Override
   public final long[] method_36125() {
      return this.field_11897.method_36125();
   }

   @Override
   public final long[] method_36126(long[] var1, long var2, long var4, long var6) {
      return this.field_11897.method_36126(var1, var2, var4, var6);
   }

   @Override
   public final float[] method_36095() {
      return this.field_11897.method_36095();
   }

   @Override
   public final float[] method_36096(float[] var1, long var2, long var4, long var6) {
      return this.field_11897.method_36096(var1, var2, var4, var6);
   }

   @Override
   public final double[] method_36077() {
      return this.field_11897.method_36077();
   }

   @Override
   public final double[] method_36078(double[] var1, long var2, long var4, long var6) {
      return this.field_11897.method_36078(var1, var2, var4, var6);
   }

   public final float[] method_10876() {
      if (2L * this.field_40837 > 1073741824L) {
         return null;
      } else {
         float[] var3 = new float[(int)(2L * this.field_40837)];

         for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
            var3[2 * var4] = this.field_11897.method_36133((long)var4);
            var3[2 * var4 + 1] = this.field_11895.method_36133((long)var4);
         }

         return var3;
      }
   }

   public final float[] method_10877(float[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = 2L * (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
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
               var12[var13++] = this.field_11897.method_36133(var14);
               var12[var13++] = this.field_11895.method_36133(var14);
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final void method_36128(long var1, Object var3) {
      if (var3 instanceof float[]) {
         this.field_11897.method_36128(var1, ((float[])var3)[0]);
         this.field_11895.method_36128(var1, ((float[])var3)[1]);
      } else {
         throw new IllegalArgumentException(var3 + " is not an array of floats.");
      }
   }

   @Override
   public final void method_36109(long var1, boolean var3) {
      this.field_11897.method_36109(var1, var3);
      this.field_11895.method_36109(var1, false);
   }

   @Override
   public final void method_36117(long var1, byte var3) {
      this.field_11897.method_36117(var1, var3);
      this.field_11895.method_36117(var1, (byte)0);
   }

   @Override
   public final void method_36086(long var1, short var3) {
      this.field_11897.method_36086(var1, var3);
      this.field_11895.method_36086(var1, (short)0);
   }

   @Override
   public final void method_36129(long var1, short var3) {
      this.field_11897.method_36129(var1, var3);
      this.field_11895.method_36129(var1, (short)0);
   }

   @Override
   public final void method_36092(long var1, int var3) {
      this.field_11897.method_36092(var1, var3);
      this.field_11895.method_36092(var1, 0);
   }

   @Override
   public final void method_36131(long var1, long var3) {
      this.field_11897.method_36131(var1, var3);
      this.field_11895.method_36131(var1, 0L);
   }

   @Override
   public final void method_36123(long var1, float var3) {
      this.field_11897.method_36123(var1, var3);
      this.field_11895.method_36123(var1, 0.0F);
   }

   @Override
   public final void method_36114(long var1, double var3) {
      this.field_11897.method_36114(var1, var3);
      this.field_11895.method_36114(var1, 0.0);
   }

   @Override
   public final void method_36122(long var1, Object var3) {
      if (var3 instanceof float[]) {
         this.method_10884(var1, (float[])var3);
      } else {
         throw new IllegalArgumentException(var3 + " is not an array of floats.");
      }
   }

   public final void method_10884(long var1, float[] var3) {
      this.field_11897.method_36123(var1, var3[0]);
      this.field_11895.method_36123(var1, var3[1]);
   }

   public final void method_10886(long var1, double[] var3) {
      this.field_11897.method_36114(var1, var3[0]);
      this.field_11895.method_36114(var1, var3[1]);
   }
}
