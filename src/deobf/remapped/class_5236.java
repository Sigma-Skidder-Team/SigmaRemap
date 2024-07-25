package remapped;

import java.util.ArrayList;
import java.util.Arrays;

public class class_5236 extends class_2520 {
   public class_5236() {
      super(class_6629.field_34240, "piglin", 0.5F);
   }

   public class_5236(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_9873 method_12295() {
      return new class_672(0.0F, 64, 64);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_672) {
         class_672 var5 = (class_672)var1;
         if (var2.equals("left_ear")) {
            return var5.field_3734;
         }

         if (var2.equals("right_ear")) {
            return var5.field_3733;
         }
      }

      return super.method_12291(var1, var2);
   }

   @Override
   public String[] method_12292() {
      ArrayList var3 = new ArrayList<String>(Arrays.asList(super.method_12292()));
      var3.add("left_ear");
      var3.add("right_ear");
      return var3.<String>toArray(new String[var3.size()]);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_1591 var6 = new class_1591(var5, false);
      var6.field_32487 = (class_672<class_5886>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
