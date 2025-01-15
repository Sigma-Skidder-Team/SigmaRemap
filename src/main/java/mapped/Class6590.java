// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6590 extends Class6589
{
    private ClassLoader field26147;
    
    public Class6590(final ClassLoader classLoader) {
        this(Object.class, classLoader);
    }
    
    public Class6590(final Class<?> clazz, final ClassLoader field26147) {
        super(clazz);
        this.field26147 = Class6590.class.getClassLoader();
        if (field26147 != null) {
            this.field26147 = field26147;
            return;
        }
        throw new NullPointerException("Loader must be provided.");
    }
    
    @Override
    public Class<?> method20024(final String name) throws ClassNotFoundException {
        return Class.forName(name, true, this.field26147);
    }
}
