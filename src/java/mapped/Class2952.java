package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Class2952 extends Class2898<Class4712> {
   public Class2952(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      ChunkPos var8 = new ChunkPos(var4);
      List<Integer> var9 = IntStream.rangeClosed(var8.getX(), var8.method24358()).boxed().collect(Collectors.toList());
      Collections.shuffle(var9, var3);
      List<Integer> var10 = IntStream.rangeClosed(var8.getZ(), var8.method24359()).boxed().collect(Collectors.toList());
      Collections.shuffle(var10, var3);
      BlockPos.Mutable var11 = new BlockPos.Mutable();

      for (Integer var13 : var9) {
         for (Integer var15 : var10) {
            var11.method8372(var13, 0, var15);
            BlockPos var16 = var1.method7006(Heightmap.Type.field300, var11);
            if (var1.method7007(var16) || var1.getBlockState(var16).method23414(var1, var16).isEmpty()) {
               var1.setBlockState(var16, Blocks.CHEST.method11579(), 2);
               Class939.method3740(var1, var3, var16, Class8793.field39534);
               BlockState var17 = Blocks.TORCH.method11579();

               for (Direction var19 : Class76.field161) {
                  BlockPos var20 = var16.method8349(var19);
                  if (var17.method23443(var1, var20)) {
                     var1.setBlockState(var20, var17, 2);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }
}
