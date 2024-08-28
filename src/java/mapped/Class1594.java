package mapped;

public class Class1594 implements Runnable {
   private static String[] field8634;
   public final long field8635;
   public final long field8636;
   public final Class2378 field8637;
   public final Class2378 field8638;
   public final long field8639;
   public final Class8026 field8640;

   public Class1594(Class8026 var1, long var2, long var4, Class2378 var6, Class2378 var7, long var8) {
      this.field8640 = var1;
      this.field8635 = var2;
      this.field8636 = var4;
      this.field8637 = var6;
      this.field8638 = var7;
      this.field8639 = var8;
   }

   @Override
   public void run() {
      for (long var3 = this.field8635; var3 < this.field8636; var3++) {
         long var5 = var3 * Class8026.method27520(this.field8640);

         for (long var7 = 0L; var7 < Class8026.method27521(this.field8640); var7++) {
            Class8133.method28175(
               this.field8637,
               var5 + var7 * Class8026.method27522(this.field8640),
               this.field8638,
               var3 * Class8026.method27521(this.field8640) * this.field8639 + var7 * this.field8639,
               Class8026.method27523(this.field8640)
            );
            Class8026.method27515(this.field8640)
               .method30944(this.field8638, var3 * Class8026.method27521(this.field8640) * this.field8639 + var7 * this.field8639);
         }
      }
   }
}
