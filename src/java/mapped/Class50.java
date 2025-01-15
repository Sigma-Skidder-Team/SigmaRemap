// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataOutput;
import java.util.Objects;

public class Class50 implements Class41
{
    public static final Class6068<Class50> field121;
    private static final Class50 field122;
    private final String field123;
    
    public Class50(final String s) {
        Objects.requireNonNull(s, "Null string not allowed");
        this.field123 = s;
    }
    
    public static Class50 method290(final String s) {
        return s.isEmpty() ? Class50.field122 : new Class50(s);
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.field123);
    }
    
    @Override
    public byte method260() {
        return 8;
    }
    
    @Override
    public Class6068<Class50> method261() {
        return Class50.field121;
    }
    
    @Override
    public String toString() {
        return method292(this.field123);
    }
    
    public Class50 method291() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class50 && Objects.equals(this.field123, ((Class50)o).field123));
    }
    
    @Override
    public int hashCode() {
        return this.field123.hashCode();
    }
    
    @Override
    public String method267() {
        return this.field123;
    }
    
    @Override
    public Class2250 method263(final String s, final int n) {
        final String method292 = method292(this.field123);
        final String substring = method292.substring(0, 1);
        return new Class2260(substring).method8458(new Class2260(method292.substring(1, method292.length() - 1)).method8469(Class50.field99)).method8457(substring);
    }
    
    public static String method292(final String s) {
        final StringBuilder sb = new StringBuilder(" ");
        char c = '\0';
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 != '\\') {
                if (char1 == '\"' || char1 == '\'') {
                    if (c == '\0') {
                        c = (char)((char1 != '\"') ? 34 : 39);
                    }
                    if (c == char1) {
                        sb.append('\\');
                    }
                }
            }
            else {
                sb.append('\\');
            }
            sb.append(char1);
        }
        if (c == '\0') {
            c = '\"';
        }
        sb.setCharAt();
        sb.append(c);
        return sb.toString();
    }
    
    static {
        field121 = new Class6078();
        field122 = new Class50("");
    }
}
