package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

public class class_2448 {
   private static String[] field_12151;
   public int field_12159;
   public int field_12157;
   public int field_12154;
   public int field_12155;
   public boolean field_12161;
   public boolean field_12158;
   public boolean field_12152;
   public boolean field_12156;
   public long[] field_12160 = new long[10];
   public int field_12153 = 0;

   public class_2448() {
      this.field_12160[this.field_12153] = 0L;
   }

   public static void method_11188(class_9633 var0) {
      var0.field_49082 = new class_2448();
   }

   public void method_11200(long var1) {
      this.field_12153++;
      this.field_12160[this.field_12153] = var1;
   }

   public void method_11190() {
      this.field_12160[this.field_12153] = 0L;
      this.field_12153--;
   }

   public static void method_11201(class_2522 var0, class_7907 var1) {
      if (var1 instanceof class_9633) {
         class_9633 var4 = (class_9633)var1;
         int var5 = class_7330.method_33396(var0);
         int var6 = class_7330.method_33411(var0);
         int var7 = class_7330.method_33406(var0);
         int var8 = ((var7 & 65535) << 16) + (var5 & 65535);
         byte var9;
         var4.field_49082.method_11200(((long)var9 << 32) + (long)var8);
      }
   }

   public static void method_11191(class_7907 var0) {
      if (var0 instanceof class_9633) {
         class_9633 var3 = (class_9633)var0;
         var3.field_49082.method_11190();
      }
   }

   public static boolean method_11192(boolean var0, class_9633 var1) {
      var1.field_49082.method_11190();
      return var0;
   }

   public static void method_11199(class_9633 var0) {
      class_2448 var3 = var0.field_49082;
      class_2868 var4 = var0.method_44458();
      var3.field_12159 = var4.method_13168() / 4;
      var3.field_12161 = var4.method_13169();
      var3.field_12158 = var3.field_12161;
      var3.field_12152 = var4.method_13178(0);
      var3.field_12157 = !var3.field_12161 ? 0 : var4.method_13175() / 4;
      var3.field_12154 = !var3.field_12152 ? 0 : var4.method_13177(0) / 4;
      var3.field_12155 = 8;
   }

   public static void method_11189(class_9633 var0) {
      if (var0.method_44478() == 0) {
         method_11199(var0);
      }
   }

   public static void method_11198(class_9633 var0) {
      class_2448 var3 = var0.field_49082;
      if (var3.field_12159 == 16) {
         if (var0.method_44472() == 7 && var0.method_44478() % 4 == 0) {
            var3.method_11194(var0, var0.method_44457() - 4 * var3.field_12159);
         }

         long var4 = var3.field_12160[var3.field_12153];
         int var6 = var0.method_44457() - 16 + 13;
         var6 += var0.method_44466();
         var0.method_44469().put(var6, (int)var4);
         var0.method_44469().put(var6 + 1, (int)(var4 >> 32));
      }
   }

   public static void method_11197(class_9633 var0, int[] var1) {
      if (var0.method_44478() == 0) {
         method_11199(var0);
      }

      class_2448 var4 = var0.field_49082;
      if (var4.field_12159 == 16) {
         long var5 = var4.field_12160[var4.field_12153];

         for (byte var7 = 13; var7 + 1 < var1.length; var7 += 16) {
            var1[var7] = (int)var5;
            var1[var7 + 1] = (int)(var5 >> 32);
         }
      }
   }

   public static void method_11196(class_9633 var0, ByteBuffer var1) {
      if (var0.method_44478() == 0) {
         method_11199(var0);
      }

      class_2448 var4 = var0.field_49082;
      if (var4.field_12159 == 16) {
         long var5 = var4.field_12160[var4.field_12153];
         int var7 = var1.limit() / 4;

         for (byte var8 = 13; var8 + 1 < var7; var8 += 16) {
            int var9 = (int)var5;
            int var10 = (int)(var5 >> 32);
            var1.putInt(var8 * 4, var9);
            var1.putInt((var8 + 1) * 4, var10);
         }
      }
   }

   public static void method_11187(class_9633 var0) {
      class_2448 var3 = var0.field_49082;
      if (var3.field_12159 == 16 && var0.method_44472() == 7 && var0.method_44478() % 4 == 0) {
         var3.method_11194(var0, var0.method_44457() - 4 * var3.field_12159);
      }
   }

   public void method_11194(class_9633 var1, int var2) {
      var2 += var1.method_44466();
      FloatBuffer var5 = var1.method_44464();
      IntBuffer var6 = var1.method_44469();
      float var7 = var5.get(var2 + 0 * this.field_12159);
      float var8 = var5.get(var2 + 0 * this.field_12159 + 1);
      float var9 = var5.get(var2 + 0 * this.field_12159 + 2);
      float var10 = var5.get(var2 + 0 * this.field_12159 + this.field_12154);
      float var11 = var5.get(var2 + 0 * this.field_12159 + this.field_12154 + 1);
      float var12 = var5.get(var2 + 1 * this.field_12159);
      float var13 = var5.get(var2 + 1 * this.field_12159 + 1);
      float var14 = var5.get(var2 + 1 * this.field_12159 + 2);
      float var15 = var5.get(var2 + 1 * this.field_12159 + this.field_12154);
      float var16 = var5.get(var2 + 1 * this.field_12159 + this.field_12154 + 1);
      float var17 = var5.get(var2 + 2 * this.field_12159);
      float var18 = var5.get(var2 + 2 * this.field_12159 + 1);
      float var19 = var5.get(var2 + 2 * this.field_12159 + 2);
      float var20 = var5.get(var2 + 2 * this.field_12159 + this.field_12154);
      float var21 = var5.get(var2 + 2 * this.field_12159 + this.field_12154 + 1);
      float var22 = var5.get(var2 + 3 * this.field_12159);
      float var23 = var5.get(var2 + 3 * this.field_12159 + 1);
      float var24 = var5.get(var2 + 3 * this.field_12159 + 2);
      float var25 = var5.get(var2 + 3 * this.field_12159 + this.field_12154);
      float var26 = var5.get(var2 + 3 * this.field_12159 + this.field_12154 + 1);
      float var27 = var17 - var7;
      float var28 = var18 - var8;
      float var29 = var19 - var9;
      float var30 = var22 - var12;
      float var31 = var23 - var13;
      float var32 = var24 - var14;
      float var33 = var28 * var32 - var31 * var29;
      float var34 = var29 * var30 - var32 * var27;
      float var35 = var27 * var31 - var30 * var28;
      float var36 = var33 * var33 + var34 * var34 + var35 * var35;
      float var37 = (double)var36 == 0.0 ? 1.0F : (float)(1.0 / Math.sqrt((double)var36));
      var33 *= var37;
      var34 *= var37;
      var35 *= var37;
      var27 = var12 - var7;
      var28 = var13 - var8;
      var29 = var14 - var9;
      float var38 = var15 - var10;
      float var39 = var16 - var11;
      var30 = var17 - var7;
      var31 = var18 - var8;
      var32 = var19 - var9;
      float var40 = var20 - var10;
      float var41 = var21 - var11;
      float var42 = var38 * var41 - var40 * var39;
      float var43 = var42 == 0.0F ? 1.0F : 1.0F / var42;
      float var44 = (var41 * var27 - var39 * var30) * var43;
      float var45 = (var41 * var28 - var39 * var31) * var43;
      float var46 = (var41 * var29 - var39 * var32) * var43;
      float var47 = (var38 * var30 - var40 * var27) * var43;
      float var48 = (var38 * var31 - var40 * var28) * var43;
      float var49 = (var38 * var32 - var40 * var29) * var43;
      var36 = var44 * var44 + var45 * var45 + var46 * var46;
      var37 = (double)var36 == 0.0 ? 1.0F : (float)(1.0 / Math.sqrt((double)var36));
      var44 *= var37;
      var45 *= var37;
      var46 *= var37;
      var36 = var47 * var47 + var48 * var48 + var49 * var49;
      var37 = (double)var36 == 0.0 ? 1.0F : (float)(1.0 / Math.sqrt((double)var36));
      var47 *= var37;
      var48 *= var37;
      var49 *= var37;
      float var50 = var35 * var45 - var34 * var46;
      float var51 = var33 * var46 - var35 * var44;
      float var52 = var34 * var44 - var33 * var45;
      float var53 = !(var47 * var50 + var48 * var51 + var49 * var52 < 0.0F) ? 1.0F : -1.0F;
      int var54 = (int)(var33 * 127.0F) & 0xFF;
      int var55 = (int)(var34 * 127.0F) & 0xFF;
      int var56 = (int)(var35 * 127.0F) & 0xFF;
      int var57 = (var56 << 16) + (var55 << 8) + var54;
      var6.put(var2 + 0 * this.field_12159 + this.field_12157, var57);
      var6.put(var2 + 1 * this.field_12159 + this.field_12157, var57);
      var6.put(var2 + 2 * this.field_12159 + this.field_12157, var57);
      var6.put(var2 + 3 * this.field_12159 + this.field_12157, var57);
      int var58 = ((int)(var44 * 32767.0F) & 65535) + (((int)(var45 * 32767.0F) & 65535) << 16);
      int var59 = ((int)(var46 * 32767.0F) & 65535) + (((int)(var53 * 32767.0F) & 65535) << 16);
      var6.put(var2 + 0 * this.field_12159 + 11, var58);
      var6.put(var2 + 0 * this.field_12159 + 11 + 1, var59);
      var6.put(var2 + 1 * this.field_12159 + 11, var58);
      var6.put(var2 + 1 * this.field_12159 + 11 + 1, var59);
      var6.put(var2 + 2 * this.field_12159 + 11, var58);
      var6.put(var2 + 2 * this.field_12159 + 11 + 1, var59);
      var6.put(var2 + 3 * this.field_12159 + 11, var58);
      var6.put(var2 + 3 * this.field_12159 + 11 + 1, var59);
      float var60 = (var10 + var15 + var20 + var25) / 4.0F;
      float var61 = (var11 + var16 + var21 + var26) / 4.0F;
      var5.put(var2 + 0 * this.field_12159 + 9, var60);
      var5.put(var2 + 0 * this.field_12159 + 9 + 1, var61);
      var5.put(var2 + 1 * this.field_12159 + 9, var60);
      var5.put(var2 + 1 * this.field_12159 + 9 + 1, var61);
      var5.put(var2 + 2 * this.field_12159 + 9, var60);
      var5.put(var2 + 2 * this.field_12159 + 9 + 1, var61);
      var5.put(var2 + 3 * this.field_12159 + 9, var60);
      var5.put(var2 + 3 * this.field_12159 + 9 + 1, var61);
   }

   public static void method_11186(class_9633 var0) {
      if (var0.method_44458().method_13169() && var0.method_44472() == 7 && var0.method_44478() % 4 == 0) {
         class_2448 var3 = var0.field_49082;
         method_11199(var0);
         int var4 = var0.method_44478() * var3.field_12159;

         for (int var5 = 0; var5 < var4; var5 += var3.field_12159 * 4) {
            var3.method_11194(var0, var5);
         }
      }
   }

   public static void method_11193(int var0, int var1, int var2, class_2868 var3, ByteBuffer var4) {
      if (var2 != 0) {
         int var7 = var3.method_13168();
         if (var7 != 64) {
            class_1920.method_8812(var0, var1, var2);
         } else {
            ((Buffer)var4).position(36);
            GL20.glVertexAttribPointer(class_6588.field_33801, 2, 5126, false, var7, var4);
            ((Buffer)var4).position(44);
            GL20.glVertexAttribPointer(class_6588.field_33817, 4, 5122, false, var7, var4);
            ((Buffer)var4).position(52);
            GL20.glVertexAttribPointer(class_6588.field_33899, 3, 5122, false, var7, var4);
            ((Buffer)var4).position(0);
            GL20.glEnableVertexAttribArray(class_6588.field_33801);
            GL20.glEnableVertexAttribArray(class_6588.field_33817);
            GL20.glEnableVertexAttribArray(class_6588.field_33899);
            class_1920.method_8812(var0, var1, var2);
            GL20.glDisableVertexAttribArray(class_6588.field_33801);
            GL20.glDisableVertexAttribArray(class_6588.field_33817);
            GL20.glDisableVertexAttribArray(class_6588.field_33899);
         }
      }
   }
}
