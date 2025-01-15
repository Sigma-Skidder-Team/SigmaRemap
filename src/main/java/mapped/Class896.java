// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class896 implements Runnable
{
    public final /* synthetic */ byte[] field4841;
    public final /* synthetic */ Runnable field4842;
    public final /* synthetic */ Class4968 field4843;
    
    public Class896(final Class4968 field4843, final byte[] field4844, final Runnable field4845) {
        this.field4843 = field4843;
        this.field4841 = field4844;
        this.field4842 = field4845;
    }
    
    @Override
    public void run() {
        Class4968.method15152(this.field4843, "message", this.field4841, this.field4842);
    }
}
