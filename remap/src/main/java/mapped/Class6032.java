// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public abstract class Class6032<C extends Class4407>
{
    public static final Class7096 field24525;
    public static final Class7096 field24526;
    public static final Class7096 field24527;
    public static final Class7096 field24528;
    public static final Class7096 field24529;
    public static final Class7096 field24530;
    public static final Class7096 field24531;
    public static final Class7096 field24532;
    public static final Class7096 field24533;
    public static final Class7096 field24534;
    public static final Class7096 field24535;
    public static final Class7096 field24536;
    public static final Class7096 field24537;
    public static final Class4408 field24538;
    public static final Class4408 field24539;
    public static final Class4408 field24540;
    public static final Class4408 field24541;
    public static final Class4408 field24542;
    public static final Class4408 field24543;
    public static final Class4408 field24544;
    public static final Class4408 field24545;
    public static final Class4408 field24546;
    public static final Class4408 field24547;
    public static final Class4408 field24548;
    public static final Class4408 field24549;
    public static final Class4408 field24550;
    public static final Class4408 field24551;
    public static final Class6032<Class4408> field24552;
    public static final Class6032<Class4408> field24553;
    public static final Class6032<Class4408> field24554;
    public static final Class6032<Class4408> field24555;
    public static final Class6032<Class4408> field24556;
    public static final Class6032<Class4408> field24557;
    public static final Class6032<Class4408> field24558;
    public static final Class6032<Class4408> field24559;
    public static final Class6032<Class4408> field24560;
    public static final Class6032<Class4408> field24561;
    public static final Class6032<Class4408> field24562;
    public static final Class6032<Class4408> field24563;
    private final Function<Dynamic<?>, ? extends C> field24564;
    
    private static <C extends Class4407, F extends Class6032<C>> F method17961(final String s, final F n) {
        return Registry.method511(Registry.field214, s, n);
    }
    
    public Class6032(final Function<Dynamic<?>, ? extends C> field24564) {
        this.field24564 = field24564;
    }
    
    public abstract void method17960(final Random p0, final IChunk p1, final Class3090 p2, final int p3, final int p4, final int p5, final double p6, final Class7096 p7, final Class7096 p8, final int p9, final long p10, final C p11);
    
    public void method17962(final long n) {
    }
    
    static {
        field24525 = Class7521.field29147.getDefaultState();
        field24526 = Class7521.field29156.getDefaultState();
        field24527 = Class7521.field29155.getDefaultState();
        field24528 = Class7521.field29158.getDefaultState();
        field24529 = Class7521.field29177.getDefaultState();
        field24530 = Class7521.field29148.getDefaultState();
        field24531 = Class7521.field29157.getDefaultState();
        field24532 = Class7521.field29175.getDefaultState();
        field24533 = Class7521.field29176.getDefaultState();
        field24534 = Class7521.field29482.getDefaultState();
        field24535 = Class7521.field29392.getDefaultState();
        field24536 = Class7521.field29338.getDefaultState();
        field24537 = Class7521.field29403.getDefaultState();
        field24538 = new Class4408(Class6032.field24525, Class6032.field24525, Class6032.field24525);
        field24539 = new Class4408(Class6032.field24528, Class6032.field24526, Class6032.field24529);
        field24540 = new Class4408(Class6032.field24529, Class6032.field24529, Class6032.field24529);
        field24541 = new Class4408(Class6032.field24527, Class6032.field24526, Class6032.field24529);
        field24542 = new Class4408(Class6032.field24526, Class6032.field24526, Class6032.field24529);
        field24543 = new Class4408(Class6032.field24530, Class6032.field24530, Class6032.field24529);
        field24544 = new Class4408(Class6032.field24531, Class6032.field24526, Class6032.field24529);
        field24545 = new Class4408(Class6032.field24532, Class6032.field24532, Class6032.field24529);
        field24546 = new Class4408(Class6032.field24527, Class6032.field24526, Class6032.field24532);
        field24547 = new Class4408(Class6032.field24532, Class6032.field24532, Class6032.field24532);
        field24548 = new Class4408(Class6032.field24533, Class6032.field24534, Class6032.field24529);
        field24549 = new Class4408(Class6032.field24535, Class6032.field24526, Class6032.field24529);
        field24550 = new Class4408(Class6032.field24536, Class6032.field24536, Class6032.field24536);
        field24551 = new Class4408(Class6032.field24537, Class6032.field24537, Class6032.field24537);
        field24552 = method17961("default", new Class6043(Class4408::method13341));
        field24553 = method17961("mountain", new Class6038(Class4408::method13341));
        field24554 = method17961("shattered_savanna", new Class6031(Class4408::method13341));
        field24555 = method17961("gravelly_mountain", new Class6036(Class4408::method13341));
        field24556 = method17961("giant_tree_taiga", new Class6034(Class4408::method13341));
        field24557 = method17961("swamp", new Class6035(Class4408::method13341));
        field24558 = method17961("badlands", new Class6040(Class4408::method13341));
        field24559 = method17961("wooded_badlands", new Class6041(Class4408::method13341));
        field24560 = method17961("eroded_badlands", new Class6042(Class4408::method13341));
        field24561 = method17961("frozen_ocean", new Class6033(Class4408::method13341));
        field24562 = method17961("nether", new Class6039(Class4408::method13341));
        field24563 = method17961("nope", new Class6037(Class4408::method13341));
    }
}
