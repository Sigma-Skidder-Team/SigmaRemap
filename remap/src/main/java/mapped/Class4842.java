// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class4842 extends Class4841
{
    private static String[] field20591;
    private Class7643 field20748;
    public float field20749;
    
    public Class4842(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20748 = Client.method35173().method35199();
        this.field20749 = -1.0f;
        this.method14256((class4803, n) -> this.field20749 = Math.min((int)this.field20748.method24186() / (float)this.field20748.method24192(), 1.0f));
        this.method14258((class4803, n) -> {
            if (this.method14308()) {
                if (this.method14306()) {
                    this.field20748.method24194((int)Math.min((int)(this.field20749 * this.field20748.method24192()), this.field20748.method24187()));
                }
            }
        });
    }
    
    @Override
    public void method14205(final float n) {
        final int n2 = (int)this.field20748.method24186();
        final double method24187 = this.field20748.method24187();
        final int method24188 = this.field20748.method24192();
        float n3 = Math.max(0.0f, Math.min(n2 / (float)method24188, 1.0f));
        final float max = Math.max(0.0f, Math.min((float)method24187 / method24188, 1.0f));
        if (this.method14309()) {
            if (this.method14308()) {
                if (method24187 != 0.0) {
                    this.field20749 = Math.min(Math.max((this.method14320() - this.method14280()) / (float)this.method14276(), 0.0f), max);
                    n3 = this.field20749;
                }
            }
        }
        if (n2 == 0 && !this.field20748.method24184()) {
            Class8154.method26874((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1273.field1292, 0.43f * n));
        }
        else {
            Class8154.method26874((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1281.field1292, 0.075f));
            Class8154.method26874(this.method14272() + this.method14276() * max, (float)this.method14274(), this.method14276() * (1.0f - max), (float)this.method14278(), Class6430.method19118(Class265.field1273.field1292, 0.43f * n));
            Class8154.method26874((float)this.method14272(), (float)this.method14274(), this.method14276() * n3, (float)this.method14278(), Class6430.method19118(Class265.field1278.field1292, n * n));
            if (n3 != 0.0f) {
                Class8154.method26905(this.method14272() + this.method14276() * n3, (float)this.method14274(), 5.0f, 5.0f, Class7853.field32170);
            }
        }
    }
}
