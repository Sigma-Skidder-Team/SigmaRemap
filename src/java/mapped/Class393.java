package mapped;

public class Class393 implements Runnable {
   private static String[] field1672;
   public final int field1673;
   public final int field1674;
   public final double[][] field1675;
   public final Class9186 field1676;

   public Class393(Class9186 var1, int var2, int var3, double[][] var4) {
      this.field1676 = var1;
      this.field1673 = var2;
      this.field1674 = var3;
      this.field1675 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field1673; var3 < this.field1674; var3++) {
         Class9186.method34382(this.field1676).method33646(this.field1675[var3]);
      }
   }
}
