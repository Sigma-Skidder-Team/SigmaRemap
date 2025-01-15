// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.Spliterators;

public final class Class7584 extends AbstractSpliterator<Class7859>
{
    private static String[] field30088;
    private Class7859 field30089;
    public final /* synthetic */ Class7859 field30090;
    public final /* synthetic */ Class7859 field30091;
    public final /* synthetic */ int field30092;
    public final /* synthetic */ int field30093;
    
    public Class7584(final long est, final int additionalCharacteristics, final Class7859 field30090, final Class7859 field30091, final int field30092, final int field30093) {
        this.field30090 = field30090;
        this.field30091 = field30091;
        this.field30092 = field30092;
        this.field30093 = field30093;
        super(est, additionalCharacteristics);
    }
    
    @Override
    public boolean tryAdvance(final Consumer<? super Class7859> consumer) {
        if (this.field30089 != null) {
            final int field32290 = this.field30089.field32290;
            final int field32291 = this.field30089.field32291;
            if (field32290 != this.field30091.field32290) {
                this.field30089 = new Class7859(field32290 + this.field30093, field32291);
            }
            else {
                if (field32291 == this.field30091.field32291) {
                    return false;
                }
                this.field30089 = new Class7859(this.field30090.field32290, field32291 + this.field30092);
            }
        }
        else {
            this.field30089 = this.field30090;
        }
        consumer.accept(this.field30089);
        return true;
    }
}
