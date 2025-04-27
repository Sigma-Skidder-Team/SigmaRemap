// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public enum Class1990
{
    field11132(EntityType.field29044, new int[] { 0, 0, 2, 0, 1, 4, 2, 5 }),
    field11133(EntityType.field28980, new int[] { 0, 0, 0, 0, 0, 1, 1, 2 }),
    field11134(EntityType.field29045, new int[] { 0, 4, 3, 3, 4, 4, 4, 2 }),
    field11135(EntityType.field29047, new int[] { 0, 0, 0, 0, 3, 0, 0, 1 }),
    field11136(EntityType.field29056, new int[] { 0, 0, 0, 1, 0, 1, 0, 2 });
    
    private static final Class1990[] field11137;
    private final EntityType<? extends Class776> field11138;
    private final int[] field11139;
    
    Class1990(final EntityType<? extends Class776> field11138, final int[] field11139) {
        this.field11138 = field11138;
        this.field11139 = field11139;
    }
    
    static {
        field11137 = values();
    }
}
