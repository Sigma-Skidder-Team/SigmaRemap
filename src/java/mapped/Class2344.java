// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import jaco.mp3.resources.DecoderException;

public class Class2344 implements Class2343
{
    private static String[] field14114;
    private static final Class2283 field14115;
    private Class7037 field14116;
    private Class8560 field14117;
    private Class8560 field14118;
    private Class8405 field14119;
    private Class8407 field14120;
    private Class8406 field14121;
    private int field14122;
    private int field14123;
    private Class8408 field14124;
    private Class2283 field14125;
    private boolean field14126;
    
    public Class2344() {
        this(null);
    }
    
    public Class2344(Class2283 field14115) {
        this.field14124 = new Class8408();
        if (field14115 == null) {
            field14115 = Class2344.field14115;
        }
        this.field14125 = field14115;
        final Class8408 method8831 = this.field14125.method8831();
        if (method8831 != null) {
            this.field14124.method28057(method8831);
        }
    }
    
    public static Class2283 method9478() {
        return (Class2283)Class2344.field14115.clone();
    }
    
    public void method9479(Class8408 field34523) {
        if (field34523 == null) {
            field34523 = Class8408.field34523;
        }
        this.field14124.method28057(field34523);
        final float[] method28063 = this.field14124.method28063();
        if (this.field14117 != null) {
            this.field14117.method28752(method28063);
        }
        if (this.field14118 != null) {
            this.field14118.method28752(method28063);
        }
    }
    
    public Class7037 method9480(final Class8664 class8664, final Class2341 class8665) throws DecoderException {
        if (!this.field14126) {
            this.method9488(class8664);
        }
        final int method29638 = class8664.method29638();
        this.field14116.method21527();
        this.method9487(class8664, class8665, method29638).method28031();
        this.field14116.method21525(1);
        return this.field14116;
    }
    
    public void method9481(final Class7037 field14116) {
        this.field14116 = field14116;
    }
    
    public int method9482() {
        return this.field14122;
    }
    
    public int method9483() {
        return this.field14123;
    }
    
    public int method9484() {
        return 2304;
    }
    
    public Class2345 method9485(final int n) {
        return new Class2345(n, null);
    }
    
    public Class2345 method9486(final int n, final Throwable t) {
        return new Class2345(n, t);
    }
    
    public Class8404 method9487(final Class8664 class8664, final Class2341 class8665, final int n) throws DecoderException {
        Class8404 class8666 = null;
        switch (n) {
            case 3: {
                if (this.field14119 == null) {
                    this.field14119 = new Class8405(class8665, class8664, this.field14117, this.field14118, this.field14116, 0);
                }
                class8666 = this.field14119;
                break;
            }
            case 2: {
                if (this.field14120 == null) {
                    (this.field14120 = new Class8407()).method28049(class8665, class8664, this.field14117, this.field14118, this.field14116, 0);
                }
                class8666 = this.field14120;
                break;
            }
            case 1: {
                if (this.field14121 == null) {
                    (this.field14121 = new Class8406()).method28049(class8665, class8664, this.field14117, this.field14118, this.field14116, 0);
                }
                class8666 = this.field14121;
                break;
            }
        }
        if (class8666 == null) {
            throw this.method9486(513, null);
        }
        return class8666;
    }
    
    private void method9488(final Class8664 class8664) throws DecoderException {
        final float n = 32700.0f;
        final int method29642 = class8664.method29642();
        class8664.method29638();
        final int field14123 = (method29642 != 3) ? 2 : 1;
        if (this.field14116 == null) {
            this.field14116 = new Class7036(class8664.method29641(), field14123);
        }
        final float[] method29643 = this.field14124.method28063();
        this.field14117 = new Class8560(0, n, method29643);
        if (field14123 == 2) {
            this.field14118 = new Class8560(1, n, method29643);
        }
        this.field14123 = field14123;
        this.field14122 = class8664.method29641();
        this.field14126 = true;
    }
    
    static {
        field14115 = new Class2283();
    }
}
