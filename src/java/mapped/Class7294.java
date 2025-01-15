// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7294
{
    public String field28260;
    public String field28261;
    public long field28262;
    public String field28263;
    public String field28264;
    public boolean field28265;
    public boolean field28266;
    public boolean field28267;
    public boolean field28268;
    
    public Class7294() {
        this.field28262 = 253402300799999L;
        this.field28264 = "/";
    }
    
    public Class7294 method22368(final String s) {
        if (s == null) {
            throw new NullPointerException("name == null");
        }
        if (s.trim().equals(s)) {
            this.field28260 = s;
            return this;
        }
        throw new IllegalArgumentException("name is not trimmed");
    }
    
    public Class7294 method22369(final String s) {
        if (s == null) {
            throw new NullPointerException("value == null");
        }
        if (s.trim().equals(s)) {
            this.field28261 = s;
            return this;
        }
        throw new IllegalArgumentException("value is not trimmed");
    }
    
    public Class7294 method22370(long field28262) {
        if (field28262 <= 0L) {
            field28262 = Long.MIN_VALUE;
        }
        if (field28262 > 253402300799999L) {
            field28262 = 253402300799999L;
        }
        this.field28262 = field28262;
        this.field28267 = true;
        return this;
    }
    
    public Class7294 method22371(final String s) {
        return this.method22373(s, false);
    }
    
    public Class7294 method22372(final String s) {
        return this.method22373(s, true);
    }
    
    private Class7294 method22373(final String str, final boolean field28268) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        final String method24452 = Class7690.method24452(str);
        if (method24452 != null) {
            this.field28263 = method24452;
            this.field28268 = field28268;
            return this;
        }
        throw new IllegalArgumentException("unexpected domain: " + str);
    }
    
    public Class7294 method22374(final String field28264) {
        if (field28264.startsWith("/")) {
            this.field28264 = field28264;
            return this;
        }
        throw new IllegalArgumentException("path must start with '/'");
    }
    
    public Class7294 method22375() {
        this.field28265 = true;
        return this;
    }
    
    public Class7294 method22376() {
        this.field28266 = true;
        return this;
    }
    
    public Class8713 method22377() {
        return new Class8713(this);
    }
}
