package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.blockplacer.BlockPlacer;
import net.minecraft.world.gen.blockplacer.BlockPlacerType;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.BlockStateProviderType;

public class BlockClusterFeatureConfig implements IFeatureConfig
{
    public final BlockStateProvider stateProvider;
    public final BlockPlacer field_227290_b_;
    public final Set<Block> field_227291_c_;
    public final Set<BlockState> field_227292_d_;
    public final int field_227293_f_;
    public final int field_227294_g_;
    public final int field_227295_h_;
    public final int field_227296_i_;
    public final boolean field_227297_j_;
    public final boolean field_227298_k_;
    public final boolean field_227299_l_;

    private BlockClusterFeatureConfig(BlockStateProvider p_i4249_1_, BlockPlacer p_i4249_2_, Set<Block> p_i4249_3_, Set<BlockState> p_i4249_4_, int p_i4249_5_, int p_i4249_6_, int p_i4249_7_, int p_i4249_8_, boolean p_i4249_9_, boolean p_i4249_10_, boolean p_i4249_11_)
    {
        this.stateProvider = p_i4249_1_;
        this.field_227290_b_ = p_i4249_2_;
        this.field_227291_c_ = p_i4249_3_;
        this.field_227292_d_ = p_i4249_4_;
        this.field_227293_f_ = p_i4249_5_;
        this.field_227294_g_ = p_i4249_6_;
        this.field_227295_h_ = p_i4249_7_;
        this.field_227296_i_ = p_i4249_8_;
        this.field_227297_j_ = p_i4249_9_;
        this.field_227298_k_ = p_i4249_10_;
        this.field_227299_l_ = p_i4249_11_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        ImmutableMap.Builder<T, T> builder = ImmutableMap.builder();
        builder.put(ops.createString("state_provider"), this.stateProvider.serialize(ops)).put(ops.createString("block_placer"), this.field_227290_b_.serialize(ops)).put(ops.createString("whitelist"), ops.createList(this.field_227291_c_.stream().map((p_227301_1_) ->
        {
            return BlockState.serialize(ops, p_227301_1_.getDefaultState()).getValue();
        }))).put(ops.createString("blacklist"), ops.createList(this.field_227292_d_.stream().map((p_227302_1_) ->
        {
            return BlockState.serialize(ops, p_227302_1_).getValue();
        }))).put(ops.createString("tries"), ops.createInt(this.field_227293_f_)).put(ops.createString("xspread"), ops.createInt(this.field_227294_g_)).put(ops.createString("yspread"), ops.createInt(this.field_227295_h_)).put(ops.createString("zspread"), ops.createInt(this.field_227296_i_)).put(ops.createString("can_replace"), ops.createBoolean(this.field_227297_j_)).put(ops.createString("project"), ops.createBoolean(this.field_227298_k_)).put(ops.createString("need_water"), ops.createBoolean(this.field_227299_l_));
        return new Dynamic<>(ops, ops.createMap(builder.build()));
    }

    public static <T> BlockClusterFeatureConfig func_227300_a_(Dynamic<T> p_227300_0_)
    {
        BlockStateProviderType<?> blockstateprovidertype = Registry.BLOCK_STATE_PROVIDER_TYPE.getOrDefault(new ResourceLocation(p_227300_0_.get("state_provider").get("type").asString().orElseThrow(RuntimeException::new)));
        BlockPlacerType<?> blockplacertype = Registry.BLOCK_PLACER_TYPE.getOrDefault(new ResourceLocation(p_227300_0_.get("block_placer").get("type").asString().orElseThrow(RuntimeException::new)));
        return new BlockClusterFeatureConfig(blockstateprovidertype.func_227399_a_(p_227300_0_.get("state_provider").orElseEmptyMap()), blockplacertype.func_227263_a_(p_227300_0_.get("block_placer").orElseEmptyMap()), p_227300_0_.get("whitelist").asList(BlockState::deserialize).stream().map(BlockState::getBlock).collect(Collectors.toSet()), Sets.newHashSet(p_227300_0_.get("blacklist").asList(BlockState::deserialize)), p_227300_0_.get("tries").asInt(128), p_227300_0_.get("xspread").asInt(7), p_227300_0_.get("yspread").asInt(3), p_227300_0_.get("zspread").asInt(7), p_227300_0_.get("can_replace").asBoolean(false), p_227300_0_.get("project").asBoolean(true), p_227300_0_.get("need_water").asBoolean(false));
    }

    public static class Builder
    {
        private final BlockStateProvider field_227303_a_;
        private final BlockPlacer field_227304_b_;
        private Set<Block> field_227305_c_ = ImmutableSet.of();
        private Set<BlockState> field_227306_d_ = ImmutableSet.of();
        private int tryCount = 64;
        private int field_227308_f_ = 7;
        private int field_227309_g_ = 3;
        private int field_227310_h_ = 7;
        private boolean field_227311_i_;
        private boolean field_227312_j_ = true;
        private boolean field_227313_k_ = false;

        public Builder(BlockStateProvider p_i1513_1_, BlockPlacer p_i1513_2_)
        {
            this.field_227303_a_ = p_i1513_1_;
            this.field_227304_b_ = p_i1513_2_;
        }

        public BlockClusterFeatureConfig.Builder func_227316_a_(Set<Block> p_227316_1_)
        {
            this.field_227305_c_ = p_227316_1_;
            return this;
        }

        public BlockClusterFeatureConfig.Builder func_227319_b_(Set<BlockState> p_227319_1_)
        {
            this.field_227306_d_ = p_227319_1_;
            return this;
        }

        public BlockClusterFeatureConfig.Builder tries(int p_227315_1_)
        {
            this.tryCount = p_227315_1_;
            return this;
        }

        public BlockClusterFeatureConfig.Builder func_227318_b_(int p_227318_1_)
        {
            this.field_227308_f_ = p_227318_1_;
            return this;
        }

        public BlockClusterFeatureConfig.Builder func_227321_c_(int p_227321_1_)
        {
            this.field_227309_g_ = p_227321_1_;
            return this;
        }

        public BlockClusterFeatureConfig.Builder func_227323_d_(int p_227323_1_)
        {
            this.field_227310_h_ = p_227323_1_;
            return this;
        }

        public BlockClusterFeatureConfig.Builder func_227314_a_()
        {
            this.field_227311_i_ = true;
            return this;
        }

        public BlockClusterFeatureConfig.Builder func_227317_b_()
        {
            this.field_227312_j_ = false;
            return this;
        }

        public BlockClusterFeatureConfig.Builder func_227320_c_()
        {
            this.field_227313_k_ = true;
            return this;
        }

        public BlockClusterFeatureConfig build()
        {
            return new BlockClusterFeatureConfig(this.field_227303_a_, this.field_227304_b_, this.field_227305_c_, this.field_227306_d_, this.tryCount, this.field_227308_f_, this.field_227309_g_, this.field_227310_h_, this.field_227311_i_, this.field_227312_j_, this.field_227313_k_);
        }
    }
}
