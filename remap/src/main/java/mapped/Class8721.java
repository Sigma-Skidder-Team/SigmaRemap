// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;

import com.mojang.brigadier.context.CommandContext;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;

public class Class8721
{
    private static final SuggestionProvider<Class7492> field36637;
    
    public static void method29951(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("advancement").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("grant").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25001("only").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12433, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1463))).then(Class7788.method25002("criterion", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.greedyString()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23226(Class7000.method21430(commandContext, "advancement").method31039().keySet(), suggestionsBuilder)).executes(commandContext -> method29953(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class2130.field12433, Class7000.method21430(commandContext, "advancement"), StringArgumentType.getString(commandContext, "criterion")))))).then(Class7788.method25001("from").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12433, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1465))))).then(Class7788.method25001("until").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12433, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1466))))).then(Class7788.method25001("through").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12433, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1464))))).then(Class7788.method25001("everything").executes(commandContext -> method29952(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class2130.field12433, commandContext.getSource().method23255().method1566().method6399()))))).then(Class7788.method25001("revoke").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25001("only").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12434, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1463))).then(Class7788.method25002("criterion", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.greedyString()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23226(Class7000.method21430(commandContext, "advancement").method31039().keySet(), suggestionsBuilder)).executes(commandContext -> method29953(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class2130.field12434, Class7000.method21430(commandContext, "advancement"), StringArgumentType.getString(commandContext, "criterion")))))).then(Class7788.method25001("from").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12434, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1465))))).then(Class7788.method25001("until").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12434, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1466))))).then(Class7788.method25001("through").then(Class7788.method25002("advancement", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8721.field36637).executes(commandContext -> method29952((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class2130.field12434, method29954(Class7000.method21430((CommandContext<Class7492>)commandContext, "advancement"), Class270.field1464))))).then(Class7788.method25001("everything").executes(commandContext -> method29952(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class2130.field12434, commandContext.getSource().method23255().method1566().method6399()))))));
    }
    
    private static int method29952(final Class7492 class7492, final Collection<Class513> collection, final Class2130 class7493, final Collection<Class8863> collection2) {
        int n = 0;
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            n += class7493.method8284(iterator.next(), collection2);
        }
        if (n != 0) {
            if (collection2.size() != 1) {
                if (collection.size() != 1) {
                    class7492.method23257(new Class2259(class7493.method8287() + ".many.to.many.success", collection2.size(), collection.size()), true);
                }
                else {
                    class7492.method23257(new Class2259(class7493.method8287() + ".many.to.one.success", collection2.size(), collection.iterator().next().getDisplayName()), true);
                }
            }
            else if (collection.size() != 1) {
                class7492.method23257(new Class2259(class7493.method8287() + ".one.to.many.success", collection2.iterator().next().method31044(), collection.size()), true);
            }
            else {
                class7492.method23257(new Class2259(class7493.method8287() + ".one.to.one.success", collection2.iterator().next().method31044(), collection.iterator().next().getDisplayName()), true);
            }
            return n;
        }
        if (collection2.size() != 1) {
            if (collection.size() != 1) {
                throw new Class2379(new Class2259(class7493.method8287() + ".many.to.many.failure", collection2.size(), collection.size()));
            }
            throw new Class2379(new Class2259(class7493.method8287() + ".many.to.one.failure", collection2.size(), collection.iterator().next().getDisplayName()));
        }
        else {
            if (collection.size() != 1) {
                throw new Class2379(new Class2259(class7493.method8287() + ".one.to.many.failure", collection2.iterator().next().method31044(), collection.size()));
            }
            throw new Class2379(new Class2259(class7493.method8287() + ".one.to.one.failure", collection2.iterator().next().method31044(), collection.iterator().next().getDisplayName()));
        }
    }
    
    private static int method29953(final Class7492 class7492, final Collection<Class513> collection, final Class2130 class7493, final Class8863 class7494, final String s) {
        int n = 0;
        if (!class7494.method31039().containsKey(s)) {
            throw new Class2379(new Class2259("commands.advancement.criterionNotFound", class7494.method31044(), s));
        }
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!class7493.method8286(iterator.next(), class7494, s)) {
                continue;
            }
            ++n;
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259(class7493.method8287() + ".criterion.to.many.success", s, class7494.method31044(), collection.size()), true);
            }
            else {
                class7492.method23257(new Class2259(class7493.method8287() + ".criterion.to.one.success", s, class7494.method31044(), collection.iterator().next().getDisplayName()), true);
            }
            return n;
        }
        if (collection.size() != 1) {
            throw new Class2379(new Class2259(class7493.method8287() + ".criterion.to.many.failure", s, class7494.method31044(), collection.size()));
        }
        throw new Class2379(new Class2259(class7493.method8287() + ".criterion.to.one.failure", s, class7494.method31044(), collection.iterator().next().getDisplayName()));
    }
    
    private static List<Class8863> method29954(final Class8863 class8863, final Class270 class8864) {
        final ArrayList arrayList = Lists.newArrayList();
        if (Class270.method917(class8864)) {
            for (Class8863 class8865 = class8863.method31035(); class8865 != null; class8865 = class8865.method31035()) {
                arrayList.add(class8865);
            }
        }
        arrayList.add(class8863);
        if (Class270.method918(class8864)) {
            method29955(class8863, arrayList);
        }
        return arrayList;
    }
    
    private static void method29955(final Class8863 class8863, final List<Class8863> list) {
        for (final Class8863 class8864 : class8863.method31038()) {
            list.add(class8864);
            method29955(class8864, list);
        }
    }
    
    static {
        field36637 = ((commandContext, suggestionsBuilder) -> Class7491.method23222(commandContext.getSource().method23255().method1566().method6399().stream().map((Function<? super Class8863, ? extends ResourceLocation>)Class8863::method31042), suggestionsBuilder));
    }
}
