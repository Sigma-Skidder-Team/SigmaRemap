package mapped;

public class Class549 implements Runnable {
   private static String[] field2634;
   public final long field2635;
   public final long field2636;
   public final Class2381 field2637;
   public final boolean field2638;
   public final Class9330 field2639;

   public Class549(Class9330 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field2639 = var1;
      this.field2635 = var2;
      this.field2636 = var4;
      this.field2637 = var6;
      this.field2638 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2635; var3 < this.field2636; var3++) {
         Class9330.method35278(this.field2639).method38579(this.field2637, var3 * Class9330.method35281(this.field2639), this.field2638);
      }
   }
}
