// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.Collection;

public class Class4231 extends Class4211
{
    private final Class9342 field19037;
    private final Class8172 field19038;
    private final Class9342 field19039;
    
    public Class4231(final Class9342 field19037, final Class8172 field19038, final Class9342 field19039) {
        super(Class4631.method13810());
        this.field19037 = field19037;
        this.field19038 = field19038;
        this.field19039 = field19039;
    }
    
    public static Class4231 method12724(final Class9342 class9342, final Class8172 class9343, final Class9342 class9344) {
        return new Class4231(class9342, class9343, class9344);
    }
    
    public boolean method12725(final Class513 class513, final ItemStack class514, final Class425 class515, final Collection<ItemStack> collection) {
        if (!this.field19037.method34627(class514)) {
            return false;
        }
        if (this.field19038.method27015(class513, class515.field2592)) {
            if (this.field19039 != Class9342.field40107) {
                int n = 0;
                if (class515.field2592 instanceof Class427) {
                    if (this.field19039.method34627(((Class427)class515.field2592).method2107())) {
                        n = 1;
                    }
                }
                final Iterator<ItemStack> iterator = collection.iterator();
                while (iterator.hasNext()) {
                    if (!this.field19039.method34627(iterator.next())) {
                        continue;
                    }
                    n = 1;
                    break;
                }
                return n != 0;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("rod", this.field19037.method34629());
        jsonObject.add("entity", this.field19038.method27019());
        jsonObject.add("item", this.field19039.method34629());
        return jsonObject;
    }
}
