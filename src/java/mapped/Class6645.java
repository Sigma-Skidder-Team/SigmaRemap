package mapped;

public class Class6645 implements Class6646<Class6647> {
   private static String[] field29207;
   public final ResourceLocation field29208;
   public final Class6647 field29209;
   public final Class8657 field29210;

   public Class6645(Class8657 var1, ResourceLocation var2, Class6647 var3) {
      this.field29210 = var1;
      this.field29208 = var2;
      this.field29209 = var3;
   }

   @Override
   public int method20287() {
      Class6648 var3 = (Class6648)Class8657.method31158(this.field29210).get(this.field29208);
      return var3 != null ? var3.method20287() : 0;
   }

   public Class6647 method20290() {
      Class6648 var3 = (Class6648)Class8657.method31158(this.field29210).get(this.field29208);
      if (var3 == null) {
         return Class274.field1051;
      } else {
         Class6647 var4 = var3.method20290();
         return new Class6647(
            var4.method20291().toString(),
            var4.method20293() * this.field29209.method20293(),
            var4.method20294() * this.field29209.method20294(),
            this.field29209.method20287(),
            Class2221.field14506,
            var4.method20296() || this.field29209.method20296(),
            var4.method20297(),
            var4.method20298()
         );
      }
   }

   @Override
   public void method20289(Class4386 var1) {
      Class6648 var4 = (Class6648)Class8657.method31158(this.field29210).get(this.field29208);
      if (var4 != null) {
         var4.method20289(var1);
      }
   }
}
