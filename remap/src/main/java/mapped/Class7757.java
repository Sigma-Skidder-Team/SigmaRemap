// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class7757 extends Class7754<Class6213>
{
    public static final Class7757 field31698 = method24759("always_true", dynamic -> Class6215.field25064);
    public static final Class7757 field31699 = method24759("block_match", Class6217::new);
    public static final Class7757 field31700 = method24759("blockstate_match", Class6214::new);
    public static final Class7757 field31701 = method24759("tag_match", Class6218::new);
    public static final Class7757 field31702 = method24759("random_block_match", Class6212::new);
    public static final Class7757 field31703 = method24759("random_blockstate_match", Class6216::new);
    
    default Class7757 method24759(final String s, final Class7757 class7757) {
        return Registry.register(Registry.field232, s, class7757);
    }
}
