package mapped;

public class Class7200 {
   private static String[] field30905;
   private long field30906;
   private String field30907;

   public Class7200(String var1, long var2) {
      this.field30907 = var1;
      this.field30906 = System.currentTimeMillis() + var2;
   }

   public boolean method22616() {
      return this.method22617() < 0L;
   }

   public long method22617() {
      return this.field30906 - System.currentTimeMillis();
   }

   public String method22618() {
      return this.field30907;
   }
}
