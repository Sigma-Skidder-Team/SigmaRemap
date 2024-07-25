package remapped;

public class class_7368 {
   private static final int field_37643 = 1;
   private static final int field_37644 = 2;
   private static final int field_37651 = 0;
   private static final long field_37649 = 1L;
   private static final long field_37648 = 2L;
   private static final long field_37653 = 0L;
   private final int field_37640;
   private final long field_37642;
   private final int field_37650;
   private final long field_37645;
   private final int field_37652;
   private final long field_37641;
   private final int field_37646;
   private final long field_37638;
   private final int field_37654;
   private final long field_37647;

   public class_7368(long var1, long var3, long var5) {
      this.field_37646 = (int)var1;
      this.field_37650 = (int)var3;
      this.field_37640 = (int)var5;
      this.field_37652 = (int)var5;
      this.field_37654 = (int)var3 * this.field_37652;
      this.field_37638 = var1;
      this.field_37645 = var3;
      this.field_37642 = var5;
      this.field_37641 = var5;
      this.field_37647 = var3 * this.field_37641;
   }

   public int method_33557(int var1, int var2, int var3) {
      int var6 = var3 & 1;
      int var7 = var2 << 1;
      int var8 = var1 << 1;
      int var9 = var1 != 0 ? this.field_37646 - var1 : 0;
      int var10 = var2 != 0 ? this.field_37650 - var2 : 0;
      if (var3 > 1) {
         if (var3 >= this.field_37640) {
            if (var3 <= this.field_37640 + 1) {
               if (var2 != 0) {
                  if (var7 >= this.field_37650) {
                     if (var7 <= this.field_37650) {
                        if (var1 != 0) {
                           if (var8 >= this.field_37646) {
                              if (var8 <= this.field_37646) {
                                 int var25 = var1 * this.field_37654 + var2 * this.field_37652;
                                 return var6 != 0 ? Integer.MIN_VALUE : var25 + 1;
                              } else {
                                 int var24 = var1 * this.field_37654 + var2 * this.field_37652;
                                 return var6 != 0 ? var24 : var24 + 1;
                              }
                           } else {
                              int var23 = var9 * this.field_37654 + var2 * this.field_37652;
                              return var6 != 0 ? -var23 : var23 + 1;
                           }
                        } else {
                           int var22 = var2 * this.field_37652 + 1;
                           return var6 != 0 ? Integer.MIN_VALUE : var22;
                        }
                     } else {
                        int var21 = var1 * this.field_37654 + var2 * this.field_37652;
                        return var6 != 0 ? var21 : var21 + 1;
                     }
                  } else {
                     int var20 = var9 * this.field_37654 + var10 * this.field_37652;
                     return var6 != 0 ? -var20 : var20 + 1;
                  }
               } else if (var1 != 0) {
                  if (var8 >= this.field_37646) {
                     if (var8 <= this.field_37646) {
                        int var19 = var1 * this.field_37654;
                        return var6 != 0 ? Integer.MIN_VALUE : var19 + 1;
                     } else {
                        int var18 = var1 * this.field_37654;
                        return var6 != 0 ? var18 : var18 + 1;
                     }
                  } else {
                     int var17 = var9 * this.field_37654;
                     return var6 != 0 ? -var17 : var17 + 1;
                  }
               } else {
                  return var6 != 0 ? Integer.MIN_VALUE : 1;
               }
            } else {
               int var16 = (this.field_37640 << 1) - var3;
               int var12 = var9 * this.field_37654 + var10 * this.field_37652 + var16;
               return var6 != 0 ? -(var12 + 2) : var12;
            }
         } else {
            return var1 * this.field_37654 + var2 * this.field_37652 + var3;
         }
      } else if (var2 != 0) {
         if (var7 >= this.field_37650) {
            if (var7 <= this.field_37650) {
               if (var1 != 0) {
                  if (var8 >= this.field_37646) {
                     if (var8 <= this.field_37646) {
                        int var15 = var1 * this.field_37654 + var2 * this.field_37652;
                        return var6 != 0 ? Integer.MIN_VALUE : var15;
                     } else {
                        int var14 = var9 * this.field_37654 + var2 * this.field_37652;
                        return var6 != 0 ? -(var14 + 1) : var14;
                     }
                  } else {
                     return var1 * this.field_37654 + var2 * this.field_37652 + var3;
                  }
               } else {
                  return var6 != 0 ? Integer.MIN_VALUE : var2 * this.field_37652;
               }
            } else {
               int var13 = var9 * this.field_37654 + var10 * this.field_37652;
               return var6 != 0 ? -(var13 + 1) : var13;
            }
         } else {
            return var1 * this.field_37654 + var2 * this.field_37652 + var3;
         }
      } else if (var1 != 0) {
         if (var8 >= this.field_37646) {
            if (var8 <= this.field_37646) {
               return var6 != 0 ? Integer.MIN_VALUE : var1 * this.field_37654;
            } else {
               int var11 = var9 * this.field_37654;
               return var6 != 0 ? -(var11 + 1) : var11;
            }
         } else {
            return var1 * this.field_37654 + var3;
         }
      } else {
         return var3 != 0 ? Integer.MIN_VALUE : 0;
      }
   }

   public long method_33558(long var1, long var3, long var5) {
      long var9 = var5 & 1L;
      long var11 = var3 << 1;
      long var13 = var1 << 1;
      long var15 = var1 != 0L ? this.field_37638 - var1 : 0L;
      long var17 = var3 != 0L ? this.field_37645 - var3 : 0L;
      if (var5 > 1L) {
         if (var5 >= this.field_37642) {
            if (var5 <= this.field_37642 + 1L) {
               if (var3 != 0L) {
                  if (var11 >= this.field_37645) {
                     if (var11 <= this.field_37645) {
                        if (var1 != 0L) {
                           if (var13 >= this.field_37638) {
                              if (var13 <= this.field_37638) {
                                 long var35 = var1 * this.field_37647 + var3 * this.field_37641;
                                 return var9 != 0L ? Long.MIN_VALUE : var35 + 1L;
                              } else {
                                 long var34 = var1 * this.field_37647 + var3 * this.field_37641;
                                 return var9 != 0L ? var34 : var34 + 1L;
                              }
                           } else {
                              long var33 = var15 * this.field_37647 + var3 * this.field_37641;
                              return var9 != 0L ? -var33 : var33 + 1L;
                           }
                        } else {
                           long var32 = var3 * this.field_37641 + 1L;
                           return var9 != 0L ? Long.MIN_VALUE : var32;
                        }
                     } else {
                        long var31 = var1 * this.field_37647 + var3 * this.field_37641;
                        return var9 != 0L ? var31 : var31 + 1L;
                     }
                  } else {
                     long var30 = var15 * this.field_37647 + var17 * this.field_37641;
                     return var9 != 0L ? -var30 : var30 + 1L;
                  }
               } else if (var1 != 0L) {
                  if (var13 >= this.field_37638) {
                     if (var13 <= this.field_37638) {
                        long var29 = var1 * this.field_37647;
                        return var9 != 0L ? Long.MIN_VALUE : var29 + 1L;
                     } else {
                        long var28 = var1 * this.field_37647;
                        return var9 != 0L ? var28 : var28 + 1L;
                     }
                  } else {
                     long var27 = var15 * this.field_37647;
                     return var9 != 0L ? -var27 : var27 + 1L;
                  }
               } else {
                  return var9 != 0L ? Long.MIN_VALUE : 1L;
               }
            } else {
               long var26 = (this.field_37642 << 1) - var5;
               long var21 = var15 * this.field_37647 + var17 * this.field_37641 + var26;
               return var9 != 0L ? -(var21 + 2L) : var21;
            }
         } else {
            return var1 * this.field_37647 + var3 * this.field_37641 + var5;
         }
      } else if (var3 != 0L) {
         if (var11 >= this.field_37645) {
            if (var11 <= this.field_37645) {
               if (var1 != 0L) {
                  if (var13 >= this.field_37638) {
                     if (var13 <= this.field_37638) {
                        long var25 = var1 * this.field_37647 + var3 * this.field_37641;
                        return var9 != 0L ? Long.MIN_VALUE : var25;
                     } else {
                        long var24 = var15 * this.field_37647 + var3 * this.field_37641;
                        return var9 != 0L ? -(var24 + 1L) : var24;
                     }
                  } else {
                     return var1 * this.field_37647 + var3 * this.field_37641 + var5;
                  }
               } else {
                  return var9 != 0L ? Long.MIN_VALUE : var3 * this.field_37641;
               }
            } else {
               long var23 = var15 * this.field_37647 + var17 * this.field_37641;
               return var9 != 0L ? -(var23 + 1L) : var23;
            }
         } else {
            return var1 * this.field_37647 + var3 * this.field_37641 + var5;
         }
      } else if (var1 != 0L) {
         if (var13 >= this.field_37638) {
            if (var13 <= this.field_37638) {
               return var9 != 0L ? Long.MIN_VALUE : var1 * this.field_37647;
            } else {
               long var19 = var15 * this.field_37647;
               return var9 != 0L ? -(var19 + 1L) : var19;
            }
         } else {
            return var1 * this.field_37647 + var5;
         }
      } else {
         return var5 != 0L ? Long.MIN_VALUE : 0L;
      }
   }

   public void method_33551(double var1, int var3, int var4, int var5, double[] var6, int var7) {
      int var10 = this.method_33557(var3, var4, var5);
      if (var10 < 0) {
         if (var10 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var3, var4, var5));
         }

         var6[var7 - var10] = -var1;
      } else {
         var6[var7 + var10] = var1;
      }
   }

   public void method_33553(double var1, long var3, long var5, long var7, class_1702 var9, long var10) {
      long var14 = this.method_33558(var3, var5, var7);
      if (var14 < 0L) {
         if (var14 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var3, var5, var7));
         }

         var9.method_36114(var10 - var14, -var1);
      } else {
         var9.method_36114(var10 + var14, var1);
      }
   }

   public void method_33552(double var1, int var3, int var4, int var5, double[][][] var6) {
      int var9 = this.method_33557(var3, var4, var5);
      int var10 = class_6806.method_31180(var9);
      int var11 = var10 / this.field_37654;
      int var12 = var10 % this.field_37654;
      int var13 = var12 / this.field_37652;
      int var14 = var12 % this.field_37652;
      if (var9 < 0) {
         if (var9 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", var4, var5));
         }

         var6[var11][var13][var14] = -var1;
      } else {
         var6[var11][var13][var14] = var1;
      }
   }

   public void method_33554(float var1, int var2, int var3, int var4, float[] var5, int var6) {
      int var9 = this.method_33557(var2, var3, var4);
      if (var9 < 0) {
         if (var9 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var2, var3, var4));
         }

         var5[var6 - var9] = -var1;
      } else {
         var5[var6 + var9] = var1;
      }
   }

   public void method_33556(float var1, long var2, long var4, long var6, class_4330 var8, long var9) {
      long var13 = this.method_33558(var2, var4, var6);
      if (var13 < 0L) {
         if (var13 <= Long.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var2, var4, var6));
         }

         var8.method_36123(var9 - var13, -var1);
      } else {
         var8.method_36123(var9 + var13, var1);
      }
   }

   public void method_33555(float var1, int var2, int var3, int var4, float[][][] var5) {
      int var8 = this.method_33557(var2, var3, var4);
      int var9 = class_6806.method_31180(var8);
      int var10 = var9 / this.field_37654;
      int var11 = var9 % this.field_37654;
      int var12 = var11 / this.field_37652;
      int var13 = var11 % this.field_37652;
      if (var8 < 0) {
         if (var8 <= Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", var2, var3, var4));
         }

         var5[var10][var12][var13] = -var1;
      } else {
         var5[var10][var12][var13] = var1;
      }
   }

   public double method_33545(int var1, int var2, int var3, double[] var4, int var5) {
      int var8 = this.method_33557(var1, var2, var3);
      if (var8 < 0) {
         return var8 <= Integer.MIN_VALUE ? 0.0 : -var4[var5 - var8];
      } else {
         return var4[var5 + var8];
      }
   }

   public double method_33549(long var1, long var3, long var5, class_1702 var7, long var8) {
      long var12 = this.method_33558(var1, var3, var5);
      if (var12 < 0L) {
         return var12 <= Long.MIN_VALUE ? 0.0 : -var7.method_36107(var8 - var12);
      } else {
         return var7.method_36107(var8 + var12);
      }
   }

   public double method_33547(int var1, int var2, int var3, double[][][] var4) {
      int var7 = this.method_33557(var1, var2, var3);
      int var8 = class_6806.method_31180(var7);
      int var9 = var8 / this.field_37654;
      int var10 = var8 % this.field_37654;
      int var11 = var10 / this.field_37652;
      int var12 = var10 % this.field_37652;
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0 : -var4[var9][var11][var12];
      } else {
         return var4[var9][var11][var12];
      }
   }

   public float method_33546(int var1, int var2, int var3, float[] var4, int var5) {
      int var8 = this.method_33557(var1, var2, var3);
      if (var8 < 0) {
         return var8 <= Integer.MIN_VALUE ? 0.0F : -var4[var5 - var8];
      } else {
         return var4[var5 + var8];
      }
   }

   public float method_33550(long var1, long var3, long var5, class_4330 var7, long var8) {
      long var12 = this.method_33558(var1, var3, var5);
      if (var12 < 0L) {
         return var12 <= Long.MIN_VALUE ? 0.0F : -var7.method_36133(var8 - var12);
      } else {
         return var7.method_36133(var8 + var12);
      }
   }

   public float method_33548(int var1, int var2, int var3, float[][][] var4) {
      int var7 = this.method_33557(var1, var2, var3);
      int var8 = class_6806.method_31180(var7);
      int var9 = var8 / this.field_37654;
      int var10 = var8 % this.field_37654;
      int var11 = var10 / this.field_37652;
      int var12 = var10 % this.field_37652;
      if (var7 < 0) {
         return var7 <= Integer.MIN_VALUE ? 0.0F : -var4[var9][var11][var12];
      } else {
         return var4[var9][var11][var12];
      }
   }
}
