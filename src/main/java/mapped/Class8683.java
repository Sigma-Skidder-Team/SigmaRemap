// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;

public class Class8683 extends Class8684<Float>
{
    private static String[] field36491;
    public static final Class8683 field36492;
    private final Double field36493;
    private final Double field36494;
    
    private static Class8683 method29733(final StringReader stringReader, final Float n, final Float n2) throws CommandSyntaxException {
        if (n != null) {
            if (n2 != null) {
                if (n > n2) {
                    throw Class8683.field36496.createWithContext((ImmutableStringReader)stringReader);
                }
            }
        }
        return new Class8683(n, n2);
    }
    
    @Nullable
    private static Double method29734(final Float n) {
        return (n != null) ? Double.valueOf(n * (double)n) : null;
    }
    
    private Class8683(final Float n, final Float n2) {
        super(n, n2);
        this.field36493 = method29734(n);
        this.field36494 = method29734(n2);
    }
    
    public static Class8683 method29735(final float f) {
        return new Class8683(f, null);
    }
    
    public boolean method29736(final float n) {
        return (this.field36497 == null || (float)this.field36497 <= n) && (this.field36498 == null || (float)this.field36498 >= n);
    }
    
    public boolean method29737(final double n) {
        return (this.field36493 == null || this.field36493 <= n) && (this.field36494 == null || this.field36494 >= n);
    }
    
    public static Class8683 method29738(final JsonElement jsonElement) {
        return Class8684.method29746(jsonElement, Class8683.field36492, Class9583::method35902, Class8683::new);
    }
    
    public static Class8683 method29739(final StringReader stringReader) throws CommandSyntaxException {
        return method29740(stringReader, n -> n);
    }
    
    public static Class8683 method29740(final StringReader stringReader, final Function<Float, Float> function) throws CommandSyntaxException {
        return Class8684.method29747(stringReader, (Class8561<Float, Class8683>)Class8683::method29733, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat, function);
    }
    
    static {
        field36492 = new Class8683(null, null);
    }
}
