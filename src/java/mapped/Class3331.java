package mapped;

public class Class3331 extends Class3257 {
   private static String[] field18839;

   public Class3331(Class5643 var1) {
      super(var1);
   }

   @Override
   public boolean method11714(Class8848 var1, Class1655 var2, Class7380 var3, BlockPos var4, Class880 var5) {
      if (!var2.field9020 && !var3.method23383().method11540(Class7645.field32798)) {
         var1.method32121(1, var5, var0 -> var0.method3184(Class2106.field13731));
      }

      return !var3.method23446(Class7645.field32767)
            && !var3.method23448(Blocks.field36481)
            && !var3.method23448(Blocks.field36482)
            && !var3.method23448(Blocks.field36483)
            && !var3.method23448(Blocks.field36484)
            && !var3.method23448(Blocks.field36636)
            && !var3.method23448(Blocks.field36659)
            && !var3.method23446(Class7645.field32734)
         ? super.method11714(var1, var2, var3, var4, var5)
         : true;
   }

   @Override
   public boolean method11715(Class7380 var1) {
      return var1.method23448(Blocks.field36481) || var1.method23448(Blocks.field36535) || var1.method23448(Blocks.field36659);
   }

   @Override
   public float method11708(Class8848 var1, Class7380 var2) {
      if (!var2.method23448(Blocks.field36481) && !var2.method23446(Class7645.field32767)) {
         return !var2.method23446(Class7645.field32734) ? super.method11708(var1, var2) : 5.0F;
      } else {
         return 15.0F;
      }
   }
}
