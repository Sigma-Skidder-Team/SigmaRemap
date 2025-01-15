// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.primitives.Doubles;
import java.util.concurrent.CompletableFuture;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Class1944 implements Comparable<Class1944>
{
    public final double field10596;
    public final AtomicBoolean field10597;
    public Map<Class354, Class6349> field10598;
    public final /* synthetic */ Class8974 field10599;
    
    public Class1944(final Class8974 class8974, final double n) {
        this(class8974, null, n);
    }
    
    public Class1944(final Class8974 field10599, final Class7859 class7859, final double field10600) {
        this.field10599 = field10599;
        this.field10597 = new AtomicBoolean(false);
        this.field10596 = field10600;
        if (class7859 != null) {
            this.field10598 = Class8758.method30317(Class869.method5277().field4683, class7859);
        }
        else {
            this.field10598 = Collections.emptyMap();
        }
    }
    
    public abstract CompletableFuture<Class2033> method7894(final Class9226 p0);
    
    public abstract void method7895();
    
    @Override
    public int compareTo(final Class1944 class1944) {
        return Doubles.compare(this.field10596, class1944.field10596);
    }
    
    public Class6349 method7896(final Class354 key) {
        return this.field10598.getOrDefault(key, Class6350.field25397);
    }
}
