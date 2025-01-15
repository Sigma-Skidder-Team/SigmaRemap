// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import java.util.Collections;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8740 implements ArgumentType<Class7732>
{
    private static final Collection<String> field36717;
    public static final SimpleCommandExceptionType field36718;
    
    public static Collection<GameProfile> method30190(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class7732)commandContext.getArgument(s, (Class)Class7732.class)).method24681((Class7492)commandContext.getSource());
    }
    
    public static Class8740 method30191() {
        return new Class8740();
    }
    
    public Class7732 parse(final StringReader stringReader) throws CommandSyntaxException {
        if (!stringReader.canRead() || stringReader.peek() != '@') {
            final int cursor = stringReader.getCursor();
            while (stringReader.canRead() && stringReader.peek() != ' ') {
                stringReader.skip();
            }
            return class7492 -> {
                final GameProfile method29195 = class7492.method23255().method1556().method29195(s);
                if (method29195 != null) {
                    return Collections.singleton(method29195);
                }
                throw Class8740.field36718.create();
            };
        }
        final Class9043 method25070 = new Class7793(stringReader).method25070();
        if (!method25070.method32506()) {
            return new Class7733(method25070);
        }
        throw Class6886.field27003.create();
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof Class7491) {
            final StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
            stringReader.setCursor(suggestionsBuilder.getStart());
            final Class7793 class7793 = new Class7793(stringReader);
            try {
                class7793.method25070();
            }
            catch (final CommandSyntaxException ex) {}
            return class7793.method25081(suggestionsBuilder, suggestionsBuilder2 -> Class7491.method23226(((Class7491)commandContext2.getSource()).method23205(), suggestionsBuilder2));
        }
        return Suggestions.empty();
    }
    
    public Collection<String> getExamples() {
        return Class8740.field36717;
    }
    
    static {
        field36717 = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
        field36718 = new SimpleCommandExceptionType((Message)new Class2259("argument.player.unknown", new Object[0]));
    }
}
