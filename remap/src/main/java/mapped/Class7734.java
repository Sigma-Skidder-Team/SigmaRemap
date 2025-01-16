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
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.util.math.BlockPos;

public class Class7734 implements ArgumentType<Class5346>
{
    private static final Collection<String> field30749;
    public static final SimpleCommandExceptionType field30750;
    
    public static Class7734 method24682() {
        return new Class7734();
    }
    
    public static Class7587 method24683(final CommandContext<Class7492> commandContext, final String s) {
        final BlockPos method16506 = ((Class5346)commandContext.getArgument(s, (Class)Class5346.class)).method16506((Class7492)commandContext.getSource());
        return new Class7587(method16506.getX(), method16506.getZ());
    }
    
    public Class5346 parse(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw Class7734.field30750.createWithContext((ImmutableStringReader)stringReader);
        }
        final Class7629 method23980 = Class7629.method23980(stringReader);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            return new Class5347(method23980, new Class7629(true, 0.0), Class7629.method23980(stringReader));
        }
        stringReader.setCursor(cursor);
        throw Class7734.field30750.createWithContext((ImmutableStringReader)stringReader);
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
            return Class7491.method23225(remaining, collection, suggestionsBuilder, Class7788.method25003(this::parse));
        }
        return Suggestions.empty();
    }
    
    public Collection<String> getExamples() {
        return Class7734.field30749;
    }
    
    static {
        field30749 = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
        field30750 = new SimpleCommandExceptionType((Message)new Class2259("argument.pos2d.incomplete", new Object[0]));
    }
}
