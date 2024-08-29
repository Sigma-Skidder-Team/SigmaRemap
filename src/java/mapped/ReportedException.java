package mapped;

public class ReportedException extends RuntimeException {
   private static String[] field16613;
   private final CrashReport field16614;

   public ReportedException(CrashReport var1) {
      this.field16614 = var1;
   }

   public CrashReport getCrashReport() {
      return this.field16614;
   }

   @Override
   public Throwable getCause() {
      return this.field16614.method14403();
   }

   @Override
   public String getMessage() {
      return this.field16614.method14402();
   }
}
