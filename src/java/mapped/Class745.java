package mapped;

public class Class745 implements Runnable {
   private static String[] field3863;
   public final int field3864;
   public final int field3865;
   public final float[] field3866;
   public final boolean field3867;
   public final Class7821 field3868;

   public Class745(Class7821 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field3868 = var1;
      this.field3864 = var2;
      this.field3865 = var3;
      this.field3866 = var4;
      this.field3867 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3864; var3 < this.field3865; var3++) {
         Class7821.method26150(this.field3868).method28461(this.field3866, var3 * Class7821.method26149(this.field3868), this.field3867);
      }
   }
}
