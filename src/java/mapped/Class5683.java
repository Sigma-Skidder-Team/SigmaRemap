package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class Class5683 extends Class5651<ShulkerEntity, Class2887<ShulkerEntity>> {
   public static final ResourceLocation field25048 = new ResourceLocation("textures/" +Class8624.field38782.method26197().getPath()  + ".png");
   public static final ResourceLocation[] field25049 = Class8624.field38783
      .stream()
      .<ResourceLocation>map(var0 -> new ResourceLocation("textures/" + var0.method26197().getPath() + ".png"))
      .<ResourceLocation>toArray(ResourceLocation[]::new);

   public Class5683(EntityRendererManager var1) {
      super(var1, new Class2887<ShulkerEntity>(), 0.0F);
      this.addLayer(new Class246(this));
   }

   public Vector3d getRenderOffset(ShulkerEntity var1, float var2) {
      int var5 = var1.method4854();
      if (var5 > 0 && var1.method4856()) {
         BlockPos var6 = var1.method4849();
         BlockPos var7 = var1.method4855();
         double var8 = (double)((float)var5 - var2) / 6.0;
         var8 *= var8;
         double var10 = (double)(var6.getX() - var7.getX()) * var8;
         double var12 = (double)(var6.getY() - var7.getY()) * var8;
         double var14 = (double)(var6.getZ() - var7.getZ()) * var8;
         return new Vector3d(-var10, -var12, -var14);
      } else {
         return super.getRenderOffset(var1, var2);
      }
   }

   public boolean method17854(ShulkerEntity var1, Class7647 var2, double var3, double var5, double var7) {
      if (!super.method17854(var1, var2, var3, var5, var7)) {
         if (var1.method4854() > 0 && var1.method4856()) {
            Vector3d var11 = Vector3d.copy(var1.method4849());
            Vector3d var12 = Vector3d.copy(var1.method4855());
            if (var2.method25122(new AxisAlignedBB(var12.x, var12.y, var12.z, var11.x, var11.y, var11.z))) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public ResourceLocation method17843(ShulkerEntity var1) {
      return var1.method4857() != null ? field25049[var1.method4857().method309()] : field25048;
   }

   public void method17842(ShulkerEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4 + 180.0F, var5);
      var2.translate(0.0, 0.5, 0.0);
      var2.rotate(var1.method4848().getOpposite().method532());
      var2.translate(0.0, -0.5, 0.0);
   }
}
