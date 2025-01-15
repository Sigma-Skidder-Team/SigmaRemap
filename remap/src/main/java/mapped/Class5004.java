// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5004 extends Class4997<Integer>
{
    private String[] field21521;
    
    public Class5004(final String s, final String s2, final Integer n, final String... field21521) {
        super(s, s2, Class2076.field11987, n);
        this.field21521 = field21521;
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.field21511 = (T)Integer.valueOf(Class8105.method26632(class4405, "value", this.method15203()));
        return class4405;
    }
    
    public String[] method15223() {
        return this.field21521;
    }
}
