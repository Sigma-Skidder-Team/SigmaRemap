// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class888 implements Runnable
{
    public final /* synthetic */ Class4963[] field4795;
    public final /* synthetic */ Class4659 field4796;
    public final /* synthetic */ Class4659 field4797;
    public final /* synthetic */ Class4659 field4798;
    public final /* synthetic */ Class4968 field4799;
    public final /* synthetic */ Class4659 field4800;
    public final /* synthetic */ Class4659 field4801;
    public final /* synthetic */ Class4968 field4802;
    
    public Class888(final Class4968 field4802, final Class4963[] field4803, final Class4659 field4804, final Class4659 field4805, final Class4659 field4806, final Class4968 field4807, final Class4659 field4808, final Class4659 field4809) {
        this.field4802 = field4802;
        this.field4795 = field4803;
        this.field4796 = field4804;
        this.field4797 = field4805;
        this.field4798 = field4806;
        this.field4799 = field4807;
        this.field4800 = field4808;
        this.field4801 = field4809;
    }
    
    @Override
    public void run() {
        this.field4795[0].method14980("open", this.field4796);
        this.field4795[0].method14980("error", this.field4797);
        this.field4795[0].method14980("close", this.field4798);
        this.field4799.method14980("close", this.field4800);
        this.field4799.method14980("upgrading", this.field4801);
    }
}
