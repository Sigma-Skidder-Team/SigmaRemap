package mapped;

import java.util.stream.Stream;

public abstract class Class277 extends Class269<Class8226> implements AutoCloseable {
   private final AtlasTexture field1059;
   private final String field1060;

   public Class277(TextureManager var1, ResourceLocation var2, String var3) {
      this.field1060 = var3;
      this.field1059 = new AtlasTexture(var2);
      var1.method1073(this.field1059.method1100(), this.field1059);
   }

   public abstract Stream<ResourceLocation> method1017();

   public TextureAtlasSprite method1018(ResourceLocation var1) {
      return this.field1059.getSprite(this.method1019(var1));
   }

   private ResourceLocation method1019(ResourceLocation var1) {
      return new ResourceLocation(var1.method8293(), this.field1060 + "/" + var1.method8292());
   }

   public Class8226 method970(IResourceManager var1, IProfiler var2) {
      var2.startTick();
      var2.startSection("stitching");
      Class8226 var5 = this.field1059.method1092(var1, this.method1017().<ResourceLocation>map(this::method1019), var2, 0);
      var2.endSection();
      var2.endTick();
      return var5;
   }

   public void method971(Class8226 var1, IResourceManager var2, IProfiler var3) {
      var3.startTick();
      var3.startSection("upload");
      this.field1059.method1091(var1);
      var3.endSection();
      var3.endTick();
   }

   @Override
   public void close() {
      this.field1059.method1099();
   }
}
