// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class589 extends Class588
{
    private static String[] field3488;
    public final /* synthetic */ Class564 field3489;
    
    public Class589(final Class564 field3489, final int n, final int n2, final IRecipe<?> class3662, final boolean b) {
        this.field3489 = field3489;
        super(n, n2, class3662, b);
    }
    
    @Override
    public void method3456(final IRecipe<?> class3662) {
        this.field3486.add(new Class8370(this, 10, 10, class3662.getIngredients().get(0).method611()));
    }
}
