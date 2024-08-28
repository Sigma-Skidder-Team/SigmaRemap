package mapped;

public final class Class2466 extends RuntimeException {
   private static String[] field16548;
   public static final Class2466 field16549 = new Class2466();

   private Class2466() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
