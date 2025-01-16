// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.Map;

public class Class6950
{
    private static String[] field27210;
    public final Map<ResourceLocation, Class8162<Block>> field27211;
    public final Map<ResourceLocation, Class8162<Item>> field27212;
    public final Map<ResourceLocation, Class8162<Fluid>> field27213;
    public final Map<ResourceLocation, Class8162<EntityType<?>>> field27214;
    
    public Class6950(final Map<ResourceLocation, Class8162<Block>> field27211, final Map<ResourceLocation, Class8162<Item>> field27212, final Map<ResourceLocation, Class8162<Fluid>> field27213, final Map<ResourceLocation, Class8162<EntityType<?>>> field27214) {
        this.field27211 = field27211;
        this.field27212 = field27212;
        this.field27213 = field27213;
        this.field27214 = field27214;
    }
}
