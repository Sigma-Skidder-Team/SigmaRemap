package mapped;

public class Class8637 {
   private static String[] field38875;
   private float field38876;
   private float field38877;
   private float[] field38878;
   public final Class2536 field38879;

   public Class8637(Class2536 var1, float var2, float var3) {
      this.field38879 = var1;
      this.field38876 = var2;
      this.field38877 = var3;
      this.field38878 = new float[]{var2, var3};
   }

   public float method31024() {
      return this.field38876;
   }

   public float method31025() {
      return this.field38877;
   }

   public float[] method31026() {
      return this.field38878;
   }

   @Override
   public int hashCode() {
      return (int)(this.field38876 * this.field38877 * 31.0F);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class8637)) {
         return false;
      } else {
         Class8637 var4 = (Class8637)var1;
         return var4.field38876 == this.field38876 && var4.field38877 == this.field38877;
      }
   }

   // $VF: synthetic method
   public static float method31027(Class8637 var0) {
      return var0.field38876;
   }

   // $VF: synthetic method
   public static float method31028(Class8637 var0) {
      return var0.field38877;
   }
}
