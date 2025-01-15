// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class9286 implements ArgumentType<Class9456>
{
    private static final Collection<String> field39826;
    public static final DynamicCommandExceptionType field39827;
    
    private Class9286() {
    }
    
    public static Class9286 method34274() {
        return new Class9286();
    }
    
    public static Class9456 method34275(final CommandContext<Class7492> commandContext, final String s) {
        return (Class9456)commandContext.getArgument(s, (Class)Class9456.class);
    }
    
    public Class9456 parse(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        return Class9456.method35137(stringReader.getString().substring(cursor, stringReader.getCursor())).orElseThrow(() -> {
            stringReader2.setCursor(cursor2);
            return Class9286.field39827.create((Object)s);
        });
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        final ArrayList arrayList = Lists.newArrayList((Iterable)Class9456.field40639.keySet());
        for (final Class2248 class2248 : Class90.field238) {
            final Iterator iterator2 = class2248.method8448().iterator();
            while (iterator2.hasNext()) {
                arrayList.add(this.method34276((Class2248<Object>)class2248, iterator2.next()));
            }
        }
        return Class7491.method23226(arrayList, suggestionsBuilder);
    }
    
    public <T> String method34276(final Class2248<T> class2248, final Object o) {
        return Class9455.method35132((Class2248<Object>)class2248, o);
    }
    
    public Collection<String> getExamples() {
        return Class9286.field39826;
    }
    
    static {
        field39826 = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
        field39827 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.criteria.invalid", new Object[] { o });
            return;
        });
    }
}
