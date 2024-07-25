package remapped;

import java.util.List;

public class class_4962 implements class_857 {
   public class_4962(class_9250 var1) {
      this.field_25662 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      List var4 = var1.<List>method_23248(class_2287.field_11420, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      class_1189 var6 = var1.method_23255().<class_1189>method_6746(class_1189.class);
      if (!var6.method_14875(var5)) {
         class_3446.method_15886().method_34617().warning("Unable to find entity for metadata, entity ID: " + var5);
         var4.clear();
      } else {
         this.field_25662.field_47224.<class_1206>method_18997(class_1206.class).method_33131(var5, var4, var1.method_23255());
      }
   }
}
