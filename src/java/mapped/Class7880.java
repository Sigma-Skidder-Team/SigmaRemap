package mapped;

import net.minecraft.block.*;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IBlockReader;
import net.optifine.Config;

public class Class7880 {
   private static String[] field33822;
   private static IBakedModel field33823 = null;

   public static void method26418() {
      field33823 = Config.method26860().getBlockRendererDispatcher().getBlockModelShapes().method38153(Blocks.SNOW.getDefaultState());
   }

   public static IBakedModel method26419() {
      return field33823;
   }

   public static BlockState method26420() {
      return Blocks.SNOW.getDefaultState();
   }

   public static boolean method26421(IBlockDisplayReader var0, BlockState var1, BlockPos var2) {
      if (var0 instanceof IBlockReader) {
         return method26423(var0, var1, var2) ? method26422(var0, var2) : false;
      } else {
         return false;
      }
   }

   private static boolean method26422(IBlockReader var0, BlockPos var1) {
      Block var4 = Blocks.SNOW;
      if (var0.getBlockState(var1.north()).getBlock() == var4
         || var0.getBlockState(var1.south()).getBlock() == var4
         || var0.getBlockState(var1.west()).getBlock() == var4
         || var0.getBlockState(var1.east()).getBlock() == var4) {
         BlockState var5 = var0.getBlockState(var1.down());
         if (var5.method23409(var0, var1)) {
            return true;
         }

         Block var6 = var5.getBlock();
         if (var6 instanceof StairsBlock) {
            return var5.<Half>get(StairsBlock.HALF) == Half.TOP;
         }

         if (var6 instanceof SlabBlock) {
            return var5.<SlabType>get(SlabBlock.field18605) == SlabType.field218;
         }
      }

      return false;
   }

   private static boolean method26423(IBlockReader var0, BlockState var1, BlockPos var2) {
      if (!var1.method23409(var0, var2)) {
         Block var5 = var1.getBlock();
         if (var5 == Blocks.SNOW_BLOCK) {
            return false;
         } else if (!(var5 instanceof BushBlock)
            || !(var5 instanceof Class3456)
               && !(var5 instanceof Class3490)
               && !(var5 instanceof Class3479)
               && !(var5 instanceof SaplingBlock)
               && !(var5 instanceof Class3487)) {
            if (var5 instanceof FenceBlock
               || var5 instanceof FenceGateBlock
               || var5 instanceof Class3460
               || var5 instanceof Class3238
               || var5 instanceof Class3408
               || var5 instanceof Class3415) {
               return true;
            } else if (var5 instanceof Class3383) {
               return true;
            } else if (var5 instanceof StairsBlock) {
               return var1.<Half>get(StairsBlock.HALF) == Half.TOP;
            } else if (var5 instanceof SlabBlock) {
               return var1.<SlabType>get(SlabBlock.field18605) == SlabType.field218;
            } else if (var5 instanceof AbstractButtonBlock) {
               return var1.<AttachFace>get(AbstractButtonBlock.field18500) != AttachFace.field313;
            } else if (var5 instanceof Class3362) {
               return true;
            } else if (var5 instanceof Class3423) {
               return true;
            } else if (var5 instanceof Class3201) {
               return true;
            } else {
               return !(var5 instanceof Class3441) ? var5 instanceof Class3402 : true;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}
