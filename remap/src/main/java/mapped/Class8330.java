// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import java.util.Collections;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class8330 implements ArgumentType<Class5346>
{
    private static final Collection<String> field34210;
    public static final SimpleCommandExceptionType field34211;
    public static final SimpleCommandExceptionType field34212;
    
    public static Class8330 method27767() {
        return new Class8330();
    }
    
    public static BlockPos method27768(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final BlockPos method16506 = ((Class5346)commandContext.getArgument(s, (Class)Class5346.class)).method16506((Class7492)commandContext.getSource());
        if (!((Class7492)commandContext.getSource()).method23250().method6971(method16506)) {
            throw Class8330.field34211.create();
        }
        ((Class7492)commandContext.getSource()).method23250();
        if (World.method6682(method16506)) {
            return method16506;
        }
        throw Class8330.field34212.create();
    }
    
    public static BlockPos method27769(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class5346)commandContext.getArgument(s, (Class)Class5346.class)).method16506((Class7492)commandContext.getSource());
    }
    
    public Class5346 parse(final StringReader stringReader) throws CommandSyntaxException {
        return (stringReader.canRead() && stringReader.peek() == '^') ? Class5348.method16513(stringReader) : Class5347.method16510(stringReader);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof Class7491) {
            final String remaining = suggestionsBuilder.getRemaining();
            Collection<Class8762> collection;
            if (!remaining.isEmpty() && remaining.charAt(0) == '^') {
                collection = Collections.singleton(Class8762.field36787);
            }
            else {
                collection = ((Class7491)commandContext.getSource()).method23214();
            }
            return Class7491.method23224(remaining, collection, suggestionsBuilder, Class7788.method25003(this::parse));
        }
        return Suggestions.empty();
    }
    
    public Collection<String> getExamples() {
        return Class8330.field34210;
    }
    
    static {
        field34210 = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
        field34211 = new SimpleCommandExceptionType((Message)new Class2259("argument.pos.unloaded", new Object[0]));
        field34212 = new SimpleCommandExceptionType((Message)new Class2259("argument.pos.outofworld", new Object[0]));
    }
}
