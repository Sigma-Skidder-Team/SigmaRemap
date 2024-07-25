package remapped;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public abstract class class_7975 implements Serializable, Cloneable {
   private static final long field_40841 = 7921589398878016801L;
   public class_4903 field_40836;
   public long field_40837;
   public long field_40844;
   public boolean field_40838 = false;
   public Object field_40843 = null;
   public long field_40840 = 0L;
   private static int field_40839 = 1073741824;
   public static final int field_40842 = 1073741824;

   public class_7975() {
   }

   public class_7975(Object var1, long var2, class_4903 var4, long var5) {
      this.field_40843 = var1;
      this.field_40840 = var2;
      this.field_40836 = var4;
      this.field_40844 = var4.method_22445();
      if (var5 > 0L) {
         this.field_40837 = var5;
      } else {
         throw new IllegalArgumentException(var5 + " is not a positive long value");
      }
   }

   public long method_36127() {
      return this.field_40840;
   }

   public long method_36136() {
      return this.field_40837;
   }

   public class_4903 method_36099() {
      return this.field_40836;
   }

   public abstract Object method_36098(long var1);

   public Object method_36115(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36098(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract Object method_36085(long var1);

   public abstract boolean method_36084(long var1);

   public boolean method_36130(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36084(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract byte method_36121(long var1);

   public byte method_36101(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36121(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract short method_36103(long var1);

   public short method_36100(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36103(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract short method_36124(long var1);

   public short method_36097(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36124(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract int method_36079(long var1);

   public int method_36134(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36079(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract long method_36076(long var1);

   public long method_36075(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36076(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract float method_36133(long var1);

   public float method_36120(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36133(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract double method_36107(long var1);

   public double method_36108(long var1) {
      if (var1 >= 0L && var1 < this.field_40837) {
         return this.method_36107(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract Object method_36116();

   public abstract boolean[] method_36110();

   public abstract boolean[] method_36111(boolean[] var1, long var2, long var4, long var6);

   public abstract byte[] method_36104();

   public abstract byte[] method_36105(byte[] var1, long var2, long var4, long var6);

   public abstract short[] method_36090();

   public abstract short[] method_36091(short[] var1, long var2, long var4, long var6);

   public abstract int[] method_36087();

   public abstract int[] method_36088(int[] var1, long var2, long var4, long var6);

   public abstract long[] method_36125();

   public abstract long[] method_36126(long[] var1, long var2, long var4, long var6);

   public abstract float[] method_36095();

   public abstract float[] method_36096(float[] var1, long var2, long var4, long var6);

   public abstract double[] method_36077();

   public abstract double[] method_36078(double[] var1, long var2, long var4, long var6);

   public void method_36122(long var1, Object var3) {
      if (!(var3 instanceof Boolean)) {
         if (!(var3 instanceof Byte)) {
            if (!(var3 instanceof Short)) {
               if (!(var3 instanceof Integer)) {
                  if (!(var3 instanceof Long)) {
                     if (!(var3 instanceof Float)) {
                        if (!(var3 instanceof Double)) {
                           throw new IllegalArgumentException("Unsupported type.");
                        }

                        this.method_36114(var1, (Double)var3);
                     } else {
                        this.method_36123(var1, (Float)var3);
                     }
                  } else {
                     this.method_36131(var1, (Long)var3);
                  }
               } else {
                  this.method_36092(var1, (Integer)var3);
               }
            } else {
               this.method_36129(var1, (Short)var3);
            }
         } else {
            this.method_36117(var1, (Byte)var3);
         }
      } else {
         this.method_36109(var1, (Boolean)var3);
      }
   }

   public abstract void method_36128(long var1, Object var3);

   public void method_36082(long var1, Object var3) {
      if (!(var3 instanceof Boolean)) {
         if (!(var3 instanceof Byte)) {
            if (!(var3 instanceof Short)) {
               if (!(var3 instanceof Integer)) {
                  if (!(var3 instanceof Long)) {
                     if (!(var3 instanceof Float)) {
                        if (!(var3 instanceof Double)) {
                           throw new IllegalArgumentException("Unsupported type.");
                        }

                        this.method_36081(var1, (Double)var3);
                     } else {
                        this.method_36119(var1, (Float)var3);
                     }
                  } else {
                     this.method_36118(var1, (Long)var3);
                  }
               } else {
                  this.method_36083(var1, (Integer)var3);
               }
            } else {
               this.method_36093(var1, (Short)var3);
            }
         } else {
            this.method_36094(var1, (Byte)var3);
         }
      } else {
         this.method_36135(var1, (Boolean)var3);
      }
   }

   public abstract void method_36109(long var1, boolean var3);

   public void method_36135(long var1, boolean var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36109(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method_36117(long var1, byte var3);

   public void method_36094(long var1, byte var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36117(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method_36086(long var1, short var3);

   public void method_36080(long var1, byte var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36086(var1, (short)var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method_36129(long var1, short var3);

   public void method_36093(long var1, short var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36129(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method_36092(long var1, int var3);

   public void method_36083(long var1, int var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36092(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method_36131(long var1, long var3);

   public void method_36118(long var1, long var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36131(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method_36123(long var1, float var3);

   public void method_36119(long var1, float var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36123(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method_36114(long var1, double var3);

   public void method_36081(long var1, double var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36114(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public boolean method_36106() {
      return this.field_40840 != 0L;
   }

   public boolean method_36089() {
      return this.field_40836.method_22450();
   }

   public boolean method_36112() {
      return this.field_40838;
   }

   public static void method_36113(int var0) {
      if (var0 >= 0) {
         field_40839 = var0;
      } else {
         throw new IllegalArgumentException("index cannot be negative");
      }
   }

   public static int method_36102() {
      return field_40839;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof class_7975) {
         class_7975 var4 = (class_7975)var1;
         boolean var5 = this.field_40836 == var4.field_40836
            && this.field_40837 == var4.field_40837
            && this.field_40844 == var4.field_40844
            && this.field_40838 == var4.field_40838
            && this.field_40840 == var4.field_40840;
         if (this.field_40843 != null && var4.field_40843 != null) {
            var5 = var5 && this.field_40843.equals(var4.field_40843);
         } else if (this.field_40843 == null && var4.field_40843 == null) {
            var5 = var5;
         } else {
            var5 = false;
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = 7;
      var3 = 29 * var3 + (this.field_40836 == null ? 0 : this.field_40836.hashCode());
      var3 = 29 * var3 + (int)(this.field_40837 ^ this.field_40837 >>> 32);
      var3 = 29 * var3 + (int)(this.field_40844 ^ this.field_40844 >>> 32);
      var3 = 29 * var3 + (!this.field_40838 ? 0 : 1);
      var3 = 29 * var3 + (this.field_40843 == null ? 0 : this.field_40843.hashCode());
      return 29 * var3 + (int)(this.field_40840 ^ this.field_40840 >>> 32);
   }

   public void method_36132(long var1) {
      if (this.field_40840 != 0L) {
         int var5 = (int)class_6806.method_31196(var1, (long)class_1266.method_5693());
         if (var5 > 2 && var1 >= class_1266.method_5689()) {
            long var6 = var1 / (long)var5;
            Future[] var8 = new Future[var5];
            long var9 = this.field_40840;

            for (int var11 = 0; var11 < var5; var11++) {
               long var12 = (long)var11 * var6;
               long var14 = var11 == var5 - 1 ? var1 : var12 + var6;
               var8[var11] = class_1266.method_5694(new class_7620(this, var12, var14, var9));
            }

            try {
               class_1266.method_5696(var8);
            } catch (InterruptedException var16) {
               class_3685.field_18064.setMemory(this.field_40840, var1 * this.field_40844, (byte)0);
            } catch (ExecutionException var17) {
               class_3685.field_18064.setMemory(this.field_40840, var1 * this.field_40844, (byte)0);
            }
         } else {
            class_3685.field_18064.setMemory(this.field_40840, var1 * this.field_40844, (byte)0);
         }
      }
   }
}
