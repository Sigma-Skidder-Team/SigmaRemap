package mapped;

import java.util.stream.Stream;

public class Class279 extends Class277 {
   public Class279(TextureManager var1) {
      super(var1, new ResourceLocation("textures/atlas/mob_effects.png"), "mob_effect");
   }

   @Override
   public Stream<ResourceLocation> method1017() {
      return Registry.field16071.method9190().stream();
   }

   public Class1713 method1022(Class7144 var1) {
      return this.method1018(Registry.field16071.method9181(var1));
   }
}
