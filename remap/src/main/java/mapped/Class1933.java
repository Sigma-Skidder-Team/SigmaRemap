// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public class Class1933 extends ResourceLocation
{
    private final String field10544;
    
    public Class1933(final String[] array) {
        super(array);
        this.field10544 = array[2].toLowerCase(Locale.ROOT);
    }
    
    public Class1933(final String s) {
        this(method7806(s));
    }
    
    public Class1933(final ResourceLocation class1932, final String s) {
        this(class1932.toString(), s);
    }
    
    public Class1933(final String str, final String str2) {
        this(method7806(str + '#' + str2));
    }
    
    public static String[] method7806(final String s) {
        final String[] array = { null, s, "" };
        final int index = s.indexOf(35);
        String substring = s;
        if (index >= 0) {
            array[2] = s.substring(index + 1);
            if (index > 1) {
                substring = s.substring(0, index);
            }
        }
        System.arraycopy(ResourceLocation.method7796(substring, ':'), 0, array, 0, 2);
        return array;
    }
    
    public String method7807() {
        return this.field10544;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class1933 && super.equals(o) && this.field10544.equals(((Class1933)o).field10544));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.field10544.hashCode();
    }
    
    @Override
    public String toString() {
        return super.toString() + '#' + this.field10544;
    }
}
