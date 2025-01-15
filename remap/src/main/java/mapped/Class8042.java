// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8042
{
    private short field33108;
    private short field33109;
    private short field33110;
    
    public Class8042(final short field33108, final short field33109, final short field33110) {
        this.field33108 = field33108;
        this.field33109 = field33109;
        this.field33110 = field33110;
    }
    
    @Override
    public String toString() {
        return "ItemTransaction(windowId=" + this.method26382() + ", slotId=" + this.method26383() + ", actionId=" + this.method26384() + ")";
    }
    
    public short method26382() {
        return this.field33108;
    }
    
    public short method26383() {
        return this.field33109;
    }
    
    public short method26384() {
        return this.field33110;
    }
}
