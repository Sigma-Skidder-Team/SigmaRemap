// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class104 implements IStringSerializable
{
    field311("north_south"), 
    field312("east_west"), 
    field313("ascending_east"), 
    field314("ascending_west"), 
    field315("ascending_north"), 
    field316("ascending_south"), 
    field317("south_east"), 
    field318("south_west"), 
    field319("north_west"), 
    field320("north_east");
    
    private final String field321;
    
    private Class104(final String field321) {
        this.field321 = field321;
    }
    
    @Override
    public String toString() {
        return this.field321;
    }
    
    public boolean method597() {
        if (this != Class104.field315) {
            if (this != Class104.field313) {
                if (this != Class104.field316) {
                    if (this != Class104.field314) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public String getName() {
        return this.field321;
    }
}
