// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;
import javax.annotation.Nullable;

public class Class1864 extends Class1862
{
    private static String[] field10166;
    private static final Class3090[] field10167;
    
    public Class1864(final Class1847 class1847, final Class7859 class1848) {
        super(class1847, class1848, new Class1873(Class1864.field10167));
    }
    
    @Override
    public Class7096 method6701(final BlockPos class354) {
        return Class7521.field29763.method11878();
    }
    
    @Nullable
    @Override
    public Class7096 method7008(final BlockPos class354, final Class7096 class355, final boolean b) {
        return null;
    }
    
    @Override
    public Class7099 method6702(final BlockPos class354) {
        return Class7558.field29974.method22148();
    }
    
    @Nullable
    @Override
    public Class1886 method7052() {
        return null;
    }
    
    @Override
    public int method6984(final BlockPos class354) {
        return 0;
    }
    
    @Override
    public void method7010(final Entity class399) {
    }
    
    @Override
    public void method7053(final Entity class399) {
    }
    
    @Override
    public void method7054(final Entity class399, final int n) {
    }
    
    @Nullable
    @Override
    public Class436 method7000(final BlockPos class354, final Class2079 class355) {
        return null;
    }
    
    @Override
    public void method7056(final Class436 class436) {
    }
    
    @Override
    public void method7009(final BlockPos class354, final Class436 class355) {
    }
    
    @Override
    public void method7028(final BlockPos class354) {
    }
    
    @Override
    public void method7058() {
    }
    
    @Override
    public void method7059(final Entity class399, final Class6221 class400, final List<Entity> list, final Predicate<? super Entity> predicate) {
    }
    
    @Override
    public <T extends Entity> void method7061(final Class<? extends T> clazz, final Class6221 class6221, final List<T> list, final Predicate<? super T> predicate) {
    }
    
    @Override
    public boolean method7062() {
        return true;
    }
    
    @Override
    public boolean method7023(final int n, final int n2) {
        return true;
    }
    
    @Override
    public Class2152 method7073() {
        return Class2152.field12787;
    }
    
    static {
        field10167 = Class8349.method27851(new Class3090[Class1873.field10210], a -> Arrays.fill(a, Class7102.field27633));
    }
}
