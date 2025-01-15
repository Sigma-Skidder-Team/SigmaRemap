// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7268 extends Class7266
{
    private String field28159;
    
    public Class7268(final Class7268 class7268) {
        super(class7268);
        this.method22265(class7268.method22264());
    }
    
    public Class7268(final String s) {
        this.method22265(s);
    }
    
    @Override
    public Class7266 method22212() {
        return new Class7268(this);
    }
    
    @Override
    public void method22216(final StringBuilder sb) {
        sb.append(this.method22264());
        super.method22216(sb);
    }
    
    @Override
    public void method22217(final StringBuilder sb) {
        sb.append(this.method22230());
        if (this.method22232()) {
            sb.append(Class300.field1735);
        }
        if (this.method22234()) {
            sb.append(Class300.field1738);
        }
        if (this.method22236()) {
            sb.append(Class300.field1737);
        }
        if (this.method22238()) {
            sb.append(Class300.field1736);
        }
        if (this.method22240()) {
            sb.append(Class300.field1734);
        }
        sb.append(this.method22264());
        super.method22217(sb);
    }
    
    public String method22264() {
        return this.field28159;
    }
    
    public void method22265(final String field28159) {
        this.field28159 = field28159;
    }
    
    @Override
    public String toString() {
        return "KeybindComponent(keybind=" + this.method22264() + ")";
    }
    
    public Class7268() {
    }
}
