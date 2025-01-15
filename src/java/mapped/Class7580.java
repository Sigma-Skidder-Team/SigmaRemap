// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.Spliterators;

public final class Class7580 extends AbstractSpliterator<Class354>
{
    private static String[] field30060;
    public final Class8243 field30061;
    public final Class385 field30062;
    public final /* synthetic */ int field30063;
    public final /* synthetic */ int field30064;
    public final /* synthetic */ int field30065;
    public final /* synthetic */ int field30066;
    public final /* synthetic */ int field30067;
    public final /* synthetic */ int field30068;
    
    public Class7580(final long est, final int additionalCharacteristics, final int field30063, final int field30064, final int field30065, final int field30066, final int field30067, final int field30068) {
        this.field30063 = field30063;
        this.field30064 = field30064;
        this.field30065 = field30065;
        this.field30066 = field30066;
        this.field30067 = field30067;
        this.field30068 = field30068;
        super(est, additionalCharacteristics);
        this.field30061 = new Class8243(this.field30063, this.field30064, this.field30065, this.field30066, this.field30067, this.field30068);
        this.field30062 = new Class385();
    }
    
    @Override
    public boolean tryAdvance(final Consumer<? super Class354> consumer) {
        if (!this.field30061.method27301()) {
            return false;
        }
        consumer.accept(this.field30062.method1284(this.field30061.method27302(), this.field30061.method27303(), this.field30061.method27304()));
        return true;
    }
}
