package mapped;

public class Class5429 implements Class5422 {
   private static String[] field24163;
   private final Class5422 field24164;
   private final TextureAtlasSprite field24165;

   public Class5429(Class5422 var1, TextureAtlasSprite var2) {
      this.field24164 = var1;
      this.field24165 = var2;
   }

   @Override
   public Class5422 pos(double var1, double var3, double var5) {
      return this.field24164.pos(var1, var3, var5);
   }

   @Override
   public Class5422 color(int var1, int var2, int var3, int var4) {
      return this.field24164.color(var1, var2, var3, var4);
   }

   @Override
   public Class5422 method17027(float var1, float var2) {
      return this.field24164.method17027(this.field24165.method7461((double)(var1 * 16.0F)), this.field24165.method7464((double)(var2 * 16.0F)));
   }

   @Override
   public Class5422 method17028(int var1, int var2) {
      return this.field24164.method17028(var1, var2);
   }

   @Override
   public Class5422 method17029(int var1, int var2) {
      return this.field24164.method17029(var1, var2);
   }

   @Override
   public Class5422 method17030(float var1, float var2, float var3) {
      return this.field24164.method17030(var1, var2, var3);
   }

   @Override
   public void endVertex() {
      this.field24164.endVertex();
   }

   @Override
   public void method17032(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      this.field24164
         .method17032(
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            var7,
            this.field24165.method7461((double)(var8 * 16.0F)),
            this.field24165.method7464((double)(var9 * 16.0F)),
            var10,
            var11,
            var12,
            var13,
            var14
         );
   }
}
