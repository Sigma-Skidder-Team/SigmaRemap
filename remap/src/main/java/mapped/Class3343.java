// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3343 extends Class3167
{
    public Class3343() {
        super(Class8013.field32986, "HitSounds", "Changes the player hurting sounds client side.");
    }
    
    @Class6753
    @Class6759
    private void method10580(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4264) {
                final Class4264 class5724 = (Class4264)class5723.method16998();
                if (class5724.method12799(Class3343.field15514.world) != null) {
                    if (class5724.method12799(Class3343.field15514.world).method1768()) {
                        if (class5724.method12799(Class3343.field15514.world).method1732(Class3343.field15514.field4684) <= 5.0f) {
                            if (class5724.method12799(Class3343.field15514.world) != Class3343.field15514.field4684) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
