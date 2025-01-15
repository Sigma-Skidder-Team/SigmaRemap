// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public class Class8043
{
    private static String[] field33111;
    private final IPacket<?> field33112;
    private final GenericFutureListener<? extends Future<? super Void>> field33113;
    
    public Class8043(final IPacket<?> field33112, final GenericFutureListener<? extends Future<? super Void>> field33113) {
        this.field33112 = field33112;
        this.field33113 = field33113;
    }
}
