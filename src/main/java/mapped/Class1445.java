package mapped;

public class Class1445 implements Runnable {
   private static String[] field7763;
   public final int field7764;
   public final int field7765;
   public final double[][][] field7766;
   public final boolean field7767;
   public final Class3612 field7768;

   public Class1445(Class3612 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field7768 = var1;
      this.field7764 = var2;
      this.field7765 = var3;
      this.field7766 = var4;
      this.field7767 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7764; var3 < this.field7765; var3++) {
         for (int var4 = 0; var4 < Class3612.method12221(this.field7768); var4++) {
            Class3612.method12223(this.field7768).method33660(this.field7766[var3][var4], this.field7767);
         }
      }
   }
}
