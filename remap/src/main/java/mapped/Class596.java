// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.List;

public class Class596 extends Class594
{
    private static String[] field3504;
    private final String field3505;
    private final int field3506;
    public final /* synthetic */ Class607 field3507;
    
    public Class596(final Class607 field3507, final String s) {
        this.field3507 = field3507;
        this.field3505 = Class8822.method30773(s, new Object[0]);
        this.field3506 = field3507.field3540.fontRenderer.method6617(this.field3505);
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.field3507.field3540.fontRenderer.method6610(this.field3505, (float)(this.field3507.field3540.field4700.width / 2 - this.field3506 / 2), (float)(n2 + n5 - 9 - 1), 16777215);
    }
    
    @Override
    public boolean changeFocus(final boolean b) {
        return false;
    }
    
    @Override
    public List<? extends IGuiEventListener> children() {
        return Collections.emptyList();
    }
}
