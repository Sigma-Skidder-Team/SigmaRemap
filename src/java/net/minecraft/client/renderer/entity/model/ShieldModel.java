package net.minecraft.client.renderer.entity.model;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.module.impl.player.OldHitting;
import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.Class2828;
import mapped.IVertexBuilder;
import mapped.ModelRenderer;
import mapped.RenderType;

public class ShieldModel extends Class2828 {
   private final ModelRenderer plate;
   private final ModelRenderer handle;

   public ShieldModel() {
      super(RenderType::getEntitySolid);
      this.textureWidth = 64;
      this.textureHeight = 64;
      this.plate = new ModelRenderer(this, 0, 0);
      this.plate.addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F, 0.0F);
      this.handle = new ModelRenderer(this, 26, 0);
      this.handle.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F, 0.0F);
   }

   public ModelRenderer getPlate() {
      return this.plate;
   }

   public ModelRenderer getHandle() {
      return this.handle;
   }

   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (!Client.getInstance().moduleManager.getModuleByClass(OldHitting.class).enabled) {
         this.plate.render(var1, var2, var3, var4, var5, var6, var7, var8);
         this.handle.render(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }
}
