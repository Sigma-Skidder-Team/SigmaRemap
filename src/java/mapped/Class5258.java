// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import io.netty.buffer.ByteBuf;

public class Class5258 extends Class5259
{
    private static String[] field22288;
    
    public List<Class7276> method16376(final ByteBuf byteBuf) throws Exception {
        final ArrayList list = new ArrayList();
        Class7276 class7276;
        do {
            class7276 = Class8202.field33728.method16378(byteBuf);
            if (class7276 != null) {
                list.add(class7276);
            }
        } while (class7276 != null);
        return list;
    }
    
    public void method16377(final ByteBuf byteBuf, final List<Class7276> list) throws Exception {
        final Iterator<Class7276> iterator = list.iterator();
        while (iterator.hasNext()) {
            Class8202.field33728.method16379(byteBuf, iterator.next());
        }
        Class8202.field33728.method16379(byteBuf, null);
    }
}
