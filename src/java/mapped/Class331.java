// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class331 implements Class328
{
    private Class289 field2051;
    private int field2052;
    private int field2053;
    
    public Class331(final Class289 class289) {
        this(class289, 0, 0);
    }
    
    public Class331(final Class289 class289, final int n) {
        this(class289, n, 0);
    }
    
    public Class331(final Class289 field2051, final int field2052, final int field2053) {
        this.field2051 = field2051;
        this.field2052 = field2052;
        this.field2053 = field2053;
    }
    
    @Override
    public float method1009() {
        return this.field2051.method941(this.field2052, this.field2053);
    }
    
    @Override
    public String toString() {
        if (this.field2051.method939() != null) {
            return (this.field2051.method940() != null) ? ("" + this.field2051 + "." + this.field2051.method939()[this.field2052] + "." + this.field2051.method940()[this.field2053]) : ("" + this.field2051 + "." + this.field2051.method939()[this.field2052]);
        }
        return "" + this.field2051;
    }
}
