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

public class Class9162 implements ArgumentType<Class6257>
{
    private static final Collection<String> field38821;
    public static final DynamicCommandExceptionType field38822;
    
    public static Class9162 method33443() {
        return new Class9162();
    }
    
    public static Class6257 method33444(final CommandContext<Class7492> commandContext, final String s) {
        return (Class6257)commandContext.getArgument(s, (Class)Class6257.class);
    }
    
    public Class6257 parse(final StringReader stringReader) throws CommandSyntaxException {
        return Class90.field209.method506(Class1932.method7799(stringReader)).orElseThrow(() -> Class9162.field38822.create((Object)class1932));
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23220(Class90.field209.method507(), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class9162.field38821;
    }
    
    static {
        field38821 = Arrays.asList("unbreaking", "silk_touch");
        field38822 = new DynamicCommandExceptionType(o -> {
            new Class2259("enchantment.unknown", new Object[] { o });
            return;
        });
    }
}
