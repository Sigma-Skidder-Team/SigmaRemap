// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.util.math.BlockPos;

public class Class8667
{
    public static void method29672(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("setworldspawn").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> method29673((Class7492)commandContext.getSource(), new BlockPos(((Class7492)commandContext.getSource()).method23249()))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).executes(commandContext -> method29673(commandContext.getSource(), Class8330.method27769(commandContext, "pos")))));
    }
    
    private static int method29673(final Class7492 class7492, final BlockPos class7493) {
        class7492.method23250().setSpawnPoint(class7493);
        class7492.method23255().method1537().method20586(new Class4335(class7493));
        class7492.method23257(new Class2259("commands.setworldspawn.success", class7493.getX(), class7493.getY(), class7493.getZ()), true);
        return 1;
    }
}
