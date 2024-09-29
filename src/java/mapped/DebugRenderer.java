package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Optional;
import java.util.function.Predicate;

public class DebugRenderer {
   private static String[] field34465;
   public final Class5135 field34466 = new Class5135();
   public final Class5119 field34467;
   public final Class5119 field34468;
   public final Class5119 field34469;
   public final Class5119 field34470;
   public final Class5119 field34471;
   public final Class5131 field34472;
   public final Class5120 field34473;
   public final Class5119 field34474;
   public final Class5119 field34475;
   public final Class5119 field34476;
   public final Class5119 field34477;
   public final Class5133 field34478;
   public final Class5122 field34479;
   public final Class5125 field34480;
   public final Class5128 field34481;
   public final Class5123 field34482;
   public final Class5136 field34483;
   private boolean field34484;

   public DebugRenderer(Minecraft var1) {
      this.field34467 = new Class5129(var1);
      this.field34468 = new Class5127(var1);
      this.field34469 = new Class5130(var1);
      this.field34470 = new Class5121(var1);
      this.field34471 = new Class5132(var1);
      this.field34472 = new Class5131();
      this.field34473 = new Class5120(var1);
      this.field34474 = new Class5124(var1);
      this.field34475 = new Class5134();
      this.field34476 = new Class5118(var1);
      this.field34477 = new Class5126(var1);
      this.field34478 = new Class5133(var1);
      this.field34479 = new Class5122();
      this.field34480 = new Class5125(var1);
      this.field34481 = new Class5128(var1);
      this.field34482 = new Class5123(var1);
      this.field34483 = new Class5136();
   }

   public void method27451() {
      this.field34466.method15814();
      this.field34467.method15814();
      this.field34468.method15814();
      this.field34469.method15814();
      this.field34470.method15814();
      this.field34471.method15814();
      this.field34472.method15814();
      this.field34473.method15814();
      this.field34474.method15814();
      this.field34475.method15814();
      this.field34476.method15814();
      this.field34477.method15814();
      this.field34478.method15814();
      this.field34479.method15814();
      this.field34480.method15814();
      this.field34481.method15814();
      this.field34482.method15814();
      this.field34483.method15814();
   }

   public boolean method27452() {
      this.field34484 = !this.field34484;
      return this.field34484;
   }

   public void method27453(MatrixStack var1, Class7735 var2, double var3, double var5, double var7) {
      if (this.field34484 && !Minecraft.getInstance().isReducedDebug()) {
         this.field34468.method15813(var1, var2, var3, var5, var7);
      }

      this.field34483.method15813(var1, var2, var3, var5, var7);
   }

   public static Optional<Entity> method27454(Entity var0, int var1) {
      if (var0 != null) {
         Vector3d var4 = var0.getEyePosition(1.0F);
         Vector3d var5 = var0.getLook(1.0F).scale((double)var1);
         Vector3d var6 = var4.add(var5);
         AxisAlignedBB var7 = var0.getBoundingBox().expand(var5).method19664(1.0);
         int var8 = var1 * var1;
         Predicate<Entity> var9 = var0x -> !var0x.isSpectator() && var0x.canBeCollidedWith();
         EntityRayTraceResult var10 = ProjectileHelper.rayTraceEntities(var0, var4, var6, var7, var9, (double)var8);
         if (var10 != null) {
            return !(var4.squareDistanceTo(var10.getHitVec()) > (double)var8) ? Optional.<Entity>of(var10.getEntity()) : Optional.<Entity>empty();
         } else {
            return Optional.<Entity>empty();
         }
      } else {
         return Optional.<Entity>empty();
      }
   }

   public static void method27455(BlockPos var0, BlockPos var1, float var2, float var3, float var4, float var5) {
      ActiveRenderInfo var8 = Minecraft.getInstance().gameRenderer.getActiveRenderInfo();
      if (var8.method37510()) {
         Vector3d var9 = var8.getPos().method11345();
         AxisAlignedBB var10 = new AxisAlignedBB(var0, var1).offset(var9);
         method27457(var10, var2, var3, var4, var5);
      }
   }

   public static void method27456(BlockPos var0, float var1, float var2, float var3, float var4, float var5) {
      ActiveRenderInfo var8 = Minecraft.getInstance().gameRenderer.getActiveRenderInfo();
      if (var8.method37510()) {
         Vector3d var9 = var8.getPos().method11345();
         AxisAlignedBB var10 = new AxisAlignedBB(var0).offset(var9).method19664((double)var1);
         method27457(var10, var2, var3, var4, var5);
      }
   }

   public static void method27457(AxisAlignedBB var0, float var1, float var2, float var3, float var4) {
      method27458(var0.minX, var0.minY, var0.minZ, var0.maxX, var0.maxY, var0.maxZ, var1, var2, var3, var4);
   }

   public static void method27458(
      double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15
   ) {
      Tessellator var18 = Tessellator.getInstance();
      BufferBuilder var19 = var18.getBuffer();
      var19.begin(5, DefaultVertexFormats.POSITION_COLOR);
      WorldRenderer.method900(var19, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var18.draw();
   }

   public static void method27459(String var0, int var1, int var2, int var3, int var4) {
      method27460(var0, (double)var1 + 0.5, (double)var2 + 0.5, (double)var3 + 0.5, var4);
   }

   public static void method27460(String var0, double var1, double var3, double var5, int var7) {
      method27461(var0, var1, var3, var5, var7, 0.02F);
   }

   public static void method27461(String var0, double var1, double var3, double var5, int var7, float var8) {
      method27462(var0, var1, var3, var5, var7, var8, true, 0.0F, false);
   }

   public static void method27462(String var0, double var1, double var3, double var5, int var7, float var8, boolean var9, float var10, boolean var11) {
      Minecraft var14 = Minecraft.getInstance();
      ActiveRenderInfo var15 = var14.gameRenderer.getActiveRenderInfo();
      if (var15.method37510() && var14.getRenderManager().options != null) {
         FontRenderer var16 = var14.fontRenderer;
         double var17 = var15.getPos().x;
         double var19 = var15.getPos().y;
         double var21 = var15.getPos().z;
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(var1 - var17), (float)(var3 - var19) + 0.07F, (float)(var5 - var21));
         RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
         RenderSystem.multMatrix(new Matrix4f(var15.getRotation()));
         RenderSystem.scalef(var8, -var8, var8);
         RenderSystem.enableTexture();
         if (!var11) {
            RenderSystem.enableDepthTest();
         } else {
            RenderSystem.disableDepthTest();
         }

         RenderSystem.depthMask(true);
         RenderSystem.scalef(-1.0F, 1.0F, 1.0F);
         float var23 = !var9 ? 0.0F : (float)(-var16.getStringWidth(var0)) / 2.0F;
         var23 -= var10 / var8;
         RenderSystem.enableAlphaTest();
         Class7735 var24 = Class7733.method25595(Tessellator.getInstance().getBuffer());
         var16.method38810(var0, var23, 0.0F, var7, false, Class6979.method21542().method21548(), var24, var11, 0, 15728880);
         var24.method25602();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableDepthTest();
         RenderSystem.popMatrix();
      }
   }
}
