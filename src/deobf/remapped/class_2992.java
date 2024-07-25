package remapped;

import java.nio.file.Path;

public class class_2992 extends class_4485<EntityType<?>> {
   public class_2992(class_6901 var1) {
      super(var1, class_8669.field_44400);
   }

   @Override
   public void method_20835() {
      this.method_20834(EntityTypeTags.SKELETONS).method_26026(EntityType.field_34241, EntityType.field_34322, EntityType.field_34317);
      this.method_20834(EntityTypeTags.RAIDERS)
         .method_26026(
            EntityType.field_34296, EntityType.field_34265, EntityType.field_34318, EntityType.field_34255, EntityType.field_34270, EntityType.field_34220
         );
      this.method_20834(EntityTypeTags.BEEHIVE_INHABITORS).method_26025(EntityType.field_34238);
      this.method_20834(EntityTypeTags.ARROWS).method_26026(EntityType.field_34290, EntityType.field_34260);
      this.method_20834(EntityTypeTags.IMPACT_PROJECTILES)
         .method_26024(EntityTypeTags.ARROWS)
         .method_26026(
            EntityType.field_34247,
            EntityType.field_34216,
            EntityType.field_34288,
            EntityType.field_34274,
            EntityType.field_34284,
            EntityType.field_34267,
            EntityType.field_34329
         );
   }

   @Override
   public Path method_20832(Identifier var1) {
      return this.field_21862.method_31600().resolve("data/" + var1.method_21461() + "/tags/entity_types/" + var1.method_21456() + ".json");
   }

   @Override
   public String method_27387() {
      return "Entity Type Tags";
   }
}
