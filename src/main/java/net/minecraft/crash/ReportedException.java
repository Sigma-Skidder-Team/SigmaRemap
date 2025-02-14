package net.minecraft.crash;

public class ReportedException extends RuntimeException {
    private final CrashReport crashReport;

   public ReportedException(CrashReport var1) {
      this.crashReport = var1;
   }

   public CrashReport getCrashReport() {
      return this.crashReport;
   }

   @Override
   public Throwable getCause() {
      return this.crashReport.method14403();
   }

   @Override
   public String getMessage() {
      return this.crashReport.method14402();
   }
}
