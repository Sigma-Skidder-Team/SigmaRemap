// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.function.Function;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Optional;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.StringReader;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8487 implements ArgumentType<Class6812>
{
    private static final Collection<String> field34830;
    
    public Class6812 parse(final StringReader stringReader) throws CommandSyntaxException {
        final String unquotedString = stringReader.readUnquotedString();
        final Optional<Class6812> method31858 = Class8972.method31858(unquotedString);
        if (!method31858.isPresent()) {
            final Class2260 class2260 = new Class2260("No such test: " + unquotedString);
            throw new CommandSyntaxException((CommandExceptionType)new SimpleCommandExceptionType((Message)class2260), (Message)class2260);
        }
        return method31858.get();
    }
    
    public static Class8487 method28341() {
        return new Class8487();
    }
    
    public static Class6812 method28342(final CommandContext<Class7492> commandContext, final String s) {
        return (Class6812)commandContext.getArgument(s, (Class)Class6812.class);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23227(Class8972.method31854().stream().map((Function<? super Class6812, ? extends String>)Class6812::method20849), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class8487.field34830;
    }
    
    static {
        field34830 = Arrays.asList("techtests.piston", "techtests");
    }
}
