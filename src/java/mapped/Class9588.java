// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import java.util.function.Function;
import com.mojang.brigadier.StringReader;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class9588
{
    public static final Class9588 field41797;
    public static final SimpleCommandExceptionType field41798;
    private final Float field41799;
    private final Float field41800;
    
    public Class9588(final Float field41799, final Float field41800) {
        this.field41799 = field41799;
        this.field41800 = field41800;
    }
    
    @Nullable
    public Float method35956() {
        return this.field41799;
    }
    
    @Nullable
    public Float method35957() {
        return this.field41800;
    }
    
    public static Class9588 method35958(final StringReader stringReader, final boolean b, final Function<Float, Float> function) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw Class8684.field36495.createWithContext((ImmutableStringReader)stringReader);
        }
        final int cursor = stringReader.getCursor();
        final Float method35961 = method35961(method35959(stringReader, b), function);
        Float method35962 = null;
        Label_0104: {
            if (stringReader.canRead(2)) {
                if (stringReader.peek() == '.') {
                    if (stringReader.peek(1) == '.') {
                        stringReader.skip();
                        stringReader.skip();
                        method35962 = method35961(method35959(stringReader, b), function);
                        if (method35961 != null) {
                            break Label_0104;
                        }
                        if (method35962 != null) {
                            break Label_0104;
                        }
                        stringReader.setCursor(cursor);
                        throw Class8684.field36495.createWithContext((ImmutableStringReader)stringReader);
                    }
                }
            }
            if (!b) {
                if (stringReader.canRead()) {
                    if (stringReader.peek() == '.') {
                        stringReader.setCursor(cursor);
                        throw Class9588.field41798.createWithContext((ImmutableStringReader)stringReader);
                    }
                }
            }
            method35962 = method35961;
        }
        if (method35961 == null && method35962 == null) {
            stringReader.setCursor(cursor);
            throw Class8684.field36495.createWithContext((ImmutableStringReader)stringReader);
        }
        return new Class9588(method35961, method35962);
    }
    
    @Nullable
    private static Float method35959(final StringReader stringReader, final boolean b) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        while (stringReader.canRead() && method35960(stringReader, b)) {
            stringReader.skip();
        }
        final String substring = stringReader.getString().substring(cursor, stringReader.getCursor());
        if (substring.isEmpty()) {
            return null;
        }
        try {
            return Float.parseFloat(substring);
        }
        catch (final NumberFormatException ex) {
            if (b) {
                throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext((ImmutableStringReader)stringReader, (Object)substring);
            }
        }
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext((ImmutableStringReader)stringReader, (Object)substring);
    }
    
    private static boolean method35960(final StringReader stringReader, final boolean b) {
        final char peek = stringReader.peek();
        if (peek < '0' || peek > '9') {
            if (peek != '-') {
                return b && peek == '.' && (!stringReader.canRead(2) || stringReader.peek(1) != '.');
            }
        }
        return true;
    }
    
    @Nullable
    private static Float method35961(final Float n, final Function<Float, Float> function) {
        return (n != null) ? function.apply(n) : null;
    }
    
    static {
        field41797 = new Class9588(null, null);
        field41798 = new SimpleCommandExceptionType((Message)new Class2259("argument.range.ints", new Object[0]));
    }
}
