package mapped;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class Class3363 extends Class3241 {
   private static String[] field18929;
   public static final Class6408 field18930 = Block.method11539(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public Class3363(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public boolean method11534(BlockState var1) {
      return true;
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18930;
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      super.method11512(var1, var2, var3, var4);

      for (int var7 = -2; var7 <= 2; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            if (var7 > -2 && var7 < 2 && var8 == -1) {
               var8 = 2;
            }

            if (var4.nextInt(16) == 0) {
               for (int var9 = 0; var9 <= 1; var9++) {
                  BlockPos var10 = var3.method8336(var7, var9, var8);
                  if (var2.getBlockState(var10).method23448(Blocks.field36525)) {
                     if (!var2.method7007(var3.method8336(var7 / 2, 0, var8 / 2))) {
                        break;
                     }

                     var2.method6746(
                        Class7940.field34066,
                        (double)var3.getX() + 0.5,
                        (double)var3.getY() + 2.0,
                        (double)var3.getZ() + 0.5,
                        (double)((float)var7 + var4.nextFloat()) - 0.5,
                        (double)((float)var9 - var4.nextFloat() - 1.0F),
                        (double)((float)var8 + var4.nextFloat()) - 0.5
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class934();
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      TileEntity var6 = var2.getTileEntity(var3);
      if (!(var6 instanceof Class934)) {
         return null;
      } else {
         ITextComponent var7 = ((Class933)var6).getDisplayName();
         return new Class953((var2x, var3x, var4) -> new Class5822(var2x, var3x, Class8786.method31714(var2, var3)), var7);
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, Class880 var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class934) {
            ((Class934)var8).method3698(var5.method32149());
         }
      }
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
