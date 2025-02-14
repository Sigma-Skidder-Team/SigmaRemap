package mapped;

public class Class9183 {
   private static final int field42168 = 1;
   private static final int field42169 = 2;
   private static final int field42170 = 0;
   private static final long field42171 = 1L;
   private static final long field42172 = 2L;
   private static final long field42173 = 0L;
   private final int field42174;
   private final long field42175;
   private final int field42176;
   private final long field42177;
   private final int field42178;
   private final long field42179;
   private final int field42180;
   private final long field42181;
   private final int field42182;
   private final long field42183;

   public Class9183(long var1, long var3, long var5) {
      this.field42180 = (int)var1;
      this.field42176 = (int)var3;
      this.field42174 = (int)var5;
      this.field42178 = (int)var5;
      this.field42182 = (int)var3 * this.field42178;
      this.field42181 = var1;
      this.field42177 = var3;
      this.field42175 = var5;
      this.field42179 = var5;
      this.field42183 = var3 * this.field42179;
   }

   public int method34348(int var1, int var2, int var3) {
      int var6 = var3 & 1;
      int var7 = var2 << 1;
      int var8 = var1 << 1;
      int var9 = var1 != 0 ? this.field42180 - var1 : 0;
      int var10 = var2 != 0 ? this.field42176 - var2 : 0;
      if (var3 > 1) {
         if (var3 >= this.field42174) {
            if (var3 <= this.field42174 + 1) {
               if (var2 != 0) {
                  if (var7 >= this.field42176) {
                     if (var7 <= this.field42176) {
                        if (var1 != 0) {
                           if (var8 >= this.field42180) {
                              if (var8 <= this.field42180) {
                                 int var25 = var1 * this.field42182 + var2 * this.field42178;
                                 return var6 != 0 ? Integer.MIN_VALUE : var25 + 1;
                              } else {
                                 int var24 = var1 * this.field42182 + var2 * this.field42178;
                                 return var6 != 0 ? var24 : var24 + 1;
                              }
                           } else {
                              int var23 = var9 * this.field42182 + var2 * this.field42178;
                              return var6 != 0 ? -var23 : var23 + 1;
                           }
                        } else {
                           int var22 = var2 * this.field42178 + 1;
                           return var6 != 0 ? Integer.MIN_VALUE : var22;
                        }
                     } else {
                        int var21 = var1 * this.field42182 + var2 * this.field42178;
                        return var6 != 0 ? var21 : var21 + 1;
                     }
                  } else {
                     int var20 = var9 * this.field42182 + var10 * this.field42178;
                     return var6 != 0 ? -var20 : var20 + 1;
                  }
               } else if (var1 != 0) {
                  if (var8 >= this.field42180) {
                     if (var8 <= this.field42180) {
                        int var19 = var1 * this.field42182;
                        return var6 != 0 ? Integer.MIN_VALUE : var19 + 1;
                     } else {
                        int var18 = var1 * this.field42182;
                        return var6 != 0 ? var18 : var18 + 1;
                     }
                  } else {
                     int var17 = var9 * this.field42182;
                     return var6 != 0 ? -var17 : var17 + 1;
                  }
               } else {
                  return var6 != 0 ? Integer.MIN_VALUE : 1;
               }
            } else {
               int var16 = (this.field42174 << 1) - var3;
               int var12 = var9 * this.field42182 + var10 * this.field42178 + var16;
               return var6 != 0 ? -(var12 + 2) : var12;
            }
         } else {
            return var1 * this.field42182 + var2 * this.field42178 + var3;
         }
      } else if (var2 != 0) {
         if (var7 >= this.field42176) {
            if (var7 <= this.field42176) {
               if (var1 != 0) {
                  if (var8 >= this.field42180) {
                     if (var8 <= this.field42180) {
                        int var15 = var1 * this.field42182 + var2 * this.field42178;
                        return var6 != 0 ? Integer.MIN_VALUE : var15;
                     } else {
                        int var14 = var9 * this.field42182 + var2 * this.field42178;
                        return var6 != 0 ? -(var14 + 1) : var14;
                     }
                  } else {
                     return var1 * this.field42182 + var2 * this.field42178 + var3;
                  }
               } else {
                  return var6 != 0 ? Integer.MIN_VALUE : var2 * this.field42178;
               }
            } else {
               int var13 = var9 * this.field42182 + var10 * this.field42178;
               return var6 != 0 ? -(var13 + 1) : var13;
            }
         } else {
            return var1 * this.field42182 + var2 * this.field42178 + var3;
         }
      } else if (var1 != 0) {
         if (var8 >= this.field42180) {
            if (var8 <= this.field42180) {
               return var6 != 0 ? Integer.MIN_VALUE : var1 * this.field42182;
            } else {
               int var11 = var9 * this.field42182;
               return var6 != 0 ? -(var11 + 1) : var11;
            }
         } else {
            return var1 * this.field42182 + var3;
         }
      } else {
         return var3 != 0 ? Integer.MIN_VALUE : 0;
      }
   }

   public long method34349(long var1, long var3, long var5) {
      long var9 = var5 & 1L;
      long var11 = var3 << 1;
      long var13 = var1 << 1;
      long var15 = var1 != 0L ? this.field42181 - var1 : 0L;
      long var17 = var3 != 0L ? this.field42177 - var3 : 0L;
      if (var5 > 1L) {
         if (var5 >= this.field42175) {
            if (var5 <= this.field42175 + 1L) {
               if (var3 != 0L) {
                  if (var11 >= this.field42177) {
                     if (var11 <= this.field42177) {
                        if (var1 != 0L) {
                           if (var13 >= this.field42181) {
                              if (var13 <= this.field42181) {
                                 long var35 = var1 * this.field42183 + var3 * this.field42179;
                                 return var9 != 0L ? Long.MIN_VALUE : var35 + 1L;
                              } else {
                                 long var34 = var1 * this.field42183 + var3 * this.field42179;
                                 return var9 != 0L ? var34 : var34 + 1L;
                              }
                           } else {
                              long var33 = var15 * this.field42183 + var3 * this.field42179;
                              return var9 != 0L ? -var33 : var33 + 1L;
                           }
                        } else {
                           long var32 = var3 * this.field42179 + 1L;
                           return var9 != 0L ? Long.MIN_VALUE : var32;
                        }
                     } else {
                        long var31 = var1 * this.field42183 + var3 * this.field42179;
                        return var9 != 0L ? var31 : var31 + 1L;
                     }
                  } else {
                     long var30 = var15 * this.field42183 + var17 * this.field42179;
                     return var9 != 0L ? -var30 : var30 + 1L;
                  }
               } else if (var1 != 0L) {
                  if (var13 >= this.field42181) {
                     if (var13 <= this.field42181) {
                        long var29 = var1 * this.field42183;
                        return var9 != 0L ? Long.MIN_VALUE : var29 + 1L;
                     } else {
                        long var28 = var1 * this.field42183;
                        return var9 != 0L ? var28 : var28 + 1L;
                     }
                  } else {
                     long var27 = var15 * this.field42183;
                     return var9 != 0L ? -var27 : var27 + 1L;
                  }
               } else {
                  return var9 != 0L ? Long.MIN_VALUE : 1L;
               }
            } else {
               long var26 = (this.field42175 << 1) - var5;
               long var21 = var15 * this.field42183 + var17 * this.field42179 + var26;
               return var9 != 0L ? -(var21 + 2L) : var21;
            }
         } else {
            return var1 * this.field42183 + var3 * this.field42179 + var5;
         }
      } else if (var3 != 0L) {
         if (var11 >= this.field42177) {
            if (var11 <= this.field42177) {
               if (var1 != 0L) {
                  if (var13 >= this.field42181) {
                     if (var13 <= this.field42181) {
                        long var25 = var1 * this.field42183 + var3 * this.field42179;
                        return var9 != 0L ? Long.MIN_VALUE : var25;
                     } else {
                        long var24 = var15 * this.field42183 + var3 * this.field42179;
                        return var9 != 0L ? -(var24 + 1L) : var24;
                     }
                  } else {
                     return var1 * this.field42183 + var3 * this.field42179 + var5;
                  }
               } else {
                  return var9 != 0L ? Long.MIN_VALUE : var3 * this.field42179;
               }
            } else {
               long var23 = var15 * this.field42183 + var17 * this.field42179;
               return var9 != 0L ? -(var23 + 1L) : var23;
            }
         } else {
            return var1 * this.field42183 + var3 * this.field42179 + var5;
         }
      } else if (var1 != 0L) {
         if (var13 >= this.field42181) {
            if (var13 <= this.field42181) {
               return var9 != 0L ? Long.MIN_VALUE : var1 * this.field42183;
            } else {
               long var19 = var15 * this.field42183;
               return var9 != 0L ? -(var19 + 1L) : var19;
            }
         } else {
            return var1 * this.field42183 + var5;
         }
      } else {
         return var5 != 0L ? Long.MIN_VALUE : 0L;
      }
   }

   public void method34350(double var1, int var3, int var4, int var5, double[] var6, int var7) {
      int var10 = this.method34348(var3, var4, var5);
      if (var10 < 0) {
         if (var10 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var3, var4, var5));
         }

         var6[var7 - var10] = -var1;
      } else {
         var6[var7 + var10] = var1;
      }
   }

   public void method34351(double var1, long var3, long var5, long var7, Class2381 var9, long var10) {
      long var14 = this.method34349(var3, var5, var7);
      if (var14 < 0L) {
         if (var14 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var3, var5, var7));
         }

         var9.method9687(var10 - var14, -var1);
      } else {
         var9.method9687(var10 + var14, var1);
      }
   }

   public void method34352(double var1, int var3, int var4, int var5, double[][][] var6) {
      int var9 = this.method34348(var3, var4, var5);
      int var10 = Class9044.method33588(var9);
      int var11 = var10 / this.field42182;
      int var12 = var10 % this.field42182;
      int var13 = var12 / this.field42178;
      int var14 = var12 % this.field42178;
      if (var9 < 0) {
         if (var9 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var4, var5));
         }

         var6[var11][var13][var14] = -var1;
      } else {
         var6[var11][var13][var14] = var1;
      }
   }

   public void method34353(float var1, int var2, int var3, int var4, float[] var5, int var6) {
      int var9 = this.method34348(var2, var3, var4);
      if (var9 < 0) {
         if (var9 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var2, var3, var4));
         }

         var5[var6 - var9] = -var1;
      } else {
         var5[var6 + var9] = var1;
      }
   }

   public void method34354(float var1, long var2, long var4, long var6, Class2378 var8, long var9) {
      long var13 = this.method34349(var2, var4, var6);
      if (var13 < 0L) {
         if (var13 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var2, var4, var6));
         }

         var8.method9685(var9 - var13, -var1);
      } else {
         var8.method9685(var9 + var13, var1);
      }
   }

   public void method34355(float var1, int var2, int var3, int var4, float[][][] var5) {
      int var8 = this.method34348(var2, var3, var4);
      int var9 = Class9044.method33588(var8);
      int var10 = var9 / this.field42182;
      int var11 = var9 % this.field42182;
      int var12 = var11 / this.field42178;
      int var13 = var11 % this.field42178;
      if (var8 < 0) {
         if (var8 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var2, var3, var4));
         }

         var5[var10][var12][var13] = -var1;
      } else {
         var5[var10][var12][var13] = var1;
      }
   }

   public double method34356(int var1, int var2, int var3, double[] var4, int var5) {
      int var8 = this.method34348(var1, var2, var3);
      if (var8 < 0) {
         return var8 <= Integer.MIN_VALUE ? 0.0 : -var4[var5 - var8];
      } else {
         return var4[var5 + var8];
      }
   }

   public double method34357(long var1, long var3, long var5, Class2381 var7, long var8) {
      long var12 = this.method34349(var1, var3, var5);
      if (var12 < 0L) {
         return var12 <= Long.MIN_VALUE ? 0.0 : -var7.method9653(var8 - var12);
      } else {
         return var7.method9653(var8 + var12);
      }
   }

   public double method34358(int var1, int var2, int var3, double[][][] var4) {
      int var7 = this.method34348(var1, var2, var3);
      int var8 = Class9044.method33588(var7);
      int var9 = var8 / this.field42182;
      int var10 = var8 % this.field42182;
      int var11 = var10 / this.field42178;
      int var12 = var10 % this.field42178;
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0 : -var4[var9][var11][var12];
      } else {
         return var4[var9][var11][var12];
      }
   }

   public float method34359(int var1, int var2, int var3, float[] var4, int var5) {
      int var8 = this.method34348(var1, var2, var3);
      if (var8 < 0) {
         return var8 <= Integer.MIN_VALUE ? 0.0F : -var4[var5 - var8];
      } else {
         return var4[var5 + var8];
      }
   }

   public float method34360(long var1, long var3, long var5, Class2378 var7, long var8) {
      long var12 = this.method34349(var1, var3, var5);
      if (var12 < 0L) {
         return var12 <= Long.MIN_VALUE ? 0.0F : -var7.method9651(var8 - var12);
      } else {
         return var7.method9651(var8 + var12);
      }
   }

   public float method34361(int var1, int var2, int var3, float[][][] var4) {
      int var7 = this.method34348(var1, var2, var3);
      int var8 = Class9044.method33588(var7);
      int var9 = var8 / this.field42182;
      int var10 = var8 % this.field42182;
      int var11 = var10 / this.field42178;
      int var12 = var10 % this.field42178;
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0F : -var4[var9][var11][var12];
      } else {
         return var4[var9][var11][var12];
      }
   }
}
