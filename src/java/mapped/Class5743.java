package mapped;

import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;

import java.util.HashMap;
import java.util.UUID;

public class Class5743<T extends Entity> extends Class5712<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>> {
   public static HashMap<UUID, ResourceLocation> field25166 = new HashMap<UUID, ResourceLocation>();

   public Class5743(EntityRendererManager var1) {
      this(var1, false);
   }

   public Class5743(EntityRendererManager var1, boolean var2) {
      super(var1, new Class2894<AbstractClientPlayerEntity>(0.0F, var2), 0.5F);
      this.method17880(new Class235<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>>(this));
   }

   public void method17924(AbstractClientPlayerEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6, float var7, float var8) {
      Class2797 var11 = this.field25086;
      var11.method11009(false);
      var11.field17432.field31039 = true;
      float var12 = var1.rotationYawHead;
      float var13 = var1.rotationPitch;
      float var14 = MathUtils.lerp(var8, 0.15, 0.84, 0.34, 1.0);
      float var15 = ((float) Minecraft.getInstance().player.ticksExisted + Minecraft.getInstance().getRenderPartialTicks()) * 3.0F + var14 * 160.0F;
      var1.rotationYawHead = var15;
      var1.rotationPitch = -10.0F;
      this.field25096 = var7;
      super.method17853(var1, var2, 1.0F, var4, var5, var6);
      var1.rotationYawHead = var12;
      var1.rotationPitch = var13;
   }

   public Vector3d method17867(AbstractClientPlayerEntity var1, float var2) {
      return super.method17867(var1, var2);
   }

   public ResourceLocation method17843(AbstractClientPlayerEntity var1) {
      boolean var4 = field25166.containsKey(var1.getGameProfile().getId()) && field25166.get(var1.getGameProfile().getId()).equals(new ResourceLocation(""));
      if (!var4 && field25166.containsKey(var1.getGameProfile().getId())) {
         return field25166.get(var1.getGameProfile().getId());
      } else {
         if (!var1.method5368() && !var4) {
            field25166.put(var1.getGameProfile().getId(), new ResourceLocation(""));
            Minecraft.getInstance().getSkinManager().method38346(var1.getGameProfile(), (var1x, var2, var3) -> {
               if (var1x == Type.SKIN) {
                  field25166.put(var1.getGameProfile().getId(), var2);
               }
            }, true);
         }

         return var1.method5371();
      }
   }
}
