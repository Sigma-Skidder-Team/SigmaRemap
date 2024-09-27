package net.minecraft.client.renderer.texture;

import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;

public class DynamicTexture extends Class290 {
   private static final Logger field1132 = LogManager.getLogger();
   private Class1806 field1133;

   public DynamicTexture(Class1806 var1) {
      this.field1133 = var1;
      if (RenderSystem.isOnRenderThread()) {
         TextureUtil.method30368(this.getGlTextureId(), this.field1133.method7886(), this.field1133.method7887());
         this.method1140();
         if (Config.isShaders()) {
            Class9336.method35317(this);
         }
      } else {
         RenderSystem.recordRenderCall(() -> {
            TextureUtil.method30368(this.getGlTextureId(), this.field1133.method7886(), this.field1133.method7887());
            this.method1140();
            if (Config.isShaders()) {
               Class9336.method35317(this);
            }
         });
      }
   }

   public DynamicTexture(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      this.field1133 = new Class1806(var1, var2, var3);
      TextureUtil.method30368(this.getGlTextureId(), this.field1133.method7886(), this.field1133.method7887());
      if (Config.isShaders()) {
         Class9336.method35317(this);
      }
   }

   @Override
   public void method1090(IResourceManager var1) {
   }

   public void method1140() {
      if (this.field1133 == null) {
         field1132.warn("Trying to upload disposed texture {}", this.getGlTextureId());
      } else {
         this.method1133();
         this.field1133.method7893(0, 0, 0, false);
      }
   }

   @Nullable
   public Class1806 method1141() {
      return this.field1133;
   }

   public void method1142(Class1806 var1) {
      if (this.field1133 != null) {
         this.field1133.close();
      }

      this.field1133 = var1;
   }

   @Override
   public void close() {
      if (this.field1133 != null) {
         this.field1133.close();
         this.method1132();
         this.field1133 = null;
      }
   }
}
