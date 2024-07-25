package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class_7895 implements class_857 {
   private static String[] field_40374;

   public class_7895(class_1651 var1) {
      this.field_40375 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      try {
         JsonObject var4 = (JsonObject)var1.<JsonElement>method_23248(class_8039.field_41143, 0);
         class_8994.method_41264(var4, var1.method_23255());
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}
