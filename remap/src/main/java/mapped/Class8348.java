// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;

public class Class8348
{
    private static final SimpleCommandExceptionType field34264;
    private static final DynamicCommandExceptionType field34265;
    
    public static void method27827(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("spectate").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> method27828((Class7492)commandContext.getSource(), null, ((Class7492)commandContext.getSource()).method23253())).then(((RequiredArgumentBuilder)Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21143()).executes(commandContext -> method27828(commandContext.getSource(), Class6886.method21144(commandContext, "target"), commandContext.getSource().method23253()))).then(Class7788.method25002("player", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21149()).executes(commandContext -> method27828(commandContext.getSource(), Class6886.method21144(commandContext, "target"), Class6886.method21150(commandContext, "player"))))));
    }
    
    private static int method27828(final Class7492 class7492, final Entity class7493, final Class513 class7494) throws CommandSyntaxException {
        if (class7494 == class7493) {
            throw Class8348.field34264.create();
        }
        if (class7494.field3041.method26482() == Class101.field301) {
            class7494.method2952(class7493);
            if (class7493 == null) {
                class7492.method23257(new Class2259("commands.spectate.success.stopped"), false);
            }
            else {
                class7492.method23257(new Class2259("commands.spectate.success.started", class7493.getDisplayName()), false);
            }
            return 1;
        }
        throw Class8348.field34265.create(class7494.getDisplayName());
    }
    
    static {
        field34264 = new SimpleCommandExceptionType(new Class2259("commands.spectate.self", new Object[0]));
        field34265 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.spectate.not_spectator", o);
            return;
        });
    }
}
