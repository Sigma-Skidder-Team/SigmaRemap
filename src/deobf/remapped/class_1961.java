package remapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_1961 extends class_6926 {
   private Map<Long, Long> field_9978 = new HashMap<Long, Long>();

   public class_1961() {
      super("Progressive Download Information Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);

      while (this.method_18113(var1) > 0L) {
         long var4 = var1.method_27524(4);
         long var6 = var1.method_27524(4);
         this.field_9978.put(var4, var6);
      }
   }

   public Map<Long, Long> method_9060() {
      return this.field_9978;
   }
}
