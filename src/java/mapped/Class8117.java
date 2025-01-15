// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;

public abstract class Class8117<T extends Class8117<T>>
{
    private final Class8455<T> field33453;
    
    public Class8117(final Class8455<T> field33453) {
        this.field33453 = field33453;
    }
    
    public abstract void method26706(final CommandContext<Class7492> p0, final String p1);
    
    public void method26707(final CommandContext<Class7492> commandContext, final String s) {
        this.method26706(commandContext, s);
        this.method26708(((Class7492)commandContext.getSource()).method23255());
    }
    
    public void method26708(final Class394 class394) {
        if (class394 != null) {
            Class8455.method28221((Class8455<Class8117>)this.field33453).accept(class394, this.method26712());
        }
    }
    
    public abstract void method26709(final String p0);
    
    public abstract String method26710();
    
    @Override
    public String toString() {
        return this.method26710();
    }
    
    public abstract int method26711();
    
    public abstract T method26712();
}
