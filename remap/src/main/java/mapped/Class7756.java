// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class7756 extends Class7754<Class4107>
{
    public static final Class7756 field31692 = method24756("block_ignore", Class4106::new);
    public static final Class7756 field31693 = method24756("block_rot", Class4108::new);
    public static final Class7756 field31694 = method24756("gravity", Class4112::new);
    public static final Class7756 field31695 = method24756("jigsaw_replacement", dynamic -> Class4109.field18212);
    public static final Class7756 field31696 = method24756("rule", Class4110::new);
    public static final Class7756 field31697 = method24756("nop", dynamic -> Class4111.field18215);
    
    default Class7756 method24756(final String s, final Class7756 class7756) {
        return Registry.method511(Registry.field233, s, class7756);
    }
}
