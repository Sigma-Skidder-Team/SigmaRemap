package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

public class Class7698 {
   private static String[] field32957;
   public int field32958;
   public int field32959;
   public int field32960;
   public int field32961;
   public boolean field32962;
   public boolean field32963;
   public boolean field32964;
   public boolean field32965;
   public long[] field32966 = new long[10];
   public int field32967 = 0;

   public Class7698() {
      this.field32966[this.field32967] = 0L;
   }

   public static void method25373(BufferBuilder var0) {
      var0.field24132 = new Class7698();
   }

   public void method25374(long var1) {
      this.field32967++;
      this.field32966[this.field32967] = var1;
   }

   public void method25375() {
      this.field32966[this.field32967] = 0L;
      this.field32967--;
   }

   public static void method25376(BlockState var0, Class5422 var1) {
      if (var1 instanceof BufferBuilder) {
         BufferBuilder var4 = (BufferBuilder)var1;
         int var5 = Class9172.method34259(var0);
         int var6 = Class9172.method34261(var0);
         int var7 = Class9172.method34277(var0);
         int var8 = ((var7 & 65535) << 16) + (var5 & 65535);
         int var9 = var6 & 65535;
         var4.field24132.method25374(((long)var9 << 32) + (long)var8);
      }
   }

   public static void method25377(Class5422 var0) {
      if (var0 instanceof BufferBuilder) {
         BufferBuilder var3 = (BufferBuilder)var0;
         var3.field24132.method25375();
      }
   }

   public static boolean method25378(boolean var0, BufferBuilder var1) {
      var1.field24132.method25375();
      return var0;
   }

   public static void method25379(BufferBuilder var0) {
      Class7698 var3 = var0.field24132;
      Class7831 var4 = var0.method17089();
      var3.field32958 = var4.method26216() / 4;
      var3.field32962 = var4.method26223();
      var3.field32963 = var3.field32962;
      var3.field32964 = var4.method26227(0);
      var3.field32959 = !var3.field32962 ? 0 : var4.method26224() / 4;
      var3.field32960 = !var3.field32964 ? 0 : var4.method26228(0) / 4;
      var3.field32961 = 8;
   }

   public static void method25380(BufferBuilder var0) {
      if (var0.method17081() == 0) {
         method25379(var0);
      }
   }

   public static void method25381(BufferBuilder var0) {
      Class7698 var3 = var0.field24132;
      if (var3.field32958 == 16) {
         if (var0.method17080() == 7 && var0.method17081() % 4 == 0) {
            var3.method25385(var0, var0.method17085() - 4 * var3.field32958);
         }

         long var4 = var3.field32966[var3.field32967];
         int var6 = var0.method17085() - 16 + 13;
         var6 += var0.method17091();
         var0.method17084().put(var6, (int)var4);
         var0.method17084().put(var6 + 1, (int)(var4 >> 32));
      }
   }

   public static void method25382(BufferBuilder var0, int[] var1) {
      if (var0.method17081() == 0) {
         method25379(var0);
      }

      Class7698 var4 = var0.field24132;
      if (var4.field32958 == 16) {
         long var5 = var4.field32966[var4.field32967];

         for (int var7 = 13; var7 + 1 < var1.length; var7 += 16) {
            var1[var7] = (int)var5;
            var1[var7 + 1] = (int)(var5 >> 32);
         }
      }
   }

   public static void method25383(BufferBuilder var0, ByteBuffer var1) {
      if (var0.method17081() == 0) {
         method25379(var0);
      }

      Class7698 var4 = var0.field24132;
      if (var4.field32958 == 16) {
         long var5 = var4.field32966[var4.field32967];
         int var7 = var1.limit() / 4;

         for (int var8 = 13; var8 + 1 < var7; var8 += 16) {
            int var9 = (int)var5;
            int var10 = (int)(var5 >> 32);
            var1.putInt(var8 * 4, var9);
            var1.putInt((var8 + 1) * 4, var10);
         }
      }
   }

   public static void method25384(BufferBuilder var0) {
      Class7698 var3 = var0.field24132;
      if (var3.field32958 == 16 && var0.method17080() == 7 && var0.method17081() % 4 == 0) {
         var3.method25385(var0, var0.method17085() - 4 * var3.field32958);
      }
   }

   public void method25385(BufferBuilder var1, int var2) {
      var2 += var1.method17091();
      FloatBuffer var5 = var1.method17083();
      IntBuffer var6 = var1.method17084();
      float var7 = var5.get(var2 + 0 * this.field32958);
      float var8 = var5.get(var2 + 0 * this.field32958 + 1);
      float var9 = var5.get(var2 + 0 * this.field32958 + 2);
      float var10 = var5.get(var2 + 0 * this.field32958 + this.field32960);
      float var11 = var5.get(var2 + 0 * this.field32958 + this.field32960 + 1);
      float var12 = var5.get(var2 + 1 * this.field32958);
      float var13 = var5.get(var2 + 1 * this.field32958 + 1);
      float var14 = var5.get(var2 + 1 * this.field32958 + 2);
      float var15 = var5.get(var2 + 1 * this.field32958 + this.field32960);
      float var16 = var5.get(var2 + 1 * this.field32958 + this.field32960 + 1);
      float var17 = var5.get(var2 + 2 * this.field32958);
      float var18 = var5.get(var2 + 2 * this.field32958 + 1);
      float var19 = var5.get(var2 + 2 * this.field32958 + 2);
      float var20 = var5.get(var2 + 2 * this.field32958 + this.field32960);
      float var21 = var5.get(var2 + 2 * this.field32958 + this.field32960 + 1);
      float var22 = var5.get(var2 + 3 * this.field32958);
      float var23 = var5.get(var2 + 3 * this.field32958 + 1);
      float var24 = var5.get(var2 + 3 * this.field32958 + 2);
      float var25 = var5.get(var2 + 3 * this.field32958 + this.field32960);
      float var26 = var5.get(var2 + 3 * this.field32958 + this.field32960 + 1);
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
      var6.put(var2 + 0 * this.field32958 + this.field32959, var57);
      var6.put(var2 + 1 * this.field32958 + this.field32959, var57);
      var6.put(var2 + 2 * this.field32958 + this.field32959, var57);
      var6.put(var2 + 3 * this.field32958 + this.field32959, var57);
      int var58 = ((int)(var44 * 32767.0F) & 65535) + (((int)(var45 * 32767.0F) & 65535) << 16);
      int var59 = ((int)(var46 * 32767.0F) & 65535) + (((int)(var53 * 32767.0F) & 65535) << 16);
      var6.put(var2 + 0 * this.field32958 + 11, var58);
      var6.put(var2 + 0 * this.field32958 + 11 + 1, var59);
      var6.put(var2 + 1 * this.field32958 + 11, var58);
      var6.put(var2 + 1 * this.field32958 + 11 + 1, var59);
      var6.put(var2 + 2 * this.field32958 + 11, var58);
      var6.put(var2 + 2 * this.field32958 + 11 + 1, var59);
      var6.put(var2 + 3 * this.field32958 + 11, var58);
      var6.put(var2 + 3 * this.field32958 + 11 + 1, var59);
      float var60 = (var10 + var15 + var20 + var25) / 4.0F;
      float var61 = (var11 + var16 + var21 + var26) / 4.0F;
      var5.put(var2 + 0 * this.field32958 + 9, var60);
      var5.put(var2 + 0 * this.field32958 + 9 + 1, var61);
      var5.put(var2 + 1 * this.field32958 + 9, var60);
      var5.put(var2 + 1 * this.field32958 + 9 + 1, var61);
      var5.put(var2 + 2 * this.field32958 + 9, var60);
      var5.put(var2 + 2 * this.field32958 + 9 + 1, var61);
      var5.put(var2 + 3 * this.field32958 + 9, var60);
      var5.put(var2 + 3 * this.field32958 + 9 + 1, var61);
   }

   public static void method25386(BufferBuilder var0) {
      if (var0.method17089().method26223() && var0.method17080() == 7 && var0.method17081() % 4 == 0) {
         Class7698 var3 = var0.field24132;
         method25379(var0);
         int var4 = var0.method17081() * var3.field32958;

         for (int var5 = 0; var5 < var4; var5 += var3.field32958 * 4) {
            var3.method25385(var0, var5);
         }
      }
   }

   public static void method25387(int var0, int var1, int var2, Class7831 var3, ByteBuffer var4) {
      if (var2 != 0) {
         int var7 = var3.method26216();
         if (var7 != 64) {
            Class7414.method23854(var0, var1, var2);
         } else {
            ((Buffer)var4).position(36);
            GL20.glVertexAttribPointer(Shaders.field40671, 2, 5126, false, var7, var4);
            ((Buffer)var4).position(44);
            GL20.glVertexAttribPointer(Shaders.field40672, 4, 5122, false, var7, var4);
            ((Buffer)var4).position(52);
            GL20.glVertexAttribPointer(Shaders.field40670, 3, 5122, false, var7, var4);
            ((Buffer)var4).position(0);
            GL20.glEnableVertexAttribArray(Shaders.field40671);
            GL20.glEnableVertexAttribArray(Shaders.field40672);
            GL20.glEnableVertexAttribArray(Shaders.field40670);
            Class7414.method23854(var0, var1, var2);
            GL20.glDisableVertexAttribArray(Shaders.field40671);
            GL20.glDisableVertexAttribArray(Shaders.field40672);
            GL20.glDisableVertexAttribArray(Shaders.field40670);
         }
      }
   }
}
