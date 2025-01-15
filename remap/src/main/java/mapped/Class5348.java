// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import net.minecraft.util.math.MathHelper;

public class Class5348 implements Class5346
{
    private static String[] field22419;
    private final double field22420;
    private final double field22421;
    private final double field22422;
    
    public Class5348(final double field22420, final double field22421, final double field22422) {
        this.field22420 = field22420;
        this.field22421 = field22421;
        this.field22422 = field22422;
    }
    
    @Override
    public Class5487 method16504(final Class7492 class7492) {
        final Class9544 method23254 = class7492.method23254();
        final Class5487 method23255 = class7492.method23256().method8123(class7492);
        final float method23256 = MathHelper.cos((method23254.field41092 + 90.0f) * 0.017453292f);
        final float method23257 = MathHelper.sin((method23254.field41092 + 90.0f) * 0.017453292f);
        final float method23258 = MathHelper.cos(-method23254.field41091 * 0.017453292f);
        final float method23259 = MathHelper.sin(-method23254.field41091 * 0.017453292f);
        final float method23260 = MathHelper.cos((-method23254.field41091 + 90.0f) * 0.017453292f);
        final float method23261 = MathHelper.sin((-method23254.field41091 + 90.0f) * 0.017453292f);
        final Class5487 class7493 = new Class5487(method23256 * method23258, method23259, method23257 * method23258);
        final Class5487 class7494 = new Class5487(method23256 * method23260, method23261, method23257 * method23260);
        final Class5487 method23262 = class7493.method16740(class7494).method16748(-1.0);
        return new Class5487(method23255.field22770 + (class7493.field22770 * this.field22422 + class7494.field22770 * this.field22421 + method23262.field22770 * this.field22420), method23255.field22771 + (class7493.field22771 * this.field22422 + class7494.field22771 * this.field22421 + method23262.field22771 * this.field22420), method23255.field22772 + (class7493.field22772 * this.field22422 + class7494.field22772 * this.field22421 + method23262.field22772 * this.field22420));
    }
    
    @Override
    public Class9544 method16505(final Class7492 class7492) {
        return Class9544.field41083;
    }
    
    @Override
    public boolean method16507() {
        return true;
    }
    
    @Override
    public boolean method16508() {
        return true;
    }
    
    @Override
    public boolean method16509() {
        return true;
    }
    
    public static Class5348 method16513(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        final double method16514 = method16514(stringReader, cursor);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(cursor);
            throw Class7555.field29960.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        final double method16515 = method16514(stringReader, cursor);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            return new Class5348(method16514, method16515, method16514(stringReader, cursor));
        }
        stringReader.setCursor(cursor);
        throw Class7555.field29960.createWithContext((ImmutableStringReader)stringReader);
    }
    
    private static double method16514(final StringReader stringReader, final int cursor) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw Class7629.field30215.createWithContext((ImmutableStringReader)stringReader);
        }
        if (stringReader.peek() == '^') {
            stringReader.skip();
            return (stringReader.canRead() && stringReader.peek() != ' ') ? stringReader.readDouble() : 0.0;
        }
        stringReader.setCursor(cursor);
        throw Class7555.field29961.createWithContext((ImmutableStringReader)stringReader);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class5348) {
            final Class5348 class5348 = (Class5348)o;
            if (this.field22420 == class5348.field22420) {
                if (this.field22421 == class5348.field22421) {
                    if (this.field22422 == class5348.field22422) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field22420, this.field22421, this.field22422);
    }
}
