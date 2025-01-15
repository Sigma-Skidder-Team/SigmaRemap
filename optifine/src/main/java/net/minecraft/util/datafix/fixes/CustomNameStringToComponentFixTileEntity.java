package net.minecraft.util.datafix.fixes;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.util.datafix.TypeReferences;

public class CustomNameStringToComponentFixTileEntity extends DataFix
{
    public CustomNameStringToComponentFixTileEntity(Schema p_i1981_1_, boolean p_i1981_2_)
    {
        super(p_i1981_1_, p_i1981_2_);
    }

    public TypeRewriteRule makeRule()
    {
        OpticFinder<String> opticfinder = DSL.fieldFinder("id", DSL.namespacedString());
        return this.fixTypeEverywhereTyped("BlockEntityCustomNameToComponentFix", this.getInputSchema().getType(TypeReferences.BLOCK_ENTITY), (p_207790_1_) ->
        {
            return p_207790_1_.update(DSL.remainderFinder(), (p_207789_2_) -> {
                Optional<String> optional = p_207790_1_.getOptional(opticfinder);
                return optional.isPresent() && Objects.equals(optional.get(), "minecraft:command_block") ? p_207789_2_ : CustomNameStringToComponentEntity.fixTagCustomName(p_207789_2_);
            });
        });
    }
}
