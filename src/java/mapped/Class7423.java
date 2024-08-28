package mapped;

public class Class7423 {
   private static String[] field31903;
   public float field31904;
   public float field31905;
   public float field31906;
   public float field31907;

   public Class7423(float var1, float var2, float var3) {
      this.field31904 = var1;
      this.field31905 = var2;
      this.field31906 = var3;
      this.field31907 = 0.1F;
   }

   public Class7423(float var1, float var2, float var3, float var4) {
      this(var1, var2, var3);
      this.field31907 = var4;
   }

   public float method23931(float var1) {
      if (var1 != this.field31904) {
         this.field31904 = this.field31904 + (var1 - this.field31904) * this.field31907;
      }

      return this.field31904;
   }

   public float method23932(float var1) {
      if (var1 != this.field31905) {
         this.field31905 = this.field31905 + (var1 - this.field31905) * this.field31907;
      }

      return this.field31905;
   }

   public float method23933(float var1) {
      if (var1 != this.field31906) {
         this.field31906 = this.field31906 + (var1 - this.field31906) * this.field31907;
      }

      return this.field31906;
   }
}
