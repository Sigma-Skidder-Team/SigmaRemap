// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6439 implements Class6438
{
    private final Class354 field25566;
    private final Class5487 field25567;
    
    public Class6439(final Class354 field25566) {
        this.field25566 = field25566;
        this.field25567 = new Class5487(field25566.method1074() + 0.5, field25566.method1075() + 0.5, field25566.method1076() + 0.5);
    }
    
    @Override
    public Class354 method19204() {
        return this.field25566;
    }
    
    @Override
    public Class5487 method19205() {
        return this.field25567;
    }
    
    @Override
    public boolean method19206(final Class511 class511) {
        return true;
    }
    
    @Override
    public String toString() {
        return "BlockPosWrapper{pos=" + this.field25566 + ", lookAt=" + this.field25567 + '}';
    }
}
