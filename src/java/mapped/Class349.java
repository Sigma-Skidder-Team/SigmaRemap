package mapped;

public class Class349 implements Runnable {
   private static String[] field1552;
   public final long field1553;
   public final long field1554;
   public final Class2381 field1555;
   public final boolean field1556;
   public final Class6352 field1557;

   public Class349(Class6352 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field1557 = var1;
      this.field1553 = var2;
      this.field1554 = var4;
      this.field1555 = var6;
      this.field1556 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field1553; var3 < this.field1554; var3++) {
         long var5 = var3 * Class6352.method19335(this.field1557);

         for (long var7 = 0L; var7 < Class6352.method19336(this.field1557); var7++) {
            Class6352.method19330(this.field1557).method38583(this.field1555, var5 + var7 * Class6352.method19337(this.field1557), this.field1556);
         }
      }
   }
}
