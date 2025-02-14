package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Class1694 implements AutoCloseable {
   private static String[] field9229;
   private final Map<ResourceLocation, AtlasTexture> field9230;

   public Class1694(Collection<AtlasTexture> var1) {
      this.field9230 = var1.stream().collect(Collectors.toMap(AtlasTexture::getTextureLocation, Function.<AtlasTexture>identity()));
   }

   public AtlasTexture method7288(ResourceLocation var1) {
      return this.field9230.get(var1);
   }

   public TextureAtlasSprite method7289(Class7826 var1) {
      return this.field9230.get(var1.method26196()).getSprite(var1.method26197());
   }

   @Override
   public void close() {
      this.field9230.values().forEach(AtlasTexture::method1099);
      this.field9230.clear();
   }
}
