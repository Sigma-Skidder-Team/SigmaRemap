// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1357 implements Runnable
{
    private static String[] field7437;
    public final /* synthetic */ long field7438;
    public final /* synthetic */ long field7439;
    public final /* synthetic */ long field7440;
    public final /* synthetic */ Class22 field7441;
    public final /* synthetic */ long field7442;
    public final /* synthetic */ Class22 field7443;
    public final /* synthetic */ Class7978 field7444;
    
    public Class1357(final Class7978 field7444, final long field7445, final long field7446, final long field7447, final Class22 field7448, final long field7449, final Class22 field7450) {
        this.field7444 = field7444;
        this.field7438 = field7445;
        this.field7439 = field7446;
        this.field7440 = field7447;
        this.field7441 = field7448;
        this.field7442 = field7449;
        this.field7443 = field7450;
    }
    
    @Override
    public void run() {
        if (this.field7438 <= 0L) {
            for (long field7439 = this.field7439; field7439 < this.field7440; ++field7439) {
                final long n = 2L * field7439;
                final long n2 = n + 1L;
                this.field7441.method169(this.field7442 + n, Class7978.method26006(this.field7444).method135(n) * this.field7443.method135(n) + Class7978.method26006(this.field7444).method135(n2) * this.field7443.method135(n2));
                this.field7441.method169(this.field7442 + n2, -Class7978.method26006(this.field7444).method135(n2) * this.field7443.method135(n) + Class7978.method26006(this.field7444).method135(n) * this.field7443.method135(n2));
            }
        }
        else {
            for (long field7440 = this.field7439; field7440 < this.field7440; ++field7440) {
                final long n3 = 2L * field7440;
                final long n4 = n3 + 1L;
                this.field7441.method169(this.field7442 + n3, Class7978.method26006(this.field7444).method135(n3) * this.field7443.method135(n3) - Class7978.method26006(this.field7444).method135(n4) * this.field7443.method135(n4));
                this.field7441.method169(this.field7442 + n4, Class7978.method26006(this.field7444).method135(n4) * this.field7443.method135(n3) + Class7978.method26006(this.field7444).method135(n3) * this.field7443.method135(n4));
            }
        }
    }
}
