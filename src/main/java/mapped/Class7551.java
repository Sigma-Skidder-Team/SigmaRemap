package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockDisplayReader;
import net.optifine.Config;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.Shaders;

import java.util.BitSet;
import java.util.List;
import java.util.Random;

public class Class7551 {
   private final BlockColors field32369;
   private static final ThreadLocal<Class7217> field32370 = ThreadLocal.withInitial(Class7217::new);
   private static float field32371 = 0.2F;
   private static boolean field32372 = false;
   private static final Class4049 field32373 = new Class4049();
   private static final RenderType[] field32374 = new RenderType[]{Class9025.field41290, Class9025.field41289, Class9025.field41291};
   private boolean field32375 = Reflector.field42864.method20245();

   private void method24676(
      IBlockDisplayReader var1,
      BlockState var2,
      BlockPos var3,
      MatrixStack var4,
      IVertexBuilder var5,
      List<Class8557> var6,
      float[] var7,
      BitSet var8,
      Class9529 var9,
      int var10
   ) {
      for (Class8557 var14 : var6) {
         this.method24687(var1, var2, var3, var14.method30511(), var14.method30514(), var7, var8);
         var9.method36827(var1, var2, var3, var14.method30514(), var7, var8, var14.method30515());
         this.method24677(
            var1,
            var2,
            var3,
            var5,
            var4.getLast(),
            var14,
            Class9529.method36830(var9)[0],
            Class9529.method36830(var9)[1],
            Class9529.method36830(var9)[2],
            Class9529.method36830(var9)[3],
            Class9529.method36831(var9)[0],
            Class9529.method36831(var9)[1],
            Class9529.method36831(var9)[2],
            Class9529.method36831(var9)[3],
            var10
         );
      }
   }

   private void method24677(
      IBlockDisplayReader var1,
      BlockState var2,
      BlockPos var3,
      IVertexBuilder var4,
      Class8892 var5,
      Class8557 var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15
   ) {
      float var18;
      float var19;
      float var20;
      if (!var6.method30512()) {
         var18 = 1.0F;
         var19 = 1.0F;
         var20 = 1.0F;
      } else {
         int var21 = this.field32369.method29465(var2, var1, var3, var6.method30513());
         var18 = (float)(var21 >> 16 & 0xFF) / 255.0F;
         var19 = (float)(var21 >> 8 & 0xFF) / 255.0F;
         var20 = (float)(var21 & 0xFF) / 255.0F;
      }

      var4.method17038(var5, var6, new float[]{var7, var8, var9, var10}, var18, var19, var20, new int[]{var11, var12, var13, var14}, var15, true);
   }

   private void method24678(
           IBlockDisplayReader var1, BlockState var2, BlockPos var3, int var4, int var5, boolean var6, MatrixStack var7, IVertexBuilder var8, List<Class8557> var9, BitSet var10
   ) {
      for (Class8557 var14 : var9) {
         if (var6) {
            this.method24687(var1, var2, var3, var14.method30511(), var14.method30514(), (float[])null, var10);
            BlockPos var15 = !var10.get(0) ? var3 : var3.offset(var14.method30514());
            var4 = WorldRenderer.method945(var1, var2, var15);
         }

         float var16 = var1.method6877(var14.method30514(), var14.method30515());
         this.method24677(var1, var2, var3, var8, var7.getLast(), var14, var16, var16, var16, var16, var4, var4, var4, var4, var5);
      }
   }

   public Class7551(BlockColors var1) {
      this.field32369 = var1;
   }

   public boolean method24679(
           IBlockDisplayReader var1, IBakedModel var2, BlockState var3, BlockPos var4, MatrixStack var5, IVertexBuilder var6, boolean var7, Random var8, long var9, int var11
   ) {
      return this.method24680(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, Class7181.field30863);
   }

   public boolean method24680(
      IBlockDisplayReader var1,
      IBakedModel var2,
      BlockState var3,
      BlockPos var4,
      MatrixStack var5,
      IVertexBuilder var6,
      boolean var7,
      Random var8,
      long var9,
      int var11,
      Class7180 var12
   ) {
      boolean var15 = Minecraft.isAmbientOcclusionEnabled() && ReflectorForge.method37047(var3, var1, var4) == 0 && var2.method22620();
      if (this.field32375) {
         var12 = var2.method22631(var1, var4, var3, var12);
      }

      Vector3d var16 = var3.method23421(var1, var4);
      var5.translate(var16.x, var16.y, var16.z);

      try {
         if (Config.isShaders()) {
            Class7698.method25376(var3, var6);
         }

         if (!Config.method26941()) {
            var9 = 0L;
         }

         Class8391 var17 = var6.method17022(var3, var4);
         var2 = Class8464.method29765(var2, var3, var17);
         boolean var22 = var15
            ? this.method24682(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12)
            : this.method24684(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
         if (var22) {
            this.method24697(var1, var2, var3, var4, var5, var6, var11, var7, var8, var9, var17, var15, var16);
         }

         if (Config.isShaders()) {
            Class7698.method25377(var6);
         }

         return var22;
      } catch (Throwable var20) {
         CrashReport var18 = CrashReport.makeCrashReport(var20, "Tesselating block model");
         CrashReportCategory var19 = var18.makeCategory("Block model being tesselated");
         CrashReportCategory.addBlockInfo(var19, var4, var3);
         var19.addDetail("Using AO", var15);
         throw new ReportedException(var18);
      }
   }

   public boolean method24681(
           IBlockDisplayReader var1, IBakedModel var2, BlockState var3, BlockPos var4, MatrixStack var5, IVertexBuilder var6, boolean var7, Random var8, long var9, int var11
   ) {
      return this.method24682(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, Class7181.field30863);
   }

   public boolean method24682(
      IBlockDisplayReader var1,
      IBakedModel var2,
      BlockState var3,
      BlockPos var4,
      MatrixStack var5,
      IVertexBuilder var6,
      boolean var7,
      Random var8,
      long var9,
      int var11,
      Class7180 var12
   ) {
      boolean var15 = false;
      Class8391 var16 = var6.method17022(var3, var4);
      RenderType var17 = var6.method17023();

      for (Direction var21 : Direction.VALUES) {
         if (!var7 || Class9716.method38063(var3, var1, var4, var21, var16)) {
            var8.setSeed(var9);
            List var22 = !this.field32375 ? var2.method22619(var3, var21, var8) : var2.method22628(var3, var21, var8, var12);
            var22 = Class8464.method29766(var22, var1, var3, var4, var21, var17, var9, var16);
            this.method24685(var1, var3, var4, var5, var6, var22, var11, var16);
            var15 = true;
         }
      }

      var8.setSeed(var9);
      List var23 = !this.field32375 ? var2.method22619(var3, (Direction)null, var8) : var2.method22628(var3, (Direction)null, var8, var12);
      if (!var23.isEmpty()) {
         var23 = Class8464.method29766(var23, var1, var3, var4, (Direction)null, var17, var9, var16);
         this.method24685(var1, var3, var4, var5, var6, var23, var11, var16);
         var15 = true;
      }

      return var15;
   }

   public boolean method24683(
           IBlockDisplayReader var1, IBakedModel var2, BlockState var3, BlockPos var4, MatrixStack var5, IVertexBuilder var6, boolean var7, Random var8, long var9, int var11
   ) {
      return this.method24684(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, Class7181.field30863);
   }

   public boolean method24684(
      IBlockDisplayReader var1,
      IBakedModel var2,
      BlockState var3,
      BlockPos var4,
      MatrixStack var5,
      IVertexBuilder var6,
      boolean var7,
      Random var8,
      long var9,
      int var11,
      Class7180 var12
   ) {
      boolean var15 = false;
      Class8391 var16 = var6.method17022(var3, var4);
      RenderType var17 = var6.method17023();

      for (Direction var21 : Direction.VALUES) {
         if (!var7 || Class9716.method38063(var3, var1, var4, var21, var16)) {
            var8.setSeed(var9);
            List var22 = !this.field32375 ? var2.method22619(var3, var21, var8) : var2.method22628(var3, var21, var8, var12);
            int var23 = WorldRenderer.method945(var1, var3, var4.offset(var21));
            var22 = Class8464.method29766(var22, var1, var3, var4, var21, var17, var9, var16);
            this.method24688(var1, var3, var4, var23, var11, false, var5, var6, var22, var16);
            var15 = true;
         }
      }

      var8.setSeed(var9);
      List var24 = !this.field32375 ? var2.method22619(var3, (Direction)null, var8) : var2.method22628(var3, (Direction)null, var8, var12);
      if (!var24.isEmpty()) {
         var24 = Class8464.method29766(var24, var1, var3, var4, (Direction)null, var17, var9, var16);
         this.method24688(var1, var3, var4, -1, var11, true, var5, var6, var24, var16);
         var15 = true;
      }

      return var15;
   }

   private void method24685(IBlockDisplayReader var1, BlockState var2, BlockPos var3, MatrixStack var4, IVertexBuilder var5, List<Class8557> var6, int var7, Class8391 var8) {
      float[] var11 = var8.method29414();
      BitSet var12 = var8.method29415();
      Class9529 var13 = var8.method29416();
      int var14 = var6.size();

      for (int var15 = 0; var15 < var14; var15++) {
         Class8557 var16 = (Class8557)var6.get(var15);
         this.method24687(var1, var2, var3, var16.method30511(), var16.method30514(), var11, var12);
         var13.method36827(var1, var2, var3, var16.method30514(), var11, var12, var16.method30515());
         if (var16.method30516().field9353) {
            var13.method36826();
         }

         this.method24686(
            var1,
            var2,
            var3,
            var5,
            var4.getLast(),
            var16,
            Class9529.method36830(var13)[0],
            Class9529.method36830(var13)[1],
            Class9529.method36830(var13)[2],
            Class9529.method36830(var13)[3],
            Class9529.method36831(var13)[0],
            Class9529.method36831(var13)[1],
            Class9529.method36831(var13)[2],
            Class9529.method36831(var13)[3],
            var7,
            var8
         );
      }
   }

   private void method24686(
      IBlockDisplayReader var1,
      BlockState var2,
      BlockPos var3,
      IVertexBuilder var4,
      Class8892 var5,
      Class8557 var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      Class8391 var16
   ) {
      int var19 = Class9680.method37850(var6, var2, var1, var3, var16);
      float var20;
      float var21;
      float var22;
      if (!var6.method30512() && var19 == -1) {
         var20 = 1.0F;
         var21 = 1.0F;
         var22 = 1.0F;
      } else {
         int var23 = var19 == -1 ? this.field32369.method29465(var2, var1, var3, var6.method30513()) : var19;
         var20 = (float)(var23 >> 16 & 0xFF) / 255.0F;
         var21 = (float)(var23 >> 8 & 0xFF) / 255.0F;
         var22 = (float)(var23 & 0xFF) / 255.0F;
      }

      var4.method17038(var5, var6, var4.method17047(var7, var8, var9, var10), var20, var21, var22, var4.method17048(var11, var12, var13, var14), var15, true);
   }

   private void method24687(IBlockDisplayReader var1, BlockState var2, BlockPos var3, int[] var4, Direction var5, float[] var6, BitSet var7) {
      float var10 = 32.0F;
      float var11 = 32.0F;
      float var12 = 32.0F;
      float var13 = -32.0F;
      float var14 = -32.0F;
      float var15 = -32.0F;
      int var16 = var4.length / 4;

      for (int var17 = 0; var17 < 4; var17++) {
         float var18 = Float.intBitsToFloat(var4[var17 * var16]);
         float var19 = Float.intBitsToFloat(var4[var17 * var16 + 1]);
         float var20 = Float.intBitsToFloat(var4[var17 * var16 + 2]);
         var10 = Math.min(var10, var18);
         var11 = Math.min(var11, var19);
         var12 = Math.min(var12, var20);
         var13 = Math.max(var13, var18);
         var14 = Math.max(var14, var19);
         var15 = Math.max(var15, var20);
      }

      if (var6 != null) {
         var6[Direction.WEST.getIndex()] = var10;
         var6[Direction.EAST.getIndex()] = var13;
         var6[Direction.DOWN.getIndex()] = var11;
         var6[Direction.UP.getIndex()] = var14;
         var6[Direction.NORTH.getIndex()] = var12;
         var6[Direction.SOUTH.getIndex()] = var15;
         int var21 = Direction.VALUES.length;
         var6[Direction.WEST.getIndex() + var21] = 1.0F - var10;
         var6[Direction.EAST.getIndex() + var21] = 1.0F - var13;
         var6[Direction.DOWN.getIndex() + var21] = 1.0F - var11;
         var6[Direction.UP.getIndex() + var21] = 1.0F - var14;
         var6[Direction.NORTH.getIndex() + var21] = 1.0F - var12;
         var6[Direction.SOUTH.getIndex() + var21] = 1.0F - var15;
      }

      float var22 = 1.0E-4F;
      float var23 = 0.9999F;
      switch (Class7009.field30296[var5.ordinal()]) {
         case 1:
            var7.set(1, var10 >= 1.0E-4F || var12 >= 1.0E-4F || var13 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var11 == var14 && (var11 < 1.0E-4F || var2.method23456(var1, var3)));
            break;
         case 2:
            var7.set(1, var10 >= 1.0E-4F || var12 >= 1.0E-4F || var13 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var11 == var14 && (var14 > 0.9999F || var2.method23456(var1, var3)));
            break;
         case 3:
            var7.set(1, var10 >= 1.0E-4F || var11 >= 1.0E-4F || var13 <= 0.9999F || var14 <= 0.9999F);
            var7.set(0, var12 == var15 && (var12 < 1.0E-4F || var2.method23456(var1, var3)));
            break;
         case 4:
            var7.set(1, var10 >= 1.0E-4F || var11 >= 1.0E-4F || var13 <= 0.9999F || var14 <= 0.9999F);
            var7.set(0, var12 == var15 && (var15 > 0.9999F || var2.method23456(var1, var3)));
            break;
         case 5:
            var7.set(1, var11 >= 1.0E-4F || var12 >= 1.0E-4F || var14 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var10 == var13 && (var10 < 1.0E-4F || var2.method23456(var1, var3)));
            break;
         case 6:
            var7.set(1, var11 >= 1.0E-4F || var12 >= 1.0E-4F || var14 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var10 == var13 && (var13 > 0.9999F || var2.method23456(var1, var3)));
      }
   }

   private void method24688(
           IBlockDisplayReader var1, BlockState var2, BlockPos var3, int var4, int var5, boolean var6, MatrixStack var7, IVertexBuilder var8, List<Class8557> var9, Class8391 var10
   ) {
      BitSet var13 = var10.method29415();
      int var14 = var9.size();

      for (int var15 = 0; var15 < var14; var15++) {
         Class8557 var16 = (Class8557)var9.get(var15);
         if (var6) {
            this.method24687(var1, var2, var3, var16.method30511(), var16.method30514(), (float[])null, var13);
            BlockPos var17 = !var13.get(0) ? var3 : var3.offset(var16.method30514());
            var4 = WorldRenderer.method945(var1, var2, var17);
         }

         if (var16.method30516().field9353) {
            var4 = LightTexture.MAX_BRIGHTNESS;
         }

         float var18 = var1.method6877(var16.method30514(), var16.method30515());
         this.method24686(var1, var2, var3, var8, var7.getLast(), var16, var18, var18, var18, var18, var4, var4, var4, var4, var5, var10);
      }
   }

   public void method24689(Class8892 var1, IVertexBuilder var2, BlockState var3, IBakedModel var4, float var5, float var6, float var7, int var8, int var9) {
      this.method24690(var1, var2, var3, var4, var5, var6, var7, var8, var9, Class7181.field30863);
   }

   public void method24690(
           Class8892 var1, IVertexBuilder var2, BlockState var3, IBakedModel var4, float var5, float var6, float var7, int var8, int var9, Class7180 var10
   ) {
      Random var13 = new Random();
      long var14 = 42L;

      for (Direction var19 : Direction.VALUES) {
         var13.setSeed(42L);
         if (!this.field32375) {
            method24691(var1, var2, var5, var6, var7, var4.method22619(var3, var19, var13), var8, var9);
         } else {
            method24691(var1, var2, var5, var6, var7, var4.method22628(var3, var19, var13, var10), var8, var9);
         }
      }

      var13.setSeed(42L);
      if (!this.field32375) {
         method24691(var1, var2, var5, var6, var7, var4.method22619(var3, (Direction)null, var13), var8, var9);
      } else {
         method24691(var1, var2, var5, var6, var7, var4.method22628(var3, (Direction)null, var13, var10), var8, var9);
      }
   }

   private static void method24691(Class8892 var0, IVertexBuilder var1, float var2, float var3, float var4, List<Class8557> var5, int var6, int var7) {
      boolean var10 = EmissiveTextures.isActive();

      for (Class8557 var12 : var5) {
         if (var10) {
            var12 = EmissiveTextures.method30593(var12);
            if (var12 == null) {
               continue;
            }
         }

         float var13;
         float var14;
         float var15;
         if (!var12.method30512()) {
            var13 = 1.0F;
            var14 = 1.0F;
            var15 = 1.0F;
         } else {
            var13 = MathHelper.clamp(var2, 0.0F, 1.0F);
            var14 = MathHelper.clamp(var3, 0.0F, 1.0F);
            var15 = MathHelper.clamp(var4, 0.0F, 1.0F);
         }

         var1.method17036(var0, var12, var13, var14, var15, var6, var7);
      }
   }

   public static void method24692() {
      field32370.get().method22662();
   }

   public static void method24693() {
      field32370.get().method22663();
   }

   public static float method24694(float var0) {
      return var0 != 0.2F ? var0 : field32371;
   }

   public static void method24695() {
      field32371 = 1.0F - Config.method26851() * 0.8F;
      field32372 = Config.isShaders() && Shaders.method33004();
   }

   public static boolean method24696() {
      return field32372;
   }

   private void method24697(
      IBlockDisplayReader var1,
      IBakedModel var2,
      BlockState var3,
      BlockPos var4,
      MatrixStack var5,
      IVertexBuilder var6,
      int var7,
      boolean var8,
      Random var9,
      long var10,
      Class8391 var12,
      boolean var13,
      Vector3d var14
   ) {
      if (var12.method29437()) {
         for (int var17 = 0; var17 < field32374.length; var17++) {
            RenderType var18 = field32374[var17];
            Class9585 var19 = var12.method29436(var18);
            if (var19.method37213() > 0) {
               RegionRenderCacheBuilder var20 = var12.method29434();
               if (var20 != null) {
                  BufferBuilder var21 = var20.getBuilder(var18);
                  if (!var21.method17074()) {
                     var21.begin(7, DefaultVertexFormats.field43334);
                  }

                  for (int var22 = 0; var22 < var19.method37213(); var22++) {
                     Class8557 var23 = var19.method37214(var22);
                     List var24 = var19.method37216(var23);
                     BlockState var25 = var19.method37215(var22);
                     if (var23.method30532() != null) {
                        var19.method37212(var23.method30532(), var25);
                     }

                     var12.reset(var25, var4);
                     if (!var13) {
                        int var26 = WorldRenderer.method945(var1, var25, var4.offset(var23.method30514()));
                        this.method24688(var1, var25, var4, var26, var7, false, var5, var21, var24, var12);
                     } else {
                        this.method24685(var1, var25, var4, var5, var21, var24, var7, var12);
                     }
                  }
               }

               var19.method37217();
            }
         }
      }

      if (Config.method26898() && !var12.method29419() && Class7880.method26421(var1, var3, var4)) {
         IBakedModel var27 = Class7880.method26419();
         BlockState var28 = Class7880.method26420();
         var5.translate(-var14.x, -var14.y, -var14.z);
         this.method24679(var1, var27, var28, var4, var5, var6, var8, var9, var10, var7);
      }
   }

   // $VF: synthetic method
   public static Class4049 method24699() {
      return field32373;
   }
}
