package remapped;

import java.util.Map;

public final class class_3784 implements class_1576 {
   public class_3784(Map var1) {
      this.field_18470 = var1;
   }

   @Override
   public void method_7111(class_1951 var1, class_3548 var2) {
      synchronized (this.field_18470) {
         this.field_18470.put("Response", var2);
         this.field_18470.notifyAll();
      }
   }

   @Override
   public void method_7112(class_1951 var1, Exception var2) {
      synchronized (this.field_18470) {
         this.field_18470.put("Exception", var2);
         this.field_18470.notifyAll();
      }
   }
}
