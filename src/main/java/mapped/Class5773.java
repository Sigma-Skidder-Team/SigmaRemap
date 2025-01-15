// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.Message;
import com.google.common.collect.Iterables;
import java.util.Collections;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Supplier;
import java.util.Iterator;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import java.util.function.Function;
import java.util.List;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class5773
{
    private static final SimpleCommandExceptionType field23611;
    private static final DynamicCommandExceptionType field23612;
    private static final DynamicCommandExceptionType field23613;
    private static final SimpleCommandExceptionType field23614;
    private static final DynamicCommandExceptionType field23615;
    private static final DynamicCommandExceptionType field23616;
    private static final DynamicCommandExceptionType field23617;
    public static final List<Function<String, Class6595>> field23618;
    public static final List<Class6595> field23619;
    public static final List<Class6595> field23620;
    
    public static void method17173(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)Class7788.method25001("data").requires(class6596 -> class6596.method23210(2));
        for (final Class6595 class6595 : Class5773.field23619) {
            ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then((ArgumentBuilder)class6595.method20042((ArgumentBuilder<Class7492, ?>)Class7788.method25001("merge"), argumentBuilder2 -> argumentBuilder2.then(Class7788.method25002("nbt", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7418.method22831()).executes(commandContext -> method17182((Class7492)commandContext.getSource(), class6597.method20041((CommandContext<Class7492>)commandContext), Class7418.method22832((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "nbt"))))))).then((ArgumentBuilder)class6595.method20042((ArgumentBuilder<Class7492, ?>)Class7788.method25001("get"), argumentBuilder4 -> argumentBuilder4.executes(commandContext -> method17181((Class7492)commandContext.getSource(), class6598.method20041((CommandContext<Class7492>)commandContext))).then(((RequiredArgumentBuilder)Class7788.method25002("path", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8258.method27403()).executes(commandContext -> method17179((Class7492)commandContext.getSource(), class6598.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path")))).then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).executes(commandContext -> method17180((Class7492)commandContext.getSource(), class6598.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"), DoubleArgumentType.getDouble(commandContext, "scale")))))))).then((ArgumentBuilder)class6595.method20042((ArgumentBuilder<Class7492, ?>)Class7788.method25001("remove"), argumentBuilder6 -> argumentBuilder6.then(Class7788.method25002("path", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8258.method27403()).executes(commandContext -> method17177((Class7492)commandContext.getSource(), class6599.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"))))))).then((ArgumentBuilder)method17175((argumentBuilder7, class6600) -> argumentBuilder7.then(Class7788.method25001("insert").then(Class7788.method25002("index", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).then((ArgumentBuilder)class6600.method31209((commandContext, class51, class52, list) -> method17174(IntegerArgumentType.getInteger(commandContext, "index"), class51, class52, list))))).then(Class7788.method25001("prepend").then((ArgumentBuilder)class6600.method31209((commandContext, class51, class52, list) -> method17174(0, class51, class52, list)))).then(Class7788.method25001("append").then((ArgumentBuilder)class6600.method31209((commandContext, class51, class52, list) -> method17174(-1, class51, class52, list)))).then(Class7788.method25001("set").then((ArgumentBuilder)class6600.method31209((commandContext, class51, class52, list) -> class52.method28809(class51, (Class41)Iterables.getLast((Iterable)list)::method265)))).then(Class7788.method25001("merge").then((ArgumentBuilder)class6600.method31209((commandContext, class51, class52, list) -> {
                final List<Class41> method28807 = class52.method28807(class51, (Supplier<Class41>)Class51::new);
                int n = 0;
                for (final Class41 class53 : method28807) {
                    if (!(class53 instanceof Class51)) {
                        throw Class5773.field23616.create((Object)class53);
                    }
                    final Class51 class54 = (Class51)class53;
                    final Class51 method28808 = class54.method333();
                    for (final Class41 class55 : list) {
                        if (!(class55 instanceof Class51)) {
                            throw Class5773.field23616.create((Object)class55);
                        }
                        class54.method338((Class51)class55);
                    }
                    n += (method28808.equals(class54) ? 0 : 1);
                }
                return n;
            })))));
        }
        commandDispatcher.register(literalArgumentBuilder);
    }
    
    private static int method17174(final int n, final Class51 class51, final Class8570 class52, final List<Class41> list) throws CommandSyntaxException {
        final List<Class41> method28807 = class52.method28807(class51, (Supplier<Class41>)Class52::new);
        int n2 = 0;
        for (final Class41 class53 : method28807) {
            if (!(class53 instanceof Class38)) {
                throw Class5773.field23615.create((Object)class53);
            }
            int n3 = 0;
            final Class38 class54 = (Class38)class53;
            int i = (n < 0) ? (class54.size() + n + 1) : n;
            for (final Class41 class55 : list) {
                try {
                    if (!class54.method258(i, class55.method265())) {
                        continue;
                    }
                    ++i;
                    n3 = 1;
                }
                catch (final IndexOutOfBoundsException ex) {
                    throw Class5773.field23617.create((Object)i);
                }
            }
            n2 += n3;
        }
        return n2;
    }
    
    private static ArgumentBuilder<Class7492, ?> method17175(final BiConsumer<ArgumentBuilder<Class7492, ?>, Class8877> biConsumer) {
        final LiteralArgumentBuilder<Class7492> method25001 = Class7788.method25001("modify");
        final Iterator<Class6595> iterator = Class5773.field23619.iterator();
        while (iterator.hasNext()) {
            iterator.next().method20042((ArgumentBuilder<Class7492, ?>)method25001, argumentBuilder2 -> {
                Class7788.method25002("targetPath", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8258.method27403());
                Class5773.field23620.iterator();
                final Iterator iterator2;
                final ArgumentBuilder argumentBuilder3;
                while (iterator2.hasNext()) {
                    biConsumer2.accept(argumentBuilder3, class6597 -> class6595.method20042((ArgumentBuilder<Class7492, ?>)Class7788.method25001("from"), argumentBuilder2 -> argumentBuilder2.executes(commandContext -> method17176((CommandContext<Class7492>)commandContext, class6599, class6600, (List<Class41>)Collections.singletonList(class6598.method20041((CommandContext<Class7492>)commandContext).method16526()))).then(Class7788.method25002("sourcePath", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8258.method27403()).executes(commandContext -> method17176((CommandContext<Class7492>)commandContext, class6599, class6600, Class8258.method27404((CommandContext<Class7492>)commandContext, "sourcePath").method28804(class6598.method20041((CommandContext<Class7492>)commandContext).method16526()))))));
                }
                biConsumer2.accept(argumentBuilder3, class6596 -> Class7788.method25001("value").then(Class7788.method25002("value", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9136.method33309()).executes(commandContext -> method17176((CommandContext<Class7492>)commandContext, class6595, class6596, Collections.singletonList(Class9136.method33310((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "value"))))));
                return argumentBuilder2.then(argumentBuilder3);
            });
        }
        return (ArgumentBuilder<Class7492, ?>)method25001;
    }
    
    private static int method17176(final CommandContext<Class7492> commandContext, final Class6595 class6595, final Class9293 class6596, final List<Class41> list) throws CommandSyntaxException {
        final Class5414 method20041 = class6595.method20041(commandContext);
        final Class8570 method20042 = Class8258.method27404(commandContext, "targetPath");
        final Class51 method20043 = method20041.method16526();
        final int method20044 = class6596.method34321(commandContext, method20043, method20042, list);
        if (method20044 != 0) {
            method20041.method16525(method20043);
            ((Class7492)commandContext.getSource()).method23257(method20041.method16527(), true);
            return method20044;
        }
        throw Class5773.field23611.create();
    }
    
    private static int method17177(final Class7492 class7492, final Class5414 class7493, final Class8570 class7494) throws CommandSyntaxException {
        final Class51 method16526 = class7493.method16526();
        final int method16527 = class7494.method28810(method16526);
        if (method16527 != 0) {
            class7493.method16525(method16526);
            class7492.method23257(class7493.method16527(), true);
            return method16527;
        }
        throw Class5773.field23611.create();
    }
    
    private static Class41 method17178(final Class8570 class8570, final Class5414 class8571) throws CommandSyntaxException {
        final Iterator<Object> iterator = class8570.method28804(class8571.method16526()).iterator();
        final Class41 class8572 = iterator.next();
        if (!iterator.hasNext()) {
            return class8572;
        }
        throw Class5773.field23614.create();
    }
    
    private static int method17179(final Class7492 class7492, final Class5414 class7493, final Class8570 class7494) throws CommandSyntaxException {
        final Class41 method17178 = method17178(class7494, class7493);
        int n;
        if (!(method17178 instanceof Class43)) {
            if (!(method17178 instanceof Class38)) {
                if (!(method17178 instanceof Class51)) {
                    if (!(method17178 instanceof Class50)) {
                        throw Class5773.field23613.create((Object)class7494.toString());
                    }
                    n = method17178.method267().length();
                }
                else {
                    n = ((Class51)method17178).method294();
                }
            }
            else {
                n = ((Class38)method17178).size();
            }
        }
        else {
            n = Class9546.method35644(((Class43)method17178).method274());
        }
        class7492.method23257(class7493.method16528(method17178), false);
        return n;
    }
    
    private static int method17180(final Class7492 class7492, final Class5414 class7493, final Class8570 class7494, final double n) throws CommandSyntaxException {
        final Class41 method17178 = method17178(class7494, class7493);
        if (method17178 instanceof Class43) {
            final int method17179 = Class9546.method35644(((Class43)method17178).method274() * n);
            class7492.method23257(class7493.method16529(class7494, n, method17179), false);
            return method17179;
        }
        throw Class5773.field23612.create((Object)class7494.toString());
    }
    
    private static int method17181(final Class7492 class7492, final Class5414 class7493) throws CommandSyntaxException {
        class7492.method23257(class7493.method16528(class7493.method16526()), false);
        return 1;
    }
    
    private static int method17182(final Class7492 class7492, final Class5414 class7493, final Class51 class7494) throws CommandSyntaxException {
        final Class51 method16526 = class7493.method16526();
        final Class51 method16527 = method16526.method333().method338(class7494);
        if (!method16526.equals(method16527)) {
            class7493.method16525(method16527);
            class7492.method23257(class7493.method16527(), true);
            return 1;
        }
        throw Class5773.field23611.create();
    }
    
    static {
        field23611 = new SimpleCommandExceptionType((Message)new Class2259("commands.data.merge.failed", new Object[0]));
        field23612 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.data.get.invalid", new Object[] { o });
            return;
        });
        field23613 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("commands.data.get.unknown", new Object[] { o3 });
            return;
        });
        field23614 = new SimpleCommandExceptionType((Message)new Class2259("commands.data.get.multiple", new Object[0]));
        field23615 = new DynamicCommandExceptionType(o5 -> {
            new Class2259("commands.data.modify.expected_list", new Object[] { o5 });
            return;
        });
        field23616 = new DynamicCommandExceptionType(o7 -> {
            new Class2259("commands.data.modify.expected_object", new Object[] { o7 });
            return;
        });
        field23617 = new DynamicCommandExceptionType(o9 -> {
            new Class2259("commands.data.modify.invalid_index", new Object[] { o9 });
            return;
        });
        field23618 = (List)ImmutableList.of((Object)Class5416.field22586, (Object)Class5413.field22578, (Object)Class5415.field22582);
        field23619 = Class5773.field23618.stream().map(function -> function.apply("target")).collect((Collector<? super Object, Object, List<Class6595>>)ImmutableList.toImmutableList());
        field23620 = Class5773.field23618.stream().map(function2 -> function2.apply("source")).collect((Collector<? super Object, Object, List<Class6595>>)ImmutableList.toImmutableList());
    }
}
