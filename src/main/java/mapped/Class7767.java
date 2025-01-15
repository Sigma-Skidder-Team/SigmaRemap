// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7767<T extends Class6866>
{
    private static String[] field31762;
    private final T field31763;
    private long field31764;
    private long field31765;
    private Class2204 field31766;
    public final /* synthetic */ Class690 field31767;
    
    private Class7767(final Class690 field31767, final T field31768) {
        this.field31767 = field31767;
        this.field31764 = -1L;
        this.field31765 = -1L;
        this.field31766 = Class2204.field13417;
        this.field31763 = field31768;
    }
    
    public T method24871() {
        return this.field31763;
    }
    
    private float method24872(final long n) {
        final float method35653 = Class9546.method35653((n - this.field31764) / 600.0f, 0.0f, 1.0f);
        final float n2 = method35653 * method35653;
        return (this.field31766 != Class2204.field13418) ? n2 : (1.0f - n2);
    }
    
    public boolean method24873(final int n, final int n2) {
        final long method27837 = Class8349.method27837();
        if (this.field31764 == -1L) {
            this.field31764 = method27837;
            this.field31766.method8381(Class690.method3854(this.field31767).method5299());
        }
        if (this.field31766 == Class2204.field13417) {
            if (method27837 - this.field31764 <= 600L) {
                this.field31765 = method27837;
            }
        }
        Class8726.method30059();
        Class8726.method30065(n - 160.0f * this.method24872(method27837), (float)(n2 * 32), (float)(800 + n2));
        final Class2204 method27838 = this.field31763.method20978(this.field31767, method27837 - this.field31765);
        Class8726.method30060();
        if (method27838 != this.field31766) {
            this.field31764 = method27837 - (int)((1.0f - this.method24872(method27837)) * 600.0f);
            (this.field31766 = method27838).method8381(Class690.method3854(this.field31767).method5299());
        }
        return this.field31766 == Class2204.field13418 && method27837 - this.field31764 > 600L;
    }
}
