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

public class Class8685 extends Class8684<Integer>
{
    private static String[] field36499;
    public static final Class8685 field36500;
    private final Long field36501;
    private final Long field36502;
    
    private static Class8685 method29751(final StringReader stringReader, final Integer n, final Integer n2) throws CommandSyntaxException {
        if (n != null) {
            if (n2 != null) {
                if (n > n2) {
                    throw Class8685.field36496.createWithContext(stringReader);
                }
            }
        }
        return new Class8685(n, n2);
    }
    
    @Nullable
    private static Long method29752(final Integer n) {
        return (n != null) ? Long.valueOf(n * (long)n) : null;
    }
    
    private Class8685(final Integer n, final Integer n2) {
        super(n, n2);
        this.field36501 = method29752(n);
        this.field36502 = method29752(n2);
    }
    
    public static Class8685 method29753(final int n) {
        return new Class8685(n, n);
    }
    
    public static Class8685 method29754(final int i) {
        return new Class8685(i, null);
    }
    
    public boolean method29755(final int n) {
        return (this.field36497 == null || this.field36497 <= n) && (this.field36498 == null || this.field36498 >= n);
    }
    
    public static Class8685 method29756(final JsonElement jsonElement) {
        return Class8684.method29746(jsonElement, Class8685.field36500, Class9583::method35908, Class8685::new);
    }
    
    public static Class8685 method29757(final StringReader stringReader) throws CommandSyntaxException {
        return method29758(stringReader, n -> n);
    }
    
    public static Class8685 method29758(final StringReader stringReader, final Function<Integer, Integer> function) throws CommandSyntaxException {
        return Class8684.method29747(stringReader, Class8685::method29751, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, function);
    }
    
    static {
        field36500 = new Class8685(null, null);
    }
}
