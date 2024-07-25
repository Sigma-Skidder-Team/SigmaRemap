package remapped;

import java.util.HashMap;
import java.util.Map;

public abstract class class_5476 {
   public final class_4106 field_27894;
   public final class_5115 field_27893;
   public final Map<String, class_1219> field_27895 = new HashMap<String, class_1219>();

   public class_5476(class_4106 var1, class_5115 var2) {
      this.field_27894 = var1;
      this.field_27893 = var2;
   }

   public void method_24892(class_5051 var1, String var2) throws Exception {
      class_1219 var5 = this.field_27895.get(var2);
      if (var5 != null) {
         var5.method_5401(var1);
      }
   }

   public void method_24893(class_1372 var1) {
      this.field_27894.method_19015(var1, new class_1418(this));
   }
}
