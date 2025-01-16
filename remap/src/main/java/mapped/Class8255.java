// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public interface Class8255<T extends Class3418, U extends Screen & Class725<T>>
{
    default void method27396(final ITextComponent class2250, final Class8471<T> class2251, final Minecraft class2252, final int n) {
        final Screen method27397 = this.method27397(class2251.method28278(n, class2252.field4684.field3006), class2252.field4684.field3006, class2250);
        class2252.field4684.field3009 = ((Class725<Class3418>)method27397).method2993();
        class2252.method5244(method27397);
    }
    
    U method27397(final T p0, final Class464 p1, final ITextComponent p2);
}
