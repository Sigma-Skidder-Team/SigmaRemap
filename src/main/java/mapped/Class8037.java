// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Pattern;

public class Class8037 implements Class8038
{
    private static final Pattern field33094;
    private static final Pattern field33095;
    private final String field33096;
    
    public Class8037(final String field33096) {
        if (field33096 != null) {
            this.field33096 = field33096;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public boolean method26367(final String input) {
        final String[] split = Class8037.field33095.split(Class8037.field33094.matcher(input).replaceAll(""));
        for (int length = split.length, i = 0; i < length; ++i) {
            if (this.field33096.equals(split[i])) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String method26368() {
        return this.field33096;
    }
    
    @Override
    public Class8038 method26369() {
        return new Class8037(this.method26368());
    }
    
    @Override
    public String toString() {
        return this.method26368();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field33096.equals(((Class8037)o).field33096));
    }
    
    @Override
    public int hashCode() {
        return this.field33096.hashCode();
    }
    
    static {
        field33094 = Pattern.compile(" ");
        field33095 = Pattern.compile(",");
    }
}
