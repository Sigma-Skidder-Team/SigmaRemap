// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3338 extends Class3167
{
    public Class3338() {
        super(Class8013.field32986, "Basic", "Places block underneath");
        this.method9881(new Class4999("Explosions", "Cancels Explosions knockback", true));
        this.method9881(new Class4996("H-Multiplier", "Horizontal velocity multiplier", 0.0f, Float.class, 0.0f, 1.0f, 0.01f));
        this.method9881(new Class4996("V-Multiplier", "Vertical velocity multiplier", 0.0f, Float.class, 0.0f, 1.0f, 0.01f));
    }
    
    @Class6753
    private void method10567(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3338.field15514.field4684 != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    if (class5724.method12822() == Class3338.field15514.field4684.method1643()) {
                        if (this.method9886("H-Multiplier") == 0.0f) {
                            if (this.method9886("V-Multiplier") == 0.0f) {
                                class5723.method16961(true);
                            }
                        }
                        class5724.field19165 *= (int)this.method9886("H-Multiplier");
                        class5724.field19167 *= (int)this.method9886("H-Multiplier");
                        class5724.field19166 *= (int)this.method9886("V-Multiplier");
                    }
                }
            }
            if (class5723.method16998() instanceof Class4394) {
                if (this.method9883("Explosions")) {
                    final Class4394 class5725 = (Class4394)class5723.method16998();
                    class5725.field19682 *= this.method9886("H-Multiplier");
                    class5725.field19684 *= this.method9886("H-Multiplier");
                    class5725.field19683 *= this.method9886("V-Multiplier");
                }
            }
        }
    }
}
