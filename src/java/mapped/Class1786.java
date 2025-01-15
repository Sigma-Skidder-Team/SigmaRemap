// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;

public class Class1786 extends Class1785
{
    private static final Class1932 field9903;
    
    public Class1786(final Class1663 class1663) {
        super(class1663, new Class1932("textures/atlas/paintings.png"), "painting");
    }
    
    @Override
    public Stream<Class1932> method6439() {
        return Stream.concat(Class90.field227.method507().stream(), (Stream<? extends Class1932>)Stream.of(Class1786.field9903));
    }
    
    public Class1912 method6444(final Class8539 class8539) {
        return this.method6440(Class90.field227.method503(class8539));
    }
    
    public Class1912 method6445() {
        return this.method6440(Class1786.field9903);
    }
    
    static {
        field9903 = new Class1932("back");
    }
}
