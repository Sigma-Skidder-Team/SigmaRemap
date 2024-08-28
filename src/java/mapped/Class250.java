package mapped;

public class Class250<T extends PlayerEntity> extends Class219<T, Class2894<T>> {
   private final Class2814 field907 = new Class2814();

   public Class250(Class5714<T, Class2894<T>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.method840(var1, var2, var3, (T)var4, var5, var6, var9, var10, true);
      this.method840(var1, var2, var3, (T)var4, var5, var6, var9, var10, false);
   }

   private void method840(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, boolean var9) {
      Class39 var12 = !var9 ? var4.method2971() : var4.method2969();
      Class8992.method33199(var12.method126("id")).filter(var0 -> var0 == Class8992.field41062).ifPresent(var11 -> {
         Entity var14 = Class7944.method26874().field1000;
         if (var4 instanceof AbstractClientPlayerEntity) {
            AbstractClientPlayerEntity var15 = (AbstractClientPlayerEntity)var4;
            Class1014 var16 = !var9 ? var15.field6106 : var15.field6105;
            if (var16 != null) {
               Class7944.method26874().field1000 = var16;
               if (Class7944.method26921()) {
                  Class8981.method33079(var16);
               }
            }
         }

         var1.method35294();
         var1.method35291(!var9 ? -0.4F : 0.4F, !var4.method3336() ? -1.5 : -1.3F, 0.0);
         Class5422 var17 = var2.method25597(this.field907.method11028(Class5697.field25067[var12.method122("Variant")]));
         this.field907.method11019(var1, var17, var3, Class213.field798, var5, var6, var7, var8, var4.field5055);
         var1.method35295();
         Class7944.method26874().field1000 = var14;
         if (Class7944.method26921()) {
            Class8981.method33079(var14);
         }
      });
   }
}
