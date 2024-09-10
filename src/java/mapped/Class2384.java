package mapped;

import org.apache.commons.lang3.SerializationException;

import java.io.*;
import java.lang.ref.Cleaner;

public class Class2384 extends Class2373 {
   private static final long field16264 = -4096759496772248522L;
   private static final Cleaner cleaner = Cleaner.create();
   private Object[] field16265;
   private Class2383 field16266;
   private int field16267;
   private long field16268;
   private byte[] field16269;

   public Class2384(long var1) {
      this(var1, 1024);
   }

   public Class2384(long var1, int var3) {
      this(var1, var3, true);
   }

   public Class2384(long var1, int var3, boolean var4) {
      this.field16233 = Class2178.field14306;
      this.field16235 = 1L;
      if (var1 > 0L) {
         if (var3 > 0) {
            this.field16234 = var1;
            this.field16268 = var1 * (long)var3;
            this.field16267 = var3;
            if (var1 <= (long)method9693()) {
               this.field16265 = new Object[(int)var1];
            } else {
               this.field16238 = Class8133.field34961.allocateMemory(this.field16268 * this.field16235);
               if (var4) {
                  this.method9694(this.field16268);
               }

               cleaner.register(this, new ResourceCleaner(this.field16238, this.field16268, this.field16235));
               Class8065.method27706(this.field16268 * this.field16235);
               this.field16266 = new Class2383(var1);
               this.field16269 = new byte[var3];
            }
         } else {
            throw new IllegalArgumentException(var3 + " is not a positive int value.");
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value.");
      }
   }

   public Class2384(long var1, Object var3) {
      this.field16233 = Class2178.field14306;
      this.field16235 = 1L;
      if (var1 > 0L) {
         this.field16234 = var1;
         this.field16236 = true;
         this.field16265 = new Object[]{var3};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2384(Object[] var1) {
      this.field16233 = Class2178.field14306;
      this.field16235 = 1L;
      this.field16234 = (long)var1.length;
      this.field16265 = var1;
   }

   public Class2384 clone() {
      if (!this.field16236) {
         Class2384 var3 = new Class2384(this.field16234, Class9044.method33607(1, this.field16267), false);
         Class8133.method28185(this, 0L, var3, 0L, this.field16234);
         return var3;
      } else {
         return new Class2384(this.field16234, this.method9636(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         Class2384 var4 = (Class2384)var1;
         boolean var5 = this.field16267 == var4.field16267 && this.field16265 == var4.field16265;
         if (this.field16266 != null && var4.field16266 != null) {
            return var5 && this.field16266.equals(var4.field16266);
         } else {
            return this.field16266 != var4.field16266 ? false : var5;
         }
      }
   }

   @Override
   public int hashCode() {
      int var3 = 29 * super.hashCode() + (this.field16265 == null ? 0 : this.field16265.hashCode());
      var3 = 29 * var3 + (this.field16267 ^ this.field16267 >>> 16);
      return 29 * var3 + (this.field16266 == null ? 0 : this.field16266.hashCode());
   }

   @Override
   public final Object method9636(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? this.field16265[(int)var1] : this.field16265[0];
      } else {
         short var5 = this.field16266.method9645(var1);
         if (var5 < 0) {
            return null;
         } else {
            long var6 = this.field16235 * var1 * (long)this.field16267;

            for (int var8 = 0; var8 < var5; var8++) {
               this.field16269[var8] = Class8133.field34961.getByte(this.field16238 + var6 + this.field16235 * (long)var8);
            }

            return method9717(this.field16269);
         }
      }
   }

   @Override
   public final Object method9638(long var1) {
      short var5 = this.field16266.method9645(var1);
      if (var5 < 0) {
         return null;
      } else {
         long var6 = this.field16235 * var1 * (long)this.field16267;

         for (int var8 = 0; var8 < var5; var8++) {
            this.field16269[var8] = Class8133.field34961.getByte(this.field16238 + var6 + this.field16235 * (long)var8);
         }

         return method9717(this.field16269);
      }
   }

   @Override
   public final boolean method9639(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final byte method9641(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short method9643(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short method9645(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final int method9647(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final long method9649(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final float method9651(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final double method9653(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   public final Object[] method9655() {
      return this.field16265;
   }

   @Override
   public final boolean[] method9656() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final boolean[] method9657(boolean[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final byte[] method9658() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final byte[] method9659(byte[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short[] method9660() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short[] method9661(short[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final int[] method9662() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final int[] method9663(int[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final long[] method9664() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final long[] method9665(long[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final float[] method9666() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final float[] method9667(float[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final double[] method9668() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final double[] method9669(double[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9671(long var1, Object var3) {
      if (var3 != null) {
         byte[] var6 = method9716(var3);
         if (var6.length > this.field16267) {
            throw new IllegalArgumentException("Object  " + var3 + " is too long.");
         }

         int var7 = var6.length;
         if (var7 > 32767) {
            throw new IllegalArgumentException("Object  " + var3 + " is too long.");
         }

         this.field16266.method9679(var1, (short)var7);
         long var8 = this.field16235 * var1 * (long)this.field16267;

         for (int var10 = 0; var10 < var7; var10++) {
            Class8133.field34961.putByte(this.field16238 + var8 + this.field16235 * (long)var10, var6[var10]);
         }
      } else {
         this.field16266.method9679(var1, (short)-1);
      }
   }

   @Override
   public final void method9670(long var1, Object var3) {
      if (var3 != null) {
         if (this.field16238 == 0L) {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16265[(int)var1] = var3;
         } else {
            byte[] var6 = method9716(var3);
            if (var6.length > this.field16267) {
               throw new IllegalArgumentException("Object  " + var3 + " is too long.");
            }

            int var7 = var6.length;
            if (var7 > 32767) {
               throw new IllegalArgumentException("Object  " + var3 + " is too long.");
            }

            this.field16266.method9679(var1, (short)var7);
            long var8 = this.field16235 * var1 * (long)this.field16267;

            for (int var10 = 0; var10 < var7; var10++) {
               Class8133.field34961.putByte(this.field16238 + var8 + this.field16235 * (long)var10, var6[var10]);
            }
         }
      } else if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16265[(int)var1] = null;
      } else {
         this.field16266.method9679(var1, (short)-1);
      }
   }

   @Override
   public final void method9672(long var1, Object var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9670(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   @Override
   public final void method9673(long var1, boolean var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9675(long var1, byte var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9677(long var1, short var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9679(long var1, short var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9681(long var1, int var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9683(long var1, long var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9685(long var1, float var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method9687(long var1, double var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   private static byte[] method9716(Object var0) {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream(512);
      ObjectOutputStream var4 = null;

      try {
         var4 = new ObjectOutputStream(var3);
         var4.writeObject(var0);
      } catch (Exception var13) {
         throw new SerializationException(var13);
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var12) {
         }
      }

      return var3.toByteArray();
   }

   private static Object method9717(byte[] var0) {
      ByteArrayInputStream var3 = new ByteArrayInputStream(var0);
      ObjectInputStream var4 = null;

      Object var6;
      try {
         var4 = new ObjectInputStream(var3);
         Object var5 = var4.readObject();
         var6 = var5;
      } catch (Exception var15) {
         throw new SerializationException(var15);
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var14) {
         }
      }

      return var6;
   }

   public int method9718() {
      return this.field16267;
   }
}
