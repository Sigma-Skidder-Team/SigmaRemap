// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public abstract class Class8682
{
    private final Class<? extends Class5207> field36489;
    private boolean field36490;
    
    public Class6108 method29727(final UUID uuid) {
        if (uuid != null) {
            return Class8563.method28794().method33555(uuid);
        }
        throw new NullPointerException("uuid is marked non-null but is null");
    }
    
    public boolean method29728(final UUID uuid) {
        final Class6108 method29727 = this.method29727(uuid);
        return method29727 != null && (this.field36489 == null || method29727.method18207(Class6651.class).method20211().method16335(this.field36489));
    }
    
    public abstract void method29729();
    
    public Class<? extends Class5207> method29730() {
        return this.field36489;
    }
    
    public boolean method29731() {
        return this.field36490;
    }
    
    public void method29732(final boolean field36490) {
        this.field36490 = field36490;
    }
    
    public Class8682(final Class<? extends Class5207> field36489) {
        this.field36490 = false;
        this.field36489 = field36489;
    }
}
