package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;

public class Class5723 extends Class5715<EnderCrystalEntity> {
   private static final ResourceLocation field25122 = new ResourceLocation("textures/entity/end_crystal/end_crystal.png");
   private static final RenderType field25123 = RenderType.getEntityCutoutNoCull(field25122);
   private static final float field25124 = (float)Math.sin(Math.PI / 4);
   private final Class7219 field25125;
   private final Class7219 field25126;
   private final Class7219 field25127;

   public Class5723(EntityRendererManager var1) {
      super(var1);
      this.field25098 = 0.5F;
      this.field25126 = new Class7219(64, 32, 0, 0);
      this.field25126.method22673(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field25125 = new Class7219(64, 32, 32, 0);
      this.field25125.method22673(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field25127 = new Class7219(64, 32, 0, 16);
      this.field25127.method22673(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F);
   }

   public void method17853(EnderCrystalEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      float var9 = method17909(var1, var3);
      float var10 = ((float)var1.field5523 + var3) * 3.0F;
      Class5422 var11 = var5.method25597(field25123);
      var4.push();
      var4.method35292(2.0F, 2.0F, 2.0F);
      var4.translate(0.0, -0.5, 0.0);
      int var12 = Class213.field798;
      if (var1.method4145()) {
         this.field25127.method22680(var4, var11, var6, var12);
      }

      var4.rotate(Vector3f.YP.rotationDegrees(var10));
      var4.translate(0.0, (double)(1.5F + var9 / 2.0F), 0.0);
      var4.rotate(new Quaternion(new Vector3f(field25124, 0.0F, field25124), 60.0F, true));
      this.field25126.method22680(var4, var11, var6, var12);
      float var13 = 0.875F;
      var4.method35292(0.875F, 0.875F, 0.875F);
      var4.rotate(new Quaternion(new Vector3f(field25124, 0.0F, field25124), 60.0F, true));
      var4.rotate(Vector3f.YP.rotationDegrees(var10));
      this.field25126.method22680(var4, var11, var6, var12);
      var4.method35292(0.875F, 0.875F, 0.875F);
      var4.rotate(new Quaternion(new Vector3f(field25124, 0.0F, field25124), 60.0F, true));
      var4.rotate(Vector3f.YP.rotationDegrees(var10));
      this.field25125.method22680(var4, var11, var6, var12);
      var4.pop();
      var4.pop();
      BlockPos var14 = var1.method4143();
      if (var14 != null) {
         float var15 = (float)var14.getX() + 0.5F;
         float var16 = (float)var14.getY() + 0.5F;
         float var17 = (float)var14.getZ() + 0.5F;
         float var18 = (float)((double)var15 - var1.getPosX());
         float var19 = (float)((double)var16 - var1.getPosY());
         float var20 = (float)((double)var17 - var1.getPosZ());
         var4.translate((double)var18, (double)var19, (double)var20);
         Class5718.method17906(-var18, -var19 + var9, -var20, var3, var1.field5523, var4, var5, var6);
      }

      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public static float method17909(EnderCrystalEntity var0, float var1) {
      float var4 = (float)var0.field5523 + var1;
      float var5 = MathHelper.sin(var4 * 0.2F) / 2.0F + 0.5F;
      var5 = (var5 * var5 + var5) * 0.4F;
      return var5 - 1.4F;
   }

   public ResourceLocation method17843(EnderCrystalEntity var1) {
      return field25122;
   }

   public boolean method17854(EnderCrystalEntity var1, Class7647 var2, double var3, double var5, double var7) {
      return super.method17854(var1, var2, var3, var5, var7) || var1.method4143() != null;
   }
}
