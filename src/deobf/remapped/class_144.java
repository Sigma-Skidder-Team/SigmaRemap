package remapped;

import java.nio.file.Path;

public class class_144 extends class_4485<class_2340> {
   public class_144(class_6901 var1) {
      super(var1, class_8669.field_44447);
   }

   @Override
   public void method_20835() {
      this.method_20834(class_6503.field_33094).method_26026(class_8532.field_43674, class_8532.field_43676);
      this.method_20834(class_6503.field_33095).method_26026(class_8532.field_43675, class_8532.field_43677);
   }

   @Override
   public Path method_20832(Identifier var1) {
      return this.field_21862.method_31600().resolve("data/" + var1.method_21461() + "/tags/fluids/" + var1.method_21456() + ".json");
   }

   @Override
   public String method_27387() {
      return "Fluid Tags";
   }
}
