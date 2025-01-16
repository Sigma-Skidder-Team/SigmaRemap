// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3283 extends Class3167
{
    private int field15791;
    private BlockPos field15792;
    
    public Class3283() {
        super(Class8013.field32990, "Spartan", "ClickTP for spartan anticheat");
    }
    
    @Override
    public void method9879() {
        this.field15791 = -1;
        this.field15792 = null;
    }
    
    @Override
    public void method9897() {
        Class6430.method19155(-0.08);
        Class7482.method23151(Class7482.method23136());
        Class3283.field15514.field4633.field26532 = 1.0f;
    }
    
    @Class6753
    private void method10366(final Class5748 class5748) {
        if (this.method9906() && (Class3283.field15514.player.method1809() || !this.method9914().method9883("Sneak"))) {
            if (class5748.method17055() == Class1958.field10672) {
                final BlockRayTraceResult method13697 = Class4609.method13697(Class3283.field15514.player.rotationYaw, Class3283.field15514.player.rotationPitch, this.method9914().method9886("Maximum range"));
                BlockPos method13698 = null;
                if (method13697 != null) {
                    method13698 = method13697.getPos();
                }
                if (method13698 == null) {
                    return;
                }
                this.field15792 = method13698;
                Class3283.field15514.method5269().method17292(new Class4354(this.field15792.getX() + 0.5, this.field15792.getY() + 1, this.field15792.getZ() + 0.5, true));
                this.field15791 = 0;
            }
        }
    }
    
    @Class6753
    public void method10367(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                final Class4328 class5724 = (Class4328)class5723.method16998();
                if (class5724.field19377 == this.field15792.getX() + 0.5) {
                    if (class5724.field19378 == this.field15792.getY() + 1) {
                        if (class5724.field19379 == this.field15792.getZ() + 0.5) {
                            Class9463.method35173().method35197().method25776(new Class6224("ClickTP", "Successfully teleported"));
                            this.method9914().method9910();
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10368(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15791 > -1) {
                if (this.field15792 != null) {
                    class5717.method16975(0.01);
                    ++this.field15791;
                    if (this.field15791 >= 20) {
                        Class3283.field15514.field4633.field26532 = 1.4f;
                    }
                    else {
                        Class3283.field15514.field4633.field26532 = 2.0f;
                    }
                    Class3283.field15514.method5269().method17292(new Class4354(Class3283.field15514.player.posX, Class3283.field15514.player.posY, Class3283.field15514.player.posZ, true));
                    Class3283.field15514.method5269().method17292(new Class4354(this.field15792.getX() + 0.5, this.field15792.getY() + 1, this.field15792.getZ() + 0.5, true));
                }
            }
        }
    }
}
