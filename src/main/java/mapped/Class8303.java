// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class8303 implements Class8301
{
    public final /* synthetic */ List field34123;
    public final /* synthetic */ Class8878 field34124;
    public final /* synthetic */ Class394 field34125;
    
    public Class8303(final Class394 field34125, final List field34126, final Class8878 field34127) {
        this.field34125 = field34125;
        this.field34123 = field34126;
        this.field34124 = field34127;
    }
    
    @Override
    public <T extends Class8117<T>> void method27590(final Class9424<T> class9424, final Class8455<T> class9425) {
        this.field34123.add(String.format("%s=%s\n", class9424.method35022(), this.field34124.method31211(class9424).toString()));
    }
}
