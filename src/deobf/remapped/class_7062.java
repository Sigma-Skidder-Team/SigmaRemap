package remapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_7062 extends class_6926 {
   private final Map<Long, String> field_36444 = new HashMap<Long, String>();

   public class_7062() {
      super("Chapter Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      var1.method_27527(4L);
      int var4 = var1.method_27531();

      for (int var5 = 0; var5 < var4; var5++) {
         long var6 = var1.method_27524(8);
         int var8 = var1.method_27531();
         String var9 = var1.method_27533(var8);
         this.field_36444.put(var6, var9);
      }
   }

   public Map<Long, String> method_32531() {
      return this.field_36444;
   }
}
