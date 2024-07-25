package remapped;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class class_5416 implements UncaughtExceptionHandler {
   private final Logger field_27605;

   public class_5416(Logger var1) {
      this.field_27605 = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.field_27605.error("Caught previously unhandled exception :");
      this.field_27605.error(var1.getName(), var2);
   }
}
