// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.google.common.collect.ImmutableList;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;

public class Class2726 extends Class2466
{
    public final /* synthetic */ Class2842 field14901;
    
    public Class2726(final Class2842 field14901) {
        this.field14901 = field14901;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        if (!Class8563.method28792().method23298()) {
            return;
        }
        if (class8699.method29818(Class5260.field22312, 0) == class8699.method29841().method18207(Class6634.class).method20098()) {
            final int intValue = class8699.method29822(Class5260.field22296);
            final HashMap hashMap = new HashMap(intValue);
            for (int i = 0; i < intValue; ++i) {
                final String s = class8699.method29822(Class5260.field22308);
                final Double n = class8699.method29822(Class5260.field22298);
                final int intValue2 = class8699.method29822(Class5260.field22312);
                final ArrayList list = new ArrayList(intValue2);
                for (int j = 0; j < intValue2; ++j) {
                    list.add(new Class8069(class8699.method29822(Class5260.field22310), class8699.method29822(Class5260.field22298), class8699.method29822(Class5260.field22289)));
                }
                hashMap.put(s, new Class7803(n, list));
            }
            hashMap.put("generic.attackSpeed", new Class7803(15.9, ImmutableList.of(new Class8069(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), 0.0, 0), new Class8069(UUID.fromString("AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3"), 0.0, 2), (Object)new Class8069(UUID.fromString("55FCED67-E92A-486E-9800-B47F202C4386"), 0.0, 2))));
            class8699.method29823(Class5260.field22296, hashMap.size());
            for (final Map.Entry<T, V> entry : hashMap.entrySet()) {
                class8699.method29823(Class5260.field22308, entry.getKey());
                class8699.method29823(Class5260.field22298, (Double)((Class7803)entry.getValue()).method25203());
                class8699.method29823(Class5260.field22312, ((List)((Class7803)entry.getValue()).method25204()).size());
                for (final Class8069 class8700 : ((Class7803)entry.getValue()).method25204()) {
                    class8699.method29823(Class5260.field22310, (UUID)class8700.method26469());
                    class8699.method29823(Class5260.field22298, (Double)class8700.method26470());
                    class8699.method29823(Class5260.field22289, (Byte)class8700.method26471());
                }
            }
        }
    }
}
