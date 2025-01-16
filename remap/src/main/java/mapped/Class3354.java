// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3354 extends Class3167
{
    private float field15983;
    private boolean field15984;
    
    public Class3354() {
        super(Class8013.field32987, "Weather", "Removes rain and changes the world's time");
        this.method9881(new Class4999("Custom time", "Set the world time", true));
        this.method9881(new Class4996("Time", "Time to set the world to", 12000.0f, Float.class, 0.0f, 24000.0f, 1.0f).method15195(class4997 -> {
            if (this.method9883("Custom time")) {
                if (this.method9906()) {
                    Class3354.field15514.world.method6756(-(long)this.method9886("Time"));
                }
            }
        }));
        this.method9881(new Class4999("Disable rain", "Disable rain", true));
    }
    
    @Override
    public void method9879() {
        this.field15983 = Class3354.field15514.world.method6768(1.0f);
        if (Class3354.field15514.world.method6768(1.0f) != 1.0f) {
            if (Class3354.field15514.world.method6768(1.0f) == 0.0f) {
                this.field15984 = false;
            }
        }
        else {
            this.field15984 = true;
        }
        Class3354.field15514.world.method6752((long)this.method9886("Time"));
    }
    
    @Class6753
    private void method10619(final Class5743 class5743) {
        if (this.method9906()) {
            if (!this.method9883("Disable rain")) {
                if (this.field15984) {
                    if (this.field15983 >= 1.0f) {
                        if (this.field15983 > 1.0f) {
                            this.field15983 = 1.0f;
                        }
                    }
                    else {
                        this.field15983 += (float)0.05;
                    }
                }
            }
            else if (this.field15983 <= 0.0f) {
                if (this.field15983 < 0.0f) {
                    this.field15983 = 0.0f;
                }
            }
            else {
                this.field15983 -= (float)0.05;
            }
            Class3354.field15514.world.method6769(this.field15983);
            Class3354.field15514.world.method6767(this.field15983);
        }
    }
    
    @Class6753
    private void method10620(final Class5723 class5723) {
        if (this.method9906()) {
            if (!(class5723.method16998() instanceof Class4345)) {
                if (class5723.method16998() instanceof Class4306) {
                    final Class4306 class5724 = (Class4306)class5723.method16998();
                    if (class5724.method12948() == 7) {
                        if (class5724.method12949() != 1.0f) {
                            if (class5724.method12949() == 0.0f) {
                                this.field15984 = false;
                            }
                        }
                        else {
                            this.field15984 = true;
                        }
                        if (!this.method9883("Disable rain")) {
                            this.field15983 = class5724.method12949();
                        }
                        else {
                            class5723.method16999(new Class4306(class5724.method12948(), 0.0f));
                            this.field15983 = 0.0f;
                        }
                    }
                }
            }
            else if (this.method9883("Custom time")) {
                class5723.method16999(new Class4345(-(long)this.method9886("Time"), -(long)this.method9886("Time"), true));
            }
        }
    }
}
