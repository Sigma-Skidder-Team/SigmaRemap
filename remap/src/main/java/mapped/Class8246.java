// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class8246 extends Class8245
{
    private static String[] field33874;
    private boolean field33875;
    private BlockPos field33876;
    private Entity field33877;
    
    public Class8246(final Minecraft class869, final Class5799 class870) {
        super(class869, class870);
        this.field33875 = false;
        this.field33876 = null;
        this.field33877 = null;
    }
    
    @Override
    public boolean method27312(final BlockPos field33876, final Direction class179) {
        this.field33875 = true;
        this.field33876 = field33876;
        final boolean method27312 = super.method27312(field33876, class179);
        this.field33875 = false;
        return method27312;
    }
    
    @Override
    public boolean method27314(final BlockPos field33876, final Direction class179) {
        this.field33875 = true;
        this.field33876 = field33876;
        final boolean method27314 = super.method27314(field33876, class179);
        this.field33875 = false;
        return method27314;
    }
    
    @Override
    public Class2201 method27320(final PlayerEntity playerEntity, final World class513, final Class316 class514) {
        this.field33875 = true;
        final Class2201 method27320 = super.method27320(playerEntity, class513, class514);
        this.field33875 = false;
        return method27320;
    }
    
    @Override
    public Class2201 method27319(final Class756 class756, final Class1848 class757, final Class316 class758, final BlockRayTraceResult class759) {
        this.field33875 = true;
        this.field33876 = class759.getPos();
        final Class2201 method27319 = super.method27319(class756, class757, class758, class759);
        this.field33875 = false;
        return method27319;
    }
    
    @Override
    public Class2201 method27322(final PlayerEntity playerEntity, final Entity field33877, final Class316 class513) {
        this.field33877 = field33877;
        return super.method27322(playerEntity, field33877, class513);
    }
    
    @Override
    public Class2201 method27323(final PlayerEntity playerEntity, final Entity field33877, final Class7007 class513, final Class316 class514) {
        this.field33877 = field33877;
        return super.method27323(playerEntity, field33877, class513, class514);
    }
    
    public boolean method27341() {
        return this.field33875;
    }
    
    public BlockPos method27342() {
        return this.field33876;
    }
    
    public Entity method27343() {
        return this.field33877;
    }
}
