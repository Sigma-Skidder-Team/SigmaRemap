package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3430 extends Class3429 {
   private static String[] field19190;
   public static final Class8552<Class96> field19191 = Class8820.field39736;

   public Class3430(AbstractBlock var1) {
      super(false, var1);
      this.method11578(this.field18612.method35393().method23465(field19191, Class96.field247));
   }

   @Override
   public void method12091(BlockState var1, World var2, BlockPos var3, Block var4) {
      if (var4.method11579().method23401() && new Class9435(var2, var3, var1).method36240() == 3) {
         this.method12092(var2, var3, var1, false);
      }
   }

   @Override
   public Class8550<Class96> method12093() {
      return field19191;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      switch (Class8191.field35214[var2.ordinal()]) {
         case 1:
            switch (Class8191.field35213[var1.<Class96>method23463(field19191).ordinal()]) {
               case 1:
                  return var1.method23465(field19191, Class96.field250);
               case 2:
                  return var1.method23465(field19191, Class96.field249);
               case 3:
                  return var1.method23465(field19191, Class96.field252);
               case 4:
                  return var1.method23465(field19191, Class96.field251);
               case 5:
                  return var1.method23465(field19191, Class96.field255);
               case 6:
                  return var1.method23465(field19191, Class96.field256);
               case 7:
                  return var1.method23465(field19191, Class96.field253);
               case 8:
                  return var1.method23465(field19191, Class96.field254);
            }
         case 2:
            switch (Class8191.field35213[var1.<Class96>method23463(field19191).ordinal()]) {
               case 1:
                  return var1.method23465(field19191, Class96.field251);
               case 2:
                  return var1.method23465(field19191, Class96.field252);
               case 3:
                  return var1.method23465(field19191, Class96.field250);
               case 4:
                  return var1.method23465(field19191, Class96.field249);
               case 5:
                  return var1.method23465(field19191, Class96.field256);
               case 6:
                  return var1.method23465(field19191, Class96.field253);
               case 7:
                  return var1.method23465(field19191, Class96.field254);
               case 8:
                  return var1.method23465(field19191, Class96.field255);
               case 9:
                  return var1.method23465(field19191, Class96.field248);
               case 10:
                  return var1.method23465(field19191, Class96.field247);
            }
         case 3:
            switch (Class8191.field35213[var1.<Class96>method23463(field19191).ordinal()]) {
               case 1:
                  return var1.method23465(field19191, Class96.field252);
               case 2:
                  return var1.method23465(field19191, Class96.field251);
               case 3:
                  return var1.method23465(field19191, Class96.field249);
               case 4:
                  return var1.method23465(field19191, Class96.field250);
               case 5:
                  return var1.method23465(field19191, Class96.field254);
               case 6:
                  return var1.method23465(field19191, Class96.field255);
               case 7:
                  return var1.method23465(field19191, Class96.field256);
               case 8:
                  return var1.method23465(field19191, Class96.field253);
               case 9:
                  return var1.method23465(field19191, Class96.field248);
               case 10:
                  return var1.method23465(field19191, Class96.field247);
            }
         default:
            return var1;
      }
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      Class96 var5 = var1.<Class96>method23463(field19191);
      switch (Class8191.field35215[var2.ordinal()]) {
         case 1:
            switch (Class8191.field35213[var5.ordinal()]) {
               case 3:
                  return var1.method23465(field19191, Class96.field252);
               case 4:
                  return var1.method23465(field19191, Class96.field251);
               case 5:
                  return var1.method23465(field19191, Class96.field256);
               case 6:
                  return var1.method23465(field19191, Class96.field255);
               case 7:
                  return var1.method23465(field19191, Class96.field254);
               case 8:
                  return var1.method23465(field19191, Class96.field253);
               default:
                  return super.method11501(var1, var2);
            }
         case 2:
            switch (Class8191.field35213[var5.ordinal()]) {
               case 1:
                  return var1.method23465(field19191, Class96.field250);
               case 2:
                  return var1.method23465(field19191, Class96.field249);
               case 3:
               case 4:
               default:
                  break;
               case 5:
                  return var1.method23465(field19191, Class96.field254);
               case 6:
                  return var1.method23465(field19191, Class96.field253);
               case 7:
                  return var1.method23465(field19191, Class96.field256);
               case 8:
                  return var1.method23465(field19191, Class96.field255);
            }
         default:
            return super.method11501(var1, var2);
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19191);
   }
}
