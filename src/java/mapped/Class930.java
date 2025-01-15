// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class Class930 extends Thread
{
    public final /* synthetic */ Class5073 field4918;
    
    public Class930(final Class5073 field4918, final String name) {
        this.field4918 = field4918;
        super(name);
    }
    
    @Override
    public void run() {
        Class9513.method35444();
        try {
            Class7847.method25361(() -> {
                final Class9513 class2331;
                final Object o = class2331.method35474().field28597.stream().map(p0 -> {}).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
                Class5073.method15664(this.field4918).method15536(list);
            });
        }
        catch (final Class2330 class2330) {
            Class5073.method15662().error("Couldn't list invites");
        }
        finally {
            Class5073.method15663(this.field4918, true);
        }
    }
}
