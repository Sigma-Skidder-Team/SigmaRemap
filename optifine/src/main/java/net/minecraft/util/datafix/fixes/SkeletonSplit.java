package net.minecraft.util.datafix.fixes;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;

public class SkeletonSplit extends EntityRenameHelper
{
    public SkeletonSplit(Schema p_i2832_1_, boolean p_i2832_2_)
    {
        super("EntitySkeletonSplitFix", p_i2832_1_, p_i2832_2_);
    }

    protected Pair < String, Dynamic<? >> getNewNameAndTag(String name, Dynamic<?> tag)
    {
        if (Objects.equals(name, "Skeleton"))
        {
            int i = tag.get("SkeletonType").asInt(0);

            if (i == 1)
            {
                name = "WitherSkeleton";
            }
            else if (i == 2)
            {
                name = "Stray";
            }
        }

        return Pair.of(name, tag);
    }
}
