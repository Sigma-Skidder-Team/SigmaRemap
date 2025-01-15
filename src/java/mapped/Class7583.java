// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.Spliterators;

public class Class7583 extends AbstractSpliterator<Class7702>
{
    private static String[] field30080;
    public boolean field30081;
    public final /* synthetic */ Class399 field30082;
    public final /* synthetic */ Class8243 field30083;
    public final /* synthetic */ Class385 field30084;
    public final /* synthetic */ Class7543 field30085;
    public final /* synthetic */ Class7702 field30086;
    public final /* synthetic */ Class1853 field30087;
    
    public Class7583(final Class1853 field30087, final long est, final int additionalCharacteristics, final Class399 field30088, final Class8243 field30089, final Class385 field30090, final Class7543 field30091, final Class7702 field30092) {
        this.field30087 = field30087;
        this.field30082 = field30088;
        this.field30083 = field30089;
        this.field30084 = field30090;
        this.field30085 = field30091;
        this.field30086 = field30092;
        super(est, additionalCharacteristics);
        this.field30081 = (this.field30082 == null);
    }
    
    @Override
    public boolean tryAdvance(final Consumer<? super Class7702> consumer) {
        if (!this.field30081) {
            this.field30081 = true;
            final Class7702 method34783 = this.field30087.method6787().method34783();
            final boolean method34784 = Class7698.method24496(method34783, Class7698.method24489(this.field30082.method1886().method18511(1.0E-7)), Class9306.field39924);
            final boolean method34785 = Class7698.method24496(method34783, Class7698.method24489(this.field30082.method1886().method18496(1.0E-7)), Class9306.field39924);
            if (!method34784) {
                if (method34785) {
                    consumer.accept(method34783);
                    return true;
                }
            }
        }
        while (this.field30083.method27301()) {
            final int method34786 = this.field30083.method27302();
            final int method34787 = this.field30083.method27303();
            final int method34788 = this.field30083.method27304();
            final int method34789 = this.field30083.method27305();
            if (method34789 == 3) {
                continue;
            }
            final Class1855 method34790 = this.field30087.method6736(method34786 >> 4, method34788 >> 4);
            if (method34790 == null) {
                continue;
            }
            this.field30084.method1284(method34786, method34787, method34788);
            final Class7096 method34791 = method34790.method6701(this.field30084);
            if (method34789 == 1 && !method34791.method21702()) {
                continue;
            }
            if (method34789 == 2 && method34791.method21696() != Class7521.field29264) {
                continue;
            }
            Class7702 class7702 = method34791.method21728(this.field30087, this.field30084, this.field30085);
            if (this.field30082 instanceof Class512) {
                final Class5753 class7703 = new Class5753(this.field30084, class7702);
                Class9463.method35173().method35188().method21097(class7703);
                class7702 = class7703.method17065();
                if (class7703.method16962()) {
                    return false;
                }
            }
            final Class7702 method34792 = class7702.method24541(method34786, method34787, method34788);
            if (!Class7698.method24496(this.field30086, method34792, Class9306.field39924)) {
                continue;
            }
            consumer.accept(method34792);
            return true;
        }
        return false;
    }
}
