// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Map;

public class Class8533
{
    private static final Map<Class1932, SuggestionProvider<Class7491>> field35812;
    private static final Class1932 field35813;
    public static final SuggestionProvider<Class7491> field35814;
    public static final SuggestionProvider<Class7492> field35815;
    public static final SuggestionProvider<Class7492> field35816;
    public static final SuggestionProvider<Class7492> field35817;
    
    public static <S extends Class7491> SuggestionProvider<S> method28624(final Class1932 obj, final SuggestionProvider<Class7491> suggestionProvider) {
        if (!Class8533.field35812.containsKey(obj)) {
            Class8533.field35812.put(obj, suggestionProvider);
            return (SuggestionProvider<S>)new Class8517(obj, suggestionProvider);
        }
        throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + obj);
    }
    
    public static SuggestionProvider<Class7491> method28625(final Class1932 key) {
        return Class8533.field35812.getOrDefault(key, Class8533.field35814);
    }
    
    public static Class1932 method28626(final SuggestionProvider<Class7491> suggestionProvider) {
        return (suggestionProvider instanceof Class8517) ? Class8517.method28446((Class8517)suggestionProvider) : Class8533.field35813;
    }
    
    public static SuggestionProvider<Class7491> method28627(final SuggestionProvider<Class7491> suggestionProvider) {
        return (suggestionProvider instanceof Class8517) ? suggestionProvider : Class8533.field35814;
    }
    
    static {
        field35812 = Maps.newHashMap();
        field35813 = new Class1932("ask_server");
        field35814 = method28624(Class8533.field35813, (SuggestionProvider<Class7491>)((commandContext, suggestionsBuilder) -> ((Class7491)commandContext.getSource()).method23211((CommandContext<Class7491>)commandContext, suggestionsBuilder)));
        field35815 = method28624(new Class1932("all_recipes"), (SuggestionProvider<Class7491>)((commandContext, suggestionsBuilder) -> Class7491.method23222(((Class7491)commandContext.getSource()).method23209(), suggestionsBuilder)));
        field35816 = method28624(new Class1932("available_sounds"), (SuggestionProvider<Class7491>)((commandContext, suggestionsBuilder) -> Class7491.method23220(((Class7491)commandContext.getSource()).method23208(), suggestionsBuilder)));
        field35817 = method28624(new Class1932("summonable_entities"), (SuggestionProvider<Class7491>)((commandContext, suggestionsBuilder) -> Class7491.method23223(Class90.field210.method509().filter(Class7499::method23362), suggestionsBuilder, Class7499::method23354, class7499 -> new Class2259(Class8349.method27836("entity", Class7499.method23354(class7499)), new Object[0]))));
    }
}
