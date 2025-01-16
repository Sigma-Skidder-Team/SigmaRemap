// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;

public class Class9142
{
    private final List<Pair<Class230, Class181>> field38728;
    
    public Class9142() {
        this.field38728 = Lists.newArrayList();
    }
    
    public Class9142 method33336(final Class230 class230, final Class181 class231) {
        this.field38728.add((Pair<Class230, Class181>)Pair.of((Object)class230, (Object)class231));
        return this;
    }
    
    public ListNBT method33337() {
        final ListNBT class52 = new ListNBT();
        for (final Pair pair : this.field38728) {
            final CompoundNBT e = new CompoundNBT();
            e.putString("Pattern", Class230.method861((Class230)pair.getLeft()));
            e.putInt("Color", ((Class181)pair.getRight()).method813());
            ((AbstractList<CompoundNBT>)class52).add(e);
        }
        return class52;
    }
}
