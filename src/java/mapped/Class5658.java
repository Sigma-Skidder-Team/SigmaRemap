package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Vector3d;

public class Class5658 extends Class5651<Class1105, Class2820> {
   private static final ResourceLocation field25020 = new ResourceLocation("textures/entity/guardian.png");
   private static final ResourceLocation field25021 = new ResourceLocation("textures/entity/guardian_beam.png");
   private static final RenderType field25022 = RenderType.getEntityCutoutNoCull(field25021);

   public Class5658(EntityRendererManager var1) {
      this(var1, 0.5F);
   }

   public Class5658(EntityRendererManager var1, float var2) {
      super(var1, new Class2820(), var2);
   }

   public boolean method17854(Class1105 var1, Class7647 var2, double var3, double var5, double var7) {
      if (!super.method17854(var1, var2, var3, var5, var7)) {
         if (var1.method5305()) {
            LivingEntity var11 = var1.method5306();
            if (var11 != null) {
               Vector3d var12 = this.method17861(var11, (double)var11.getHeight() * 0.5, 1.0F);
               Vector3d var13 = this.method17861(var1, (double)var1.getEyeHeight(), 1.0F);
               return var2.method25122(
                  new AxisAlignedBB(var13.x, var13.y, var13.z, var12.x, var12.y, var12.z)
               );
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private Vector3d method17861(LivingEntity var1, double var2, float var4) {
      double var7 = MathHelper.lerp((double)var4, var1.lastTickPosX, var1.getPosX());
      double var9 = MathHelper.lerp((double)var4, var1.lastTickPosY, var1.getPosY()) + var2;
      double var11 = MathHelper.lerp((double)var4, var1.lastTickPosZ, var1.getPosZ());
      return new Vector3d(var7, var9, var11);
   }

   public void render(Class1105 entity, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      super.render(entity, var2, var3, var4, var5, var6);
      LivingEntity var9 = entity.method5306();
      if (var9 != null) {
         float var10 = entity.method5310(var3);
         float var11 = (float) entity.world.getGameTime() + var3;
         float var12 = var11 * 0.5F % 1.0F;
         float var13 = entity.getEyeHeight();
         var4.push();
         var4.translate(0.0, (double)var13, 0.0);
         Vector3d var14 = this.method17861(var9, (double)var9.getHeight() * 0.5, var3);
         Vector3d var15 = this.method17861(entity, (double)var13, var3);
         Vector3d var16 = var14.subtract(var15);
         float var17 = (float)(var16.length() + 1.0);
         var16 = var16.method11333();
         float var18 = (float)Math.acos(var16.y);
         float var19 = (float)Math.atan2(var16.z, var16.x);
         var4.rotate(Vector3f.YP.rotationDegrees(((float) (Math.PI / 2) - var19) * (180.0F / (float)Math.PI)));
         var4.rotate(Vector3f.XP.rotationDegrees(var18 * (180.0F / (float)Math.PI)));
         boolean var20 = true;
         float var21 = var11 * 0.05F * -1.5F;
         float var22 = var10 * var10;
         int var23 = 64 + (int)(var22 * 191.0F);
         int var24 = 32 + (int)(var22 * 191.0F);
         int var25 = 128 - (int)(var22 * 64.0F);
         float var26 = 0.2F;
         float var27 = 0.282F;
         float var28 = MathHelper.cos(var21 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var29 = MathHelper.sin(var21 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var30 = MathHelper.cos(var21 + (float) (Math.PI / 4)) * 0.282F;
         float var31 = MathHelper.sin(var21 + (float) (Math.PI / 4)) * 0.282F;
         float var32 = MathHelper.cos(var21 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var33 = MathHelper.sin(var21 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var34 = MathHelper.cos(var21 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var35 = MathHelper.sin(var21 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var36 = MathHelper.cos(var21 + (float) Math.PI) * 0.2F;
         float var37 = MathHelper.sin(var21 + (float) Math.PI) * 0.2F;
         float var38 = MathHelper.cos(var21 + 0.0F) * 0.2F;
         float var39 = MathHelper.sin(var21 + 0.0F) * 0.2F;
         float var40 = MathHelper.cos(var21 + (float) (Math.PI / 2)) * 0.2F;
         float var41 = MathHelper.sin(var21 + (float) (Math.PI / 2)) * 0.2F;
         float var42 = MathHelper.cos(var21 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var43 = MathHelper.sin(var21 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var44 = 0.0F;
         float var45 = 0.4999F;
         float var46 = -1.0F + var12;
         float var47 = var17 * 2.5F + var46;
         IVertexBuilder var48 = var5.method25597(field25022);
         Class8892 var49 = var4.getLast();
         Matrix4f var50 = var49.getMatrix();
         Matrix3f var51 = var49.method32362();
         method17862(var48, var50, var51, var36, var17, var37, var23, var24, var25, 0.4999F, var47);
         method17862(var48, var50, var51, var36, 0.0F, var37, var23, var24, var25, 0.4999F, var46);
         method17862(var48, var50, var51, var38, 0.0F, var39, var23, var24, var25, 0.0F, var46);
         method17862(var48, var50, var51, var38, var17, var39, var23, var24, var25, 0.0F, var47);
         method17862(var48, var50, var51, var40, var17, var41, var23, var24, var25, 0.4999F, var47);
         method17862(var48, var50, var51, var40, 0.0F, var41, var23, var24, var25, 0.4999F, var46);
         method17862(var48, var50, var51, var42, 0.0F, var43, var23, var24, var25, 0.0F, var46);
         method17862(var48, var50, var51, var42, var17, var43, var23, var24, var25, 0.0F, var47);
         float var52 = 0.0F;
         if (entity.ticksExisted % 2 == 0) {
            var52 = 0.5F;
         }

         method17862(var48, var50, var51, var28, var17, var29, var23, var24, var25, 0.5F, var52 + 0.5F);
         method17862(var48, var50, var51, var30, var17, var31, var23, var24, var25, 1.0F, var52 + 0.5F);
         method17862(var48, var50, var51, var34, var17, var35, var23, var24, var25, 1.0F, var52);
         method17862(var48, var50, var51, var32, var17, var33, var23, var24, var25, 0.5F, var52);
         var4.pop();
      }
   }

   private static void method17862(
           IVertexBuilder var0, Matrix4f var1, Matrix3f var2, float var3, float var4, float var5, int var6, int var7, int var8, float var9, float var10
   ) {
      var0.pos(var1, var3, var4, var5)
         .color(var6, var7, var8, 255)
         .tex(var9, var10)
         .method17035(OverlayTexture.NO_OVERLAY)
         .method17034(15728880)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   public ResourceLocation method17843(Class1105 var1) {
      return field25020;
   }
}
