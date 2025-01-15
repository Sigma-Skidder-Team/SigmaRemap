// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class696 extends Class527
{
    private final Class539 field3826;
    private Class7067 field3827;
    private String field3828;
    private String field3829;
    private Class618 field3830;
    private Class654 field3831;
    
    public Class696(final Class539 field3826, final Class51 class51) {
        super(new Class2259("createWorld.customize.flat.title", new Object[0]));
        this.field3827 = Class7067.method21599();
        this.field3826 = field3826;
        this.method3886(class51);
    }
    
    public String method3883() {
        return this.field3827.toString();
    }
    
    public Class51 method3884() {
        return (Class51)this.field3827.method21594((com.mojang.datafixers.types.DynamicOps<Object>)Class8453.field34721).getValue();
    }
    
    public void method3885(final String s) {
        this.field3827 = Class7067.method21596(s);
    }
    
    public void method3886(final Class51 class51) {
        this.field3827 = Class7067.method21595((Dynamic<?>)new Dynamic((DynamicOps)Class8453.field34721, (Object)class51));
    }
    
    @Override
    public void method2969() {
        this.field3828 = Class8822.method30773("createWorld.customize.flat.tile", new Object[0]);
        this.field3829 = Class8822.method30773("createWorld.customize.flat.height", new Object[0]);
        this.field3830 = new Class618(this);
        this.field3149.add(this.field3830);
        this.field3831 = this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 - 52, 150, 20, Class8822.method30773("createWorld.customize.flat.removeLayer", new Object[0]), class654 -> {
            if (this.method3888()) {
                final List<Class9127> method21590 = this.field3827.method21590();
                final int index = this.field3830.method3040().indexOf(((Class604<Object>)this.field3830).method3530());
                method21590.remove(method21590.size() - index - 1);
                this.field3830.method3594(method21590.isEmpty() ? null : this.field3830.method3040().get(Math.min(index, method21590.size() - 1)));
                this.field3827.method21591();
                this.method3887();
            }
        }));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 - 52, 150, 20, Class8822.method30773("createWorld.customize.presets", new Object[0]), class654 -> {
            this.field3150.method5244(new Class561(this));
            this.field3827.method21591();
            this.method3887();
        }));
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 - 28, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> {
            this.field3826.field3231 = this.method3884();
            this.field3150.method5244(this.field3826);
            this.field3827.method21591();
            this.method3887();
        }));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 - 28, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> {
            this.field3150.method5244(this.field3826);
            this.field3827.method21591();
            this.method3887();
        }));
        this.field3827.method21591();
        this.method3887();
    }
    
    public void method3887() {
        this.field3831.field3431 = this.method3888();
        this.field3830.method3595();
    }
    
    private boolean method3888() {
        return this.field3830.method3530() != null;
    }
    
    @Override
    public void method3028() {
        this.field3150.method5244(this.field3826);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.field3830.method2975(n, n2, n3);
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 8, 16777215);
        final int n4 = this.field3152 / 2 - 92 - 16;
        this.method3297(this.field3156, this.field3828, n4, 32, 16777215);
        this.method3297(this.field3156, this.field3829, n4 + 2 + 213 - this.field3156.method6617(this.field3829), 32, 16777215);
        super.method2975(n, n2, n3);
    }
}
