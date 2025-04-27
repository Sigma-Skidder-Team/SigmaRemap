// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;

import java.util.Collection;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.util.text.ITextComponent;

public class Class6365
{
    public static void method19010(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralCommandNode register = commandDispatcher.register(Class7788.method25001("msg").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25002("message", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8695.method29806()).executes(commandContext -> method19011(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class8695.method29807(commandContext, "message"))))));
        commandDispatcher.register(Class7788.method25001("tell").redirect(register));
        commandDispatcher.register(Class7788.method25001("w").redirect(register));
    }
    
    private static int method19011(final Class7492 class7492, final Collection<Class513> collection, final ITextComponent class7493) {
        for (final Class513 class7494 : collection) {
            class7494.sendMessage(new Class2259("commands.message.display.incoming", class7492.method23247(), class7493.deepCopy()).applyTextStyles(TextFormatting.GRAY, TextFormatting.ITALIC));
            class7492.method23257(new Class2259("commands.message.display.outgoing", class7494.getDisplayName(), class7493.deepCopy()).applyTextStyles(TextFormatting.GRAY, TextFormatting.ITALIC), false);
        }
        return collection.size();
    }
}
