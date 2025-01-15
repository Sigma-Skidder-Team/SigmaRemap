// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public final class Class8391
{
    public final Class6957 field34391;
    public final Class7173 field34392;
    
    public static Class8391 method27968(final Class7173 class7173) {
        return method27969(null, class7173);
    }
    
    public static Class8391 method27969(final Class6957 class6957, final Class7173 class6958) {
        if (class6958 == null) {
            throw new NullPointerException("body == null");
        }
        if (class6957 != null && class6957.method21360("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (class6957 != null && class6957.method21360("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        return new Class8391(class6957, class6958);
    }
    
    public static Class8391 method27970(final String s, final String s2) {
        return method27971(s, null, Class7173.method21943(null, s2));
    }
    
    public static Class8391 method27971(final String s, final String s2, final Class7173 class7173) {
        if (s != null) {
            final StringBuilder sb = new StringBuilder("form-data; name=");
            Class7177.method21954(sb, s);
            if (s2 != null) {
                sb.append("; filename=");
                Class7177.method21954(sb, s2);
            }
            return method27969(Class6957.method21369("Content-Disposition", sb.toString()), class7173);
        }
        throw new NullPointerException("name == null");
    }
    
    private Class8391(final Class6957 field34391, final Class7173 field34392) {
        this.field34391 = field34391;
        this.field34392 = field34392;
    }
    
    @Nullable
    public Class6957 method27972() {
        return this.field34391;
    }
    
    public Class7173 method27973() {
        return this.field34392;
    }
}
