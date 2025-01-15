// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6118 implements Class6113
{
    private static String[] field24834;
    private final Class869 field24835;
    
    public Class6118(final Class869 field24835) {
        this.field24835 = field24835;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final Class1848 field4683 = this.field24835.field4683;
        Class8726.method30059();
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30041();
        final BlockPos class7353 = new BlockPos(n, 0.0, n3);
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        method22695.method12390(5, Class9237.field39615);
        for (final BlockPos class7354 : BlockPos.method1154(class7353.method1134(-40, 0, -40), class7353.method1134(40, 0, 40))) {
            final int method22696 = field4683.method6699(Class2020.field11521, class7354.getX(), class7354.getZ());
            if (!field4683.method6701(class7354.method1134(0, method22696, 0).method1139()).method21706()) {
                Class1656.method5734(method22695, class7354.getX() + 0.25f - n, method22696 - n2, class7354.getZ() + 0.25f - n3, class7354.getX() + 0.75f - n, method22696 + 0.09375 - n2, class7354.getZ() + 0.75f - n3, 0.0f, 1.0f, 0.0f, 0.5f);
            }
            else {
                Class1656.method5734(method22695, class7354.getX() + 0.25f - n, method22696 - n2, class7354.getZ() + 0.25f - n3, class7354.getX() + 0.75f - n, method22696 + 0.09375 - n2, class7354.getZ() + 0.75f - n3, 0.0f, 0.0f, 1.0f, 0.5f);
            }
        }
        method22694.method22695();
        Class8726.method30040();
        Class8726.method30060();
    }
}
