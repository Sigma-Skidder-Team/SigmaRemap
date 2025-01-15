package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class7142 extends Class7139 {
   public static final Codec<Class7142> field30702 = Class6698.field29330.fieldOf("provider").xmap(Class7142::new, var0 -> var0.field30703).codec();
   private final Class6698 field30703;

   public Class7142(Class6698 var1) {
      this.field30703 = var1;
   }

   @Override
   public Class9542<?> method22268() {
      return Class9542.field44432;
   }

   @Override
   public void method22269(ISeedReader var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, MutableBoundingBox var6) {
      int var9 = ((BlockPos)var3.get(0)).getY();
      var3.stream().filter(var1x -> var1x.getY() == var9).forEach(var3x -> {
         this.method22280(var1, var2, var3x.west().north());
         this.method22280(var1, var2, var3x.method8348(2).north());
         this.method22280(var1, var2, var3x.west().method8344(2));
         this.method22280(var1, var2, var3x.method8348(2).method8344(2));

         for (int var6x = 0; var6x < 5; var6x++) {
            int var7 = var2.nextInt(64);
            int var8 = var7 % 8;
            int var9x = var7 / 8;
            if (var8 == 0 || var8 == 7 || var9x == 0 || var9x == 7) {
               this.method22280(var1, var2, var3x.add(-3 + var8, 0, -3 + var9x));
            }
         }
      });
   }

   private void method22280(IWorldGenerationReader var1, Random var2, BlockPos var3) {
      for (int var6 = -2; var6 <= 2; var6++) {
         for (int var7 = -2; var7 <= 2; var7++) {
            if (Math.abs(var6) != 2 || Math.abs(var7) != 2) {
               this.method22281(var1, var2, var3.add(var6, 0, var7));
            }
         }
      }
   }

   private void method22281(IWorldGenerationReader var1, Random var2, BlockPos var3) {
      for (int var6 = 2; var6 >= -3; var6--) {
         BlockPos var7 = var3.up(var6);
         if (Class2898.method11220(var1, var7)) {
            var1.setBlockState(var7, this.field30703.method20424(var2, var3), 19);
            break;
         }

         if (!Class2898.method11221(var1, var7) && var6 < 0) {
            break;
         }
      }
   }
}
