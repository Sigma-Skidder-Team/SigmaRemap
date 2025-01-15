// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.base.Splitter;

public class Class544 extends Class527
{
    public final Class527 field3280;
    private String field3281;
    private Class654 field3282;
    private Class654 field3283;
    private Class654 field3284;
    private Class654 field3285;
    public Class576 field3286;
    private Class620 field3287;
    
    public Class544(final Class527 field3280) {
        super(new Class2259("selectWorld.title", new Object[0]));
        this.field3280 = field3280;
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        return super.method3012(n, n2, n3);
    }
    
    @Override
    public void method2992() {
        this.field3286.method3376();
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        (this.field3286 = new Class576(this.field3156, this.field3152 / 2 - 100, 22, 200, 20, this.field3286, Class8822.method30773("selectWorld.search", new Object[0]))).method3374(p0 -> this.field3287.method3608(() -> s, false));
        this.field3287 = new Class620(this, this.field3150, this.field3152, this.field3153, 48, this.field3153 - 64, 36, () -> this.field3286.method3378(), this.field3287);
        this.field3149.add(this.field3286);
        this.field3149.add(this.field3287);
        this.field3283 = this.method3029(new Class654(this.field3152 / 2 - 154, this.field3153 - 52, 150, 20, Class8822.method30773("selectWorld.select", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3669)));
        this.method3029(new Class654(this.field3152 / 2 + 4, this.field3153 - 52, 150, 20, Class8822.method30773("selectWorld.create", new Object[0]), class654 -> this.field3150.method5244(new Class539(this))));
        this.field3284 = this.method3029(new Class654(this.field3152 / 2 - 154, this.field3153 - 28, 72, 20, Class8822.method30773("selectWorld.edit", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3671)));
        this.field3282 = this.method3029(new Class654(this.field3152 / 2 - 76, this.field3153 - 28, 72, 20, Class8822.method30773("selectWorld.delete", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3670)));
        this.field3285 = this.method3029(new Class654(this.field3152 / 2 + 4, this.field3153 - 28, 72, 20, Class8822.method30773("selectWorld.recreate", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3672)));
        this.method3029(new Class654(this.field3152 / 2 + 82, this.field3153 - 28, 72, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3150.method5244(this.field3280)));
        this.method3173(false);
        this.method3476(this.field3286);
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        return super.method2972(n, n2, n3) || this.field3286.method2972(n, n2, n3);
    }
    
    @Override
    public void method3028() {
        this.field3150.method5244(this.field3280);
    }
    
    @Override
    public boolean method3004(final char c, final int n) {
        return this.field3286.method3004(c, n);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.field3281 = null;
        this.field3287.method2975(n, n2, n3);
        this.field3286.method2975(n, n2, n3);
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 8, 16777215);
        super.method2975(n, n2, n3);
        if (this.field3281 != null) {
            this.method3032(Lists.newArrayList(Splitter.on("\n").split((CharSequence)this.field3281)), n, n2);
        }
    }
    
    public void method3172(final String field3281) {
        this.field3281 = field3281;
    }
    
    public void method3173(final boolean b) {
        this.field3283.field3431 = b;
        this.field3282.field3431 = b;
        this.field3284.field3431 = b;
        this.field3285.field3431 = b;
    }
    
    @Override
    public void method2971() {
        if (this.field3287 != null) {
            this.field3287.method3040().forEach(Class641::close);
        }
    }
}
