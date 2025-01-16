// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.List;

public class Class625 extends Class624
{
    private static String[] field3603;
    public final Class7442 field3604;
    private final List<Class7626> field3605;
    public final /* synthetic */ Class5073 field3606;
    
    public Class625(final Class5073 field3606, final Class7442 field3607) {
        this.field3606 = field3606;
        this.field3604 = field3607;
        this.field3605 = Arrays.asList(new Class7625(this), new Class7627(this));
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3623(this.field3604, n3, n2, n6, n7);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        Class7626.method23966(Class5073.method15664(this.field3606), this, this.field3605, n3, n, n2);
        return true;
    }
    
    private void method3623(final Class7442 class7442, final int n, final int n2, final int n3, final int n4) {
        this.field3606.method15407(class7442.field28704, n + 38, n2 + 1, 16777215);
        this.field3606.method15407(class7442.field28705, n + 38, n2 + 12, 8421504);
        this.field3606.method15407(Class5073.method15661(class7442), n + 38, n2 + 24, 8421504);
        Class7626.method23965(this.field3605, Class5073.method15664(this.field3606), n, n2, n3, n4);
        Class8952.method31759(class7442.field28706, () -> {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            RealmsScreen.method15410(n5, n6, 8.0f, 8.0f, 8, 8, 32, 32, 64, 64);
            RealmsScreen.method15410(n5, n6, 40.0f, 8.0f, 8, 8, 32, 32, 64, 64);
        });
    }
}
