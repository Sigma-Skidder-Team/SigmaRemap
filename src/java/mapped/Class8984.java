// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

public final class Class8984
{
    private final Class1929 field37869;
    private Class8991 field37870;
    private final List<Class8391> field37871;
    
    public Class8984() {
        this(UUID.randomUUID().toString());
    }
    
    public Class8984(final String s) {
        this.field37870 = Class7177.field27835;
        this.field37871 = new ArrayList<Class8391>();
        this.field37869 = Class1929.method7741(s);
    }
    
    public Class8984 method31981(final Class8991 class8991) {
        if (class8991 == null) {
            throw new NullPointerException("type == null");
        }
        if (class8991.method32078().equals("multipart")) {
            this.field37870 = class8991;
            return this;
        }
        throw new IllegalArgumentException("multipart != " + class8991);
    }
    
    public Class8984 method31982(final Class7173 class7173) {
        return this.method31986(Class8391.method27968(class7173));
    }
    
    public Class8984 method31983(final Class6957 class6957, final Class7173 class6958) {
        return this.method31986(Class8391.method27969(class6957, class6958));
    }
    
    public Class8984 method31984(final String s, final String s2) {
        return this.method31986(Class8391.method27970(s, s2));
    }
    
    public Class8984 method31985(final String s, final String s2, final Class7173 class7173) {
        return this.method31986(Class8391.method27971(s, s2, class7173));
    }
    
    public Class8984 method31986(final Class8391 class8391) {
        if (class8391 != null) {
            this.field37871.add(class8391);
            return this;
        }
        throw new NullPointerException("part == null");
    }
    
    public Class7177 method31987() {
        if (!this.field37871.isEmpty()) {
            return new Class7177(this.field37869, this.field37870, this.field37871);
        }
        throw new IllegalStateException("Multipart body must have at least one part.");
    }
}
