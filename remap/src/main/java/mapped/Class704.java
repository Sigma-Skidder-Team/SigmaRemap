// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class704 extends Class703
{
    private Class610 field3870;
    private final Class1661 field3871;
    private Class657 field3872;
    private Class654 field3873;
    
    public Class704(final Class527 class527, final Class5760 class528, final Class1661 field3871) {
        super(class527, class528, new Class2259("options.language", new Object[0]));
        this.field3871 = field3871;
    }
    
    @Override
    public void method2969() {
        this.field3870 = new Class610(this, this.field3150);
        this.field3149.add(this.field3870);
        this.field3872 = this.method3029(new Class657(this.field3152 / 2 - 155, this.field3153 - 38, 150, 20, Class6469.field25738, Class6469.field25738.method19363(this.field3869), class654 -> {
            Class6469.field25738.method19359(this.field3869);
            this.field3869.method17121();
            class654.method3367(Class6469.field25738.method19363(this.field3869));
            this.field3150.method5248();
        }));
        this.field3873 = this.method3029(new Class654(this.field3152 / 2 - 155 + 160, this.field3153 - 38, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> {
            final Class643 class655 = this.field3870.method3530();
            if (class655 != null) {
                if (!Class643.method3687(class655).getCode().equals(this.field3871.method5845().getCode())) {
                    this.field3871.method5844(Class643.method3687(class655));
                    this.field3869.field23476 = Class643.method3687(class655).getCode();
                    this.field3150.method5241();
                    this.field3156.method6625(this.field3871.method5843());
                    this.field3873.method3367(Class8822.method30773("gui.done", new Object[0]));
                    this.field3872.method3367(Class6469.field25738.method19363(this.field3869));
                    this.field3869.method17121();
                }
            }
            this.field3150.method5244(this.field3868);
        }));
        super.method2969();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.field3870.method2975(n, n2, n3);
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 16, 16777215);
        this.method3295(this.field3156, "(" + Class8822.method30773("options.languageWarning", new Object[0]) + ")", this.field3152 / 2, this.field3153 - 56, 8421504);
        super.method2975(n, n2, n3);
    }
}