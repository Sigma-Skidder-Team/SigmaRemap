// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.function.BiConsumer;
import java.util.function.Function;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Supplier;

public class Class8455<T extends Class8117<T>>
{
    private static String[] field34722;
    private final Supplier<ArgumentType<?>> field34723;
    private final Function<Class8455<T>, T> field34724;
    private final BiConsumer<Class394, T> field34725;
    
    private Class8455(final Supplier<ArgumentType<?>> field34723, final Function<Class8455<T>, T> field34724, final BiConsumer<Class394, T> field34725) {
        this.field34723 = field34723;
        this.field34724 = field34724;
        this.field34725 = field34725;
    }
    
    public RequiredArgumentBuilder<Class7492, ?> method28219(final String s) {
        return Class7788.method25002(s, this.field34723.get());
    }
    
    public T method28220() {
        return this.field34724.apply(this);
    }
}
