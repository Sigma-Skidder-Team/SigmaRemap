package net.minecraft.world.gen.treedecorator;

import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import net.minecraft.util.registry.Registry;

public class TreeDecoratorType<P extends TreeDecorator>
{
    public static final TreeDecoratorType<TrunkVineTreeDecorator> field_227425_a_ = func_227432_a_("trunk_vine", TrunkVineTreeDecorator::new);
    public static final TreeDecoratorType<LeaveVineTreeDecorator> field_227426_b_ = func_227432_a_("leave_vine", LeaveVineTreeDecorator::new);
    public static final TreeDecoratorType<CocoaTreeDecorator> field_227427_c_ = func_227432_a_("cocoa", CocoaTreeDecorator::new);
    public static final TreeDecoratorType<BeehiveTreeDecorator> field_227428_d_ = func_227432_a_("beehive", BeehiveTreeDecorator::new);
    public static final TreeDecoratorType<AlterGroundTreeDecorator> field_227429_e_ = func_227432_a_("alter_ground", AlterGroundTreeDecorator::new);
    private final Function < Dynamic<?>, P > field_227430_f_;

    private static <P extends TreeDecorator> TreeDecoratorType<P> func_227432_a_(String p_227432_0_, Function < Dynamic<?>, P > p_227432_1_)
    {
        return Registry.register(Registry.TREE_DECORATOR_TYPE, p_227432_0_, new TreeDecoratorType<>(p_227432_1_));
    }

    private TreeDecoratorType(Function < Dynamic<?>, P > p_i4005_1_)
    {
        this.field_227430_f_ = p_i4005_1_;
    }

    public P func_227431_a_(Dynamic<?> p_227431_1_)
    {
        return (P)(this.field_227430_f_.apply(p_227431_1_));
    }
}
