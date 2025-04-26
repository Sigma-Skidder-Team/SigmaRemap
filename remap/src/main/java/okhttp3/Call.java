// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3;

import mapped.Response;
import mapped.Callback;
import mapped.Request;

import java.io.IOException;

public interface Call extends Cloneable
{
    Request request();
    
    Response execute() throws IOException;
    
    void enqueue(final Callback p0);
    
    void cancel();
    
    boolean method9347();
    
    boolean isCanceled();
    
    Call clone();
}
