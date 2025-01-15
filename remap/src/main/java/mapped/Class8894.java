// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.StringReader;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8894 implements ArgumentType<String>
{
    private static final Collection<String> field37401;
    
    public String parse(final StringReader stringReader) throws CommandSyntaxException {
        final String unquotedString = stringReader.readUnquotedString();
        if (!Class8972.method31856(unquotedString)) {
            final StringTextComponent class2260 = new StringTextComponent("No such test class: " + unquotedString);
            throw new CommandSyntaxException((CommandExceptionType)new SimpleCommandExceptionType((Message)class2260), (Message)class2260);
        }
        return unquotedString;
    }
    
    public static Class8894 method31306() {
        return new Class8894();
    }
    
    public static String method31307(final CommandContext<Class7492> commandContext, final String s) {
        return (String)commandContext.getArgument(s, (Class)String.class);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23227(Class8972.method31855().stream(), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class8894.field37401;
    }
    
    static {
        field37401 = Arrays.asList("techtests", "mobtests");
    }
}
