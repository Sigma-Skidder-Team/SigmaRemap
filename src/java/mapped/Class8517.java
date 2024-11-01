package mapped;

public class Class8517 implements Class8518 {
   private static String[] field38218;
   private Class2532 field38219 = new Class2532(0.0F, 0.0F);
   private Class2532 field38220;
   private Class2532 field38221;
   private Color field38222;
   private Color field38223;
   private boolean field38224 = false;

   public Class8517(float var1, float var2, Color var3, float var4, float var5, Color var6) {
      this(var1, var2, var3, var4, var5, var6, false);
   }

   public Class8517(float var1, float var2, Color var3, float var4, float var5, Color var6, boolean var7) {
      this(new Class2532(var1, var2), var3, new Class2532(var4, var5), var6, var7);
   }

   public Class8517(Class2532 var1, Color var2, Class2532 var3, Color var4, boolean var5) {
      this.field38220 = new Class2532(var1);
      this.field38221 = new Class2532(var3);
      this.field38222 = new Color(var2);
      this.field38223 = new Color(var4);
      this.field38224 = var5;
   }

   public Class8517 method30166() {
      return new Class8517(this.field38220, this.field38223, this.field38221, this.field38222, this.field38224);
   }

   public void method30167(boolean var1) {
      this.field38224 = var1;
   }

   public Class2532 method30168() {
      return this.field38220;
   }

   public Class2532 method30169() {
      return this.field38221;
   }

   public Color method30170() {
      return this.field38222;
   }

   public Color method30171() {
      return this.field38223;
   }

   public void method30172(float var1, float var2) {
      this.method30173(new Class2532(var1, var2));
   }

   public void method30173(Class2532 var1) {
      this.field38220 = new Class2532(var1);
   }

   public void method30174(float var1, float var2) {
      this.method30175(new Class2532(var1, var2));
   }

   public void method30175(Class2532 var1) {
      this.field38221 = new Class2532(var1);
   }

   public void method30176(Color var1) {
      this.field38222 = new Color(var1);
   }

   public void method30177(Color var1) {
      this.field38223 = new Color(var1);
   }

   @Override
   public Color method30178(Class2520 var1, float var2, float var3) {
      return !this.field38224 ? this.method30179(var2, var3) : this.method30179(var2 - var1.method10584(), var3 - var1.method10586());
   }

   public Color method30179(float var1, float var2) {
      float var5 = this.field38221.method10683() - this.field38220.method10683();
      float var6 = this.field38221.method10684() - this.field38220.method10684();
      float var7 = -var6;
      float var9 = var5 * var5 - var7 * var6;
      if (var9 != 0.0F) {
         float var10 = var7 * (this.field38220.method10684() - var2) - var5 * (this.field38220.method10683() - var1);
         var10 /= var9;
         float var11 = var5 * (this.field38220.method10684() - var2) - var6 * (this.field38220.method10683() - var1);
         var11 /= var9;
         float var12 = var10;
         if (var10 < 0.0F) {
            var12 = 0.0F;
         }

         if (var12 > 1.0F) {
            var12 = 1.0F;
         }

         float var13 = 1.0F - var12;
         Color var14 = new Color(1, 1, 1, 1);
         var14.r = var12 * this.field38223.r + var13 * this.field38222.r;
         var14.b = var12 * this.field38223.b + var13 * this.field38222.b;
         var14.g = var12 * this.field38223.g + var13 * this.field38222.g;
         var14.a = var12 * this.field38223.a + var13 * this.field38222.a;
         return var14;
      } else {
         return Color.field16447;
      }
   }

   @Override
   public Class2532 method30180(Class2520 var1, float var2, float var3) {
      return this.field38219;
   }
}
