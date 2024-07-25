package remapped;

public final class class_2506 extends RuntimeException {
   private static String[] field_12444;
   public static final class_2506 field_12445 = new class_2506();

   private class_2506() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
