package mapped;

public class Class1484 implements Runnable {
   private static String[] field7985;
   public final long field7986;
   public final long field7987;
   public final long field7988;
   public final Class2378 field7989;
   public final Class8276 field7990;

   public Class1484(Class8276 var1, long var2, long var4, long var6, Class2378 var8) {
      this.field7990 = var1;
      this.field7986 = var2;
      this.field7987 = var4;
      this.field7988 = var6;
      this.field7989 = var8;
   }

   @Override
   public void run() {
      long var3 = this.field7986 + Class8276.method28933(this.field7990) - 1L;

      for (long var5 = this.field7987; var5 < this.field7988; var5++) {
         long var7 = this.field7986 + var5;
         float var9 = this.field7989.method9651(var7);
         long var10 = var3 - var5;
         this.field7989.method9685(var7, this.field7989.method9651(var10));
         this.field7989.method9685(var10, var9);
      }
   }
}
