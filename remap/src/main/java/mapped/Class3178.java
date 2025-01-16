// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.io.IOException;

public class Class3178 extends Class3167
{
    public Vec2f field15556;
    public float field15557;
    public float field15558;
    public float field15559;
    public float field15560;
    public Class9469 field15561;
    public int field15562;
    
    public Class3178() {
        super(Class8013.field32984, "DVD Simulator", "wtf");
        this.field15556 = new Vec2f(1.0f, 1.0f);
        this.field15558 = 0.0f;
        this.field15559 = 1.0f;
        this.field15560 = 1.0f;
        this.field15561 = new Class9469(201, 90);
        this.field15562 = 0;
        this.method9973();
    }
    
    @Override
    public void method9879() {
        this.field15557 = (float)((Class3178.field15514.field4632.method7694() - this.field15561.field40723) * Math.random());
        this.field15558 = (float)((Class3178.field15514.field4632.method7695() - this.field15561.field40724) * Math.random());
        this.method9973();
    }
    
    @Class6753
    private void method9972(final Class5740 class5740) throws IOException {
        if (this.method9906()) {
            if (Class3178.field15514.field4684 != null) {
                if (Class3178.field15514.world != null) {
                    final int method7695 = Class3178.field15514.field4632.method7695();
                    final int method7696 = Class3178.field15514.field4632.method7694();
                    final int n = 2;
                    if (this.field15558 > n) {
                        if (this.field15558 + this.field15561.field40724 > method7695) {
                            this.field15560 = -1.0f;
                            this.method9973();
                        }
                    }
                    else {
                        this.field15560 = 1.0f;
                        this.method9973();
                    }
                    if (this.field15557 > n) {
                        if (this.field15557 + this.field15561.field40723 > method7696) {
                            this.field15559 = -1.0f;
                            this.method9973();
                        }
                    }
                    else {
                        this.field15559 = 1.0f;
                        this.method9973();
                    }
                    this.field15557 += this.field15559 * n;
                    this.field15558 += this.field15560 * n;
                    Class8154.method26899(this.field15557, this.field15558, (float)this.field15561.field40723, (float)this.field15561.field40724, Class7853.field32218, Class6430.method19118(this.field15562, 0.8f));
                }
            }
        }
    }
    
    private void method9973() {
        this.field15562 = Color.getHSBColor((float)Math.random(), 0.6f, 1.0f).getRGB();
    }
}
