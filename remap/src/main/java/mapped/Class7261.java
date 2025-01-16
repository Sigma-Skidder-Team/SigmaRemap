// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class7261 extends Class7257
{
    @Override
    public Fluid method22174() {
        return Class7558.field29977;
    }
    
    @Override
    public Fluid method22176() {
        return Class7558.field29978;
    }
    
    @Override
    public Item method22149() {
        return Items.field31351;
    }
    
    @Override
    public void animateTick(final World class1847, final BlockPos class1848, final IFluidState class1849, final Random random) {
        final BlockPos method1137 = class1848.method1137();
        if (class1847.getBlockState(method1137).method21706()) {
            if (!class1847.getBlockState(method1137).method21722(class1847, method1137)) {
                if (random.nextInt(100) == 0) {
                    final double n = class1848.getX() + random.nextFloat();
                    final double n2 = class1848.getY() + 1;
                    final double n3 = class1848.getZ() + random.nextFloat();
                    class1847.method6709(Class8432.field34633, n, n2, n3, 0.0, 0.0, 0.0);
                    class1847.method6708(n, n2, n3, Class8520.field35340, Class286.field1582, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
                }
                if (random.nextInt(200) == 0) {
                    class1847.method6708(class1848.getX(), class1848.getY(), class1848.getZ(), Class8520.field35338, Class286.field1582, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
                }
            }
        }
    }
    
    @Override
    public void randomTick(final World class1847, final BlockPos class1848, final IFluidState class1849, final Random random) {
        if (class1847.method6765().method31216(Class8878.field37315)) {
            final int nextInt = random.nextInt(3);
            if (nextInt <= 0) {
                for (int i = 0; i < 3; ++i) {
                    final BlockPos method1134 = class1848.add(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                    if (!class1847.method6731(method1134)) {
                        return;
                    }
                    if (class1847.method6961(method1134.method1137())) {
                        if (this.method22202(class1847, method1134)) {
                            class1847.method6692(method1134.method1137(), Class7521.field29289.getDefaultState());
                        }
                    }
                }
            }
            else {
                BlockPos method1135 = class1848;
                for (int j = 0; j < nextInt; ++j) {
                    method1135 = method1135.add(random.nextInt(3) - 1, 1, random.nextInt(3) - 1);
                    if (!class1847.method6731(method1135)) {
                        return;
                    }
                    final BlockState method1136 = class1847.getBlockState(method1135);
                    if (!method1136.method21706()) {
                        if (method1136.getMaterial().method26440()) {
                            return;
                        }
                    }
                    else if (this.method22201(class1847, method1135)) {
                        class1847.method6692(method1135, Class7521.field29289.getDefaultState());
                        return;
                    }
                }
            }
        }
    }
    
    private boolean method22201(final Class1852 class1852, final BlockPos class1853) {
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            if (this.method22202(class1852, class1853.method1149(values[i]))) {
                return true;
            }
        }
        return false;
    }
    
    private boolean method22202(final Class1852 class1852, final BlockPos class1853) {
        if (class1853.getY() >= 0) {
            if (class1853.getY() < 256) {
                if (!class1852.method6971(class1853)) {
                    return false;
                }
            }
        }
        return class1852.getBlockState(class1853).getMaterial().method26441();
    }
    
    @Nullable
    @Override
    public IParticleData getDripParticleData() {
        return Class8432.field34606;
    }
    
    @Override
    public void method22180(final Class1851 class1851, final BlockPos class1852, final BlockState class1853) {
        this.method22203(class1851, class1852);
    }
    
    @Override
    public int method22186(final Class1852 class1852) {
        return class1852.method6789().method20502() ? 4 : 2;
    }
    
    @Override
    public BlockState getBlockState(final IFluidState IFluidState) {
        return ((StateHolder<O, BlockState>)Class7521.field29174.getDefaultState()).with((IProperty<Comparable>)Class3859.field17480, Class7257.method22193(IFluidState));
    }
    
    @Override
    public boolean isEquivalentTo(final Fluid class7255) {
        return class7255 == Class7558.field29978 || class7255 == Class7558.field29977;
    }
    
    @Override
    public int method22191(final Class1852 class1852) {
        return class1852.method6789().method20502() ? 1 : 2;
    }
    
    @Override
    public boolean canDisplace(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101, final Fluid class7102, final Direction class7103) {
        return IFluidState.getActualHeight(class7100, class7101) >= 0.44444445f && class7102.isIn(Class7324.field28319);
    }
    
    @Override
    public int method22156(final Class1852 class1852) {
        return class1852.method6789().method20504() ? 10 : 30;
    }
    
    @Override
    public int method22192(final World class1847, final BlockPos class1848, final IFluidState class1849, final IFluidState class1850) {
        int method22156 = this.method22156(class1847);
        if (!class1849.isEmpty()) {
            if (!class1850.isEmpty()) {
                if (!class1849.get((IProperty<Boolean>)Class7261.field28132)) {
                    if (!class1850.get((IProperty<Boolean>)Class7261.field28132)) {
                        if (class1850.getActualHeight(class1847, class1848) > class1849.getActualHeight(class1847, class1848)) {
                            if (class1847.method6790().nextInt(4) != 0) {
                                method22156 *= 4;
                            }
                        }
                    }
                }
            }
        }
        return method22156;
    }
    
    private void method22203(final Class1851 class1851, final BlockPos class1852) {
        class1851.method6955(1501, class1852, 0);
    }
    
    @Override
    public boolean method22178() {
        return false;
    }
    
    @Override
    public void method22179(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final Direction class1854, final IFluidState class1855) {
        if (class1854 == Direction.DOWN) {
            final IFluidState method6702 = class1851.getFluidState(class1852);
            if (this.isIn(Class7324.field28320)) {
                if (method6702.isTagged(Class7324.field28319)) {
                    if (class1853.getBlock() instanceof Class3859) {
                        class1851.setBlockState(class1852, Class7521.field29148.getDefaultState(), 3);
                    }
                    this.method22203(class1851, class1852);
                    return;
                }
            }
        }
        super.method22179(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public boolean ticksRandomly() {
        return true;
    }
    
    @Override
    public float getExplosionResistance() {
        return 100.0f;
    }
}
