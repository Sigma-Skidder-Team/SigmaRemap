// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7269 extends Class7266
{
    private String field28160;
    private String field28161;
    private String field28162;
    
    public Class7269(final String s, final String s2) {
        this.field28162 = "";
        this.method22270(s);
        this.method22271(s2);
    }
    
    public Class7269(final Class7269 class7269) {
        super(class7269);
        this.field28162 = "";
        this.method22270(class7269.method22267());
        this.method22271(class7269.method22268());
        this.method22272(class7269.method22269());
    }
    
    public Class7269 method22266() {
        return new Class7269(this);
    }
    
    @Override
    public void method22217(final StringBuilder sb) {
        sb.append(this.field28162);
        super.method22217(sb);
    }
    
    public String method22267() {
        return this.field28160;
    }
    
    public String method22268() {
        return this.field28161;
    }
    
    public String method22269() {
        return this.field28162;
    }
    
    public void method22270(final String field28160) {
        this.field28160 = field28160;
    }
    
    public void method22271(final String field28161) {
        this.field28161 = field28161;
    }
    
    public void method22272(final String field28162) {
        this.field28162 = field28162;
    }
    
    @Override
    public String toString() {
        return "ScoreComponent(name=" + this.method22267() + ", objective=" + this.method22268() + ", value=" + this.method22269() + ")";
    }
    
    public Class7269(final String field28160, final String field28161, final String field28162) {
        this.field28162 = "";
        this.field28160 = field28160;
        this.field28161 = field28161;
        this.field28162 = field28162;
    }
}
