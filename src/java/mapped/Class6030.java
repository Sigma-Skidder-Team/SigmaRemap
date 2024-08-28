package mapped;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class Class6030 implements UncaughtExceptionHandler {
   private final Logger field26228;

   public Class6030(Logger var1) {
      this.field26228 = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.field26228.error("Caught previously unhandled exception :", var2);
   }
}
