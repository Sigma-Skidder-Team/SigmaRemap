// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.dimension.DimensionType;

public class Class7600
{
    private static String[] field30138;
    private final Class8683 field30139;
    private final Class8683 field30140;
    private final Class8683 field30141;
    private Biome field30142;
    private Class4574<?> field30143;
    private DimensionType field30144;
    private final Class8355 field30145;
    private final Class7854 field30146;
    private final Class8744 field30147;
    
    public Class7600() {
        this.field30139 = Class8683.field36492;
        this.field30140 = Class8683.field36492;
        this.field30141 = Class8683.field36492;
        this.field30145 = Class8355.field34288;
        this.field30146 = Class7854.field32229;
        this.field30147 = Class8744.field36724;
    }
    
    public static Class7600 method23898() {
        return new Class7600();
    }
    
    public Class7600 method23899(final Biome field30142) {
        this.field30142 = field30142;
        return this;
    }
    
    public Class8697 method23900() {
        return new Class8697(this.field30139, this.field30140, this.field30141, this.field30142, this.field30143, this.field30144, this.field30145, this.field30146, this.field30147);
    }
}
