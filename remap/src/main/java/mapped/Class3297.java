// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3297 extends Class3167
{
    private double field15859;
    private float field15860;
    private float field15861;
    private boolean field15862;
    private float field15863;
    
    public Class3297() {
        super(Class8013.field32990, "Legit", "Legit Sprint jumping.");
        this.field15863 = 1.0f;
        this.method9881(new Class4999("Sprint", "Sprints when walking", true));
        this.method9881(new Class4999("AutoJump", "Automatically jumps for you.", true));
    }
    
    @Class6753
    public void method10449(final Class5717 class5717) {
        if (this.method9906()) {
            if (Class3297.field15514.player.onGround) {
                if (Class3297.field15514.player.collidedVertically) {
                    if (Class3297.field15514.player.field2970 != 0.0f || Class3297.field15514.player.field2968 != 0.0f) {
                        if (this.method9883("AutoJump")) {
                            Class3297.field15514.player.method2725();
                            class5717.method16975(Class3297.field15514.player.getMotion().y);
                        }
                    }
                }
            }
            final double field22771 = class5717.method16978().y;
            class5717.method16978().y = 0.0;
            final double method16752 = class5717.method16978().length();
            class5717.method16978().y = field22771;
            this.field15859 = method16752;
            final float n = Class7482.method23143()[1];
            final float n2 = Class7482.method23143()[2];
            final float n3 = Class7482.method23143()[0];
            if (n == 0.0f) {
                if (n2 == 0.0f) {
                    class5717.method16973(0.0);
                    class5717.method16977(0.0);
                }
            }
            final double cos = Math.cos(Math.toRadians(n3));
            final double sin = Math.sin(Math.toRadians(n3));
            this.field15859 *= this.field15863;
            class5717.method16973(n * this.field15859 * cos + n2 * this.field15859 * sin + this.field15860);
            class5717.method16977(n * this.field15859 * sin - n2 * this.field15859 * cos + this.field15861);
            Class3297.field15514.player.getMotion().x = class5717.method16972();
            Class3297.field15514.player.getMotion().y = class5717.method16974();
            if (this.field15860 != 0.0f || this.field15861 != 0.0f) {
                this.field15860 *= (float)0.85;
                this.field15861 *= (float)0.85;
                this.field15863 = Math.min(1.0f, this.field15863 + 0.1f);
            }
            if (Class3297.field15514.player.onGround) {
                if (!this.field15862) {
                    this.field15860 = 0.0f;
                    this.field15861 = 0.0f;
                    this.field15863 = Math.min(1.0f, this.field15863 + 0.33f);
                }
            }
            this.field15862 = false;
        }
    }
    
    @Class6753
    private void method10450(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3297.field15514.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    if (class5724.method12822() == Class3297.field15514.player.getEntityId()) {
                        this.field15860 += class5724.field19165 / 8000.0f;
                        this.field15861 += class5724.field19167 / 8000.0f;
                        this.field15862 = true;
                        this.field15863 = 0.0f;
                    }
                }
            }
        }
    }
}
