// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6910 implements Class6909
{
    public static final Class6382<Class6910> field27095;
    private final Class6907<Class6910> field27096;
    private final ItemStack field27097;
    
    public Class6910(final Class6907<Class6910> field27096, final ItemStack field27097) {
        this.field27096 = field27096;
        this.field27097 = field27097;
    }
    
    @Override
    public void method21273(final PacketBuffer class8654) {
        class8654.method29509(this.field27097);
    }
    
    @Override
    public String method21274() {
        return Class90.field222.method503(this.method21272()) + " " + new Class175(this.field27097.getItem(), this.field27097.method27657()).method773();
    }
    
    @Override
    public Class6907<Class6910> method21272() {
        return this.field27096;
    }
    
    public ItemStack method21275() {
        return this.field27097;
    }
    
    static {
        field27095 = new Class6385();
    }
}
