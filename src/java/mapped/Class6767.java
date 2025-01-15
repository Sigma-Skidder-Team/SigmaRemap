// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class6767 implements ArgumentType<Class175>
{
    private static final Collection<String> field26578;
    
    public static Class6767 method20638() {
        return new Class6767();
    }
    
    public Class175 parse(final StringReader stringReader) throws CommandSyntaxException {
        final Class7071 method21632 = new Class7071(stringReader, false).method21632();
        return new Class175(method21632.method21626(), method21632.method21627());
    }
    
    public static <S> Class175 method20639(final CommandContext<S> commandContext, final String s) {
        return (Class175)commandContext.getArgument(s, (Class)Class175.class);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        final StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        final Class7071 class7071 = new Class7071(stringReader, false);
        try {
            class7071.method21632();
        }
        catch (final CommandSyntaxException ex) {}
        return class7071.method21636(suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class6767.field26578;
    }
    
    static {
        field26578 = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
    }
}
