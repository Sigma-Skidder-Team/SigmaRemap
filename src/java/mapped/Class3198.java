package mapped;

import net.minecraft.block.BlockState;

public abstract class Class3198 extends Block {
   public static final Class8553 field18484 = Class8820.field39722;

   public Class3198(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18484, var2.method252(var1.<Direction>method23463(field18484)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18484)));
   }
}
