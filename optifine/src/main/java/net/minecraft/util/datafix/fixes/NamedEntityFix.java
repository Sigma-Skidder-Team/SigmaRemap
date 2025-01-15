package net.minecraft.util.datafix.fixes;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public abstract class NamedEntityFix extends DataFix
{
    private final String name;
    private final String entityName;
    private final TypeReference type;

    public NamedEntityFix(Schema p_i4215_1_, boolean p_i4215_2_, String p_i4215_3_, TypeReference p_i4215_4_, String p_i4215_5_)
    {
        super(p_i4215_1_, p_i4215_2_);
        this.name = p_i4215_3_;
        this.type = p_i4215_4_;
        this.entityName = p_i4215_5_;
    }

    public TypeRewriteRule makeRule()
    {
        OpticFinder<?> opticfinder = DSL.namedChoice(this.entityName, this.getInputSchema().getChoiceType(this.type, this.entityName));
        return this.fixTypeEverywhereTyped(this.name, this.getInputSchema().getType(this.type), this.getOutputSchema().getType(this.type), (p_206371_2_) ->
        {
            return p_206371_2_.updateTyped(opticfinder, this.getOutputSchema().getChoiceType(this.type, this.entityName), this::fix);
        });
    }

    protected abstract Typed<?> fix(Typed<?> p_207419_1_);
}
