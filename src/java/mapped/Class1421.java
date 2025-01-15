// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1421 implements Runnable
{
    private static String[] field7857;
    public final /* synthetic */ long field7858;
    public final /* synthetic */ long field7859;
    public final /* synthetic */ Class18 field7860;
    public final /* synthetic */ long field7861;
    public final /* synthetic */ byte[] field7862;
    public final /* synthetic */ int field7863;
    
    public Class1421(final long field7858, final long field7859, final Class18 field7860, final long field7861, final byte[] field7862, final int field7863) {
        this.field7858 = field7858;
        this.field7859 = field7859;
        this.field7860 = field7860;
        this.field7861 = field7861;
        this.field7862 = field7862;
        this.field7863 = field7863;
    }
    
    @Override
    public void run() {
        for (long field7858 = this.field7858; field7858 < this.field7859; ++field7858) {
            this.field7860.method159(this.field7861 + field7858, this.field7862[this.field7863 + (int)field7858]);
        }
    }
}
