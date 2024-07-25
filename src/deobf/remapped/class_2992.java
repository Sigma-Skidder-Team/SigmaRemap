package remapped;

import java.nio.file.Path;

public class class_2992 extends class_4485<class_6629<?>> {
   public class_2992(class_6901 var1) {
      super(var1, class_8669.field_44400);
   }

   @Override
   public void method_20835() {
      this.method_20834(class_5218.field_26790).method_26026(class_6629.field_34241, class_6629.field_34322, class_6629.field_34317);
      this.method_20834(class_5218.field_26788)
         .method_26026(
            class_6629.field_34296, class_6629.field_34265, class_6629.field_34318, class_6629.field_34255, class_6629.field_34270, class_6629.field_34220
         );
      this.method_20834(class_5218.field_26789).method_26025(class_6629.field_34238);
      this.method_20834(class_5218.field_26794).method_26026(class_6629.field_34290, class_6629.field_34260);
      this.method_20834(class_5218.field_26793)
         .method_26024(class_5218.field_26794)
         .method_26026(
            class_6629.field_34247,
            class_6629.field_34216,
            class_6629.field_34288,
            class_6629.field_34274,
            class_6629.field_34284,
            class_6629.field_34267,
            class_6629.field_34329
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
