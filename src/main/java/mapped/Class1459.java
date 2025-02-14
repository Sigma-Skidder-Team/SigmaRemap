package mapped;

public class Class1459 implements Runnable {
   private static String[] field7844;
   public final int field7845;
   public final int field7846;
   public final float[] field7847;
   public final boolean field7848;
   public final Class7941 field7849;

   public Class1459(Class7941 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field7849 = var1;
      this.field7845 = var2;
      this.field7846 = var3;
      this.field7847 = var4;
      this.field7848 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26764(this.field7849)];

      for (int var4 = this.field7845; var4 < this.field7846; var4++) {
         int var5 = var4 * Class7941.method26763(this.field7849);

         for (int var6 = 0; var6 < Class7941.method26767(this.field7849); var6++) {
            for (int var7 = 0; var7 < Class7941.method26764(this.field7849); var7++) {
               int var8 = var5 + var7 * Class7941.method26765(this.field7849) + var6;
               var3[var7] = this.field7847[var8];
            }

            Class7941.method26768(this.field7849).method28924(var3, this.field7848);

            for (int var9 = 0; var9 < Class7941.method26764(this.field7849); var9++) {
               int var10 = var5 + var9 * Class7941.method26765(this.field7849) + var6;
               this.field7847[var10] = var3[var9];
            }
         }
      }
   }
}
