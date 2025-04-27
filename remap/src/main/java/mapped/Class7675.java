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
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class7675 implements ArgumentType<Integer>
{
    private static final Collection<String> field30472;
    public static final DynamicCommandExceptionType field30473;
    
    private Class7675() {
    }
    
    public static Class7675 method24361() {
        return new Class7675();
    }
    
    public static int method24362(final CommandContext<Class7492> commandContext, final String s) {
        return (int)commandContext.getArgument(s, (Class)Integer.class);
    }
    
    public Integer parse(final StringReader stringReader) throws CommandSyntaxException {
        final String unquotedString = stringReader.readUnquotedString();
        final int method19653 = Class6516.method19653(unquotedString);
        if (method19653 != -1) {
            return method19653;
        }
        throw Class7675.field30473.create(unquotedString);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23228(Class6516.method19654(), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class7675.field30472;
    }
    
    static {
        field30472 = Arrays.asList("sidebar", "foo.bar");
        field30473 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.scoreboardDisplaySlot.invalid", o);
            return;
        });
    }
}
