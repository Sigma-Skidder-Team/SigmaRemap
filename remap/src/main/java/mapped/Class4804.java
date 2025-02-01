// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4804 extends Class4803
{
    private static String[] field20510;
    public float field20511;
    public float field20512;
    public float field20513;
    public float field20514;
    public float field20515;
    public float field20516;
    public float field20517;
    public int field20518;
    public int field20519;
    public int field20520;
    public int field20521;
    
    public Class4804(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class4803, s, n, n2, n3, n3);
        this.field20515 = -9999.0f;
        this.field20516 = -9999.0f;
        this.field20518 = 0;
        this.field20521 = 114;
        final float n6 = (float)n4;
        this.field20513 = n6;
        this.field20511 = n6;
        final float n7 = (float)n5;
        this.field20514 = n7;
        this.field20512 = n7;
        this.field20515 = (float)n;
        this.field20516 = (float)n2;
    }
    
    @Override
    public void method14200(final int field20519, final int field20520) {
        if (this.field20515 == -9999.0f || this.field20516 == -9999.0f) {
            this.field20515 = (float)this.field20478;
            this.field20516 = (float)this.field20479;
        }
        this.field20515 += this.field20511 * Class4929.field21099;
        this.field20516 += this.field20512 * Class4929.field21099;
        this.field20478 = Math.round(this.field20515);
        this.field20479 = Math.round(this.field20516);
        if (this.field20515 + this.field20480 >= 0.0f) {
            if (this.field20515 > Minecraft.method5277().field4632.method7694()) {
                this.field20515 = (float)(0 - this.field20480);
            }
        }
        else {
            this.field20515 = (float) Minecraft.method5277().field4632.method7694();
        }
        if (this.field20516 + this.field20481 >= 0.0f) {
            if (this.field20516 > Minecraft.method5277().field4632.method7695()) {
                this.field20516 = (float)(0 - this.field20481);
            }
        }
        else {
            this.field20516 = (float) Minecraft.method5277().field4632.method7695();
        }
        final float n = (float)(field20519 - this.method14280());
        final float n2 = (float)(field20520 - this.method14281());
        this.field20517 = (float)(1.0 - Math.sqrt(n * n + n2 * n2) / this.field20521);
        if (Math.sqrt(n * n + n2 * n2) >= this.field20521) {
            this.field20511 -= (this.field20511 - this.field20513) * 0.05f * Class4929.field21099;
            this.field20512 -= (this.field20512 - this.field20514) * 0.05f * Class4929.field21099;
        }
        else {
            final float n3 = this.field20515 - field20519;
            final float n4 = this.field20516 - field20520;
            final float n5 = (float)Math.sqrt(n3 * n3 + n4 * n4) / 2.0f;
            final float n6 = n3 / n5;
            final float n7 = n4 / n5;
            this.field20511 += n6 / (1.0f + this.field20517) * Class4929.field21099;
            this.field20512 += n7 / (1.0f + this.field20517) * Class4929.field21099;
        }
        this.field20519 = field20519;
        this.field20520 = field20520;
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26886((float)this.field20478, (float)this.field20479, (float)this.method14276(), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.07f + ((this.field20517 <= 0.0f) ? 0.0f : (this.field20517 * 0.3f))));
        final float n2 = (float)(this.field20519 - this.method14280());
        final float n3 = (float)(this.field20520 - this.method14281());
        super.draw(n);
    }
}
