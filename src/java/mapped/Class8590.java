// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8590 implements ArgumentType<Integer>
{
    private static final Collection<String> field36087;
    private static final SimpleCommandExceptionType field36088;
    private static final DynamicCommandExceptionType field36089;
    private static final Object2IntMap<String> field36090;
    
    public static Class8590 method29089() {
        return new Class8590();
    }
    
    public Integer parse(final StringReader stringReader) throws CommandSyntaxException {
        final float float1 = stringReader.readFloat();
        final int orDefault = Class8590.field36090.getOrDefault((Object)stringReader.readUnquotedString(), 0);
        if (orDefault == 0) {
            throw Class8590.field36088.create();
        }
        final int round = Math.round(float1 * orDefault);
        if (round >= 0) {
            return round;
        }
        throw Class8590.field36089.create((Object)round);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        final StringReader stringReader = new StringReader(suggestionsBuilder.getRemaining());
        try {
            stringReader.readFloat();
        }
        catch (final CommandSyntaxException ex) {
            return suggestionsBuilder.buildFuture();
        }
        return Class7491.method23226((Iterable<String>)Class8590.field36090.keySet(), suggestionsBuilder.createOffset(suggestionsBuilder.getStart() + stringReader.getCursor()));
    }
    
    public Collection<String> getExamples() {
        return Class8590.field36087;
    }
    
    static {
        field36087 = Arrays.asList("0d", "0s", "0t", "0");
        field36088 = new SimpleCommandExceptionType((Message)new Class2259("argument.time.invalid_unit", new Object[0]));
        field36089 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.time.invalid_tick_count", new Object[] { o });
            return;
        });
        (field36090 = (Object2IntMap)new Object2IntOpenHashMap()).put((Object)"d", 24000);
        Class8590.field36090.put((Object)"s", 20);
        Class8590.field36090.put((Object)"t", 1);
        Class8590.field36090.put((Object)"", 1);
    }
}
