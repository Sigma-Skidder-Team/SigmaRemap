// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;

public class Class8002
{
    private static String[] field32956;
    private int field32957;
    private float field32958;
    private boolean field32959;
    private boolean field32960;
    private boolean field32961;
    private final List<Pair<Class1948, Float>> field32962;
    
    public Class8002() {
        this.field32962 = Lists.newArrayList();
    }
    
    public Class8002 method26184(final int field32957) {
        this.field32957 = field32957;
        return this;
    }
    
    public Class8002 method26185(final float field32958) {
        this.field32958 = field32958;
        return this;
    }
    
    public Class8002 method26186() {
        this.field32959 = true;
        return this;
    }
    
    public Class8002 method26187() {
        this.field32960 = true;
        return this;
    }
    
    public Class8002 method26188() {
        this.field32961 = true;
        return this;
    }
    
    public Class8002 method26189(final Class1948 class1948, final float f) {
        this.field32962.add((Pair<Class1948, Float>)Pair.of((Object)class1948, (Object)f));
        return this;
    }
    
    public Class9082 method26190() {
        return new Class9082(this.field32957, this.field32958, this.field32959, this.field32960, this.field32961, this.field32962, null);
    }
}
