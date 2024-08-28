package mapped;

import java.nio.file.Path;

public class Class4453 extends Class4441<Class8992<?>> {
   public Class4453(Class9068 var1) {
      super(var1, Class2348.field16074);
   }

   @Override
   public void method14010() {
      this.method14014(Class8613.field38734).method31560(Class8992.field41078, Class8992.field41087, Class8992.field41103);
      this.method14014(Class8613.field38735)
         .method31560(Class8992.field41027, Class8992.field41067, Class8992.field41072, Class8992.field41099, Class8992.field41040, Class8992.field41101);
      this.method14014(Class8613.field38736).method31558(Class8992.field41009);
      this.method14014(Class8613.field38737).method31560(Class8992.field41007, Class8992.field41084);
      this.method14014(Class8613.field38738)
         .method31559(Class8613.field38737)
         .method31560(
            Class8992.field41083,
            Class8992.field41044,
            Class8992.field41081,
            Class8992.field41089,
            Class8992.field41093,
            Class8992.field41020,
            Class8992.field41104
         );
   }

   @Override
   public Path method14011(ResourceLocation var1) {
      return this.field21599.method33776().resolve("data/" + var1.method8293() + "/tags/entity_types/" + var1.method8292() + ".json");
   }

   @Override
   public String method14012() {
      return "Entity Type Tags";
   }
}
