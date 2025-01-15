// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.regex.Pattern;

public class Class6519
{
    public static final Pattern field25943;
    private static final SimpleCommandExceptionType field25944;
    private static final SimpleCommandExceptionType field25945;
    
    public static void method19677(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("ban-ip").requires(class7492 -> class7492.method23255().method1537().method20592().method26203() && class7492.method23210(3))).then(((RequiredArgumentBuilder)Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).executes(commandContext -> method19678((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "target"), null))).then(Class7788.method25002("reason", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8695.method29806()).executes(commandContext -> method19678((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "target"), Class8695.method29807((CommandContext<Class7492>)commandContext, "reason"))))));
    }
    
    private static int method19678(final Class7492 class7492, final String input, final Class2250 class7493) throws CommandSyntaxException {
        if (Class6519.field25943.matcher(input).matches()) {
            return method19679(class7492, input, class7493);
        }
        final Class513 method20598 = class7492.method23255().method1537().method20598(input);
        if (method20598 == null) {
            throw Class6519.field25944.create();
        }
        return method19679(class7492, method20598.method2942(), class7493);
    }
    
    private static int method19679(final Class7492 class7492, final String s, final Class2250 class7493) throws CommandSyntaxException {
        final Class8009 method20592 = class7492.method23255().method1537().method20592();
        if (!method20592.method26223(s)) {
            final List<Class513> method20593 = class7492.method23255().method1537().method20612(s);
            final Class6026 class7494 = new Class6026(s, null, class7492.method23248(), null, (class7493 != null) ? class7493.getString() : null);
            ((Class8006<K, Class6026>)method20592).method26206(class7494);
            class7492.method23257(new Class2259("commands.banip.success", new Object[] { s, class7494.method17950() }), true);
            if (!method20593.isEmpty()) {
                class7492.method23257(new Class2259("commands.banip.info", new Object[] { method20593.size(), Class9043.method32517(method20593) }), true);
            }
            final Iterator iterator = method20593.iterator();
            while (iterator.hasNext()) {
                ((Class513)iterator.next()).field3039.method17463(new Class2259("multiplayer.disconnect.ip_banned", new Object[0]));
            }
            return method20593.size();
        }
        throw Class6519.field25945.create();
    }
    
    static {
        field25943 = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        field25944 = new SimpleCommandExceptionType((Message)new Class2259("commands.banip.invalid", new Object[0]));
        field25945 = new SimpleCommandExceptionType((Message)new Class2259("commands.banip.failed", new Object[0]));
    }
}
