// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class875<Msg> extends AutoCloseable
{
    String method5376();
    
    void method5386(final Msg p0);
    
    default void close() {
    }
    
    default <Source> CompletableFuture<Source> method5391(final Function<? super Class875<Source>, ? extends Msg> function) {
        final CompletableFuture completableFuture = new CompletableFuture();
        this.method5386(function.apply((Object)method5392("ask future procesor handle", completableFuture::complete)));
        return completableFuture;
    }
    
    default <Msg> Class875<Msg> method5392(final String s, final Consumer<Msg> consumer) {
        return (Class875<Msg>)new Class876(s, consumer);
    }
}
