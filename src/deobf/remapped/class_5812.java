package remapped;

import com.sun.xml.internal.ws.encoding.soap.SerializationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import sun.misc.Cleaner;

public class class_5812 extends class_7975 {
   private static final long field_29354 = -4096759496772248522L;
   private Object[] field_29352;
   private class_4516 field_29350;
   private int field_29349;
   private long field_29353;
   private byte[] field_29351;

   public class_5812(long var1) {
      this(var1, 1024);
   }

   public class_5812(long var1, int var3) {
      this(var1, var3, true);
   }

   public class_5812(long var1, int var3, boolean var4) {
      this.field_40836 = class_4903.field_25348;
      this.field_40844 = 1L;
      if (var1 > 0L) {
         if (var3 > 0) {
            this.field_40837 = var1;
            this.field_29353 = var1 * (long)var3;
            this.field_29349 = var3;
            if (var1 <= (long)method_36102()) {
               this.field_29352 = new Object[(int)var1];
            } else {
               this.field_40840 = class_3685.field_18064.allocateMemory(this.field_29353 * this.field_40844);
               if (var4) {
                  this.method_36132(this.field_29353);
               }

               Cleaner.create(this, new class_5209(this.field_40840, this.field_29353, this.field_40844));
               class_3506.method_16126(this.field_29353 * this.field_40844);
               this.field_29350 = new class_4516(var1);
               this.field_29351 = new byte[var3];
            }
         } else {
            throw new IllegalArgumentException(var3 + " is not a positive int value.");
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value.");
      }
   }

   public class_5812(long var1, Object var3) {
      this.field_40836 = class_4903.field_25348;
      this.field_40844 = 1L;
      if (var1 > 0L) {
         this.field_40837 = var1;
         this.field_40838 = true;
         this.field_29352 = new Object[]{var3};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public class_5812(Object[] var1) {
      this.field_40836 = class_4903.field_25348;
      this.field_40844 = 1L;
      this.field_40837 = (long)var1.length;
      this.field_29352 = var1;
   }

   public class_5812 clone() {
      if (!this.field_40838) {
         class_5812 var3 = new class_5812(this.field_40837, class_6806.method_31158(1, this.field_29349), false);
         class_3685.method_17120(this, 0L, var3, 0L, this.field_40837);
         return var3;
      } else {
         return new class_5812(this.field_40837, this.method_36098(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         class_5812 var4 = (class_5812)var1;
         boolean var5 = this.field_29349 == var4.field_29349 && this.field_29352 == var4.field_29352;
         if (this.field_29350 != null && var4.field_29350 != null) {
            return var5 && this.field_29350.equals(var4.field_29350);
         } else {
            return this.field_29350 != var4.field_29350 ? false : var5;
         }
      }
   }

   @Override
   public int hashCode() {
      int var3 = 29 * super.hashCode() + (this.field_29352 == null ? 0 : this.field_29352.hashCode());
      var3 = 29 * var3 + (this.field_29349 ^ this.field_29349 >>> 16);
      return 29 * var3 + (this.field_29350 == null ? 0 : this.field_29350.hashCode());
   }

   @Override
   public final Object method_36098(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? this.field_29352[(int)var1] : this.field_29352[0];
      } else {
         short var5 = this.field_29350.method_36124(var1);
         if (var5 < 0) {
            return null;
         } else {
            long var6 = this.field_40844 * var1 * (long)this.field_29349;

            for (int var8 = 0; var8 < var5; var8++) {
               this.field_29351[var8] = class_3685.field_18064.getByte(this.field_40840 + var6 + this.field_40844 * (long)var8);
            }

            return method_26319(this.field_29351);
         }
      }
   }

   @Override
   public final Object method_36085(long var1) {
      short var5 = this.field_29350.method_36124(var1);
      if (var5 < 0) {
         return null;
      } else {
         long var6 = this.field_40844 * var1 * (long)this.field_29349;

         for (int var8 = 0; var8 < var5; var8++) {
            this.field_29351[var8] = class_3685.field_18064.getByte(this.field_40840 + var6 + this.field_40844 * (long)var8);
         }

         return method_26319(this.field_29351);
      }
   }

   @Override
   public final boolean method_36084(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final byte method_36121(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short method_36103(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short method_36124(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final int method_36079(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final long method_36076(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final float method_36133(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final double method_36107(long var1) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   public final Object[] method_26322() {
      return this.field_29352;
   }

   @Override
   public final boolean[] method_36110() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final boolean[] method_36111(boolean[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final byte[] method_36104() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final byte[] method_36105(byte[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short[] method_36090() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final short[] method_36091(short[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final int[] method_36087() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final int[] method_36088(int[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final long[] method_36125() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final long[] method_36126(long[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final float[] method_36095() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final float[] method_36096(float[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final double[] method_36077() {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final double[] method_36078(double[] var1, long var2, long var4, long var6) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36128(long var1, Object var3) {
      if (var3 != null) {
         byte[] var6 = method_26320(var3);
         if (var6.length > this.field_29349) {
            throw new IllegalArgumentException("Object  " + var3 + " is too long.");
         }

         int var7 = var6.length;
         if (var7 > 32767) {
            throw new IllegalArgumentException("Object  " + var3 + " is too long.");
         }

         this.field_29350.method_36129(var1, (short)var7);
         long var8 = this.field_40844 * var1 * (long)this.field_29349;

         for (int var10 = 0; var10 < var7; var10++) {
            class_3685.field_18064.putByte(this.field_40840 + var8 + this.field_40844 * (long)var10, var6[var10]);
         }
      } else {
         this.field_29350.method_36129(var1, (short)-1);
      }
   }

   @Override
   public final void method_36122(long var1, Object var3) {
      if (var3 != null) {
         if (this.field_40840 == 0L) {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_29352[(int)var1] = var3;
         } else {
            byte[] var6 = method_26320(var3);
            if (var6.length > this.field_29349) {
               throw new IllegalArgumentException("Object  " + var3 + " is too long.");
            }

            int var7 = var6.length;
            if (var7 > 32767) {
               throw new IllegalArgumentException("Object  " + var3 + " is too long.");
            }

            this.field_29350.method_36129(var1, (short)var7);
            long var8 = this.field_40844 * var1 * (long)this.field_29349;

            for (int var10 = 0; var10 < var7; var10++) {
               class_3685.field_18064.putByte(this.field_40840 + var8 + this.field_40844 * (long)var10, var6[var10]);
            }
         }
      } else if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_29352[(int)var1] = null;
      } else {
         this.field_29350.method_36129(var1, (short)-1);
      }
   }

   @Override
   public final void method_36082(long var1, Object var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36122(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   @Override
   public final void method_36109(long var1, boolean var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36117(long var1, byte var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36086(long var1, short var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36129(long var1, short var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36092(long var1, int var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36131(long var1, long var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36123(long var1, float var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   @Override
   public final void method_36114(long var1, double var3) {
      throw new UnsupportedOperationException("Not supported yet");
   }

   private static byte[] method_26320(Object var0) {
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

   private static Object method_26319(byte[] var0) {
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

   public int method_26321() {
      return this.field_29349;
   }
}
