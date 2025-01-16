// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class7384 implements ArgumentType<IParticleData>
{
    private static final Collection<String> field28442;
    public static final DynamicCommandExceptionType field28443;
    
    public static Class7384 method22672() {
        return new Class7384();
    }
    
    public static IParticleData method22673(final CommandContext<Class7492> commandContext, final String s) {
        return (IParticleData)commandContext.getArgument(s, (Class) IParticleData.class);
    }
    
    public IParticleData parse(final StringReader stringReader) throws CommandSyntaxException {
        return method22674(stringReader);
    }
    
    public Collection<String> getExamples() {
        return Class7384.field28442;
    }
    
    public static IParticleData method22674(final StringReader stringReader) throws CommandSyntaxException {
        return method22675(stringReader, Registry.field222.method506(ResourceLocation.method7799(stringReader)).orElseThrow(() -> Class7384.field28443.create((Object)class1932)));
    }
    
    private static <T extends IParticleData> T method22675(final StringReader stringReader, final Class6907<T> class6907) throws CommandSyntaxException {
        return class6907.method21271().method19057(class6907, stringReader);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23220(Registry.field222.method507(), suggestionsBuilder);
    }
    
    static {
        field28442 = Arrays.asList("foo", "foo:bar", "particle with options");
        field28443 = new DynamicCommandExceptionType(o -> {
            new Class2259("particle.notFound", new Object[] { o });
            return;
        });
    }
}
