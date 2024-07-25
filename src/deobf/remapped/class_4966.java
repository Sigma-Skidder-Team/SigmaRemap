package remapped;

import com.google.gson.JsonElement;

public class class_4966 implements class_857 {
   private static String[] field_25715;

   public class_4966(class_1484 var1) {
      this.field_25714 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      if (class_3446.method_15884().method_25802()) {
         try {
            JsonElement var4 = class_6890.field_35446.method_11518(null, var1.<JsonElement>method_23261(class_8039.field_41143).toString());
            class_7709.method_34891(var4, var1.method_23255());
            class_2580.method_11745(var4, var1.method_23255());
            var1.method_23257(class_8039.field_41143, 0, var4);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }
}
