package net.minecraft.network;

public final class ThreadQuickExitException extends RuntimeException {
   private static String[] field16548;
   public static final ThreadQuickExitException field16549 = new ThreadQuickExitException();

   private ThreadQuickExitException() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
