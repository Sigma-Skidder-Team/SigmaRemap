package mapped;

public class Class238<T extends Entity & Class1069, M extends Class2827<T>> extends Class219<T, M> {
   private static String[] field889;
   private final ResourceLocation field890;
   private final M field891;

   public Class238(Class5714<T, M> var1, M var2, ResourceLocation var3) {
      super(var1);
      this.field891 = (M)var2;
      this.field890 = var3;
   }

   @Override
   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (((Class1069)var4).method4943()) {
         this.method825().method11027(this.field891);
         this.field891.method10997((T)var4, var5, var6, var7);
         this.field891.method10998((T)var4, var5, var6, var8, var9, var10);
         Class5422 var13 = var2.method25597(Class4520.method14312(this.field890));
         this.field891.method11016(var1, var13, var3, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}