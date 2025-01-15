// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

public class Class1606 implements Runnable
{
    private static String[] field8973;
    private ArrayList<Class957> field8974;
    public final /* synthetic */ Class960 field8975;
    
    public Class1606(final Class960 field8975) {
        this.field8975 = field8975;
        this.field8974 = new ArrayList<Class957>();
    }
    
    @Override
    public void run() {
        this.field8974.clear();
        try {
            this.field8974.addAll(this.field8975.method5462());
            final long n = (long)(System.nanoTime() - Class960.method5547(this.field8975) * 1.5);
            final Iterator<Class957> iterator = this.field8974.iterator();
            while (iterator.hasNext()) {
                Class960.method5548(this.field8975, iterator.next(), n);
            }
        }
        catch (final Exception ex) {}
        this.field8974.clear();
    }
}
