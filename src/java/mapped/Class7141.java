package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Class7141 extends Class7139 {
   public static final Codec<Class7141> field30700 = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(Class7141::new, var0 -> var0.field30701).codec();
   private final float field30701;

   public Class7141(float var1) {
      this.field30701 = var1;
   }

   @Override
   public Class9542<?> method22268() {
      return Class9542.field44431;
   }

   @Override
   public void method22269(ISeedReader var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, Class9764 var6) {
      if (!(var2.nextFloat() >= this.field30701)) {
         Direction var9 = Class3366.method11951(var2);
         int var10 = var4.isEmpty()
            ? Math.min(((BlockPos)var3.get(0)).getY() + 1 + var2.nextInt(3), ((BlockPos)var3.get(var3.size() - 1)).getY())
            : Math.max(((BlockPos)var4.get(0)).getY() - 1, ((BlockPos)var3.get(0)).getY());
         List var11 = var3.stream().filter(var1x -> var1x.getY() == var10).collect(Collectors.toList());
         if (!var11.isEmpty()) {
            BlockPos var12 = (BlockPos)var11.get(var2.nextInt(var11.size()));
            BlockPos var13 = var12.method8349(var9);
            if (Class2898.method11221(var1, var13) && Class2898.method11221(var1, var13.method8349(Direction.SOUTH))) {
               BlockState var14 = Blocks.field37117.method11579().method23465(Class3366.field18935, Direction.SOUTH);
               this.method22274(var1, var13, var14, var5, var6);
               TileEntity var15 = var1.getTileEntity(var13);
               if (var15 instanceof BeehiveTileEntity) {
                  BeehiveTileEntity var16 = (BeehiveTileEntity)var15;
                  int var17 = 2 + var2.nextInt(2);

                  for (int var18 = 0; var18 < var17; var18++) {
                     Class1017 var19 = new Class1017(EntityType.field41009, var1.method6970());
                     var16.method3922(var19, false, var2.nextInt(599));
                  }
               }
            }
         }
      }
   }
}
