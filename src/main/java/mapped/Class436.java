package mapped;

public class Class436 implements Runnable {
   private static String[] field1952;
   public final long field1953;
   public final long field1954;
   public final long field1955;
   public final long field1956;
   public final Class2378 field1957;
   public final Class2378 field1958;
   public final Class8630 field1959;

   public Class436(Class8630 var1, long var2, long var4, long var6, long var8, Class2378 var10, Class2378 var11) {
      this.field1959 = var1;
      this.field1953 = var2;
      this.field1954 = var4;
      this.field1955 = var6;
      this.field1956 = var8;
      this.field1957 = var10;
      this.field1958 = var11;
   }

   @Override
   public void run() {
      if (this.field1953 <= 0L) {
         for (long var3 = this.field1954; var3 < this.field1955; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field1956 + var3;
            this.field1957.method9685(var5, this.field1958.method9651(var9) * Class8630.method31010(this.field1959).method9651(var5));
            this.field1957.method9685(var7, -this.field1958.method9651(var9) * Class8630.method31010(this.field1959).method9651(var7));
         }
      } else {
         for (long var11 = this.field1954; var11 < this.field1955; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            long var14 = this.field1956 + var11;
            this.field1957.method9685(var12, this.field1958.method9651(var14) * Class8630.method31010(this.field1959).method9651(var12));
            this.field1957.method9685(var13, this.field1958.method9651(var14) * Class8630.method31010(this.field1959).method9651(var13));
         }
      }
   }
}
