package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.util.Optional;

public class Class4518 extends Class4510 {
   private final Optional<ResourceLocation> field21791;
   private final boolean field21792;
   private final boolean field21793;

   public Class4518(ResourceLocation var1, boolean var2, boolean var3) {
      super("texture", () -> {
         RenderSystem.enableTexture();
         TextureManager var5 = Minecraft.getInstance().getTextureManager();
         var5.bindTexture(var1);
         var5.method1082().method1130(var2, var3);
      }, () -> {
      });
      this.field21791 = Optional.<ResourceLocation>of(var1);
      this.field21792 = var2;
      this.field21793 = var3;
   }

   public Class4518() {
      super("texture", () -> RenderSystem.disableTexture(), () -> RenderSystem.enableTexture());
      this.field21791 = Optional.<ResourceLocation>empty();
      this.field21792 = false;
      this.field21793 = false;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class4518 var4 = (Class4518)var1;
         return this.field21791.equals(var4.field21791) && this.field21792 == var4.field21792 && this.field21793 == var4.field21793;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.field21791.hashCode();
   }

   @Override
   public String toString() {
      return this.field21734 + '[' + this.field21791 + "(blur=" + this.field21792 + ", mipmap=" + this.field21793 + ")]";
   }

   public Optional<ResourceLocation> method14290() {
      return this.field21791;
   }

   public boolean method14291() {
      return this.field21792;
   }

   public boolean method14292() {
      return this.field21793;
   }
}
