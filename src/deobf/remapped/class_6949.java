package remapped;

import java.io.UnsupportedEncodingException;
import sun.misc.Cleaner;

public class class_6949 extends class_7975 {
   private static final long field_35726 = -4096759496772248522L;
   private String[] field_35723;
   private class_4516 field_35727;
   private int field_35728;
   private long field_35725;
   private byte[] field_35724;
   private static final String field_35722 = "UTF-8";
   private static final int field_35721 = 4;

   public class_6949(long var1) {
      this(var1, 100);
   }

   public class_6949(long var1, int var3) {
      this(var1, var3, true);
   }

   public class_6949(long var1, int var3, boolean var4) {
      this.field_40836 = class_4903.field_25345;
      this.field_40844 = 1L;
      if (var1 > 0L) {
         if (var3 > 0) {
            this.field_40837 = var1;
            this.field_35725 = var1 * (long)var3 * 4L;
            this.field_35728 = var3;
            if (var1 <= (long)method_36102()) {
               this.field_35723 = new String[(int)var1];
            } else {
               this.field_40840 = class_3685.field_18064.allocateMemory(this.field_35725 * this.field_40844);
               if (var4) {
                  this.method_36132(this.field_35725);
               }

               Cleaner.create(this, new class_5209(this.field_40840, this.field_35725, this.field_40844));
               class_3506.method_16126(this.field_35725 * this.field_40844);
               this.field_35727 = new class_4516(var1);
               this.field_35724 = new byte[var3 * 4];
            }
         } else {
            throw new IllegalArgumentException(var3 + " is not a positive int value.");
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value.");
      }
   }

   public class_6949(long var1, String var3) {
      this.field_40836 = class_4903.field_25345;
      this.field_40844 = 1L;
      if (var1 > 0L) {
         this.field_40837 = var1;
         this.field_40838 = true;
         this.field_35723 = new String[]{var3};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public class_6949(String[] var1) {
      this.field_40836 = class_4903.field_25345;
      this.field_40844 = 1L;
      this.field_40837 = (long)var1.length;
      this.field_35723 = var1;
   }

   public class_6949 clone() {
      if (!this.field_40838) {
         class_6949 var3 = new class_6949(this.field_40837, class_6806.method_31158(1, this.field_35728), false);
         class_3685.method_17121(this, 0L, var3, 0L, this.field_40837);
         return var3;
      } else {
         return new class_6949(this.field_40837, this.method_31787(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         class_6949 var4 = (class_6949)var1;
         boolean var5 = this.field_35728 == var4.field_35728 && this.field_35723 == var4.field_35723;
         if (this.field_35727 != null && var4.field_35727 != null) {
            return var5 && this.field_35727.equals(var4.field_35727);
         } else {
            return this.field_35727 != var4.field_35727 ? false : var5;
         }
      }
   }

   @Override
   public int hashCode() {
      int var3 = 29 * super.hashCode() + (this.field_35723 == null ? 0 : this.field_35723.hashCode());
      var3 = 29 * var3 + (this.field_35728 ^ this.field_35728 >>> 16);
      return 29 * var3 + (this.field_35727 == null ? 0 : this.field_35727.hashCode());
   }

   public final String method_31787(long var1) {
      if (this.field_40840 == 0L) {
         return this.field_40838 ? this.field_35723[0] : this.field_35723[(int)var1];
      } else {
         short var5 = this.field_35727.method_36124(var1);
         if (var5 < 0) {
            return null;
         } else {
            long var6 = this.field_40844 * var1 * (long)this.field_35728 * 4L;

            for (int var8 = 0; var8 < var5; var8++) {
               this.field_35724[var8] = class_3685.field_18064.getByte(this.field_40840 + var6 + this.field_40844 * (long)var8);
            }

            try {
               return new String(this.field_35724, 0, var5, "UTF-8");
            } catch (UnsupportedEncodingException var9) {
               return null;
            }
         }
      }
   }

   public final String method_31785(long var1) {
      short var5 = this.field_35727.method_36124(var1);
      if (var5 < 0) {
         return null;
      } else {
         long var6 = this.field_40844 * var1 * (long)this.field_35728 * 4L;

         for (int var8 = 0; var8 < var5; var8++) {
            this.field_35724[var8] = class_3685.field_18064.getByte(this.field_40840 + var6 + this.field_40844 * (long)var8);
         }

         try {
            return new String(this.field_35724, 0, var5, "UTF-8");
         } catch (UnsupportedEncodingException var9) {
            return null;
         }
      }
   }

   @Override
   public final boolean method_36084(long var1) {
      String var5 = this.method_31787(var1);
      return var5 == null ? false : var5.length() != 0;
   }

   @Override
   public final byte method_36121(long var1) {
      String var5 = this.method_31787(var1);
      return (byte)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final short method_36103(long var1) {
      String var5 = this.method_31787(var1);
      return (short)(var5 == null ? 0 : 0xFF & var5.length());
   }

   @Override
   public final short method_36124(long var1) {
      String var5 = this.method_31787(var1);
      return (short)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final int method_36079(long var1) {
      String var5 = this.method_31787(var1);
      return var5 == null ? 0 : var5.length();
   }

   @Override
   public final long method_36076(long var1) {
      String var5 = this.method_31787(var1);
      return (long)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final float method_36133(long var1) {
      String var5 = this.method_31787(var1);
      return (float)(var5 == null ? 0 : var5.length());
   }

   @Override
   public final double method_36107(long var1) {
      String var5 = this.method_31787(var1);
      return (double)(var5 == null ? 0 : var5.length());
   }

   public final String[] method_31788() {
      return this.field_35723;
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
                  var3[var4] = this.field_35723[var4] == null ? false : this.field_35723[var4].length() != 0;
               }
            } else {
               boolean var6 = this.field_35723[0] == null ? false : this.field_35723[0].length() != 0;

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               short var8 = this.field_35727.method_36124((long)var7);
               var3[var7] = var8 != 0;
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
                     int var16 = this.field_35723[(int)var14] == null ? 0 : this.field_35723[(int)var14].length();
                     var12[var13++] = var16 != 0;
                  }
               } else {
                  boolean var17 = this.field_35723[0] == null ? false : this.field_35723[0].length() != 0;

                  for (long var18 = var2; var18 < var4; var18 += var6) {
                     var12[var13++] = var17;
                  }
               }
            } else {
               for (long var20 = var2; var20 < var4; var20 += var6) {
                  short var21 = this.field_35727.method_36124(var20);
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
   public final byte[] method_36104() {
      if (this.field_40837 > 1073741824L) {
         return null;
      } else {
         byte[] var3 = new byte[(int)this.field_40837];
         if (this.field_40840 == 0L) {
            if (!this.field_40838) {
               for (int var4 = 0; (long)var4 < this.field_40837; var4++) {
                  var3[var4] = (byte)(this.field_35723[var4] == null ? 0 : this.field_35723[var4].length());
               }
            } else {
               byte var6 = (byte)(this.field_35723[0] == null ? 0 : this.field_35723[0].length());

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (byte)this.field_35727.method_36124((long)var7);
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
                     var12[var13++] = (byte)(this.field_35723[(int)var14] == null ? 0 : this.field_35723[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (byte)(this.field_35723[0] == null ? 0 : this.field_35723[0].length());
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (byte)this.field_35727.method_36124(var17);
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
                  var3[var4] = (short)(this.field_35723[var4] == null ? 0 : this.field_35723[var4].length());
               }
            } else {
               short var6 = (short)(this.field_35723[0] == null ? 0 : this.field_35723[0].length());

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = this.field_35727.method_36124((long)var7);
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
                     var12[var13++] = (short)(this.field_35723[(int)var14] == null ? 0 : this.field_35723[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (short)(this.field_35723[0] == null ? 0 : this.field_35723[0].length());
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = this.field_35727.method_36124(var17);
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
                  var3[var4] = this.field_35723[var4] == null ? 0 : this.field_35723[var4].length();
               }
            } else {
               int var6 = this.field_35723[0] == null ? 0 : this.field_35723[0].length();

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = this.field_35727.method_36124((long)var7);
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
                     var12[var13++] = this.field_35723[(int)var14] == null ? 0 : this.field_35723[(int)var14].length();
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field_35723[0] == null ? 0 : this.field_35723[0].length();
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = this.field_35727.method_36124(var17);
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
                  var3[var4] = this.field_35723[var4] == null ? 0L : (long)this.field_35723[var4].length();
               }
            } else {
               int var6 = this.field_35723[0] == null ? 0 : this.field_35723[0].length();

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (long)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (long)this.field_35727.method_36124((long)var7);
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
                     var12[var13++] = (long)(this.field_35723[(int)var14] == null ? 0 : this.field_35723[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (long)(this.field_35723[0] == null ? 0 : this.field_35723[0].length());
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (long)this.field_35727.method_36124(var17);
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
                  var3[var4] = this.field_35723[var4] == null ? 0.0F : (float)this.field_35723[var4].length();
               }
            } else {
               int var6 = this.field_35723[0] == null ? 0 : this.field_35723[0].length();

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (float)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (float)this.field_35727.method_36124((long)var7);
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
                     var12[var13++] = (float)(this.field_35723[(int)var14] == null ? 0 : this.field_35723[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field_35723[0] == null ? 0.0F : (float)this.field_35723[0].length();
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (float)this.field_35727.method_36124(var17);
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
                  var3[var4] = this.field_35723[var4] == null ? 0.0 : (double)this.field_35723[var4].length();
               }
            } else {
               int var6 = this.field_35723[0] == null ? 0 : this.field_35723[0].length();

               for (int var5 = 0; (long)var5 < this.field_40837; var5++) {
                  var3[var5] = (double)var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field_40837; var7++) {
               var3[var7] = (double)this.field_35727.method_36124((long)var7);
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
                     var12[var13++] = (double)(this.field_35723[(int)var14] == null ? 0 : this.field_35723[(int)var14].length());
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field_35723[0] == null ? 0.0 : (double)this.field_35723[0].length();
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (double)this.field_35727.method_36124(var17);
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
      if (var3 == null) {
         this.field_35727.method_36129(var1, (short)-1);
      } else {
         if (!(var3 instanceof String)) {
            throw new IllegalArgumentException(var3 + " is not a string.");
         }

         String var6 = (String)var3;
         if (var6.length() > this.field_35728) {
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

         this.field_35727.method_36129(var1, (short)var8);
         long var9 = this.field_40844 * var1 * (long)this.field_35728 * 4L;

         for (int var11 = 0; var11 < var8; var11++) {
            class_3685.field_18064.putByte(this.field_40840 + var9 + this.field_40844 * (long)var11, var7[var11]);
         }
      }
   }

   @Override
   public final void method_36122(long var1, Object var3) {
      if (var3 == null) {
         if (this.field_40840 != 0L) {
            this.field_35727.method_36129(var1, (short)-1);
         } else {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_35723[(int)var1] = null;
         }
      } else {
         if (!(var3 instanceof String)) {
            throw new IllegalArgumentException(var3 + " is not a string.");
         }

         String var6 = (String)var3;
         if (this.field_40840 != 0L) {
            if (var6.length() > this.field_35728) {
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

            this.field_35727.method_36129(var1, (short)var8);
            long var9 = this.field_40844 * var1 * (long)this.field_35728 * 4L;

            for (int var11 = 0; var11 < var8; var11++) {
               class_3685.field_18064.putByte(this.field_40840 + var9 + this.field_40844 * (long)var11, var7[var11]);
            }
         } else {
            if (this.field_40838) {
               throw new IllegalAccessError("Constant arrays cannot be modified.");
            }

            this.field_35723[(int)var1] = var6;
         }
      }
   }

   @Override
   public final void method_36082(long var1, Object var3) {
      if (var1 >= 0L && var1 < this.field_40837) {
         this.method_36122(var1, var3);
      } else {
         throw new ArrayIndexOutOfBoundsException(Long.toString(var1));
      }
   }

   @Override
   public final void method_36109(long var1, boolean var3) {
      this.method_36122(var1, Boolean.toString(var3));
   }

   @Override
   public final void method_36117(long var1, byte var3) {
      this.method_36122(var1, Byte.toString(var3));
   }

   @Override
   public final void method_36086(long var1, short var3) {
      this.method_36129(var1, var3);
   }

   @Override
   public final void method_36129(long var1, short var3) {
      this.method_36122(var1, Short.toString(var3));
   }

   @Override
   public final void method_36092(long var1, int var3) {
      this.method_36122(var1, Integer.toString(var3));
   }

   @Override
   public final void method_36131(long var1, long var3) {
      this.method_36122(var1, Long.toString(var3));
   }

   @Override
   public final void method_36123(long var1, float var3) {
      this.method_36122(var1, Float.toString(var3));
   }

   @Override
   public final void method_36114(long var1, double var3) {
      this.method_36122(var1, Double.toString(var3));
   }

   public int method_31786() {
      return this.field_35728;
   }
}
