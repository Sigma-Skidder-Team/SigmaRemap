// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4665 implements Class4659
{
    public final /* synthetic */ Class4968 field20179;
    public final /* synthetic */ Class4659[] field20180;
    public final /* synthetic */ Runnable field20181;
    public final /* synthetic */ Class1001 field20182;
    
    public Class4665(final Class1001 field20182, final Class4968 field20183, final Class4659[] field20184, final Runnable field20185) {
        this.field20182 = field20182;
        this.field20179 = field20183;
        this.field20180 = field20184;
        this.field20181 = field20185;
    }
    
    @Override
    public void method13945(final Object... array) {
        this.field20179.method14980("upgrade", this.field20180[0]);
        this.field20179.method14980("upgradeError", this.field20180[0]);
        this.field20181.run();
    }
}