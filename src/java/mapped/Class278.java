package mapped;

import java.util.stream.Stream;

public class Class278 extends Class277 {
   private static final ResourceLocation field1061 = new ResourceLocation("back");

   public Class278(TextureManager var1) {
      super(var1, new ResourceLocation("textures/atlas/paintings.png"), "painting");
   }

   @Override
   public Stream<ResourceLocation> method1017() {
      return Stream.<ResourceLocation>concat(Registry.field16079.method9190().stream(), Stream.of(field1061));
   }

   public Class1713 method1020(Class9078 var1) {
      return this.method1018(Registry.field16079.method9181(var1));
   }

   public Class1713 method1021() {
      return this.method1018(field1061);
   }
}
