package mapped;

import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.renderer.texture.TextureUtil;

public class Class6630 implements Class6627 {
   private int field29164 = -1;
   private String field29165 = null;
   private Texture field29166 = null;

   public Class6630(int var1, String var2, Texture var3) {
      this.field29164 = var1;
      this.field29165 = var2;
      this.field29166 = var3;
   }

   @Override
   public int method20208() {
      return this.field29164;
   }

   public String method20211() {
      return this.field29165;
   }

   public Texture method20212() {
      return this.field29166;
   }

   @Override
   public int method20207() {
      return this.field29166.getGlTextureId();
   }

   @Override
   public void method20203() {
      TextureUtil.releaseTextureId(this.field29166.getGlTextureId());
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.field29164 + ", path: " + this.field29165 + ", glTextureId: " + this.method20207();
   }
}
