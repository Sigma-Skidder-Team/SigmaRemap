// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1637 implements Runnable
{
    private static String[] field9146;
    public final /* synthetic */ long field9147;
    public final /* synthetic */ long field9148;
    public final /* synthetic */ long field9149;
    public final /* synthetic */ long field9150;
    public final /* synthetic */ long field9151;
    public final /* synthetic */ Class22 field9152;
    public final /* synthetic */ Class6362 field9153;
    
    public Class1637(final Class6362 field9153, final long field9154, final long field9155, final long field9156, final long field9157, final long field9158, final Class22 field9159) {
        this.field9153 = field9153;
        this.field9147 = field9154;
        this.field9148 = field9155;
        this.field9149 = field9156;
        this.field9150 = field9157;
        this.field9151 = field9158;
        this.field9152 = field9159;
    }
    
    @Override
    public void run() {
        for (long field9147 = this.field9147; field9147 < this.field9148; ++field9147) {
            final long n = (Class6362.method19009(this.field9153) - field9147) % Class6362.method19009(this.field9153) * this.field9149;
            final long n2 = field9147 * this.field9149;
            for (long n3 = 0L; n3 < Class6362.method19006(this.field9153); ++n3) {
                final long n4 = (Class6362.method19006(this.field9153) - n3) % Class6362.method19006(this.field9153) * this.field9150;
                final long n5 = n3 * this.field9150;
                for (long n6 = 1L; n6 < Class6362.method19008(this.field9153); n6 += 2L) {
                    final long n7 = n + n4 + this.field9151 - n6;
                    final long n8 = n2 + n5 + n6;
                    this.field9152.method169(n7, -this.field9152.method135(n8 + 2L));
                    this.field9152.method169(n7 - 1L, this.field9152.method135(n8 + 1L));
                }
            }
        }
    }
}
