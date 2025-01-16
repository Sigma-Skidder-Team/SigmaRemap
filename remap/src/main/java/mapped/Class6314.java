// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.List;
import java.util.Random;

public interface Class6314
{
    default Class6313 method18699() {
        return (Class6313)this;
    }
    
    default List<Class8754> method18700(final BlockState class7096, final Direction class7097, final Random random, final Class6349 class7098) {
        return this.method18699().method18691(class7096, class7097, random);
    }
    
    default boolean method18701(final BlockState class7096) {
        return this.method18699().method18692();
    }
    
    default Class6313 method18702(final Class2016 class2016, final Class7351 class2017) {
        return (Class6313)Class9570.field41288.method22608(this.method18699(), class2016, class2017);
    }
    
    default Class6349 method18703(final Class1856 class1856, final BlockPos class1857, final BlockState class1858, final Class6349 class1859) {
        return class1859;
    }
    
    default Class1912 method18704(final Class6349 class6349) {
        return this.method18699().method18696();
    }
}
