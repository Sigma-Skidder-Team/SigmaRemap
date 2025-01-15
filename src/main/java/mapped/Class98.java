// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public enum Class98 implements Iterable<Class179>, Predicate<Class179>
{
    field268(new Class179[] { Class179.field513, Class179.field516, Class179.field514, Class179.field515 }, new Class111[] { Class111.field351, Class111.field353 }), 
    field269(new Class179[] { Class179.field512, Class179.field511 }, new Class111[] { Class111.field352 });
    
    private final Class179[] field270;
    private final Class111[] field271;
    
    private Class98(final Class179[] field270, final Class111[] field271) {
        this.field270 = field270;
        this.field271 = field271;
    }
    
    public Class179 method576(final Random random) {
        return this.field270[random.nextInt(this.field270.length)];
    }
    
    @Override
    public boolean test(final Class179 class179) {
        return class179 != null && class179.method790().method603() == this;
    }
    
    @Override
    public Iterator<Class179> iterator() {
        return (Iterator<Class179>)Iterators.forArray((Object[])this.field270);
    }
}
