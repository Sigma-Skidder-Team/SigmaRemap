package remapped;

import java.awt.Dimension;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class class_8678 {
   private final String field_44543;
   private final int field_44544;
   private final int field_44539;
   private final int[] field_44537;
   private final boolean field_44540;
   private int[][] field_44545;
   private IntBuffer[] field_44538;
   private Dimension[] field_44542;

   public class_8678(String var1, int var2, int var3, int[] var4, boolean var5) {
      this.field_44543 = var1;
      this.field_44544 = var2;
      this.field_44539 = var3;
      this.field_44537 = var4;
      this.field_44540 = var5;
      this.field_44542 = method_39855(var2, var3, var1);
      this.field_44545 = method_39860(var4, var2, var3, this.field_44542);
      if (var5) {
         this.field_44538 = method_39853(this.field_44542, this.field_44545);
      }
   }

   public static Dimension[] method_39855(int var0, int var1, String var2) {
      int var5 = class_5525.method_25068(var0);
      int var6 = class_5525.method_25068(var1);
      if (var5 == var0 && var6 == var1) {
         ArrayList var7 = new ArrayList();
         int var8 = var5;
         int var9 = var6;

         while (true) {
            var8 /= 2;
            var9 /= 2;
            if (var8 <= 0 && var9 <= 0) {
               return var7.<Dimension>toArray(new Dimension[var7.size()]);
            }

            if (var8 <= 0) {
               var8 = 1;
            }

            if (var9 <= 0) {
               var9 = 1;
            }

            int var10 = var8 * var9 * 4;
            Dimension var11 = new Dimension(var8, var9);
            var7.add(var11);
         }
      } else {
         class_3111.method_14317("Mipmaps not possible (power of 2 dimensions needed), texture: " + var2 + ", dim: " + var0 + "x" + var1);
         return new Dimension[0];
      }
   }

   public static int[][] method_39860(int[] var0, int var1, int var2, Dimension[] var3) {
      int[] var6 = var0;
      int var7 = var1;
      boolean var8 = true;
      int[][] var9 = new int[var3.length][];

      for (int var10 = 0; var10 < var3.length; var10++) {
         Dimension var11 = var3[var10];
         int var12 = var11.width;
         int var13 = var11.height;
         int[] var14 = new int[var12 * var13];
         var9[var10] = var14;
         int var15 = var10 + 1;
         if (var8) {
            for (int var16 = 0; var16 < var12; var16++) {
               for (int var17 = 0; var17 < var13; var17++) {
                  int var18 = var6[var16 * 2 + 0 + (var17 * 2 + 0) * var7];
                  int var19 = var6[var16 * 2 + 1 + (var17 * 2 + 0) * var7];
                  int var20 = var6[var16 * 2 + 1 + (var17 * 2 + 1) * var7];
                  int var21 = var6[var16 * 2 + 0 + (var17 * 2 + 1) * var7];
                  int var22 = method_39858(var18, var19, var20, var21);
                  var14[var16 + var17 * var12] = var22;
               }
            }
         }

         var6 = var14;
         var7 = var12;
         if (var12 <= 1 || var13 <= 1) {
            var8 = false;
         }
      }

      return var9;
   }

   public static int method_39858(int var0, int var1, int var2, int var3) {
      int var6 = method_39857(var0, var1);
      int var7 = method_39857(var2, var3);
      return method_39857(var6, var7);
   }

   private static int method_39857(int var0, int var1) {
      int var4 = (var0 & 0xFF000000) >> 24 & 0xFF;
      int var5 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var6 = (var4 + var5) / 2;
      if (var4 == 0 && var5 == 0) {
         var4 = 1;
         var5 = 1;
      } else {
         if (var4 == 0) {
            var0 = var1;
            var6 /= 2;
         }

         if (var5 == 0) {
            var1 = var0;
            var6 /= 2;
         }
      }

      int var7 = (var0 >> 16 & 0xFF) * var4;
      int var8 = (var0 >> 8 & 0xFF) * var4;
      int var9 = (var0 & 0xFF) * var4;
      int var10 = (var1 >> 16 & 0xFF) * var5;
      int var11 = (var1 >> 8 & 0xFF) * var5;
      int var12 = (var1 & 0xFF) * var5;
      int var13 = (var7 + var10) / (var4 + var5);
      int var14 = (var8 + var11) / (var4 + var5);
      int var15 = (var9 + var12) / (var4 + var5);
      return var6 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   private int method_39859(int var1, int var2) {
      int var5 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var6 = (var2 & 0xFF000000) >> 24 & 0xFF;
      return (var5 + var6 >> 1 << 24) + ((var5 & 16711422) + (var6 & 16711422) >> 1);
   }

   public static IntBuffer[] method_39853(Dimension[] var0, int[][] var1) {
      if (var0 == null) {
         return null;
      } else {
         IntBuffer[] var4 = new IntBuffer[var0.length];

         for (int var5 = 0; var5 < var0.length; var5++) {
            Dimension var6 = var0[var5];
            int var7 = var6.width * var6.height;
            IntBuffer var8 = class_3111.method_14260(var7);
            int[] var9 = var1[var5];
            ((Buffer)var8).clear();
            var8.put(var9);
            ((Buffer)var8).clear();
            var4[var5] = var8;
         }

         return var4;
      }
   }

   public static void method_39856(int var0, int var1, String var2) {
      Dimension[] var5 = method_39855(var0, var1, var2);

      for (int var6 = 0; var6 < var5.length; var6++) {
         Dimension var7 = var5[var6];
         int var8 = var7.width;
         int var9 = var7.height;
         int var10 = var6 + 1;
         GL11.glTexImage2D(3553, var10, 6408, var8, var9, 0, 32993, 33639, (IntBuffer)null);
      }
   }
}
