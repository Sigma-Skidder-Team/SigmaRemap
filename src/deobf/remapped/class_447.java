package remapped;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class class_447 implements UncaughtExceptionHandler {
   private final Logger field_1866;

   public class_447(Logger var1) {
      this.field_1866 = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.field_1866.error("Caught previously unhandled exception :", var2);
   }
}
