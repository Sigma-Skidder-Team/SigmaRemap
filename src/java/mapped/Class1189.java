// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1189 implements Runnable
{
    public final /* synthetic */ Runnable field6441;
    public final /* synthetic */ Class4965 field6442;
    
    public Class1189(final Class4965 field6442, final Runnable field6443) {
        this.field6442 = field6442;
        this.field6441 = field6443;
    }
    
    @Override
    public void run() {
        final Class4965 field6442 = this.field6442;
        Class4965.method15023(this.field6442, Class2086.field12063);
        final Class1180 class1180 = new Class1180(this, field6442);
        if (!Class4965.method15026(this.field6442) && this.field6442.field21318) {
            class1180.run();
        }
        else {
            final int[] array = { 0 };
            if (Class4965.method15026(this.field6442)) {
                Class4965.method15024().fine("we are currently polling - waiting to pause");
                final int[] array2 = array;
                final int n = 0;
                ++array2[n];
                this.field6442.method14977("pollComplete", new Class4690(this, array, class1180));
            }
            if (!this.field6442.field21318) {
                Class4965.method15024().fine("we are currently writing - waiting to pause");
                final int[] array3 = array;
                final int n2 = 0;
                ++array3[n2];
                this.field6442.method14977("drain", new Class4701(this, array, class1180));
            }
        }
    }
}
