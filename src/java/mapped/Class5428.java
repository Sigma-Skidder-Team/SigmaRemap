package mapped;

public class Class5428 extends Class5424 {
   private static String[] field24156;
   private final Class5422 field24157;
   private double field24158;
   private double field24159;
   private double field24160;
   private float field24161;
   private float field24162;

   public Class5428(Class5422 var1, int var2, int var3, int var4, int var5) {
      this.field24157 = var1;
      super.method17054(var2, var3, var4, var5);
   }

   @Override
   public void method17054(int var1, int var2, int var3, int var4) {
   }

   @Override
   public Class5422 pos(double var1, double var3, double var5) {
      this.field24158 = var1;
      this.field24159 = var3;
      this.field24160 = var5;
      return this;
   }

   @Override
   public Class5422 color(int var1, int var2, int var3, int var4) {
      return this;
   }

   @Override
   public Class5422 method17027(float var1, float var2) {
      this.field24161 = var1;
      this.field24162 = var2;
      return this;
   }

   @Override
   public Class5422 method17028(int var1, int var2) {
      return this;
   }

   @Override
   public Class5422 method17029(int var1, int var2) {
      return this;
   }

   @Override
   public Class5422 method17030(float var1, float var2, float var3) {
      return this;
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
      this.field24157
         .pos((double)var1, (double)var2, (double)var3)
         .color(this.field24109, this.field24110, this.field24111, this.field24112)
         .method17027(var8, var9)
         .endVertex();
   }

   @Override
   public void endVertex() {
      this.field24157
         .pos(this.field24158, this.field24159, this.field24160)
         .color(this.field24109, this.field24110, this.field24111, this.field24112)
         .method17027(this.field24161, this.field24162)
         .endVertex();
   }
}
