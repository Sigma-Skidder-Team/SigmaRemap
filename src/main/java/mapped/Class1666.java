// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executor;
import java.io.IOException;

public abstract class Class1666
{
    public int field9435;
    public boolean field9436;
    public boolean field9437;
    public Class9025 field9438;
    private boolean field9439;
    private boolean field9440;
    
    public Class1666() {
        this.field9435 = -1;
    }
    
    public void method5868(final boolean field9436, final boolean field9437) {
        Class8726.method29989(Class8726::method29985);
        this.field9436 = field9436;
        this.field9437 = field9437;
        int n;
        int n2;
        if (!field9436) {
            final int method28838 = Class8571.method28838();
            n = (field9437 ? method28838 : 9728);
            n2 = 9728;
        }
        else {
            n = (field9437 ? 9987 : 9729);
            n2 = 9729;
        }
        Class8933.method31617(this.method5869());
        Class8933.method31613(3553, 10241, n);
        Class8933.method31613(3553, 10240, n2);
    }
    
    public int method5869() {
        Class8726.method29989(Class8726::method29985);
        if (this.field9435 == -1) {
            this.field9435 = Class8995.method32101();
        }
        return this.field9435;
    }
    
    public void method5870() {
        if (Class8726.method29984()) {
            if (this.field9435 != -1) {
                Class8990.method32044(this, this.field9435);
                Class8995.method32102(this.field9435);
                this.field9435 = -1;
            }
        }
        else {
            Class8726.method29991(() -> {
                Class8990.method32044(this, this.field9435);
                if (this.field9435 != -1) {
                    Class8995.method32102(this.field9435);
                    this.field9435 = -1;
                }
            });
        }
    }
    
    public abstract void method5871(final Class6582 p0) throws IOException;
    
    public void method5872() {
        if (Class8726.method29985()) {
            Class8933.method31617(this.method5869());
        }
        else {
            Class8726.method29991(() -> Class8933.method31617(this.method5869()));
        }
    }
    
    public void method5873(final Class1663 class1663, final Class6582 class1664, final Class1932 class1665, final Executor executor) {
        class1663.method5851(class1665, this);
    }
    
    public Class9025 method5874() {
        return Class8990.method32043(this);
    }
    
    public void method5875(final boolean b, final boolean b2) {
        this.field9439 = this.field9436;
        this.field9440 = this.field9437;
        this.method5868(b, b2);
    }
    
    public void method5876() {
        this.method5868(this.field9439, this.field9440);
    }
}
