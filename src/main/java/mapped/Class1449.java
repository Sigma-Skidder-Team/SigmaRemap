package mapped;

public class Class1449 implements Runnable {
   private static String[] field7786;
   public final long field7787;
   public final long field7788;
   public final Class2381 field7789;
   public final boolean field7790;
   public final Class8832 field7791;

   public Class1449(Class8832 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field7791 = var1;
      this.field7787 = var2;
      this.field7788 = var4;
      this.field7789 = var6;
      this.field7790 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class8832.method31963(this.field7791), false);

      for (long var4 = this.field7787; var4 < this.field7788; var4++) {
         long var6 = var4 * Class8832.method31966(this.field7791);

         for (long var8 = 0L; var8 < Class8832.method31964(this.field7791); var8++) {
            for (long var10 = 0L; var10 < Class8832.method31963(this.field7791); var10++) {
               long var12 = var6 + var10 * Class8832.method31967(this.field7791) + var8;
               var3.method9687(var10, this.field7789.method9653(var12));
            }

            Class8832.method31960(this.field7791).method33651(var3, this.field7790);

            for (long var14 = 0L; var14 < Class8832.method31963(this.field7791); var14++) {
               long var15 = var6 + var14 * Class8832.method31967(this.field7791) + var8;
               this.field7789.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
