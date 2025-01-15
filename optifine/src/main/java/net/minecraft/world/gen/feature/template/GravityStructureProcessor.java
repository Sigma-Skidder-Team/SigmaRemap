package net.minecraft.world.gen.feature.template;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.Heightmap;

public class GravityStructureProcessor extends StructureProcessor
{
    private final Heightmap.Type heightmap;
    private final int offset;

    public GravityStructureProcessor(Heightmap.Type p_i1453_1_, int p_i1453_2_)
    {
        this.heightmap = p_i1453_1_;
        this.offset = p_i1453_2_;
    }

    public GravityStructureProcessor(Dynamic<?> p_i1454_1_)
    {
        this(Heightmap.Type.getTypeFromId(p_i1454_1_.get("heightmap").asString(Heightmap.Type.WORLD_SURFACE_WG.getId())), p_i1454_1_.get("offset").asInt(0));
    }

    @Nullable
    public Template.BlockInfo process(IWorldReader worldReaderIn, BlockPos pos, Template.BlockInfo p_215194_3_, Template.BlockInfo blockInfo, PlacementSettings placementSettingsIn)
    {
        int i = worldReaderIn.getHeight(this.heightmap, blockInfo.pos.getX(), blockInfo.pos.getZ()) + this.offset;
        int j = p_215194_3_.pos.getY();
        return new Template.BlockInfo(new BlockPos(blockInfo.pos.getX(), i + j, blockInfo.pos.getZ()), blockInfo.state, blockInfo.nbt);
    }

    protected IStructureProcessorType getType()
    {
        return IStructureProcessorType.GRAVITY;
    }

    protected <T> Dynamic<T> serialize0(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("heightmap"), ops.createString(this.heightmap.getId()), ops.createString("offset"), ops.createInt(this.offset))));
    }
}
