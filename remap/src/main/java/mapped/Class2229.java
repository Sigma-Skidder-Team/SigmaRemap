// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.INBT;

import java.util.List;

public enum Class2229
{
    field13709("REPLACE", 0, "replace") {
        public Class2231(final String s, final int n, final String s2) {
        }
        
        @Override
        public void method8420(final INBT class41, final Class8570 class42, final List<INBT> list) throws CommandSyntaxException {
            class42.method28809(class41, (INBT)Iterables.getLast((Iterable)list)::method265);
        }
    }, 
    field13710("APPEND", 1, "append") {
        public Class2230(final String s, final int n, final String s2) {
        }
        
        @Override
        public void method8420(final INBT class41, final Class8570 class42, final List<INBT> list) throws CommandSyntaxException {
            class42.method28807(class41, (Supplier<INBT>)Class52::new).forEach(class43 -> {
                if (!(!(class43 instanceof Class52))) {
                    list2.forEach(class45 -> ((Class52)class44).add(class45.method265()));
                }
            });
        }
    }, 
    field13711("MERGE", 2, "merge") {
        public Class2232(final String s, final int n, final String s2) {
        }
        
        @Override
        public void method8420(final INBT class41, final Class8570 class42, final List<INBT> list) throws CommandSyntaxException {
            class42.method28807(class41, (Supplier<INBT>)Class51::new).forEach(class43 -> {
                if (!(!(class43 instanceof Class51))) {
                    list2.forEach(class45 -> {
                        if (!(!(class45 instanceof Class51))) {
                            ((Class51)class44).method338((Class51)class45);
                        }
                    });
                }
            });
        }
    };
    
    private final String field13712;
    
    public abstract void method8420(final INBT p0, final Class8570 p1, final List<INBT> p2) throws CommandSyntaxException;
    
    private Class2229(final String field13712) {
        this.field13712 = field13712;
    }
    
    public static Class2229 method8421(final String s) {
        for (final Class2229 class2229 : values()) {
            if (class2229.field13712.equals(s)) {
                return class2229;
            }
        }
        throw new IllegalArgumentException("Invalid merge strategy" + s);
    }
}
