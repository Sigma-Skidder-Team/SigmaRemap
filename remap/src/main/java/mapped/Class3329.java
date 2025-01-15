// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class3329 extends Class3167
{
    public float field15926;
    
    public Class3329() {
        super(Class8013.field32991, "Info HUD", "Shows a bunch of usefull stuff");
        this.field15926 = 0.0f;
        this.method9881(new Class5001("Cords", "Coordinate display type", 1, new String[] { "None", "Normal", "Precise" }));
        this.method9881(new Class4999("Show Player", "Renders a miniature version of your character", true));
        this.method9881(new Class4999("Show Armor", "Shows your armor's status", true));
        this.method9915(false);
    }
    
    @Class6753
    private void method10537(final Class5740 class5740) {
        if (!this.method9906() || Class3329.field15514.field4684 == null) {
            return;
        }
        if (Class869.method5277().field4648.field23464) {
            return;
        }
        if (!(Class3329.field15514.field4700 instanceof Class535)) {
            final float n = Class3329.field15514.field4684.field2399 % 360.0f - this.field15926 % 360.0f;
            final float field15926 = this.field15926;
            final float n2 = n;
            final Class869 field15927 = Class3329.field15514;
            this.field15926 = field15926 + n2 / Class869.method5338() * 1.5f;
            int n3 = 14;
            if (this.method9883("Show Player")) {
                n3 += this.method10541(0, Class3329.field15514.field4632.method7695() - 23, 114);
            }
            if (this.method9883("Show Armor")) {
                n3 += this.method10540(n3, Class3329.field15514.field4632.method7695() - 14) + 10;
            }
            if (!this.method9887("Cords").equals("None")) {
                final int n4 = n3 + (this.method10539(n3, 42) + 10);
            }
        }
    }
    
    public String method10538(final boolean b) {
        if (!b) {
            return Math.round(Class3329.field15514.field4684.field2395) + " " + Math.round(Class3329.field15514.field4684.field2396) + " " + Math.round(Class3329.field15514.field4684.field2397);
        }
        return Math.round(Class3329.field15514.field4684.field2395 * 10.0) / 10.0f + " " + Math.round(Class3329.field15514.field4684.field2396 * 10.0) / 10.0f + " " + Math.round(Class3329.field15514.field4684.field2397 * 10.0) / 10.0f;
    }
    
    public int method10539(final int n, final int n2) {
        final String s = "Facing South";
        final String method10538 = this.method10538(this.method9887("Cords").equals("Precise"));
        Class8154.method26889(Class9400.field40323, (float)n, (float)(Class3329.field15514.field4632.method7695() - n2), method10538, Class6430.method19118(Class265.field1278.field1292, 0.8f));
        return Math.max(Class9400.field40313.method23505(s), Class9400.field40323.method23505(method10538));
    }
    
    public int method10540(final int n, final int n2) {
        int n3 = 0;
        for (int i = 0; i < Class3329.field15514.field4684.field3006.field2740.size(); ++i) {
            final ItemStack class8321 = Class3329.field15514.field4684.field3006.field2740.get(i);
            if (!(class8321.method27622() instanceof Class4099)) {
                ++n3;
                final int n4 = n2 - 32 * n3;
                Class8154.method26929(class8321, n, n4, 32, 32);
                GL11.glDisable(2896);
                final float n5 = 1.0f - class8321.method27632() / (float)class8321.method27634();
                if (n5 != 1.0f) {
                    Class8154.method26874((float)(n + 2), (float)(n4 + 28), 28.0f, 5.0f, Class6430.method19118(Class265.field1273.field1292, 0.5f));
                    Class8154.method26874((float)(n + 2), (float)(n4 + 28), 28.0f * n5, 3.0f, Class6430.method19118((n5 > 0.2) ? Class265.field1276.field1292 : Class265.field1283.field1292, 0.9f));
                }
            }
        }
        return (n3 != 0) ? 32 : -7;
    }
    
    public int method10541(final int n, final int n2, final int n3) {
        return n3 - 24;
    }
}
