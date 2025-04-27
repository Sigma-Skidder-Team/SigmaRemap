// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2389 extends Class2386
{
    private static final long field14194 = -9119388488683035101L;
    private final String field14195;
    private final Class2314 field14196;
    private final String field14197;
    private final Class2314 field14198;
    private final String field14199;
    
    public Class2389(final String s, final Class2314 class2314, final String s2, final Class2314 class2315, final String s3) {
        this(s, class2314, s2, class2315, s3, null);
    }
    
    public Class2389(final String s, final Class2314 field14196, final String s2, final Class2314 class2314, final String field14197, final Throwable t) {
        super(s + "; " + s2 + "; " + class2314, t);
        this.field14195 = s;
        this.field14196 = field14196;
        this.field14197 = s2;
        this.field14198 = class2314;
        this.field14199 = field14197;
    }
    
    public Class2389(final String s, final Class2314 class2314, final String s2, final Class2314 class2315) {
        this(s, class2314, s2, class2315, null, null);
    }
    
    public Class2389(final String s, final Class2314 class2314, final String s2, final Class2314 class2315, final Throwable t) {
        this(s, class2314, s2, class2315, null, t);
    }
    
    @Override
    public String getMessage() {
        return this.toString();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.field14195 != null) {
            sb.append(this.field14195);
            sb.append("\n");
        }
        Label_0022: {
            if (this.field14196 != null) {
                if (this.field14197 != null) {
                    if (this.field14198 != null) {
                        if (!this.field14196.method9430().equals(this.field14198.method9430())) {
                            if (this.field14196.method9431() == this.field14198.method9431()) {
                                if (this.field14196.method9432() == this.field14198.method9432()) {
                                    break Label_0022;
                                }
                            }
                        }
                    }
                }
                sb.append(this.field14196);
                sb.append("\n");
            }
        }
        if (this.field14197 != null) {
            sb.append(this.field14197);
            sb.append("\n");
        }
        if (this.field14198 != null) {
            sb.append(this.field14198);
            sb.append("\n");
        }
        if (this.field14199 != null) {
            sb.append(this.field14199);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public String method9513() {
        return this.field14195;
    }
    
    public Class2314 method9514() {
        return this.field14196;
    }
    
    public String method9515() {
        return this.field14197;
    }
    
    public Class2314 method9516() {
        return this.field14198;
    }
}
