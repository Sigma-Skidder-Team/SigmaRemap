// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ConcurrentHashMap;
import java.lang.constant.Constable;
import java.util.Map;

public class Class7344 implements Class7345
{
    private static final Map<Class7803<?, Byte>, Integer> field28362;
    
    public static void method22559(final String s, final byte b, final byte b2, final int n) {
        Class7344.field28362.put(new Class7803<Object, Byte>(s, b2), n);
        Class7344.field28362.put(new Class7803<Object, Byte>(b, b2), n);
    }
    
    @Override
    public int method22560(final Class6108 class6108, final Class74 class6109) {
        final Object o = class6109.method418("Item") ? class6109.method419("Item").method374() : null;
        final Object o2 = class6109.method418("Data") ? class6109.method419("Data").method374() : null;
        Constable constable;
        if (!(o instanceof String)) {
            if (!(o instanceof Number)) {
                constable = 0;
            }
            else {
                constable = ((Number)o).byteValue();
            }
        }
        else {
            constable = ((String)o).replace("minecraft:", "");
        }
        Byte b;
        if (!(o2 instanceof Number)) {
            b = 0;
        }
        else {
            b = ((Number)o2).byteValue();
        }
        final Integer n = Class7344.field28362.get(new Class7803(constable, b));
        if (n != null) {
            return n;
        }
        final Integer n2 = Class7344.field28362.get(new Class7803(constable, 0));
        if (n2 == null) {
            return 5265;
        }
        return n2;
    }
    
    static {
        field28362 = new ConcurrentHashMap<Class7803<?, Byte>, Integer>();
        method22559("air", (byte)0, (byte)0, 5265);
        method22559("sapling", (byte)6, (byte)0, 5266);
        method22559("sapling", (byte)6, (byte)1, 5267);
        method22559("sapling", (byte)6, (byte)2, 5268);
        method22559("sapling", (byte)6, (byte)3, 5269);
        method22559("sapling", (byte)6, (byte)4, 5270);
        method22559("sapling", (byte)6, (byte)5, 5271);
        method22559("tallgrass", (byte)31, (byte)2, 5272);
        method22559("yellow_flower", (byte)37, (byte)0, 5273);
        method22559("red_flower", (byte)38, (byte)0, 5274);
        method22559("red_flower", (byte)38, (byte)1, 5275);
        method22559("red_flower", (byte)38, (byte)2, 5276);
        method22559("red_flower", (byte)38, (byte)3, 5277);
        method22559("red_flower", (byte)38, (byte)4, 5278);
        method22559("red_flower", (byte)38, (byte)5, 5279);
        method22559("red_flower", (byte)38, (byte)6, 5280);
        method22559("red_flower", (byte)38, (byte)7, 5281);
        method22559("red_flower", (byte)38, (byte)8, 5282);
        method22559("red_mushroom", (byte)40, (byte)0, 5283);
        method22559("brown_mushroom", (byte)39, (byte)0, 5284);
        method22559("deadbush", (byte)32, (byte)0, 5285);
        method22559("cactus", (byte)81, (byte)0, 5286);
    }
}
