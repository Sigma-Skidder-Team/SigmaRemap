package mapped;

public class Class435 implements Runnable {
   private static String[] field1946;
   public final long field1947;
   public final long field1948;
   public final Class2378 field1949;
   public final boolean field1950;
   public final Class9533 field1951;

   public Class435(Class9533 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field1951 = var1;
      this.field1947 = var2;
      this.field1948 = var4;
      this.field1949 = var6;
      this.field1950 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field1947; var3 < this.field1948; var3++) {
         Class9533.method36857(this.field1951).method29630(this.field1949, var3 * Class9533.method36860(this.field1951), this.field1950);
      }
   }
}
