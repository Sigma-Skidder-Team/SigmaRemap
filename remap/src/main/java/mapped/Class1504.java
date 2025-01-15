// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1504 implements Runnable
{
    private static String[] field8368;
    public final /* synthetic */ long field8369;
    public final /* synthetic */ long field8370;
    public final /* synthetic */ Class19 field8371;
    public final /* synthetic */ long field8372;
    public final /* synthetic */ Class19 field8373;
    public final /* synthetic */ long field8374;
    
    public Class1504(final long field8369, final long field8370, final Class19 field8371, final long field8372, final Class19 field8373, final long field8374) {
        this.field8369 = field8369;
        this.field8370 = field8370;
        this.field8371 = field8371;
        this.field8372 = field8372;
        this.field8373 = field8373;
        this.field8374 = field8374;
    }
    
    @Override
    public void run() {
        for (long field8369 = this.field8369; field8369 < this.field8370; ++field8369) {
            this.field8371.method165(this.field8372 + field8369, this.field8373.method131(this.field8374 + field8369));
        }
    }
}
