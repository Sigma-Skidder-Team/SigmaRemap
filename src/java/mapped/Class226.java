package mapped;

public abstract class Class226<T extends Entity, M extends Class2827<T>> extends Class219<T, M> {
   public Class226(Class5714<T, M> var1) {
      super(var1);
   }

   @Override
   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      Class5422 var13 = var2.method25597(this.method834());
      if (Class7944.method26921()) {
         Class8981.method33081();
      }

      Class7944.method26874().field1020 = true;
      this.method825().method11016(var1, var13, 15728640, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      Class7944.method26874().field1020 = false;
      if (Class7944.method26921()) {
         Class8981.method33082();
      }
   }

   public abstract Class4520 method834();
}
