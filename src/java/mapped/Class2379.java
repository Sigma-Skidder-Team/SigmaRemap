package mapped;

import sun.misc.Cleaner;

import java.io.UnsupportedEncodingException;

public class Class2379 extends Class2373 {
   private String[] field16249;
   private Class2383 field16250;
   private int field16251;
   private long field16252;
   private byte[] field16253;

   public Class2379(long var1, int var3, boolean var4) {
      this.field16233 = Class2178.field14305;
      this.field16235 = 1L;
      if (var1 > 0L) {
         if (var3 > 0) {
            this.field16234 = var1;
            this.field16252 = var1 * (long)var3 * 4L;
            this.field16251 = var3;
            if (var1 <= (long)method9693()) {
               this.field16249 = new String[(int)var1];
            } else {
               this.field16238 = Class8133.field34961.allocateMemory(this.field16252 * this.field16235);
               if (var4) {
                  this.method9694(this.field16252);
               }

               Cleaner.create(this, new ResourceCleaner(this.field16238, this.field16252, this.field16235));
               Class8065.method27706(this.field16252 * this.field16235);
               this.field16250 = new Class2383(var1);
               this.field16253 = new byte[var3 * 4];
            }
         } else {
            throw new IllegalArgumentException(var3 + " is not a positive int value.");
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value.");
      }
   }

   public Class2379(long var1, String var3) {
      this.field16233 = Class2178.field14305;
      this.field16235 = 1L;
      if (var1 > 0L) {
         this.field16234 = var1;
         this.field16236 = true;
         this.field16249 = new String[]{var3};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2379(String[] var1) {
      this.field16233 = Class2178.field14305;
      this.field16235 = 1L;
      this.field16234 = (long)var1.length;
      this.field16249 = var1;
   }

   public Class2379 clone() {
      if (!this.field16236) {
         Class2379 var3 = new Class2379(this.field16234, Class9044.method33607(1, this.field16251), false);
         Class8133.method28183(this, 0L, var3, 0L, this.field16234);
         return var3;
      } else {
         return new Class2379(this.field16234, this.method9636(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         Class2379 var4 = (Class2379)var1;
         boolean var5 = this.field16251 == var4.field16251 && this.field16249 == var4.field16249;
         if (this.field16250 != null && var4.field16250 != null) {
            return var5 && this.field16250.equals(var4.field16250);
         } else {
            return this.field16250 != var4.field16250 ? false : var5;
         }
      }
   }

   @Override
   public int hashCode() {
      int var3 = 29 * super.hashCode() + (this.field16249 == null ? 0 : this.field16249.hashCode());
      var3 = 29 * var3 + (this.field16251 ^ this.field16251 >>> 16);
      return 29 * var3 + (this.field16250 == null ? 0 : this.field16250.hashCode());
   }

   public final String method9636(long var1) {
      if (this.field16238 == 0L) {
         return this.field16236 ? this.field16249[0] : this.field16249[(int)var1];
      } else {
         short var5 = this.field16250.method9645(var1);
         if (var5 < 0) {
            return null;
         } else {
            long var6 = this.field16235 * var1 * (long)this.field16251 * 4L;

            for (int var8 = 0; var8 < var5; var8++) {
               this.field16253[var8] = Class8133.field34961.getByte(this.field16238 + var6 + this.field16235 * (long)var8);
            }

            try {
               return new String(this.field16253, 0, var5, "UTF-8");
            } catch (UnsupportedEncodingException var9) {
               return null;
            }
         }
      }
   }

   public final String method9638(long var1) {
      short var5 = this.field16250.method9645(var1);
      if (var5 < 0) {
         return null;
      } else {
         long var6 = this.field16235 * var1 * (long)this.field16251 * 4L;

         for (int var8 = 0; var8 < var5; var8++) {
            this.field16253[var8] = Class8133.field34961.getByte(this.field16238 + var6 + this.field16235 * (long)var8);
         }

         try {
            return new String(this.field16253, 0, var5, "UTF-8");
         } catch (UnsupportedEncodingException var9) {
            return null;
         }
      }
   }

   @Override
   public final boolean method9639(long var1) {
      String var5 = this.method9636(var1);
      return var5 == null ? false : var5.length() != 0;
   }

   @Override
   public final byte method9641(long var1) {
      String var5 = this.method9636(var1);
      return (byte)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final short method9643(long var1) {
      String var5 = this.method9636(var1);
      return (short)(var5 == null ? 0 : 0xFF & var5.length());
   }

   @Override
   public final short method9645(long var1) {
      String var5 = this.method9636(var1);
      return (short)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final int method9647(long var1) {
      String var5 = this.method9636(var1);
      return var5 == null ? 0 : var5.length();
   }

   @Override
   public final long method9649(long var1) {
      String var5 = this.method9636(var1);
      return (long)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final float method9651(long var1) {
      String var5 = this.method9636(var1);
      return (float)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final double method9653(long var1) {
      String var5 = this.method9636(var1);
      return (double)(var5 == null ? 0 : var5.length());
   }

   public final String[] method9655() {
      return this.field16249;
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
                  var3[var4] = this.field16249[var4] == null ? false : this.field16249[var4].length() != 0;
               }
            } else {
               boolean var6 = this.field16249[0] == null ? false : this.field16249[0].length() != 0;

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               short var8 = this.field16250.method9645((long)var7);
               var3[var7] = var8 != 0;
            }
         }

         return var3;
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
                     int var16 = this.field16249[(int)var14] == null ? 0 : this.field16249[(int)var14].length();
                     var12[var13++] = var16 != 0;
                  }
               } else {
                  boolean var17 = this.field16249[0] == null ? false : this.field16249[0].length() != 0;

                  for (long var18 = var2; var18 < var4; var18 += var6) {
                     var12[var13++] = var17;
                  }
               }
            } else {
               for (long var20 = var2; var20 < var4; var20 += var6) {
                  short var21 = this.field16250.method9645(var20);
                  var12[var13++] = var21 > 0;
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final byte[] method9658() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         byte[] var3 = new byte[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (byte)(this.field16249[var4] == null ? 0 : this.field16249[var4].length());
               }
            } else {
               byte var6 = (byte)(this.field16249[0] == null ? 0 : this.field16249[0].length());

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (byte)this.field16250.method9645((long)var7);
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
                     var12[var13++] = (byte)(this.field16249[(int)var14] == null ? 0 : this.field16249[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (byte)(this.field16249[0] == null ? 0 : this.field16249[0].length());
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (byte)this.field16250.method9645(var17);
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
                  var3[var4] = (short)(this.field16249[var4] == null ? 0 : this.field16249[var4].length());
               }
            } else {
               short var6 = (short)(this.field16249[0] == null ? 0 : this.field16249[0].length());

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = this.field16250.method9645((long)var7);
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
                     var12[var13++] = (short)(this.field16249[(int)var14] == null ? 0 : this.field16249[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (short)(this.field16249[0] == null ? 0 : this.field16249[0].length());
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = this.field16250.method9645(var17);
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
                  var3[var4] = this.field16249[var4] == null ? 0 : this.field16249[var4].length();
               }
            } else {
               int var6 = this.field16249[0] == null ? 0 : this.field16249[0].length();

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = this.field16250.method9645((long)var7);
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
                     var12[var13++] = this.field16249[(int)var14] == null ? 0 : this.field16249[(int)var14].length();
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field16249[0] == null ? 0 : this.field16249[0].length();
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = this.field16250.method9645(var17);
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
                  var3[var4] = this.field16249[var4] == null ? 0L : (long)this.field16249[var4].length();
               }
            } else {
               int var6 = this.field16249[0] == null ? 0 : this.field16249[0].length();

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = (long)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (long)this.field16250.method9645((long)var7);
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
                     var12[var13++] = (long)(this.field16249[(int)var14] == null ? 0 : this.field16249[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (long)(this.field16249[0] == null ? 0 : this.field16249[0].length());
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (long)this.field16250.method9645(var17);
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
                  var3[var4] = this.field16249[var4] == null ? 0.0F : (float)this.field16249[var4].length();
               }
            } else {
               int var6 = this.field16249[0] == null ? 0 : this.field16249[0].length();

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = (float)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (float)this.field16250.method9645((long)var7);
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
                     var12[var13++] = (float)(this.field16249[(int)var14] == null ? 0 : this.field16249[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field16249[0] == null ? 0.0F : (float)this.field16249[0].length();
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (float)this.field16250.method9645(var17);
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
                  var3[var4] = this.field16249[var4] == null ? 0.0 : (double)this.field16249[var4].length();
               }
            } else {
               int var6 = this.field16249[0] == null ? 0 : this.field16249[0].length();

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = (double)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (double)this.field16250.method9645((long)var7);
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
                     var12[var13++] = (double)(this.field16249[(int)var14] == null ? 0 : this.field16249[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field16249[0] == null ? 0.0 : (double)this.field16249[0].length();
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (double)this.field16250.method9645(var17);
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
      if (var3 == null) {
         this.field16250.method9679(var1, (short)-1);
      } else {
         if (!(var3 instanceof String)) {
            throw new IllegalArgumentException(var3 + " is not a string.");
         }

         String var6 = (String)var3;
         if (var6.length() > this.field16251) {
            throw new IllegalArgumentException("String  " + var6 + " is too long.");
         }

         byte[] var7;
         try {
            var7 = var6.getBytes("UTF-8");
         } catch (UnsupportedEncodingException var12) {
            return;
         }

         int var8 = var7.length;
         if (var8 > 32767) {
            throw new IllegalArgumentException("String  " + var6 + " is too long.");
         }

         this.field16250.method9679(var1, (short)var8);
         long var9 = this.field16235 * var1 * (long)this.field16251 * 4L;

         for (int var11 = 0; var11 < var8; var11++) {
            Class8133.field34961.putByte(this.field16238 + var9 + this.field16235 * (long)var11, var7[var11]);
         }
      }
   }

   @Override
   public final void method9670(long var1, Object var3) {
      if (var3 == null) {
         if (this.field16238 != 0L) {
            this.field16250.method9679(var1, (short)-1);
         } else {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16249[(int)var1] = null;
         }
      } else {
         if (!(var3 instanceof String)) {
            throw new IllegalArgumentException(var3 + " is not a string.");
         }

         String var6 = (String)var3;
         if (this.field16238 != 0L) {
            if (var6.length() > this.field16251) {
               throw new IllegalArgumentException("String  " + var6 + " is too long.");
            }

            byte[] var7;
            try {
               var7 = var6.getBytes("UTF-8");
            } catch (UnsupportedEncodingException var12) {
               return;
            }

            int var8 = var7.length;
            if (var8 > 32767) {
               throw new IllegalArgumentException("String  " + var6 + " is too long.");
            }

            this.field16250.method9679(var1, (short)var8);
            long var9 = this.field16235 * var1 * (long)this.field16251 * 4L;

            for (int var11 = 0; var11 < var8; var11++) {
               Class8133.field34961.putByte(this.field16238 + var9 + this.field16235 * (long)var11, var7[var11]);
            }
         } else {
            if (this.field16236) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field16249[(int)var1] = var6;
         }
      }
   }

   @Override
   public final void method9672(long var1, Object var3) {
      if (var1 >= 0L && var1 < this.field16234) {
         this.method9670(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   @Override
   public final void method9673(long var1, boolean var3) {
      this.method9670(var1, Boolean.toString(var3));
   }

   @Override
   public final void method9675(long var1, byte var3) {
      this.method9670(var1, Byte.toString(var3));
   }

   @Override
   public final void method9677(long var1, short var3) {
      this.method9679(var1, var3);
   }

   @Override
   public final void method9679(long var1, short var3) {
      this.method9670(var1, Short.toString(var3));
   }

   @Override
   public final void method9681(long var1, int var3) {
      this.method9670(var1, Integer.toString(var3));
   }

   @Override
   public final void method9683(long var1, long var3) {
      this.method9670(var1, Long.toString(var3));
   }

   @Override
   public final void method9685(long var1, float var3) {
      this.method9670(var1, Float.toString(var3));
   }

   @Override
   public final void method9687(long var1, double var3) {
      this.method9670(var1, Double.toString(var3));
   }

   public int method9705() {
      return this.field16251;
   }
}
