package net.minecraft.block.pattern;

import mapped.BlockState;
import mapped.Material;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public class BlockMaterialMatcher implements Predicate<BlockState>
{
    private static final BlockMaterialMatcher AIR_MATCHER = new BlockMaterialMatcher(Material.AIR)
    {
        public boolean test(@Nullable BlockState p_test_1_)
        {
            return p_test_1_ != null && p_test_1_.isAir();
        }
    };
    private final Material material;

    private BlockMaterialMatcher(Material entitycreeperIn)
    {
        this.material = entitycreeperIn;
    }

    public static BlockMaterialMatcher forMaterial(Material materialIn)
    {
        return materialIn == Material.AIR ? AIR_MATCHER : new BlockMaterialMatcher(materialIn);
    }

    public boolean test(@Nullable BlockState p_test_1_)
    {
        return p_test_1_ != null && p_test_1_.getMaterial() == this.material;
    }
}