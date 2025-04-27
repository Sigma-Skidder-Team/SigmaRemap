// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3964 extends Block
{
    public static final Class7115 field17908;
    public static final Class7113 field17909;
    public static final VoxelShape field17910;
    public static final VoxelShape field17911;
    public static final VoxelShape field17912;
    private static Class8691 field17913;
    
    public Class3964(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3964.field17908, Direction.NORTH)).with((IProperty<Comparable>)Class3964.field17909, false));
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return class7096.method21772((IProperty<Boolean>)Class3964.field17909) ? Class3964.field17912 : Class3964.field17910;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3964.field17908, class7074.method21644().getOpposite())).with((IProperty<Comparable>)Class3964.field17909, false);
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return class7096.method21772((IProperty<Boolean>)Class3964.field17909) ? 15 : 0;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3964.field17908, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3964.field17908)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((IProperty<Direction>)Class3964.field17908)));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3964.field17908, Class3964.field17909);
    }
    
    public static Class8691 method12093() {
        if (Class3964.field17913 == null) {
            Class3964.field17913 = Class9512.method35439().method35438("?vvv?", ">???<", ">???<", ">???<", "?^^^?").method35440('?', Class7990.method26069(Class169.field490)).method35440('^', Class7990.method26069(Class169.method766(Blocks.field29402).method768((IProperty<Comparable>)Class3964.field17909, Predicates.equalTo((Object)true)).method768((IProperty<Comparable>)Class3964.field17908, Predicates.equalTo((Object) Direction.SOUTH)))).method35440('>', Class7990.method26069(Class169.method766(Blocks.field29402).method768((IProperty<Comparable>)Class3964.field17909, Predicates.equalTo((Object)true)).method768((IProperty<Comparable>)Class3964.field17908, Predicates.equalTo((Object) Direction.WEST)))).method35440('v', Class7990.method26069(Class169.method766(Blocks.field29402).method768((IProperty<Comparable>)Class3964.field17909, Predicates.equalTo((Object)true)).method768((IProperty<Comparable>)Class3964.field17908, Predicates.equalTo((Object) Direction.NORTH)))).method35440('<', Class7990.method26069(Class169.method766(Blocks.field29402).method768((IProperty<Comparable>)Class3964.field17909, Predicates.equalTo((Object)true)).method768((IProperty<Comparable>)Class3964.field17908, Predicates.equalTo((Object) Direction.EAST)))).method35441();
        }
        return Class3964.field17913;
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17908 = Class3892.field17564;
        field17909 = Class8970.field37726;
        field17910 = Block.method11778(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
        field17911 = Block.method11778(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
        field17912 = VoxelShapes.method24492(Class3964.field17910, Class3964.field17911);
    }
}
