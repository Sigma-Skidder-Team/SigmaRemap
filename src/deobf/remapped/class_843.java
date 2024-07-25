package remapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_843 extends class_6926 {
   private final Map<Long, String> field_4412 = new HashMap<Long, String>();

   public class_843() {
      super("Group ID To Name Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(2);

      for (int var5 = 0; var5 < var4; var5++) {
         long var6 = var1.method_27524(4);
         String var8 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
         this.field_4412.put(var6, var8);
      }
   }

   public Map<Long, String> method_3685() {
      return this.field_4412;
   }
}
