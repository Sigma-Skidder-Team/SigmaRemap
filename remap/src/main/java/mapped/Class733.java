// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class733 implements Class732
{
    private long field3990;
    public final /* synthetic */ MinecraftServer field3991;
    
    public Class733(final MinecraftServer field3991) {
        this.field3991 = field3991;
        this.field3990 = Class8349.method27837();
    }
    
    @Override
    public void method4036(final ITextComponent class2250) {
    }
    
    @Override
    public void method4037(final ITextComponent class2250) {
    }
    
    @Override
    public void method4039(final int i) {
        if (Class8349.method27837() - this.field3990 >= 1000L) {
            this.field3990 = Class8349.method27837();
            MinecraftServer.method1613().info("Converting... {}%", (Object)i);
        }
    }
    
    @Override
    public void method4040() {
    }
    
    @Override
    public void method4038(final ITextComponent class2250) {
    }
}
