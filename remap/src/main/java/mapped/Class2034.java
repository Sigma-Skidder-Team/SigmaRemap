// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;

public enum Class2034 implements Class2035
{
    field11592("leather", 5, new int[] { 1, 2, 3, 1 }, 15, Class8520.field34985, 0.0f, () -> Ingredient.method618(Items.field31357)),
    field11593("chainmail", 15, new int[] { 1, 4, 5, 2 }, 12, Class8520.field34979, 0.0f, () -> Ingredient.method618(Items.field31284)),
    field11594("iron", 15, new int[] { 2, 5, 6, 2 }, 9, Class8520.field34984, 0.0f, () -> Ingredient.method618(Items.field31284)),
    field11595("gold", 7, new int[] { 1, 3, 5, 2 }, 25, Class8520.field34983, 0.0f, () -> Ingredient.method618(Items.field31285)),
    field11596("diamond", 33, new int[] { 3, 6, 8, 3 }, 10, Class8520.field34980, 2.0f, () -> Ingredient.method618(Items.field31283)),
    field11597("turtle", 25, new int[] { 2, 5, 6, 2 }, 9, Class8520.field34986, 0.0f, () -> Ingredient.method618(Items.field31273));
    
    private static final int[] field11598;
    private final String field11599;
    private final int field11600;
    private final int[] field11601;
    private final int field11602;
    private final Class7795 field11603;
    private final float field11604;
    private final Class8656<Ingredient> field11605;
    
    Class2034(final String field11599, final int field11600, final int[] field11601, final int field11602, final Class7795 field11603, final float field11604, final Supplier<Ingredient> supplier) {
        this.field11599 = field11599;
        this.field11600 = field11600;
        this.field11601 = field11601;
        this.field11602 = field11602;
        this.field11603 = field11603;
        this.field11604 = field11604;
        this.field11605 = new Class8656<Ingredient>(supplier);
    }
    
    @Override
    public int method8096(final Class2215 class2215) {
        return Class2034.field11598[class2215.getIndex()] * this.field11600;
    }
    
    @Override
    public int method8097(final Class2215 class2215) {
        return this.field11601[class2215.getIndex()];
    }
    
    @Override
    public int method8098() {
        return this.field11602;
    }
    
    @Override
    public Class7795 method8099() {
        return this.field11603;
    }
    
    @Override
    public Ingredient method8100() {
        return this.field11605.method29528();
    }
    
    @Override
    public String method8101() {
        return this.field11599;
    }
    
    @Override
    public float method8102() {
        return this.field11604;
    }
    
    static {
        field11598 = new int[] { 13, 15, 16, 11 };
    }
}
