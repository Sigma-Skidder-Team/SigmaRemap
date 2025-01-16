// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class644 extends Class623<Class644>
{
    private final EntityType<?> field3655;
    public final /* synthetic */ Class609 field3656;
    
    public Class644(final Class609 field3656, final EntityType<?> field3657) {
        this.field3656 = field3656;
        this.field3655 = field3657;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        final String method30773 = Class8822.method30773(Util.method27836("entity", EntityType.method23354(this.field3655)), new Object[0]);
        final int method30774 = Class691.method3867(this.field3656.field3563).method23091(Class8276.field33985.method8449(this.field3655));
        final int method30775 = Class691.method3867(this.field3656.field3563).method23091(Class8276.field33986.method8449(this.field3655));
        this.field3656.drawString(this.field3656.field3563.font, method30773, n3 + 2, n2 + 1, 16777215);
        this.field3656.drawString(this.field3656.field3563.font, this.method3688(method30773, method30774), n3 + 2 + 10, n2 + 1 + 9, (method30774 != 0) ? 9474192 : 6316128);
        this.field3656.drawString(this.field3656.field3563.font, this.method3689(method30773, method30775), n3 + 2 + 10, n2 + 1 + 18, (method30775 != 0) ? 9474192 : 6316128);
    }
    
    private String method3688(final String s, final int i) {
        final String method8450 = Class8276.field33985.method8450();
        return (i != 0) ? Class8822.method30773(method8450, i, s) : Class8822.method30773(method8450 + ".none", s);
    }
    
    private String method3689(final String s, final int i) {
        final String method8450 = Class8276.field33986.method8450();
        return (i != 0) ? Class8822.method30773(method8450, s, i) : Class8822.method30773(method8450 + ".none", s);
    }
}
