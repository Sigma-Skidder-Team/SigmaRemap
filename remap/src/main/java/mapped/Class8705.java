// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.function.Supplier;

public class Class8705<C extends Class7065, T extends Class6346<C>> implements Class8704<C, T>
{
    public static final Class8705<Class7068, Class6345> field36574;
    public static final Class8705<Class7064, Class6344> field36575;
    public static final Class8705<Class7069, Class6342> field36576;
    public static final Class8705<Class7066, Class6348> field36577;
    public static final Class8705<Class7067, Class6347> field36578;
    private final Class8704<C, T> field36579;
    private final boolean field36580;
    private final Supplier<C> field36581;
    
    private static <C extends Class7065, T extends Class6346<C>> Class8705<C, T> method29873(final String s, final Class8704<C, T> class8704, final Supplier<C> supplier, final boolean b) {
        return Registry.register(Registry.field225, s, new Class8705<C, T>(class8704, b, supplier));
    }
    
    public Class8705(final Class8704<C, T> field36579, final boolean field36580, final Supplier<C> field36581) {
        this.field36579 = field36579;
        this.field36580 = field36580;
        this.field36581 = field36581;
    }
    
    @Override
    public T method29872(final World class1847, final Class1868 class1848, final C c) {
        return this.field36579.method29872(class1847, class1848, c);
    }
    
    public C method29874() {
        return this.field36581.get();
    }
    
    public boolean method29875() {
        return this.field36580;
    }
    
    static {
        field36574 = method29873("surface", (Class8704<Class7068, Class6345>)Class6345::new, Class7068::new, true);
        field36575 = method29873("caves", (Class8704<Class7064, Class6344>)Class6344::new, Class7064::new, true);
        field36576 = method29873("floating_islands", (Class8704<Class7069, Class6342>)Class6342::new, Class7069::new, true);
        field36577 = method29873("debug", (Class8704<Class7066, Class6348>)Class6348::new, Class7066::new, false);
        field36578 = method29873("flat", (Class8704<Class7067, Class6347>)Class6347::new, Class7067::new, false);
    }
}
