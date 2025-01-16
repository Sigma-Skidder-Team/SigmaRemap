package net.minecraft.world.gen.placement;

import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap;

public class SurfacePlus32 extends Placement<FrequencyConfig>
{
    public SurfacePlus32(Function < Dynamic<?>, ? extends FrequencyConfig > p_i3555_1_)
    {
        super(p_i3555_1_);
    }

    public Stream<BlockPos> getPositions(IWorld worldIn, ChunkGenerator <? extends GenerationSettings > generatorIn, Random random, FrequencyConfig configIn, BlockPos pos)
    {
        return IntStream.range(0, configIn.count).mapToObj((p_227441_3_) ->
        {
            int i = random.nextInt(16) + pos.getX();
            int j = random.nextInt(16) + pos.getZ();
            int k = worldIn.getHeight(Heightmap.Type.MOTION_BLOCKING, i, j) + 32;
            return k <= 0 ? null : new BlockPos(i, random.nextInt(k), j);
        }).filter(Objects::nonNull);
    }
}