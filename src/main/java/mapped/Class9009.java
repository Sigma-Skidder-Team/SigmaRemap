// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9009
{
    private int field38036;
    private int field38037;
    private Class5835<Class9009> field38038;
    
    public Class9009() {
        this.field38036 = -1;
        this.field38037 = 0;
        this.field38038 = new Class5835<Class9009>(this);
    }
    
    public int method32252() {
        return this.field38036;
    }
    
    public int method32253() {
        return this.field38037;
    }
    
    public int method32254() {
        return this.field38036 + this.field38037;
    }
    
    public void method32255(final int field38036) {
        this.field38036 = field38036;
    }
    
    public void method32256(final int field38037) {
        this.field38037 = field38037;
    }
    
    public Class5835<Class9009> method32257() {
        return this.field38038;
    }
    
    public Class9009 method32258() {
        final Class5835<Class9009> method17538 = this.field38038.method17538();
        return (method17538 != null) ? method17538.method17537() : null;
    }
    
    public Class9009 method32259() {
        final Class5835<Class9009> method17539 = this.field38038.method17539();
        return (method17539 != null) ? method17539.method17537() : null;
    }
    
    @Override
    public String toString() {
        return "" + this.field38036 + "/" + this.field38037 + "/" + (this.field38036 + this.field38037);
    }
}
