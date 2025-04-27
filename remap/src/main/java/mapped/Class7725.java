// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class7725 implements ArgumentType<String>
{
    private static final Collection<String> field30727;
    private static final DynamicCommandExceptionType field30728;
    
    public static Class7725 method24662() {
        return new Class7725();
    }
    
    public static Class6749 method24663(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final String s2 = (String)commandContext.getArgument(s, (Class)String.class);
        final Class6749 method19645 = commandContext.getSource().method23255().method1579().method19645(s2);
        if (method19645 != null) {
            return method19645;
        }
        throw Class7725.field30728.create(s2);
    }
    
    public String parse(final StringReader stringReader) throws CommandSyntaxException {
        return stringReader.readUnquotedString();
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return (commandContext.getSource() instanceof Class7491) ? Class7491.method23226(((Class7491)commandContext.getSource()).method23207(), suggestionsBuilder) : Suggestions.empty();
    }
    
    public Collection<String> getExamples() {
        return Class7725.field30727;
    }
    
    static {
        field30727 = Arrays.asList("foo", "123");
        field30728 = new DynamicCommandExceptionType(o -> {
            new Class2259("team.notFound", o);
            return;
        });
    }
}
