// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class7730 extends Class7727
{
    private static String[] field30741;
    private final int field30742;
    
    public Class7730(final Class759 class759, final int field30742) {
        super(class759);
        this.field30742 = field30742;
    }
    
    @Override
    public void method24665() {
        if (!this.field30735) {
            if (this.field30732.method4150().method24731()) {
                this.field30732.rotationPitch = this.method24677(this.field30732.rotationPitch, 0.0f, 5.0f);
            }
            this.field30732.field2953 = this.method24677(this.field30732.field2953, this.field30732.field2951, this.field30733);
        }
        else {
            this.field30735 = false;
            this.field30732.field2953 = this.method24677(this.field30732.field2953, this.method24676() + 20.0f, this.field30733);
            this.field30732.rotationPitch = this.method24677(this.field30732.rotationPitch, this.method24675() + 10.0f, this.field30734);
        }
        final float method35668 = MathHelper.method35668(this.field30732.field2953 - this.field30732.field2951);
        if (method35668 >= -this.field30742) {
            if (method35668 > this.field30742) {
                final Class759 field30732 = this.field30732;
                field30732.field2951 += 4.0f;
            }
        }
        else {
            final Class759 field30733 = this.field30732;
            field30733.field2951 -= 4.0f;
        }
    }
}
