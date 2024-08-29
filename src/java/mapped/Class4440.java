package mapped;

import java.nio.file.Path;

public class Class4440 extends Class4441<Fluid> {
   public Class4440(Class9068 var1) {
      super(var1, Registry.field16070);
   }

   @Override
   public void method14010() {
      this.method14014(Class8953.field40469).method31560(Class9479.field44066, Class9479.field44065);
      this.method14014(Class8953.field40470).method31560(Class9479.field44068, Class9479.field44067);
   }

   @Override
   public Path method14011(ResourceLocation var1) {
      return this.field21599.method33776().resolve("data/" + var1.getNamespace() + "/tags/fluids/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Fluid Tags";
   }
}
