// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Predicate;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class8595
{
    private static final SimpleCommandExceptionType field36098;
    
    public static void method29101(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("setblock").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("block", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8450.method28195()).executes(commandContext -> method29102((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "pos"), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2193.field13351, null))).then(Class7788.method25001("destroy").executes(commandContext -> method29102((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "pos"), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2193.field13352, null)))).then(Class7788.method25001("keep").executes(commandContext -> method29102((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "pos"), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2193.field13351, class7990 -> class7990.method26067().method6961(class7990.method26068()))))).then(Class7788.method25001("replace").executes(commandContext -> method29102((Class7492)commandContext.getSource(), Class8330.method27768((CommandContext<Class7492>)commandContext, "pos"), Class8450.method28196((CommandContext<Class7492>)commandContext, "block"), Class2193.field13351, null))))));
    }
    
    private static int method29102(final Class7492 class7492, final BlockPos class7493, final Class118 class7494, final Class2193 class7495, final Predicate<Class7990> predicate) throws CommandSyntaxException {
        final Class1849 method23250 = class7492.method23250();
        if (predicate != null && !predicate.test(new Class7990(method23250, class7493, true))) {
            throw Class8595.field36098.create();
        }
        boolean b;
        if (class7495 != Class2193.field13352) {
            Class447.method2267(method23250.method6727(class7493));
            b = true;
        }
        else {
            method23250.method7149(class7493, true);
            b = !class7494.method609().method21706();
        }
        if (b && !class7494.method610(method23250, class7493, 2)) {
            throw Class8595.field36098.create();
        }
        method23250.method6694(class7493, class7494.method609().method21696());
        class7492.method23257(new Class2259("commands.setblock.success", new Object[] { class7493.getX(), class7493.getY(), class7493.getZ() }), true);
        return 1;
    }
    
    static {
        field36098 = new SimpleCommandExceptionType((Message)new Class2259("commands.setblock.failed", new Object[0]));
    }
}
