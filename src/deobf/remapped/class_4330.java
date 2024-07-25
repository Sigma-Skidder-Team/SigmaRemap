package remapped;

import sun.misc.Cleaner;

public class class_4330 extends class_7975 {
   private static final long field_21057 = -8342458159338079576L;
   private float[] field_21059;

   public class_4330(long var1) {
      this(var1, true);
   }

   public class_4330(long var1, boolean var3) {
      this.field_40836 = class_4903.field_25353;
      this.field_40844 = 4L;
      if (var1 > 0L) {
         this.field_40837 = var1;
         if (var1 <= (long)method_36102()) {
            this.field_21059 = new float[(int)var1];
         } else {
            this.field_40840 = class_3685.field_18064.allocateMemory(this.field_40837 * this.field_40844);
            if (var3) {
               this.method_36132(var1);
            }

            Cleaner.create(this, new class_5209(this.field_40840, this.field_40837, this.field_40844));
            class_3506.method_16126(this.field_40837 * this.field_40844);
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public class_4330(long var1, float var3) {
      this.field_40836 = class_4903.field_25353;
      this.field_40844 = 4L;
      if (var1 > 0L) {
         this.field_40837 = var1;
         this.field_40838 = true;
         this.field_21059 = new float[]{var3};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public class_4330(float[] var1) {
      this.field_40836 = class_4903.field_25353;
      this.field_40844 = 4L;
      this.field_40837 = (long)var1.length;
      this.field_21059 = var1;
   }

   public class_4330 clone() {
      if (!this.field_40838) {
         class_4330 var3 = new class_4330(this.field_40837, false);
         class_3685.method_17117(this, 0L, var3, 0L, this.field_40837);
         return var3;
      } else {
         return new class_4330(this.field_40837, this.method_36133(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         class_4330 var4 = (class_4330)var1;
         return this.field_21059 == var4.field_21059;
      }
   }

   @Override
   public int hashCode() {
      return 29 * super.hashCode() + (this.field_21059 == null ? 0 : this.field_21059.hashCode());
   }

   public final Float method_20154(long var1) {
      return this.method_36133(var1);
   }

   public final Float method_20153(long var1) {
      return class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1);
   }

   @Override
   public final boolean method_36084(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? this.field_21059[(int)var1] != 0.0F : this.field_21059[0] != 0.0F;
      } else {
         return class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1) != 0.0F;
      }
   }

   @Override
   public final byte method_36121(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (byte)((int)this.field_21059[(int)var1]) : (byte)((int)this.field_21059[0]);
      } else {
         return (byte)((int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1));
      }
   }

   @Override
   public final short method_36103(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (short)(0xFF & (int)this.field_21059[(int)var1]) : (short)(0xFF & (int)this.field_21059[0]);
      } else {
         return (short)(0xFF & (int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1));
      }
   }

   @Override
   public final short method_36124(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (short)((int)this.field_21059[(int)var1]) : (short)((int)this.field_21059[0]);
      } else {
         return (short)((int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1));
      }
   }

   @Override
   public final int method_36079(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (int)this.field_21059[(int)var1] : (int)this.field_21059[0];
      } else {
         return (int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1);
      }
   }

   @Override
   public final long method_36076(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (long)this.field_21059[(int)var1] : (long)this.field_21059[0];
      } else {
         return (long)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1);
      }
   }

   @Override
   public final float method_36133(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? this.field_21059[(int)var1] : this.field_21059[0];
      } else {
         return class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1);
      }
   }

   @Override
   public final double method_36107(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (double)this.field_21059[(int)var1] : (double)this.field_21059[0];
      } else {
         return (double)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var1);
      }
   }

   public final float[] method_20155() {
      return this.field_21059;
   }

   @Override
   public final boolean[] method_36110() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         boolean[] var3 = new boolean[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = this.field_21059[var4] != 0.0F;
               }
            } else {
               boolean var6 = this.field_21059[0] != 0.0F;

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               float var8 = class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * (long)var7);
               var3[var7] = var8 != 0.0F;
            }
         }

         return var3;
      }
   }

   @Override
   public final boolean[] method_36111(boolean[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            boolean[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new boolean[(int)var10];
            }

            int var13 = 0;
            if (this.field_40840 == 0L) {
               if (!this.field_40838) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     float var16 = this.field_21059[(int)var14];
                     var12[var13++] = var16 != 0.0F;
                  }
               } else {
                  for (long var17 = var2; var17 < var4; var17 += var6) {
                     var12[var13++] = this.field_21059[0] != 0.0F;
                  }
               }
            } else {
               for (long var18 = var2; var18 < var4; var18 += var6) {
                  float var19 = class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var18);
                  var12[var13++] = var19 != 0.0F;
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final byte[] method_36104() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         byte[] var3 = new byte[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = (byte)((int)this.field_21059[var4]);
               }
            } else {
               float var6 = this.field_21059[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (byte)((int)var6);
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (byte)((int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * (long)var7));
            }
         }

         return var3;
      }
   }

   @Override
   public final byte[] method_36105(byte[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            byte[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new byte[(int)var10];
            }

            int var13 = 0;
            if (this.field_40840 == 0L) {
               if (!this.field_40838) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (byte)((int)this.field_21059[(int)var14]);
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (byte)((int)this.field_21059[0]);
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (byte)((int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var17));
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final short[] method_36090() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         short[] var3 = new short[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = (short)((int)this.field_21059[var4]);
               }
            } else {
               float var6 = this.field_21059[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (short)((int)var6);
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (short)((int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * (long)var7));
            }
         }

         return var3;
      }
   }

   @Override
   public final short[] method_36091(short[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            short[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new short[(int)var10];
            }

            int var13 = 0;
            if (this.field_40840 == 0L) {
               if (!this.field_40838) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (short)((int)this.field_21059[(int)var14]);
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (short)((int)this.field_21059[0]);
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (short)((int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var17));
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final int[] method_36087() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         int[] var3 = new int[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = (int)this.field_21059[var4];
               }
            } else {
               float var6 = this.field_21059[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (int)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final int[] method_36088(int[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            int[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new int[(int)var10];
            }

            int var13 = 0;
            if (this.field_40840 == 0L) {
               if (!this.field_40838) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (int)this.field_21059[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (int)this.field_21059[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (int)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final long[] method_36125() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         long[] var3 = new long[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = (long)this.field_21059[var4];
               }
            } else {
               float var6 = this.field_21059[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (long)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (long)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final long[] method_36126(long[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            long[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new long[(int)var10];
            }

            int var13 = 0;
            if (this.field_40840 == 0L) {
               if (!this.field_40838) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (long)this.field_21059[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (long)this.field_21059[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (long)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final float[] method_36095() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         float[] var3 = new float[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               System.arraycopy(this.field_21059, 0, var3, 0, (int)this.field_40837);
            } else {
               float var4 = this.field_21059[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var4;
               }
            }
         } else {
            for (int var6 = 0; (long)var6 < this.field_40837; var6++) {
               var3[var6] = class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * (long)var6);
            }
         }

         return var3;
      }
   }

   @Override
   public final float[] method_36096(float[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
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
            if (this.field_40840 == 0L) {
               if (!this.field_40838) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = this.field_21059[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field_21059[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final double[] method_36077() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         double[] var3 = new double[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = (double)this.field_21059[var4];
               }
            } else {
               double var5 = (double)this.field_21059[0];

               for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
                  var3[var7] = var5;
               }
            }
         } else {
            for (int var8 = 0; (long)var8 < this.field_40837; var8++) {
               var3[var8] = (double)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * (long)var8);
            }
         }

         return var3;
      }
   }

   @Override
   public final double[] method_36078(double[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field_40837) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field_40837 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)class_6806.method_31211((double)(var4 - var2) / (double)var6);
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
            if (this.field_40840 == 0L) {
               if (!this.field_40838) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (double)this.field_21059[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (double)this.field_21059[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (double)class_3685.field_18064.getFloat(this.field_40840 + this.field_40844 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final void method_36128(long var1, Object var3) {
      class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, (Float)var3);
   }

   @Override
   public final void method_36109(long var1, boolean var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_21059[(int)var1] = !var3 ? 0.0F : 1.0F;
      } else {
         class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, !var3 ? 0.0F : 1.0F);
      }
   }

   @Override
   public final void method_36117(long var1, byte var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_21059[(int)var1] = (float)var3;
      } else {
         class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, (float)var3);
      }
   }

   @Override
   public final void method_36086(long var1, short var3) {
      this.method_36129(var1, var3);
   }

   @Override
   public final void method_36129(long var1, short var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_21059[(int)var1] = (float)var3;
      } else {
         class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, (float)var3);
      }
   }

   @Override
   public final void method_36092(long var1, int var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_21059[(int)var1] = (float)var3;
      } else {
         class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, (float)var3);
      }
   }

   @Override
   public final void method_36131(long var1, long var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_21059[(int)var1] = (float)var3;
      } else {
         class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, (float)var3);
      }
   }

   @Override
   public final void method_36123(long var1, float var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_21059[(int)var1] = var3;
      } else {
         class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, var3);
      }
   }

   @Override
   public final void method_36114(long var1, double var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_21059[(int)var1] = (float)var3;
      } else {
         class_3685.field_18064.putFloat(this.field_40840 + this.field_40844 * var1, (float)var3);
      }
   }
}
