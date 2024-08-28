package mapped;

import java.util.stream.Stream;

public abstract class Class277 extends Class269<Class8226> implements AutoCloseable {
   private final Class289 field1059;
   private final String field1060;

   public Class277(TextureManager var1, ResourceLocation var2, String var3) {
      this.field1060 = var3;
      this.field1059 = new Class289(var2);
      var1.method1073(this.field1059.method1100(), this.field1059);
   }

   public abstract Stream<ResourceLocation> method1017();

   public Class1713 method1018(ResourceLocation var1) {
      return this.field1059.method1098(this.method1019(var1));
   }

   private ResourceLocation method1019(ResourceLocation var1) {
      return new ResourceLocation(var1.method8293(), this.field1060 + "/" + var1.method8292());
   }

   public Class8226 method970(Class191 var1, Class7165 var2) {
      var2.method22501();
      var2.method22503("stitching");
      Class8226 var5 = this.field1059.method1092(var1, this.method1017().<ResourceLocation>map(this::method1019), var2, 0);
      var2.method22505();
      var2.method22502();
      return var5;
   }

   public void method971(Class8226 var1, Class191 var2, Class7165 var3) {
      var3.method22501();
      var3.method22503("upload");
      this.field1059.method1091(var1);
      var3.method22505();
      var3.method22502();
   }

   @Override
   public void close() {
      this.field1059.method1099();
   }
}
