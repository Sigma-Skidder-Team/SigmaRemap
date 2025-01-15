// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;

public class Class7451 implements Class7452
{
    private final Class7909<Class3820> field28754;
    
    private Class7451(final Class7909<Class3820> field28754) {
        this.field28754 = field28754;
    }
    
    @Override
    public Collection<Class8321> method22938() {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Class3820> iterator = this.field28754.method25616().iterator();
        while (iterator.hasNext()) {
            arrayList.add(new Class8321(iterator.next()));
        }
        return arrayList;
    }
    
    @Override
    public JsonObject method22939() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("tag", this.field28754.method25621().toString());
        return jsonObject;
    }
}
