// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9071
{
    private static String[] field38416;
    public final Class8974 field38417;
    private Class179 field38418;
    private int field38419;
    private int field38420;
    
    private Class9071(final Class1656 class1656, final Class8974 field38417, final Class179 field38418, final int field38419) {
        this.field38417 = field38417;
        this.field38418 = field38418;
        this.field38420 = field38419;
    }
    
    public Class9071(final Class8974 field38417, final Class179 field38418, final int field38419) {
        this.field38417 = field38417;
        this.field38418 = field38418;
        this.field38419 = field38419;
    }
    
    public void method32677(final byte b, final Class179 class179) {
        this.field38419 = (this.field38419 | b | 1 << this.field38418.ordinal());
    }
    
    public boolean method32678(final Class179 class179) {
        return (this.field38419 & 1 << class179.ordinal()) > 0;
    }
    
    private void method32679(final Class179 field38418, final int field38419, final int field38420) {
        this.field38418 = field38418;
        this.field38419 = field38419;
        this.field38420 = field38420;
    }
}
