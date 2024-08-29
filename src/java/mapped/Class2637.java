package mapped;

public class Class2637 extends Class2628 {
   private static String[] field16958;
   private final Class1098 field16959;

   public Class2637(Class1098 var1, double var2) {
      super(var1, var2, 8);
      this.field16959 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16959.method4393() && !this.field16959.method4402() && super.method10803();
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16959.method4396(false);
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16959.method4396(false);
   }

   @Override
   public void method10805() {
      super.method10805();
      this.field16959.method4396(this.method10838());
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      if (var1.method7007(var2.up())) {
         BlockState var5 = var1.getBlockState(var2);
         if (var5.method23448(Blocks.CHEST)) {
            return Class941.method3763(var1, var2) < 1;
         } else {
            return var5.method23448(Blocks.FURNACE) && var5.<Boolean>method23463(Class3353.field18876)
               ? true
               : var5.method23447(
                  BlockTags.field32770, var0 -> var0.<Class82>method23464(Class3250.field18713).<Boolean>map(var0x -> var0x != Class82.HEAD).orElse(true)
               );
         }
      } else {
         return false;
      }
   }
}
