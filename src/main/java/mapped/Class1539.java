package mapped;

public class Class1539 implements Runnable {
   private static String[] field8350;
   public final int field8351;
   public final int field8352;
   public final float[][] field8353;
   public final float[][] field8354;
   public final Class8543 field8355;

   public Class1539(Class8543 var1, int var2, int var3, float[][] var4, float[][] var5) {
      this.field8355 = var1;
      this.field8351 = var2;
      this.field8352 = var3;
      this.field8353 = var4;
      this.field8354 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8351; var3 < this.field8352; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class8543.method30435(this.field8355); var5++) {
            int var6 = 2 * var5;
            this.field8353[var3][var6] = this.field8354[var5][var4];
            this.field8353[var3][var6 + 1] = this.field8354[var5][var4 + 1];
         }

         Class8543.method30436(this.field8355).method30929(this.field8353[var3]);
      }
   }
}
