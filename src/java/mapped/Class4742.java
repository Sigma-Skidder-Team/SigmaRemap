// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4742 extends Class4712<Class856, Class5873>
{
    private static final Class1932 field20362;
    
    public Class4742(final Class8551 class8551) {
        super(class8551, new Class5873(), 0.25f);
    }
    
    public Class1932 method14069(final Class856 class856) {
        return Class4742.field20362;
    }
    
    public void method14070(final Class856 class856, final Class7351 class857, final float n) {
        class857.method22565(0.35f, 0.35f, 0.35f);
    }
    
    public void method14071(final Class856 class856, final Class7351 class857, final float n, final float n2, final float n3) {
        if (!class856.method5144()) {
            class857.method22564(0.0, Class9546.method35639(n * 0.3f) * 0.1f, 0.0);
        }
        else {
            class857.method22564(0.0, -0.10000000149011612, 0.0);
        }
        super.method13985(class856, class857, n, n2, n3);
    }
    
    static {
        field20362 = new Class1932("textures/entity/bat.png");
    }
}
