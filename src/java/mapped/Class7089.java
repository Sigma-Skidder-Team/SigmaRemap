package mapped;

public class Class7089 {
   private static String[] field30508;
   private float field30509;
   private float field30510;
   private boolean field30511;
   public final Class6134 field30512;

   public Class7089(Class6134 var1, float var2, float var3) {
      this.field30512 = var1;
      this.field30511 = false;
      this.field30510 = var2;
      this.field30509 = var3;
   }

   public float method22061() {
      return (float)((double)this.field30510 + Math.random() * (double)(this.field30509 - this.field30510));
   }

   public boolean method22062() {
      return this.field30511;
   }

   public void method22063(boolean var1) {
      this.field30511 = var1;
   }

   public float method22064() {
      return this.field30509;
   }

   public void method22065(float var1) {
      this.field30509 = var1;
   }

   public float method22066() {
      return this.field30510;
   }

   public void method22067(float var1) {
      this.field30510 = var1;
   }
}
