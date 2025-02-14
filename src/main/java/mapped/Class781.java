package mapped;

public class Class781 implements Runnable {
   private static String[] field4081;
   public final int field4082;
   public final int field4083;
   public final float[][] field4084;
   public final float[][] field4085;
   public final boolean field4086;
   public final Class8543 field4087;

   public Class781(Class8543 var1, int var2, int var3, float[][] var4, float[][] var5, boolean var6) {
      this.field4087 = var1;
      this.field4082 = var2;
      this.field4083 = var3;
      this.field4084 = var4;
      this.field4085 = var5;
      this.field4086 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field4082; var3 < this.field4083; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class8543.method30435(this.field4087); var5++) {
            int var6 = 2 * var5;
            this.field4084[var3][var6] = this.field4085[var5][var4];
            this.field4084[var3][var6 + 1] = this.field4085[var5][var4 + 1];
         }

         Class8543.method30436(this.field4087).method30933(this.field4084[var3], this.field4086);
      }
   }
}
