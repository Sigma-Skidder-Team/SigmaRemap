// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;

public enum Class2037 implements Class2038
{
    field11615(0, 59, 2.0f, 0.0f, 15, () -> Ingredient.method620(Class7855.field32237)),
    field11616(1, 131, 4.0f, 1.0f, 5, () -> Ingredient.method618(Blocks.COBBLESTONE)),
    field11617(2, 250, 6.0f, 2.0f, 14, () -> Ingredient.method618(Items.field31284)),
    field11618(3, 1561, 8.0f, 3.0f, 10, () -> Ingredient.method618(Items.field31283)),
    field11619(0, 32, 12.0f, 0.0f, 22, () -> Ingredient.method618(Items.field31285));
    
    private final int field11620;
    private final int field11621;
    private final float field11622;
    private final float field11623;
    private final int field11624;
    private final Class8656<Ingredient> field11625;
    
    Class2037(final int field11620, final int field11621, final float field11622, final float field11623, final int field11624, final Supplier<Ingredient> supplier) {
        this.field11620 = field11620;
        this.field11621 = field11621;
        this.field11622 = field11622;
        this.field11623 = field11623;
        this.field11624 = field11624;
        this.field11625 = new Class8656<Ingredient>(supplier);
    }
    
    @Override
    public int method8109() {
        return this.field11621;
    }
    
    @Override
    public float method8110() {
        return this.field11622;
    }
    
    @Override
    public float method8111() {
        return this.field11623;
    }
    
    @Override
    public int method8112() {
        return this.field11620;
    }
    
    @Override
    public int method8113() {
        return this.field11624;
    }
    
    @Override
    public Ingredient method8114() {
        return this.field11625.method29528();
    }
}
