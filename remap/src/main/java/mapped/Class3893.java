// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3893 extends Class3892
{
    private static String[] field17565;
    
    public Class3893(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3893.field17564);
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return ((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3893.field17564, class7074.method21644().getOpposite());
    }
    
    @Override
    public PushReaction method11858(final BlockState class7096) {
        return PushReaction.PUSH_ONLY;
    }
}
