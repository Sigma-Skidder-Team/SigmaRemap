// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class627 extends Class624
{
    public final Class7427 field3609;
    public final /* synthetic */ Class5069 field3610;
    
    public Class627(final Class5069 field3610, final Class7427 field3611) {
        this.field3610 = field3610;
        this.field3609 = field3611;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3628(this.field3609, n3, n2, n6, n7);
    }
    
    private void method3628(final Class7427 class7427, final int n, final int n2, final int n3, final int n4) {
        int n5;
        if (class7427.method22856()) {
            if (!class7427.method22858()) {
                n5 = 16777215;
            }
            else {
                n5 = 8388479;
            }
        }
        else {
            n5 = 10526880;
        }
        this.field3610.method15407(class7427.method22850(), Class5069.method15615(this.field3610) + 3 + 12, n2 + 1, n5);
        if (!class7427.method22854()) {
            Class5069.method15618(this.field3610, Class5069.method15615(this.field3610) + Class5069.method15616(this.field3610) - 10, n2 + 1, n3, n4);
        }
        else {
            Class5069.method15617(this.field3610, Class5069.method15615(this.field3610) + Class5069.method15616(this.field3610) - 10, n2 + 1, n3, n4);
        }
        Class5069.method15619(this.field3610, Class5069.method15615(this.field3610) + Class5069.method15616(this.field3610) - 22, n2 + 2, n3, n4);
        this.field3610.method15407(RealmsScreen.getLocalizedString("mco.configure.world.activityfeed.disabled"), Class5069.method15620(this.field3610), Class7869.method25488(5), 10526880);
        Class8952.method31759(class7427.method22852(), () -> {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            RealmsScreen.method15410(Class5069.method15615(this.field3610) + 2 + 2, n6 + 1, 8.0f, 8.0f, 8, 8, 8, 8, 64, 64);
            RealmsScreen.method15410(Class5069.method15615(this.field3610) + 2 + 2, n6 + 1, 40.0f, 8.0f, 8, 8, 8, 8, 64, 64);
        });
    }
}
