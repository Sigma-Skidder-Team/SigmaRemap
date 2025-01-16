// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3380 extends Class3167
{
    public Class3380() {
        super(Class8013.field32987, "AntiCactus", "Prevent you from taking damage from cactus");
        this.method9881(new Class4999("Above", "Avoid damage above cactus also", true));
    }
    
    @Class6753
    private void method10794(final Class5753 class5753) {
        if (this.method9906()) {
            if (Class3380.field15514.world.getBlockState(class5753.method17064()).method21696() instanceof Class3977) {
                class5753.method17067(VoxelShapes.method24488(0.0, 0.0, 0.0, 1.0, this.method9883("Above") ? 0.999 : 0.9375, 1.0));
            }
            if (Class3380.field15514.world.getBlockState(class5753.method17064()).method21696() instanceof Class4011) {
                class5753.method17067(VoxelShapes.method24488(-0.01, 0.0, -0.01, 1.02, 1.9375, 1.02));
            }
        }
    }
}
