// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.awt.Color;
import java.awt.Stroke;

public class Class6900 extends Class6892
{
    private float field27051;
    private float field27052;
    
    public Class6900() {
        this.field27051 = 1.0f;
        this.field27052 = 1.0f;
        this.method21202(new Class6734(this, null));
    }
    
    public float method21241() {
        return this.field27051;
    }
    
    public void method21242(final float field27051) {
        this.field27051 = field27051;
    }
    
    public float method21243() {
        return this.field27052;
    }
    
    public void method21244(final float field27052) {
        this.field27052 = field27052;
    }
    
    public Class6900(final int n, final Color color) {
        super(n, color);
        this.field27051 = 1.0f;
        this.field27052 = 1.0f;
    }
    
    @Override
    public String toString() {
        return "Outline (Wobble)";
    }
    
    @Override
    public List method21204() {
        final List method21204 = super.method21204();
        method21204.remove(2);
        method21204.add(Class7340.method22546("Detail", this.field27051, 1.0f, 50.0f, "This setting controls how detailed the outline will be. Smaller numbers cause the outline to have more detail."));
        method21204.add(Class7340.method22546("Amplitude", this.field27052, 0.5f, 50.0f, "This setting controls the amplitude of the outline."));
        return method21204;
    }
    
    @Override
    public void method21205(final List list) {
        super.method21205(list);
        for (final Class5484 class5484 : list) {
            if (!class5484.method16731().equals("Detail")) {
                if (!class5484.method16731().equals("Amplitude")) {
                    continue;
                }
                this.field27052 = (float)class5484.method16728();
            }
            else {
                this.field27051 = (float)class5484.method16728();
            }
        }
    }
}
