// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class6877 implements ArgumentType<Class5328>
{
    private static final Collection<String> field26945;
    public static final DynamicCommandExceptionType field26946;
    
    public static Class6877 method21044() {
        return new Class6877();
    }
    
    public static Class5328 method21045(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return (Class5328)commandContext.getArgument(s, (Class)Class5328.class);
    }
    
    public Class5328 parse(final StringReader stringReader) throws CommandSyntaxException {
        return Registry.field207.method506(ResourceLocation.method7799(stringReader)).orElseThrow(() -> Class6877.field26946.create((Object)class1932));
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23220(Registry.field207.method507(), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class6877.field26945;
    }
    
    static {
        field26945 = Arrays.asList("spooky", "effect");
        field26946 = new DynamicCommandExceptionType(o -> {
            new Class2259("effect.effectNotFound", new Object[] { o });
            return;
        });
    }
}
