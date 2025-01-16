// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class642 extends Class623<Class642>
{
    private static String[] field3649;
    private final ResourceLocation field3650;
    public final /* synthetic */ Class621 field3651;
    
    public Class642(final Class621 field3651, final ResourceLocation field3652) {
        this.field3651 = field3651;
        this.field3650 = field3652;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.field3651.method3297(this.field3651.field3600.font, Registry.field217.getOrDefault(this.field3650).method9864().getString(), n3 + 5, n2 + 2, 16777215);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 != 0) {
            return false;
        }
        this.field3651.method3617(this);
        this.field3651.field3600.method3083();
        return true;
    }
}
