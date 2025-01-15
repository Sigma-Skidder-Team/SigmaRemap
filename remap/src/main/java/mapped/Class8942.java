// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import java.util.function.Predicate;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class8942
{
    private static final SimpleCommandExceptionType field37627;
    private static final Dynamic2CommandExceptionType field37628;
    private static final SimpleCommandExceptionType field37629;
    public static final Predicate<Class7990> field37630;
    
    public static void method31711(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("clone").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("begin", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(Class7788.method25002("end", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("destination", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), p0 -> true, Class2220.field13634))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("replace").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), p0 -> true, Class2220.field13634))).then(Class7788.method25001("force").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), p0 -> true, Class2220.field13632)))).then(Class7788.method25001("move").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), p0 -> true, Class2220.field13633)))).then(Class7788.method25001("normal").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), p0 -> true, Class2220.field13634))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("masked").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8942.field37630, Class2220.field13634))).then(Class7788.method25001("force").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8942.field37630, Class2220.field13632)))).then(Class7788.method25001("move").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8942.field37630, Class2220.field13633)))).then(Class7788.method25001("normal").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8942.field37630, Class2220.field13634))))).then(Class7788.method25001("filtered").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("filter", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8808.method30732()).executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8808.method30733((CommandContext<Class7492>)commandContext, "filter"), Class2220.field13634))).then(Class7788.method25001("force").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8808.method30733((CommandContext<Class7492>)commandContext, "filter"), Class2220.field13632)))).then(Class7788.method25001("move").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8808.method30733((CommandContext<Class7492>)commandContext, "filter"), Class2220.field13633)))).then(Class7788.method25001("normal").executes(commandContext -> method31712((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "begin"), Class8330.method27768((CommandContext<Class7492>)commandContext, "end"), Class8330.method27768((CommandContext<Class7492>)commandContext, "destination"), Class8808.method30733((CommandContext<Class7492>)commandContext, "filter"), Class2220.field13634)))))))));
    }
    
    private static int method31712(final Class7492 class7492, final BlockPos class7493, final BlockPos class7494, final BlockPos class7495, final Predicate<Class7990> predicate, final Class2220 class7496) throws CommandSyntaxException {
        final MutableBoundingBox class7497 = new MutableBoundingBox(class7493, class7494);
        final BlockPos method1135 = class7495.add(class7497.getLength());
        final MutableBoundingBox class7498 = new MutableBoundingBox(class7495, method1135);
        if (!class7496.method8408() && class7498.intersectsWith(class7497)) {
            throw Class8942.field37627.create();
        }
        final int i = class7497.getXSize() * class7497.getYSize() * class7497.getZSize();
        if (i > 32768) {
            throw Class8942.field37628.create((Object)32768, (Object)i);
        }
        final Class1849 method1136 = class7492.method23250();
        if (!method1136.method6972(class7493, class7494) || !method1136.method6972(class7495, method1135)) {
            throw Class8330.field34211.create();
        }
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        final ArrayList arrayList3 = Lists.newArrayList();
        final LinkedList linkedList = Lists.newLinkedList();
        final BlockPos class7499 = new BlockPos(class7498.minX - class7497.minX, class7498.minY - class7497.minY, class7498.minZ - class7497.minZ);
        for (int j = class7497.minZ; j <= class7497.maxZ; ++j) {
            for (int k = class7497.minY; k <= class7497.maxY; ++k) {
                for (int l = class7497.minX; l <= class7497.maxX; ++l) {
                    final BlockPos class7500 = new BlockPos(l, k, j);
                    final BlockPos method1137 = class7500.add(class7499);
                    final Class7990 class7501 = new Class7990(method1136, class7500, false);
                    final BlockState method1138 = class7501.method26065();
                    if (predicate.test(class7501)) {
                        final TileEntity method1139 = method1136.method6727(class7500);
                        if (method1139 == null) {
                            if (!method1138.method21722(method1136, class7500) && !method1138.method21762(method1136, class7500)) {
                                arrayList3.add(new Class8696(method1137, method1138, null));
                                linkedList.addFirst(class7500);
                            }
                            else {
                                arrayList.add(new Class8696(method1137, method1138, null));
                                linkedList.addLast(class7500);
                            }
                        }
                        else {
                            arrayList2.add(new Class8696(method1137, method1138, method1139.method2180(new Class51())));
                            linkedList.addLast(class7500);
                        }
                    }
                }
            }
        }
        if (class7496 == Class2220.field13633) {
            for (final BlockPos class7502 : linkedList) {
                Class447.method2267(method1136.method6727(class7502));
                method1136.method6688(class7502, Class7521.field29517.method11878(), 2);
            }
            final Iterator iterator2 = linkedList.iterator();
            while (iterator2.hasNext()) {
                method1136.method6688((BlockPos)iterator2.next(), Class7521.field29147.method11878(), 3);
            }
        }
        final ArrayList arrayList4 = Lists.newArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        final List reverse = Lists.reverse((List)arrayList4);
        for (final Class8696 class7503 : reverse) {
            Class447.method2267(method1136.method6727(class7503.field36541));
            method1136.method6688(class7503.field36541, Class7521.field29517.method11878(), 2);
        }
        int m = 0;
        for (final Class8696 class7504 : arrayList4) {
            if (!method1136.method6688(class7504.field36541, class7504.field36542, 2)) {
                continue;
            }
            ++m;
        }
        for (final Class8696 class7505 : arrayList2) {
            final TileEntity method1140 = method1136.method6727(class7505.field36541);
            if (class7505.field36543 != null) {
                if (method1140 != null) {
                    class7505.field36543.method298("x", class7505.field36541.getX());
                    class7505.field36543.method298("y", class7505.field36541.getY());
                    class7505.field36543.method298("z", class7505.field36541.getZ());
                    method1140.method2179(class7505.field36543);
                    method1140.method2161();
                }
            }
            method1136.method6688(class7505.field36541, class7505.field36542, 2);
        }
        for (final Class8696 class7506 : reverse) {
            method1136.method6694(class7506.field36541, class7506.field36542.method21696());
        }
        method1136.method6907().method21350(class7497, class7499);
        if (m != 0) {
            class7492.method23257(new Class2259("commands.clone.success", new Object[] { m }), true);
            return m;
        }
        throw Class8942.field37629.create();
    }
    
    static {
        field37627 = new SimpleCommandExceptionType((Message)new Class2259("commands.clone.overlap", new Object[0]));
        field37628 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.clone.toobig", new Object[] { o, o2 }));
        field37629 = new SimpleCommandExceptionType((Message)new Class2259("commands.clone.failed", new Object[0]));
        field37630 = (class7990 -> !class7990.method26065().method21706());
    }
}
