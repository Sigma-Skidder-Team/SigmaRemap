// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class Class595 extends Class594
{
    private final Class350 field3499;
    private final String field3500;
    private final Class654 field3501;
    private final Class654 field3502;
    public final /* synthetic */ Class607 field3503;
    
    private Class595(final Class607 field3503, final Class350 field3504) {
        this.field3503 = field3503;
        this.field3499 = field3504;
        this.field3500 = Class8822.method30773(field3504.method1060(), new Object[0]);
        this.field3501 = new Class681(this, 0, 0, 75, 20, this.field3500, class654 -> Class607.method3568(this.field3503).field3504 = field3504, field3503, field3504);
        this.field3502 = new Class671(this, 0, 0, 50, 20, Class8822.method30773("controls.reset", new Object[0]), class351 -> {
            this.field3503.field3540.field4648.method17117(field3504, field3504.method1061());
            Class350.method1055();
        }, field3503);
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        final boolean b2 = Class607.method3568(this.field3503).field3874 == this.field3499;
        this.field3503.field3540.fontRenderer.method6610(this.field3500, (float)(n3 + 90 - Class607.method3569(this.field3503)), (float)(n2 + n5 / 2 - 4), 16777215);
        this.field3502.field3426 = n3 + 190;
        this.field3502.field3427 = n2;
        this.field3502.field3431 = !this.field3499.method1069();
        this.field3502.method2975(n6, n7, n8);
        this.field3501.field3426 = n3 + 105;
        this.field3501.field3427 = n2;
        this.field3501.method3367(this.field3499.method1068());
        int n9 = 0;
        if (!this.field3499.method1065()) {
            for (final Class350 class350 : this.field3503.field3540.field4648.field23460) {
                if (class350 != this.field3499 && this.field3499.method1064(class350)) {
                    n9 = 1;
                    break;
                }
            }
        }
        if (!b2) {
            if (n9 != 0) {
                this.field3501.method3367(TextFormatting.RED + this.field3501.method3369());
            }
        }
        else {
            this.field3501.method3367(TextFormatting.WHITE + "> " + TextFormatting.YELLOW + this.field3501.method3369() + TextFormatting.WHITE + " <");
        }
        this.field3501.method2975(n6, n7, n8);
    }
    
    @Override
    public List<? extends IGuiEventListener> children() {
        return (List<? extends IGuiEventListener>)ImmutableList.of((Object)this.field3501, (Object)this.field3502);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.field3501.mouseClicked(n, n2, n3) || this.field3502.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        return this.field3501.mouseReleased(n, n2, n3) || this.field3502.mouseReleased(n, n2, n3);
    }
}
