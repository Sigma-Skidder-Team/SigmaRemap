package mapped;

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

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class Class9336 {
   public static final int field43318 = 1048576;
   public static ByteBuffer field43319 = BufferUtils.createByteBuffer(4194304);
   public static IntBuffer field43320 = field43319.asIntBuffer();
   public static int[] field43321 = new int[1048576];
   public static final int field43322 = 0;
   public static final int field43323 = -8421377;
   public static final int field43324 = 0;
   public static Map<Integer, Class9732> field43325 = new HashMap<Integer, Class9732>();

   public static IntBuffer method35302(int var0) {
      if (field43320.capacity() < var0) {
         int var3 = method35304(var0);
         field43319 = BufferUtils.createByteBuffer(var3 * 4);
         field43320 = field43319.asIntBuffer();
      }

      return field43320;
   }

   public static int[] method35303(int var0) {
      if (field43321 == null) {
         field43321 = new int[1048576];
      }

      if (field43321.length < var0) {
         field43321 = new int[method35304(var0)];
      }

      return field43321;
   }

   public static int method35304(int var0) {
      int var3 = var0 - 1;
      var3 |= var3 >> 1;
      var3 |= var3 >> 2;
      var3 |= var3 >> 4;
      var3 |= var3 >> 8;
      var3 |= var3 >> 16;
      return var3 + 1;
   }

   /*public static int method35305(int param0) {
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
   }*/

   public static IntBuffer method35306(int var0, int var1) {
      int[] var4 = method35303(var0);
      IntBuffer var5 = method35302(var0);
      Arrays.fill(field43321, 0, var0, var1);
      field43320.put(field43321, 0, var0);
      return field43320;
   }

   public static int[] method35307(int var0) {
      int[] var3 = new int[var0 * 3];
      Arrays.fill(var3, 0, var0, 0);
      Arrays.fill(var3, var0, var0 * 2, -8421377);
      Arrays.fill(var3, var0 * 2, var0 * 3, 0);
      return var3;
   }

   public static int[] method35308(int var0, int var1) {
      int[] var4 = new int[var0 * 3];
      Arrays.fill(var4, 0, var0, var1);
      Arrays.fill(var4, var0, var0 * 2, -8421377);
      Arrays.fill(var4, var0 * 2, var0 * 3, 0);
      return var4;
   }

   public static Class9732 method35309(Class290 var0) {
      Class9732 var3 = var0.field1128;
      if (var3 == null) {
         int var4 = var0.getGlTextureId();
         var3 = field43325.get(var4);
         if (var3 == null) {
            var3 = new Class9732(var4, GL11.glGenTextures(), GL11.glGenTextures());
            field43325.put(var4, var3);
         }

         var0.field1128 = var3;
      }

      return var3;
   }

   public static void method35310(Class290 var0, int var1) {
      Class9732 var4 = var0.field1128;
      if (var4 != null) {
         var0.field1128 = null;
         field43325.remove(var4.field45439);
         Class7414.method23812(var4.field45440);
         Class7414.method23812(var4.field45441);
         if (var4.field45439 != var1) {
            Class7399.method23633("Error : MultiTexID.base mismatch: " + var4.field45439 + ", texid: " + var1);
            Class7414.method23812(var4.field45439);
         }
      }
   }

   public static void method35311(int var0, int var1) {
      if (Shaders.field40605 && Class7414.method23863() == 33984) {
         Class7414.method23803(33985);
         Class7414.method23814(var0);
         Class7414.method23803(33987);
         Class7414.method23814(var1);
         Class7414.method23803(33984);
      }
   }

   public static void method35312(Class9732 var0) {
      method35311(var0.field45440, var0.field45441);
   }

   public static void method35313(int var0, int var1, int var2) {
      if (Shaders.field40605 && Class7414.method23863() == 33984) {
         Class7414.method23803(33985);
         Class7414.method23814(var1);
         Class7414.method23803(33987);
         Class7414.method23814(var2);
         Class7414.method23803(33984);
      }

      Class7414.method23814(var0);
   }

   public static void method35314(Class9732 var0) {
      if (Shaders.field40605 && Class7414.method23863() == 33984) {
         if (Shaders.field40874) {
            Class7414.method23803(33985);
            Class7414.method23814(var0.field45440);
         }

         if (Shaders.field40875) {
            Class7414.method23803(33987);
            Class7414.method23814(var0.field45441);
         }

         Class7414.method23803(33984);
      }

      Class7414.method23814(var0.field45439);
   }

   public static void method35315(Class290 var0) {
      int var3 = var0.getGlTextureId();
      method35314(var0.method1135());
      if (Class7414.method23863() == 33984) {
         int var4 = Shaders.field40682;
         int var5 = Shaders.field40683;
         if (!(var0 instanceof AtlasTexture)) {
            Shaders.field40682 = 0;
            Shaders.field40683 = 0;
         } else {
            Shaders.field40682 = ((AtlasTexture)var0).field1118;
            Shaders.field40683 = ((AtlasTexture)var0).field1119;
         }

         if (Shaders.field40682 != var4 || Shaders.field40683 != var5) {
            boolean var6 = Class8496.method30082(false);
            Shaders.field40771.method12259(Shaders.field40682, Shaders.field40683);
            Class8496.method30082(var6);
         }
      }
   }

   public static void method35316(int var0) {
      Class9732 var3 = field43325.get(var0);
      method35314(var3);
   }

   public static void method35317(Class291 var0) {
      Class9732 var3 = var0.method1135();
      Class1806 var4 = var0.method1141();
      int var5 = var4.method7886();
      int var6 = var4.method7887();
      Class1806 var7 = method35334(var5, var6, -8421377);
      Class8535.method30368(var3.field45440, var5, var6);
      var7.method7895(0, 0, 0, 0, 0, var5, var6, false, false, false, true);
      Class1806 var8 = method35334(var5, var6, 0);
      Class8535.method30368(var3.field45441, var5, var6);
      var8.method7895(0, 0, 0, 0, 0, var5, var6, false, false, false, true);
      Class7414.method23814(var3.field45439);
   }

   public static void method35318(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var8 = var1 * var2;
      IntBuffer var9 = method35302(var8);
      ((Buffer)var9).clear();
      int var10 = var5 * var8;
      if (var0.length >= var10 + var8) {
         ((Buffer)var9.put(var0, var10, var8)).position(0).limit(var8);
         Class8684.method31292();
         GL11.glTexSubImage2D(3553, 0, var3, var4, var1, var2, 32993, 33639, var9);
         ((Buffer)var9).clear();
      }
   }

   public static Class290 method35319() {
      Class291 var2 = new Class291(1, 1, true);
      var2.method1141().method7890(0, 0, -1);
      var2.method1140();
      return var2;
   }

   public static void method35320(int var0, int var1, int var2, AtlasTexture var3) {
      Class9732 var6 = method35309(var3);
      if (Shaders.field40874) {
         Class7399.method23634("Allocate texture map normal: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         Class8535.method30370(var6.field45440, var0, var1, var2);
      }

      if (Shaders.field40875) {
         Class7399.method23634("Allocate texture map specular: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         Class8535.method30370(var6.field45441, var0, var1, var2);
      }

      Class7414.method23814(var6.field45439);
   }

   private static Class1806[] method35321(Class1806 var0, int var1) {
      if (var1 < 0) {
         var1 = 0;
      }

      Class1806[] var4 = new Class1806[var1 + 1];
      var4[0] = var0;
      if (var1 > 0) {
         for (int var5 = 1; var5 <= var1; var5++) {
            Class1806 var6 = var4[var5 - 1];
            Class1806 var7 = new Class1806(var6.method7886() >> 1, var6.method7887() >> 1, false);
            int var8 = var7.method7886();
            int var9 = var7.method7887();

            for (int var10 = 0; var10 < var8; var10++) {
               for (int var11 = 0; var11 < var9; var11++) {
                  var7.method7890(
                     var10,
                     var11,
                     method35326(
                        var6.method7889(var10 * 2 + 0, var11 * 2 + 0),
                        var6.method7889(var10 * 2 + 1, var11 * 2 + 0),
                        var6.method7889(var10 * 2 + 0, var11 * 2 + 1),
                        var6.method7889(var10 * 2 + 1, var11 * 2 + 1)
                     )
                  );
               }
            }

            var4[var5] = var7;
         }
      }

      return var4;
   }

   public static BufferedImage method35322(ResourceLocation var0) {
      try {
         if (!Class7944.method26866(var0)) {
            return null;
         } else {
            InputStream var3 = Class7944.method26863(var0);
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

   public static int[][] method35323(int var0, int var1, int[][] var2) {
      for (int var5 = 1; var5 <= var0; var5++) {
         if (var2[var5] == null) {
            int var6 = var1 >> var5;
            int var7 = var6 * 2;
            int[] var8 = var2[var5 - 1];
            int[] var9 = var2[var5] = new int[var6 * var6];

            for (int var10 = 0; var10 < var6; var10++) {
               for (int var11 = 0; var11 < var6; var11++) {
                  int var12 = var10 * 2 * var7 + var11 * 2;
                  var9[var10 * var6 + var11] = method35326(var8[var12], var8[var12 + 1], var8[var12 + var7], var8[var12 + var7 + 1]);
               }
            }
         }
      }

      return var2;
   }

   public static void method35324(int[][] var0, int var1, int var2, int var3, int var4, int var5) {
      Class8684.method31292();
      int var8 = var1 * var2;
      IntBuffer var9 = method35302(var8);
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

   public static int method35325(int var0, int var1, int var2, int var3) {
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

   public static int method35326(int var0, int var1, int var2, int var3) {
      return ((var0 >>> 24 & 0xFF) + (var1 >>> 24 & 0xFF) + (var2 >>> 24 & 0xFF) + (var3 >>> 24 & 0xFF) + 2) / 4 << 24
         | ((var0 >>> 16 & 0xFF) + (var1 >>> 16 & 0xFF) + (var2 >>> 16 & 0xFF) + (var3 >>> 16 & 0xFF) + 2) / 4 << 16
         | ((var0 >>> 8 & 0xFF) + (var1 >>> 8 & 0xFF) + (var2 >>> 8 & 0xFF) + (var3 >>> 8 & 0xFF) + 2) / 4 << 8
         | ((var0 >>> 0 & 0xFF) + (var1 >>> 0 & 0xFF) + (var2 >>> 0 & 0xFF) + (var3 >>> 0 & 0xFF) + 2) / 4 << 0;
   }

   public static void method35327(int[] var0, int var1, int var2, int var3) {
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
               var0[var14 + var16] = method35325(
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

   public static void method35328(int[] var0, int var1, int var2, int var3) {
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
               var0[var14 + var16] = method35326(
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

   public static boolean method35329(int[] var0, int var1, int var2) {
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

   public static void method35330(int[] var0, int var1, int var2, int var3, int var4) {
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

   public static void method35331(Class9732 var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var10 = var2 * var3;
      IntBuffer var11 = method35302(var10);
      Class8684.method31292();
      ((Buffer)var11).clear();
      var11.put(var1, 0, var10);
      ((Buffer)var11).position(0).limit(var10);
      Class7414.method23814(var0.field45439);
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

      Class7414.method23814(var0.field45440);
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

      Class7414.method23814(var0.field45441);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var11);
      Class7414.method23803(33984);
   }

   public static ResourceLocation method35332(ResourceLocation var0, String var1) {
      if (var0 != null) {
         String var4 = var0.getPath();
         String[] var5 = var4.split(".png");
         String var6 = var5[0];
         return new ResourceLocation(var0.getNamespace(), var6 + "_" + var1 + ".png");
      } else {
         return null;
      }
   }

   private static Class1806 method35333(IResourceManager var0, ResourceLocation var1, int var2, int var3, int var4) {
      Class1806 var7 = method35335(var0, var1, var2, var3);
      if (var7 == null) {
         var7 = new Class1806(var2, var3, false);
         int var8 = Class8684.method31291(var4);
         var7.method7904(0, 0, var2, var3, var8);
      }

      return var7;
   }

   private static Class1806 method35334(int var0, int var1, int var2) {
      Class1806 var5 = new Class1806(var0, var1, false);
      int var6 = Class8684.method31291(var2);
      var5.method7916(var6);
      return var5;
   }

   private static Class1806 method35335(IResourceManager var0, ResourceLocation var1, int var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         try {
            Class1783 var6 = var0.method580(var1);
            Class1806 var7 = Class1806.method7879(var6.method7763());
            if (var7 == null) {
               return null;
            } else if (var7.method7886() == var2 && var7.method7887() == var3) {
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

   public static void method35336(int var0, Class1806 var1, boolean var2, boolean var3, IResourceManager var4, ResourceLocation var5, Class9732 var6) {
      int var9 = var1.method7886();
      int var10 = var1.method7887();
      ResourceLocation var11 = method35332(var5, "n");
      Class1806 var12 = method35333(var4, var11, var9, var10, -8421377);
      Class8535.method30370(var6.field45440, 0, var9, var10);
      var12.method7895(0, 0, 0, 0, 0, var9, var10, var2, var3, false, true);
      ResourceLocation var13 = method35332(var5, "s");
      Class1806 var14 = method35333(var4, var13, var9, var10, 0);
      Class8535.method30370(var6.field45441, 0, var9, var10);
      var14.method7895(0, 0, 0, 0, 0, var9, var10, var2, var3, false, true);
      Class7414.method23814(var6.field45439);
   }

   public static void method35337(int[] var0, int var1, int var2, int var3) {
   }

   public static int method35338(int var0, int var1, int var2) {
      int var5 = 255 - var2;
      return ((var0 >>> 24 & 0xFF) * var2 + (var1 >>> 24 & 0xFF) * var5) / 255 << 24
         | ((var0 >>> 16 & 0xFF) * var2 + (var1 >>> 16 & 0xFF) * var5) / 255 << 16
         | ((var0 >>> 8 & 0xFF) * var2 + (var1 >>> 8 & 0xFF) * var5) / 255 << 8
         | ((var0 >>> 0 & 0xFF) * var2 + (var1 >>> 0 & 0xFF) * var5) / 255 << 0;
   }

   public static void method35339() {
      TextureManager var2 = Minecraft.getInstance().getTextureManager();
      Class290 var3 = var2.getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
      if (var3 != null) {
         Class9732 var4 = var3.method1135();
         Class7414.method23814(var4.field45439);
         GL11.glTexParameteri(3553, 10241, Shaders.field40883[Shaders.field40867]);
         GL11.glTexParameteri(3553, 10240, Shaders.field40884[Shaders.field40870]);
         Class7414.method23814(var4.field45440);
         GL11.glTexParameteri(3553, 10241, Shaders.field40883[Shaders.field40868]);
         GL11.glTexParameteri(3553, 10240, Shaders.field40884[Shaders.field40871]);
         Class7414.method23814(var4.field45441);
         GL11.glTexParameteri(3553, 10241, Shaders.field40883[Shaders.field40869]);
         GL11.glTexParameteri(3553, 10240, Shaders.field40884[Shaders.field40872]);
         Class7414.method23814(0);
      }
   }

   public static int[][] method35340(int[][] var0, int var1, int var2, int var3) {
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

   public static int[][] method35341(TextureAtlasSprite var0, int[][] var1, int var2, int var3) {
      boolean var6 = true;
      return var1;
   }

   public static void method35342(TextureAtlasSprite var0, int[] var1) {
   }
}
