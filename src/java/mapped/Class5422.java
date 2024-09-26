package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3i;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Class5422 extends Class5421 {
   Logger field24103 = LogManager.getLogger();
   ThreadLocal<Class8391> field24104 = ThreadLocal.<Class8391>withInitial(() -> new Class8391(Blocks.AIR.method11579(), new BlockPos(0, 0, 0)));
   boolean field24105 = Reflector.field42864.method20245();

   default Class8391 method17022(BlockState var1, BlockPos var2) {
      Class8391 var5 = field24104.get();
      var5.method29411(var1, var2);
      return var5;
   }

   default RenderType method17023() {
      return null;
   }

   default boolean method17024() {
      return false;
   }

   Class5422 pos(double var1, double var3, double var5);

   Class5422 color(int var1, int var2, int var3, int var4);

   Class5422 tex(float var1, float var2);

   Class5422 method17028(int var1, int var2);

   Class5422 method17029(int var1, int var2);

   Class5422 method17030(float var1, float var2, float var3);

   void endVertex();

   default void method17032(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      this.pos((double)var1, (double)var2, (double)var3);
      this.color(var4, var5, var6, var7);
      this.tex(var8, var9);
      this.method17035(var10);
      this.method17034(var11);
      this.method17030(var12, var13, var14);
      this.endVertex();
   }

   default Class5422 color(float var1, float var2, float var3, float var4) {
      return this.color((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   default Class5422 method17034(int var1) {
      return this.method17029(var1 & 65535, var1 >> 16 & 65535);
   }

   default Class5422 method17035(int var1) {
      return this.method17028(var1 & 65535, var1 >> 16 & 65535);
   }

   default void method17036(Class8892 var1, Class8557 var2, float var3, float var4, float var5, int var6, int var7) {
      this.method17038(var1, var2, this.method17047(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, this.method17048(var6, var6, var6, var6), var7, false);
   }

   default void method17037(Class8892 var1, Class8557 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      this.method17039(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   default void method17038(Class8892 var1, Class8557 var2, float[] var3, float var4, float var5, float var6, int[] var7, int var8, boolean var9) {
      this.method17039(var1, var2, var3, var4, var5, var6, 1.0F, var7, var8, var9);
   }

   default void method17039(Class8892 var1, Class8557 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      int[] var13 = !this.method17024() ? var2.method30511() : var2.method30517();
      this.method17042(var2.method30516());
      boolean var14 = Class7551.method24696();
      Vector3i var15 = var2.method30514().method556();
      float var16 = (float)var15.getX();
      float var17 = (float)var15.getY();
      float var18 = (float)var15.getZ();
      Matrix4f var19 = var1.getMatrix();
      Class8967 var20 = var1.method32362();
      float var21 = var20.method32832(var16, var17, var18);
      float var22 = var20.method32833(var16, var17, var18);
      float var23 = var20.method32834(var16, var17, var18);
      byte var24 = 8;
      int var25 = DefaultVertexFormats.field43334.method26215();
      int var26 = var13.length / var25;

      for (int var27 = 0; var27 < var26; var27++) {
         int var28 = var27 * var25;
         float var29 = Float.intBitsToFloat(var13[var28 + 0]);
         float var30 = Float.intBitsToFloat(var13[var28 + 1]);
         float var31 = Float.intBitsToFloat(var13[var28 + 2]);
         float var32 = 1.0F;
         float var33 = !var14 ? var3[var27] : 1.0F;
         float var34;
         float var35;
         float var36;
         if (!var10) {
            var34 = var33 * var4;
            var35 = var33 * var5;
            var36 = var33 * var6;
            if (field24105) {
               var32 = var7;
            }
         } else {
            int var37 = var13[var28 + 3];
            float var38 = (float)(var37 & 0xFF) / 255.0F;
            float var39 = (float)(var37 >> 8 & 0xFF) / 255.0F;
            float var40 = (float)(var37 >> 16 & 0xFF) / 255.0F;
            var34 = var38 * var33 * var4;
            var35 = var39 * var33 * var5;
            var36 = var40 * var33 * var6;
            if (field24105) {
               float var41 = (float)(var37 >> 24 & 0xFF) / 255.0F;
               var32 = var41 * var7;
            }
         }

         int var44 = var8[var27];
         if (field24105) {
            var44 = this.method17050(var8[var27], var13, var28);
         }

         float var45 = Float.intBitsToFloat(var13[var28 + 4]);
         float var46 = Float.intBitsToFloat(var13[var28 + 5]);
         float var47 = var19.method35517(var29, var30, var31, 1.0F);
         float var48 = var19.method35518(var29, var30, var31, 1.0F);
         float var42 = var19.method35519(var29, var30, var31, 1.0F);
         if (field24105) {
            Vector3f var43 = this.method17052(var13, var28, var1.method32362());
            if (var43 != null) {
               var21 = var43.method25269();
               var22 = var43.method25270();
               var23 = var43.method25271();
            }
         }

         if (var14) {
            var32 = var3[var27];
         }

         this.method17032(var47, var48, var42, var34, var35, var36, var32, var45, var46, var9, var44, var21, var22, var23);
      }
   }

   default Class5422 pos(Matrix4f var1, float var2, float var3, float var4) {
      float var7 = var1.method35517(var2, var3, var4, 1.0F);
      float var8 = var1.method35518(var2, var3, var4, 1.0F);
      float var9 = var1.method35519(var2, var3, var4, 1.0F);
      return this.pos((double)var7, (double)var8, (double)var9);
   }

   default Class5422 method17041(Class8967 var1, float var2, float var3, float var4) {
      float var7 = var1.method32832(var2, var3, var4);
      float var8 = var1.method32833(var2, var3, var4);
      float var9 = var1.method32834(var2, var3, var4);
      return this.method17030(var7, var8, var9);
   }

   default void method17042(TextureAtlasSprite var1) {
   }

   default void method17043(TextureAtlasSprite var1) {
   }

   default void method17044(RenderType var1) {
   }

   default Vector3f method17045(Vector3f var1) {
      return var1.method25287();
   }

   default Vector3f method17046(float var1, float var2, float var3) {
      return new Vector3f(var1, var2, var3);
   }

   default float[] method17047(float var1, float var2, float var3, float var4) {
      return new float[]{var1, var2, var3, var4};
   }

   default int[] method17048(int var1, int var2, int var3, int var4) {
      return new int[]{var1, var2, var3, var4};
   }

   default Class7735 method17049() {
      return null;
   }

   default int method17050(int var1, int[] var2, int var3) {
      int var6 = method17051(0);
      int var7 = Class1699.method7322(var2[var3 + var6]);
      int var8 = Class1699.method7323(var2[var3 + var6]);
      if (var7 == 0 && var8 == 0) {
         return var1;
      } else {
         int var9 = Class1699.method7322(var1);
         int var10 = Class1699.method7323(var1);
         var9 = Math.max(var9, var7);
         var10 = Math.max(var10, var8);
         return Class1699.method7321(var9, var10);
      }
   }

   static int method17051(int var0) {
      return var0 * 8 + 6;
   }

   default Vector3f method17052(int[] var1, int var2, Class8967 var3) {
      byte var6 = 7;
      int var7 = var1[var2 + var6];
      byte var8 = (byte)(var7 >> 0 & 0xFF);
      byte var9 = (byte)(var7 >> 8 & 0xFF);
      byte var10 = (byte)(var7 >> 16 & 0xFF);
      if (var8 == 0 && var9 == 0 && var10 == 0) {
         return null;
      } else {
         Vector3f var11 = this.method17046((float)var8 / 127.0F, (float)var9 / 127.0F, (float)var10 / 127.0F);
         var11.method25282(var3);
         return var11;
      }
   }
}
