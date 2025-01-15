// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Maps;
import net.minecraft.util.math.MathHelper;

import java.util.Map;

public class Class7948
{
    private static String[] field32625;
    private final Map<Class3820, Class7731> field32626;
    private int field32627;
    
    public Class7948() {
        this.field32626 = Maps.newHashMap();
    }
    
    public boolean method25769(final Class3820 class3820) {
        return this.method25770(class3820, 0.0f) > 0.0f;
    }
    
    public float method25770(final Class3820 class3820, final float n) {
        final Class7731 class3821 = this.field32626.get(class3820);
        if (class3821 == null) {
            return 0.0f;
        }
        return MathHelper.clamp((Class7731.method24679(class3821) - (this.field32627 + n)) / (Class7731.method24679(class3821) - Class7731.method24680(class3821)), 0.0f, 1.0f);
    }
    
    public void method25771() {
        ++this.field32627;
        if (!this.field32626.isEmpty()) {
            final Iterator<Map.Entry<Class3820, Class7731>> iterator = this.field32626.entrySet().iterator();
            while (iterator.hasNext()) {
                final Map.Entry<K, Class7731> entry = (Map.Entry<K, Class7731>)iterator.next();
                if (Class7731.method24679(entry.getValue()) > this.field32627) {
                    continue;
                }
                iterator.remove();
                this.method25775((Class3820)entry.getKey());
            }
        }
    }
    
    public void method25772(final Class3820 class3820, final int n) {
        this.field32626.put(class3820, new Class7731(this, this.field32627, this.field32627 + n, null));
        this.method25774(class3820, n);
    }
    
    public void method25773(final Class3820 class3820) {
        this.field32626.remove(class3820);
        this.method25775(class3820);
    }
    
    public void method25774(final Class3820 class3820, final int n) {
    }
    
    public void method25775(final Class3820 class3820) {
    }
}
