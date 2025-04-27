// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Streams;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.world.dimension.DimensionType;

public class Class9437 implements ArgumentType<DimensionType>
{
    private static final Collection<String> field40467;
    public static final DynamicCommandExceptionType field40468;
    
    public DimensionType parse(final StringReader stringReader) throws CommandSyntaxException {
        return Registry.field226.method506(ResourceLocation.method7799(stringReader)).orElseThrow(() -> Class9437.field40468.create((Object)class1932));
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23222(Streams.stream((Iterable) DimensionType.method1269()).map(DimensionType::method1276), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class9437.field40467;
    }
    
    public static Class9437 method35067() {
        return new Class9437();
    }
    
    public static DimensionType method35068(final CommandContext<Class7492> commandContext, final String s) {
        return (DimensionType)commandContext.getArgument(s, (Class) DimensionType.class);
    }
    
    static {
        field40467 = Stream.of(new DimensionType[] { DimensionType.field2223, DimensionType.field2224 }).map(class383 -> DimensionType.method1276(class383).toString()).collect((Collector<? super Object, ?, Collection<String>>)Collectors.toList());
        field40468 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.dimension.invalid", o);
            return;
        });
    }
}
