// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3257 extends Class3247
{
    public Class3257() {
        super(Class8013.field32990, "LongJump", "Makes you jump far away", new Class3167[] { new Class3169(), new Class3191(), new Class3372() });
        this.method9881(new Class4999("Auto Disable", "Disable Longjump when landing", true));
        this.method9881(new Class4999("BorderJump", "Jumps when you are close to a border", true));
        this.method9881(new Class4999("Auto Jump", "Automatically jumps when you can", true));
    }
    
    public double method10270(int n) {
        final double[] array = { 0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.104, -0.13, -0.019, -0.097 };
        final double[] array2 = { 0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.14, -0.17, -0.019, -0.13 };
        if (--n < 0 || n >= array.length) {
            return Class3257.field15514.player.getMotion().y;
        }
        if (Class6430.method19114() && !Class3257.field15514.player.collidedHorizontally) {
            return array[n];
        }
        return array2[n];
    }
    
    public double method10271(int n) {
        final double[] array = { 0.423, 0.35, 0.28, 0.217, 0.15, 0.025, -0.00625, -0.038, -0.0693, -0.102, -0.13, -0.018, -0.1, -0.117, -0.14532, -0.1334, -0.1581, -0.183141, -0.170695, -0.195653, -0.221, -0.209, -0.233, -0.25767, -0.314917, -0.371019, -0.426 };
        if (--n >= 0 && n < array.length) {
            return array[n];
        }
        return Class3257.field15514.player.getMotion().y;
    }
}
