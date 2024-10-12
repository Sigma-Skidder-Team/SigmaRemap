package mapped;

import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;

import java.util.HashMap;
import java.util.UUID;

public class Class5743<T extends Entity> extends LivingRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> {
   public static HashMap<UUID, ResourceLocation> field25166 = new HashMap<UUID, ResourceLocation>();

   public Class5743(EntityRendererManager var1) {
      this(var1, false);
   }

   public Class5743(EntityRendererManager var1, boolean var2) {
      super(var1, new PlayerModel<AbstractClientPlayerEntity>(0.0F, var2), 0.5F);
      this.addLayer(new Class235<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>>(this));
   }

   public void method17924(AbstractClientPlayerEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6, float var7, float var8) {
      BipedModel var11 = this.mainModel;
      var11.setVisible(false);
      var11.bipedHead.showModel = true;
      float var12 = var1.rotationYawHead;
      float var13 = var1.rotationPitch;
      float var14 = MathUtils.lerp(var8, 0.15, 0.84, 0.34, 1.0);
      float var15 = ((float) Minecraft.getInstance().player.ticksExisted + Minecraft.getInstance().getRenderPartialTicks()) * 3.0F + var14 * 160.0F;
      var1.rotationYawHead = var15;
      var1.rotationPitch = -10.0F;
      this.field25096 = var7;
      super.render(var1, var2, 1.0F, var4, var5, var6);
      var1.rotationYawHead = var12;
      var1.rotationPitch = var13;
   }

   public Vector3d getRenderOffset(AbstractClientPlayerEntity var1, float var2) {
      return super.getRenderOffset(var1, var2);
   }

   public ResourceLocation method17843(AbstractClientPlayerEntity var1) {
      boolean var4 = field25166.containsKey(var1.getGameProfile().getId()) && field25166.get(var1.getGameProfile().getId()).equals(new ResourceLocation(""));
      if (!var4 && field25166.containsKey(var1.getGameProfile().getId())) {
         return field25166.get(var1.getGameProfile().getId());
      } else {
         if (!var1.method5368() && !var4) {
            field25166.put(var1.getGameProfile().getId(), new ResourceLocation(""));
            Minecraft.getInstance().getSkinManager().method38loadProfileTextures346(var1.getGameProfile(), (var1x, var2, var3) -> {
               if (var1x == Type.SKIN) {
                  field25166.put(var1.getGameProfile().getId(), var2);
               }
            }, true);
         }

         return var1.method5371();
      }
   }
}
