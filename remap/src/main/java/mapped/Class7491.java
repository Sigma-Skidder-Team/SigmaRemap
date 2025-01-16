// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.function.Predicate;
import com.mojang.brigadier.Message;
import java.util.Locale;
import com.google.common.base.Strings;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Collection;

public interface Class7491
{
    Collection<String> method23205();
    
    default Collection<String> method23206() {
        return (Collection<String>)Collections.emptyList();
    }
    
    Collection<String> method23207();
    
    Collection<ResourceLocation> method23208();
    
    Stream<ResourceLocation> method23209();
    
    CompletableFuture<Suggestions> method23211(final CommandContext<Class7491> p0, final SuggestionsBuilder p1);
    
    default Collection<Class8762> method23214() {
        return Collections.singleton(Class8762.field36788);
    }
    
    default Collection<Class8762> method23215() {
        return Collections.singleton(Class8762.field36788);
    }
    
    boolean method23210(final int p0);
    
    default <T> void method23217(final Iterable<T> iterable, final String prefix, final Function<T, ResourceLocation> function, final Consumer<T> consumer) {
        final boolean b = prefix.indexOf(58) > -1;
        for (final T next : iterable) {
            final ResourceLocation class1932 = function.apply(next);
            if (!b) {
                if (!class1932.method7798().startsWith(prefix)) {
                    if (!class1932.method7798().equals("minecraft")) {
                        continue;
                    }
                    if (!class1932.method7797().startsWith(prefix)) {
                        continue;
                    }
                }
                consumer.accept(next);
            }
            else {
                if (!class1932.toString().startsWith(prefix)) {
                    continue;
                }
                consumer.accept(next);
            }
        }
    }
    
    default <T> void method23218(final Iterable<T> iterable, final String s, final String s2, final Function<T, ResourceLocation> function, final Consumer<T> action) {
        if (!s.isEmpty()) {
            final String commonPrefix = Strings.commonPrefix((CharSequence)s, (CharSequence)s2);
            if (!commonPrefix.isEmpty()) {
                method23217(iterable, s.substring(commonPrefix.length()), function, action);
            }
        }
        else {
            iterable.forEach(action);
        }
    }
    
    default CompletableFuture<Suggestions> method23219(final Iterable<ResourceLocation> iterable, final SuggestionsBuilder suggestionsBuilder, final String s) {
        method23218(iterable, suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT), s, class1932 -> class1932, obj -> suggestionsBuilder2.suggest(str + obj));
        return suggestionsBuilder.buildFuture();
    }
    
    default CompletableFuture<Suggestions> method23220(final Iterable<ResourceLocation> iterable, final SuggestionsBuilder suggestionsBuilder) {
        method23217(iterable, suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT), class1932 -> class1932, class1933 -> suggestionsBuilder2.suggest(class1933.toString()));
        return suggestionsBuilder.buildFuture();
    }
    
    default <T> CompletableFuture<Suggestions> method23221(final Iterable<T> iterable, final SuggestionsBuilder suggestionsBuilder, final Function<T, ResourceLocation> function, final Function<T, Message> function2) {
        method23217(iterable, suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT), function, o -> suggestionsBuilder2.suggest(function3.apply(o).toString(), (Message)function4.apply(o)));
        return suggestionsBuilder.buildFuture();
    }
    
    default CompletableFuture<Suggestions> method23222(final Stream<ResourceLocation> stream, final SuggestionsBuilder suggestionsBuilder) {
        return method23220(stream::iterator, suggestionsBuilder);
    }
    
    default <T> CompletableFuture<Suggestions> method23223(final Stream<T> stream, final SuggestionsBuilder suggestionsBuilder, final Function<T, ResourceLocation> function, final Function<T, Message> function2) {
        return method23221(stream::iterator, suggestionsBuilder, function, function2);
    }
    
    default CompletableFuture<Suggestions> method23224(final String s, final Collection<Class8762> collection, final SuggestionsBuilder suggestionsBuilder, final Predicate<String> predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        if (!Strings.isNullOrEmpty(s)) {
            final String[] split = s.split(" ");
            if (split.length != 1) {
                if (split.length == 2) {
                    final Iterator<Class8762> iterator = collection.iterator();
                    while (iterator.hasNext()) {
                        final String string = split[0] + " " + split[1] + " " + iterator.next().field36791;
                        if (!predicate.test(string)) {
                            continue;
                        }
                        arrayList.add(string);
                    }
                }
            }
            else {
                for (final Class8762 class8762 : collection) {
                    final String string2 = split[0] + " " + class8762.field36790 + " " + class8762.field36791;
                    if (!predicate.test(string2)) {
                        continue;
                    }
                    arrayList.add(split[0] + " " + class8762.field36790);
                    arrayList.add(string2);
                }
            }
        }
        else {
            for (final Class8762 class8763 : collection) {
                final String string3 = class8763.field36789 + " " + class8763.field36790 + " " + class8763.field36791;
                if (!predicate.test(string3)) {
                    continue;
                }
                arrayList.add(class8763.field36789);
                arrayList.add(class8763.field36789 + " " + class8763.field36790);
                arrayList.add(string3);
            }
        }
        return method23226(arrayList, suggestionsBuilder);
    }
    
    default CompletableFuture<Suggestions> method23225(final String s, final Collection<Class8762> collection, final SuggestionsBuilder suggestionsBuilder, final Predicate<String> predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        if (!Strings.isNullOrEmpty(s)) {
            final String[] split = s.split(" ");
            if (split.length == 1) {
                final Iterator<Class8762> iterator = collection.iterator();
                while (iterator.hasNext()) {
                    final String string = split[0] + " " + iterator.next().field36791;
                    if (!predicate.test(string)) {
                        continue;
                    }
                    arrayList.add(string);
                }
            }
        }
        else {
            for (final Class8762 class8762 : collection) {
                final String string2 = class8762.field36789 + " " + class8762.field36791;
                if (!predicate.test(string2)) {
                    continue;
                }
                arrayList.add(class8762.field36789);
                arrayList.add(string2);
            }
        }
        return method23226(arrayList, suggestionsBuilder);
    }
    
    default CompletableFuture<Suggestions> method23226(final Iterable<String> iterable, final SuggestionsBuilder suggestionsBuilder) {
        final String lowerCase = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (final String s : iterable) {
            if (!s.toLowerCase(Locale.ROOT).startsWith(lowerCase)) {
                continue;
            }
            suggestionsBuilder.suggest(s);
        }
        return suggestionsBuilder.buildFuture();
    }
    
    default CompletableFuture<Suggestions> method23227(final Stream<String> stream, final SuggestionsBuilder suggestionsBuilder2) {
        stream.filter(s -> {
            suggestionsBuilder2.getRemaining().toLowerCase(Locale.ROOT);
            return s.toLowerCase(Locale.ROOT).startsWith(prefix);
        }).forEach(suggestionsBuilder2::suggest);
        return suggestionsBuilder2.buildFuture();
    }
    
    default CompletableFuture<Suggestions> method23228(final String[] array, final SuggestionsBuilder suggestionsBuilder) {
        final String lowerCase = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (final String s : array) {
            if (s.toLowerCase(Locale.ROOT).startsWith(lowerCase)) {
                suggestionsBuilder.suggest(s);
            }
        }
        return suggestionsBuilder.buildFuture();
    }
}
