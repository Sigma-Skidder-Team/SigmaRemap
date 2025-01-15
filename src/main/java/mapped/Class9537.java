// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Date;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class9537
{
    private static final SimpleCommandExceptionType field41052;
    
    public static void method35605(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("ban").requires(class7492 -> class7492.method23255().method1537().method20591().method26203() && class7492.method23210(3))).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8740.method30191()).executes(commandContext -> method35606((Class7492)commandContext.getSource(), Class8740.method30190((CommandContext<Class7492>)commandContext, "targets"), null))).then(Class7788.method25002("reason", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8695.method29806()).executes(commandContext -> method35606((Class7492)commandContext.getSource(), Class8740.method30190((CommandContext<Class7492>)commandContext, "targets"), Class8695.method29807((CommandContext<Class7492>)commandContext, "reason"))))));
    }
    
    private static int method35606(final Class7492 class7492, final Collection<GameProfile> collection, final Class2250 class7493) throws CommandSyntaxException {
        final Class8007 method20591 = class7492.method23255().method1537().method20591();
        int n = 0;
        for (final GameProfile gameProfile : collection) {
            if (method20591.method26219(gameProfile)) {
                continue;
            }
            final Class6025 class7494 = new Class6025(gameProfile, null, class7492.method23248(), null, (class7493 != null) ? class7493.getString() : null);
            ((Class8006<K, Class6025>)method20591).method26206(class7494);
            ++n;
            class7492.method23257(new Class2259("commands.ban.success", new Object[] { Class9479.method35295(gameProfile), class7494.method17950() }), true);
            final Class513 method20592 = class7492.method23255().method1537().method20624(gameProfile.getId());
            if (method20592 == null) {
                continue;
            }
            method20592.field3039.method17463(new Class2259("multiplayer.disconnect.banned", new Object[0]));
        }
        if (n != 0) {
            return n;
        }
        throw Class9537.field41052.create();
    }
    
    static {
        field41052 = new SimpleCommandExceptionType((Message)new Class2259("commands.ban.failed", new Object[0]));
    }
}
