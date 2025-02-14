package mapped;

import net.minecraft.util.math.vector.Vector3f;

public class Class5423 implements IVertexBuilder {
   private final IVertexBuilder field24106;
   private final IVertexBuilder field24107;

   public Class5423(IVertexBuilder var1, IVertexBuilder var2) {
      if (var1 != var2) {
         this.field24106 = var1;
         this.field24107 = var2;
      } else {
         throw new IllegalArgumentException("Duplicate delegates");
      }
   }

   @Override
   public IVertexBuilder pos(double var1, double var3, double var5) {
      this.field24106.pos(var1, var3, var5);
      this.field24107.pos(var1, var3, var5);
      return this;
   }

   @Override
   public IVertexBuilder color(int var1, int var2, int var3, int var4) {
      this.field24106.color(var1, var2, var3, var4);
      this.field24107.color(var1, var2, var3, var4);
      return this;
   }

   @Override
   public IVertexBuilder tex(float var1, float var2) {
      this.field24106.tex(var1, var2);
      this.field24107.tex(var1, var2);
      return this;
   }

   @Override
   public IVertexBuilder method17028(int var1, int var2) {
      this.field24106.method17028(var1, var2);
      this.field24107.method17028(var1, var2);
      return this;
   }

   @Override
   public IVertexBuilder method17029(int var1, int var2) {
      this.field24106.method17029(var1, var2);
      this.field24107.method17029(var1, var2);
      return this;
   }

   @Override
   public IVertexBuilder method17030(float var1, float var2, float var3) {
      this.field24106.method17030(var1, var2, var3);
      this.field24107.method17030(var1, var2, var3);
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
      this.field24106.method17032(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      this.field24107.method17032(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   @Override
   public void endVertex() {
      this.field24106.endVertex();
      this.field24107.endVertex();
   }

   @Override
   public void method17042(TextureAtlasSprite var1) {
      this.field24106.method17042(var1);
      this.field24107.method17042(var1);
   }

   @Override
   public void method17043(TextureAtlasSprite var1) {
      this.field24106.method17043(var1);
      this.field24107.method17043(var1);
   }

   @Override
   public void method17044(RenderType var1) {
      this.field24106.method17044(var1);
      this.field24107.method17044(var1);
   }

   @Override
   public Vector3f method17045(Vector3f var1) {
      return this.field24107.method17045(var1);
   }

   @Override
   public Vector3f method17046(float var1, float var2, float var3) {
      return this.field24107.method17046(var1, var2, var3);
   }

   @Override
   public float[] method17047(float var1, float var2, float var3, float var4) {
      return this.field24107.method17047(var1, var2, var3, var4);
   }

   @Override
   public int[] method17048(int var1, int var2, int var3, int var4) {
      return this.field24107.method17048(var1, var2, var3, var4);
   }

   @Override
   public IRenderTypeBuffer.Impl method17049() {
      return this.field24107.method17049();
   }
}
