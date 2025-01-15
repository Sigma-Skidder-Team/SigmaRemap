// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.awt.Color;
import java.awt.Stroke;

public class Class6893 extends Class6892
{
    private float field27033;
    private float field27034;
    
    public Class6893() {
        this.field27033 = 1.0f;
        this.field27034 = 3.0f;
        this.method21202(new Class6735(this, null));
    }
    
    public float method21206() {
        return this.field27034;
    }
    
    public void method21207(final float field27034) {
        this.field27034 = field27034;
    }
    
    public float method21208() {
        return this.field27033;
    }
    
    public void method21209(final float field27033) {
        this.field27033 = field27033;
    }
    
    public Class6893(final int n, final Color color) {
        super(n, color);
        this.field27033 = 1.0f;
        this.field27034 = 3.0f;
    }
    
    @Override
    public String toString() {
        return "Outline (Zigzag)";
    }
    
    @Override
    public List method21204() {
        final List method21204 = super.method21204();
        method21204.add(Class7340.method22546("Wavelength", this.field27034, 1.0f, 100.0f, "This setting controls the wavelength of the outline. The smaller the value, the more segments will be used to draw the outline."));
        method21204.add(Class7340.method22546("Amplitude", this.field27033, 0.5f, 50.0f, "This setting controls the amplitude of the outline. The bigger the value, the more the zigzags will vary."));
        return method21204;
    }
    
    @Override
    public void method21205(final List list) {
        super.method21205(list);
        for (final Class5484 class5484 : list) {
            if (!class5484.method16731().equals("Wavelength")) {
                if (!class5484.method16731().equals("Amplitude")) {
                    continue;
                }
                this.field27033 = (float)class5484.method16728();
            }
            else {
                this.field27034 = (float)class5484.method16728();
            }
        }
    }
}
