package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.stream.Stream;

public class PotionSpriteUploader extends Class277 {
   public PotionSpriteUploader(TextureManager var1) {
      super(var1, new ResourceLocation("textures/atlas/mob_effects.png"), "mob_effect");
   }

   @Override
   public Stream<ResourceLocation> method1017() {
      return Registry.EFFECTS.method9190().stream();
   }

   public TextureAtlasSprite method1022(Effect var1) {
      return this.method1018(Registry.EFFECTS.getKey(var1));
   }
}
