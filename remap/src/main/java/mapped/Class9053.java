// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class9053
{
    private static final SimpleCommandExceptionType field38322;
    private static final SimpleCommandExceptionType field38323;
    private static final SimpleCommandExceptionType field38324;
    private static final SimpleCommandExceptionType field38325;
    
    public static void method32560(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("whitelist").requires(class7492 -> class7492.method23210(3))).then(Class7788.method25001("on").executes(commandContext -> method32564(commandContext.getSource()))).then(Class7788.method25001("off").executes(commandContext -> method32565(commandContext.getSource()))).then(Class7788.method25001("list").executes(commandContext -> method32566(commandContext.getSource()))).then(Class7788.method25001("add").then(Class7788.method25002("targets", (ArgumentType<Object>)Class8740.method30191()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23227(commandContext.getSource().method23255().method1537().method20623().stream().filter(class6766 -> !class6765.method20601().method26226(class6766.method2844())).map(class6767 -> class6767.method2844().getName()), suggestionsBuilder)).executes(commandContext -> method32562(commandContext.getSource(), Class8740.method30190(commandContext, "targets"))))).then(Class7788.method25001("remove").then(Class7788.method25002("targets", (ArgumentType<Object>)Class8740.method30191()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23228(commandContext.getSource().method23255().method1537().method20602(), suggestionsBuilder)).executes(commandContext -> method32563(commandContext.getSource(), Class8740.method30190(commandContext, "targets"))))).then(Class7788.method25001("reload").executes(commandContext -> method32561(commandContext.getSource()))));
    }
    
    private static int method32561(final Class7492 class7492) {
        class7492.method23255().method1537().method20605();
        class7492.method23257(new Class2259("commands.whitelist.reloaded"), true);
        class7492.method23255().method1570(class7492);
        return 1;
    }
    
    private static int method32562(final Class7492 class7492, final Collection<GameProfile> collection) throws CommandSyntaxException {
        final Class8010 method20601 = class7492.method23255().method1537().method20601();
        int n = 0;
        for (final GameProfile gameProfile : collection) {
            if (method20601.method26226(gameProfile)) {
                continue;
            }
            method20601.method26206(new Class6027(gameProfile));
            class7492.method23257(new Class2259("commands.whitelist.add.success", Class9479.method35295(gameProfile)), true);
            ++n;
        }
        if (n != 0) {
            return n;
        }
        throw Class9053.field38324.create();
    }
    
    private static int method32563(final Class7492 class7492, final Collection<GameProfile> collection) throws CommandSyntaxException {
        final Class8010 method20601 = class7492.method23255().method1537().method20601();
        int n = 0;
        for (final GameProfile gameProfile : collection) {
            if (!method20601.method26226(gameProfile)) {
                continue;
            }
            method20601.method26209(new Class6027(gameProfile));
            class7492.method23257(new Class2259("commands.whitelist.remove.success", Class9479.method35295(gameProfile)), true);
            ++n;
        }
        if (n != 0) {
            class7492.method23255().method1570(class7492);
            return n;
        }
        throw Class9053.field38325.create();
    }
    
    private static int method32564(final Class7492 class7492) throws CommandSyntaxException {
        final Class6765 method1537 = class7492.method23255().method1537();
        if (!method1537.method20610()) {
            method1537.method20611(true);
            class7492.method23257(new Class2259("commands.whitelist.enabled"), true);
            class7492.method23255().method1570(class7492);
            return 1;
        }
        throw Class9053.field38322.create();
    }
    
    private static int method32565(final Class7492 class7492) throws CommandSyntaxException {
        final Class6765 method1537 = class7492.method23255().method1537();
        if (method1537.method20610()) {
            method1537.method20611(false);
            class7492.method23257(new Class2259("commands.whitelist.disabled"), true);
            return 1;
        }
        throw Class9053.field38323.create();
    }
    
    private static int method32566(final Class7492 class7492) {
        final String[] method20602 = class7492.method23255().method1537().method20602();
        if (method20602.length != 0) {
            class7492.method23257(new Class2259("commands.whitelist.list", method20602.length, String.join(", ", method20602)), false);
        }
        else {
            class7492.method23257(new Class2259("commands.whitelist.none"), false);
        }
        return method20602.length;
    }
    
    static {
        field38322 = new SimpleCommandExceptionType(new Class2259("commands.whitelist.alreadyOn", new Object[0]));
        field38323 = new SimpleCommandExceptionType(new Class2259("commands.whitelist.alreadyOff", new Object[0]));
        field38324 = new SimpleCommandExceptionType(new Class2259("commands.whitelist.add.failed", new Object[0]));
        field38325 = new SimpleCommandExceptionType(new Class2259("commands.whitelist.remove.failed", new Object[0]));
    }
}
