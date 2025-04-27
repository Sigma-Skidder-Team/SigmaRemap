// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.item.ItemStack;

public class Class4228 extends Class4211
{
    private final Class8685 field19029;
    private final Class8685 field19030;
    private final Class8685 field19031;
    private final Class9342[] field19032;
    
    public Class4228(final Class8685 field19029, final Class8685 field19030, final Class8685 field19031, final Class9342[] field19032) {
        super(Class4645.method13868());
        this.field19029 = field19029;
        this.field19030 = field19030;
        this.field19031 = field19031;
        this.field19032 = field19032;
    }
    
    public static Class4228 method12717(final Class9342... array) {
        return new Class4228(Class8685.field36500, Class8685.field36500, Class8685.field36500, array);
    }
    
    public static Class4228 method12718(final Class3832... array) {
        final Class9342[] array2 = new Class9342[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new Class9342(null, array[i].method11704(), Class8685.field36500, Class8685.field36500, Class9167.field38835, Class9167.field38835, null, Class7103.field27707);
        }
        return method12717(array2);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        Label_0105: {
            if (this.field19029.method29744()) {
                if (this.field19030.method29744()) {
                    if (this.field19031.method29744()) {
                        break Label_0105;
                    }
                }
            }
            final JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("occupied", this.field19029.method29745());
            jsonObject2.add("full", this.field19030.method29745());
            jsonObject2.add("empty", this.field19031.method29745());
            jsonObject.add("slots", jsonObject2);
        }
        if (this.field19032.length > 0) {
            final JsonArray jsonArray = new JsonArray();
            final Class9342[] field19032 = this.field19032;
            for (int length = field19032.length, i = 0; i < length; ++i) {
                jsonArray.add(field19032[i].method34629());
            }
            jsonObject.add("items", jsonArray);
        }
        return jsonObject;
    }
    
    public boolean method12719(final Class464 class464) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        final ArrayList arrayList = Lists.newArrayList((Object[])this.field19032);
        for (int i = 0; i < class464.getSizeInventory(); ++i) {
            final ItemStack method2157 = class464.getStackInSlot(i);
            if (!method2157.method27620()) {
                ++n3;
                if (method2157.method27690() >= method2157.method27628()) {
                    ++n;
                }
                final Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    if (!((Class9342)iterator.next()).method34627(method2157)) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            else {
                ++n2;
            }
        }
        return this.field19030.method29755(n) && this.field19031.method29755(n2) && this.field19029.method29755(n3) && arrayList.isEmpty();
    }
}
