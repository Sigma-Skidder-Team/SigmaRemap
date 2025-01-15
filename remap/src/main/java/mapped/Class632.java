// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class632 extends Class623<Class632>
{
    private Class615 field3618;
    public final Class869 field3619;
    public final Class711 field3620;
    private final Class1922 field3621;
    
    public Class632(final Class615 field3618, final Class711 field3619, final Class1922 field3620) {
        this.field3620 = field3619;
        this.field3619 = Class869.method5277();
        this.field3621 = field3620;
        this.field3618 = field3618;
    }
    
    public void method3639(final Class617 class617) {
        this.method3645().method7624().method8128(class617.method3040(), this, Class632::method3645, true);
        this.method3640(class617);
    }
    
    public void method3640(final Class617 field3618) {
        this.field3618 = field3618;
    }
    
    public void method3641() {
        this.field3621.method7626(this.field3619.method5290());
    }
    
    public Class2009 method3642() {
        return this.field3621.method7619();
    }
    
    public String method3643() {
        return this.field3621.method7617().getFormattedText();
    }
    
    public String method3644() {
        return this.field3621.method7616().getFormattedText();
    }
    
    public Class1922 method3645() {
        return this.field3621;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        final Class2009 method3642 = this.method3642();
        if (!method3642.method8043()) {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class565.method3293(n3 - 1, n2 - 1, n3 + n4 - 9, n2 + n5 + 1, -8978432);
        }
        this.method3641();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class565.method3188(n3, n2, 0.0f, 0.0f, 32, 32, 32, 32);
        String s = this.method3644();
        String s2 = this.method3643();
        Label_0059: {
            if (this.method3646()) {
                if (this.field3619.field4648.field23429 || b) {
                    this.field3619.method5290().method5849(Class615.method3591());
                    Class565.method3293(n3, n2, n3 + 32, n2 + 32, -1601138544);
                    Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                    final int n9 = n6 - n3;
                    final int n10 = n7 - n2;
                    if (!method3642.method8043()) {
                        s = Class615.method3592().method8461();
                        s2 = method3642.method8045().getFormattedText();
                    }
                    if (!this.method3647()) {
                        if (this.method3648()) {
                            if (n9 >= 16) {
                                Class565.method3188(n3, n2, 32.0f, 0.0f, 32, 32, 256, 256);
                            }
                            else {
                                Class565.method3188(n3, n2, 32.0f, 32.0f, 32, 32, 256, 256);
                            }
                        }
                        Label_0255: {
                            if (this.method3649()) {
                                if (n9 < 32) {
                                    if (n9 > 16) {
                                        if (n10 < 16) {
                                            Class565.method3188(n3, n2, 96.0f, 32.0f, 32, 32, 256, 256);
                                            break Label_0255;
                                        }
                                    }
                                }
                                Class565.method3188(n3, n2, 96.0f, 0.0f, 32, 32, 256, 256);
                            }
                        }
                        if (this.method3650()) {
                            if (n9 < 32) {
                                if (n9 > 16) {
                                    if (n10 > 16) {
                                        Class565.method3188(n3, n2, 64.0f, 32.0f, 32, 32, 256, 256);
                                        break Label_0059;
                                    }
                                }
                            }
                            Class565.method3188(n3, n2, 64.0f, 0.0f, 32, 32, 256, 256);
                        }
                    }
                    else if (n9 >= 32) {
                        Class565.method3188(n3, n2, 0.0f, 0.0f, 32, 32, 256, 256);
                    }
                    else {
                        Class565.method3188(n3, n2, 0.0f, 32.0f, 32, 32, 256, 256);
                    }
                }
            }
        }
        if (this.field3619.field4643.method6617(s) > 157) {
            s = this.field3619.field4643.method6619(s, 157 - this.field3619.field4643.method6617("...")) + "...";
        }
        this.field3619.field4643.method6609(s, (float)(n3 + 32 + 2), (float)(n2 + 1), 16777215);
        final List<String> method3643 = this.field3619.field4643.method6626(s2, 157);
        for (int n11 = 0; n11 < 2 && n11 < method3643.size(); ++n11) {
            this.field3619.field4643.method6609((String)method3643.get(n11), (float)(n3 + 32 + 2), (float)(n2 + 12 + 10 * n11), 8421504);
        }
    }
    
    public boolean method3646() {
        return !this.field3621.method7623() || !this.field3621.method7622();
    }
    
    public boolean method3647() {
        return !this.field3620.method3926(this);
    }
    
    public boolean method3648() {
        return this.field3620.method3926(this) && !this.field3621.method7622();
    }
    
    public boolean method3649() {
        final List<Class632> method3040 = this.field3618.method3040();
        final int index = method3040.indexOf(this);
        return index > 0 && !((Class632)method3040.get(index - 1)).field3621.method7623();
    }
    
    public boolean method3650() {
        final List<Class632> method3040 = this.field3618.method3040();
        final int index = method3040.indexOf(this);
        if (index >= 0) {
            if (index < method3040.size() - 1) {
                if (!((Class632)method3040.get(index + 1)).field3621.method7623()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        final double n4 = n - this.field3618.method3558();
        final double n5 = n2 - this.field3618.method3559(this.field3618.method3040().indexOf(this));
        if (this.method3646()) {
            if (n4 <= 32.0) {
                if (this.method3647()) {
                    this.method3651().method3927();
                    final Class2009 method3642 = this.method3642();
                    if (!method3642.method8043()) {
                        this.field3619.method5244(new Class546(b -> {
                            this.field3619.method5244(this.method3651());
                            if (b) {
                                this.method3651().method3924(this);
                            }
                        }, Class615.method3593(), method3642.method8046()));
                    }
                    else {
                        this.method3651().method3924(this);
                    }
                    return true;
                }
                if (n4 < 16.0 && this.method3648()) {
                    this.method3651().method3925(this);
                    return true;
                }
                if (n4 > 16.0) {
                    if (n5 < 16.0) {
                        if (this.method3649()) {
                            final List<Class632> method3643 = this.field3618.method3040();
                            final int index = method3643.indexOf(this);
                            method3643.remove(index);
                            method3643.add(index - 1, this);
                            this.method3651().method3927();
                            return true;
                        }
                    }
                }
                if (n4 > 16.0) {
                    if (n5 > 16.0) {
                        if (this.method3650()) {
                            final List<Class632> method3644 = this.field3618.method3040();
                            final int index2 = method3644.indexOf(this);
                            method3644.remove(index2);
                            method3644.add(index2 + 1, this);
                            this.method3651().method3927();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public Class711 method3651() {
        return this.field3620;
    }
}
