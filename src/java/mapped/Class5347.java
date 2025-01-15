// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;

public class Class5347 implements Class5346
{
    private static String[] field22415;
    private final Class7629 field22416;
    private final Class7629 field22417;
    private final Class7629 field22418;
    
    public Class5347(final Class7629 field22416, final Class7629 field22417, final Class7629 field22418) {
        this.field22416 = field22416;
        this.field22417 = field22417;
        this.field22418 = field22418;
    }
    
    @Override
    public Class5487 method16504(final Class7492 class7492) {
        final Class5487 method23249 = class7492.method23249();
        return new Class5487(this.field22416.method23978(method23249.field22770), this.field22417.method23978(method23249.field22771), this.field22418.method23978(method23249.field22772));
    }
    
    @Override
    public Class9544 method16505(final Class7492 class7492) {
        final Class9544 method23254 = class7492.method23254();
        return new Class9544((float)this.field22416.method23978(method23254.field41091), (float)this.field22417.method23978(method23254.field41092));
    }
    
    @Override
    public boolean method16507() {
        return this.field22416.method23982();
    }
    
    @Override
    public boolean method16508() {
        return this.field22417.method23982();
    }
    
    @Override
    public boolean method16509() {
        return this.field22418.method23982();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class5347) {
            final Class5347 class5347 = (Class5347)o;
            return this.field22416.equals(class5347.field22416) && this.field22417.equals(class5347.field22417) && this.field22418.equals(class5347.field22418);
        }
        return false;
    }
    
    public static Class5347 method16510(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        final Class7629 method23980 = Class7629.method23980(stringReader);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(cursor);
            throw Class7555.field29960.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        final Class7629 method23981 = Class7629.method23980(stringReader);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            return new Class5347(method23980, method23981, Class7629.method23980(stringReader));
        }
        stringReader.setCursor(cursor);
        throw Class7555.field29960.createWithContext((ImmutableStringReader)stringReader);
    }
    
    public static Class5347 method16511(final StringReader stringReader, final boolean b) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        final Class7629 method23979 = Class7629.method23979(stringReader, b);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(cursor);
            throw Class7555.field29960.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        final Class7629 method23980 = Class7629.method23979(stringReader, false);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            return new Class5347(method23979, method23980, Class7629.method23979(stringReader, b));
        }
        stringReader.setCursor(cursor);
        throw Class7555.field29960.createWithContext((ImmutableStringReader)stringReader);
    }
    
    public static Class5347 method16512() {
        return new Class5347(new Class7629(true, 0.0), new Class7629(true, 0.0), new Class7629(true, 0.0));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.field22416.hashCode() + this.field22417.hashCode()) + this.field22418.hashCode();
    }
}
