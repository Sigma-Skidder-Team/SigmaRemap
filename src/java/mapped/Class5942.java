package mapped;

public abstract class Class5942<T extends Class944> {
   public final Class8086 field25928;
   private Class4387 field25929 = null;
   private ResourceLocation field25930 = null;

   public Class5942(Class8086 var1) {
      this.field25928 = var1;
   }

   public abstract void method18462(T var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6);

   public boolean method18461(T var1) {
      return false;
   }

   public Class4862<Class8992, Class4387> method18463() {
      return this.field25929 != null ? Class4862.method15006(this.field25929) : null;
   }

   public void method18464(Class4862<Class8992, Class4387> var1) {
      this.field25929 = (Class4387)var1.method15004().get();
   }

   public ResourceLocation method18465() {
      return this.field25930;
   }

   public void method18466(ResourceLocation var1) {
      this.field25930 = var1;
   }
}
