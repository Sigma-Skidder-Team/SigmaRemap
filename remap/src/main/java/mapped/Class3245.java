// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3245 extends Class3167
{
    private int field15736;
    
    public Class3245() {
        super(Class8013.field32989, "TP", "Disabler working on some anticheats.");
        this.method9881(new Class4996("Delay", "Tp delay.", 20.0f, Float.class, 5.0f, 40.0f, 1.0f));
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Basic1", "Basic2", "MinInfinity", "MaxInfinity", "MinValue", "MaxValue" }));
        this.method9881(new Class4999("OnGround", "Send on ground packets.", false));
        this.method9881(new Class4999("More Packets", "Send more packets.", false));
        this.method9881(new Class4999("Ping spoof", "Spoof your ping.", false));
    }
    
    @Override
    public void method9879() {
        this.field15736 = 0;
    }
    
    @Class6753
    public void method10250(final Class5744 class5744) {
        if (!this.method9906() || Class3245.field15514.field4684 == null || !class5744.method17046() || Class3245.field15514.method5282() == null) {
            return;
        }
        ++this.field15736;
        double n = -4.503599627370497E15;
        final String method9887 = this.method9887("Mode");
        switch (method9887) {
            case "Basic1": {
                n = Class3245.field15514.field4684.posY - 20.0;
                break;
            }
            case "Basic2": {
                n = Class3245.field15514.field4684.posY - 1000.0 + Math.random() * 1000.0;
                break;
            }
            case "MinInfinity": {
                n = Double.NEGATIVE_INFINITY;
                break;
            }
            case "MaxInfinity": {
                n = Double.POSITIVE_INFINITY;
                break;
            }
            case "MinValue": {
                n = Double.MIN_VALUE;
                break;
            }
            case "MaxValue": {
                n = Double.MAX_VALUE;
                break;
            }
        }
        if (this.field15736 >= this.method9886("Delay")) {
            this.field15736 = 0;
            final boolean method9888 = this.method9883("OnGround");
            if (this.method9883("More Packets")) {
                Class3245.field15514.method5269().method17292(new Class4354(Class3245.field15514.field4684.posX, n, Class3245.field15514.field4684.posX, method9888));
            }
            else {
                class5744.method17037(n);
                class5744.method17045(method9888);
            }
        }
    }
}
