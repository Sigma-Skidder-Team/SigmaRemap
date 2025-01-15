// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;

public class Class8524
{
    private static final SimpleCommandExceptionType field35791;
    
    public static void method28581(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("summon").requires(class7492 -> class7492.method23210(2))).then(((RequiredArgumentBuilder)Class7788.method25002("entity", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8605.method29180()).suggests((SuggestionProvider)Class8533.field35817).executes(commandContext -> method28582((Class7492)commandContext.getSource(), Class8605.method29181((CommandContext<Class7492>)commandContext, "entity"), ((Class7492)commandContext.getSource()).method23249(), new Class51(), true))).then(((RequiredArgumentBuilder)Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).executes(commandContext -> method28582((Class7492)commandContext.getSource(), Class8605.method29181((CommandContext<Class7492>)commandContext, "entity"), Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), new Class51(), true))).then(Class7788.method25002("nbt", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7418.method22831()).executes(commandContext -> method28582((Class7492)commandContext.getSource(), Class8605.method29181((CommandContext<Class7492>)commandContext, "entity"), Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), Class7418.method22832((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "nbt"), false))))));
    }
    
    private static int method28582(final Class7492 class7492, final Class1932 class7493, final Vec3d class7494, final Class51 class7495, final boolean b) throws CommandSyntaxException {
        final Class51 method333 = class7495.method333();
        method333.method306("id", class7493.toString());
        if (Class7499.method23354(Class7499.field29057).equals(class7493)) {
            final Class422 class7496 = new Class422(class7492.method23250(), class7494.field22770, class7494.field22771, class7494.field22772, false);
            class7492.method23250().method6903(class7496);
            class7492.method23257(new Class2259("commands.summon.success", new Object[] { class7496.method1871() }), true);
            return 1;
        }
        final Entity method334 = Class7499.method23378(method333, (Class1847)class7492.method23250(), class7500 -> {
            class7500.method1730(class7497.field22770, class7497.field22771, class7497.field22772, class7500.field2399, class7500.field2400);
            return class7499.method6887(class7500) ? class7500 : null;
        });
        if (method334 != null) {
            if (b) {
                if (method334 instanceof Class759) {
                    ((Class759)method334).method4188(class7492.method23250(), class7492.method23250().method6784(new BlockPos(method334)), Class2101.field12187, null, null);
                }
            }
            class7492.method23257(new Class2259("commands.summon.success", new Object[] { method334.method1871() }), true);
            return 1;
        }
        throw Class8524.field35791.create();
    }
    
    static {
        field35791 = new SimpleCommandExceptionType((Message)new Class2259("commands.summon.failed", new Object[0]));
    }
}
