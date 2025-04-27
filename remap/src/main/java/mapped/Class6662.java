// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.util.math.MathHelper;

public class Class6662 implements ArgumentType<Class8356>
{
    private static final Collection<String> field26319;
    private static final SimpleCommandExceptionType field26320;
    private static final SimpleCommandExceptionType field26321;
    
    public static Class6662 method20250() {
        return new Class6662();
    }
    
    public static Class8356 method20251(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return (Class8356)commandContext.getArgument(s, (Class)Class8356.class);
    }
    
    public Class8356 parse(final StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead()) {
            final int cursor = stringReader.getCursor();
            while (stringReader.canRead() && stringReader.peek() != ' ') {
                stringReader.skip();
            }
            return method20252(stringReader.getString().substring(cursor, stringReader.getCursor()));
        }
        throw Class6662.field26320.create();
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23228(new String[] { "=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><" }, suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class6662.field26319;
    }
    
    private static Class8356 method20252(final String s) throws CommandSyntaxException {
        return s.equals("><") ? ((class7628, class7629) -> {
            final int method23969 = class7628.method23969();
            class7628.method23971(class7629.method23969());
            class7629.method23971(method23969);
        }) : method20253(s);
    }
    
    private static Class8357 method20253(final String s) throws CommandSyntaxException {
        switch (s) {
            case "=": {
                return (p0, n3) -> n3;
            }
            case "+=": {
                return (n5, n7) -> n5 + n7;
            }
            case "-=": {
                return (n9, n11) -> n9 - n11;
            }
            case "*=": {
                return (n13, n15) -> n13 * n15;
            }
            case "/=": {
                return (n17, n19) -> {
                    if (n19 != 0) {
                        return MathHelper.method35657(n17, n19);
                    }
                    else {
                        throw Class6662.field26321.create();
                    }
                };
            }
            case "%=": {
                return (n21, n23) -> {
                    if (n23 != 0) {
                        return MathHelper.method35664(n21, n23);
                    }
                    else {
                        throw Class6662.field26321.create();
                    }
                };
            }
            case "<": {
                return Math::min;
            }
            case ">": {
                return Math::max;
            }
            default: {
                throw Class6662.field26320.create();
            }
        }
    }
    
    static {
        field26319 = Arrays.asList(Class6662.\u11e9\u5a21\u756d\uc350\u2db3\u8be9[0], Class6662.\u11e9\u5a21\u756d\uc350\u2db3\u8be9[7], Class6662.\u11e9\u5a21\u756d\uc350\u2db3\u8be9[6]);
        field26320 = new SimpleCommandExceptionType(new Class2259("arguments.operation.invalid", new Object[0]));
        field26321 = new SimpleCommandExceptionType(new Class2259("arguments.operation.div0", new Object[0]));
    }
}
