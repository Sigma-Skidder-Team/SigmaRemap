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
    REPLACE("replace") {
        @Override
        public void runAction(final INBT class41, final NBTPath class42, final List<INBT> list) throws CommandSyntaxException {
            class42.func_218076_b(class41, (INBT)Iterables.getLast((Iterable)list)::copy);
        }
    }, 
    APPEND("append") {
        @Override
        public void runAction(final INBT class41, final NBTPath class42, final List<INBT> list) throws CommandSyntaxException {
            class42.func_218073_a(class41, ListNBT::new).forEach(class43 -> {
                if (!(!(class43 instanceof ListNBT))) {
                    list2.forEach(class45 -> ((ListNBT)class44).add(class45.copy()));
                }
            });
        }
    }, 
    MERGE("merge") {
        @Override
        public void runAction(final INBT class41, final NBTPath class42, final List<INBT> list) throws CommandSyntaxException {
            class42.func_218073_a(class41, CompoundNBT::new).forEach(class43 -> {
                if (!(!(class43 instanceof CompoundNBT))) {
                    list2.forEach(class45 -> {
                        if (!(!(class45 instanceof CompoundNBT))) {
                            ((CompoundNBT)class44).merge((CompoundNBT)class45);
                        }
                    });
                }
            });
        }
    };
    
    private final String op;
    
    public abstract void runAction(final INBT p0, final NBTPath p1, final List<INBT> p2) throws CommandSyntaxException;
    
    private Action(final String field13712) {
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
