// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8471<T extends Class3418>
{
    public static final Class8471<Class3438> field34755;
    public static final Class8471<Class3438> field34756;
    public static final Class8471<Class3438> field34757;
    public static final Class8471<Class3438> field34758;
    public static final Class8471<Class3438> field34759;
    public static final Class8471<Class3438> field34760;
    public static final Class8471<Class3424> field34761;
    public static final Class8471<Class3441> field34762;
    public static final Class8471<Class3436> field34763;
    public static final Class8471<Class3430> field34764;
    public static final Class8471<Class3421> field34765;
    public static final Class8471<Class3428> field34766;
    public static final Class8471<Class3433> field34767;
    public static final Class8471<Class3432> field34768;
    public static final Class8471<Class3440> field34769;
    public static final Class8471<Class3437> field34770;
    public static final Class8471<Class3420> field34771;
    public static final Class8471<Class3439> field34772;
    public static final Class8471<Class3423> field34773;
    public static final Class8471<Class3435> field34774;
    public static final Class8471<Class3431> field34775;
    public static final Class8471<Class3417> field34776;
    public static final Class8471<Class3422> field34777;
    private final Class9368<T> field34778;
    
    private static <T extends Class3418> Class8471<T> method28277(final String s, final Class9368<T> class9368) {
        return Registry.register(Registry.field235, s, new Class8471<T>(class9368));
    }
    
    private Class8471(final Class9368<T> field34778) {
        this.field34778 = field34778;
    }
    
    public T method28278(final int n, final Class464 class464) {
        return this.field34778.method34765(n, class464);
    }
    
    static {
        field34755 = method28277("generic_9x1", Class3438::method10964);
        field34756 = method28277("generic_9x2", Class3438::method10965);
        field34757 = method28277("generic_9x3", Class3438::method10966);
        field34758 = method28277("generic_9x4", Class3438::method10967);
        field34759 = method28277("generic_9x5", Class3438::method10968);
        field34760 = method28277("generic_9x6", Class3438::method10969);
        field34761 = method28277("generic_3x3", Class3424::new);
        field34762 = method28277("anvil", Class3441::new);
        field34763 = method28277("beacon", Class3436::new);
        field34764 = method28277("blast_furnace", Class3430::new);
        field34765 = method28277("brewing_stand", Class3421::new);
        field34766 = method28277("crafting", Class3428::new);
        field34767 = method28277("enchantment", Class3433::new);
        field34768 = method28277("furnace", Class3432::new);
        field34769 = method28277("grindstone", Class3440::new);
        field34770 = method28277("hopper", Class3437::new);
        field34771 = method28277("lectern", (n, class464) -> new Class3420(n));
        field34772 = method28277("loom", Class3439::new);
        field34773 = method28277("merchant", Class3423::new);
        field34774 = method28277("shulker_box", Class3435::new);
        field34775 = method28277("smoker", Class3431::new);
        field34776 = method28277("cartography_table", Class3417::new);
        field34777 = method28277("stonecutter", Class3422::new);
    }
}
