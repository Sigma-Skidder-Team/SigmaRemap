package remapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_5889 extends class_3912 {
   private final Map<String, String> field_29926 = new HashMap<String, String>();

   public class_5889() {
      super("Nero Metadata Tags Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      var1.method_27527(12L);

      while (this.method_18113(var1) > 0L && var1.method_27531() == 128) {
         var1.method_27527(2L);
         String var4 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
         var1.method_27527(4L);
         int var5 = var1.method_27531();
         String var6 = var1.method_27533(var5);
         this.field_29926.put(var4, var6);
      }
   }

   public Map<String, String> method_26947() {
      return this.field_29926;
   }
}
