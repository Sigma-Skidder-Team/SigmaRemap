// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public abstract class Class2780
{
    private final List<Class7803<Class2465, Class2448>> field15009;
    
    public Class2780() {
        this.field15009 = new ArrayList<Class7803<Class2465, Class2448>>();
        this.method9826();
    }
    
    public void method9827(final Class5260 class5260) {
        final Class2464 class5261 = new Class2464(class5260);
        this.method9830(class5261, (Class2448<Object>)class5261);
    }
    
    public void method9828(final Class5260 class5260, final Class5260 class5261) {
        this.method9830(new Class2464<Object>(class5260), new Class2464<Object>(class5261));
    }
    
    public <T1, T2> void method9829(final Class5260<T1> class5260, final Class2449<T1, T2> class5261) {
        this.method9830(new Class2464<Object>((Class5260<Object>)class5260), (Class2448<Object>)class5261);
    }
    
    public <T> void method9830(final Class2465<T> class2465, final Class2448<T> class2466) {
        this.field15009.add(new Class7803<Class2465, Class2448>(class2465, class2466));
    }
    
    public void method9831(final Class2437 class2437) {
        this.method9830(new Class2464<Object>((Class5260<Object>)Class5260.field22317), class2437);
    }
    
    public void method9832(final Class2466 class2466) {
        this.method9830(new Class2464<Object>((Class5260<Object>)Class5260.field22317), class2466);
    }
    
    public abstract void method9826();
    
    public void method9833(final Class8699 class8699) throws Exception {
        try {
            for (final Class7803 class8700 : this.field15009) {
                ((Class2448<Object>)class8700.method25204()).method9789(class8699, ((Class2465<Object>)class8700.method25203()).method9801(class8699));
            }
        }
        catch (final Class2328 class8701) {
            class8701.method9450(this.getClass());
            throw class8701;
        }
    }
}
