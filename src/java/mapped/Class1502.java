package mapped;

public class Class1502 implements Runnable {
   private static String[] field8107;
   public final int field8108;
   public final int field8109;
   public final double[][][] field8110;
   public final Class7274 field8111;

   public Class1502(Class7274 var1, int var2, int var3, double[][][] var4) {
      this.field8111 = var1;
      this.field8108 = var2;
      this.field8109 = var3;
      this.field8110 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field8108; var3 < this.field8109; var3++) {
         for (int var4 = 0; var4 < Class7274.method22895(this.field8111); var4++) {
            Class7274.method22897(this.field8111).method27174(this.field8110[var3][var4]);
         }
      }
   }
}
