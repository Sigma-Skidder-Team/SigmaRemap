package mapped;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class Class6034 implements UncaughtExceptionHandler {
   private final Logger field26234;

   public Class6034(Logger var1) {
      this.field26234 = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.field26234.error("Caught previously unhandled exception :");
      this.field26234.error(var2);
   }
}
