package remapped;

import java.util.ArrayList;
import java.util.Arrays;

public class class_5514 extends class_1179 {
   public class_5514() {
      super(class_6629.field_34248, "donkey", 0.75F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_4094(0.87F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_4094) {
         class_4094 var5 = (class_4094)var1;
         if (!var2.equals("left_chest")) {
            return !var2.equals("right_chest") ? super.method_12291(var1, var2) : (class_1549)class_7860.field_39916.method_39231(var5, 1);
         } else {
            return (class_1549)class_7860.field_39916.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      ArrayList var3 = new ArrayList<String>(Arrays.asList(super.method_12292()));
      var3.add("left_chest");
      var3.add("right_chest");
      return var3.<String>toArray(new String[var3.size()]);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_6247 var6 = new class_6247(var5, 0.87F);
      var6.field_32487 = (class_6521)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
