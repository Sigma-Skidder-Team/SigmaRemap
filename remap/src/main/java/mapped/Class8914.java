// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Iterator;

import com.google.common.base.Joiner;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.dimension.DimensionType;

public class Class8914
{
    private static final Dynamic2CommandExceptionType field37490;
    private static final Dynamic2CommandExceptionType field37491;
    private static final SimpleCommandExceptionType field37492;
    private static final SimpleCommandExceptionType field37493;
    
    public static void method31409(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("forceload").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("add").then(((RequiredArgumentBuilder)Class7788.method25002("from", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7734.method24682()).executes(commandContext -> method31413((Class7492)commandContext.getSource(), Class7734.method24683((CommandContext<Class7492>)commandContext, "from"), Class7734.method24683((CommandContext<Class7492>)commandContext, "from"), true))).then(Class7788.method25002("to", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7734.method24682()).executes(commandContext -> method31413((Class7492)commandContext.getSource(), Class7734.method24683((CommandContext<Class7492>)commandContext, "from"), Class7734.method24683((CommandContext<Class7492>)commandContext, "to"), true)))))).then(((LiteralArgumentBuilder)Class7788.method25001("remove").then(((RequiredArgumentBuilder)Class7788.method25002("from", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7734.method24682()).executes(commandContext -> method31413((Class7492)commandContext.getSource(), Class7734.method24683((CommandContext<Class7492>)commandContext, "from"), Class7734.method24683((CommandContext<Class7492>)commandContext, "from"), false))).then(Class7788.method25002("to", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7734.method24682()).executes(commandContext -> method31413((Class7492)commandContext.getSource(), Class7734.method24683((CommandContext<Class7492>)commandContext, "from"), Class7734.method24683((CommandContext<Class7492>)commandContext, "to"), false))))).then(Class7788.method25001("all").executes(commandContext -> method31412((Class7492)commandContext.getSource()))))).then(((LiteralArgumentBuilder)Class7788.method25001("query").executes(commandContext -> method31411((Class7492)commandContext.getSource()))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7734.method24682()).executes(commandContext -> method31410((Class7492)commandContext.getSource(), Class7734.method24683((CommandContext<Class7492>)commandContext, "pos"))))));
    }
    
    private static int method31410(final Class7492 class7492, final Class7587 class7493) throws CommandSyntaxException {
        final ChunkPos class7494 = new ChunkPos(class7493.field30106 >> 4, class7493.field30107 >> 4);
        final DimensionType method20487 = class7492.method23250().method6789().getType();
        if (!class7492.method23255().method1481(method20487).method6919().contains(class7494.method25422())) {
            throw Class8914.field37491.create((Object)class7494, (Object)method20487);
        }
        class7492.method23257(new Class2259("commands.forceload.query.success", new Object[] { class7494, method20487 }), false);
        return 1;
    }
    
    private static int method31411(final Class7492 class7492) {
        final DimensionType method20487 = class7492.method23250().method6789().getType();
        final LongSet method20488 = class7492.method23255().method1481(method20487).method6919();
        final int size = method20488.size();
        if (size <= 0) {
            class7492.method23259(new Class2259("commands.forceload.added.none", new Object[] { method20487 }));
        }
        else {
            final String join = Joiner.on(", ").join((Iterator)method20488.stream().sorted().map(ChunkPos::new).map(ChunkPos::toString).iterator());
            if (size != 1) {
                class7492.method23257(new Class2259("commands.forceload.list.multiple", new Object[] { size, method20487, join }), false);
            }
            else {
                class7492.method23257(new Class2259("commands.forceload.list.single", new Object[] { method20487, join }), false);
            }
        }
        return size;
    }
    
    private static int method31412(final Class7492 class7492) {
        final DimensionType method20487 = class7492.method23250().method6789().getType();
        class7492.method23255().method1481(method20487).method6919().forEach(n2 -> class7493.method6920(ChunkPos.method25424(n2), ChunkPos.method25425(n2), (boolean)(0 != 0)));
        class7492.method23257(new Class2259("commands.forceload.removed.all", new Object[] { method20487 }), true);
        return 0;
    }
    
    private static int method31413(final Class7492 class7492, final Class7587 class7493, final Class7587 class7494, final boolean b) throws CommandSyntaxException {
        final int min = Math.min(class7493.field30106, class7494.field30106);
        final int min2 = Math.min(class7493.field30107, class7494.field30107);
        final int max = Math.max(class7493.field30106, class7494.field30106);
        final int max2 = Math.max(class7493.field30107, class7494.field30107);
        if (min >= -30000000) {
            if (min2 >= -30000000) {
                if (max < 30000000) {
                    if (max2 < 30000000) {
                        final int n = min >> 4;
                        final int n2 = min2 >> 4;
                        final int n3 = max >> 4;
                        final int n4 = max2 >> 4;
                        final long l = (n3 - n + 1L) * (n4 - n2 + 1L);
                        if (l > 256L) {
                            throw Class8914.field37490.create((Object)256, (Object)l);
                        }
                        final DimensionType method20487 = class7492.method23250().method6789().getType();
                        final Class1849 method20488 = class7492.method23255().method1481(method20487);
                        Object o = null;
                        int i = 0;
                        for (int j = n; j <= n3; ++j) {
                            for (int k = n2; k <= n4; ++k) {
                                if (method20488.method6920(j, k, b)) {
                                    ++i;
                                    if (o == null) {
                                        o = new ChunkPos(j, k);
                                    }
                                }
                            }
                        }
                        if (i != 0) {
                            if (i != 1) {
                                class7492.method23257(new Class2259("commands.forceload." + (b ? "added" : "removed") + ".multiple", new Object[] { i, method20487, new ChunkPos(n, n2), new ChunkPos(n3, n4) }), true);
                            }
                            else {
                                class7492.method23257(new Class2259("commands.forceload." + (b ? "added" : "removed") + ".single", new Object[] { o, method20487 }), true);
                            }
                            return i;
                        }
                        throw (b ? Class8914.field37492 : Class8914.field37493).create();
                    }
                }
            }
        }
        throw Class8330.field34212.create();
    }
    
    static {
        field37490 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.forceload.toobig", new Object[] { o, o2 }));
        field37491 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.forceload.query.failure", new Object[] { o, o2 }));
        field37492 = new SimpleCommandExceptionType((Message)new Class2259("commands.forceload.added.failure", new Object[0]));
        field37493 = new SimpleCommandExceptionType((Message)new Class2259("commands.forceload.removed.failure", new Object[0]));
    }
}
