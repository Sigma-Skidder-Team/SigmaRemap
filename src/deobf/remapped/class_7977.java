package remapped;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class class_7977 {
   public static final int field_40856 = 1048576;
   public static ByteBuffer field_40858 = BufferUtils.createByteBuffer(4194304);
   public static IntBuffer field_40855 = field_40858.asIntBuffer();
   public static int[] field_40852 = new int[1048576];
   public static final int field_40853 = 0;
   public static final int field_40857 = -8421377;
   public static final int field_40860 = 0;
   public static Map<Integer, class_9510> field_40859 = new HashMap<Integer, class_9510>();

   public static IntBuffer method_36165(int var0) {
      if (field_40855.capacity() < var0) {
         int var3 = method_36148(var0);
         field_40858 = BufferUtils.createByteBuffer(var3 * 4);
         field_40855 = field_40858.asIntBuffer();
      }

      return field_40855;
   }

   public static int[] method_36176(int var0) {
      if (field_40852 == null) {
         field_40852 = new int[1048576];
      }

      if (field_40852.length < var0) {
         field_40852 = new int[method_36148(var0)];
      }

      return field_40852;
   }

   public static int method_36148(int var0) {
      int var3 = var0 - 1;
      var3 |= var3 >> 1;
      var3 |= var3 >> 2;
      var3 |= var3 >> 4;
      var3 |= var3 >> 8;
      var3 |= var3 >> 16;
      return var3 + 1;
   }

   public static int method_36157(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc -274437998
      // 02: istore 1
      // 03: bipush 0
      // 04: istore 3
      // 05: iload 1
      // 06: ldc 8
      // 08: iand
      // 09: ifeq 0f
      // 0c: goto 59
      // 0f: iload 1
      // 10: ldc 131072
      // 12: iand
      // 13: ifeq 19
      // 16: goto 3e
      // 19: iload 1
      // 1a: ldc 65536
      // 1c: iand
      // 1d: ifeq 23
      // 20: goto 23
      // 23: iload 1
      // 24: ldc 16384
      // 26: iand
      // 27: ifeq 59
      // 2a: iload 1
      // 2b: ldc 16777216
      // 2d: iand
      // 2e: ifne 34
      // 31: goto 3e
      // 34: iload 1
      // 35: ldc 64
      // 37: iand
      // 38: ifeq 3e
      // 3b: goto 05
      // 3e: iload 1
      // 3f: ldc 524288
      // 41: iand
      // 42: ifeq 48
      // 45: goto 59
      // 48: iload 1
      // 49: ldc 8
      // 4b: iand
      // 4c: ifeq 52
      // 4f: goto 23
      // 52: iload 1
      // 53: ldc 2147483647
      // 55: iand
      // 56: ifeq 05
      // 59: iload 1
      // 5a: ldc 4096
      // 5c: iand
      // 5d: ifeq 63
      // 60: goto 3e
      // 63: iload 1
      // 64: ldc 65536
      // 66: iand
      // 67: ifne 23
      // 6a: iload 1
      // 6b: ldc 2147483647
      // 6d: iand
      // 6e: ifeq 05
      // 71: iload 3
      // 72: ireturn
      // 73: athrow
      // 74: iinc 3 16
      // 77: iload 0
      // 78: bipush 16
      // 7a: ishr
      // 7b: istore 0
      // 7c: goto 05
      // 7f: athrow
      // 80: iinc 3 8
      // 83: iload 0
      // 84: bipush 8
      // 86: ishr
      // 87: istore 0
      // 88: goto 23
      // 8b: athrow
      // 8c: iinc 3 4
      // 8f: iload 0
      // 90: bipush 4
      // 91: ishr
      // 92: istore 0
      // 93: goto 3e
      // 96: athrow
      // 97: iinc 3 2
      // 9a: iload 0
      // 9b: bipush 2
      // 9c: ishr
      // 9d: istore 0
      // 9e: goto 59
      // a1: athrow
      // a2: iinc 3 1
      // a5: goto 71
   }

   public static IntBuffer method_36170(int var0, int var1) {
      int[] var4 = method_36176(var0);
      IntBuffer var5 = method_36165(var0);
      Arrays.fill(field_40852, 0, var0, var1);
      field_40855.put(field_40852, 0, var0);
      return field_40855;
   }

   public static int[] method_36173(int var0) {
      int[] var3 = new int[var0 * 3];
      Arrays.fill(var3, 0, var0, 0);
      Arrays.fill(var3, var0, var0 * 2, -8421377);
      Arrays.fill(var3, var0 * 2, var0 * 3, 0);
      return var3;
   }

   public static int[] method_36174(int var0, int var1) {
      int[] var4 = new int[var0 * 3];
      Arrays.fill(var4, 0, var0, var1);
      Arrays.fill(var4, var0, var0 * 2, -8421377);
      Arrays.fill(var4, var0 * 2, var0 * 3, 0);
      return var4;
   }

   public static class_9510 method_36164(class_8143 var0) {
      class_9510 var3 = var0.field_41688;
      if (var3 == null) {
         int var4 = var0.method_37055();
         var3 = field_40859.get(var4);
         if (var3 == null) {
            var3 = new class_9510(var4, GL11.glGenTextures(), GL11.glGenTextures());
            field_40859.put(var4, var3);
         }

         var0.field_41688 = var3;
      }

      return var3;
   }

   public static void method_36141(class_8143 var0, int var1) {
      class_9510 var4 = var0.field_41688;
      if (var4 != null) {
         var0.field_41688 = null;
         field_40859.remove(var4.field_48420);
         class_1920.method_8904(var4.field_48418);
         class_1920.method_8904(var4.field_48419);
         if (var4.field_48420 != var1) {
            class_1910.method_8669("Error : MultiTexID.base mismatch: " + var4.field_48420 + ", texid: " + var1);
            class_1920.method_8904(var4.field_48420);
         }
      }
   }

   public static void method_36177(int var0, int var1) {
      if (class_6588.field_33804 && class_1920.method_8881() == 33984) {
         class_1920.method_8899(33985);
         class_1920.method_8791(var0);
         class_1920.method_8899(33987);
         class_1920.method_8791(var1);
         class_1920.method_8899(33984);
      }
   }

   public static void method_36178(class_9510 var0) {
      method_36177(var0.field_48418, var0.field_48419);
   }

   public static void method_36155(int var0, int var1, int var2) {
      if (class_6588.field_33804 && class_1920.method_8881() == 33984) {
         class_1920.method_8899(33985);
         class_1920.method_8791(var1);
         class_1920.method_8899(33987);
         class_1920.method_8791(var2);
         class_1920.method_8899(33984);
      }

      class_1920.method_8791(var0);
   }

   public static void method_36156(class_9510 var0) {
      if (class_6588.field_33804 && class_1920.method_8881() == 33984) {
         if (class_6588.field_33603) {
            class_1920.method_8899(33985);
            class_1920.method_8791(var0.field_48418);
         }

         if (class_6588.field_33634) {
            class_1920.method_8899(33987);
            class_1920.method_8791(var0.field_48419);
         }

         class_1920.method_8899(33984);
      }

      class_1920.method_8791(var0.field_48420);
   }

   public static void method_36161(class_8143 var0) {
      int var3 = var0.method_37055();
      method_36156(var0.method_37050());
      if (class_1920.method_8881() == 33984) {
         int var4 = class_6588.field_33946;
         int var5 = class_6588.field_33639;
         if (!(var0 instanceof class_8359)) {
            class_6588.field_33946 = 0;
            class_6588.field_33639 = 0;
         } else {
            class_6588.field_33946 = ((class_8359)var0).field_42819;
            class_6588.field_33639 = ((class_8359)var0).field_42803;
         }

         if (class_6588.field_33946 != var4 || class_6588.field_33639 != var5) {
            boolean var6 = class_4811.method_22176(false);
            class_6588.field_33740.method_35465(class_6588.field_33946, class_6588.field_33639);
            class_4811.method_22176(var6);
         }
      }
   }

   public static void method_36154(int var0) {
      class_9510 var3 = field_40859.get(var0);
      method_36156(var3);
   }

   public static void method_36175(class_7884 var0) {
      class_9510 var3 = var0.method_37050();
      class_5797 var4 = var0.method_35651();
      int var5 = var4.method_26228();
      int var6 = var4.method_26253();
      class_5797 var7 = method_36152(var5, var6, -8421377);
      class_4970.method_22840(var3.field_48418, var5, var6);
      var7.method_26259(0, 0, 0, 0, 0, var5, var6, false, false, false, true);
      class_5797 var8 = method_36152(var5, var6, 0);
      class_4970.method_22840(var3.field_48419, var5, var6);
      var8.method_26259(0, 0, 0, 0, 0, var5, var6, false, false, false, true);
      class_1920.method_8791(var3.field_48420);
   }

   public static void method_36181(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var8 = var1 * var2;
      IntBuffer var9 = method_36165(var8);
      ((Buffer)var9).clear();
      int var10 = var5 * var8;
      if (var0.length >= var10 + var8) {
         ((Buffer)var9.put(var0, var10, var8)).position(0).limit(var8);
         class_5525.method_25072();
         GL11.glTexSubImage2D(3553, 0, var3, var4, var1, var2, 32993, 33639, var9);
         ((Buffer)var9).clear();
      }
   }

   public static class_8143 method_36153() {
      class_7884 var2 = new class_7884(1, 1, true);
      var2.method_35651().method_26242(0, 0, -1);
      var2.method_35650();
      return var2;
   }

   public static void method_36167(int var0, int var1, int var2, class_8359 var3) {
      class_9510 var6 = method_36164(var3);
      if (class_6588.field_33603) {
         class_1910.method_8671("Allocate texture map normal: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         class_4970.method_22841(var6.field_48418, var0, var1, var2);
      }

      if (class_6588.field_33634) {
         class_1910.method_8671("Allocate texture map specular: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         class_4970.method_22841(var6.field_48419, var0, var1, var2);
      }

      class_1920.method_8791(var6.field_48420);
   }

   private static class_5797[] method_36169(class_5797 var0, int var1) {
      if (var1 < 0) {
         var1 = 0;
      }

      class_5797[] var4 = new class_5797[var1 + 1];
      var4[0] = var0;
      if (var1 > 0) {
         for (int var5 = 1; var5 <= var1; var5++) {
            class_5797 var6 = var4[var5 - 1];
            class_5797 var7 = new class_5797(var6.method_26228() >> 1, var6.method_26253() >> 1, false);
            int var8 = var7.method_26228();
            int var9 = var7.method_26253();

            for (int var10 = 0; var10 < var8; var10++) {
               for (int var11 = 0; var11 < var9; var11++) {
                  var7.method_26242(
                     var10,
                     var11,
                     method_36142(
                        var6.method_26252(var10 * 2 + 0, var11 * 2 + 0),
                        var6.method_26252(var10 * 2 + 1, var11 * 2 + 0),
                        var6.method_26252(var10 * 2 + 0, var11 * 2 + 1),
                        var6.method_26252(var10 * 2 + 1, var11 * 2 + 1)
                     )
                  );
               }
            }

            var4[var5] = var7;
         }
      }

      return var4;
   }

   public static BufferedImage method_36171(class_4639 var0) {
      try {
         if (!class_3111.method_14362(var0)) {
            return null;
         } else {
            InputStream var3 = class_3111.method_14374(var0);
            if (var3 == null) {
               return null;
            } else {
               BufferedImage var4 = ImageIO.read(var3);
               var3.close();
               return var4;
            }
         }
      } catch (IOException var5) {
         return null;
      }
   }

   public static int[][] method_36145(int var0, int var1, int[][] var2) {
      for (int var5 = 1; var5 <= var0; var5++) {
         if (var2[var5] == null) {
            int var6 = var1 >> var5;
            int var7 = var6 * 2;
            int[] var8 = var2[var5 - 1];
            int[] var9 = var2[var5] = new int[var6 * var6];

            for (int var10 = 0; var10 < var6; var10++) {
               for (int var11 = 0; var11 < var6; var11++) {
                  int var12 = var10 * 2 * var7 + var11 * 2;
                  var9[var10 * var6 + var11] = method_36142(var8[var12], var8[var12 + 1], var8[var12 + var7], var8[var12 + var7 + 1]);
               }
            }
         }
      }

      return var2;
   }

   public static void method_36144(int[][] var0, int var1, int var2, int var3, int var4, int var5) {
      class_5525.method_25072();
      int var8 = var1 * var2;
      IntBuffer var9 = method_36165(var8);
      int var10 = var0.length;
      int var11 = 0;
      int var12 = var1;
      int var13 = var2;
      int var14 = var3;

      for (int var15 = var4; var12 > 0 && var13 > 0 && var11 < var10; var11++) {
         int var16 = var12 * var13;
         int[] var17 = var0[var11];
         ((Buffer)var9).clear();
         if (var17.length >= var16 * (var5 + 1)) {
            ((Buffer)var9.put(var17, var16 * var5, var16)).position(0).limit(var16);
            GL11.glTexSubImage2D(3553, var11, var14, var15, var12, var13, 32993, 33639, var9);
         }

         var12 >>= 1;
         var13 >>= 1;
         var14 >>= 1;
         var15 >>= 1;
      }

      ((Buffer)var9).clear();
   }

   public static int method_36179(int var0, int var1, int var2, int var3) {
      int var6 = var0 >>> 24 & 0xFF;
      int var7 = var1 >>> 24 & 0xFF;
      int var8 = var2 >>> 24 & 0xFF;
      int var9 = var3 >>> 24 & 0xFF;
      int var10 = var6 + var7 + var8 + var9;
      int var11 = (var10 + 2) / 4;
      int var12;
      if (var10 == 0) {
         var12 = 4;
         var6 = 1;
         var7 = 1;
         var8 = 1;
         var9 = 1;
      } else {
         var12 = var10;
      }

      int var13 = (var12 + 1) / 2;
      return var11 << 24
         | ((var0 >>> 16 & 0xFF) * var6 + (var1 >>> 16 & 0xFF) * var7 + (var2 >>> 16 & 0xFF) * var8 + (var3 >>> 16 & 0xFF) * var9 + var13) / var12 << 16
         | ((var0 >>> 8 & 0xFF) * var6 + (var1 >>> 8 & 0xFF) * var7 + (var2 >>> 8 & 0xFF) * var8 + (var3 >>> 8 & 0xFF) * var9 + var13) / var12 << 8
         | ((var0 >>> 0 & 0xFF) * var6 + (var1 >>> 0 & 0xFF) * var7 + (var2 >>> 0 & 0xFF) * var8 + (var3 >>> 0 & 0xFF) * var9 + var13) / var12 << 0;
   }

   public static int method_36142(int var0, int var1, int var2, int var3) {
      return ((var0 >>> 24 & 0xFF) + (var1 >>> 24 & 0xFF) + (var2 >>> 24 & 0xFF) + (var3 >>> 24 & 0xFF) + 2) / 4 << 24
         | ((var0 >>> 16 & 0xFF) + (var1 >>> 16 & 0xFF) + (var2 >>> 16 & 0xFF) + (var3 >>> 16 & 0xFF) + 2) / 4 << 16
         | ((var0 >>> 8 & 0xFF) + (var1 >>> 8 & 0xFF) + (var2 >>> 8 & 0xFF) + (var3 >>> 8 & 0xFF) + 2) / 4 << 8
         | ((var0 >>> 0 & 0xFF) + (var1 >>> 0 & 0xFF) + (var2 >>> 0 & 0xFF) + (var3 >>> 0 & 0xFF) + 2) / 4 << 0;
   }

   public static void method_36162(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var6 = var1;
      int var7 = var2;
      int var8 = var3;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;

      int var12;
      for (var12 = 0; var7 > 1 && var8 > 1; var6 = var9) {
         var9 = var6 + var7 * var8;
         var10 = var7 / 2;
         var11 = var8 / 2;

         for (int var13 = 0; var13 < var11; var13++) {
            int var14 = var9 + var13 * var10;
            int var15 = var6 + var13 * 2 * var7;

            for (int var16 = 0; var16 < var10; var16++) {
               var0[var14 + var16] = method_36179(
                  var0[var15 + var16 * 2], var0[var15 + var16 * 2 + 1], var0[var15 + var7 + var16 * 2], var0[var15 + var7 + var16 * 2 + 1]
               );
            }
         }

         var12++;
         var7 = var10;
         var8 = var11;
      }

      while (var12 > 0) {
         var7 = var2 >> --var12;
         var8 = var3 >> var12;
         var6 = var9 - var7 * var8;
         int var21 = var6;

         for (int var22 = 0; var22 < var8; var22++) {
            for (int var23 = 0; var23 < var7; var23++) {
               if (var0[var21] == 0) {
                  var0[var21] = var0[var9 + var22 / 2 * var10 + var23 / 2] & 16777215;
               }

               var21++;
            }
         }

         var9 = var6;
         var10 = var7;
      }
   }

   public static void method_36150(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var6 = var1;
      int var7 = var2;
      int var8 = var3;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;

      int var12;
      for (var12 = 0; var7 > 1 && var8 > 1; var6 = var9) {
         var9 = var6 + var7 * var8;
         var10 = var7 / 2;
         var11 = var8 / 2;

         for (int var13 = 0; var13 < var11; var13++) {
            int var14 = var9 + var13 * var10;
            int var15 = var6 + var13 * 2 * var7;

            for (int var16 = 0; var16 < var10; var16++) {
               var0[var14 + var16] = method_36142(
                  var0[var15 + var16 * 2], var0[var15 + var16 * 2 + 1], var0[var15 + var7 + var16 * 2], var0[var15 + var7 + var16 * 2 + 1]
               );
            }
         }

         var12++;
         var7 = var10;
         var8 = var11;
      }

      while (var12 > 0) {
         var7 = var2 >> --var12;
         var8 = var3 >> var12;
         var6 = var9 - var7 * var8;
         int var21 = var6;

         for (int var22 = 0; var22 < var8; var22++) {
            for (int var23 = 0; var23 < var7; var23++) {
               if (var0[var21] == 0) {
                  var0[var21] = var0[var9 + var22 / 2 * var10 + var23 / 2] & 16777215;
               }

               var21++;
            }
         }

         var9 = var6;
         var10 = var7;
      }
   }

   public static boolean method_36147(int[] var0, int var1, int var2) {
      int var5 = var1 * var2;
      if (var0[0] >>> 24 == 255 && var0[var5 - 1] == 0) {
         return true;
      } else {
         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = var0[var6] >>> 24;
            if (var7 != 0 && var7 != 255) {
               return true;
            }
         }

         return false;
      }
   }

   public static void method_36158(int[] var0, int var1, int var2, int var3, int var4) {
      int var7 = 0;
      int var8 = var1;
      int var9 = var2;
      int var10 = var3;

      for (int var11 = var4; var8 > 0 && var9 > 0; var11 /= 2) {
         GL11.glCopyTexSubImage2D(3553, var7, var10, var11, 0, 0, var8, var9);
         var7++;
         var8 /= 2;
         var9 /= 2;
         var10 /= 2;
      }
   }

   public static void method_36180(class_9510 var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var10 = var2 * var3;
      IntBuffer var11 = method_36165(var10);
      class_5525.method_25072();
      ((Buffer)var11).clear();
      var11.put(var1, 0, var10);
      ((Buffer)var11).position(0).limit(var10);
      class_1920.method_8791(var0.field_48420);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var11);
      if (var1.length == var10 * 3) {
         ((Buffer)var11).clear();
         ((Buffer)var11.put(var1, var10, var10)).position(0);
         ((Buffer)var11).position(0).limit(var10);
      }

      class_1920.method_8791(var0.field_48418);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var11);
      if (var1.length == var10 * 3) {
         ((Buffer)var11).clear();
         var11.put(var1, var10 * 2, var10);
         ((Buffer)var11).position(0).limit(var10);
      }

      class_1920.method_8791(var0.field_48419);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var11);
      class_1920.method_8899(33984);
   }

   public static class_4639 method_36172(class_4639 var0, String var1) {
      if (var0 != null) {
         String var4 = var0.method_21456();
         String[] var5 = var4.split(".png");
         String var6 = var5[0];
         return new class_4639(var0.method_21461(), var6 + "_" + var1 + ".png");
      } else {
         return null;
      }
   }

   private static class_5797 method_36168(class_7832 var0, class_4639 var1, int var2, int var3, int var4) {
      class_5797 var7 = method_36160(var0, var1, var2, var3);
      if (var7 == null) {
         var7 = new class_5797(var2, var3, false);
         int var8 = class_5525.method_25081(var4);
         var7.method_26226(0, 0, var2, var3, var8);
      }

      return var7;
   }

   private static class_5797 method_36152(int var0, int var1, int var2) {
      class_5797 var5 = new class_5797(var0, var1, false);
      int var6 = class_5525.method_25081(var2);
      var5.method_26241(var6);
      return var5;
   }

   private static class_5797 method_36160(class_7832 var0, class_4639 var1, int var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         try {
            class_4038 var6 = var0.method_35458(var1);
            class_5797 var7 = class_5797.method_26230(var6.method_18576());
            if (var7 == null) {
               return null;
            } else if (var7.method_26228() == var2 && var7.method_26253() == var3) {
               return var7;
            } else {
               var7.close();
               return null;
            }
         } catch (IOException var8) {
            return null;
         }
      }
   }

   public static void method_36146(int var0, class_5797 var1, boolean var2, boolean var3, class_7832 var4, class_4639 var5, class_9510 var6) {
      int var9 = var1.method_26228();
      int var10 = var1.method_26253();
      class_4639 var11 = method_36172(var5, "n");
      class_5797 var12 = method_36168(var4, var11, var9, var10, -8421377);
      class_4970.method_22841(var6.field_48418, 0, var9, var10);
      var12.method_26259(0, 0, 0, 0, 0, var9, var10, var2, var3, false, true);
      class_4639 var13 = method_36172(var5, "s");
      class_5797 var14 = method_36168(var4, var13, var9, var10, 0);
      class_4970.method_22841(var6.field_48419, 0, var9, var10);
      var14.method_26259(0, 0, 0, 0, 0, var9, var10, var2, var3, false, true);
      class_1920.method_8791(var6.field_48420);
   }

   public static void method_36166(int[] var0, int var1, int var2, int var3) {
   }

   public static int method_36159(int var0, int var1, int var2) {
      int var5 = 255 - var2;
      return ((var0 >>> 24 & 0xFF) * var2 + (var1 >>> 24 & 0xFF) * var5) / 255 << 24
         | ((var0 >>> 16 & 0xFF) * var2 + (var1 >>> 16 & 0xFF) * var5) / 255 << 16
         | ((var0 >>> 8 & 0xFF) * var2 + (var1 >>> 8 & 0xFF) * var5) / 255 << 8
         | ((var0 >>> 0 & 0xFF) * var2 + (var1 >>> 0 & 0xFF) * var5) / 255 << 0;
   }

   public static void method_36151() {
      class_7889 var2 = MinecraftClient.method_8510().method_8577();
      class_8143 var3 = var2.method_35679(class_8359.field_42824);
      if (var3 != null) {
         class_9510 var4 = var3.method_37050();
         class_1920.method_8791(var4.field_48420);
         GL11.glTexParameteri(3553, 10241, class_6588.field_33782[class_6588.field_33621]);
         GL11.glTexParameteri(3553, 10240, class_6588.field_33644[class_6588.field_33747]);
         class_1920.method_8791(var4.field_48418);
         GL11.glTexParameteri(3553, 10241, class_6588.field_33782[class_6588.field_33785]);
         GL11.glTexParameteri(3553, 10240, class_6588.field_33644[class_6588.field_33922]);
         class_1920.method_8791(var4.field_48419);
         GL11.glTexParameteri(3553, 10241, class_6588.field_33782[class_6588.field_33611]);
         GL11.glTexParameteri(3553, 10240, class_6588.field_33644[class_6588.field_33750]);
         class_1920.method_8791(0);
      }
   }

   public static int[][] method_36143(int[][] var0, int var1, int var2, int var3) {
      int var6 = var0.length;
      int[][] var7 = new int[var6][];

      for (int var8 = 0; var8 < var6; var8++) {
         int[] var9 = var0[var8];
         if (var9 != null) {
            int var10 = (var1 >> var8) * (var2 >> var8);
            int[] var11 = new int[var10 * 3];
            var7[var8] = var11;
            int var12 = var9.length / 3;
            int var13 = var10 * var3;
            int var14 = 0;
            System.arraycopy(var9, var13, var11, var14, var10);
            var13 += var12;
            var14 += var10;
            System.arraycopy(var9, var13, var11, var14, var10);
            var13 += var12;
            var14 += var10;
            System.arraycopy(var9, var13, var11, var14, var10);
         }
      }

      return var7;
   }

   public static int[][] method_36140(class_5155 var0, int[][] var1, int var2, int var3) {
      boolean var6 = true;
      return var1;
   }

   public static void method_36163(class_5155 var0, int[] var1) {
   }
}
