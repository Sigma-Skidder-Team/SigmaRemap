package mapped;

public class Class9394 {
   private static final int field43588 = 1;
   private static final int field43589 = 2;
   private static final int field43590 = 0;
   private static final long field43591 = 1L;
   private static final long field43592 = 2L;
   private static final long field43593 = 0L;
   private final int field43594;
   private final int field43595;
   private final long field43596;
   private final long field43597;

   public Class9394(long var1, long var3) {
      this.field43594 = (int)var3;
      this.field43595 = (int)var1;
      this.field43596 = var3;
      this.field43597 = var1;
   }

   public int method35661(int var1, int var2) {
      int var5 = var2 & 1;
      int var6 = var1 << 1;
      if (var1 == 0) {
         if (var2 == 1 || var2 == this.field43594 + 1) {
            return Integer.MIN_VALUE;
         } else if (var2 == this.field43594) {
            return 1;
         } else if (var2 < this.field43594) {
            return var2;
         } else {
            return var5 != 0 ? -((this.field43594 << 1) - var2 + 2) : (this.field43594 << 1) - var2;
         }
      } else if (var2 > 1) {
         if (var2 != this.field43594 && var2 != this.field43594 + 1) {
            if (var2 < this.field43594) {
               return this.field43594 * var1 + var2;
            } else {
               return var5 != 0 ? -(this.field43594 * (this.field43595 + 2 - var1) - var2 + 2) : this.field43594 * (this.field43595 + 2 - var1) - var2;
            }
         } else if (var6 != this.field43595) {
            if (var6 >= this.field43595) {
               return this.field43594 * var1 + 1 - var5;
            } else {
               return var5 != 0 ? -(this.field43594 * (this.field43595 - var1)) : this.field43594 * (this.field43595 - var1) + 1;
            }
         } else {
            return var5 != 1 ? (this.field43595 * this.field43594 >> 1) + 1 : Integer.MIN_VALUE;
         }
      } else if (var6 != this.field43595) {
         if (var6 >= this.field43595) {
            return var5 != 0 ? -(this.field43594 * (this.field43595 - var1) + 1) : this.field43594 * (this.field43595 - var1);
         } else {
            return this.field43594 * var1 + var5;
         }
      } else {
         return var5 != 1 ? this.field43595 * this.field43594 >> 1 : Integer.MIN_VALUE;
      }
   }

   public long method35662(long var1, long var3) {
      long var7 = var3 & 1L;
      long var9 = var1 << 1;
      if (var1 == 0L) {
         if (var3 == 1L || var3 == this.field43596 + 1L) {
            return Long.MIN_VALUE;
         } else if (var3 == this.field43596) {
            return 1L;
         } else if (var3 < this.field43596) {
            return var3;
         } else {
            return var7 != 0L ? -((this.field43596 << 1) - var3 + 2L) : (this.field43596 << 1) - var3;
         }
      } else if (var3 > 1L) {
         if (var3 != this.field43596 && var3 != this.field43596 + 1L) {
            if (var3 < this.field43596) {
               return this.field43596 * var1 + var3;
            } else {
               return var7 != 0L ? -(this.field43596 * (this.field43597 + 2L - var1) - var3 + 2L) : this.field43596 * (this.field43597 + 2L - var1) - var3;
            }
         } else if (var9 != this.field43597) {
            if (var9 >= this.field43597) {
               return this.field43596 * var1 + 1L - var7;
            } else {
               return var7 != 0L ? -(this.field43596 * (this.field43597 - var1)) : this.field43596 * (this.field43597 - var1) + 1L;
            }
         } else {
            return var7 != 1L ? (this.field43597 * this.field43596 >> 1) + 1L : Long.MIN_VALUE;
         }
      } else if (var9 != this.field43597) {
         if (var9 >= this.field43597) {
            return var7 != 0L ? -(this.field43596 * (this.field43597 - var1) + 1L) : this.field43596 * (this.field43597 - var1);
         } else {
            return this.field43596 * var1 + var7;
         }
      } else {
         return var7 != 1L ? this.field43597 * this.field43596 >> 1 : Long.MIN_VALUE;
      }
   }

   public void method35663(double var1, int var3, int var4, double[] var5, int var6) {
      int var9 = this.method35661(var3, var4);
      if (var9 < 0) {
         if (var9 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var3, var4));
         }

         var5[var6 - var9] = -var1;
      } else {
         var5[var6 + var9] = var1;
      }
   }

   public void method35664(double var1, long var3, long var5, Class2381 var7, long var8) {
      long var12 = this.method35662(var3, var5);
      if (var12 < 0L) {
         if (var12 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var3, var5));
         }

         var7.method9687(var8 - var12, -var1);
      } else {
         var7.method9687(var8 + var12, var1);
      }
   }

   public void method35665(double var1, int var3, int var4, double[][] var5) {
      int var8 = this.method35661(var3, var4);
      if (var8 < 0) {
         if (var8 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var3, var4));
         }

         var5[-var8 / this.field43594][-var8 % this.field43594] = -var1;
      } else {
         var5[var8 / this.field43594][var8 % this.field43594] = var1;
      }
   }

   public void method35666(float var1, int var2, int var3, float[] var4, int var5) {
      int var8 = this.method35661(var2, var3);
      if (var8 < 0) {
         if (var8 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var2, var3));
         }

         var4[var5 - var8] = -var1;
      } else {
         var4[var5 + var8] = var1;
      }
   }

   public void method35667(float var1, long var2, long var4, Class2378 var6, long var7) {
      long var11 = this.method35662(var2, var4);
      if (var11 < 0L) {
         if (var11 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var2, var4));
         }

         var6.method9685(var7 - var11, -var1);
      } else {
         var6.method9685(var7 + var11, var1);
      }
   }

   public void method35668(float var1, int var2, int var3, float[][] var4) {
      int var7 = this.method35661(var2, var3);
      if (var7 < 0) {
         if (var7 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var2, var3));
         }

         var4[-var7 / this.field43594][-var7 % this.field43594] = -var1;
      } else {
         var4[var7 / this.field43594][var7 % this.field43594] = var1;
      }
   }

   public double method35669(int var1, int var2, double[] var3, int var4) {
      int var7 = this.method35661(var1, var2);
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0 : -var3[var4 - var7];
      } else {
         return var3[var4 + var7];
      }
   }

   public double method35670(long var1, long var3, Class2381 var5, long var6) {
      long var10 = this.method35662(var1, var3);
      if (var10 < 0L) {
         return var10 <= Long.MIN_VALUE ? 0.0 : -var5.method9653(var6 - var10);
      } else {
         return var5.method9653(var6 + var10);
      }
   }

   public double method35671(int var1, int var2, double[][] var3) {
      int var6 = this.method35661(var1, var2);
      if (var6 < 0) {
         return var6 <= Integer.MIN_VALUE ? 0.0 : -var3[-var6 / this.field43594][-var6 % this.field43594];
      } else {
         return var3[var6 / this.field43594][var6 % this.field43594];
      }
   }

   public float method35672(int var1, int var2, float[] var3, int var4) {
      int var7 = this.method35661(var1, var2);
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0F : -var3[var4 - var7];
      } else {
         return var3[var4 + var7];
      }
   }

   public float method35673(long var1, long var3, Class2378 var5, long var6) {
      long var10 = this.method35662(var1, var3);
      if (var10 < 0L) {
         return var10 <= Long.MIN_VALUE ? 0.0F : -var5.method9651(var6 - var10);
      } else {
         return var5.method9651(var6 + var10);
      }
   }

   public float method35674(int var1, int var2, float[][] var3) {
      int var6 = this.method35661(var1, var2);
      if (var6 < 0) {
         return var6 <= Integer.MIN_VALUE ? 0.0F : -var3[-var6 / this.field43594][-var6 % this.field43594];
      } else {
         return var3[var6 / this.field43594][var6 % this.field43594];
      }
   }
}
