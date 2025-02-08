package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.optifine.Config;

import java.util.Map;
import java.util.Set;

public class Class222 extends Class219 {
   private PlayerRenderer field867 = null;

   public Class222(PlayerRenderer var1) {
      super(var1);
      this.field867 = var1;
   }

   @Override
   public void method820(MatrixStack var1, IRenderTypeBuffer var2, int var3, Entity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.method829(var4, var1, var2, var3, OverlayTexture.NO_OVERLAY);
   }

   public void method829(Entity var1, MatrixStack var2, IRenderTypeBuffer var3, int var4, int var5) {
      if (Config.method26914() && var1 instanceof AbstractClientPlayerEntity) {
         AbstractClientPlayerEntity var8 = (AbstractClientPlayerEntity)var1;
         BipedModel var9 = this.field867.getEntityModel();
         Class7749.method25667(var9, var8, var2, var3, var4, var5);
      }
   }

   public static void method830(Map var0) {
      Set var3 = var0.keySet();
      boolean var4 = false;

      for (Object var6 : var3) {
         Object var7 = var0.get(var6);
         if (var7 instanceof PlayerRenderer) {
            PlayerRenderer var8 = (PlayerRenderer)var7;
            var8.addLayer(new Class222(var8));
            var4 = true;
         }
      }

      if (!var4) {
         Config.method26811("PlayerItemsLayer not registered");
      }
   }
}
