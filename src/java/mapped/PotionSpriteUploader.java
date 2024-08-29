package mapped;

import java.util.stream.Stream;

public class PotionSpriteUploader extends Class277 {
   public PotionSpriteUploader(TextureManager var1) {
      super(var1, new ResourceLocation("textures/atlas/mob_effects.png"), "mob_effect");
   }

   @Override
   public Stream<ResourceLocation> method1017() {
      return Registry.field16071.method9190().stream();
   }

   public TextureAtlasSprite method1022(Class7144 var1) {
      return this.method1018(Registry.field16071.getKey(var1));
   }
}
