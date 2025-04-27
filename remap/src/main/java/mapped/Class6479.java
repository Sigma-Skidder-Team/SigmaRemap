// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;

public class Class6479 implements Class6477
{
    public List<Object> method19504(final Object o, final Class6646 class6646) throws Exception {
        if (o instanceof Class8699) {
            final ArrayList list = new ArrayList();
            final Class8699 class6647 = (Class8699)o;
            final boolean booleanValue = class6647.method29822(Class5260.field22294);
            final int intValue = class6647.method29822(Class5260.field22312);
            final Class9300[] array = new Class9300[intValue];
            for (int i = 0; i < intValue; ++i) {
                array[i] = Class9300.method34383(class6647, booleanValue);
            }
            for (final Class9300 class6648 : array) {
                final Class5281 class6649 = new Class5281(class6648.method34387());
                class6648.method34393(class6647.method29822(class6649));
                final Class8699 class6650 = new Class8699(33, null, class6647.method29841());
                class6650.method29823(Class5260.field22296, class6648.method34384());
                class6650.method29823(Class5260.field22296, class6648.method34385());
                class6650.method29823(Class5260.field22294, true);
                class6650.method29823(Class5260.field22306, class6648.method34386());
                class6650.method29823(Class5260.field22312, class6648.method34387());
                class6650.method29823(class6649, class6648.method34388());
                class6646.method20189().add(Class6646.method20186(class6648.method34384(), class6648.method34385()));
                list.add(class6650);
            }
            return list;
        }
        throw new IllegalArgumentException("The default packet has to be a PacketWrapper for transformMapChunkBulk, unexpected " + o.getClass());
    }
    
    public boolean method19505(final Class<?> clazz) {
        return false;
    }
    
    public boolean method19506() {
        return true;
    }
}
