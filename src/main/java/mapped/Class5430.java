package mapped;

public class Class5430 implements IVertexBuilder {
   private static String[] field24166;
   private IRenderTypeBuffer.Impl field24167 = null;

   public Class5430(IRenderTypeBuffer.Impl var1) {
      this.field24167 = var1;
   }

   @Override
   public IRenderTypeBuffer.Impl method17049() {
      return this.field24167;
   }

   @Override
   public IVertexBuilder pos(double var1, double var3, double var5) {
      return this;
   }

   @Override
   public IVertexBuilder color(int var1, int var2, int var3, int var4) {
      return this;
   }

   @Override
   public IVertexBuilder tex(float var1, float var2) {
      return this;
   }

   @Override
   public IVertexBuilder method17028(int var1, int var2) {
      return this;
   }

   @Override
   public IVertexBuilder method17029(int var1, int var2) {
      return this;
   }

   @Override
   public IVertexBuilder method17030(float var1, float var2, float var3) {
      return this;
   }

   @Override
   public void endVertex() {
   }
}
