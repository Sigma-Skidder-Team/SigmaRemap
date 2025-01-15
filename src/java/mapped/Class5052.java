// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class5052 extends Class5046
{
    private static String[] field21700;
    private Class527 field21701;
    
    public void method15490(final Class527 field21701) {
        this.field21701 = field21701;
        Class7847.method25362(new Class5079(this));
    }
    
    @Nullable
    public Class545 method15491(final Class527 field21701) {
        this.field21701 = field21701;
        return new Class5072(this).method15403();
    }
    
    @Override
    public void method15369() {
        Class869.method5277().method5244(this.field21701);
    }
}
