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

public class Class8450 implements ArgumentType<Class118>
{
    private static final Collection<String> field34713;
    
    public static Class8450 method28195() {
        return new Class8450();
    }
    
    public Class118 parse(final StringReader stringReader) throws CommandSyntaxException {
        final Class7572 method23802 = new Class7572(stringReader, false).method23802(true);
        return new Class118(method23802.method23799(), method23802.method23798().keySet(), method23802.method23800());
    }
    
    public static Class118 method28196(final CommandContext<Class7492> commandContext, final String s) {
        return (Class118)commandContext.getArgument(s, (Class)Class118.class);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        final StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        final Class7572 class7572 = new Class7572(stringReader, false);
        try {
            class7572.method23802(true);
        }
        catch (final CommandSyntaxException ex) {}
        return class7572.method23824(suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class8450.field34713;
    }
    
    static {
        field34713 = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
    }
}
