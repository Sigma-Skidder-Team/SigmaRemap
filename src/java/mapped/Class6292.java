// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6292 extends Class6287
{
    private final String field25162;
    
    public Class6292(final String field25162, final Class2314 class2314, final Class2314 class2315) {
        super(class2314, class2315);
        this.field25162 = field25162;
    }
    
    public String method18621() {
        return this.field25162;
    }
    
    @Override
    public String method18617() {
        return "anchor=" + this.field25162;
    }
}
