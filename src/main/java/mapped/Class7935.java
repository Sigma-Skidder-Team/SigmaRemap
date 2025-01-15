// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public class Class7935 implements GenericFutureListener<Future<? super Void>>
{
    private static String[] field32601;
    public final /* synthetic */ Class8699 field32602;
    public final /* synthetic */ Class2621 field32603;
    
    public Class7935(final Class2621 field32603, final Class8699 field32604) {
        this.field32603 = field32603;
        this.field32602 = field32604;
    }
    
    public void operationComplete(final Future<? super Void> future) throws Exception {
        this.field32602.method29841().method18220().close();
    }
}
