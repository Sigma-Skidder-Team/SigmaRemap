package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.util.ResourceLocation;

import java.util.Objects;
import java.util.function.Function;

public class Class7826 {
   private final ResourceLocation field33603;
   private final ResourceLocation field33604;
   private RenderType field33605;

   public Class7826(ResourceLocation var1, ResourceLocation var2) {
      this.field33603 = var1;
      this.field33604 = var2;
   }

   public ResourceLocation method26196() {
      return this.field33603;
   }

   public ResourceLocation method26197() {
      return this.field33604;
   }

   public TextureAtlasSprite getSprite() {
      TextureAtlasSprite var3 = Minecraft.getInstance().getAtlasSpriteGetter(this.method26196()).apply(this.method26197());
      if (EmissiveTextures.isActive()) {
         var3 = EmissiveTextures.method30592(var3);
      }

      return var3;
   }

   public RenderType method26199(Function<ResourceLocation, RenderType> var1) {
      if (this.field33605 == null) {
         this.field33605 = (RenderType)var1.apply(this.field33603);
      }

      return this.field33605;
   }

   public IVertexBuilder method26200(Class7733 var1, Function<ResourceLocation, RenderType> var2) {
      TextureAtlasSprite var5 = this.getSprite();
      RenderType var6 = this.method26199(var2);
      if (var5.field9353 && var6.method14364()) {
         var6 = RenderType.getEntityCutout(this.field33603);
      }

      return var5.method7474(var1.method25597(var6));
   }

   public IVertexBuilder method26201(Class7733 var1, Function<ResourceLocation, RenderType> var2, boolean var3) {
      return this.getSprite().method7474(ItemRenderer.method786(var1, this.method26199(var2), true, var3));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class7826 var4 = (Class7826)var1;
         return this.field33603.equals(var4.field33603) && this.field33604.equals(var4.field33604);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field33603, this.field33604);
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.field33603 + ", texture=" + this.field33604 + '}';
   }
}
