package mapped;

public class Class1479 implements Runnable {
   private static String[] field7959;
   public final int field7960;
   public final int field7961;
   public final float[] field7962;
   public final boolean field7963;
   public final Class7941 field7964;

   public Class1479(Class7941 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field7964 = var1;
      this.field7960 = var2;
      this.field7961 = var3;
      this.field7962 = var4;
      this.field7963 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26769(this.field7964)];

      for (int var4 = this.field7960; var4 < this.field7961; var4++) {
         int var5 = var4 * Class7941.method26765(this.field7964);

         for (int var6 = 0; var6 < Class7941.method26767(this.field7964); var6++) {
            for (int var7 = 0; var7 < Class7941.method26769(this.field7964); var7++) {
               int var8 = var7 * Class7941.method26763(this.field7964) + var5 + var6;
               var3[var7] = this.field7962[var8];
            }

            Class7941.method26770(this.field7964).method28924(var3, this.field7963);

            for (int var9 = 0; var9 < Class7941.method26769(this.field7964); var9++) {
               int var10 = var9 * Class7941.method26763(this.field7964) + var5 + var6;
               this.field7962[var10] = var3[var9];
            }
         }
      }
   }
}
