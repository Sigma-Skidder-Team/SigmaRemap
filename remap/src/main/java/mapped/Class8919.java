// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8919 implements ArgumentType<Class5346>
{
    private static final Collection<String> field37502;
    public static final SimpleCommandExceptionType field37503;
    
    public static Class8919 method31444() {
        return new Class8919();
    }
    
    public static Class5346 method31445(final CommandContext<Class7492> commandContext, final String s) {
        return (Class5346)commandContext.getArgument(s, (Class)Class5346.class);
    }
    
    public Class5346 parse(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw Class8919.field37503.createWithContext(stringReader);
        }
        final Class7629 method23979 = Class7629.method23979(stringReader, false);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            return new Class5347(Class7629.method23979(stringReader, false), method23979, new Class7629(true, 0.0));
        }
        stringReader.setCursor(cursor);
        throw Class8919.field37503.createWithContext(stringReader);
    }
    
    public Collection<String> getExamples() {
        return Class8919.field37502;
    }
    
    static {
        field37502 = Arrays.asList("0 0", "~ ~", "~-5 ~5");
        field37503 = new SimpleCommandExceptionType(new Class2259("argument.rotation.incomplete", new Object[0]));
    }
}
