// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Arrays;

import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import java.util.Map;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8631 implements ArgumentType<Integer>
{
    private static final Collection<String> field36224;
    private static final DynamicCommandExceptionType field36225;
    private static final Map<String, Integer> field36226;
    
    public static Class8631 method29295() {
        return new Class8631();
    }
    
    public static int method29296(final CommandContext<Class7492> commandContext, final String s) {
        return (int)commandContext.getArgument(s, (Class)Integer.class);
    }
    
    public Integer parse(final StringReader stringReader) throws CommandSyntaxException {
        final String unquotedString = stringReader.readUnquotedString();
        if (Class8631.field36226.containsKey(unquotedString)) {
            return Class8631.field36226.get(unquotedString);
        }
        throw Class8631.field36225.create(unquotedString);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23226(Class8631.field36226.keySet(), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class8631.field36224;
    }
    
    static {
        field36224 = Arrays.asList("container.5", "12", Class8631.\u387d\u7325\uff74\ucb49\u35ef\u093d[6]);
        field36225 = new DynamicCommandExceptionType(o -> {
            new Class2259("slot.unknown", o);
            return;
        });
        field36226 = Util.method27851(Maps.newHashMap(), hashMap -> {
            int i = 0;
            while (i < 54) {
                hashMap.put("container." + i, i);
                ++i;
            }
            int j = 0;
            while (j < 9) {
                hashMap.put("hotbar." + j, j);
                ++j;
            }
            int k = 0;
            while (k < 27) {
                hashMap.put("inventory." + k, 9 + k);
                ++k;
            }
            int l = 0;
            while (l < 27) {
                hashMap.put("enderchest." + l, 200 + l);
                ++l;
            }
            int m = 0;
            while (m < 8) {
                hashMap.put("villager." + m, 300 + m);
                ++m;
            }
            int i2 = 0;
            while (i2 < 15) {
                hashMap.put("horse." + i2, 500 + i2);
                ++i2;
            }
            hashMap.put("weapon", 98);
            hashMap.put("weapon.mainhand", 98);
            hashMap.put("weapon.offhand", 99);
            hashMap.put("armor.head", 100 + Class2215.field13605.getIndex());
            hashMap.put("armor.chest", 100 + Class2215.field13604.getIndex());
            hashMap.put("armor.legs", 100 + Class2215.field13603.getIndex());
            hashMap.put("armor.feet", 100 + Class2215.field13602.getIndex());
            hashMap.put("horse.saddle", 400);
            hashMap.put("horse.armor", 401);
            hashMap.put("horse.chest", 499);
        });
    }
}
