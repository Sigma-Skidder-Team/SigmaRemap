package remapped;

import java.util.logging.Level;

public class class_2321 implements Runnable {
   public class_2321(class_6110 var1) {
      this.field_11619 = var1;
   }

   @Override
   public void run() {
      if (class_1144.method_5064().isLoggable(Level.FINE)) {
         class_1144.method_5064().fine(String.format("writing ping packet - expecting pong within %sms", class_1144.method_5015(this.field_11619.field_31249)));
      }

      class_1144.method_5041(this.field_11619.field_31249);
      class_1144.method_5022(this.field_11619.field_31249, class_1144.method_5015(this.field_11619.field_31249));
   }
}
