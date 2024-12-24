package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.nio.file.Path;

public class Class4453 extends Class4441<EntityType<?>> {
   public Class4453(Class9068 var1) {
      super(var1, Registry.ENTITY_TYPE);
   }

   @Override
   public void method14010() {
      this.method14014(EntityTypeTags.field38734).method31560(EntityType.SKELETON, EntityType.STRAY, EntityType.WITHER_SKELETON);
      this.method14014(EntityTypeTags.field38735)
         .method31560(EntityType.EVOKER, EntityType.PILLAGER, EntityType.RAVAGER, EntityType.VINDICATOR, EntityType.ILLUSIONER, EntityType.WITCH);
      this.method14014(EntityTypeTags.field38736).method31558(EntityType.BEE);
      this.method14014(EntityTypeTags.field38737).method31560(EntityType.ARROW, EntityType.SPECTRAL_ARROW);
      this.method14014(EntityTypeTags.field38738)
         .method31559(EntityTypeTags.field38737)
         .method31560(
            EntityType.SNOWBALL,
            EntityType.FIREBALL,
            EntityType.SMALL_FIREBALL,
            EntityType.EGG,
            EntityType.TRIDENT,
            EntityType.DRAGON_FIREBALL,
            EntityType.WITHER_SKULL
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
