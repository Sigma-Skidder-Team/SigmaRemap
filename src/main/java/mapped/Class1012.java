// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1012 implements Runnable
{
    private static String[] field5408;
    public final /* synthetic */ long field5409;
    public final /* synthetic */ long field5410;
    public final /* synthetic */ Class22 field5411;
    public final /* synthetic */ long field5412;
    public final /* synthetic */ float[] field5413;
    public final /* synthetic */ int field5414;
    
    public Class1012(final long field5409, final long field5410, final Class22 field5411, final long field5412, final float[] field5413, final int field5414) {
        this.field5409 = field5409;
        this.field5410 = field5410;
        this.field5411 = field5411;
        this.field5412 = field5412;
        this.field5413 = field5413;
        this.field5414 = field5414;
    }
    
    @Override
    public void run() {
        for (long field5409 = this.field5409; field5409 < this.field5410; ++field5409) {
            this.field5411.method169(this.field5412 + field5409, this.field5413[this.field5414 + (int)field5409]);
        }
    }
}
