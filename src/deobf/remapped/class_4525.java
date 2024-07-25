package remapped;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class class_4525 implements UncaughtExceptionHandler {
   private final Logger field_22087;

   public class_4525(Logger var1) {
      this.field_22087 = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.field_22087.error("Caught previously unhandled exception :");
      this.field_22087.error(var2);
   }
}
