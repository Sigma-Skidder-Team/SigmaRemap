package mapped;

public class Class7688 implements Class7686 {
   private static String[] field32925;
   private float field32926;
   public final Class6134 field32927;

   public Class7688(Class6134 var1, float var2) {
      this.field32927 = var1;
      this.field32926 = var2;
   }

   @Override
   public float method25298(float var1) {
      return (float)(Math.random() * (double)this.field32926);
   }

   public void method25306(float var1) {
      this.field32926 = var1;
   }

   public float method25307() {
      return this.field32926;
   }
}
