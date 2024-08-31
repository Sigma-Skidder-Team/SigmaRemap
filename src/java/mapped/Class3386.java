package mapped;

import net.minecraft.block.BlockState;

public class Class3386 extends Block {
   private static String[] field18993;
   public static final Class8552<Class113> field18994 = Class8820.field39713;

   public Class3386(AbstractBlock var1) {
      super(var1);
      this.method11578(this.method11579().method23465(field18994, Class113.field414));
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      switch (Class9779.field45746[var2.ordinal()]) {
         case 1:
         case 2:
            switch (Class9779.field45745[var1.<Class113>method23463(field18994).ordinal()]) {
               case 1:
                  return var1.method23465(field18994, Class113.field415);
               case 2:
                  return var1.method23465(field18994, Class113.field413);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18994);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18994, var1.method18354().method544());
   }
}
