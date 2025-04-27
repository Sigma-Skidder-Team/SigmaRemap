// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class666 extends Class662
{
    private final Class286 field3699;
    
    public Class666(final Minecraft class869, final int n, final int n2, final Class286 field3699, final int n3) {
        super(class869.gameSettings, n, n2, n3, 20, class869.gameSettings.method17122(field3699));
        this.field3699 = field3699;
        this.method3711();
    }
    
    @Override
    public void method3711() {
        this.method3367(Class8822.method30773("soundCategory." + this.field3699.method935()) + ": " + (((float)this.field3694 != this.method3350(false)) ? ((int)((float)this.field3694 * 100.0f) + "%") : Class8822.method30773("options.off")));
    }
    
    @Override
    public void method3710() {
        this.field3693.method17123(this.field3699, (float)this.field3694);
        this.field3693.method17121();
    }
}
