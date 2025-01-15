// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import java.util.List;

public class Class4365 implements Class4252<Class5800>
{
    private static String[] field19558;
    private int field19559;
    private List<Class8321> field19560;
    
    public Class4365() {
    }
    
    public Class4365(final int field19559, final Class2265<Class8321> class2265) {
        this.field19559 = field19559;
        this.field19560 = Class2265.method8507(class2265.size(), Class8321.field34174);
        for (int i = 0; i < this.field19560.size(); ++i) {
            this.field19560.set(i, ((Class8321)class2265.get(i)).method27641());
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19559 = class8654.readUnsignedByte();
        final short short1 = class8654.readShort();
        this.field19560 = Class2265.method8507(short1, Class8321.field34174);
        for (short n = 0; n < short1; ++n) {
            this.field19560.set(n, class8654.method29511());
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeByte(this.field19559);
        class8654.writeShort(this.field19560.size());
        final Iterator<Class8321> iterator = this.field19560.iterator();
        while (iterator.hasNext()) {
            class8654.method29509(iterator.next());
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17311(this);
    }
    
    public int method13129() {
        return this.field19559;
    }
    
    public List<Class8321> method13130() {
        return this.field19560;
    }
}
