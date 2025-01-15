// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6129 implements Class6113
{
    private static String[] field24874;
    private final Class869 field24875;
    
    public Class6129(final Class869 field24875) {
        this.field24875 = field24875;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final BlockPos method1894 = this.field24875.field4684.method1894();
        final Class1847 field2391 = this.field24875.field4684.field2391;
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30068(0.0f, 1.0f, 0.0f, 0.75f);
        Class8726.method30041();
        Class8726.method30072(6.0f);
        for (final BlockPos class7353 : BlockPos.method1154(method1894.method1134(-10, -10, -10), method1894.method1134(10, 10, 10))) {
            final Class7099 method1895 = field2391.method6702(class7353);
            if (!method1895.method21793(Class7324.field28319)) {
                continue;
            }
            Class7282.method22336(new Class6221(class7353.getX() + 0.01f, class7353.getY() + 0.01f, class7353.getZ() + 0.01f, class7353.getX() + 0.99f, class7353.getY() + method1895.method21782(field2391, class7353), class7353.getZ() + 0.99f).method18499(-n, -n2, -n3), 1.0f, 1.0f, 1.0f, 0.2f);
        }
        for (final BlockPos class7354 : BlockPos.method1154(method1894.method1134(-10, -10, -10), method1894.method1134(10, 10, 10))) {
            final Class7099 method1896 = field2391.method6702(class7354);
            if (!method1896.method21793(Class7324.field28319)) {
                continue;
            }
            Class7282.method22339(String.valueOf(method1896.method21784()), class7354.getX() + 0.5, class7354.getY() + method1896.method21782(field2391, class7354), class7354.getZ() + 0.5, -16777216);
        }
        Class8726.method30040();
        Class8726.method30012();
    }
}
