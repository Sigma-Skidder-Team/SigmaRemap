// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import java.util.Map;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.function.Predicate;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8808 implements ArgumentType<Class7927>
{
    private static final Collection<String> field37015;
    private static final DynamicCommandExceptionType field37016;
    
    public static Class8808 method30732() {
        return new Class8808();
    }
    
    public Class7927 parse(final StringReader stringReader) throws CommandSyntaxException {
        final Class7572 method23802 = new Class7572(stringReader, true).method23802(true);
        if (method23802.method23799() == null) {
            return class1934 -> {
                final Class7909<Object> method18460 = class1934.method6463().method18460(class1932);
                if (method18460 != null) {
                    return new Class119(method18460, method23802.method23825(), method23802.method23800(), null);
                }
                throw Class8808.field37016.create((Object)class1932.toString());
            };
        }
        return class117 -> class116;
    }
    
    public static Predicate<Class7990> method30733(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class7927)commandContext.getArgument(s, (Class)Class7927.class)).method25689(commandContext.getSource().method23255().method1578());
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        final StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        final Class7572 class7572 = new Class7572(stringReader, true);
        try {
            class7572.method23802(true);
        }
        catch (final CommandSyntaxException ex) {}
        return class7572.method23824(suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class8808.field37015;
    }
    
    static {
        field37015 = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
        field37016 = new DynamicCommandExceptionType(o -> {
            new Class2259("arguments.block.tag.unknown", o);
            return;
        });
    }
}
