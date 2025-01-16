// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class630 extends Class624
{
    public final Class1951 field3614;
    public final /* synthetic */ Class5088 field3615;
    
    public Class630(final Class5088 field3615, final Class1951 field3616) {
        this.field3615 = field3615;
        this.field3614 = field3616;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3634(this.field3614, n, n3, n2, n5, Class7710.field30674, n6, n7);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        Class5088.method15953(this.field3615).method15533(Class5088.method15952(this.field3615).indexOf(this.field3614));
        return true;
    }
    
    public void method3634(final Class1951 class1951, final int n, final int n2, final int n3, final int n4, final Class7710 class1952, final int n5, final int n6) {
        String s = class1951.method7937();
        if (s == null || s.isEmpty()) {
            s = Class5088.method15954(this.field3615) + " " + (n + 1);
        }
        final String string = class1951.method7933() + " (" + Class5088.method15955(this.field3615, class1951) + ")";
        final String str = "";
        String str2;
        if (!class1951.method7936()) {
            str2 = Class5088.method15957(this.field3615, class1951);
            if (class1951.method7935()) {
                str2 = Class314.field1850 + RealmsScreen.getLocalizedString("mco.upload.hardcore") + Class314.field1867;
            }
            if (class1951.method7934()) {
                str2 = str2 + ", " + RealmsScreen.getLocalizedString("selectWorld.cheats");
            }
        }
        else {
            str2 = Class5088.method15956(this.field3615) + " " + str;
        }
        this.field3615.method15407(s, n2 + 2, n3 + 1, 16777215);
        this.field3615.method15407(string, n2 + 2, n3 + 12, 8421504);
        this.field3615.method15407(str2, n2 + 2, n3 + 12 + 10, 8421504);
    }
}
