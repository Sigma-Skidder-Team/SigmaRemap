package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import sun.misc.Cleaner;

public class class_8720 extends class_7975 {
   private static final long field_44706 = 3135411647668758832L;
   private byte[] field_44704;

   public class_8720(long var1) {
      this(var1, true);
   }

   public class_8720(long var1, boolean var3) {
      this.field_40836 = class_4903.field_25344;
      this.field_40844 = 1L;
      if (var1 > 0L) {
         this.field_40837 = var1;
         if (var1 <= (long)method_36102()) {
            this.field_44704 = new byte[(int)var1];
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

   public class_8720(long var1, byte var3) {
      this.field_40836 = class_4903.field_25344;
      this.field_40844 = 1L;
      if (var1 > 0L) {
         this.field_40837 = var1;
         this.field_40838 = true;
         this.field_44704 = new byte[]{(byte)(var3 == 0 ? 0 : 1)};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public class_8720(byte[] var1) {
      this.field_40836 = class_4903.field_25344;
      this.field_40844 = 1L;
      this.field_40837 = (long)var1.length;

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4] != 0 && var1[var4] != 1) {
            throw new IllegalArgumentException("The array contans values different than 0 and 1.");
         }
      }

      this.field_44704 = var1;
   }

   public class_8720(boolean[] var1) {
      this.field_40836 = class_4903.field_25344;
      this.field_40844 = 1L;
      this.field_40837 = (long)var1.length;
      this.field_44704 = new byte[var1.length];

      for (int var4 = 0; var4 < var1.length; var4++) {
         this.field_44704[var4] = (byte)(!var1[var4] ? 0 : 1);
      }
   }

   public class_8720 clone() {
      if (!this.field_40838) {
         class_8720 var3 = new class_8720(this.field_40837, false);
         class_3685.method_17125(this, 0L, var3, 0L, this.field_40837);
         return var3;
      } else {
         return new class_8720(this.field_40837, this.method_36121(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         class_8720 var4 = (class_8720)var1;
         return this.field_44704 == var4.field_44704;
      }
   }

   @Override
   public int hashCode() {
      return 29 * super.hashCode() + (this.field_44704 == null ? 0 : this.field_44704.hashCode());
   }

   public final Byte method_40060(long var1) {
      return this.method_36121(var1);
   }

   public final Byte method_40059(long var1) {
      return class_3685.field_18064.getByte(this.field_40840 + var1);
   }

   @Override
   public final boolean method_36084(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? this.field_44704[(int)var1] != 0 : this.field_44704[0] != 0;
      } else {
         return class_3685.field_18064.getByte(this.field_40840 + var1) != 0;
      }
   }

   @Override
   public final byte method_36121(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? this.field_44704[(int)var1] : this.field_44704[0];
      } else {
         return class_3685.field_18064.getByte(this.field_40840 + var1);
      }
   }

   @Override
   public final short method_36103(long var1) {
      return (short)this.method_36121(var1);
   }

   @Override
   public final short method_36124(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (short)this.field_44704[(int)var1] : (short)this.field_44704[0];
      } else {
         return (short)class_3685.field_18064.getByte(this.field_40840 + var1);
      }
   }

   @Override
   public final int method_36079(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? this.field_44704[(int)var1] : this.field_44704[0];
      } else {
         return class_3685.field_18064.getByte(this.field_40840 + var1);
      }
   }

   @Override
   public final long method_36076(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (long)this.field_44704[(int)var1] : (long)this.field_44704[0];
      } else {
         return (long)class_3685.field_18064.getByte(this.field_40840 + var1);
      }
   }

   @Override
   public final float method_36133(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (float)this.field_44704[(int)var1] : (float)this.field_44704[0];
      } else {
         return (float)class_3685.field_18064.getByte(this.field_40840 + var1);
      }
   }

   @Override
   public final double method_36107(long var1) {
      if (this.field_40840 == 0L) {
         return !this.field_40838 ? (double)this.field_44704[(int)var1] : (double)this.field_44704[0];
      } else {
         return (double)class_3685.field_18064.getByte(this.field_40840 + var1);
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
                     byte var16 = this.field_44704[(int)var14];
                     var12[var13++] = var16 != 0;
                  }
               } else {
                  boolean var17 = this.field_44704[0] != 0;

                  for (long var18 = var2; var18 < var4; var18 += var6) {
                     var12[var13++] = var17;
                  }
               }
            } else {
               for (long var20 = var2; var20 < var4; var20 += var6) {
                  byte var21 = class_3685.field_18064.getByte(this.field_40840 + var20);
                  var12[var13++] = var21 == 1;
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
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
                  var3[var4] = this.field_44704[var4] != 0;
               }
            } else {
               boolean var6 = this.field_44704[0] != 0;

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               byte var8 = class_3685.field_18064.getByte(this.field_40840 + this.field_40844 * (long)var7);
               var3[var7] = var8 != 0;
            }
         }

         return var3;
      }
   }

   public final byte[] method_40062() {
      return this.field_44704;
   }

   @Override
   public final byte[] method_36104() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         byte[] var3 = new byte[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               System.arraycopy(this.field_44704, 0, var3, 0, (int)this.field_40837);
            } else {
               byte var4 = this.field_44704[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var4;
               }
            }
         } else {
            for (int var6 = 0; (long)var6 < this.field_40837; var6++) {
               var3[var6] = class_3685.field_18064.getByte(this.field_40840 + this.field_40844 * (long)var6);
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
                     var12[var13++] = this.field_44704[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field_44704[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = class_3685.field_18064.getByte(this.field_40840 + var17);
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
                  var3[var4] = (short)this.field_44704[var4];
               }
            } else {
               byte var6 = this.field_44704[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (short)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (short)class_3685.field_18064.getByte(this.field_40840 + this.field_40844 * (long)var7);
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
                     var12[var13++] = (short)this.field_44704[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (short)this.field_44704[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (short)class_3685.field_18064.getByte(this.field_40840 + var17);
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
                  var3[var4] = this.field_44704[var4];
               }
            } else {
               byte var6 = this.field_44704[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = class_3685.field_18064.getByte(this.field_40840 + this.field_40844 * (long)var7);
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
                     var12[var13++] = this.field_44704[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field_44704[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = class_3685.field_18064.getByte(this.field_40840 + var17);
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
                  var3[var4] = (long)this.field_44704[var4];
               }
            } else {
               byte var6 = this.field_44704[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (long)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (long)class_3685.field_18064.getByte(this.field_40840 + this.field_40844 * (long)var7);
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
                     var12[var13++] = (long)this.field_44704[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (long)this.field_44704[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (long)class_3685.field_18064.getByte(this.field_40840 + var17);
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
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = (float)this.field_44704[var4];
               }
            } else {
               float var6 = (float)this.field_44704[0];

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (float)class_3685.field_18064.getByte(this.field_40840 + this.field_40844 * (long)var7);
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
                     var12[var13++] = (float)this.field_44704[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (float)this.field_44704[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (float)class_3685.field_18064.getByte(this.field_40840 + var17);
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
                  var3[var4] = (double)this.field_44704[var4];
               }
            } else {
               double var5 = (double)this.field_44704[0];

               for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
                  var3[var7] = var5;
               }
            }
         } else {
            for (int var8 = 0; (long)var8 < this.field_40837; var8++) {
               var3[var8] = (double)class_3685.field_18064.getByte(this.field_40840 + this.field_40844 * (long)var8);
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
                     var12[var13++] = (double)this.field_44704[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (double)this.field_44704[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (double)class_3685.field_18064.getByte(this.field_40840 + var17);
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
      class_3685.field_18064.putByte(this.field_40840 + var1, (Byte)var3);
   }

   @Override
   public final void method_36109(long var1, boolean var3) {
      if (this.field_40840 == 0L) {
         if (this.field_40838) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field_44704[(int)var1] = (byte)(!var3 ? 0 : 1);
      } else {
         class_3685.field_18064.putByte(this.field_40840 + var1, (byte)(!var3 ? 0 : 1));
      }
   }

   @Override
   public final void method_36117(long var1, byte var3) {
      if (var3 >= 0 && var3 <= 1) {
         if (this.field_40840 == 0L) {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_44704[(int)var1] = var3;
         } else {
            class_3685.field_18064.putByte(this.field_40840 + var1, var3);
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method_36086(long var1, short var3) {
      this.method_36129(var1, var3);
   }

   @Override
   public final void method_36129(long var1, short var3) {
      if (var3 >= 0 && var3 <= 1) {
         if (this.field_40840 == 0L) {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_44704[(int)var1] = (byte)var3;
         } else {
            class_3685.field_18064.putByte(this.field_40840 + var1, (byte)var3);
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method_36092(long var1, int var3) {
      if (var3 >= 0 && var3 <= 1) {
         if (this.field_40840 == 0L) {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_44704[(int)var1] = (byte)var3;
         } else {
            class_3685.field_18064.putByte(this.field_40840 + var1, (byte)var3);
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method_36131(long var1, long var3) {
      if (var3 >= 0L && var3 <= 1L) {
         if (this.field_40840 == 0L) {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_44704[(int)var1] = (byte)((int)var3);
         } else {
            class_3685.field_18064.putByte(this.field_40840 + var1, (byte)((int)var3));
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method_36123(long var1, float var3) {
      if ((double)var3 != 0.0 && (double)var3 != 1.0) {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      } else {
         if (this.field_40840 == 0L) {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_44704[(int)var1] = (byte)((int)var3);
         } else {
            class_3685.field_18064.putByte(this.field_40840 + var1, (byte)((int)var3));
         }
      }
   }

   @Override
   public final void method_36114(long var1, double var3) {
      if (var3 != 0.0 && var3 != 1.0) {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      } else {
         if (this.field_40840 == 0L) {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_44704[(int)var1] = (byte)((int)var3);
         } else {
            class_3685.field_18064.putByte(this.field_40840 + var1, (byte)((int)var3));
         }
      }
   }

   public class_8720 method_40064(class_8720 var1) {
      if (var1 != null && var1.method_36136() == this.field_40837) {
         class_8720 var4 = new class_8720(var1.method_36136(), false);
         int var5 = (int)class_6806.method_31196(this.field_40837, (long)class_1266.method_5693());
         if (var5 > 2 && this.field_40837 >= class_1266.method_5689()) {
            long var16 = this.field_40837 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var16;
               long var12 = var9 == var5 - 1 ? this.field_40837 : var10 + var16;
               var8[var9] = class_1266.method_5694(new class_774(this, var10, var12, var4, var1));
            }

            try {
               class_1266.method_5696(var8);
            } catch (InterruptedException var14) {
               for (long var18 = 0L; var18 < this.field_40837; var18++) {
                  var4.method_36117(var18, (byte)(this.method_36121(var18) & var1.method_36121(var18)));
               }
            } catch (ExecutionException var15) {
               for (long var17 = 0L; var17 < this.field_40837; var17++) {
                  var4.method_36117(var17, (byte)(this.method_36121(var17) & var1.method_36121(var17)));
               }
            }
         } else {
            for (long var6 = 0L; var6 < this.field_40837; var6++) {
               var4.method_36117(var6, (byte)(this.method_36121(var6) & var1.method_36121(var6)));
            }
         }

         return var4;
      } else {
         throw new IllegalArgumentException("array == null || array.length() != length");
      }
   }

   public class_8720 method_40061(class_8720 var1) {
      if (var1 != null && var1.method_36136() == this.field_40837) {
         class_8720 var4 = new class_8720(var1.method_36136(), false);
         int var5 = (int)class_6806.method_31196(this.field_40837, (long)class_1266.method_5693());
         if (var5 > 2 && this.field_40837 >= class_1266.method_5689()) {
            long var16 = this.field_40837 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var16;
               long var12 = var9 == var5 - 1 ? this.field_40837 : var10 + var16;
               var8[var9] = class_1266.method_5694(new class_1175(this, var10, var12, var4, var1));
            }

            try {
               class_1266.method_5696(var8);
            } catch (InterruptedException var14) {
               for (long var18 = 0L; var18 < this.field_40837; var18++) {
                  var4.method_36117(var18, (byte)(this.method_36121(var18) | var1.method_36121(var18)));
               }
            } catch (ExecutionException var15) {
               for (long var17 = 0L; var17 < this.field_40837; var17++) {
                  var4.method_36117(var17, (byte)(this.method_36121(var17) | var1.method_36121(var17)));
               }
            }
         } else {
            for (long var6 = 0L; var6 < this.field_40837; var6++) {
               var4.method_36117(var6, (byte)(this.method_36121(var6) | var1.method_36121(var6)));
            }
         }

         return var4;
      } else {
         throw new IllegalArgumentException("array == null || array.length() != length");
      }
   }

   public class_8720 method_40058(class_8720 var1) {
      if (var1 != null && var1.method_36136() == this.field_40837) {
         class_8720 var4 = new class_8720(var1.method_36136(), false);
         int var5 = (int)class_6806.method_31196(this.field_40837, (long)class_1266.method_5693());
         if (var5 > 2 && this.field_40837 >= class_1266.method_5689()) {
            long var16 = this.field_40837 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var16;
               long var12 = var9 == var5 - 1 ? this.field_40837 : var10 + var16;
               var8[var9] = class_1266.method_5694(new class_2784(this, var10, var12, var4, var1));
            }

            try {
               class_1266.method_5696(var8);
            } catch (InterruptedException var14) {
               for (long var18 = 0L; var18 < this.field_40837; var18++) {
                  var4.method_36117(var18, (byte)(this.method_36121(var18) ^ var1.method_36121(var18)));
               }
            } catch (ExecutionException var15) {
               for (long var17 = 0L; var17 < this.field_40837; var17++) {
                  var4.method_36117(var17, (byte)(this.method_36121(var17) ^ var1.method_36121(var17)));
               }
            }
         } else {
            for (long var6 = 0L; var6 < this.field_40837; var6++) {
               var4.method_36117(var6, (byte)(this.method_36121(var6) ^ var1.method_36121(var6)));
            }
         }

         return var4;
      } else {
         throw new IllegalArgumentException("array == null || array.length() != length");
      }
   }

   public class_8720 method_40063() {
      class_8720 var3 = new class_8720(this.field_40837, false);
      int var4 = (int)class_6806.method_31196(this.field_40837, (long)class_1266.method_5693());
      if (var4 > 2 && this.field_40837 >= class_1266.method_5689()) {
         long var15 = this.field_40837 / (long)var4;
         Future[] var7 = new Future[var4];

         for (int var8 = 0; var8 < var4; var8++) {
            long var9 = (long)var8 * var15;
            long var11 = var8 == var4 - 1 ? this.field_40837 : var9 + var15;
            var7[var8] = class_1266.method_5694(new class_7167(this, var9, var11, var3));
         }

         try {
            class_1266.method_5696(var7);
         } catch (InterruptedException var13) {
            for (long var17 = 0L; var17 < this.field_40837; var17++) {
               var3.method_36117(var17, (byte)(1 - this.method_36121(var17)));
            }
         } catch (ExecutionException var14) {
            for (long var16 = 0L; var16 < this.field_40837; var16++) {
               var3.method_36117(var16, (byte)(1 - this.method_36121(var16)));
            }
         }
      } else {
         for (long var5 = 0L; var5 < this.field_40837; var5++) {
            var3.method_36117(var5, (byte)(1 - this.method_36121(var5)));
         }
      }

      return var3;
   }
}
