// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class7629
{
    public static final SimpleCommandExceptionType field30215;
    public static final SimpleCommandExceptionType field30216;
    private final boolean field30217;
    private final double field30218;
    
    public Class7629(final boolean field30217, final double field30218) {
        this.field30217 = field30217;
        this.field30218 = field30218;
    }
    
    public double method23978(final double n) {
        return this.field30217 ? (this.field30218 + n) : this.field30218;
    }
    
    public static Class7629 method23979(final StringReader stringReader, final boolean b) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            throw Class7555.field29961.createWithContext(stringReader);
        }
        if (!stringReader.canRead()) {
            throw Class7629.field30215.createWithContext(stringReader);
        }
        final boolean method23981 = method23981(stringReader);
        final int cursor = stringReader.getCursor();
        double n = (stringReader.canRead() && stringReader.peek() != ' ') ? stringReader.readDouble() : 0.0;
        final String substring = stringReader.getString().substring(cursor, stringReader.getCursor());
        if (method23981 && substring.isEmpty()) {
            return new Class7629(true, 0.0);
        }
        if (!substring.contains(".")) {
            if (!method23981) {
                if (b) {
                    n += 0.5;
                }
            }
        }
        return new Class7629(method23981, n);
    }
    
    public static Class7629 method23980(final StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            throw Class7555.field29961.createWithContext(stringReader);
        }
        if (stringReader.canRead()) {
            final boolean method23981 = method23981(stringReader);
            double n;
            if (stringReader.canRead() && stringReader.peek() != ' ') {
                n = (method23981 ? stringReader.readDouble() : stringReader.readInt());
            }
            else {
                n = 0.0;
            }
            return new Class7629(method23981, n);
        }
        throw Class7629.field30216.createWithContext(stringReader);
    }
    
    private static boolean method23981(final StringReader stringReader) {
        boolean b;
        if (stringReader.peek() != '~') {
            b = false;
        }
        else {
            b = true;
            stringReader.skip();
        }
        return b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class7629) {
            final Class7629 class7629 = (Class7629)o;
            return this.field30217 == class7629.field30217 && Double.compare(class7629.field30218, this.field30218) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int field30217 = this.field30217 ? 1 : 0;
        final long doubleToLongBits = Double.doubleToLongBits(this.field30218);
        return 31 * field30217 + (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    public boolean method23982() {
        return this.field30217;
    }
    
    static {
        field30215 = new SimpleCommandExceptionType(new Class2259("argument.pos.missing.double", new Object[0]));
        field30216 = new SimpleCommandExceptionType(new Class2259("argument.pos.missing.int", new Object[0]));
    }
}
