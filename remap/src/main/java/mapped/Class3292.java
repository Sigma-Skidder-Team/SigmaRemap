// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3292 extends Class3167
{
    private int field15851;
    private boolean field15852;
    private double field15853;
    
    public Class3292() {
        super(Class8013.field32990, "Hypixel", "Highjump for Hypixel");
        this.method9881(new Class4996("Motion", "Highjump motion", 0.75f, Float.class, 0.42f, 5.0f, 0.05f));
    }
    
    @Override
    public void method9879() {
        this.field15851 = -1;
        this.field15852 = false;
        this.field15853 = 999.0;
    }
    
    @Class6753
    public void method10420(final Class5717 class5717) {
        if (this.method9906() && Class3292.field15514.field4684 != null) {
            if (Class3292.field15514.field4684.fallDistance > 3.0f + this.method9886("Motion") * 4.0f) {
                if (class5717.method16974() < -0.3) {
                    if (this.field15852) {
                        if (Class3292.field15514.field4684.posY + class5717.method16974() < this.field15853) {
                            class5717.method16975(this.field15853 - Class3292.field15514.field4684.posY);
                            this.field15852 = false;
                        }
                    }
                    else {
                        this.field15851 = 0;
                    }
                }
            }
            if (this.field15851 >= 0) {
                ++this.field15851;
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
                class5717.method16975(this.method9886("Motion"));
                this.field15852 = true;
                this.field15853 = Class3292.field15514.field4684.posY;
                this.field15851 = -1;
            }
            if (this.field15852) {
                if (Class6430.method19160(Class3292.field15514.field4684, 0.001f)) {
                    this.field15852 = !this.field15852;
                }
            }
            Class6430.method19155(class5717.method16974());
        }
    }
    
    @Class6753
    public void method10421(final Class5744 class5744) {
        if (this.method9906()) {
            if (this.field15851 >= 0) {
                class5744.method17033(true);
            }
        }
    }
}
