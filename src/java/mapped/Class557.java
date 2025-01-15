// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class557 extends Class527 implements Class558
{
    private static final Class1932 field3336;
    private static final Class1932 field3337;
    private final Class8840 field3338;
    private final Map<Class8863, Class572> field3339;
    private Class572 field3340;
    private boolean field3341;
    
    public Class557(final Class8840 field3338) {
        super(Class7895.field32402);
        this.field3339 = Maps.newLinkedHashMap();
        this.field3338 = field3338;
    }
    
    @Override
    public void method2969() {
        this.field3339.clear();
        this.field3340 = null;
        this.field3338.method30870(this);
        if (this.field3340 == null && !this.field3339.isEmpty()) {
            this.field3338.method30869(this.field3339.values().iterator().next().method3337(), true);
        }
        else {
            this.field3338.method30869((this.field3340 != null) ? this.field3340.method3337() : null, true);
        }
    }
    
    @Override
    public void method2971() {
        this.field3338.method30870(null);
        final Class5799 method5269 = this.field3150.method5269();
        if (method5269 != null) {
            method5269.method17292(Class4334.method13014());
        }
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            final int n4 = (this.field3152 - 252) / 2;
            final int n5 = (this.field3153 - 140) / 2;
            for (final Class572 class572 : this.field3339.values()) {
                if (!class572.method3343(n4, n5, n, n2)) {
                    continue;
                }
                this.field3338.method30869(class572.method3337(), true);
                break;
            }
        }
        return super.method2982(n, n2, n3);
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (!this.field3150.field4648.field23456.method1066(n, n2)) {
            return super.method2972(n, n2, n3);
        }
        this.field3150.method5244(null);
        this.field3150.field4650.method26963();
        return true;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        final int n4 = (this.field3152 - 252) / 2;
        final int n5 = (this.field3153 - 140) / 2;
        this.method3041();
        this.method3260(n, n2, n4, n5);
        this.method3261(n4, n5);
        this.method3262(n, n2, n4, n5);
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (n3 == 0) {
            if (this.field3341) {
                if (this.field3340 != null) {
                    this.field3340.method3345(n4, n5);
                }
            }
            else {
                this.field3341 = true;
            }
            return true;
        }
        return this.field3341 = false;
    }
    
    private void method3260(final int n, final int n2, final int n3, final int n4) {
        final Class572 field3340 = this.field3340;
        if (field3340 != null) {
            Class8726.method30059();
            Class8726.method30065((float)(n3 + 9), (float)(n4 + 18), 0.0f);
            field3340.method3341();
            Class8726.method30060();
            Class8726.method30009(515);
            Class8726.method30007();
        }
        else {
            Class565.method3293(n3 + 9, n4 + 18, n3 + 9 + 234, n4 + 18 + 113, -16777216);
            final String method30773 = Class8822.method30773("advancements.empty", new Object[0]);
            this.field3156.method6610(method30773, (float)(n3 + 9 + 117 - this.field3156.method6617(method30773) / 2), (float)(n4 + 18 + 56 - 4), -1);
            this.field3156.method6610(":(", (float)(n3 + 9 + 117 - this.field3156.method6617(":(") / 2), (float)(n4 + 18 + 113 - 9), -1);
        }
    }
    
    public void method3261(final int n, final int n2) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30011();
        this.field3150.method5290().method5849(Class557.field3336);
        this.method3186(n, n2, 0, 0, 252, 140);
        if (this.field3339.size() > 1) {
            this.field3150.method5290().method5849(Class557.field3337);
            for (final Class572 class572 : this.field3339.values()) {
                class572.method3339(n, n2, class572 == this.field3340);
            }
            Class8726.method30046();
            Class8726.method30117();
            final Iterator<Class572> iterator2 = this.field3339.values().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().method3340(n, n2, this.field3151);
            }
            Class8726.method30012();
        }
        this.field3156.method6610(Class8822.method30773("gui.advancements", new Object[0]), (float)(n + 8), (float)(n2 + 6), 4210752);
    }
    
    private void method3262(final int n, final int n2, final int n3, final int n4) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.field3340 != null) {
            Class8726.method30059();
            Class8726.method30008();
            Class8726.method30065((float)(n3 + 9), (float)(n4 + 18), 400.0f);
            this.field3340.method3342(n - n3 - 9, n2 - n4 - 18, n3, n4);
            Class8726.method30007();
            Class8726.method30060();
        }
        if (this.field3339.size() > 1) {
            for (final Class572 class572 : this.field3339.values()) {
                if (!class572.method3343(n3, n4, n, n2)) {
                    continue;
                }
                this.method3031(class572.method3338(), n, n2);
            }
        }
    }
    
    @Override
    public void method3263(final Class8863 class8863) {
        final Class572 method3344 = Class572.method3344(this.field3150, this, this.field3339.size(), class8863);
        if (method3344 != null) {
            this.field3339.put(class8863, method3344);
        }
    }
    
    @Override
    public void method3264(final Class8863 class8863) {
    }
    
    @Override
    public void method3265(final Class8863 class8863) {
        final Class572 method3271 = this.method3271(class8863);
        if (method3271 != null) {
            method3271.method3346(class8863);
        }
    }
    
    @Override
    public void method3266(final Class8863 class8863) {
    }
    
    @Override
    public void method3267(final Class8863 class8863, final Class348 class8864) {
        final Class683 method3270 = this.method3270(class8863);
        if (method3270 != null) {
            method3270.method3748(class8864);
        }
    }
    
    @Override
    public void method3268(final Class8863 class8863) {
        this.field3340 = this.field3339.get(class8863);
    }
    
    @Override
    public void method3269() {
        this.field3339.clear();
        this.field3340 = null;
    }
    
    @Nullable
    public Class683 method3270(final Class8863 class8863) {
        final Class572 method3271 = this.method3271(class8863);
        return (method3271 != null) ? method3271.method3348(class8863) : null;
    }
    
    @Nullable
    private Class572 method3271(Class8863 method31035) {
        while (method31035.method31035() != null) {
            method31035 = method31035.method31035();
        }
        return this.field3339.get(method31035);
    }
    
    static {
        field3336 = new Class1932("textures/gui/advancements/window.png");
        field3337 = new Class1932("textures/gui/advancements/tabs.png");
    }
}
