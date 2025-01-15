// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.Spliterators;

public final class Class7581 extends AbstractSpliterator<Class353>
{
    private static String[] field30069;
    public final Class8243 field30070;
    public final /* synthetic */ int field30071;
    public final /* synthetic */ int field30072;
    public final /* synthetic */ int field30073;
    public final /* synthetic */ int field30074;
    public final /* synthetic */ int field30075;
    public final /* synthetic */ int field30076;
    
    public Class7581(final long est, final int additionalCharacteristics, final int field30071, final int field30072, final int field30073, final int field30074, final int field30075, final int field30076) {
        this.field30071 = field30071;
        this.field30072 = field30072;
        this.field30073 = field30073;
        this.field30074 = field30074;
        this.field30075 = field30075;
        this.field30076 = field30076;
        super(est, additionalCharacteristics);
        this.field30070 = new Class8243(this.field30071, this.field30072, this.field30073, this.field30074, this.field30075, this.field30076);
    }
    
    @Override
    public boolean tryAdvance(final Consumer<? super Class353> consumer) {
        if (!this.field30070.method27301()) {
            return false;
        }
        consumer.accept(new Class353(this.field30070.method27302(), this.field30070.method27303(), this.field30070.method27304(), null));
        return true;
    }
}
