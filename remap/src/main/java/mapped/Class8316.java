// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8316 implements ArgumentType<Class2042>
{
    private static final Collection<String> field34163;
    private static final DynamicCommandExceptionType field34164;
    
    public static Class2042 method27605(final CommandContext<Class7492> commandContext, final String s) {
        return (Class2042)commandContext.getArgument(s, (Class)Class2042.class);
    }
    
    public static Class8316 method27606() {
        return new Class8316();
    }
    
    public Class2042 parse(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        final String unquotedString = stringReader.readUnquotedString();
        final Class2042 method8121 = Class2042.method8121(unquotedString);
        if (method8121 != null) {
            return method8121;
        }
        stringReader.setCursor(cursor);
        throw Class8316.field34164.createWithContext(stringReader, unquotedString);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23226(Class2042.method8127().keySet(), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class8316.field34163;
    }
    
    static {
        field34163 = Arrays.asList("eyes", "feet");
        field34164 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.anchor.invalid", o);
            return;
        });
    }
}
