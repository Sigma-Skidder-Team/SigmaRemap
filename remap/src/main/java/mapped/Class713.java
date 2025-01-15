// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class713 extends Class698
{
    private Class527 field3891;
    private Class5760 field3892;
    private Class8297 field3893;
    private String field3894;
    private String field3895;
    private boolean field3896;
    public static final String field3897 = "<profile>";
    public static final String field3898 = "<empty>";
    public static final String field3899 = "*";
    
    public Class713(final Class527 field3891, final Class5760 field3892) {
        super(new Class2260(Class8822.method30773("of.options.shaderOptionsTitle", new Object[0])));
        this.field3893 = new Class8297(this, new Class7299());
        this.field3894 = null;
        this.field3895 = null;
        this.field3896 = false;
        this.field3891 = field3891;
        this.field3892 = field3892;
    }
    
    public Class713(final Class527 class527, final Class5760 class528, final String s) {
        this(class527, class528);
        this.field3894 = s;
        if (s != null) {
            this.field3895 = Class9216.method33898("screen." + s, s);
        }
    }
    
    @Override
    public void method2969() {
        final int n = 100;
        final int n2 = 30;
        final int n3 = 20;
        final int n4 = 120;
        final int n5 = 20;
        int method33724 = Class9216.method33724(this.field3894, 2);
        final Class5601[] method33725 = Class9216.method33723(this.field3894);
        if (method33725 != null) {
            final int method33726 = MathHelper.method35650(method33725.length / 9.0);
            if (method33724 < method33726) {
                method33724 = method33726;
            }
            for (int i = 0; i < method33725.length; ++i) {
                final Class5601 class5601 = method33725[i];
                if (class5601 != null) {
                    if (class5601.method16875()) {
                        final int n6 = i % method33724;
                        final int n7 = i / method33724;
                        final int min = Math.min(this.field3152 / method33724, 200);
                        final int n8 = n6 * min + 5 + (this.field3152 - min * method33724) / 2;
                        final int n9 = n2 + n7 * n3;
                        final int n10 = min - 10;
                        final String method33727 = method3931(class5601, n10);
                        Class674 class5602;
                        if (!Class9216.method33728(class5601.method16860())) {
                            class5602 = new Class674(n + i, n8, n9, n10, n5, class5601, method33727);
                        }
                        else {
                            class5602 = new Class675(n + i, n8, n9, n10, n5, class5601, method33727);
                        }
                        class5602.field3431 = class5601.method16872();
                        this.method3029(class5602);
                    }
                }
            }
        }
        this.method3029(new Class673(201, this.field3152 / 2 - n4 - 20, this.field3153 / 6 + 168 + 11, n4, n5, Class8822.method30773("controls.reset", new Object[0])));
        this.method3029(new Class673(200, this.field3152 / 2 + 20, this.field3153 / 6 + 168 + 11, n4, n5, Class8822.method30773("gui.done", new Object[0])));
    }
    
    public static String method3931(final Class5601 class5601, final int n) {
        String s = class5601.method16858();
        if (!(class5601 instanceof Class5600)) {
            for (Class1844 field4643 = Class8571.method28894().field4643; field4643.method6617(s) + (field4643.method6617(": " + Class4647.method13879()) + 5) >= n && s.length() > 0; s = s.substring(0, s.length() - 1)) {}
            return s + ": " + (class5601.method16874() ? class5601.method16879(class5601.method16863()) : "") + class5601.method16878(class5601.method16863());
        }
        final Class5600 class5602 = (Class5600)class5601;
        return s + "...";
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 < 200) {
                    if (class574 instanceof Class674) {
                        final Class674 class575 = (Class674)class574;
                        final Class5601 method3736 = class575.method3736();
                        if (method3736 instanceof Class5600) {
                            this.field3150.method5244(new Class713(this, this.field3892, method3736.method16860()));
                            return;
                        }
                        if (!Class527.method3047()) {
                            if (class575.method3738()) {
                                method3736.method16867();
                            }
                        }
                        else {
                            method3736.method16866();
                        }
                        this.method3932();
                        this.field3896 = true;
                    }
                }
                if (class574.field3708 == 201) {
                    final Class5601[] method3737 = Class9216.method33735(Class9216.method33727());
                    for (int i = 0; i < method3737.length; ++i) {
                        method3737[i].method16866();
                        this.field3896 = true;
                    }
                    this.method3932();
                }
                if (class574.field3708 == 200) {
                    if (this.field3896) {
                        Class9216.method33730();
                        this.field3896 = false;
                        Class9216.method33788();
                    }
                    this.field3150.method5244(this.field3891);
                }
            }
        }
    }
    
    @Override
    public void method2971() {
        if (this.field3896) {
            Class9216.method33730();
            this.field3896 = false;
            Class9216.method33788();
        }
        super.method2971();
    }
    
    @Override
    public void method3897(final Class573 class573) {
        if (class573 instanceof Class674) {
            final Class674 class574 = (Class674)class573;
            final Class5601 method3736 = class574.method3736();
            if (!Class527.method3047()) {
                if (class574.method3738()) {
                    method3736.method16868();
                }
            }
            else {
                method3736.method16866();
            }
            this.method3932();
            this.field3896 = true;
        }
    }
    
    private void method3932() {
        for (final Class573 class573 : this.field3842) {
            if (!(class573 instanceof Class674)) {
                continue;
            }
            final Class674 class574 = (Class674)class573;
            final Class5601 method3736 = class574.method3736();
            if (method3736 instanceof Class5603) {
                ((Class5603)method3736).method16887();
            }
            class574.method3367(method3931(method3736, class574.method3364()));
            class574.method3737();
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        if (this.field3895 == null) {
            this.method3295(this.field3843, this.field3148.method8461(), this.field3152 / 2, 15, 16777215);
        }
        else {
            this.method3295(this.field3843, this.field3895, this.field3152 / 2, 15, 16777215);
        }
        super.method2975(n, n2, n3);
        this.field3893.method27577(n, n2, this.field3842);
    }
}
