// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;

public enum Class2012
{
    field11439("movement", (Function<Class9106, T>)Class7078::new), 
    field11440("find_tree", (Function<Class9106, T>)Class7080::new), 
    field11441("punch_tree", (Function<Class9106, T>)Class7082::new), 
    field11442("open_inventory", (Function<Class9106, T>)Class7083::new), 
    field11443("craft_planks", (Function<Class9106, T>)Class7081::new), 
    field11444("none", (Function<Class9106, T>)Class7084::new);
    
    private final String field11445;
    private final Function<Class9106, ? extends Class7079> field11446;
    
    private <T extends Class7079> Class2012(final String field11445, final Function<Class9106, T> field11446) {
        this.field11445 = field11445;
        this.field11446 = field11446;
    }
    
    public Class7079 method8052(final Class9106 class9106) {
        return (Class7079)this.field11446.apply(class9106);
    }
    
    public String method8053() {
        return this.field11445;
    }
    
    public static Class2012 method8054(final String anObject) {
        for (final Class2012 class2012 : values()) {
            if (class2012.field11445.equals(anObject)) {
                return class2012;
            }
        }
        return Class2012.field11444;
    }
}
