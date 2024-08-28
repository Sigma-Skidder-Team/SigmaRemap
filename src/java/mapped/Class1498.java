package mapped;

public class Class1498 implements Runnable {
   private static String[] field8079;
   public final long field8080;
   public final long field8081;
   public final Class2381 field8082;
   public final Class8832 field8083;

   public Class1498(Class8832 var1, long var2, long var4, Class2381 var6) {
      this.field8083 = var1;
      this.field8080 = var2;
      this.field8081 = var4;
      this.field8082 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field8080; var3 < this.field8081; var3++) {
         long var5 = var3 * (long)Class8832.method31955(this.field8083);

         for (long var7 = 0L; var7 < Class8832.method31963(this.field8083); var7++) {
            Class8832.method31958(this.field8083).method33649(this.field8082, var5 + var7 * (long)Class8832.method31957(this.field8083));
         }
      }
   }
}
