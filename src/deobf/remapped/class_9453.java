package remapped;

import java.util.Optional;

public class class_9453 implements class_857 {
   public class_9453(class_6627 var1) {
      this.field_48241 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_2914 var4 = class_3446.method_15883().method_33743().<class_2914>method_24490(class_2914.class);
      String var5 = var1.<String>method_23242(class_8039.field_41171);
      Optional var6 = var4.method_13322(var5);
      if (!var6.isPresent() && (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731())) {
         class_3446.method_15886().method_34617().warning("Could not find painting motive: " + var5 + " falling back to default (0)");
      }

      var1.method_23236(class_8039.field_41157, var6.orElse(0));
   }
}
