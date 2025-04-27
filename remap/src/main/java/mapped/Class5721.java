// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class5721 extends CancellableEvent2
{
    private static String[] field23268;
    private IPacket field23269;
    private final List<IPacket> field23270;
    
    public Class5721(final IPacket field23269) {
        this.field23270 = new ArrayList<IPacket>();
        this.field23269 = field23269;
        this.field23270.add(field23269);
    }
    
    public IPacket method16990() {
        return this.field23269;
    }
    
    public List<IPacket> method16991() {
        return this.field23270;
    }
    
    public void method16992(final IPacket field23269) {
        this.field23269 = field23269;
    }
}
