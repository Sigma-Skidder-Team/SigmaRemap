// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import net.minecraft.entity.EntityType;

import java.util.Map;

public class Class8533
{
    private static final Map<ResourceLocation, SuggestionProvider<Class7491>> field35812;
    private static final ResourceLocation field35813;
    public static final SuggestionProvider<Class7491> field35814;
    public static final SuggestionProvider<Class7492> field35815;
    public static final SuggestionProvider<Class7492> field35816;
    public static final SuggestionProvider<Class7492> field35817;
    
    public static <S extends Class7491> SuggestionProvider<S> method28624(final ResourceLocation obj, final SuggestionProvider<Class7491> suggestionProvider) {
        if (!Class8533.field35812.containsKey(obj)) {
            Class8533.field35812.put(obj, suggestionProvider);
            return (SuggestionProvider<S>)new Class8517(obj, suggestionProvider);
        }
        throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + obj);
    }
    
    public static SuggestionProvider<Class7491> method28625(final ResourceLocation key) {
        return Class8533.field35812.getOrDefault(key, Class8533.field35814);
    }
    
    public static ResourceLocation method28626(final SuggestionProvider<Class7491> suggestionProvider) {
        return (suggestionProvider instanceof Class8517) ? Class8517.method28446((Class8517)suggestionProvider) : Class8533.field35813;
    }
    
    public static SuggestionProvider<Class7491> method28627(final SuggestionProvider<Class7491> suggestionProvider) {
        return (suggestionProvider instanceof Class8517) ? suggestionProvider : Class8533.field35814;
    }
    
    static {
        field35812 = Maps.newHashMap();
        field35813 = new ResourceLocation("ask_server");
        field35814 = method28624(Class8533.field35813, (commandContext, suggestionsBuilder) -> commandContext.getSource().method23211(commandContext, suggestionsBuilder));
        field35815 = method28624(new ResourceLocation("all_recipes"), (commandContext, suggestionsBuilder) -> Class7491.method23222(commandContext.getSource().method23209(), suggestionsBuilder));
        field35816 = method28624(new ResourceLocation("available_sounds"), (commandContext, suggestionsBuilder) -> Class7491.method23220(commandContext.getSource().method23208(), suggestionsBuilder));
        field35817 = method28624(new ResourceLocation("summonable_entities"), (commandContext, suggestionsBuilder) -> Class7491.method23223(Registry.field210.method509().filter(EntityType::method23362), suggestionsBuilder, EntityType::method23354, class7499 -> new Class2259(Util.method27836("entity", EntityType.method23354(class7499)))));
    }
}
