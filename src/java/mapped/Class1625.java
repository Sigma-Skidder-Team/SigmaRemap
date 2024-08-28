package mapped;

public class Class1625 implements Runnable {
   private static String[] field8807;
   public final int field8808;
   public final int field8809;
   public final float[][][] field8810;
   public final boolean field8811;
   public final Class8026 field8812;

   public Class1625(Class8026 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field8812 = var1;
      this.field8808 = var2;
      this.field8809 = var3;
      this.field8810 = var4;
      this.field8811 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8808; var3 < this.field8809; var3++) {
         for (int var4 = 0; var4 < Class8026.method27513(this.field8812); var4++) {
            Class8026.method27515(this.field8812).method30933(this.field8810[var3][var4], this.field8811);
         }
      }
   }
}
