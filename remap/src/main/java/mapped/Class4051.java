// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4051 extends Item
{
    private final int field18142;
    private final String field18143;
    
    public Class4051(final int field18142, final String str, final Properties properties) {
        super(properties);
        this.field18142 = field18142;
        this.field18143 = "textures/entity/horse/armor/horse_armor_" + str + ".png";
    }
    
    public ResourceLocation method12249() {
        return new ResourceLocation(this.field18143);
    }
    
    public int method12250() {
        return this.field18142;
    }
}
