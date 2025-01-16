// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.stream.Collectors;

import com.mojang.datafixers.util.Pair;

import java.util.Map;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public interface IFluidState extends IStateHolder<IFluidState> {
    Fluid getFluid();

    default boolean isSource() {
        return this.getFluid().isSource(this);
    }

    default boolean isEmpty() {
        return this.getFluid().isEmpty();
    }

    default float getActualHeight(final IBlockReader class1855, final BlockPos class1856) {
        return this.getFluid().getActualHeight(this, class1855, class1856);
    }

    default float getHeight() {
        return this.getFluid().getHeight(this);
    }

    default int getLevel() {
        return this.getFluid().getLevel(this);
    }

    default boolean shouldRenderSides(final IBlockReader worldIn, final BlockPos pos) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                final BlockPos blockpos = pos.add(i, 0, j);
                if (!worldIn.getFluidState(blockpos).getFluid().isEquivalentTo(this.getFluid()) && !worldIn.getBlockState(blockpos).isOpaqueCube(worldIn, blockpos)) {
                    return true;
                }
            }
        }
        return false;
    }

    default void tick(final World class1847, final BlockPos class1848) {
        this.getFluid().tick(class1847, class1848, this);
    }

    default void animateTick(final World class1847, final BlockPos class1848, final Random random) {
        this.getFluid().animateTick(class1847, class1848, this, random);
    }

    default boolean ticksRandomly() {
        return this.getFluid().ticksRandomly();
    }

    default void randomTick(final World class1847, final BlockPos class1848, final Random random) {
        this.getFluid().randomTick(class1847, class1848, this, random);
    }

    default Vec3d getFlow(final IBlockReader class1855, final BlockPos class1856) {
        return this.getFluid().getFlow(class1855, class1856, this);
    }

    default BlockState getBlockState() {
        return this.getFluid().getBlockState(this);
    }

    @Nullable
    default IParticleData getDripParticleData() {
        return this.getFluid().getDripParticleData();
    }

    default boolean isTagged(final Class7909<Fluid> class7909) {
        return this.getFluid().isIn(class7909);
    }

    default float getExplosionResistance() {
        return this.getFluid().getExplosionResistance();
    }

    default boolean canDisplace(final IBlockReader class1855, final BlockPos class1856, final Fluid class1857, final Direction class1858) {
        return this.getFluid().canDisplace(this, class1855, class1856, class1857, class1858);
    }

    static <T> Dynamic<T> serialize(DynamicOps<T> p_215680_0_, IFluidState p_215680_1_) {
        final ImmutableMap<IProperty<?>, Comparable<?>> immutablemap = p_215680_1_.getValues();
        T t;
        if (immutablemap.isEmpty()) {
            t = p_215680_0_.createMap(ImmutableMap.of(p_215680_0_.createString("Name"), p_215680_0_.createString(Registry.FLUID.getKey(p_215680_1_.getFluid()).toString())));
        } else {
            t = p_215680_0_.createMap(ImmutableMap.of(p_215680_0_.createString("Name"), p_215680_0_.createString(Registry.FLUID.getKey(p_215680_1_.getFluid()).toString()), p_215680_0_.createString("Properties"), p_215680_0_.createMap(immutablemap.entrySet().stream().map((p_215675_1_) ->
            {
                return Pair.of(p_215680_0_.createString(p_215675_1_.getKey().getName()), p_215680_0_.createString(IStateHolder.getName(p_215675_1_.getKey(), p_215675_1_.getValue())));
            }).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))));
        }

        return new Dynamic<>(p_215680_0_, t);
    }

    static <T> IFluidState deserialize(Dynamic<T> dynamic) {
        Fluid fluid = Registry.FLUID.getOrDefault(new ResourceLocation(dynamic.getElement("Name").flatMap(dynamic.getOps()::getStringValue).orElse("minecraft:empty")));
        Map<String, String> map = dynamic.get("Properties").asMap(dynamic2 -> dynamic2.asString(""), dynamic3 -> dynamic3.asString(""));
        IFluidState ifluidstate = fluid.getDefaultState();
        StateContainer<Fluid, IFluidState> statecontainer = fluid.getStateContainer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            final String s = entry.getKey();
            final IProperty<?> iproperty = statecontainer.getProperty(s);
            if (iproperty == null) {
                continue;
            }
            ifluidstate = IStateHolder.withString(ifluidstate, iproperty, s, dynamic.toString(), entry.getValue());
        }
        return ifluidstate;
    }

    default VoxelShape getShape(final IBlockReader class1855, final BlockPos class1856) {
        return this.getFluid().method22167(this, class1855, class1856);
    }
}
