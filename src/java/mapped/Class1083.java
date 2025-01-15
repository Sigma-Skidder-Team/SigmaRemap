// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1083 implements Runnable
{
    private static String[] field5839;
    public final /* synthetic */ long field5840;
    public final /* synthetic */ long field5841;
    public final /* synthetic */ long field5842;
    public final /* synthetic */ Class22 field5843;
    public final /* synthetic */ long field5844;
    public final /* synthetic */ Class22 field5845;
    public final /* synthetic */ long field5846;
    public final /* synthetic */ Class6362 field5847;
    
    public Class1083(final Class6362 field5847, final long field5848, final long field5849, final long field5850, final Class22 field5851, final long field5852, final Class22 field5853, final long field5854) {
        this.field5847 = field5847;
        this.field5840 = field5848;
        this.field5841 = field5849;
        this.field5842 = field5850;
        this.field5843 = field5851;
        this.field5844 = field5852;
        this.field5845 = field5853;
        this.field5846 = field5854;
    }
    
    @Override
    public void run() {
        for (long field5840 = this.field5840; field5840 < this.field5841; ++field5840) {
            final long n = field5840 * this.field5842;
            for (long n2 = 0L; n2 < Class6362.method19006(this.field5847); ++n2) {
                Class8601.method29152(this.field5843, field5840 * Class6362.method19006(this.field5847) * this.field5844 + n2 * this.field5844, this.field5845, n + n2 * this.field5846, this.field5844);
            }
        }
    }
}
