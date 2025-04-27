// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;

import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.Collection;

import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.util.math.BlockPos;

public class Class8701
{
    public static void method29849(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("spawnpoint").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> method29850((Class7492)commandContext.getSource(), Collections.singleton(((Class7492)commandContext.getSource()).method23253()), new BlockPos(((Class7492)commandContext.getSource()).method23249()))).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method29850(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), new BlockPos(commandContext.getSource().method23249())))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).executes(commandContext -> method29850(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class8330.method27769(commandContext, "pos"))))));
    }
    
    private static int method29850(final Class7492 class7492, final Collection<Class513> collection, final BlockPos class7493) {
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().method2856(class7493, true, false);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.spawnpoint.success.multiple", class7493.getX(), class7493.getY(), class7493.getZ(), collection.size()), true);
        }
        else {
            class7492.method23257(new Class2259("commands.spawnpoint.success.single", class7493.getX(), class7493.getY(), class7493.getZ(), collection.iterator().next().getDisplayName()), true);
        }
        return collection.size();
    }
}
