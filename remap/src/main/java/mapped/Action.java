// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.INBT;

import java.util.List;

public enum Action
{
    REPLACE("replace")
            {
                public void runAction(INBT p_216227_1_, NBTPath p_216227_2_, List<INBT> p_216227_3_) throws CommandSyntaxException
                {
                    p_216227_2_.func_218076_b(p_216227_1_, Iterables.getLast(p_216227_3_)::copy);
                }
            },
    APPEND("append")
            {
                public void runAction(INBT p_216227_1_, NBTPath p_216227_2_, List<INBT> p_216227_3_) throws CommandSyntaxException
                {
                    List<INBT> list = p_216227_2_.func_218073_a(p_216227_1_, ListNBT::new);
                    list.forEach((p_216232_1_) ->
                    {
                        if (p_216232_1_ instanceof ListNBT)
                        {
                            p_216227_3_.forEach((p_216231_1_) ->
                            {
                                ((ListNBT)p_216232_1_).add(p_216231_1_.copy());
                            });
                        }
                    });
                }
            },
    MERGE("merge")
            {
                public void runAction(INBT p_216227_1_, NBTPath p_216227_2_, List<INBT> p_216227_3_) throws CommandSyntaxException
                {
                    List<INBT> list = p_216227_2_.func_218073_a(p_216227_1_, CompoundNBT::new);
                    list.forEach((p_216234_1_) ->
                    {
                        if (p_216234_1_ instanceof CompoundNBT)
                        {
                            p_216227_3_.forEach((p_216233_1_) ->
                            {
                                if (p_216233_1_ instanceof CompoundNBT)
                                {
                                    ((CompoundNBT)p_216234_1_).merge((CompoundNBT)p_216233_1_);
                                }
                            });
                        }
                    });
                }
            };
    
    private final String op;
    
    public abstract void runAction(final INBT p0, final NBTPath p1, final List<INBT> p2) throws CommandSyntaxException;
    
    Action(final String field13712) {
        this.op = field13712;
    }
    
    public static Action getByName(final String s) {
        for (final Action action : values()) {
            if (action.op.equals(s)) {
                return action;
            }
        }
        throw new IllegalArgumentException("Invalid merge strategy" + s);
    }
}
