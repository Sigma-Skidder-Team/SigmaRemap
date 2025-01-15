// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3220 extends Class3167
{
    private int field15675;
    private int field15676;
    private int field15677;
    private double field15678;
    
    public Class3220() {
        super(Class8013.field32990, "Mineplex", "Speed for Mineplex");
        this.method9881(new Class4999("AutoJump", "Automatically jumps for you.", true));
        this.method9881(new Class4999("OnGround", "OnGround Speed.", true));
        this.method9881(new Class4996("OnGround Speed", "OnGround value.", 0.8f, Float.class, 0.3f, 1.5f, 0.01f));
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(Class7482.method23136() * 0.7);
        if (Class3220.field15514.field4684.field3006.field2743 != this.field15677) {
            Class3220.field15514.method5269().method17292(new Class4321(Class3220.field15514.field4684.field3006.field2743));
            this.field15677 = Class3220.field15514.field4684.field3006.field2743;
        }
    }
    
    @Override
    public void method9879() {
        this.field15676 = 0;
        this.field15675 = 0;
        this.field15677 = -1;
        this.field15678 = this.method9886("OnGround Speed") * 1.0f / 4.0f;
    }
    
    @Class6753
    @Class6757
    public void method10150(final Class5717 class5717) {
        if (this.method9906()) {
            if (!Class9463.method35173().method35189().method21551(Class3260.class).method9906()) {
                if (!Class6430.method19112(Class3220.field15514.field4684)) {
                    final double field15678 = this.method9886("OnGround Speed");
                    if (!Class3220.field15514.field4684.field2404) {
                        if (Class3220.field15514.field4684.field2405) {
                            this.field15678 = 0.35;
                            this.field15676 = 1;
                        }
                        if (!Class6430.method19114()) {
                            this.field15678 = 0.3;
                        }
                        this.field15678 -= 0.01;
                        if (this.field15678 < 0.3) {
                            this.field15678 = 0.3;
                        }
                        Class7482.method23149(class5717, this.field15678);
                    }
                    else {
                        if (this.field15675 > 1) {
                            this.field15676 = 0;
                        }
                        else {
                            ++this.field15675;
                        }
                        if (this.method9883("AutoJump")) {
                            if (Class6430.method19114()) {
                                Class3220.field15514.field4684.method2725();
                                class5717.method16975(Class3220.field15514.field4684.method1935().field22771);
                            }
                        }
                        if (class5717.method16974() == 0.4199998) {
                            Class7482.method23149(class5717, 0.0);
                            return;
                        }
                        if (!this.method9883("OnGround")) {
                            return;
                        }
                        if (this.method10154() == -1) {
                            Class7482.method23149(class5717, 0.2);
                            return;
                        }
                        Class3220.field15514.method5269().method17292(new Class4329(Class316.field1877, new Class7005(new Class5487(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05), Class179.field512, new Class354(Class3220.field15514.field4684).method1134(0, -1, 0), false)));
                        this.field15678 += field15678 / 4.0;
                        if (Class3220.field15514.field4684.field2405) {
                            this.field15678 /= 2.0;
                        }
                        if (this.field15678 > field15678) {
                            this.field15678 = field15678;
                        }
                        if (this.field15678 < 0.3) {
                            this.field15678 = 0.3;
                        }
                        Class7482.method23149(class5717, this.field15678);
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10151(final Class5722 class5722) {
        if (this.method9906()) {
            this.field15678 = 0.81 + this.field15676 * 0.095;
            if (Class3220.field15514.field4684.field2396 != (int)Class3220.field15514.field4684.field2396) {
                this.field15678 = 0.52;
                this.field15676 = 1;
            }
            this.field15675 = 0;
            if (this.field15676 < 2) {
                ++this.field15676;
            }
            class5722.method16996(0.0);
            class5722.method16995(0.4199998);
            if (Class3220.field15514.field4684.field3006.field2743 != this.field15677) {
                Class3220.field15514.method5269().method17292(new Class4321(Class3220.field15514.field4684.field3006.field2743));
                this.field15677 = Class3220.field15514.field4684.field3006.field2743;
            }
        }
    }
    
    @Class6753
    public void method10152(final Class5723 class5723) {
        if (this.method9906() && Class3220.field15514.field4684 != null) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15676 = 0;
                this.field15678 = 0.0;
            }
        }
    }
    
    @Class6753
    public void method10153(final Class5745 class5745) {
        if (this.method9906() && Class3220.field15514.field4684 != null) {
            if (class5745.method17049() > 0.2) {
                this.field15678 -= this.method9886("OnGround Speed") / 4.0f;
            }
        }
    }
    
    private int method10154() {
        if (!Class3220.field15514.field4684.method2713().method27620()) {
            for (int i = 36; i < 45; ++i) {
                final int field15677 = i - 36;
                if (Class3220.field15514.field4684.field3008.method10878(i).method20053().method27620()) {
                    if (Class3220.field15514.field4684.field3006.field2743 != field15677) {
                        if (this.field15677 != field15677) {
                            Class3220.field15514.method5269().method17292(new Class4321(field15677));
                            this.field15677 = field15677;
                        }
                    }
                    return field15677;
                }
            }
            Class8639.method29367(Class3220.field15514.field4684.field3008.field16154, 42, 0, Class2133.field12438, Class3220.field15514.field4684, true);
            if (Class3220.field15514.field4684.field3008.method10878(42).method20053().method27620()) {
                if (Class3220.field15514.field4684.field3006.field2743 != 6) {
                    if (this.field15677 != 6) {
                        Class3220.field15514.method5269().method17292(new Class4321(6));
                        return this.field15677 = 6;
                    }
                }
            }
            return -1;
        }
        return this.field15677 = Class3220.field15514.field4684.field3006.field2743;
    }
}
