package net.minecraft.util;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class DefaultWithNameUncaughtExceptionHandler implements UncaughtExceptionHandler {
   private final Logger field26229;

   public DefaultWithNameUncaughtExceptionHandler(Logger var1) {
      this.field26229 = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.field26229.error("Caught previously unhandled exception :");
      this.field26229.error(var1.getName(), var2);
   }
}
