// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3341 extends Class3167
{
    private int field15944;
    private double field15945;
    
    public Class3341() {
        super(Class8013.field32990, "Unfull", "Weird Hypixel VClip for some blocks");
    }
    
    @Class6753
    private void method10572(final Class5747 class5747) {
        if (this.method9906()) {
            if ((int)Class3341.field15514.player.posY == this.field15944) {
                if (!Class3341.field15514.player.field2967) {
                    Class6430.method19155(-2.0);
                }
            }
            if (Class3341.field15514.player.posY > this.field15944) {
                if (Class3341.field15514.player.field2967) {
                    if (!Class3341.field15514.player.method1809()) {
                        ++this.field15944;
                    }
                }
            }
            if (Class3341.field15514.player.posY % 1.0 == 0.0) {
                if (Class3341.field15514.player.method1809()) {
                    --this.field15944;
                }
            }
        }
    }
    
    @Class6753
    private void method10573(final Class5753 class5753) {
        if (this.method9906()) {
            if (class5753.method17065() == null || class5753.method17064().getY() != this.field15944 - 1) {
                if (class5753.method17064().getY() != this.field15944) {
                    if (class5753.method17064().getY() != this.field15944 + 1 || !(Class3341.field15514.world.getBlockState(class5753.method17064()).method21696() instanceof Class3921)) {
                        if (!(Class3341.field15514.world.getBlockState(class5753.method17064()).method21696() instanceof Class3972)) {
                            if (!(Class3341.field15514.world.getBlockState(class5753.method17064()).method21696() instanceof Class3916)) {
                                if (!(Class3341.field15514.world.getBlockState(class5753.method17064()).method21696() instanceof Class3855)) {
                                    if (!(Class3341.field15514.world.getBlockState(class5753.method17064()).method21696() instanceof Class3849)) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class5753.method17067(null);
        }
    }
    
    @Class6753
    private void method10574(final Class5713 class5713) {
        if (this.method9906()) {
            class5713.method16961(true);
        }
    }
    
    @Override
    public void method9879() {
        this.field15944 = (int)Class3341.field15514.player.posY;
        this.field15945 = this.field15944 - Class3341.field15514.player.posY;
    }
}
