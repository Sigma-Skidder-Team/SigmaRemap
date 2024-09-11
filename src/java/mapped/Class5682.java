package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.ResourceLocation;

public class Class5682 extends Class5651<SquidEntity, Class2879<SquidEntity>> {
   private static final ResourceLocation field25047 = new ResourceLocation("textures/entity/squid.png");

   public Class5682(EntityRendererManager var1) {
      super(var1, new Class2879<SquidEntity>(), 0.7F);
   }

   public ResourceLocation method17843(SquidEntity var1) {
      return field25047;
   }

   public void method17842(SquidEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      float var8 = MathHelper.lerp(var5, var1.prevSquidPitch, var1.squidPitch);
      float var9 = MathHelper.lerp(var5, var1.prevSquidYaw, var1.squidYaw);
      var2.translate(0.0, 0.5, 0.0);
      var2.rotate(Vector3f.YP.rotationDegrees(180.0F - var4));
      var2.rotate(Vector3f.field32898.rotationDegrees(var8));
      var2.rotate(Vector3f.YP.rotationDegrees(var9));
      var2.translate(0.0, -1.2F, 0.0);
   }

   public float method17871(SquidEntity var1, float var2) {
      return MathHelper.lerp(var2, var1.lastTentacleAngle, var1.tentacleAngle);
   }
}
