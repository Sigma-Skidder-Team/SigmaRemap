package net.minecraft.world.storage.loot;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class LootParameterSet
{
    private final Set < LootParameter<? >> required;
    private final Set < LootParameter<? >> all;

    private LootParameterSet(Set < LootParameter<? >> p_i3140_1_, Set < LootParameter<? >> p_i3140_2_)
    {
        this.required = ImmutableSet.copyOf(p_i3140_1_);
        this.all = ImmutableSet.copyOf(Sets.union(p_i3140_1_, p_i3140_2_));
    }

    public Set < LootParameter<? >> getRequiredParameters()
    {
        return this.required;
    }

    public Set < LootParameter<? >> getAllParameters()
    {
        return this.all;
    }

    public String toString()
    {
        return "[" + Joiner.on(", ").join(this.all.stream().map((p_216275_1_) ->
        {
            return (this.required.contains(p_216275_1_) ? "!" : "") + p_216275_1_.getId();
        }).iterator()) + "]";
    }

    public void func_227556_a_(ValidationTracker p_227556_1_, IParameterized p_227556_2_)
    {
        Set < LootParameter<? >> set = p_227556_2_.getRequiredParameters();
        Set < LootParameter<? >> set1 = Sets.difference(set, this.all);

        if (!set1.isEmpty())
        {
            p_227556_1_.func_227530_a_("Parameters " + set1 + " are not provided in this context");
        }
    }

    public static class Builder
    {
        private final Set < LootParameter<? >> required = Sets.newIdentityHashSet();
        private final Set < LootParameter<? >> optional = Sets.newIdentityHashSet();

        public LootParameterSet.Builder required(LootParameter<?> parameter)
        {
            if (this.optional.contains(parameter))
            {
                throw new IllegalArgumentException("Parameter " + parameter.getId() + " is already optional");
            }
            else
            {
                this.required.add(parameter);
                return this;
            }
        }

        public LootParameterSet.Builder optional(LootParameter<?> parameter)
        {
            if (this.required.contains(parameter))
            {
                throw new IllegalArgumentException("Parameter " + parameter.getId() + " is already required");
            }
            else
            {
                this.optional.add(parameter);
                return this;
            }
        }

        public LootParameterSet build()
        {
            return new LootParameterSet(this.required, this.optional);
        }
    }
}
