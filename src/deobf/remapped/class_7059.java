package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class class_7059 implements class_8067, class_3947, Cloneable {
   private static final byte[] field_36431 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
   public static final int field_36434 = 65533;
   public class_7332 field_36430;
   public long field_36433;

   public long method_32468() {
      return this.field_36433;
   }

   @Override
   public class_7059 method_18234() {
      return this;
   }

   @Override
   public OutputStream method_18245() {
      return new class_6723(this);
   }

   public class_7059 method_32482() {
      return this;
   }

   @Override
   public class_3947 method_18233() {
      return this;
   }

   @Override
   public boolean method_36605() {
      return this.field_36433 == 0L;
   }

   @Override
   public void method_36608(long var1) throws EOFException {
      if (this.field_36433 < var1) {
         throw new EOFException();
      }
   }

   @Override
   public boolean method_36591(long var1) {
      return this.field_36433 >= var1;
   }

   @Override
   public InputStream method_36574() {
      return new class_6974(this);
   }

   public class_7059 method_32470(OutputStream var1) throws IOException {
      return this.method_32471(var1, 0L, this.field_36433);
   }

   public class_7059 method_32471(OutputStream var1, long var2, long var4) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("out == null");
      } else {
         class_189.method_830(this.field_36433, var2, var4);
         if (var4 == 0L) {
            return this;
         } else {
            class_7332 var8;
            for (var8 = this.field_36430; var2 >= (long)(var8.field_37484 - var8.field_37477); var8 = var8.field_37475) {
               var2 -= (long)(var8.field_37484 - var8.field_37477);
            }

            while (var4 > 0L) {
               int var9 = (int)((long)var8.field_37477 + var2);
               int var10 = (int)Math.min((long)(var8.field_37484 - var9), var4);
               var1.write(var8.field_37478, var9, var10);
               var4 -= (long)var10;
               var2 = 0L;
               var8 = var8.field_37475;
            }

            return this;
         }
      }
   }

   public class_7059 method_32472(class_7059 var1, long var2, long var4) {
      if (var1 == null) {
         throw new IllegalArgumentException("out == null");
      } else {
         class_189.method_830(this.field_36433, var2, var4);
         if (var4 == 0L) {
            return this;
         } else {
            var1.field_36433 += var4;

            class_7332 var8;
            for (var8 = this.field_36430; var2 >= (long)(var8.field_37484 - var8.field_37477); var8 = var8.field_37475) {
               var2 -= (long)(var8.field_37484 - var8.field_37477);
            }

            while (var4 > 0L) {
               class_7332 var9 = new class_7332(var8);
               var9.field_37477 = (int)((long)var9.field_37477 + var2);
               var9.field_37484 = Math.min(var9.field_37477 + (int)var4, var9.field_37484);
               if (var1.field_36430 != null) {
                  var1.field_36430.field_37480.method_33417(var9);
               } else {
                  var1.field_36430 = var9.field_37475 = var9.field_37480 = var9;
               }

               var4 -= (long)(var9.field_37484 - var9.field_37477);
               var2 = 0L;
               var8 = var8.field_37475;
            }

            return this;
         }
      }
   }

   public class_7059 method_32452(OutputStream var1) throws IOException {
      return this.method_32453(var1, this.field_36433);
   }

   public class_7059 method_32453(OutputStream var1, long var2) throws IOException {
      if (var1 != null) {
         class_189.method_830(this.field_36433, 0L, var2);
         class_7332 var6 = this.field_36430;

         while (var2 > 0L) {
            int var7 = (int)Math.min(var2, (long)(var6.field_37484 - var6.field_37477));
            var1.write(var6.field_37478, var6.field_37477, var7);
            var6.field_37477 += var7;
            this.field_36433 -= (long)var7;
            var2 -= (long)var7;
            if (var6.field_37477 == var6.field_37484) {
               class_7332 var8 = var6;
               this.field_36430 = var6 = var6.method_33414();
               class_420.method_2090(var8);
            }
         }

         return this;
      } else {
         throw new IllegalArgumentException("out == null");
      }
   }

   public class_7059 method_32458(InputStream var1) throws IOException {
      this.method_32460(var1, Long.MAX_VALUE, true);
      return this;
   }

   public class_7059 method_32459(InputStream var1, long var2) throws IOException {
      if (var2 >= 0L) {
         this.method_32460(var1, var2, false);
         return this;
      } else {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      }
   }

   private void method_32460(InputStream var1, long var2, boolean var4) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("in == null");
      } else {
         while (var2 > 0L || var4) {
            class_7332 var7 = this.method_32473(1);
            int var8 = (int)Math.min(var2, (long)(8192 - var7.field_37484));
            int var9 = var1.read(var7.field_37478, var7.field_37484, var8);
            if (var9 == -1) {
               if (!var4) {
                  throw new EOFException();
               }

               return;
            }

            var7.field_37484 += var9;
            this.field_36433 += (long)var9;
            var2 -= (long)var9;
         }
      }
   }

   public long method_32467() {
      long var3 = this.field_36433;
      if (var3 != 0L) {
         class_7332 var5 = this.field_36430.field_37480;
         if (var5.field_37484 < 8192 && var5.field_37481) {
            var3 -= (long)(var5.field_37484 - var5.field_37477);
         }

         return var3;
      } else {
         return 0L;
      }
   }

   @Override
   public byte method_36602() {
      if (this.field_36433 != 0L) {
         class_7332 var3 = this.field_36430;
         int var4 = var3.field_37477;
         int var5 = var3.field_37484;
         byte[] var6 = var3.field_37478;
         byte var7 = var6[var4++];
         this.field_36433--;
         if (var4 != var5) {
            var3.field_37477 = var4;
         } else {
            this.field_36430 = var3.method_33414();
            class_420.method_2090(var3);
         }

         return var7;
      } else {
         throw new IllegalStateException("size == 0");
      }
   }

   public byte method_32485(long var1) {
      class_189.method_830(this.field_36433, var1, 1L);
      class_7332 var5 = this.field_36430;

      while (true) {
         int var6 = var5.field_37484 - var5.field_37477;
         if (var1 < (long)var6) {
            return var5.field_37478[var5.field_37477 + (int)var1];
         }

         var1 -= (long)var6;
         var5 = var5.field_37475;
      }
   }

   @Override
   public short method_36588() {
      if (this.field_36433 >= 2L) {
         class_7332 var3 = this.field_36430;
         int var4 = var3.field_37477;
         int var5 = var3.field_37484;
         if (var5 - var4 >= 2) {
            byte[] var10 = var3.field_37478;
            int var7 = (var10[var4++] & 255) << 8 | var10[var4++] & 255;
            this.field_36433 -= 2L;
            if (var4 != var5) {
               var3.field_37477 = var4;
            } else {
               this.field_36430 = var3.method_33414();
               class_420.method_2090(var3);
            }

            return (short)var7;
         } else {
            int var6 = (this.method_36602() & 255) << 8 | this.method_36602() & 255;
            return (short)var6;
         }
      } else {
         throw new IllegalStateException("size < 2: " + this.field_36433);
      }
   }

   @Override
   public int method_36603() {
      if (this.field_36433 >= 4L) {
         class_7332 var3 = this.field_36430;
         int var4 = var3.field_37477;
         int var5 = var3.field_37484;
         if (var5 - var4 >= 4) {
            byte[] var6 = var3.field_37478;
            int var7 = (var6[var4++] & 255) << 24 | (var6[var4++] & 255) << 16 | (var6[var4++] & 255) << 8 | var6[var4++] & 255;
            this.field_36433 -= 4L;
            if (var4 != var5) {
               var3.field_37477 = var4;
            } else {
               this.field_36430 = var3.method_33414();
               class_420.method_2090(var3);
            }

            return var7;
         } else {
            return (this.method_36602() & 0xFF) << 24 | (this.method_36602() & 0xFF) << 16 | (this.method_36602() & 0xFF) << 8 | this.method_36602() & 0xFF;
         }
      } else {
         throw new IllegalStateException("size < 4: " + this.field_36433);
      }
   }

   @Override
   public long method_36594() {
      if (this.field_36433 >= 8L) {
         class_7332 var3 = this.field_36430;
         int var4 = var3.field_37477;
         int var5 = var3.field_37484;
         if (var5 - var4 >= 8) {
            byte[] var6 = var3.field_37478;
            long var7 = ((long)var6[var4++] & 255L) << 56
               | ((long)var6[var4++] & 255L) << 48
               | ((long)var6[var4++] & 255L) << 40
               | ((long)var6[var4++] & 255L) << 32
               | ((long)var6[var4++] & 255L) << 24
               | ((long)var6[var4++] & 255L) << 16
               | ((long)var6[var4++] & 255L) << 8
               | (long)var6[var4++] & 255L;
            this.field_36433 -= 8L;
            if (var4 != var5) {
               var3.field_37477 = var4;
            } else {
               this.field_36430 = var3.method_33414();
               class_420.method_2090(var3);
            }

            return var7;
         } else {
            return ((long)this.method_36603() & 4294967295L) << 32 | (long)this.method_36603() & 4294967295L;
         }
      } else {
         throw new IllegalStateException("size < 8: " + this.field_36433);
      }
   }

   @Override
   public short method_36582() {
      return class_189.method_829(this.method_36588());
   }

   @Override
   public int method_36604() {
      return class_189.method_827(this.method_36603());
   }

   @Override
   public long method_36596() {
      return class_189.method_832(this.method_36594());
   }

   @Override
   public long method_36579() {
      if (this.field_36433 == 0L) {
         throw new IllegalStateException("size == 0");
      } else {
         long var3 = 0L;
         int var5 = 0;
         boolean var6 = false;
         boolean var7 = false;
         long var8 = -922337203685477580L;
         long var10 = -7L;

         while (true) {
            class_7332 var12 = this.field_36430;
            byte[] var13 = var12.field_37478;
            int var14 = var12.field_37477;
            int var15 = var12.field_37484;

            while (true) {
               label95: {
                  if (var14 < var15) {
                     byte var16 = var13[var14];
                     if (var16 >= 48 && var16 <= 57) {
                        int var17 = 48 - var16;
                        if (var3 < var8 || var3 == var8 && (long)var17 < var10) {
                           class_7059 var18 = new class_7059().method_32461(var3).method_32494(var16);
                           if (!var6) {
                              var18.method_36602();
                           }

                           throw new NumberFormatException("Number too large: " + var18.method_36592());
                        }

                        var3 *= 10L;
                        var3 += (long)var17;
                        break label95;
                     }

                     if (var16 == 45 && var5 == 0) {
                        var6 = true;
                        var10--;
                        break label95;
                     }

                     if (var5 == 0) {
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(var16));
                     }

                     var7 = true;
                  }

                  if (var14 != var15) {
                     var12.field_37477 = var14;
                  } else {
                     this.field_36430 = var12.method_33414();
                     class_420.method_2090(var12);
                  }

                  if (!var7 && this.field_36430 != null) {
                     break;
                  }

                  this.field_36433 -= (long)var5;
                  return !var6 ? -var3 : var3;
               }

               var14++;
               var5++;
            }
         }
      }
   }

   @Override
   public long method_36607() {
      if (this.field_36433 == 0L) {
         throw new IllegalStateException("size == 0");
      } else {
         long var3 = 0L;
         int var5 = 0;
         boolean var6 = false;

         do {
            class_7332 var7 = this.field_36430;
            byte[] var8 = var7.field_37478;
            int var9 = var7.field_37477;

            int var10;
            for (var10 = var7.field_37484; var9 < var10; var5++) {
               byte var11 = var8[var9];
               int var12;
               if (var11 >= 48 && var11 <= 57) {
                  var12 = var11 - 48;
               } else if (var11 >= 97 && var11 <= 102) {
                  var12 = var11 - 97 + 10;
               } else {
                  if (var11 < 65 || var11 > 70) {
                     if (var5 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(var11));
                     }

                     var6 = true;
                     break;
                  }

                  var12 = var11 - 65 + 10;
               }

               if ((var3 & -1152921504606846976L) != 0L) {
                  class_7059 var13 = new class_7059().method_32462(var3).method_32494(var11);
                  throw new NumberFormatException("Number too large: " + var13.method_36592());
               }

               var3 <<= 4;
               var3 |= (long)var12;
               var9++;
            }

            if (var9 != var10) {
               var7.field_37477 = var9;
            } else {
               this.field_36430 = var7.method_33414();
               class_420.method_2090(var7);
            }
         } while (!var6 && this.field_36430 != null);

         this.field_36433 -= (long)var5;
         return var3;
      }
   }

   @Override
   public class_9091 method_36586() {
      return new class_9091(this.method_36599());
   }

   @Override
   public class_9091 method_36587(long var1) throws EOFException {
      return new class_9091(this.method_36600(var1));
   }

   @Override
   public int method_36606(class_5780 var1) {
      class_7332 var4 = this.field_36430;
      if (var4 == null) {
         return var1.indexOf(class_9091.field_46557);
      } else {
         class_9091[] var5 = var1.field_29196;
         int var6 = 0;

         for (int var7 = var5.length; var6 < var7; var6++) {
            class_9091 var8 = var5[var6];
            if (this.field_36433 >= (long)var8.method_41902() && this.method_32479(var4, var4.field_37477, var8, 0, var8.method_41902())) {
               try {
                  this.method_36583((long)var8.method_41902());
                  return var6;
               } catch (EOFException var10) {
                  throw new AssertionError(var10);
               }
            }
         }

         return -1;
      }
   }

   public int method_32464(class_5780 var1) {
      class_7332 var4 = this.field_36430;
      class_9091[] var5 = var1.field_29196;
      int var6 = 0;

      for (int var7 = var5.length; var6 < var7; var6++) {
         class_9091 var8 = var5[var6];
         int var9 = (int)Math.min(this.field_36433, (long)var8.method_41902());
         if (var9 == 0 || this.method_32479(var4, var4.field_37477, var8, 0, var9)) {
            return var6;
         }
      }

      return -1;
   }

   @Override
   public void method_36575(class_7059 var1, long var2) throws EOFException {
      if (this.field_36433 >= var2) {
         var1.method_19191(this, var2);
      } else {
         var1.method_19191(this, this.field_36433);
         throw new EOFException();
      }
   }

   @Override
   public long method_36573(class_4131 var1) throws IOException {
      long var4 = this.field_36433;
      if (var4 > 0L) {
         var1.method_19191(this, var4);
      }

      return var4;
   }

   @Override
   public String method_36592() {
      try {
         return this.method_36597(this.field_36433, class_189.field_630);
      } catch (EOFException var4) {
         throw new AssertionError(var4);
      }
   }

   @Override
   public String method_36593(long var1) throws EOFException {
      return this.method_36597(var1, class_189.field_630);
   }

   @Override
   public String method_36598(Charset var1) {
      try {
         return this.method_36597(this.field_36433, var1);
      } catch (EOFException var5) {
         throw new AssertionError(var5);
      }
   }

   @Override
   public String method_36597(long var1, Charset var3) throws EOFException {
      class_189.method_830(this.field_36433, 0L, var1);
      if (var3 != null) {
         if (var1 <= 2147483647L) {
            if (var1 != 0L) {
               class_7332 var6 = this.field_36430;
               if ((long)var6.field_37477 + var1 <= (long)var6.field_37484) {
                  String var7 = new String(var6.field_37478, var6.field_37477, (int)var1, var3);
                  var6.field_37477 = (int)((long)var6.field_37477 + var1);
                  this.field_36433 -= var1;
                  if (var6.field_37477 == var6.field_37484) {
                     this.field_36430 = var6.method_33414();
                     class_420.method_2090(var6);
                  }

                  return var7;
               } else {
                  return new String(this.method_36600(var1), var3);
               }
            } else {
               return "";
            }
         } else {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + var1);
         }
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   @Nullable
   @Override
   public String method_36595() throws EOFException {
      long var3 = this.method_36609((byte)10);
      if (var3 != -1L) {
         return this.method_32481(var3);
      } else {
         return this.field_36433 == 0L ? null : this.method_36593(this.field_36433);
      }
   }

   @Override
   public String method_36584() throws EOFException {
      return this.method_36585(Long.MAX_VALUE);
   }

   @Override
   public String method_36585(long var1) throws EOFException {
      if (var1 >= 0L) {
         long var5 = var1 != Long.MAX_VALUE ? var1 + 1L : Long.MAX_VALUE;
         long var7 = this.method_36611((byte)10, 0L, var5);
         if (var7 == -1L) {
            if (var5 < this.method_32468() && this.method_32485(var5 - 1L) == 13 && this.method_32485(var5) == 10) {
               return this.method_32481(var5);
            } else {
               class_7059 var9 = new class_7059();
               this.method_32472(var9, 0L, Math.min(32L, this.method_32468()));
               throw new EOFException("\\n not found: limit=" + Math.min(this.method_32468(), var1) + " content=" + var9.method_36586().method_41900() + '…');
            }
         } else {
            return this.method_32481(var7);
         }
      } else {
         throw new IllegalArgumentException("limit < 0: " + var1);
      }
   }

   public String method_32481(long var1) throws EOFException {
      if (var1 > 0L && this.method_32485(var1 - 1L) == 13) {
         String var6 = this.method_36593(var1 - 1L);
         this.method_36583(2L);
         return var6;
      } else {
         String var5 = this.method_36593(var1);
         this.method_36583(1L);
         return var5;
      }
   }

   @Override
   public int method_36601() throws EOFException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1827709276
      // 003: istore 1
      // 004: aload 0
      // 005: getfield remapped/class_7059.field_36433 J
      // 008: lconst_0
      // 009: lcmp
      // 00a: ifeq 0b5
      // 00d: aload 0
      // 00e: lconst_0
      // 00f: invokevirtual remapped/class_7059.method_32485 (J)B
      // 012: istore 3
      // 013: goto 0be
      // 016: iload 1
      // 017: ldc_w 8388608
      // 01a: iand
      // 01b: ifne 091
      // 01e: iload 1
      // 01f: ldc_w 2147483647
      // 022: iand
      // 023: ifne 029
      // 026: goto 065
      // 029: iload 1
      // 02a: ldc_w 134217728
      // 02d: iand
      // 02e: ifeq 034
      // 031: goto 03f
      // 034: iload 3
      // 035: sipush 224
      // 038: iand
      // 039: sipush 192
      // 03c: if_icmpeq 0ce
      // 03f: iload 1
      // 040: ldc_w 4194304
      // 043: iand
      // 044: ifeq 04a
      // 047: goto 091
      // 04a: iload 1
      // 04b: ldc_w 8
      // 04e: iand
      // 04f: ifne 065
      // 052: iload 1
      // 053: ldc_w 32
      // 056: iand
      // 057: ifeq 016
      // 05a: iload 3
      // 05b: sipush 240
      // 05e: iand
      // 05f: sipush 224
      // 062: if_icmpeq 0e0
      // 065: iload 1
      // 066: ldc_w 64
      // 069: iand
      // 06a: ifeq 070
      // 06d: goto 091
      // 070: iload 1
      // 071: ldc_w 524288
      // 074: iand
      // 075: ifne 07b
      // 078: goto 03f
      // 07b: iload 1
      // 07c: ldc_w 536870912
      // 07f: iand
      // 080: ifeq 086
      // 083: goto 016
      // 086: iload 3
      // 087: sipush 248
      // 08a: iand
      // 08b: sipush 240
      // 08e: if_icmpeq 0f2
      // 091: iload 1
      // 092: ldc_w 536870912
      // 095: iand
      // 096: ifne 065
      // 099: iload 1
      // 09a: ldc_w 262144
      // 09d: iand
      // 09e: ifeq 03f
      // 0a1: iload 1
      // 0a2: ldc_w 8192
      // 0a5: iand
      // 0a6: ifeq 0ac
      // 0a9: goto 016
      // 0ac: aload 0
      // 0ad: lconst_1
      // 0ae: invokevirtual remapped/class_7059.method_36583 (J)V
      // 0b1: ldc 65533
      // 0b3: ireturn
      // 0b4: athrow
      // 0b5: new java/io/EOFException
      // 0b8: dup
      // 0b9: invokespecial java/io/EOFException.<init> ()V
      // 0bc: athrow
      // 0bd: athrow
      // 0be: iload 3
      // 0bf: bipush 127
      // 0c1: iand
      // 0c2: istore 4
      // 0c4: bipush 1
      // 0c5: istore 5
      // 0c7: bipush 0
      // 0c8: istore 6
      // 0ca: goto 100
      // 0cd: athrow
      // 0ce: iload 3
      // 0cf: bipush 31
      // 0d1: iand
      // 0d2: istore 4
      // 0d4: bipush 2
      // 0d5: istore 5
      // 0d7: sipush 128
      // 0da: istore 6
      // 0dc: goto 100
      // 0df: athrow
      // 0e0: iload 3
      // 0e1: bipush 15
      // 0e3: iand
      // 0e4: istore 4
      // 0e6: bipush 3
      // 0e7: istore 5
      // 0e9: sipush 2048
      // 0ec: istore 6
      // 0ee: goto 100
      // 0f1: athrow
      // 0f2: iload 3
      // 0f3: bipush 7
      // 0f5: iand
      // 0f6: istore 4
      // 0f8: bipush 4
      // 0f9: istore 5
      // 0fb: ldc_w 65536
      // 0fe: istore 6
      // 100: iload 1
      // 101: ldc_w 16777216
      // 104: iand
      // 105: ifeq 113
      // 108: aload 0
      // 109: getfield remapped/class_7059.field_36433 J
      // 10c: iload 5
      // 10e: i2l
      // 10f: lcmp
      // 110: iflt 122
      // 113: iload 1
      // 114: ldc_w 4194304
      // 117: iand
      // 118: ifne 100
      // 11b: bipush 1
      // 11c: istore 7
      // 11e: goto 160
      // 121: athrow
      // 122: new java/io/EOFException
      // 125: dup
      // 126: new java/lang/StringBuilder
      // 129: dup
      // 12a: invokespecial java/lang/StringBuilder.<init> ()V
      // 12d: ldc_w "size < "
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 133: iload 5
      // 135: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 138: ldc_w ": "
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13e: aload 0
      // 13f: getfield remapped/class_7059.field_36433 J
      // 142: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 145: ldc_w " (to read code point prefixed 0x"
      // 148: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b: iload 3
      // 14c: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 152: ldc_w ")"
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 158: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15b: invokespecial java/io/EOFException.<init> (Ljava/lang/String;)V
      // 15e: athrow
      // 15f: athrow
      // 160: iload 7
      // 162: iload 5
      // 164: if_icmplt 1fe
      // 167: iload 1
      // 168: ldc_w 2147483647
      // 16b: iand
      // 16c: ifne 172
      // 16f: goto 1df
      // 172: iload 1
      // 173: ldc_w 67108864
      // 176: iand
      // 177: ifeq 17d
      // 17a: goto 1bd
      // 17d: iload 1
      // 17e: ldc_w 536870912
      // 181: iand
      // 182: ifeq 188
      // 185: goto 197
      // 188: aload 0
      // 189: iload 5
      // 18b: i2l
      // 18c: invokevirtual remapped/class_7059.method_36583 (J)V
      // 18f: iload 4
      // 191: ldc_w 1114111
      // 194: if_icmpgt 236
      // 197: iload 1
      // 198: ldc_w 8388608
      // 19b: iand
      // 19c: ifeq 1a2
      // 19f: goto 1df
      // 1a2: iload 1
      // 1a3: ldc_w 8388608
      // 1a6: iand
      // 1a7: ifeq 1ad
      // 1aa: goto 1bd
      // 1ad: iload 1
      // 1ae: ldc_w 8
      // 1b1: iand
      // 1b2: ifne 167
      // 1b5: iload 4
      // 1b7: ldc_w 55296
      // 1ba: if_icmpge 23a
      // 1bd: iload 1
      // 1be: ldc_w 32
      // 1c1: iand
      // 1c2: ifne 1c8
      // 1c5: goto 1df
      // 1c8: iload 1
      // 1c9: ldc_w 32
      // 1cc: iand
      // 1cd: ifeq 197
      // 1d0: iload 1
      // 1d1: ldc_w 4096
      // 1d4: iand
      // 1d5: ifeq 167
      // 1d8: iload 4
      // 1da: iload 6
      // 1dc: if_icmplt 24a
      // 1df: iload 1
      // 1e0: ldc_w 33554432
      // 1e3: iand
      // 1e4: ifne 1ea
      // 1e7: goto 1bd
      // 1ea: iload 1
      // 1eb: ldc_w 131072
      // 1ee: iand
      // 1ef: ifeq 197
      // 1f2: iload 1
      // 1f3: ldc_w 4
      // 1f6: iand
      // 1f7: ifeq 167
      // 1fa: iload 4
      // 1fc: ireturn
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: iload 7
      // 201: i2l
      // 202: invokevirtual remapped/class_7059.method_32485 (J)B
      // 205: istore 8
      // 207: iload 8
      // 209: sipush 192
      // 20c: iand
      // 20d: sipush 128
      // 210: if_icmpeq 21e
      // 213: aload 0
      // 214: iload 7
      // 216: i2l
      // 217: invokevirtual remapped/class_7059.method_36583 (J)V
      // 21a: ldc 65533
      // 21c: ireturn
      // 21d: athrow
      // 21e: iload 4
      // 220: bipush 6
      // 222: ishl
      // 223: istore 4
      // 225: iload 4
      // 227: iload 8
      // 229: bipush 63
      // 22b: iand
      // 22c: ior
      // 22d: istore 4
      // 22f: iinc 7 1
      // 232: goto 160
      // 235: athrow
      // 236: ldc 65533
      // 238: ireturn
      // 239: athrow
      // 23a: iload 4
      // 23c: ldc_w 57343
      // 23f: if_icmple 246
      // 242: goto 1bd
      // 245: athrow
      // 246: ldc 65533
      // 248: ireturn
      // 249: athrow
      // 24a: ldc 65533
      // 24c: ireturn
      // 24d: athrow
   }

   @Override
   public byte[] method_36599() {
      try {
         return this.method_36600(this.field_36433);
      } catch (EOFException var4) {
         throw new AssertionError(var4);
      }
   }

   @Override
   public byte[] method_36600(long var1) throws EOFException {
      class_189.method_830(this.field_36433, 0L, var1);
      if (var1 <= 2147483647L) {
         byte[] var5 = new byte[(int)var1];
         this.method_36576(var5);
         return var5;
      } else {
         throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + var1);
      }
   }

   @Override
   public int method_36577(byte[] var1) {
      return this.method_36578(var1, 0, var1.length);
   }

   @Override
   public void method_36576(byte[] var1) throws EOFException {
      int var4 = 0;

      while (var4 < var1.length) {
         int var5 = this.method_36578(var1, var4, var1.length - var4);
         if (var5 == -1) {
            throw new EOFException();
         }

         var4 += var5;
      }
   }

   @Override
   public int method_36578(byte[] var1, int var2, int var3) {
      class_189.method_830((long)var1.length, (long)var2, (long)var3);
      class_7332 var6 = this.field_36430;
      if (var6 != null) {
         int var7 = Math.min(var3, var6.field_37484 - var6.field_37477);
         System.arraycopy(var6.field_37478, var6.field_37477, var1, var2, var7);
         var6.field_37477 += var7;
         this.field_36433 -= (long)var7;
         if (var6.field_37477 == var6.field_37484) {
            this.field_36430 = var6.method_33414();
            class_420.method_2090(var6);
         }

         return var7;
      } else {
         return -1;
      }
   }

   public void method_32455() {
      try {
         this.method_36583(this.field_36433);
      } catch (EOFException var4) {
         throw new AssertionError(var4);
      }
   }

   @Override
   public void method_36583(long var1) throws EOFException {
      while (var1 > 0L) {
         if (this.field_36430 == null) {
            throw new EOFException();
         }

         int var5 = (int)Math.min(var1, (long)(this.field_36430.field_37484 - this.field_36430.field_37477));
         this.field_36433 -= (long)var5;
         var1 -= (long)var5;
         this.field_36430.field_37477 += var5;
         if (this.field_36430.field_37477 == this.field_36430.field_37484) {
            class_7332 var6 = this.field_36430;
            this.field_36430 = var6.method_33414();
            class_420.method_2090(var6);
         }
      }
   }

   public class_7059 method_32487(class_9091 var1) {
      if (var1 != null) {
         var1.method_41916(this);
         return this;
      } else {
         throw new IllegalArgumentException("byteString == null");
      }
   }

   public class_7059 method_32491(String var1) {
      return this.method_32492(var1, 0, var1.length());
   }

   public class_7059 method_32492(String var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("string == null");
      } else if (var2 < 0) {
         throw new IllegalArgumentException("beginIndex < 0: " + var2);
      } else if (var3 < var2) {
         throw new IllegalArgumentException("endIndex < beginIndex: " + var3 + " < " + var2);
      } else if (var3 > var1.length()) {
         throw new IllegalArgumentException("endIndex > string.length: " + var3 + " > " + var1.length());
      } else {
         int var6 = var2;

         while (var6 < var3) {
            char var7 = var1.charAt(var6);
            if (var7 >= 128) {
               if (var7 >= 2048) {
                  if (var7 >= '\ud800' && var7 <= '\udfff') {
                     char var14 = var6 + 1 >= var3 ? 0 : var1.charAt(var6 + 1);
                     if (var7 <= '\udbff' && var14 >= '\udc00' && var14 <= '\udfff') {
                        int var15 = 65536 + ((var7 & -55297) << 10 | var14 & -56321);
                        this.method_32494(var15 >> 18 | 240);
                        this.method_32494(var15 >> 12 & 63 | 128);
                        this.method_32494(var15 >> 6 & 63 | 128);
                        this.method_32494(var15 & 63 | 128);
                        var6 += 2;
                     } else {
                        this.method_32494(63);
                        var6++;
                     }
                  } else {
                     this.method_32494(var7 >> '\f' | 224);
                     this.method_32494(var7 >> 6 & 63 | 128);
                     this.method_32494(var7 & '?' | 128);
                     var6++;
                  }
               } else {
                  this.method_32494(var7 >> 6 | 192);
                  this.method_32494(var7 & '?' | 128);
                  var6++;
               }
            } else {
               class_7332 var8 = this.method_32473(1);
               byte[] var9 = var8.field_37478;
               int var10 = var8.field_37484 - var6;
               int var11 = Math.min(var3, 8192 - var10);
               var9[var10 + var6++] = (byte)var7;

               while (true) {
                  if (var6 < var11) {
                     var7 = var1.charAt(var6);
                     if (var7 < 128) {
                        var9[var10 + var6++] = (byte)var7;
                        continue;
                     }
                  }

                  int var12 = var6 + var10 - var8.field_37484;
                  var8.field_37484 += var12;
                  this.field_36433 += (long)var12;
                  break;
               }
            }
         }

         return this;
      }
   }

   public class_7059 method_32483(int var1) {
      if (var1 >= 128) {
         if (var1 >= 2048) {
            if (var1 >= 65536) {
               if (var1 > 1114111) {
                  throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(var1));
               }

               this.method_32494(var1 >> 18 | 240);
               this.method_32494(var1 >> 12 & 63 | 128);
               this.method_32494(var1 >> 6 & 63 | 128);
               this.method_32494(var1 & 63 | 128);
            } else if (var1 >= 55296 && var1 <= 57343) {
               this.method_32494(63);
            } else {
               this.method_32494(var1 >> 12 | 224);
               this.method_32494(var1 >> 6 & 63 | 128);
               this.method_32494(var1 & 63 | 128);
            }
         } else {
            this.method_32494(var1 >> 6 | 192);
            this.method_32494(var1 & 63 | 128);
         }
      } else {
         this.method_32494(var1);
      }

      return this;
   }

   public class_7059 method_32497(String var1, Charset var2) {
      return this.method_32496(var1, 0, var1.length(), var2);
   }

   public class_7059 method_32496(String var1, int var2, int var3, Charset var4) {
      if (var1 != null) {
         if (var2 >= 0) {
            if (var3 >= var2) {
               if (var3 <= var1.length()) {
                  if (var4 != null) {
                     if (!var4.equals(class_189.field_630)) {
                        byte[] var7 = var1.substring(var2, var3).getBytes(var4);
                        return this.method_32489(var7, 0, var7.length);
                     } else {
                        return this.method_32492(var1, var2, var3);
                     }
                  } else {
                     throw new IllegalArgumentException("charset == null");
                  }
               } else {
                  throw new IllegalArgumentException("endIndex > string.length: " + var3 + " > " + var1.length());
               }
            } else {
               throw new IllegalArgumentException("endIndex < beginIndex: " + var3 + " < " + var2);
            }
         } else {
            throw new IllegalAccessError("beginIndex < 0: " + var2);
         }
      } else {
         throw new IllegalArgumentException("string == null");
      }
   }

   public class_7059 method_32488(byte[] var1) {
      if (var1 != null) {
         return this.method_32489(var1, 0, var1.length);
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   public class_7059 method_32489(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         class_189.method_830((long)var1.length, (long)var2, (long)var3);
         int var6 = var2 + var3;

         while (var2 < var6) {
            class_7332 var7 = this.method_32473(1);
            int var8 = Math.min(var6 - var2, 8192 - var7.field_37484);
            System.arraycopy(var1, var2, var7.field_37478, var7.field_37484, var8);
            var2 += var8;
            var7.field_37484 += var8;
         }

         this.field_36433 += (long)var3;
         return this;
      }
   }

   @Override
   public long method_18237(class_5322 var1) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         long var4 = 0L;

         long var6;
         while ((var6 = var1.method_24273(this, 8192L)) != -1L) {
            var4 += var6;
         }

         return var4;
      }
   }

   @Override
   public class_3947 method_18246(class_5322 var1, long var2) throws IOException {
      while (var2 > 0L) {
         long var6 = var1.method_24273(this, var2);
         if (var6 == -1L) {
            throw new EOFException();
         }

         var2 -= var6;
      }

      return this;
   }

   public class_7059 method_32494(int var1) {
      class_7332 var4 = this.method_32473(1);
      var4.field_37478[var4.field_37484++] = (byte)var1;
      this.field_36433++;
      return this;
   }

   public class_7059 method_32493(int var1) {
      class_7332 var4 = this.method_32473(2);
      byte[] var5 = var4.field_37478;
      int var6 = var4.field_37484;
      var5[var6++] = (byte)(var1 >>> 8 & 0xFF);
      var5[var6++] = (byte)(var1 & 0xFF);
      var4.field_37484 = var6;
      this.field_36433 += 2L;
      return this;
   }

   public class_7059 method_32474(int var1) {
      return this.method_32493(class_189.method_829((short)var1));
   }

   public class_7059 method_32456(int var1) {
      class_7332 var4 = this.method_32473(4);
      byte[] var5 = var4.field_37478;
      int var6 = var4.field_37484;
      var5[var6++] = (byte)(var1 >>> 24 & 0xFF);
      var5[var6++] = (byte)(var1 >>> 16 & 0xFF);
      var5[var6++] = (byte)(var1 >>> 8 & 0xFF);
      var5[var6++] = (byte)(var1 & 0xFF);
      var4.field_37484 = var6;
      this.field_36433 += 4L;
      return this;
   }

   public class_7059 method_32475(int var1) {
      return this.method_32456(class_189.method_827(var1));
   }

   public class_7059 method_32457(long var1) {
      class_7332 var5 = this.method_32473(8);
      byte[] var6 = var5.field_37478;
      int var7 = var5.field_37484;
      var6[var7++] = (byte)((int)(var1 >>> 56 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 48 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 40 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 32 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 24 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 16 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 8 & 255L));
      var6[var7++] = (byte)((int)(var1 & 255L));
      var5.field_37484 = var7;
      this.field_36433 += 8L;
      return this;
   }

   public class_7059 method_32480(long var1) {
      return this.method_32457(class_189.method_832(var1));
   }

   public class_7059 method_32461(long var1) {
      if (var1 == 0L) {
         return this.method_32494(48);
      } else {
         boolean var5 = false;
         if (var1 < 0L) {
            var1 = -var1;
            if (var1 < 0L) {
               return this.method_32491("-9223372036854775808");
            }

            var5 = true;
         }

         int var6 = var1 >= 100000000L
            ? (
               var1 >= 1000000000000L
                  ? (
                     var1 >= 1000000000000000L
                        ? (var1 >= 100000000000000000L ? (var1 >= 1000000000000000000L ? 19 : 18) : (var1 >= 10000000000000000L ? 17 : 16))
                        : (var1 >= 10000000000000L ? (var1 >= 100000000000000L ? 15 : 14) : 13)
                  )
                  : (var1 >= 10000000000L ? (var1 >= 100000000000L ? 12 : 11) : (var1 >= 1000000000L ? 10 : 9))
            )
            : (
               var1 >= 10000L
                  ? (var1 >= 1000000L ? (var1 >= 10000000L ? 8 : 7) : (var1 >= 100000L ? 6 : 5))
                  : (var1 >= 100L ? (var1 >= 1000L ? 4 : 3) : (var1 >= 10L ? 2 : 1))
            );
         if (var5) {
            var6++;
         }

         class_7332 var7 = this.method_32473(var6);
         byte[] var8 = var7.field_37478;

         int var9;
         for (var9 = var7.field_37484 + var6; var1 != 0L; var1 /= 10L) {
            int var10 = (int)(var1 % 10L);
            var9--;
            var8[var9] = field_36431[var10];
         }

         if (var5) {
            var9--;
            var8[var9] = 45;
         }

         var7.field_37484 += var6;
         this.field_36433 += (long)var6;
         return this;
      }
   }

   public class_7059 method_32462(long var1) {
      if (var1 == 0L) {
         return this.method_32494(48);
      } else {
         int var5 = Long.numberOfTrailingZeros(Long.highestOneBit(var1)) / 4 + 1;
         class_7332 var6 = this.method_32473(var5);
         byte[] var7 = var6.field_37478;
         int var8 = var6.field_37484 + var5 - 1;

         for (int var9 = var6.field_37484; var8 >= var9; var8--) {
            var7[var8] = field_36431[(int)(var1 & 15L)];
            var1 >>>= 4;
         }

         var6.field_37484 += var5;
         this.field_36433 += (long)var5;
         return this;
      }
   }

   public class_7332 method_32473(int var1) {
      if (var1 < 1 || var1 > 8192) {
         throw new IllegalArgumentException();
      } else if (this.field_36430 == null) {
         this.field_36430 = class_420.method_2091();
         return this.field_36430.field_37475 = this.field_36430.field_37480 = this.field_36430;
      } else {
         class_7332 var4 = this.field_36430.field_37480;
         if (var4.field_37484 + var1 > 8192 || !var4.field_37481) {
            var4 = var4.method_33417(class_420.method_2091());
         }

         return var4;
      }
   }

   @Override
   public void method_19191(class_7059 var1, long var2) {
      if (var1 != null) {
         if (var1 != this) {
            class_189.method_830(var1.field_36433, 0L, var2);

            while (var2 > 0L) {
               if (var2 < (long)(var1.field_36430.field_37484 - var1.field_36430.field_37477)) {
                  class_7332 var6 = this.field_36430 == null ? null : this.field_36430.field_37480;
                  if (var6 != null && var6.field_37481 && var2 + (long)var6.field_37484 - (long)(!var6.field_37476 ? var6.field_37477 : 0) <= 8192L) {
                     var1.field_36430.method_33419(var6, (int)var2);
                     var1.field_36433 -= var2;
                     this.field_36433 += var2;
                     return;
                  }

                  var1.field_36430 = var1.field_36430.method_33416((int)var2);
               }

               class_7332 var10 = var1.field_36430;
               long var7 = (long)(var10.field_37484 - var10.field_37477);
               var1.field_36430 = var10.method_33414();
               if (this.field_36430 != null) {
                  class_7332 var9 = this.field_36430.field_37480;
                  var9 = var9.method_33417(var10);
                  var9.method_33418();
               } else {
                  this.field_36430 = var10;
                  this.field_36430.field_37475 = this.field_36430.field_37480 = this.field_36430;
               }

               var1.field_36433 -= var7;
               this.field_36433 += var7;
               var2 -= var7;
            }
         } else {
            throw new IllegalArgumentException("source == this");
         }
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public long method_24273(class_7059 var1, long var2) {
      if (var1 != null) {
         if (var2 >= 0L) {
            if (this.field_36433 != 0L) {
               if (var2 > this.field_36433) {
                  var2 = this.field_36433;
               }

               var1.method_19191(this, var2);
               return var2;
            } else {
               return -1L;
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: " + var2);
         }
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   @Override
   public long method_36609(byte var1) {
      return this.method_36611(var1, 0L, Long.MAX_VALUE);
   }

   @Override
   public long method_36610(byte var1, long var2) {
      return this.method_36611(var1, var2, Long.MAX_VALUE);
   }

   @Override
   public long method_36611(byte var1, long var2, long var4) {
      if (var2 >= 0L && var4 >= var2) {
         if (var4 > this.field_36433) {
            var4 = this.field_36433;
         }

         if (var2 != var4) {
            class_7332 var8 = this.field_36430;
            if (var8 == null) {
               return -1L;
            } else {
               long var9;
               if (this.field_36433 - var2 >= var2) {
                  var9 = 0L;

                  long var11;
                  while ((var11 = var9 + (long)(var8.field_37484 - var8.field_37477)) < var2) {
                     var8 = var8.field_37475;
                     var9 = var11;
                  }
               } else {
                  for (var9 = this.field_36433; var9 > var2; var9 -= (long)(var8.field_37484 - var8.field_37477)) {
                     var8 = var8.field_37480;
                  }
               }

               while (var9 < var4) {
                  byte[] var13 = var8.field_37478;
                  int var14 = (int)Math.min((long)var8.field_37484, (long)var8.field_37477 + var4 - var9);

                  for (int var15 = (int)((long)var8.field_37477 + var2 - var9); var15 < var14; var15++) {
                     if (var13[var15] == var1) {
                        return (long)(var15 - var8.field_37477) + var9;
                     }
                  }

                  var9 += (long)(var8.field_37484 - var8.field_37477);
                  var2 = var9;
                  var8 = var8.field_37475;
               }

               return -1L;
            }
         } else {
            return -1L;
         }
      } else {
         throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", this.field_36433, var2, var4));
      }
   }

   @Override
   public long method_36612(class_9091 var1) throws IOException {
      return this.method_36613(var1, 0L);
   }

   @Override
   public long method_36613(class_9091 var1, long var2) throws IOException {
      if (var1.method_41902() == 0) {
         throw new IllegalArgumentException("bytes is empty");
      } else if (var2 >= 0L) {
         class_7332 var6 = this.field_36430;
         if (var6 == null) {
            return -1L;
         } else {
            long var7;
            if (this.field_36433 - var2 >= var2) {
               var7 = 0L;

               long var13;
               while ((var13 = var7 + (long)(var6.field_37484 - var6.field_37477)) < var2) {
                  var6 = var6.field_37475;
                  var7 = var13;
               }
            } else {
               for (var7 = this.field_36433; var7 > var2; var7 -= (long)(var6.field_37484 - var6.field_37477)) {
                  var6 = var6.field_37480;
               }
            }

            byte var9 = var1.method_41879(0);
            int var10 = var1.method_41902();

            for (long var11 = this.field_36433 - (long)var10 + 1L; var7 < var11; var6 = var6.field_37475) {
               byte[] var15 = var6.field_37478;
               int var16 = (int)Math.min((long)var6.field_37484, (long)var6.field_37477 + var11 - var7);

               for (int var17 = (int)((long)var6.field_37477 + var2 - var7); var17 < var16; var17++) {
                  if (var15[var17] == var9 && this.method_32479(var6, var17 + 1, var1, 1, var10)) {
                     return (long)(var17 - var6.field_37477) + var7;
                  }
               }

               var7 += (long)(var6.field_37484 - var6.field_37477);
               var2 = var7;
            }

            return -1L;
         }
      } else {
         throw new IllegalArgumentException("fromIndex < 0");
      }
   }

   @Override
   public long method_36580(class_9091 var1) {
      return this.method_36581(var1, 0L);
   }

   @Override
   public long method_36581(class_9091 var1, long var2) {
      if (var2 >= 0L) {
         class_7332 var6 = this.field_36430;
         if (var6 == null) {
            return -1L;
         } else {
            long var7;
            if (this.field_36433 - var2 >= var2) {
               var7 = 0L;

               long var10;
               while ((var10 = var7 + (long)(var6.field_37484 - var6.field_37477)) < var2) {
                  var6 = var6.field_37475;
                  var7 = var10;
               }
            } else {
               for (var7 = this.field_36433; var7 > var2; var7 -= (long)(var6.field_37484 - var6.field_37477)) {
                  var6 = var6.field_37480;
               }
            }

            if (var1.method_41902() != 2) {
               for (byte[] var20 = var1.method_41898(); var7 < this.field_36433; var6 = var6.field_37475) {
                  byte[] var21 = var6.field_37478;
                  int var22 = (int)((long)var6.field_37477 + var2 - var7);

                  for (int var23 = var6.field_37484; var22 < var23; var22++) {
                     byte var24 = var21[var22];

                     for (byte var19 : var20) {
                        if (var24 == var19) {
                           return (long)(var22 - var6.field_37477) + var7;
                        }
                     }
                  }

                  var7 += (long)(var6.field_37484 - var6.field_37477);
                  var2 = var7;
               }
            } else {
               byte var9 = var1.method_41879(0);

               for (byte var12 = var1.method_41879(1); var7 < this.field_36433; var6 = var6.field_37475) {
                  byte[] var13 = var6.field_37478;
                  int var14 = (int)((long)var6.field_37477 + var2 - var7);

                  for (int var15 = var6.field_37484; var14 < var15; var14++) {
                     byte var16 = var13[var14];
                     if (var16 == var9 || var16 == var12) {
                        return (long)(var14 - var6.field_37477) + var7;
                     }
                  }

                  var7 += (long)(var6.field_37484 - var6.field_37477);
                  var2 = var7;
               }
            }

            return -1L;
         }
      } else {
         throw new IllegalArgumentException("fromIndex < 0");
      }
   }

   @Override
   public boolean method_36589(long var1, class_9091 var3) {
      return this.method_36590(var1, var3, 0, var3.method_41902());
   }

   @Override
   public boolean method_36590(long var1, class_9091 var3, int var4, int var5) {
      if (var1 >= 0L && var4 >= 0 && var5 >= 0 && this.field_36433 - var1 >= (long)var5 && var3.method_41902() - var4 >= var5) {
         for (int var8 = 0; var8 < var5; var8++) {
            if (this.method_32485(var1 + (long)var8) != var3.method_41879(var4 + var8)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method_32479(class_7332 var1, int var2, class_9091 var3, int var4, int var5) {
      int var8 = var1.field_37484;
      byte[] var9 = var1.field_37478;

      for (int var10 = var4; var10 < var5; var10++) {
         if (var2 == var8) {
            var1 = var1.field_37475;
            var9 = var1.field_37478;
            var2 = var1.field_37477;
            var8 = var1.field_37484;
         }

         if (var9[var2] != var3.method_41879(var10)) {
            return false;
         }

         var2++;
      }

      return true;
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
   }

   @Override
   public class_245 method_19192() {
      return class_245.field_857;
   }

   public List<Integer> method_32478() {
      if (this.field_36430 == null) {
         return Collections.<Integer>emptyList();
      } else {
         ArrayList var3 = new ArrayList();
         var3.add(this.field_36430.field_37484 - this.field_36430.field_37477);

         for (class_7332 var4 = this.field_36430.field_37475; var4 != this.field_36430; var4 = var4.field_37475) {
            var3.add(var4.field_37484 - var4.field_37477);
         }

         return var3;
      }
   }

   public class_9091 method_32490() {
      return this.method_32454("MD5");
   }

   public class_9091 method_32477() {
      return this.method_32454("SHA-1");
   }

   public class_9091 method_32469() {
      return this.method_32454("SHA-256");
   }

   public class_9091 method_32486() {
      return this.method_32454("SHA-512");
   }

   private class_9091 method_32454(String var1) {
      try {
         MessageDigest var4 = MessageDigest.getInstance(var1);
         if (this.field_36430 != null) {
            var4.update(this.field_36430.field_37478, this.field_36430.field_37477, this.field_36430.field_37484 - this.field_36430.field_37477);

            for (class_7332 var5 = this.field_36430.field_37475; var5 != this.field_36430; var5 = var5.field_37475) {
               var4.update(var5.field_37478, var5.field_37477, var5.field_37484 - var5.field_37477);
            }
         }

         return class_9091.method_41910(var4.digest());
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError();
      }
   }

   public class_9091 method_32498(class_9091 var1) {
      return this.method_32476("HmacSHA1", var1);
   }

   public class_9091 method_32484(class_9091 var1) {
      return this.method_32476("HmacSHA256", var1);
   }

   public class_9091 method_32463(class_9091 var1) {
      return this.method_32476("HmacSHA512", var1);
   }

   private class_9091 method_32476(String var1, class_9091 var2) {
      try {
         Mac var5 = Mac.getInstance(var1);
         var5.init(new SecretKeySpec(var2.method_41883(), var1));
         if (this.field_36430 != null) {
            var5.update(this.field_36430.field_37478, this.field_36430.field_37477, this.field_36430.field_37484 - this.field_36430.field_37477);

            for (class_7332 var6 = this.field_36430.field_37475; var6 != this.field_36430; var6 = var6.field_37475) {
               var5.update(var6.field_37478, var6.field_37477, var6.field_37484 - var6.field_37477);
            }
         }

         return class_9091.method_41910(var5.doFinal());
      } catch (NoSuchAlgorithmException var7) {
         throw new AssertionError();
      } catch (InvalidKeyException var8) {
         throw new IllegalArgumentException(var8);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof class_7059)) {
         return false;
      } else {
         class_7059 var4 = (class_7059)var1;
         if (this.field_36433 != var4.field_36433) {
            return false;
         } else if (this.field_36433 == 0L) {
            return true;
         } else {
            class_7332 var5 = this.field_36430;
            class_7332 var6 = var4.field_36430;
            int var7 = var5.field_37477;
            int var8 = var6.field_37477;
            long var9 = 0L;

            while (var9 < this.field_36433) {
               long var11 = (long)Math.min(var5.field_37484 - var7, var6.field_37484 - var8);

               for (int var13 = 0; (long)var13 < var11; var13++) {
                  if (var5.field_37478[var7++] != var6.field_37478[var8++]) {
                     return false;
                  }
               }

               if (var7 == var5.field_37484) {
                  var5 = var5.field_37475;
                  var7 = var5.field_37477;
               }

               if (var8 == var6.field_37484) {
                  var6 = var6.field_37475;
                  var8 = var6.field_37477;
               }

               var9 += var11;
            }

            return true;
         }
      }
   }

   @Override
   public int hashCode() {
      class_7332 var3 = this.field_36430;
      if (var3 == null) {
         return 0;
      } else {
         int var4 = 1;

         do {
            int var5 = var3.field_37477;

            for (int var6 = var3.field_37484; var5 < var6; var5++) {
               var4 = 31 * var4 + var3.field_37478[var5];
            }

            var3 = var3.field_37475;
         } while (var3 != this.field_36430);

         return var4;
      }
   }

   @Override
   public String toString() {
      return this.method_32465().toString();
   }

   public class_7059 clone() {
      class_7059 var3 = new class_7059();
      if (this.field_36433 == 0L) {
         return var3;
      } else {
         var3.field_36430 = new class_7332(this.field_36430);
         var3.field_36430.field_37475 = var3.field_36430.field_37480 = var3.field_36430;

         for (class_7332 var4 = this.field_36430.field_37475; var4 != this.field_36430; var4 = var4.field_37475) {
            var3.field_36430.field_37480.method_33417(new class_7332(var4));
         }

         var3.field_36433 = this.field_36433;
         return var3;
      }
   }

   public class_9091 method_32465() {
      if (this.field_36433 <= 2147483647L) {
         return this.method_32466((int)this.field_36433);
      } else {
         throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.field_36433);
      }
   }

   public class_9091 method_32466(int var1) {
      return (class_9091)(var1 != 0 ? new class_1779(this, var1) : class_9091.field_46557);
   }
}
