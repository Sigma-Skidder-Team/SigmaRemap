// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6648 extends Class6635
{
    private Map<Class7803<Integer, Integer>, Map<Class8322, Class74>> field26282;
    private boolean field26283;
    
    public Class6648(final Class6108 class6108) {
        super(class6108);
        this.field26282 = new ConcurrentHashMap<Class7803<Integer, Integer>, Map<Class8322, Class74>>();
        this.field26283 = false;
    }
    
    public void method20196(final int i, final int j) {
        this.field26282.remove(new Class7803(i, j));
    }
    
    public void method20197(final Class8322 class8322, final Class74 class8323) {
        final Class7803<Integer, Integer> method20198 = this.method20198(class8322);
        if (!this.field26282.containsKey(method20198)) {
            this.field26282.put(method20198, new ConcurrentHashMap<Class8322, Class74>());
        }
        final Map map = this.field26282.get(method20198);
        if (map.containsKey(class8322) && ((Class74)map.get(class8322)).equals(class8323)) {
            return;
        }
        map.put(class8322, class8323);
    }
    
    private Class7803<Integer, Integer> method20198(final Class8322 class8322) {
        return new Class7803<Integer, Integer>((int)Math.floor((double)(class8322.method27704() / 16L)), (int)Math.floor((double)(class8322.method27706() / 16L)));
    }
    
    public Optional<Class74> method20199(final Class8322 class8322) {
        final Map map = this.field26282.get(this.method20198(class8322));
        if (map == null) {
            return (Optional<Class74>)Optional.absent();
        }
        final Class74 class8323 = (Class74)map.get(class8322);
        if (class8323 != null) {
            final Class74 clone = class8323.clone();
            clone.method420(new Class72("powered", (byte)0));
            clone.method420(new Class72("auto", (byte)0));
            clone.method420(new Class72("conditionMet", (byte)0));
            return (Optional<Class74>)Optional.of((Object)clone);
        }
        return (Optional<Class74>)Optional.absent();
    }
    
    public void method20200() {
        this.field26282.clear();
    }
    
    public void method20201(final boolean field26283) {
        this.field26283 = field26283;
    }
    
    public boolean method20202() {
        return this.field26283;
    }
}
