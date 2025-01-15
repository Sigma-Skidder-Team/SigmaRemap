// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;

public class Class8033<U extends Class6851<?>>
{
    public static final Class8033<Class6853> field33063;
    public static final Class8033<Class6859> field33064;
    public static final Class8033<Class6858> field33065;
    public static final Class8033<Class6854> field33066;
    public static final Class8033<Class6850> field33067;
    public static final Class8033<Class6852> field33068;
    public static final Class8033<Class6860> field33069;
    public static final Class8033<Class6856> field33070;
    public static final Class8033<Class6855> field33071;
    public static final Class8033<Class6857> field33072;
    private final Supplier<U> field33073;
    
    private Class8033(final Supplier<U> field33073) {
        this.field33073 = field33073;
    }
    
    public U method26348() {
        return this.field33073.get();
    }
    
    private static <U extends Class6851<?>> Class8033<U> method26349(final String s, final Supplier<U> supplier) {
        return Class90.method512(Class90.field243, new Class1932(s), new Class8033<U>(supplier));
    }
    
    static {
        field33063 = method26349("dummy", Class6853::new);
        field33064 = method26349("nearest_living_entities", Class6859::new);
        field33065 = method26349("nearest_players", Class6858::new);
        field33066 = method26349("interactable_doors", Class6854::new);
        field33067 = method26349("nearest_bed", Class6850::new);
        field33068 = method26349("hurt_by", Class6852::new);
        field33069 = method26349("villager_hostiles", Class6860::new);
        field33070 = method26349("villager_babies", Class6856::new);
        field33071 = method26349("secondary_pois", Class6855::new);
        field33072 = method26349("golem_last_seen", Class6857::new);
    }
}
