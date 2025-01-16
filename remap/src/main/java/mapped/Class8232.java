// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.function.Predicate;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;

public class Class8232
{
    private static final Dynamic2CommandExceptionType field33796;
    private static final Class118 field33797;
    private static final SimpleCommandExceptionType field33798;
    
    public static void method27272(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("fill").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("from", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(Class7788.method25002("to", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("block", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8450.method28195()).executes(commandContext -> method27273((Class7492)commandContext.getSource(), new MutableBoundingBox(Class8330.method27768((CommandContext<Class7492>)commandContext, "from"), Class8330.method27768((CommandContext<Class7492>)commandContext, "to")), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2214.field13594, null))).then(((LiteralArgumentBuilder)Class7788.method25001("replace").executes(commandContext -> method27273((Class7492)commandContext.getSource(), new MutableBoundingBox(Class8330.method27768((CommandContext<Class7492>)commandContext, "from"), Class8330.method27768((CommandContext<Class7492>)commandContext, "to")), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2214.field13594, null))).then(Class7788.method25002("filter", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8808.method30732()).executes(commandContext -> method27273((Class7492)commandContext.getSource(), new MutableBoundingBox(Class8330.method27768((CommandContext<Class7492>)commandContext, "from"), Class8330.method27768((CommandContext<Class7492>)commandContext, "to")), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2214.field13594, Class8808.method30733((CommandContext<Class7492>)commandContext, "filter")))))).then(Class7788.method25001("keep").executes(commandContext -> method27273((Class7492)commandContext.getSource(), new MutableBoundingBox(Class8330.method27768((CommandContext<Class7492>)commandContext, "from"), Class8330.method27768((CommandContext<Class7492>)commandContext, "to")), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2214.field13594, class7990 -> class7990.method26067().method6961(class7990.method26068()))))).then(Class7788.method25001("outline").executes(commandContext -> method27273((Class7492)commandContext.getSource(), new MutableBoundingBox(Class8330.method27768((CommandContext<Class7492>)commandContext, "from"), Class8330.method27768((CommandContext<Class7492>)commandContext, "to")), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2214.field13595, null)))).then(Class7788.method25001("hollow").executes(commandContext -> method27273((Class7492)commandContext.getSource(), new MutableBoundingBox(Class8330.method27768((CommandContext<Class7492>)commandContext, "from"), Class8330.method27768((CommandContext<Class7492>)commandContext, "to")), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2214.field13596, null)))).then(Class7788.method25001("destroy").executes(commandContext -> method27273((Class7492)commandContext.getSource(), new MutableBoundingBox(Class8330.method27768((CommandContext<Class7492>)commandContext, "from"), Class8330.method27768((CommandContext<Class7492>)commandContext, "to")), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2214.field13597, null)))))));
    }
    
    private static int method27273(final Class7492 class7492, final MutableBoundingBox class7493, final Class118 class7494, final Class2214 class7495, final Predicate<Class7990> predicate) throws CommandSyntaxException {
        final int i = class7493.getXSize() * class7493.getYSize() * class7493.getZSize();
        if (i > 32768) {
            throw Class8232.field33796.create((Object)32768, (Object)i);
        }
        final ArrayList arrayList = Lists.newArrayList();
        final Class1849 method23250 = class7492.method23250();
        int j = 0;
        for (final BlockPos class7496 : BlockPos.getAllInBoxMutable(class7493.minX, class7493.minY, class7493.minZ, class7493.maxX, class7493.maxY, class7493.maxZ)) {
            if (predicate != null && !predicate.test(new Class7990(method23250, class7496, true))) {
                continue;
            }
            final Class118 method23251 = class7495.field13598.method22784(class7493, class7496, class7494, method23250);
            if (method23251 == null) {
                continue;
            }
            Class447.method2267(method23250.method6727(class7496));
            if (!method23251.method610(method23250, class7496, 2)) {
                continue;
            }
            arrayList.add(class7496.toImmutable());
            ++j;
        }
        for (final BlockPos class7497 : arrayList) {
            method23250.method6694(class7497, method23250.getBlockState(class7497).method21696());
        }
        if (j != 0) {
            class7492.method23257(new Class2259("commands.fill.success", new Object[] { j }), true);
            return j;
        }
        throw Class8232.field33798.create();
    }
    
    static {
        field33796 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.fill.toobig", new Object[] { o, o2 }));
        field33797 = new Class118(Class7521.field29147.getDefaultState(), Collections.emptySet(), null);
        field33798 = new SimpleCommandExceptionType((Message)new Class2259("commands.fill.failed", new Object[0]));
    }
}
