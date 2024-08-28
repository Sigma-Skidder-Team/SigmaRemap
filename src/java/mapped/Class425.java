package mapped;

public class Class425 implements Runnable {
   private static String[] field1879;
   public final long field1880;
   public final long field1881;
   public final Class2378 field1882;
   public final Class7821 field1883;

   public Class425(Class7821 var1, long var2, long var4, Class2378 var6) {
      this.field1883 = var1;
      this.field1880 = var2;
      this.field1881 = var4;
      this.field1882 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field1880; var3 < this.field1881; var3++) {
         Class7821.method26150(this.field1883).method28458(this.field1882, var3 * Class7821.method26153(this.field1883));
      }
   }
}
