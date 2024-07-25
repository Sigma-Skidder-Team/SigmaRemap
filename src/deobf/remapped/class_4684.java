package remapped;

import java.util.logging.Level;

public class class_4684 implements Runnable {
   public class_4684(class_3484 var1) {
      this.field_22817 = var1;
   }

   @Override
   public void run() {
      if (class_3484.method_16008(this.field_22817)) {
         if (class_3484.method_16020().isLoggable(Level.FINE)) {
            class_3484.method_16020().fine(String.format("performing disconnect (%s)", class_3484.method_15995(this.field_22817)));
         }

         class_3484.method_16006(this.field_22817, new class_3872(1));
      }

      class_3484.method_16017(this.field_22817);
      if (class_3484.method_16008(this.field_22817)) {
         class_3484.method_16019(this.field_22817, "io client disconnect");
      }
   }
}
