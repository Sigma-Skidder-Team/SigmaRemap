// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Collections;
import com.mojang.brigadier.context.CommandContext;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.ITextComponent;

public class Class6544
{
    private static final SimpleCommandExceptionType field26001;
    private static final DynamicCommandExceptionType field26002;
    private static final SimpleCommandExceptionType field26003;
    private static final SimpleCommandExceptionType field26004;
    private static final SimpleCommandExceptionType field26005;
    private static final SimpleCommandExceptionType field26006;
    private static final SimpleCommandExceptionType field26007;
    private static final SimpleCommandExceptionType field26008;
    private static final SimpleCommandExceptionType field26009;
    private static final SimpleCommandExceptionType field26010;
    private static final SimpleCommandExceptionType field26011;
    private static final SimpleCommandExceptionType field26012;
    
    public static void method19785(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("team").requires(class7492 -> class7492.method23210(2))).then(((LiteralArgumentBuilder)Class7788.method25001("list").executes(commandContext -> method19800(commandContext.getSource()))).then(Class7788.method25002("team", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7725.method24662()).executes(commandContext -> method19799(commandContext.getSource(), Class7725.method24663(commandContext, "team"))))).then(Class7788.method25001("add").then(((RequiredArgumentBuilder)Class7788.method25002("team", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).executes(commandContext -> method19797(commandContext.getSource(), StringArgumentType.getString(commandContext, "team")))).then(Class7788.method25002("displayName", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method19798(commandContext.getSource(), StringArgumentType.getString(commandContext, "team"), Class9502.method35389(commandContext, "displayName")))))).then(Class7788.method25001("remove").then(Class7788.method25002("team", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7725.method24662()).executes(commandContext -> method19796(commandContext.getSource(), Class7725.method24663(commandContext, "team"))))).then(Class7788.method25001("empty").then(Class7788.method25002("team", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7725.method24662()).executes(commandContext -> method19795(commandContext.getSource(), Class7725.method24663(commandContext, "team"))))).then(Class7788.method25001("join").then(((RequiredArgumentBuilder)Class7788.method25002("team", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7725.method24662()).executes(commandContext -> method19787(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Collections.singleton(commandContext.getSource().method23252().method1867())))).then(Class7788.method25002("members", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests(Class7456.field28758).executes(commandContext -> method19787((Class7492)commandContext.getSource(), Class7725.method24663((CommandContext<Class7492>)commandContext, "team"), Class7456.method22951((CommandContext<Class7492>)commandContext, "members")))))).then(Class7788.method25001("leave").then(Class7788.method25002("members", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests(Class7456.field28758).executes(commandContext -> method19786((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "members"))))).then(Class7788.method25001("modify").then(((RequiredArgumentBuilder)Class7788.method25002("team", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7725.method24662()).then(Class7788.method25001("displayName").then(Class7788.method25002("displayName", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method19793(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class9502.method35389(commandContext, "displayName")))))).then(Class7788.method25001("color").then(Class7788.method25002("value", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6066.method18116()).executes(commandContext -> method19794(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class6066.method18117(commandContext, "value"))))).then(Class7788.method25001("friendlyFire").then(Class7788.method25002("allowed", (com.mojang.brigadier.arguments.ArgumentType<Object>)BoolArgumentType.bool()).executes(commandContext -> method19792(commandContext.getSource(), Class7725.method24663(commandContext, "team"), BoolArgumentType.getBool(commandContext, "allowed"))))).then(Class7788.method25001("seeFriendlyInvisibles").then(Class7788.method25002("allowed", (com.mojang.brigadier.arguments.ArgumentType<Object>)BoolArgumentType.bool()).executes(commandContext -> method19791(commandContext.getSource(), Class7725.method24663(commandContext, "team"), BoolArgumentType.getBool(commandContext, "allowed"))))).then(((LiteralArgumentBuilder)Class7788.method25001("nametagVisibility").then(Class7788.method25001("never").executes(commandContext -> method19788(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12148)))).then(Class7788.method25001("hideForOtherTeams").executes(commandContext -> method19788(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12149))).then(Class7788.method25001("hideForOwnTeam").executes(commandContext -> method19788(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12150))).then(Class7788.method25001("always").executes(commandContext -> method19788(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12147)))).then(((LiteralArgumentBuilder)Class7788.method25001("deathMessageVisibility").then(Class7788.method25001("never").executes(commandContext -> method19789(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12148)))).then(Class7788.method25001("hideForOtherTeams").executes(commandContext -> method19789(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12149))).then(Class7788.method25001("hideForOwnTeam").executes(commandContext -> method19789(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12150))).then(Class7788.method25001("always").executes(commandContext -> method19789(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class2097.field12147)))).then(((LiteralArgumentBuilder)Class7788.method25001("collisionRule").then(Class7788.method25001("never").executes(commandContext -> method19790(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class343.field2113)))).then(Class7788.method25001("pushOwnTeam").executes(commandContext -> method19790(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class343.field2115))).then(Class7788.method25001("pushOtherTeams").executes(commandContext -> method19790(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class343.field2114))).then(Class7788.method25001("always").executes(commandContext -> method19790(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class343.field2112)))).then(Class7788.method25001("prefix").then(Class7788.method25002("prefix", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method19801(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class9502.method35389(commandContext, "prefix"))))).then(Class7788.method25001("suffix").then(Class7788.method25002("suffix", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method19802(commandContext.getSource(), Class7725.method24663(commandContext, "team"), Class9502.method35389(commandContext, "suffix"))))))));
    }
    
    private static int method19786(final Class7492 class7492, final Collection<String> collection) {
        final Class6515 method1579 = class7492.method23255().method1579();
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            method1579.method19648(iterator.next());
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.team.leave.success.multiple", collection.size()), true);
        }
        else {
            class7492.method23257(new Class2259("commands.team.leave.success.single", collection.iterator().next()), true);
        }
        return collection.size();
    }
    
    private static int method19787(final Class7492 class7492, final Class6749 class7493, final Collection<String> collection) {
        final Class6515 method1579 = class7492.method23255().method1579();
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            method1579.method19615(iterator.next(), class7493);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.team.join.success.multiple", collection.size(), class7493.method20541()), true);
        }
        else {
            class7492.method23257(new Class2259("commands.team.join.success.single", collection.iterator().next(), class7493.method20541()), true);
        }
        return collection.size();
    }
    
    private static int method19788(final Class7492 class7492, final Class6749 class7493, final Class2097 class7494) throws CommandSyntaxException {
        if (class7493.method20554() != class7494) {
            class7493.method20556(class7494);
            class7492.method23257(new Class2259("commands.team.option.nametagVisibility.success", class7493.method20541(), class7494.method8219()), true);
            return 0;
        }
        throw Class6544.field26010.create();
    }
    
    private static int method19789(final Class7492 class7492, final Class6749 class7493, final Class2097 class7494) throws CommandSyntaxException {
        if (class7493.method20555() != class7494) {
            class7493.method20557(class7494);
            class7492.method23257(new Class2259("commands.team.option.deathMessageVisibility.success", class7493.method20541(), class7494.method8219()), true);
            return 0;
        }
        throw Class6544.field26011.create();
    }
    
    private static int method19790(final Class7492 class7492, final Class6749 class7493, final Class343 class7494) throws CommandSyntaxException {
        if (class7493.method20558() != class7494) {
            class7493.method20559(class7494);
            class7492.method23257(new Class2259("commands.team.option.collisionRule.success", class7493.method20541(), class7494.method1022()), true);
            return 0;
        }
        throw Class6544.field26012.create();
    }
    
    private static int method19791(final Class7492 class7492, final Class6749 class7493, final boolean b) throws CommandSyntaxException {
        if (class7493.method20552() != b) {
            class7493.method20553(b);
            class7492.method23257(new Class2259("commands.team.option.seeFriendlyInvisibles." + (b ? "enabled" : "disabled"), class7493.method20541()), true);
            return 0;
        }
        if (!b) {
            throw Class6544.field26009.create();
        }
        throw Class6544.field26008.create();
    }
    
    private static int method19792(final Class7492 class7492, final Class6749 class7493, final boolean b) throws CommandSyntaxException {
        if (class7493.method20550() != b) {
            class7493.method20551(b);
            class7492.method23257(new Class2259("commands.team.option.friendlyfire." + (b ? "enabled" : "disabled"), class7493.method20541()), true);
            return 0;
        }
        if (!b) {
            throw Class6544.field26007.create();
        }
        throw Class6544.field26006.create();
    }
    
    private static int method19793(final Class7492 class7492, final Class6749 class7493, final ITextComponent obj) throws CommandSyntaxException {
        if (!class7493.method20540().equals(obj)) {
            class7493.method20542(obj);
            class7492.method23257(new Class2259("commands.team.option.name.success", class7493.method20541()), true);
            return 0;
        }
        throw Class6544.field26004.create();
    }
    
    private static int method19794(final Class7492 class7492, final Class6749 class7493, final TextFormatting class7494) throws CommandSyntaxException {
        if (class7493.getColor() != class7494) {
            class7493.method20562(class7494);
            class7492.method23257(new Class2259("commands.team.option.color.success", class7493.method20541(), class7494.getFriendlyName()), true);
            return 0;
        }
        throw Class6544.field26005.create();
    }
    
    private static int method19795(final Class7492 class7492, final Class6749 class7493) throws CommandSyntaxException {
        final Class6515 method1579 = class7492.method23255().method1579();
        final ArrayList arrayList = Lists.newArrayList((Iterable)class7493.method20547());
        if (!arrayList.isEmpty()) {
            final Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                method1579.method19616((String)iterator.next(), class7493);
            }
            class7492.method23257(new Class2259("commands.team.empty.success", arrayList.size(), class7493.method20541()), true);
            return arrayList.size();
        }
        throw Class6544.field26003.create();
    }
    
    private static int method19796(final Class7492 class7492, final Class6749 class7493) {
        final Class6515 method1579 = class7492.method23255().method1579();
        method1579.method19647(class7493);
        class7492.method23257(new Class2259("commands.team.remove.success", class7493.method20541()), true);
        return method1579.method19650().size();
    }
    
    private static int method19797(final Class7492 class7492, final String s) throws CommandSyntaxException {
        return method19798(class7492, s, new StringTextComponent(s));
    }
    
    private static int method19798(final Class7492 class7492, final String s, final ITextComponent class7493) throws CommandSyntaxException {
        final Class6515 method1579 = class7492.method23255().method1579();
        if (method1579.method19645(s) != null) {
            throw Class6544.field26001.create();
        }
        if (s.length() <= 16) {
            final Class6749 method1580 = method1579.method19646(s);
            method1580.method20542(class7493);
            class7492.method23257(new Class2259("commands.team.add.success", method1580.method20541()), true);
            return method1579.method19650().size();
        }
        throw Class6544.field26002.create(16);
    }
    
    private static int method19799(final Class7492 class7492, final Class6749 class7493) {
        final Collection<String> method20547 = class7493.method20547();
        if (!method20547.isEmpty()) {
            class7492.method23257(new Class2259("commands.team.list.members.success", class7493.method20541(), method20547.size(), Class9479.method35296(method20547)), false);
        }
        else {
            class7492.method23257(new Class2259("commands.team.list.members.empty", class7493.method20541()), false);
        }
        return method20547.size();
    }
    
    private static int method19800(final Class7492 class7492) {
        final Collection<Class6749> method19650 = class7492.method23255().method1579().method19650();
        if (!method19650.isEmpty()) {
            class7492.method23257(new Class2259("commands.team.list.teams.success", method19650.size(), Class9479.method35298((Collection<Object>)method19650, Class6749::method20541)), false);
        }
        else {
            class7492.method23257(new Class2259("commands.team.list.teams.empty"), false);
        }
        return method19650.size();
    }
    
    private static int method19801(final Class7492 class7492, final Class6749 class7493, final ITextComponent class7494) {
        class7493.method20543(class7494);
        class7492.method23257(new Class2259("commands.team.option.prefix.success", class7494), false);
        return 1;
    }
    
    private static int method19802(final Class7492 class7492, final Class6749 class7493, final ITextComponent class7494) {
        class7493.method20545(class7494);
        class7492.method23257(new Class2259("commands.team.option.suffix.success", class7494), false);
        return 1;
    }
    
    static {
        field26001 = new SimpleCommandExceptionType(new Class2259("commands.team.add.duplicate", new Object[0]));
        field26002 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.team.add.longName", o);
            return;
        });
        field26003 = new SimpleCommandExceptionType(new Class2259("commands.team.empty.unchanged", new Object[0]));
        field26004 = new SimpleCommandExceptionType(new Class2259("commands.team.option.name.unchanged", new Object[0]));
        field26005 = new SimpleCommandExceptionType(new Class2259("commands.team.option.color.unchanged", new Object[0]));
        field26006 = new SimpleCommandExceptionType(new Class2259("commands.team.option.friendlyfire.alreadyEnabled", new Object[0]));
        field26007 = new SimpleCommandExceptionType(new Class2259("commands.team.option.friendlyfire.alreadyDisabled", new Object[0]));
        field26008 = new SimpleCommandExceptionType(new Class2259("commands.team.option.seeFriendlyInvisibles.alreadyEnabled", new Object[0]));
        field26009 = new SimpleCommandExceptionType(new Class2259("commands.team.option.seeFriendlyInvisibles.alreadyDisabled", new Object[0]));
        field26010 = new SimpleCommandExceptionType(new Class2259("commands.team.option.nametagVisibility.unchanged", new Object[0]));
        field26011 = new SimpleCommandExceptionType(new Class2259("commands.team.option.deathMessageVisibility.unchanged", new Object[0]));
        field26012 = new SimpleCommandExceptionType(new Class2259("commands.team.option.collisionRule.unchanged", new Object[0]));
    }
}
