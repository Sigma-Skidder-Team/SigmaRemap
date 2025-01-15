// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class708 extends Class703
{
    public Class708(final Class527 class527, final Class5760 class528) {
        super(class527, class528, new Class2259("options.skinCustomisation.title", new Object[0]));
    }
    
    @Override
    public void method2969() {
        int n = 0;
        for (final Class189 class189 : Class189.values()) {
            this.method3029(new Class654(this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 + 24 * (n >> 1), 150, 20, this.method3915(class189), class190 -> {
                this.field3869.method17127(class189);
                class190.method3367(this.method3915(class189));
            }));
            ++n;
        }
        this.method3029(new Class657(this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 + 24 * (n >> 1), 150, 20, Class6469.field25725, Class6469.field25725.method19486(this.field3869), class654 -> {
            Class6469.field25725.method19485(this.field3869, 1);
            this.field3869.method17121();
            class654.method3367(Class6469.field25725.method19486(this.field3869));
            this.field3869.method17124();
        }));
        if (++n % 2 == 1) {
            ++n;
        }
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 6 + 24 * (n >> 1), 200, 20, Class8822.method30773("of.options.skinCustomisation.ofCape", new Object[0]), class654 -> this.field3150.method5244(new Class702(this))));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 6 + 24 * (n + 2 >> 1), 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(this.field3868)));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 20, 16777215);
        super.method2975(n, n2, n3);
    }
    
    private String method3915(final Class189 class189) {
        String str;
        if (!this.field3869.method17125().contains(class189)) {
            str = Class8822.method30773("options.off", new Object[0]);
        }
        else {
            str = Class8822.method30773("options.on", new Object[0]);
        }
        return class189.method830().method8461() + ": " + str;
    }
}
