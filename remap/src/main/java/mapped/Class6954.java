// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;

public class Class6954<T> implements Class6952<T>
{
    private static String[] field27228;
    private static final Class6954<Object> field27229;
    
    public static <T> Class6954<T> method21355() {
        return (Class6954<T>)Class6954.field27229;
    }
    
    @Override
    public boolean method21340(final BlockPos class354, final T t) {
        return false;
    }
    
    @Override
    public void method21345(final BlockPos class354, final T t, final int n) {
    }
    
    @Override
    public void method21341(final BlockPos class354, final T t, final int n, final Class1955 class355) {
    }
    
    @Override
    public boolean method21342(final BlockPos class354, final T t) {
        return false;
    }
    
    @Override
    public void method21343(final Stream<Class7460<T>> stream) {
    }
    
    static {
        field27229 = new Class6954<Object>();
    }
}
