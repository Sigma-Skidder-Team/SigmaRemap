// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;

import java.util.Collection;

public class Class4210 extends Class4211
{
    private final Class8172[] field19001;
    private final Class8685 field19002;
    
    public Class4210(final Class8172[] field19001, final Class8685 field19002) {
        super(Class4636.method13833());
        this.field19001 = field19001;
        this.field19002 = field19002;
    }
    
    public static Class4210 method12679(final Class5754... array) {
        final Class8172[] array2 = new Class8172[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i].method17082();
        }
        return new Class4210(array2, Class8685.field36500);
    }
    
    public static Class4210 method12680(final Class8685 class8685) {
        return new Class4210(new Class8172[0], class8685);
    }
    
    public boolean method12681(final Class513 class513, final Collection<Entity> collection, final int n) {
        if (this.field19001.length > 0) {
            final ArrayList arrayList = Lists.newArrayList((Iterable)collection);
            for (final Class8172 class514 : this.field19001) {
                int n2 = 0;
                final Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    if (!class514.method27015(class513, (Entity)iterator.next())) {
                        continue;
                    }
                    iterator.remove();
                    n2 = 1;
                    break;
                }
                if (n2 == 0) {
                    return false;
                }
            }
        }
        if (this.field19002 != Class8685.field36500) {
            final HashSet hashSet = Sets.newHashSet();
            final Iterator<Entity> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                hashSet.add(iterator2.next().getType());
            }
            return this.field19002.method29755(hashSet.size()) && this.field19002.method29755(n);
        }
        return true;
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("victims", Class8172.method27020(this.field19001));
        jsonObject.add("unique_entity_types", this.field19002.method29745());
        return jsonObject;
    }
}
