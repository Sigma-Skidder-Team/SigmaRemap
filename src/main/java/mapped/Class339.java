package mapped;

public class Class339 implements Runnable {
   private static String[] field1479;
   public final long field1480;
   public final long field1481;
   public final Class2381 field1482;
   public final Class9186 field1483;

   public Class339(Class9186 var1, long var2, long var4, Class2381 var6) {
      this.field1483 = var1;
      this.field1480 = var2;
      this.field1481 = var4;
      this.field1482 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field1480; var3 < this.field1481; var3++) {
         Class9186.method34382(this.field1483).method33649(this.field1482, var3 * Class9186.method34385(this.field1483));
      }
   }
}
