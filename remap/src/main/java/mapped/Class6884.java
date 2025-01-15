// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import java.util.Map;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.ITextComponent;

public class Class6884
{
    private static final SimpleCommandExceptionType field26971;
    private static final SimpleCommandExceptionType field26972;
    private static final SimpleCommandExceptionType field26973;
    private static final SimpleCommandExceptionType field26974;
    private static final SimpleCommandExceptionType field26975;
    private static final Dynamic2CommandExceptionType field26976;
    
    public static void method21098(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("scoreboard").requires(class7492 -> class7492.method23210(2))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("objectives").then(Class7788.method25001("list").executes(commandContext -> method21117((Class7492)commandContext.getSource())))).then(Class7788.method25001("add").then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).then(((RequiredArgumentBuilder)Class7788.method25002("criteria", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9286.method34274()).executes(commandContext -> method21116((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "objective"), Class9286.method34275((CommandContext<Class7492>)commandContext, "criteria"), new StringTextComponent(StringArgumentType.getString(commandContext, "objective"))))).then(Class7788.method25002("displayName", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method21116((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "objective"), Class9286.method34275((CommandContext<Class7492>)commandContext, "criteria"), Class9502.method35389((CommandContext<Class7492>)commandContext, "displayName")))))))).then(Class7788.method25001("modify").then(((RequiredArgumentBuilder)Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).then(Class7788.method25001("displayname").then(Class7788.method25002("displayName", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method21113((Class7492)commandContext.getSource(), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective"), Class9502.method35389((CommandContext<Class7492>)commandContext, "displayName")))))).then((ArgumentBuilder)method21099())))).then(Class7788.method25001("remove").then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).executes(commandContext -> method21115((Class7492)commandContext.getSource(), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective")))))).then(Class7788.method25001("setdisplay").then(((RequiredArgumentBuilder)Class7788.method25002("slot", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7675.method24361()).executes(commandContext -> method21111((Class7492)commandContext.getSource(), Class7675.method24362((CommandContext<Class7492>)commandContext, "slot")))).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).executes(commandContext -> method21112((Class7492)commandContext.getSource(), Class7675.method24362((CommandContext<Class7492>)commandContext, "slot"), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective")))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("players").then(((LiteralArgumentBuilder)Class7788.method25001("list").executes(commandContext -> method21109((Class7492)commandContext.getSource()))).then(Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).executes(commandContext -> method21110((Class7492)commandContext.getSource(), Class7456.method22949((CommandContext<Class7492>)commandContext, "target")))))).then(Class7788.method25001("set").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).then(Class7788.method25002("score", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).executes(commandContext -> method21106((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), Class8717.method29935((CommandContext<Class7492>)commandContext, "objective"), IntegerArgumentType.getInteger(commandContext, "score")))))))).then(Class7788.method25001("get").then(Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).executes(commandContext -> method21101((Class7492)commandContext.getSource(), Class7456.method22949((CommandContext<Class7492>)commandContext, "target"), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective"))))))).then(Class7788.method25001("add").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).then(Class7788.method25002("score", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method21107((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), Class8717.method29935((CommandContext<Class7492>)commandContext, "objective"), IntegerArgumentType.getInteger(commandContext, "score")))))))).then(Class7788.method25001("remove").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).then(Class7788.method25002("score", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method21108((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), Class8717.method29935((CommandContext<Class7492>)commandContext, "objective"), IntegerArgumentType.getInteger(commandContext, "score")))))))).then(Class7788.method25001("reset").then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).executes(commandContext -> method21104((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets")))).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).executes(commandContext -> method21105((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective"))))))).then(Class7788.method25001("enable").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).suggests((commandContext, suggestionsBuilder) -> method21100((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), suggestionsBuilder)).executes(commandContext -> method21103((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective"))))))).then(Class7788.method25001("operation").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("targetObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).then(Class7788.method25002("operation", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6662.method20250()).then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).executes(commandContext -> method21102((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), Class8717.method29935((CommandContext<Class7492>)commandContext, "targetObjective"), Class6662.method20251((CommandContext<Class7492>)commandContext, "operation"), Class7456.method22951((CommandContext<Class7492>)commandContext, "source"), Class8717.method29934((CommandContext<Class7492>)commandContext, "sourceObjective")))))))))));
    }
    
    private static LiteralArgumentBuilder<Class7492> method21099() {
        final LiteralArgumentBuilder<Class7492> method25001 = Class7788.method25001("rendertype");
        for (final Class263 class263 : Class263.values()) {
            method25001.then(Class7788.method25001(class263.method902()).executes(commandContext -> method21114((Class7492)commandContext.getSource(), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective"), class263)));
        }
        return method25001;
    }
    
    private static CompletableFuture<Suggestions> method21100(final Class7492 class7492, final Collection<String> collection, final SuggestionsBuilder suggestionsBuilder) {
        final ArrayList arrayList = Lists.newArrayList();
        final Class6515 method1579 = class7492.method23255().method1579();
        for (final Class9290 class7493 : method1579.method19638()) {
            if (class7493.method34313() != Class9456.field40641) {
                continue;
            }
            int n = 0;
            for (final String s : collection) {
                if (method1579.method19635(s, class7493) && !method1579.method19636(s, class7493).method23975()) {
                    continue;
                }
                n = 1;
                break;
            }
            if (n == 0) {
                continue;
            }
            arrayList.add(class7493.method34312());
        }
        return Class7491.method23226(arrayList, suggestionsBuilder);
    }
    
    private static int method21101(final Class7492 class7492, final String s, final Class9290 class7493) throws CommandSyntaxException {
        final Class6515 method1579 = class7492.method23255().method1579();
        if (method1579.method19635(s, class7493)) {
            final Class7628 method1580 = method1579.method19636(s, class7493);
            class7492.method23257(new Class2259("commands.scoreboard.players.get.success", new Object[] { s, method1580.method23969(), class7493.method34315() }), false);
            return method1580.method23969();
        }
        throw Class6884.field26976.create((Object)class7493.method34312(), (Object)s);
    }
    
    private static int method21102(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493, final Class8356 class7494, final Collection<String> collection2, final Class9290 class7495) throws CommandSyntaxException {
        final Class6515 method1579 = class7492.method23255().method1579();
        int i = 0;
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final Class7628 method1580 = method1579.method19636(iterator.next(), class7493);
            final Iterator<String> iterator2 = collection2.iterator();
            while (iterator2.hasNext()) {
                class7494.method27893(method1580, method1579.method19636(iterator2.next(), class7495));
            }
            i += method1580.method23969();
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.scoreboard.players.operation.success.multiple", new Object[] { class7493.method34315(), collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.operation.success.single", new Object[] { class7493.method34315(), collection.iterator().next(), i }), true);
        }
        return i;
    }
    
    private static int method21103(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493) throws CommandSyntaxException {
        if (class7493.method34313() != Class9456.field40641) {
            throw Class6884.field26975.create();
        }
        final Class6515 method1579 = class7492.method23255().method1579();
        int n = 0;
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final Class7628 method1580 = method1579.method19636(iterator.next(), class7493);
            if (!method1580.method23975()) {
                continue;
            }
            method1580.method23976(false);
            ++n;
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.scoreboard.players.enable.success.multiple", new Object[] { class7493.method34315(), collection.size() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.scoreboard.players.enable.success.single", new Object[] { class7493.method34315(), collection.iterator().next() }), true);
            }
            return n;
        }
        throw Class6884.field26974.create();
    }
    
    private static int method21104(final Class7492 class7492, final Collection<String> collection) {
        final Class6515 method1579 = class7492.method23255().method1579();
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            method1579.method19641(iterator.next(), null);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.scoreboard.players.reset.all.multiple", new Object[] { collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.reset.all.single", new Object[] { collection.iterator().next() }), true);
        }
        return collection.size();
    }
    
    private static int method21105(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493) {
        final Class6515 method1579 = class7492.method23255().method1579();
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            method1579.method19641(iterator.next(), class7493);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.scoreboard.players.reset.specific.multiple", new Object[] { class7493.method34315(), collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.reset.specific.single", new Object[] { class7493.method34315(), collection.iterator().next() }), true);
        }
        return collection.size();
    }
    
    private static int method21106(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493, final int n) {
        final Class6515 method1579 = class7492.method23255().method1579();
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            method1579.method19636(iterator.next(), class7493).method23971(n);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.scoreboard.players.set.success.multiple", new Object[] { class7493.method34315(), collection.size(), n }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.set.success.single", new Object[] { class7493.method34315(), collection.iterator().next(), n }), true);
        }
        return n * collection.size();
    }
    
    private static int method21107(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493, final int n) {
        final Class6515 method1579 = class7492.method23255().method1579();
        int i = 0;
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final Class7628 method1580 = method1579.method19636(iterator.next(), class7493);
            method1580.method23971(method1580.method23969() + n);
            i += method1580.method23969();
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.scoreboard.players.add.success.multiple", new Object[] { n, class7493.method34315(), collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.add.success.single", new Object[] { n, class7493.method34315(), collection.iterator().next(), i }), true);
        }
        return i;
    }
    
    private static int method21108(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493, final int n) {
        final Class6515 method1579 = class7492.method23255().method1579();
        int i = 0;
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final Class7628 method1580 = method1579.method19636(iterator.next(), class7493);
            method1580.method23971(method1580.method23969() - n);
            i += method1580.method23969();
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.scoreboard.players.remove.success.multiple", new Object[] { n, class7493.method34315(), collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.remove.success.single", new Object[] { n, class7493.method34315(), collection.iterator().next(), i }), true);
        }
        return i;
    }
    
    private static int method21109(final Class7492 class7492) {
        final Collection<String> method19640 = class7492.method23255().method1579().method19640();
        if (!method19640.isEmpty()) {
            class7492.method23257(new Class2259("commands.scoreboard.players.list.success", new Object[] { method19640.size(), Class9479.method35296(method19640) }), false);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.list.empty", new Object[0]), false);
        }
        return method19640.size();
    }
    
    private static int method21110(final Class7492 class7492, final String s) {
        final Map<Class9290, Class7628> method19642 = class7492.method23255().method1579().method19642(s);
        if (!method19642.isEmpty()) {
            class7492.method23257(new Class2259("commands.scoreboard.players.list.entity.success", new Object[] { s, method19642.size() }), false);
            for (final Map.Entry<Class9290, V> entry : method19642.entrySet()) {
                class7492.method23257(new Class2259("commands.scoreboard.players.list.entity.entry", new Object[] { entry.getKey().method34315(), ((Class7628)entry.getValue()).method23969() }), false);
            }
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.players.list.entity.empty", new Object[] { s }), false);
        }
        return method19642.size();
    }
    
    private static int method21111(final Class7492 class7492, final int n) throws CommandSyntaxException {
        final Class6515 method1579 = class7492.method23255().method1579();
        if (method1579.method19644(n) != null) {
            method1579.method19614(n, null);
            class7492.method23257(new Class2259("commands.scoreboard.objectives.display.cleared", new Object[] { Class6516.method19654()[n] }), true);
            return 0;
        }
        throw Class6884.field26972.create();
    }
    
    private static int method21112(final Class7492 class7492, final int n, final Class9290 class7493) throws CommandSyntaxException {
        final Class6515 method1579 = class7492.method23255().method1579();
        if (method1579.method19644(n) != class7493) {
            method1579.method19614(n, class7493);
            class7492.method23257(new Class2259("commands.scoreboard.objectives.display.set", new Object[] { Class6516.method19654()[n], class7493.method34314() }), true);
            return 0;
        }
        throw Class6884.field26973.create();
    }
    
    private static int method21113(final Class7492 class7492, final Class9290 class7493, final ITextComponent obj) {
        if (!class7493.method34314().equals(obj)) {
            class7493.method34316(obj);
            class7492.method23257(new Class2259("commands.scoreboard.objectives.modify.displayname", new Object[] { class7493.method34312(), class7493.method34315() }), true);
        }
        return 0;
    }
    
    private static int method21114(final Class7492 class7492, final Class9290 class7493, final Class263 class7494) {
        if (class7493.method34317() != class7494) {
            class7493.method34318(class7494);
            class7492.method23257(new Class2259("commands.scoreboard.objectives.modify.rendertype", new Object[] { class7493.method34315() }), true);
        }
        return 0;
    }
    
    private static int method21115(final Class7492 class7492, final Class9290 class7493) {
        final Class6515 method1579 = class7492.method23255().method1579();
        method1579.method19643(class7493);
        class7492.method23257(new Class2259("commands.scoreboard.objectives.remove.success", new Object[] { class7493.method34315() }), true);
        return method1579.method19638().size();
    }
    
    private static int method21116(final Class7492 class7492, final String s, final Class9456 class7493, final ITextComponent class7494) throws CommandSyntaxException {
        final Class6515 method1579 = class7492.method23255().method1579();
        if (method1579.method19632(s) != null) {
            throw Class6884.field26971.create();
        }
        if (s.length() <= 16) {
            method1579.method19633(s, class7493, class7494, class7493.method35141());
            class7492.method23257(new Class2259("commands.scoreboard.objectives.add.success", new Object[] { method1579.method19632(s).method34315() }), true);
            return method1579.method19638().size();
        }
        throw Class8717.field36629.create((Object)16);
    }
    
    private static int method21117(final Class7492 class7492) {
        final Collection<Class9290> method19638 = class7492.method23255().method1579().method19638();
        if (!method19638.isEmpty()) {
            class7492.method23257(new Class2259("commands.scoreboard.objectives.list.success", new Object[] { method19638.size(), Class9479.method35298((Collection<Object>)method19638, Class9290::method34315) }), false);
        }
        else {
            class7492.method23257(new Class2259("commands.scoreboard.objectives.list.empty", new Object[0]), false);
        }
        return method19638.size();
    }
    
    static {
        field26971 = new SimpleCommandExceptionType((Message)new Class2259("commands.scoreboard.objectives.add.duplicate", new Object[0]));
        field26972 = new SimpleCommandExceptionType((Message)new Class2259("commands.scoreboard.objectives.display.alreadyEmpty", new Object[0]));
        field26973 = new SimpleCommandExceptionType((Message)new Class2259("commands.scoreboard.objectives.display.alreadySet", new Object[0]));
        field26974 = new SimpleCommandExceptionType((Message)new Class2259("commands.scoreboard.players.enable.failed", new Object[0]));
        field26975 = new SimpleCommandExceptionType((Message)new Class2259("commands.scoreboard.players.enable.invalid", new Object[0]));
        field26976 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.scoreboard.players.get.null", new Object[] { o, o2 }));
    }
}
