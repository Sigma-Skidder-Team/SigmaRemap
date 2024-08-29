package mapped;

import java.nio.file.Path;

public class Class4453 extends Class4441<EntityType<?>> {
   public Class4453(Class9068 var1) {
      super(var1, Registry.ENTITY_TYPE);
   }

   @Override
   public void method14010() {
      this.method14014(Class8613.field38734).method31560(EntityType.field41078, EntityType.field41087, EntityType.field41103);
      this.method14014(Class8613.field38735)
         .method31560(EntityType.field41027, EntityType.field41067, EntityType.field41072, EntityType.field41099, EntityType.field41040, EntityType.field41101);
      this.method14014(Class8613.field38736).method31558(EntityType.field41009);
      this.method14014(Class8613.field38737).method31560(EntityType.field41007, EntityType.field41084);
      this.method14014(Class8613.field38738)
         .method31559(Class8613.field38737)
         .method31560(
            EntityType.field41083,
            EntityType.field41044,
            EntityType.field41081,
            EntityType.field41089,
            EntityType.field41093,
            EntityType.field41020,
            EntityType.field41104
         );
   }

   @Override
   public Path method14011(ResourceLocation var1) {
      return this.field21599.method33776().resolve("data/" + var1.getNamespace() + "/tags/entity_types/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Entity Type Tags";
   }
}
