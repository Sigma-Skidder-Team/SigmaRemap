// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Iterator;
import java.util.Collection;

public class Class4238 extends Class4211
{
    private final Class8172[] field19052;
    
    public Class4238(final Class8172[] field19052) {
        super(Class4610.method13722());
        this.field19052 = field19052;
    }
    
    public static Class4238 method12741(final Class8172... array) {
        return new Class4238(array);
    }
    
    public boolean method12742(final Class513 class513, final Collection<? extends Class399> collection) {
        for (final Class8172 class514 : this.field19052) {
            int n = 0;
            final Iterator<? extends Class399> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!class514.method27015(class513, (Class399)iterator.next())) {
                    continue;
                }
                n = 1;
                break;
            }
            if (n == 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("victims", Class8172.method27020(this.field19052));
        return (JsonElement)jsonObject;
    }
}
