package mapped;

public class Class428 implements Runnable {
   private static String[] field1896;
   public final long field1897;
   public final long field1898;
   public final long field1899;
   public final long field1900;
   public final Class2381 field1901;
   public final long field1902;
   public final Class7274 field1903;

   public Class428(Class7274 var1, long var2, long var4, long var6, long var8, Class2381 var10, long var11) {
      this.field1903 = var1;
      this.field1897 = var2;
      this.field1898 = var4;
      this.field1899 = var6;
      this.field1900 = var8;
      this.field1901 = var10;
      this.field1902 = var11;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field1897);

      for (long var4 = this.field1898; var4 >= this.field1899; var4--) {
         long var6 = var4 * Class7274.method22902(this.field1903);
         long var8 = var4 * this.field1900;

         for (long var10 = Class7274.method22903(this.field1903) - 1L; var10 >= 0L; var10--) {
            Class8133.method28177(this.field1901, var6 + var10 * Class7274.method22904(this.field1903), var3, 0L, Class7274.method22905(this.field1903));
            Class7274.method22897(this.field1903).method27175(var3);
            Class8133.method28177(var3, 0L, this.field1901, var8 + var10 * this.field1902, this.field1897);
         }
      }
   }
}
