package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

public class Class220<T extends LivingEntity, M extends Class2827<T>> extends Class219<T, M> {
   private static final ResourceLocation field864 = new ResourceLocation("textures/entity/elytra.png");
   private final Class2863<T> field865 = new Class2863<T>();

   public Class220(Class5714<T, M> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.getItemStackFromSlot(EquipmentSlotType.CHEST);
      if (this.method827(var13, (T)var4)) {
         ResourceLocation var14;
         if (!(var4 instanceof AbstractClientPlayerEntity)) {
            var14 = this.method828(var13, (T)var4);
            if (Config.method26953()) {
               var14 = Class7992.method27271(var13, var14);
            }
         } else {
            AbstractClientPlayerEntity var15 = (AbstractClientPlayerEntity)var4;
            if (var15.method5373() && var15.method5374() != null) {
               var14 = var15.method5374();
            } else if (var15.method5382() && var15.method5368() && var15.method5372() != null && var15.method2962(Class2318.field15879)) {
               var14 = var15.method5372();
            } else {
               var14 = this.method828(var13, (T)var4);
               if (Config.method26953()) {
                  var14 = Class7992.method27271(var13, var14);
               }
            }
         }

         var1.push();
         var1.translate(0.0, 0.0, 0.125);
         this.method825().copyModelAttributesTo(this.field865);
         this.field865.setRotationAngles((T)var4, var5, var6, var8, var9, var10);
         IVertexBuilder var16 = ItemRenderer.method782(var2, RenderType.method14308(var14), false, var13.method32159());
         this.field865.render(var1, var16, var3, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
         var1.pop();
      }
   }

   public boolean method827(ItemStack var1, T var2) {
      return var1.getItem() == Items.ELYTRA;
   }

   public ResourceLocation method828(ItemStack var1, T var2) {
      return field864;
   }
}
