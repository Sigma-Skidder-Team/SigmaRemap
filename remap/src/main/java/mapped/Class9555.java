// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;

import java.util.Collection;

import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.util.text.ITextComponent;

public class Class9555
{
    public static void method35745(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("kick").requires(class7492 -> class7492.method23210(3))).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method35746(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), new Class2259("multiplayer.disconnect.kicked")))).then(Class7788.method25002("reason", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8695.method29806()).executes(commandContext -> method35746(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class8695.method29807(commandContext, "reason"))))));
    }
    
    private static int method35746(final Class7492 class7492, final Collection<Class513> collection, final ITextComponent class7493) {
        for (final Class513 class7494 : collection) {
            class7494.field3039.method17463(class7493);
            class7492.method23257(new Class2259("commands.kick.success", class7494.getDisplayName(), class7493), true);
        }
        return collection.size();
    }
}
