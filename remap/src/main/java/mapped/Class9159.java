// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

public class Class9159
{
    private static String[] field38805;
    private float field38806;
    private final float field38807;
    public float field38808;
    public float field38809;
    public float field38810;
    private float field38811;
    private float field38812;
    private float field38813;
    private boolean field38814;
    private final float field38815;
    private final Class2315 field38816;
    public float field38817;
    public Color field38818;
    public int field38819;
    
    public Class9159(final float n, final float n2, final float field38810) {
        this.field38815 = 1.0f;
        this.field38816 = new Class2315();
        this.field38818 = new Color(1.0f, 1.0f, 1.0f, 0.5f);
        this.field38819 = 0;
        this.field38806 = n;
        this.field38808 = n;
        this.field38807 = n2;
        this.field38809 = n2;
        this.field38810 = field38810;
        this.method33438();
    }
    
    public Class9159(final float n, final float n2) {
        this.field38815 = 1.0f;
        this.field38816 = new Class2315();
        this.field38818 = new Color(1.0f, 1.0f, 1.0f, 0.5f);
        this.field38819 = 0;
        this.field38806 = n;
        this.field38808 = n;
        this.field38807 = n2;
        this.field38809 = n2;
        this.field38810 = this.field38816.nextInt(1, 3) + this.field38816.nextFloat();
        this.method33438();
    }
    
    private void method33438() {
        this.field38812 = this.field38816.nextFloat() % this.field38815;
        this.field38813 = this.field38816.nextFloat() % this.field38815;
        this.field38811 = (this.field38816.nextFloat() * this.field38810 + 15.0f) % 25.0f;
        this.field38814 = this.field38816.nextBoolean();
        this.field38817 = this.field38816.nextFloat() / 2.0f;
        if (this.field38816.nextBoolean()) {
            this.field38817 *= -1.0f;
        }
    }
    
    public void method33439(final float n) {
        RenderUtil.method26888(this.field38808 * 2.0f, this.field38809 * 2.0f, this.field38810 * 2.0f, AllUtils.applyAlpha(this.field38818.getRGB(), n * 0.7f));
    }
    
    public void method33440(final Class8338 class8338) {
        this.field38808 += class8338.method27791() + this.field38817;
        this.field38806 += class8338.method27791() + this.field38817;
        this.field38809 += this.field38813;
    }
}
