// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
import java.util.Collection;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import com.google.common.collect.Lists;
import java.util.List;

public class Class8512
{
    private static String[] field34921;
    private final List<Class9473> field34922;
    private int field34923;
    
    public Class8512() {
        this.field34922 = Lists.newArrayList();
    }
    
    public Class8512 method28442(final int n, final float n2) {
        this.field34922.add(new Class9473(n, n2));
        this.method28443();
        return this;
    }
    
    private void method28443() {
        final Int2ObjectAVLTreeMap int2ObjectAVLTreeMap = new Int2ObjectAVLTreeMap();
        this.field34922.forEach(class9473 -> {
            final Class9473 class9474 = (Class9473)int2ObjectSortedMap.put(class9473.method35258(), (Object)class9473);
        });
        this.field34922.clear();
        this.field34922.addAll((Collection<? extends Class9473>) int2ObjectAVLTreeMap.values());
        this.field34923 = 0;
    }
    
    public float method28444(final int n) {
        if (this.field34922.size() > 0) {
            final Class9473 class9473 = this.field34922.get(this.field34923);
            final Class9473 class9474 = this.field34922.get(this.field34922.size() - 1);
            final boolean b = n < class9473.method35258();
            final int n2 = b ? 0 : this.field34923;
            float method35259 = b ? class9474.method35259() : class9473.method35259();
            for (int i = n2; i < this.field34922.size(); ++i) {
                final Class9473 class9475 = this.field34922.get(i);
                if (class9475.method35258() > n) {
                    break;
                }
                this.field34923 = i;
                method35259 = class9475.method35259();
            }
            return method35259;
        }
        return 0.0f;
    }
}
