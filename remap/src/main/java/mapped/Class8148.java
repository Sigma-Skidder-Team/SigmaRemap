// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.EnumSet;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8148 implements ArgumentType<EnumSet<Axis>>
{
    private static final Collection<String> field33558;
    private static final SimpleCommandExceptionType field33559;
    
    public static Class8148 method26843() {
        return new Class8148();
    }
    
    public static EnumSet<Axis> method26844(final CommandContext<Class7492> commandContext, final String s) {
        return (EnumSet)commandContext.getArgument(s, (Class)EnumSet.class);
    }
    
    public EnumSet<Axis> parse(final StringReader stringReader) throws CommandSyntaxException {
        final EnumSet<Axis> none = EnumSet.noneOf(Axis.class);
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            Axis class111 = null;
            switch (stringReader.read()) {
                case 'x': {
                    class111 = Axis.X;
                    break;
                }
                case 'y': {
                    class111 = Axis.Y;
                    break;
                }
                case 'z': {
                    class111 = Axis.Z;
                    break;
                }
                default: {
                    throw Class8148.field33559.create();
                }
            }
            if (none.contains(class111)) {
                throw Class8148.field33559.create();
            }
            none.add((Object)class111);
        }
        return none;
    }
    
    public Collection<String> getExamples() {
        return Class8148.field33558;
    }
    
    static {
        field33558 = Arrays.asList("xyz", "x");
        field33559 = new SimpleCommandExceptionType((Message)new Class2259("arguments.swizzle.invalid", new Object[0]));
    }
}