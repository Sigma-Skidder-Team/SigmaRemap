package mapped;

public class Class2529 extends Class2520 {
   private static String[] field16715;
   private Class2532 field16716;
   private Class2532 field16717;
   private Class2532 field16718;
   private Class2532 field16719;
   private int field16720;

   public Class2529(Class2532 var1, Class2532 var2, Class2532 var3, Class2532 var4) {
      this(var1, var2, var3, var4, 20);
   }

   public Class2529(Class2532 var1, Class2532 var2, Class2532 var3, Class2532 var4, int var5) {
      this.field16716 = new Class2532(var1);
      this.field16717 = new Class2532(var2);
      this.field16718 = new Class2532(var3);
      this.field16719 = new Class2532(var4);
      this.field16720 = var5;
      this.field16680 = true;
   }

   public Class2532 method10657(float var1) {
      float var4 = 1.0F - var1;
      float var6 = var4 * var4 * var4;
      float var7 = 3.0F * var4 * var4 * var1;
      float var8 = 3.0F * var4 * var1 * var1;
      float var9 = var1 * var1 * var1;
      float var10 = this.field16716.field16737 * var6
         + this.field16717.field16737 * var7
         + this.field16718.field16737 * var8
         + this.field16719.field16737 * var9;
      float var11 = this.field16716.field16738 * var6
         + this.field16717.field16738 * var7
         + this.field16718.field16738 * var8
         + this.field16719.field16738 * var9;
      return new Class2532(var10, var11);
   }

   @Override
   public void method10578() {
      float var3 = 1.0F / (float)this.field16720;
      this.field16671 = new float[(this.field16720 + 1) * 2];

      for (int var4 = 0; var4 < this.field16720 + 1; var4++) {
         float var5 = (float)var4 * var3;
         Class2532 var6 = this.method10657(var5);
         this.field16671[var4 * 2] = var6.field16737;
         this.field16671[var4 * 2 + 1] = var6.field16738;
      }
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      float[] var4 = new float[8];
      float[] var5 = new float[8];
      var4[0] = this.field16716.field16737;
      var4[1] = this.field16716.field16738;
      var4[2] = this.field16717.field16737;
      var4[3] = this.field16717.field16738;
      var4[4] = this.field16718.field16737;
      var4[5] = this.field16718.field16738;
      var4[6] = this.field16719.field16737;
      var4[7] = this.field16719.field16738;
      var1.method29529(var4, 0, var5, 0, 4);
      return new Class2529(new Class2532(var5[0], var5[1]), new Class2532(var5[2], var5[3]), new Class2532(var5[4], var5[5]), new Class2532(var5[6], var5[7]));
   }

   @Override
   public boolean method10612() {
      return false;
   }
}
