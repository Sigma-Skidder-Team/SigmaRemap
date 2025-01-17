// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import slick2d.Texture;
import slick2d.TrueTypeFont;

public class Class4873 extends Class4868
{
    private static String[] field20855;
    public static final Class6523 field20856;
    public Texture field20857;
    
    public Class4873(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture field20857, final Class6523 class4804, final String s2, final TrueTypeFont class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, class4805);
        this.field20857 = field20857;
    }
    
    public Class4873(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture field20857, final Class6523 class4804, final String s2) {
        super(class4803, s, n, n2, n3, n4, class4804, s2);
        this.field20857 = field20857;
    }
    
    public Class4873(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture field20857, final Class6523 class4804) {
        super(class4803, s, n, n2, n3, n4, class4804);
        this.field20857 = field20857;
    }
    
    public Class4873(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture field20857) {
        super(class4803, s, n, n2, n3, n4, Class4873.field20856);
        this.field20857 = field20857;
    }
    
    public Texture method14607() {
        return this.field20857;
    }
    
    public void method14608(final Texture field20857) {
        this.field20857 = field20857;
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26899((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), this.method14607(), Class6430.method19118(Class6430.method19120(this.field20497.method19729(), this.field20497.method19727(), 1.0f - (this.method14304() ? (this.method14386() ? 0.0f : (this.method14309() ? 1.5f : Math.max(n * this.field20845, 0.0f))) : 0.3f)), (this.field20497.method19729() >> 24 & 0xFF) / 255.0f * n));
        if (this.method14314() != null) {
            Class8154.method26890(this.method14316(), (float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), this.method14314(), Class6430.method19118(this.field20497.method19733(), n), this.field20497.method19735(), this.field20497.method19737());
        }
        GL11.glPushMatrix();
        super.method14229(n);
        GL11.glPopMatrix();
    }
    
    static {
        field20856 = new Class6523(Class265.field1278.field1292, Class6430.method19121(Class265.field1278.field1292, 0.1f));
    }
}
