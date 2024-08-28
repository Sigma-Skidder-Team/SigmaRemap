package mapped;

public class Class1427 implements Runnable {
   private static String[] field7655;
   public final int field7656;
   public final int field7657;
   public final float[] field7658;
   public final boolean field7659;
   public final Class7824 field7660;

   public Class1427(Class7824 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field7660 = var1;
      this.field7656 = var2;
      this.field7657 = var3;
      this.field7658 = var4;
      this.field7659 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7656; var3 < this.field7657; var3++) {
         int var4 = var3 * Class7824.method26179(this.field7660);

         for (int var5 = 0; var5 < Class7824.method26180(this.field7660); var5++) {
            Class7824.method26182(this.field7660).method29629(this.field7658, var4 + var5 * Class7824.method26181(this.field7660), this.field7659);
         }
      }
   }
}
