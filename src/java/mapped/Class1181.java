// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1181 implements Runnable
{
    private static String[] field6398;
    public final /* synthetic */ long field6399;
    public final /* synthetic */ long field6400;
    public final /* synthetic */ Class15 field6401;
    public final /* synthetic */ long field6402;
    public final /* synthetic */ Class15 field6403;
    public final /* synthetic */ long field6404;
    
    public Class1181(final long field6399, final long field6400, final Class15 field6401, final long field6402, final Class15 field6403, final long field6404) {
        this.field6399 = field6399;
        this.field6400 = field6400;
        this.field6401 = field6401;
        this.field6402 = field6402;
        this.field6403 = field6403;
        this.field6404 = field6404;
    }
    
    @Override
    public void run() {
        for (long field6399 = this.field6399; field6399 < this.field6400; ++field6399) {
            this.field6401.method167(this.field6402 + field6399, this.field6403.method133(this.field6404 + field6399));
        }
    }
}
