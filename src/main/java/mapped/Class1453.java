package mapped;

public class Class1453 implements Runnable {
   private static String[] field7811;
   public final int field7812;
   public final int field7813;
   public final float[] field7814;
   public final Class8162 field7815;

   public Class1453(Class8162 var1, int var2, int var3, float[] var4) {
      this.field7815 = var1;
      this.field7812 = var2;
      this.field7813 = var3;
      this.field7814 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field7812; var3 < this.field7813; var3++) {
         int var4 = var3 * Class8162.method28392(this.field7815);

         for (int var5 = 0; var5 < Class8162.method28393(this.field7815); var5++) {
            Class8162.method28395(this.field7815).method28457(this.field7814, var4 + var5 * Class8162.method28394(this.field7815));
         }
      }
   }
}
