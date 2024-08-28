package mapped;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public abstract class Class2373 implements Serializable, Cloneable {
   private static final long field16232 = 7921589398878016801L;
   public Class2178 field16233;
   public long field16234;
   public long field16235;
   public boolean field16236 = false;
   public Object field16237 = null;
   public long field16238 = 0L;
   private static int field16239 = 1073741824;
   public static final int field16240 = 1073741824;

   public Class2373() {
   }

   public Class2373(Object var1, long var2, Class2178 var4, long var5) {
      this.field16237 = var1;
      this.field16238 = var2;
      this.field16233 = var4;
      this.field16235 = var4.method8894();
      if (var5 > 0L) {
         this.field16234 = var5;
      } else {
         throw new IllegalArgumentException(var5 + " is not a positive long value");
      }
   }

   public long method9633() {
      return this.field16238;
   }

   public long method9634() {
      return this.field16234;
   }

   public Class2178 method9635() {
      return this.field16233;
   }

   public abstract Object method9636(long var1);

   public Object method9637(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9636(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract Object method9638(long var1);

   public abstract boolean method9639(long var1);

   public boolean method9640(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9639(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract byte method9641(long var1);

   public byte method9642(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9641(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract short method9643(long var1);

   public short method9644(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9643(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract short method9645(long var1);

   public short method9646(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9645(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract int method9647(long var1);

   public int method9648(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9647(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract long method9649(long var1);

   public long method9650(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9649(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract float method9651(long var1);

   public float method9652(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9651(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract double method9653(long var1);

   public double method9654(long var1) {
      if (var1 >= 0L && var1 < this.field16234) {
         return this.method9653(var1);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract Object method9655();

   public abstract boolean[] method9656();

   public abstract boolean[] method9657(boolean[] var1, long var2, long var4, long var6);

   public abstract byte[] method9658();

   public abstract byte[] method9659(byte[] var1, long var2, long var4, long var6);

   public abstract short[] method9660();

   public abstract short[] method9661(short[] var1, long var2, long var4, long var6);

   public abstract int[] method9662();

   public abstract int[] method9663(int[] var1, long var2, long var4, long var6);

   public abstract long[] method9664();

   public abstract long[] method9665(long[] var1, long var2, long var4, long var6);

   public abstract float[] method9666();

   public abstract float[] method9667(float[] var1, long var2, long var4, long var6);

   public abstract double[] method9668();

   public abstract double[] method9669(double[] var1, long var2, long var4, long var6);

   public void method9670(long var1, Object var3) {
      if (!(var3 instanceof Boolean)) {
         if (!(var3 instanceof Byte)) {
            if (!(var3 instanceof Short)) {
               if (!(var3 instanceof Integer)) {
                  if (!(var3 instanceof Long)) {
                     if (!(var3 instanceof Float)) {
                        if (!(var3 instanceof Double)) {
                           throw new IllegalArgumentException("Unsupported type.");
                        }

                        this.method9687(var1, (Double)var3);
                     } else {
                        this.method9685(var1, (Float)var3);
                     }
                  } else {
                     this.method9683(var1, (Long)var3);
                  }
               } else {
                  this.method9681(var1, (Integer)var3);
               }
            } else {
               this.method9679(var1, (Short)var3);
            }
         } else {
            this.method9675(var1, (Byte)var3);
         }
      } else {
         this.method9673(var1, (Boolean)var3);
      }
   }

   public abstract void method9671(long var1, Object var3);

   public void method9672(long var1, Object var3) {
      if (!(var3 instanceof Boolean)) {
         if (!(var3 instanceof Byte)) {
            if (!(var3 instanceof Short)) {
               if (!(var3 instanceof Integer)) {
                  if (!(var3 instanceof Long)) {
                     if (!(var3 instanceof Float)) {
                        if (!(var3 instanceof Double)) {
                           throw new IllegalArgumentException("Unsupported type.");
                        }

                        this.method9688(var1, (Double)var3);
                     } else {
                        this.method9686(var1, (Float)var3);
                     }
                  } else {
                     this.method9684(var1, (Long)var3);
                  }
               } else {
                  this.method9682(var1, (Integer)var3);
               }
            } else {
               this.method9680(var1, (Short)var3);
            }
         } else {
            this.method9676(var1, (Byte)var3);
         }
      } else {
         this.method9674(var1, (Boolean)var3);
      }
   }

   public abstract void method9673(long var1, boolean var3);

   public void method9674(long var1, boolean var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9673(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method9675(long var1, byte var3);

   public void method9676(long var1, byte var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9675(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method9677(long var1, short var3);

   public void method9678(long var1, byte var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9677(var1, (short)var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method9679(long var1, short var3);

   public void method9680(long var1, short var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9679(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method9681(long var1, int var3);

   public void method9682(long var1, int var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9681(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method9683(long var1, long var3);

   public void method9684(long var1, long var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9683(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method9685(long var1, float var3);

   public void method9686(long var1, float var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9685(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public abstract void method9687(long var1, double var3);

   public void method9688(long var1, double var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9687(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   public boolean method9689() {
      return this.field16238 != 0L;
   }

   public boolean method9690() {
      return this.field16233.method8895();
   }

   public boolean method9691() {
      return this.field16236;
   }

   public static void method9692(int var0) {
      if (var0 >= 0) {
         field16239 = var0;
      } else {
         throw new IllegalArgumentException("index cannot be negative");
      }
   }

   public static int method9693() {
      return field16239;
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
      if (var1 != null && var1 instanceof Class2373) {
         Class2373 var4 = (Class2373)var1;
         boolean var5 = this.field16233 == var4.field16233
            && this.field16234 == var4.field16234
            && this.field16235 == var4.field16235
            && this.field16236 == var4.field16236
            && this.field16238 == var4.field16238;
         if (this.field16237 != null && var4.field16237 != null) {
            var5 = var5 && this.field16237.equals(var4.field16237);
         } else if (this.field16237 == null && var4.field16237 == null) {
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
      var3 = 29 * var3 + (this.field16233 == null ? 0 : this.field16233.hashCode());
      var3 = 29 * var3 + (int)(this.field16234 ^ this.field16234 >>> 32);
      var3 = 29 * var3 + (int)(this.field16235 ^ this.field16235 >>> 32);
      var3 = 29 * var3 + (!this.field16236 ? 0 : 1);
      var3 = 29 * var3 + (this.field16237 == null ? 0 : this.field16237.hashCode());
      return 29 * var3 + (int)(this.field16238 ^ this.field16238 >>> 32);
   }

   public void method9694(long var1) {
      if (this.field16238 != 0L) {
         int var5 = (int)Class9044.method33604(var1, (long)Class7008.method21726());
         if (var5 > 2 && var1 >= Class7008.method21723()) {
            long var6 = var1 / (long)var5;
            Future[] var8 = new Future[var5];
            long var9 = this.field16238;

            for (int var11 = 0; var11 < var5; var11++) {
               long var12 = (long)var11 * var6;
               long var14 = var11 == var5 - 1 ? var1 : var12 + var6;
               var8[var11] = Class7008.method21729(new Class1369(this, var12, var14, var9));
            }

            try {
               Class7008.method21730(var8);
            } catch (InterruptedException var16) {
               Class8133.field34961.setMemory(this.field16238, var1 * this.field16235, (byte)0);
            } catch (ExecutionException var17) {
               Class8133.field34961.setMemory(this.field16238, var1 * this.field16235, (byte)0);
            }
         } else {
            Class8133.field34961.setMemory(this.field16238, var1 * this.field16235, (byte)0);
         }
      }
   }
}
