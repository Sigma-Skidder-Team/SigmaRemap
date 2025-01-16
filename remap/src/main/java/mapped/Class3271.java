// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3271 extends Class3167
{
    public int field15762;
    
    public Class3271() {
        super(Class8013.field32992, "AutoTools", "Picks the best tool when breaking blocks");
        this.field15762 = -1;
    }
    
    @Class6753
    public void method10308(final Class5715 class5715) {
        if (this.method9906()) {
            if (Class3271.field15514.player != null) {
                if (class5715.method16963() == 0) {
                    if (this.field15762 != -1) {
                        Class3271.field15514.player.field3006.field2743 = this.field15762;
                        this.field15762 = -1;
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10309(final Class5752 class5752) {
        if (this.method9906()) {
            if (Class3271.field15514.player != null) {
                if (class5752.method17061() == 0) {
                    this.method10311(class5752.method17063());
                }
            }
        }
    }
    
    @Class6753
    private void method10310(final Class5743 class5743) {
        if (this.method9906()) {
            if (Class3271.field15514.player != null) {
                if (Class3271.field15514.gameSettings.field23446.method1056()) {
                    this.method10311(null);
                }
            }
        }
    }
    
    public void method10311(final BlockPos class354) {
        final BlockPos class355 = (class354 == null) ? ((Class3271.field15514.field4691.getType() != RayTraceResult.Type.BLOCK) ? null : ((BlockRayTraceResult)Class3271.field15514.field4691).getPos()) : class354;
        if (class355 == null) {
            return;
        }
        final int method29334 = Class8639.method29334(Class3271.field15514.world.getBlockState(class355));
        if (method29334 != -1) {
            if (Class3271.field15514.player.field3006.field2743 != method29334 % 9) {
                if (this.field15762 == -1) {
                    this.field15762 = Class3271.field15514.player.field3006.field2743;
                }
            }
            if (method29334 >= 36 && method29334 <= 44) {
                Class3271.field15514.player.field3006.field2743 = method29334 % 9;
            }
            else {
                Class3271.field15514.player.field3006.field2743 = Class8639.method29354(method29334);
            }
        }
    }
}
