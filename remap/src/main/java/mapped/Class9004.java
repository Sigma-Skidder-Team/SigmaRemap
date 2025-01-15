// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector4f;

public class Class9004
{
    private int field38009;
    private String field38010;
    private String field38011;
    private String field38012;
    public static final int field38013 = 1;
    public static final int field38014 = 2;
    public static final int field38015 = 3;
    public static final int field38016 = 4;
    public static final int field38017 = 5;
    public static final int field38018 = 6;
    public static final int field38019 = 7;
    public static final int field38020 = 8;
    
    public Class9004(final int field38009, final String field38010, final String field38011, final String field38012) {
        this.field38009 = field38009;
        this.field38010 = field38010;
        this.field38011 = field38011;
        this.field38012 = field38012;
    }
    
    public int method32178() {
        return this.field38009;
    }
    
    public String method32179() {
        return this.field38010;
    }
    
    public String method32180() {
        return this.field38011;
    }
    
    public boolean method32181() {
        return this.field38009 == 1;
    }
    
    public boolean method32182(final String s) {
        return this.method32181() && s.equals(this.field38010);
    }
    
    public boolean method32183() {
        return this.field38009 == 2;
    }
    
    public boolean method32184(final String s) {
        return this.method32183() && s.equals(this.field38010);
    }
    
    public boolean method32185() {
        return this.field38009 == 6;
    }
    
    public boolean method32186() {
        return this.field38009 == 3;
    }
    
    public boolean method32187() {
        return this.field38009 == 4;
    }
    
    public boolean method32188() {
        return this.field38009 == 5;
    }
    
    public boolean method32189() {
        return this.field38009 == 7;
    }
    
    public boolean method32190() {
        return this.field38009 == 8;
    }
    
    public boolean method32191(final String s) {
        return this.method32185() && s.equals(this.field38010);
    }
    
    public boolean method32192(final String s, final String s2) {
        return this.method32191(s) && s2.equals(this.field38011);
    }
    
    public boolean method32193(final String s) {
        return this.method32186() && s.equals(this.field38010);
    }
    
    public boolean method32194(final String suffix) {
        return this.method32186() && this.field38010.endsWith(suffix);
    }
    
    public boolean method32195(final String s) {
        return this.method32187() && s.equals(this.field38010);
    }
    
    public boolean method32196(final String s) {
        return this.method32188() && s.equals(this.field38010);
    }
    
    public boolean method32197(final String s) {
        return this.method32189() && s.equals(this.field38010);
    }
    
    public boolean method32198(final String suffix) {
        return this.method32188() && this.field38010.endsWith(suffix);
    }
    
    public boolean method32199(final String s, final boolean b) {
        return this.method32198(s) && this.method32209() == b;
    }
    
    public boolean method32200(final String s, final String s2) {
        return this.method32196(s) || this.method32196(s2);
    }
    
    public boolean method32201(final String s, final String s2, final String s3) {
        if (!this.method32196(s)) {
            if (!this.method32196(s2)) {
                if (!this.method32196(s3)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method32202(final String s, final boolean b) {
        return this.method32196(s) && this.method32209() == b;
    }
    
    public boolean method32203(final String s, final String s2, final boolean b) {
        return this.method32200(s, s2) && this.method32209() == b;
    }
    
    public boolean method32204(final String s, final String s2, final String s3, final boolean b) {
        return this.method32201(s, s2, s3) && this.method32209() == b;
    }
    
    public boolean method32205(final String suffix) {
        return this.method32190() && this.field38010.endsWith(suffix);
    }
    
    public int method32206() {
        try {
            return Integer.parseInt(this.field38011);
        }
        catch (final NumberFormatException ex) {
            throw new NumberFormatException("Invalid integer: " + this.field38011 + ", line: " + this.field38012);
        }
    }
    
    public float method32207() {
        try {
            return Float.parseFloat(this.field38011);
        }
        catch (final NumberFormatException ex) {
            throw new NumberFormatException("Invalid float: " + this.field38011 + ", line: " + this.field38012);
        }
    }
    
    public Vector4f method32208() {
        if (this.field38011 == null) {
            return null;
        }
        final String[] method28937 = Class8571.method28937(Class9518.method35531(Class9518.method35517(this.field38011.trim(), "vec4"), " ()"), ", ");
        if (method28937.length == 4) {
            final float[] array = new float[4];
            for (int i = 0; i < method28937.length; ++i) {
                final float method28938 = Class8571.method28934(Class9518.method35524(method28937[i], new String[] { "F", "f" }), Float.MAX_VALUE);
                if (method28938 == Float.MAX_VALUE) {
                    return null;
                }
                array[i] = method28938;
            }
            return new Vector4f(array[0], array[1], array[2], array[3]);
        }
        return null;
    }
    
    public boolean method32209() {
        final String lowerCase = this.field38011.toLowerCase();
        if (!lowerCase.equals("true") && !lowerCase.equals("false")) {
            throw new RuntimeException("Invalid boolean: " + this.field38011 + ", line: " + this.field38012);
        }
        return Boolean.valueOf(this.field38011);
    }
}
