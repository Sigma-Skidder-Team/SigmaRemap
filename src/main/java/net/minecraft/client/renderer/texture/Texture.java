package net.minecraft.client.renderer.texture;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.Class9336;
import mapped.Class9732;
import mapped.IResourceManager;
import mapped.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class Texture implements AutoCloseable {
   public int field1125 = -1;
   public boolean field1126;
   public boolean field1127;
   public Class9732 field1128;
   private boolean field1129;
   private boolean field1130;
   private boolean field1131;

   public void method1130(boolean var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!this.field1129 || this.field1126 != var1 || this.field1127 != var2) {
         this.field1129 = true;
         this.field1126 = var1;
         this.field1127 = var2;
         int var6;
         int var7;
         if (!var1) {
            int var5 = Config.method26801();
            var6 = !var2 ? 9728 : var5;
            var7 = 9728;
         } else {
            var6 = !var2 ? 9729 : 9987;
            var7 = 9729;
         }

         GlStateManager.bindTexture(this.getGlTextureId());
         GlStateManager.texParameter(3553, 10241, var6);
         GlStateManager.texParameter(3553, 10240, var7);
      }
   }

   public int getGlTextureId() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (this.field1125 == -1) {
         this.field1125 = TextureUtil.generateTextureId();
      }

      return this.field1125;
   }

   public void method1132() {
      if (RenderSystem.isOnRenderThread()) {
         if (this.field1125 != -1) {
            Class9336.method35310(this, this.field1125);
            this.field1129 = false;
            TextureUtil.releaseTextureId(this.field1125);
            this.field1125 = -1;
         }
      } else {
         RenderSystem.recordRenderCall(() -> {
            Class9336.method35310(this, this.field1125);
            this.field1129 = false;
            if (this.field1125 != -1) {
               TextureUtil.releaseTextureId(this.field1125);
               this.field1125 = -1;
            }
         });
      }
   }

   public abstract void method1090(IResourceManager var1) throws IOException;

   public void method1133() {
      if (RenderSystem.isOnRenderThreadOrInit()) {
         GlStateManager.bindTexture(this.getGlTextureId());
      } else {
         RenderSystem.recordRenderCall(() -> GlStateManager.bindTexture(this.getGlTextureId()));
      }
   }

   public void method1134(TextureManager var1, IResourceManager var2, ResourceLocation var3, Executor var4) {
      var1.loadTexture(var3, this);
   }

   @Override
   public void close() {
   }

   public Class9732 method1135() {
      return Class9336.method35309(this);
   }

   public void method1136(boolean var1, boolean var2) {
      this.field1130 = this.field1126;
      this.field1131 = this.field1127;
      this.method1130(var1, var2);
   }

   public void method1137() {
      this.method1130(this.field1130, this.field1131);
   }
}
