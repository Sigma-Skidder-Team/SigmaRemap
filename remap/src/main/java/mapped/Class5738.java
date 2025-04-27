// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5738 implements IEvent {
    private static String[] field23305;
    public boolean field23306;
    public Class2228 field23307;
    
    public Class5738(final boolean field23306) {
        this.field23306 = field23306;
        this.field23307 = Class2228.field13705;
    }
    
    public Class2228 method17025() {
        return this.field23307;
    }
    
    public void method17026(final boolean b) {
        this.field23307 = (b ? Class2228.field13706 : Class2228.field13707);
    }
    
    public boolean method17027() {
        return this.field23306;
    }
}
