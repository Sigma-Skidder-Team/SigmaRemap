// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

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
import net.minecraft.item.ItemStack;

public class Class9508 implements ArgumentType<Class6311>
{
    private static final Collection<String> field40918;
    private static final DynamicCommandExceptionType field40919;
    
    public static Class9508 method35422() {
        return new Class9508();
    }
    
    public Class6311 parse(final StringReader stringReader) throws CommandSyntaxException {
        final Class7071 method21632 = new Class7071(stringReader, true).method21632();
        if (method21632.method21626() == null) {
            return commandContext -> {
                final Class7909<Object> method18460 = (Class7909<Object>)((Class7492)commandContext.getSource()).method23255().method1578().method6464().method18460(class1932);
                if (method18460 != null) {
                    return new Class176((Class7909<Class3820>)method18460, method21632.method21627());
                }
                throw Class9508.field40919.create((Object)class1932.toString());
            };
        }
        return commandContext -> class174;
    }
    
    public static Predicate<ItemStack> method35423(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class6311)commandContext.getArgument(s, (Class)Class6311.class)).method18686(commandContext);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        final StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        final Class7071 class7071 = new Class7071(stringReader, true);
        try {
            class7071.method21632();
        }
        catch (final CommandSyntaxException ex) {}
        return class7071.method21636(suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class9508.field40918;
    }
    
    static {
        field40918 = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
        field40919 = new DynamicCommandExceptionType(o -> {
            new Class2259("arguments.item.tag.unknown", new Object[] { o });
            return;
        });
    }
}
