// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class709 extends Class703
{
    public Class709(final Class527 class527, final Class5760 class528) {
        super(class527, class528, new Class2259("options.sounds.title", new Object[0]));
    }
    
    @Override
    public void method2969() {
        final int n = 0;
        this.method3029(new Class666(this.field3150, this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 - 12 + 24 * (n >> 1), Class286.field1578, 310));
        int n2 = n + 2;
        for (final Class286 class286 : Class286.values()) {
            if (class286 != Class286.field1578) {
                this.method3029(new Class666(this.field3150, this.field3152 / 2 - 155 + n2 % 2 * 160, this.field3153 / 6 - 12 + 24 * (n2 >> 1), class286, 150));
                ++n2;
            }
        }
        final int n3 = this.field3152 / 2 - 75;
        final int n4 = this.field3153 / 6 - 12;
        ++n2;
        this.method3029(new Class657(n3, n4 + 24 * (n2 >> 1), 150, 20, Class6469.field25742, Class6469.field25742.method19363(this.field3869), class654 -> {
            Class6469.field25742.method19359(this.field3150.field4648);
            class654.method3367(Class6469.field25742.method19363(this.field3150.field4648));
            this.field3150.field4648.method17121();
        }));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 6 + 168, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(this.field3868)));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 15, 16777215);
        super.method2975(n, n2, n3);
    }
}
