package remapped;

public class class_8222 {
   private static final int field_42204 = 1;
   private static final int field_42200 = 2;
   private static final int field_42202 = 0;
   private static final long field_42207 = 1L;
   private static final long field_42209 = 2L;
   private static final long field_42205 = 0L;
   private final int field_42206;
   private final int field_42203;
   private final long field_42208;
   private final long field_42199;

   public class_8222(long var1, long var3) {
      this.field_42206 = (int)var3;
      this.field_42203 = (int)var1;
      this.field_42208 = var3;
      this.field_42199 = var1;
   }

   public int method_37631(int var1, int var2) {
      int var5 = var2 & 1;
      int var6 = var1 << 1;
      if (var1 == 0) {
         if (var2 == 1 || var2 == this.field_42206 + 1) {
            return Integer.MIN_VALUE;
         } else if (var2 == this.field_42206) {
            return 1;
         } else if (var2 < this.field_42206) {
            return var2;
         } else {
            return var5 != 0 ? -((this.field_42206 << 1) - var2 + 2) : (this.field_42206 << 1) - var2;
         }
      } else if (var2 > 1) {
         if (var2 != this.field_42206 && var2 != this.field_42206 + 1) {
            if (var2 < this.field_42206) {
               return this.field_42206 * var1 + var2;
            } else {
               return var5 != 0 ? -(this.field_42206 * (this.field_42203 + 2 - var1) - var2 + 2) : this.field_42206 * (this.field_42203 + 2 - var1) - var2;
            }
         } else if (var6 != this.field_42203) {
            if (var6 >= this.field_42203) {
               return this.field_42206 * var1 + 1 - var5;
            } else {
               return var5 != 0 ? -(this.field_42206 * (this.field_42203 - var1)) : this.field_42206 * (this.field_42203 - var1) + 1;
            }
         } else {
            return var5 != 1 ? (this.field_42203 * this.field_42206 >> 1) + 1 : Integer.MIN_VALUE;
         }
      } else if (var6 != this.field_42203) {
         if (var6 >= this.field_42203) {
            return var5 != 0 ? -(this.field_42206 * (this.field_42203 - var1) + 1) : this.field_42206 * (this.field_42203 - var1);
         } else {
            return this.field_42206 * var1 + var5;
         }
      } else {
         return var5 != 1 ? this.field_42203 * this.field_42206 >> 1 : Integer.MIN_VALUE;
      }
   }

   public long method_37632(long var1, long var3) {
      long var7 = var3 & 1L;
      long var9 = var1 << 1;
      if (var1 == 0L) {
         if (var3 == 1L || var3 == this.field_42208 + 1L) {
            return Long.MIN_VALUE;
         } else if (var3 == this.field_42208) {
            return 1L;
         } else if (var3 < this.field_42208) {
            return var3;
         } else {
            return var7 != 0L ? -((this.field_42208 << 1) - var3 + 2L) : (this.field_42208 << 1) - var3;
         }
      } else if (var3 > 1L) {
         if (var3 != this.field_42208 && var3 != this.field_42208 + 1L) {
            if (var3 < this.field_42208) {
               return this.field_42208 * var1 + var3;
            } else {
               return var7 != 0L ? -(this.field_42208 * (this.field_42199 + 2L - var1) - var3 + 2L) : this.field_42208 * (this.field_42199 + 2L - var1) - var3;
            }
         } else if (var9 != this.field_42199) {
            if (var9 >= this.field_42199) {
               return this.field_42208 * var1 + 1L - var7;
            } else {
               return var7 != 0L ? -(this.field_42208 * (this.field_42199 - var1)) : this.field_42208 * (this.field_42199 - var1) + 1L;
            }
         } else {
            return var7 != 1L ? (this.field_42199 * this.field_42208 >> 1) + 1L : Long.MIN_VALUE;
         }
      } else if (var9 != this.field_42199) {
         if (var9 >= this.field_42199) {
            return var7 != 0L ? -(this.field_42208 * (this.field_42199 - var1) + 1L) : this.field_42208 * (this.field_42199 - var1);
         } else {
            return this.field_42208 * var1 + var7;
         }
      } else {
         return var7 != 1L ? this.field_42199 * this.field_42208 >> 1 : Long.MIN_VALUE;
      }
   }

   public void method_37639(double var1, int var3, int var4, double[] var5, int var6) {
      int var9 = this.method_37631(var3, var4);
      if (var9 < 0) {
         if (var9 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var3, var4));
         }

         var5[var6 - var9] = -var1;
      } else {
         var5[var6 + var9] = var1;
      }
   }

   public void method_37641(double var1, long var3, long var5, class_1702 var7, long var8) {
      long var12 = this.method_37632(var3, var5);
      if (var12 < 0L) {
         if (var12 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var3, var5));
         }

         var7.method_36114(var8 - var12, -var1);
      } else {
         var7.method_36114(var8 + var12, var1);
      }
   }

   public void method_37640(double var1, int var3, int var4, double[][] var5) {
      int var8 = this.method_37631(var3, var4);
      if (var8 < 0) {
         if (var8 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var3, var4));
         }

         var5[-var8 / this.field_42206][-var8 % this.field_42206] = -var1;
      } else {
         var5[var8 / this.field_42206][var8 % this.field_42206] = var1;
      }
   }

   public void method_37642(float var1, int var2, int var3, float[] var4, int var5) {
      int var8 = this.method_37631(var2, var3);
      if (var8 < 0) {
         if (var8 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var2, var3));
         }

         var4[var5 - var8] = -var1;
      } else {
         var4[var5 + var8] = var1;
      }
   }

   public void method_37644(float var1, long var2, long var4, class_4330 var6, long var7) {
      long var11 = this.method_37632(var2, var4);
      if (var11 < 0L) {
         if (var11 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var2, var4));
         }

         var6.method_36123(var7 - var11, -var1);
      } else {
         var6.method_36123(var7 + var11, var1);
      }
   }

   public void method_37643(float var1, int var2, int var3, float[][] var4) {
      int var7 = this.method_37631(var2, var3);
      if (var7 < 0) {
         if (var7 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var2, var3));
         }

         var4[-var7 / this.field_42206][-var7 % this.field_42206] = -var1;
      } else {
         var4[var7 / this.field_42206][var7 % this.field_42206] = var1;
      }
   }

   public double method_37633(int var1, int var2, double[] var3, int var4) {
      int var7 = this.method_37631(var1, var2);
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0 : -var3[var4 - var7];
      } else {
         return var3[var4 + var7];
      }
   }

   public double method_37637(long var1, long var3, class_1702 var5, long var6) {
      long var10 = this.method_37632(var1, var3);
      if (var10 < 0L) {
         return var10 <= Long.MIN_VALUE ? 0.0 : -var5.method_36107(var6 - var10);
      } else {
         return var5.method_36107(var6 + var10);
      }
   }

   public double method_37635(int var1, int var2, double[][] var3) {
      int var6 = this.method_37631(var1, var2);
      if (var6 < 0) {
         return var6 <= Integer.MIN_VALUE ? 0.0 : -var3[-var6 / this.field_42206][-var6 % this.field_42206];
      } else {
         return var3[var6 / this.field_42206][var6 % this.field_42206];
      }
   }

   public float method_37634(int var1, int var2, float[] var3, int var4) {
      int var7 = this.method_37631(var1, var2);
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0F : -var3[var4 - var7];
      } else {
         return var3[var4 + var7];
      }
   }

   public float method_37638(long var1, long var3, class_4330 var5, long var6) {
      long var10 = this.method_37632(var1, var3);
      if (var10 < 0L) {
         return var10 <= Long.MIN_VALUE ? 0.0F : -var5.method_36133(var6 - var10);
      } else {
         return var5.method_36133(var6 + var10);
      }
   }

   public float method_37636(int var1, int var2, float[][] var3) {
      int var6 = this.method_37631(var1, var2);
      if (var6 < 0) {
         return var6 <= Integer.MIN_VALUE ? 0.0F : -var3[-var6 / this.field_42206][-var6 % this.field_42206];
      } else {
         return var3[var6 / this.field_42206][var6 % this.field_42206];
      }
   }
}
