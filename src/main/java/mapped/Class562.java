// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class562 extends Class527
{
    private static final Class1932 field3350;
    
    public Class562() {
        super(new Class2259("demo.help.title", new Object[0]));
    }
    
    @Override
    public void method2969() {
        this.method3029(new Class654(this.field3152 / 2 - 116, this.field3153 / 2 + 62 - 16, 114, 20, Class8822.method30773("demo.help.buy", new Object[0]), class654 -> {
            class654.field3431 = false;
            Class8349.method27845().method980("http://www.minecraft.net/store?source=demo");
        }));
        this.method3029(new Class654(this.field3152 / 2 + 2, this.field3153 / 2 + 62 - 16, 114, 20, Class8822.method30773("demo.help.later", new Object[0]), class654 -> {
            this.field3150.method5244(null);
            this.field3150.field4650.method26963();
        }));
    }
    
    @Override
    public void method3041() {
        super.method3041();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class562.field3350);
        this.method3186((this.field3152 - 248) / 2, (this.field3153 - 166) / 2, 0, 0, 248, 166);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        final int n4 = (this.field3152 - 248) / 2 + 10;
        final int n5 = (this.field3153 - 166) / 2 + 8;
        this.field3156.method6610(this.field3148.method8461(), (float)n4, (float)n5, 2039583);
        final int n6 = n5 + 12;
        final Class5760 field4648 = this.field3150.field4648;
        this.field3156.method6610(Class8822.method30773("demo.help.movementShort", field4648.field23435.method1068(), field4648.field23436.method1068(), field4648.field23437.method1068(), field4648.field23438.method1068()), (float)n4, (float)n6, 5197647);
        this.field3156.method6610(Class8822.method30773("demo.help.movementMouse", new Object[0]), (float)n4, (float)(n6 + 12), 5197647);
        this.field3156.method6610(Class8822.method30773("demo.help.jump", field4648.field23439.method1068()), (float)n4, (float)(n6 + 24), 5197647);
        this.field3156.method6610(Class8822.method30773("demo.help.inventory", field4648.field23442.method1068()), (float)n4, (float)(n6 + 36), 5197647);
        this.field3156.method6622(Class8822.method30773("demo.help.fullWrapped", new Object[0]), n4, n6 + 68, 218, 2039583);
        super.method2975(n, n2, n3);
    }
    
    static {
        field3350 = new Class1932("textures/gui/demo_background.png");
    }
}
