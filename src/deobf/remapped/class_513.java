package remapped;

public class class_513 extends Thread {
   private static String[] field_3154;

   public class_513(class_9084 var1) {
      this.field_3153 = var1;
   }

   @Override
   public void run() {
      synchronized (this.field_3153) {
         if (!class_9084.access$200(this.field_3153)) {
            class_9084.method_41830(this.field_3153).drain();
         } else {
            class_9084.method_41830(this.field_3153).flush();
         }

         class_9084.method_41830(this.field_3153).stop();
         class_9084.method_41830(this.field_3153).close();
         class_9084.method_41827(this.field_3153, null);
      }
   }
}
