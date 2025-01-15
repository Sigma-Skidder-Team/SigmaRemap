package net.minecraft.world.gen.feature.template;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorldReader;

public abstract class StructureProcessor
{
    @Nullable
    public abstract Template.BlockInfo process(IWorldReader worldReaderIn, BlockPos pos, Template.BlockInfo p_215194_3_, Template.BlockInfo blockInfo, PlacementSettings placementSettingsIn);

    protected abstract IStructureProcessorType getType();

    protected abstract <T> Dynamic<T> serialize0(DynamicOps<T> ops);

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.mergeInto(this.serialize0(ops).getValue(), ops.createString("processor_type"), ops.createString(Registry.STRUCTURE_PROCESSOR.getKey(this.getType()).toString())));
    }
}
