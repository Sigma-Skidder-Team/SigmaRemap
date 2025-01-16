// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class898 extends Thread
{
    public final /* synthetic */ Class5071 field4845;
    
    public Class898(final Class5071 field4845, final String name) {
        this.field4845 = field4845;
        super(name);
    }
    
    @Override
    public void run() {
        RealmsClient.func_224911_a();
        try {
            Realms.method25361(() -> {
                final RealmsClient class2331;
                final Object field28673 = class2331.method35459(Class5071.method15636(this.field4845).field28675).field28673;
                Class5071.method15638(this.field4845, list);
                Class5071.method15639(this.field4845, Class5071.method15640(this.field4845).isEmpty());
                Class5071.method15641(this.field4845).method15513();
                Class5071.method15640(this.field4845).iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    Class5071.method15641(this.field4845).method15539(iterator.next());
                }
                Class5071.method15642(this.field4845);
            });
        }
        catch (final RealmsServiceException class2330) {
            Class5071.method15637().error("Couldn't request backups", (Throwable)class2330);
        }
    }
}
