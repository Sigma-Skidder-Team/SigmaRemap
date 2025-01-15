// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4027 extends Class3833
{
    private static String[] field18119;
    public static final Class7114<Axis> field18120;
    
    public Class4027(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, BlockState>)this.method11878()).method21773(Class4027.field18120, Axis.Y));
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        switch (Class6210.field25055[class7097.ordinal()]) {
            case 1:
            case 2: {
                switch (Class6210.field25054[class7096.method21772(Class4027.field18120).ordinal()]) {
                    case 1: {
                        return ((Class7097<O, BlockState>)class7096).method21773(Class4027.field18120, Axis.Z);
                    }
                    case 2: {
                        return ((Class7097<O, BlockState>)class7096).method21773(Class4027.field18120, Axis.X);
                    }
                    default: {
                        return class7096;
                    }
                }
                break;
            }
            default: {
                return class7096;
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, BlockState> class9500) {
        class9500.method35378(Class4027.field18120);
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return ((Class7097<O, BlockState>)this.method11878()).method21773(Class4027.field18120, class7074.method21648().getAxis());
    }
    
    static {
        field18120 = Class8970.field37749;
    }
}
