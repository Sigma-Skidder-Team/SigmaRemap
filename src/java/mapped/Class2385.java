package mapped;
import java.lang.ref.Cleaner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class2385 extends Class2373 {
   private static final long field16232 = 3135411647668758832L;
   private static final Cleaner cleaner = Cleaner.create();
   private byte[] field16270;

   public Class2385(long var1) {
      this(var1, true);
   }

   public Class2385(long var1, boolean var3) {
      this.field16233 = Class2178.field14295;
      this.field16235 = 1L;
      if (var1 > 0L) {
         this.field16234 = var1;
         if (var1 <= (long)method9693()) {
            this.field16270 = new byte[(int)var1];
         } else {
            this.field16238 = Class8133.field34961.allocateMemory(this.field16234 * this.field16235);
            if (var3) {
               this.method9694(var1);
            }

            cleaner.register(this, new ResourceCleaner(this.field16238, this.field16234, this.field16235));
            Class8065.method27706(this.field16234 * this.field16235);
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2385(long var1, byte var3) {
      this.field16233 = Class2178.field14295;
      this.field16235 = 1L;
      if (var1 > 0L) {
         this.field16234 = var1;
         this.field16236 = true;
         this.field16270 = new byte[]{(byte)(var3 == 0 ? 0 : 1)};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2385(byte[] var1) {
      this.field16233 = Class2178.field14295;
      this.field16235 = 1L;
      this.field16234 = (long)var1.length;

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4] != 0 && var1[var4] != 1) {
            throw new IllegalArgumentException("The array contans values different than 0 and 1.");
         }
      }

      this.field16270 = var1;
   }

   public Class2385(boolean[] var1) {
      this.field16233 = Class2178.field14295;
      this.field16235 = 1L;
      this.field16234 = (long)var1.length;
      this.field16270 = new byte[var1.length];

      for (int var4 = 0; var4 < var1.length; var4++) {
         this.field16270[var4] = (byte)(!var1[var4] ? 0 : 1);
      }
   }

   public Class2385 clone() {
      if (!this.field16236) {
         Class2385 var3 = new Class2385(this.field16234, false);
         Class8133.method28162(this, 0L, var3, 0L, this.field16234);
         return var3;
      } else {
         return new Class2385(this.field16234, this.method9641(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         Class2385 var4 = (Class2385)var1;
         return this.field16270 == var4.field16270;
      }
   }

   @Override
   public int hashCode() {
      return 29 * super.hashCode() + (this.field16270 == null ? 0 : this.field16270.hashCode());
   }

   public final Byte method9636(long var1) {
      return this.method9641(var1);
   }

   public final Byte method9638(long var1) {
      return Class8133.field34961.getByte(this.field16238 + var1);
   }

   @Override
   public final boolean method9639(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? this.field16270[(int)var1] != 0 : this.field16270[0] != 0;
      } else {
         return Class8133.field34961.getByte(this.field16238 + var1) != 0;
      }
   }

   @Override
   public final byte method9641(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? this.field16270[(int)var1] : this.field16270[0];
      } else {
         return Class8133.field34961.getByte(this.field16238 + var1);
      }
   }

   @Override
   public final short method9643(long var1) {
      return (short)this.method9641(var1);
   }

   @Override
   public final short method9645(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (short)this.field16270[(int)var1] : (short)this.field16270[0];
      } else {
         return (short)Class8133.field34961.getByte(this.field16238 + var1);
      }
   }

   @Override
   public final int method9647(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? this.field16270[(int)var1] : this.field16270[0];
      } else {
         return Class8133.field34961.getByte(this.field16238 + var1);
      }
   }

   @Override
   public final long method9649(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (long)this.field16270[(int)var1] : (long)this.field16270[0];
      } else {
         return (long)Class8133.field34961.getByte(this.field16238 + var1);
      }
   }

   @Override
   public final float method9651(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (float)this.field16270[(int)var1] : (float)this.field16270[0];
      } else {
         return (float)Class8133.field34961.getByte(this.field16238 + var1);
      }
   }

   @Override
   public final double method9653(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (double)this.field16270[(int)var1] : (double)this.field16270[0];
      } else {
         return (double)Class8133.field34961.getByte(this.field16238 + var1);
      }
   }

   @Override
   public final boolean[] method9657(boolean[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
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
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     byte var16 = this.field16270[(int)var14];
                     var12[var13++] = var16 != 0;
                  }
               } else {
                  boolean var17 = this.field16270[0] != 0;

                  for (long var18 = var2; var18 < var4; var18 += var6) {
                     var12[var13++] = var17;
                  }
               }
            } else {
               for (long var20 = var2; var20 < var4; var20 += var6) {
                  byte var21 = Class8133.field34961.getByte(this.field16238 + var20);
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
   public final boolean[] method9656() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         boolean[] var3 = new boolean[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = this.field16270[var4] != 0;
               }
            } else {
               boolean var6 = this.field16270[0] != 0;

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               byte var8 = Class8133.field34961.getByte(this.field16238 + this.field16235 * (long)var7);
               var3[var7] = var8 != 0;
            }
         }

         return var3;
      }
   }

   public final byte[] method9655() {
      return this.field16270;
   }

   @Override
   public final byte[] method9658() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         byte[] var3 = new byte[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               System.arraycopy(this.field16270, 0, var3, 0, (int)this.field16234);
            } else {
               byte var4 = this.field16270[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var4;
               }
            }
         } else {
            for (int var6 = 0; (long)var6 < this.field16234; var6++) {
               var3[var6] = Class8133.field34961.getByte(this.field16238 + this.field16235 * (long)var6);
            }
         }

         return var3;
      }
   }

   @Override
   public final byte[] method9659(byte[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
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
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = this.field16270[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field16270[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = Class8133.field34961.getByte(this.field16238 + var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final short[] method9660() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         short[] var3 = new short[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (short)this.field16270[var4];
               }
            } else {
               byte var6 = this.field16270[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = (short)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (short)Class8133.field34961.getByte(this.field16238 + this.field16235 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final short[] method9661(short[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
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
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (short)this.field16270[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (short)this.field16270[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (short)Class8133.field34961.getByte(this.field16238 + var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final int[] method9662() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         int[] var3 = new int[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = this.field16270[var4];
               }
            } else {
               byte var6 = this.field16270[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = Class8133.field34961.getByte(this.field16238 + this.field16235 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final int[] method9663(int[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
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
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = this.field16270[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field16270[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = Class8133.field34961.getByte(this.field16238 + var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final long[] method9664() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         long[] var3 = new long[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (long)this.field16270[var4];
               }
            } else {
               byte var6 = this.field16270[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = (long)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (long)Class8133.field34961.getByte(this.field16238 + this.field16235 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final long[] method9665(long[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
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
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (long)this.field16270[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (long)this.field16270[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (long)Class8133.field34961.getByte(this.field16238 + var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final float[] method9666() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         float[] var3 = new float[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (float)this.field16270[var4];
               }
            } else {
               float var6 = (float)this.field16270[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (float)Class8133.field34961.getByte(this.field16238 + this.field16235 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final float[] method9667(float[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
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
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (float)this.field16270[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (float)this.field16270[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (float)Class8133.field34961.getByte(this.field16238 + var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final double[] method9668() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         double[] var3 = new double[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (double)this.field16270[var4];
               }
            } else {
               double var5 = (double)this.field16270[0];

               for (int var7 = 0; (long)var7 < this.field16234; var7++) {
                  var3[var7] = var5;
               }
            }
         } else {
            for (int var8 = 0; (long)var8 < this.field16234; var8++) {
               var3[var8] = (double)Class8133.field34961.getByte(this.field16238 + this.field16235 * (long)var8);
            }
         }

         return var3;
      }
   }

   @Override
   public final double[] method9669(double[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
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
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (double)this.field16270[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (double)this.field16270[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (double)Class8133.field34961.getByte(this.field16238 + var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final void method9671(long var1, Object var3) {
      Class8133.field34961.putByte(this.field16238 + var1, (Byte)var3);
   }

   @Override
   public final void method9673(long var1, boolean var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16270[(int)var1] = (byte)(!var3 ? 0 : 1);
      } else {
         Class8133.field34961.putByte(this.field16238 + var1, (byte)(!var3 ? 0 : 1));
      }
   }

   @Override
   public final void method9675(long var1, byte var3) {
      if (var3 >= 0 && var3 <= 1) {
         if (this.field16238 == 0L) {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16270[(int)var1] = var3;
         } else {
            Class8133.field34961.putByte(this.field16238 + var1, var3);
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method9677(long var1, short var3) {
      this.method9679(var1, var3);
   }

   @Override
   public final void method9679(long var1, short var3) {
      if (var3 >= 0 && var3 <= 1) {
         if (this.field16238 == 0L) {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16270[(int)var1] = (byte)var3;
         } else {
            Class8133.field34961.putByte(this.field16238 + var1, (byte)var3);
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method9681(long var1, int var3) {
      if (var3 >= 0 && var3 <= 1) {
         if (this.field16238 == 0L) {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16270[(int)var1] = (byte)var3;
         } else {
            Class8133.field34961.putByte(this.field16238 + var1, (byte)var3);
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method9683(long var1, long var3) {
      if (var3 >= 0L && var3 <= 1L) {
         if (this.field16238 == 0L) {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16270[(int)var1] = (byte)((int)var3);
         } else {
            Class8133.field34961.putByte(this.field16238 + var1, (byte)((int)var3));
         }
      } else {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      }
   }

   @Override
   public final void method9685(long var1, float var3) {
      if ((double)var3 != 0.0 && (double)var3 != 1.0) {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      } else {
         if (this.field16238 == 0L) {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16270[(int)var1] = (byte)((int)var3);
         } else {
            Class8133.field34961.putByte(this.field16238 + var1, (byte)((int)var3));
         }
      }
   }

   @Override
   public final void method9687(long var1, double var3) {
      if (var3 != 0.0 && var3 != 1.0) {
         throw new IllegalArgumentException("The value has to be 0 or 1.");
      } else {
         if (this.field16238 == 0L) {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16270[(int)var1] = (byte)((int)var3);
         } else {
            Class8133.field34961.putByte(this.field16238 + var1, (byte)((int)var3));
         }
      }
   }

   public Class2385 method9719(Class2385 var1) {
      if (var1 != null && var1.method9634() == this.field16234) {
         Class2385 var4 = new Class2385(var1.method9634(), false);
         int var5 = (int)Class9044.method33604(this.field16234, (long)Class7008.method21726());
         if (var5 > 2 && this.field16234 >= Class7008.method21723()) {
            long var16 = this.field16234 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var16;
               long var12 = var9 == var5 - 1 ? this.field16234 : var10 + var16;
               var8[var9] = Class7008.method21729(new Class1602(this, var10, var12, var4, var1));
            }

            try {
               Class7008.method21730(var8);
            } catch (InterruptedException var14) {
               for (long var18 = 0L; var18 < this.field16234; var18++) {
                  var4.method9675(var18, (byte)(this.method9641(var18) & var1.method9641(var18)));
               }
            } catch (ExecutionException var15) {
               for (long var17 = 0L; var17 < this.field16234; var17++) {
                  var4.method9675(var17, (byte)(this.method9641(var17) & var1.method9641(var17)));
               }
            }
         } else {
            for (long var6 = 0L; var6 < this.field16234; var6++) {
               var4.method9675(var6, (byte)(this.method9641(var6) & var1.method9641(var6)));
            }
         }

         return var4;
      } else {
         throw new IllegalArgumentException("array == null || array.length() != length");
      }
   }

   public Class2385 method9720(Class2385 var1) {
      if (var1 != null && var1.method9634() == this.field16234) {
         Class2385 var4 = new Class2385(var1.method9634(), false);
         int var5 = (int)Class9044.method33604(this.field16234, (long)Class7008.method21726());
         if (var5 > 2 && this.field16234 >= Class7008.method21723()) {
            long var16 = this.field16234 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var16;
               long var12 = var9 == var5 - 1 ? this.field16234 : var10 + var16;
               var8[var9] = Class7008.method21729(new Class1591(this, var10, var12, var4, var1));
            }

            try {
               Class7008.method21730(var8);
            } catch (InterruptedException var14) {
               for (long var18 = 0L; var18 < this.field16234; var18++) {
                  var4.method9675(var18, (byte)(this.method9641(var18) | var1.method9641(var18)));
               }
            } catch (ExecutionException var15) {
               for (long var17 = 0L; var17 < this.field16234; var17++) {
                  var4.method9675(var17, (byte)(this.method9641(var17) | var1.method9641(var17)));
               }
            }
         } else {
            for (long var6 = 0L; var6 < this.field16234; var6++) {
               var4.method9675(var6, (byte)(this.method9641(var6) | var1.method9641(var6)));
            }
         }

         return var4;
      } else {
         throw new IllegalArgumentException("array == null || array.length() != length");
      }
   }

   public Class2385 method9721(Class2385 var1) {
      if (var1 != null && var1.method9634() == this.field16234) {
         Class2385 var4 = new Class2385(var1.method9634(), false);
         int var5 = (int)Class9044.method33604(this.field16234, (long)Class7008.method21726());
         if (var5 > 2 && this.field16234 >= Class7008.method21723()) {
            long var16 = this.field16234 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var16;
               long var12 = var9 == var5 - 1 ? this.field16234 : var10 + var16;
               var8[var9] = Class7008.method21729(new Class1394(this, var10, var12, var4, var1));
            }

            try {
               Class7008.method21730(var8);
            } catch (InterruptedException var14) {
               for (long var18 = 0L; var18 < this.field16234; var18++) {
                  var4.method9675(var18, (byte)(this.method9641(var18) ^ var1.method9641(var18)));
               }
            } catch (ExecutionException var15) {
               for (long var17 = 0L; var17 < this.field16234; var17++) {
                  var4.method9675(var17, (byte)(this.method9641(var17) ^ var1.method9641(var17)));
               }
            }
         } else {
            for (long var6 = 0L; var6 < this.field16234; var6++) {
               var4.method9675(var6, (byte)(this.method9641(var6) ^ var1.method9641(var6)));
            }
         }

         return var4;
      } else {
         throw new IllegalArgumentException("array == null || array.length() != length");
      }
   }

   public Class2385 method9722() {
      Class2385 var3 = new Class2385(this.field16234, false);
      int var4 = (int)Class9044.method33604(this.field16234, (long)Class7008.method21726());
      if (var4 > 2 && this.field16234 >= Class7008.method21723()) {
         long var15 = this.field16234 / (long)var4;
         Future[] var7 = new Future[var4];

         for (int var8 = 0; var8 < var4; var8++) {
            long var9 = (long)var8 * var15;
            long var11 = var8 == var4 - 1 ? this.field16234 : var9 + var15;
            var7[var8] = Class7008.method21729(new Class539(this, var9, var11, var3));
         }

         try {
            Class7008.method21730(var7);
         } catch (InterruptedException var13) {
            for (long var17 = 0L; var17 < this.field16234; var17++) {
               var3.method9675(var17, (byte)(1 - this.method9641(var17)));
            }
         } catch (ExecutionException var14) {
            for (long var16 = 0L; var16 < this.field16234; var16++) {
               var3.method9675(var16, (byte)(1 - this.method9641(var16)));
            }
         }
      } else {
         for (long var5 = 0L; var5 < this.field16234; var5++) {
            var3.method9675(var5, (byte)(1 - this.method9641(var5)));
         }
      }

      return var3;
   }
}
