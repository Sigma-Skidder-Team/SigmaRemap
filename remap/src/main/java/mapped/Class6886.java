// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.List;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.entity.Entity;

public class Class6886 implements ArgumentType<Class9043>
{
    private static final Collection<String> field27000;
    public static final SimpleCommandExceptionType field27001;
    public static final SimpleCommandExceptionType field27002;
    public static final SimpleCommandExceptionType field27003;
    public static final SimpleCommandExceptionType field27004;
    public static final SimpleCommandExceptionType field27005;
    public static final SimpleCommandExceptionType field27006;
    private final boolean field27007;
    private final boolean field27008;
    
    public Class6886(final boolean field27007, final boolean field27008) {
        this.field27007 = field27007;
        this.field27008 = field27008;
    }
    
    public static Class6886 method21143() {
        return new Class6886(true, false);
    }
    
    public static Entity method21144(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class9043)commandContext.getArgument(s, (Class)Class9043.class)).method32510((Class7492)commandContext.getSource());
    }
    
    public static Class6886 method21145() {
        return new Class6886(false, false);
    }
    
    public static Collection<? extends Entity> method21146(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final Collection<? extends Entity> method21147 = method21147(commandContext, s);
        if (!method21147.isEmpty()) {
            return method21147;
        }
        throw Class6886.field27004.create();
    }
    
    public static Collection<? extends Entity> method21147(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class9043)commandContext.getArgument(s, (Class)Class9043.class)).method32511((Class7492)commandContext.getSource());
    }
    
    public static Collection<Class513> method21148(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class9043)commandContext.getArgument(s, (Class)Class9043.class)).method32514((Class7492)commandContext.getSource());
    }
    
    public static Class6886 method21149() {
        return new Class6886(true, true);
    }
    
    public static Class513 method21150(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class9043)commandContext.getArgument(s, (Class)Class9043.class)).method32513((Class7492)commandContext.getSource());
    }
    
    public static Class6886 method21151() {
        return new Class6886(false, true);
    }
    
    public static Collection<Class513> method21152(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final List<Class513> method32514 = ((Class9043)commandContext.getArgument(s, (Class)Class9043.class)).method32514((Class7492)commandContext.getSource());
        if (!method32514.isEmpty()) {
            return method32514;
        }
        throw Class6886.field27005.create();
    }
    
    public Class9043 parse(final StringReader stringReader) throws CommandSyntaxException {
        final Class9043 method25070 = new Class7793(stringReader).method25070();
        if (method25070.method32505() <= 1 || !this.field27007) {
            if (method25070.method32506()) {
                if (this.field27008) {
                    if (!method25070.method32507()) {
                        stringReader.setCursor(0);
                        throw Class6886.field27003.createWithContext((ImmutableStringReader)stringReader);
                    }
                }
            }
            return method25070;
        }
        if (!this.field27008) {
            stringReader.setCursor(0);
            throw Class6886.field27001.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.setCursor(0);
        throw Class6886.field27002.createWithContext((ImmutableStringReader)stringReader);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof Class7491) {
            final StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
            stringReader.setCursor(suggestionsBuilder.getStart());
            final Class7793 class7793 = new Class7793(stringReader, ((Class7491)commandContext.getSource()).method23210(2));
            try {
                class7793.method25070();
            }
            catch (final CommandSyntaxException ex) {}
            return class7793.method25081(suggestionsBuilder, suggestionsBuilder2 -> {
                class7794.method23205();
                final Collection collection;
                Class7491.method23226(this.field27008 ? collection : Iterables.concat((Iterable)collection, (Iterable)class7794.method23206()), suggestionsBuilder2);
                return;
            });
        }
        return Suggestions.empty();
    }
    
    public Collection<String> getExamples() {
        return Class6886.field27000;
    }
    
    static {
        field27000 = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
        field27001 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.toomany", new Object[0]));
        field27002 = new SimpleCommandExceptionType((Message)new Class2259("argument.player.toomany", new Object[0]));
        field27003 = new SimpleCommandExceptionType((Message)new Class2259("argument.player.entities", new Object[0]));
        field27004 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.notfound.entity", new Object[0]));
        field27005 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.notfound.player", new Object[0]));
        field27006 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.selector.not_allowed", new Object[0]));
    }
}
