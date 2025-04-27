// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class9514
{
    private static final SimpleCommandExceptionType field40936 = null;
    private static final DynamicCommandExceptionType field40937 = null;
    private static final SuggestionProvider<Class7492> field40938 = null;
    
    public static void method35487(final CommandDispatcher<Class7492> commandDispatcher) {
    }
    
    private static int method35488(final Class7492 class7492, final Either<Class8263, Class7909<Class8263>> either, final int n, final boolean b) throws CommandSyntaxException {
        if (n != 0) {
            final long x = class7492.method23250().method6754() + n;
            class7492.method23250().method6764().method29601();
            either.ifLeft(class7495 -> {

            }).ifRight(class7500 -> {

            });
            return (int)Math.floorMod(x, 2147483647L);
        }
        throw Class9514.field40936.create();
    }
    
    private static int method35489(final Class7492 class7492, final String s) throws CommandSyntaxException {
        final int method25414 = class7492.method23250().method6764().method29601().method25414(s);
        if (method25414 != 0) {
            class7492.method23257(new Class2259("commands.schedule.cleared.success", method25414, s), true);
            return method25414;
        }
        throw Class9514.field40937.create(s);
    }
}
