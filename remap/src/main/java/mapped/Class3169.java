// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3169 extends Class3167
{
    private int field15526;
    private int field15527;
    private boolean field15528;
    private double field15529;
    
    public Class3169() {
        super(Class8013.field32990, "NCP", "Longjump for NoCheatPlus.");
        this.method9881(new Class4996("Boost", "Longjump boost", 3.0f, Float.class, 1.0f, 5.0f, 0.01f));
        this.method9881(new Class4996("Duration", "Speed duration", 10.0f, Float.class, 7.0f, 200.0f, 1.0f));
        this.method9881(new Class5001("Glide Mode", "The way you will glide", 1, new String[] { "None", "Basic", "High" }));
        this.method9881(new Class5001("Speed Mode", "The way you will speed", 0, new String[] { "Basic", "Funcraft", "Hypixel" }));
    }
    
    @Override
    public void method9897() {
        this.field15528 = false;
        Class3169.field15514.field4633.field26532 = 1.0f;
        Class7482.method23151(Class7482.method23137() * 0.7);
    }
    
    @Override
    public void method9879() {
        this.field15528 = false;
        this.field15526 = 0;
    }
    
    @Class6753
    public void method9919(final Class5717 class5717) {
        if (!this.method9906() || Class3169.field15514.field4684 == null) {
            return;
        }
        if (Class3169.field15514.field4684.field2404) {
            this.field15527 = 0;
            ++this.field15526;
            if (this.field15528 && class5717.method16974() != 0.599 && this.method9914().method9883("Auto Disable")) {
                this.method9914().method9910();
                Class7482.method23149(class5717, Class7482.method23137() * 0.8);
                return;
            }
            final BlockPos class5718 = new BlockPos(Class3169.field15514.field4684.field2395, Class3169.field15514.field4684.field2396 - 0.4, Class3169.field15514.field4684.field2397);
            if (Class3265.field15758 > 1) {
                if (this.method9914().method9883("BorderJump") && !Class4609.method13708(class5718) && this.field15526 > 0 && Class6430.method19114()) {
                    Class3169.field15514.field4684.method2725();
                    class5717.method16973(Class3169.field15514.field4684.method1935().x);
                    class5717.method16975(Class3169.field15514.field4684.method1935().y);
                    class5717.method16977(Class3169.field15514.field4684.method1935().z);
                }
                else if (this.method9914().method9883("Auto Jump") && this.field15526 > (this.field15528 ? 1 : 0) && Class6430.method19114()) {
                    Class3169.field15514.field4684.method2725();
                    class5717.method16973(Class3169.field15514.field4684.method1935().x);
                    class5717.method16975(Class3169.field15514.field4684.method1935().y);
                    class5717.method16977(Class3169.field15514.field4684.method1935().z);
                }
            }
        }
        else {
            ++this.field15527;
            this.field15526 = 0;
            if (this.field15528) {
                final double field15529 = Class7482.method23137() * 0.95;
                if (this.field15527 == 1) {
                    this.field15529 = this.method9886("Boost") * 0.4 + Class7482.method23139() * 0.05;
                }
                else if (this.field15527 > this.method9886("Duration") + Class7482.method23139()) {
                    this.field15529 = field15529;
                }
                else if (this.field15529 > field15529) {
                    final String method9887 = this.method9887("Speed Mode");
                    switch (method9887) {
                        case "Basic": {
                            this.field15529 *= 0.987;
                            break;
                        }
                        case "Funcraft": {
                            this.field15529 -= 0.0075;
                            break;
                        }
                        case "Hypixel": {
                            this.field15529 -= 0.0079;
                            break;
                        }
                    }
                    if (this.field15529 < field15529) {
                        this.field15529 = field15529;
                    }
                }
                if (Class3169.field15514.field4684.field2405 || !Class6430.method19114()) {
                    this.field15529 = field15529;
                }
                Class7482.method23149(class5717, this.field15529);
                if (Class7482.method23140() == 0) {
                    final String method9888 = this.method9887("Glide Mode");
                    switch (method9888) {
                        case "Basic": {
                            class5717.method16975(((Class3257)this.method9914()).method10270(this.field15527));
                            break;
                        }
                        case "High": {
                            class5717.method16975(((Class3257)this.method9914()).method10271(this.field15527));
                            if (!Class6430.method19146() || !Class9463.method35173().method35189().method21551(Class3393.class).method9906() || (this.field15527 != 8 && this.field15527 != 21)) {
                                break;
                            }
                            final double n3 = Class3169.field15514.field4684.field2396 + class5717.method16974();
                            final double a = n3 - (int)(n3 + 0.001);
                            if (Math.abs(a) < 0.001) {
                                class5717.method16975(class5717.method16974() - a);
                                break;
                            }
                            final double a2 = n3 - (int)n3 - 0.25;
                            if (Math.abs(a2) < 0.007) {
                                class5717.method16975(class5717.method16974() - a2);
                                break;
                            }
                            break;
                        }
                    }
                }
            }
            if (this.field15526 == 1 && Class3169.field15514.field4684.method1935().y < 0.0 && this.method9914().method9883("Auto Jump")) {
                Class7482.method23149(class5717, Class7482.method23137() * 0.2);
            }
        }
        Class6430.method19155(class5717.method16974());
    }
    
    @Class6753
    public void method9920(final Class5722 class5722) {
        if (this.method9906() && Class3169.field15514.field4684 != null) {
            this.field15528 = true;
            class5722.method16996(this.field15529 = Class7482.method23137());
            class5722.method16995(0.425 + Class7482.method23140() * 0.1);
            if (this.method9887("Glide Mode").equals("High")) {
                if (Class7482.method23140() == 0) {
                    class5722.method16995(0.599);
                    class5722.method16996(0.0);
                    if (this.method9886("Boost") > 1.5) {
                        class5722.method16996(0.28 + this.method9886("Boost") * 0.1 + Class7482.method23139() * 0.05);
                    }
                    if (this.method9887("Speed Mode").equals("Hypixel")) {
                        if (this.method9886("Boost") > 1.75) {
                            Class6430.method19179(true);
                        }
                    }
                    Class3169.field15514.method5269().method17292(new Class4354(Class3169.field15514.field4684.field2395, Class3169.field15514.field4684.field2396 + 0.425, Class3169.field15514.field4684.field2397, false));
                    Class3169.field15514.method5269().method17292(new Class4354(Class3169.field15514.field4684.field2395, Class3169.field15514.field4684.field2396 + 0.425 + 0.396, Class3169.field15514.field4684.field2397, false));
                    Class3169.field15514.method5269().method17292(new Class4354(Class3169.field15514.field4684.field2395, Class3169.field15514.field4684.field2396 + 0.425 + 0.396 - 0.122, Class3169.field15514.field4684.field2397, false));
                }
            }
        }
    }
    
    @Class6753
    public void method9921(final Class5738 class5738) {
        if (this.method9906() && this.method9887("Glide Mode").equals("High")) {
            return;
        }
    }
}
