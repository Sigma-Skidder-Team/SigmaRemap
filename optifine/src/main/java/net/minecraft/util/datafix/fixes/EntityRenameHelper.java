package net.minecraft.util.datafix.fixes;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;

public abstract class EntityRenameHelper extends EntityRename
{
    public EntityRenameHelper(String worldInfoIn, Schema p_i2145_2_, boolean p_i2145_3_)
    {
        super(worldInfoIn, p_i2145_2_, p_i2145_3_);
    }

    protected Pair < String, Typed<? >> fix(String p_209149_1_, Typed<?> p_209149_2_)
    {
        Pair < String, Dynamic<? >> pair = this.getNewNameAndTag(p_209149_1_, p_209149_2_.getOrCreate(DSL.remainderFinder()));
        return Pair.of(pair.getFirst(), p_209149_2_.set(DSL.remainderFinder(), pair.getSecond()));
    }

    protected abstract Pair < String, Dynamic<? >> getNewNameAndTag(String name, Dynamic<?> tag);
}
