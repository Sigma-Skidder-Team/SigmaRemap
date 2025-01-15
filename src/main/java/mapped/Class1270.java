// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1270 implements Runnable
{
    private static String[] field6932;
    public final /* synthetic */ long field6933;
    public final /* synthetic */ long field6934;
    public final /* synthetic */ Class23 field6935;
    public final /* synthetic */ Class23 field6936;
    public final /* synthetic */ Class23 field6937;
    
    public Class1270(final Class23 field6937, final long field6938, final long field6939, final Class23 field6940, final Class23 field6941) {
        this.field6937 = field6937;
        this.field6933 = field6938;
        this.field6934 = field6939;
        this.field6935 = field6940;
        this.field6936 = field6941;
    }
    
    @Override
    public void run() {
        for (long field6933 = this.field6933; field6933 < this.field6934; ++field6933) {
            this.field6935.method159(field6933, (byte)(this.field6937.method125(field6933) & this.field6936.method125(field6933)));
        }
    }
}
