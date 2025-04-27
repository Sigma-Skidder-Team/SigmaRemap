// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6592 extends Class6591
{
    private final String field26152;
    
    public Class6592(final String field26152) {
        this.field26152 = field26152;
    }
    
    @Override
    public Class<?> method20024(final String str) throws ClassNotFoundException {
        if (str.indexOf(46) < 0) {
            try {
                return Class.forName(this.field26152 + "." + str);
            }
            catch (final ClassNotFoundException ex) {}
        }
        return super.method20024(str);
    }
}
