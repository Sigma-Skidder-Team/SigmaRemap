package mapped;

public class Class540 implements Runnable {
   private static String[] field2585;
   public final Class1001 field2586;
   public final Class5254 field2587;

   public Class540(Class5254 var1, Class1001 var2) {
      this.field2587 = var1;
      this.field2586 = var2;
   }

   @Override
   public void run() {
      Class5628.method17735(this.field2586, true);

      for (int var3 = 0; var3 < 10; var3++) {
         Class5254.method16394().particles.method1195(this.field2586, Class7940.field34054);
      }
   }
}
