package mapped;

public final class Class1360 implements Runnable {
   private static String[] field7256;
   public final long field7257;
   public final long field7258;
   public final Class2385 field7259;
   public final long field7260;
   public final Class2385 field7261;
   public final long field7262;

   public Class1360(long var1, long var3, Class2385 var5, long var6, Class2385 var8, long var9) {
      this.field7257 = var1;
      this.field7258 = var3;
      this.field7259 = var5;
      this.field7260 = var6;
      this.field7261 = var8;
      this.field7262 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field7257; var3 < this.field7258; var3++) {
         this.field7259.method9675(this.field7260 + var3, this.field7261.method9641(this.field7262 + var3));
      }
   }
}
