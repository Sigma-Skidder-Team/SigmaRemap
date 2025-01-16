// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.function.Consumer;
import java.io.InputStream;
import java.io.IOException;
import java.util.concurrent.CompletionException;
import com.google.common.collect.Maps;
import java.util.concurrent.CompletableFuture;
import java.util.Map;

public class Class9130
{
    private static String[] field38692;
    private final Class6582 field38693;
    private final Map<ResourceLocation, CompletableFuture<Class6598>> field38694;
    
    public Class9130(final Class6582 field38693) {
        this.field38694 = Maps.newHashMap();
        this.field38693 = field38693;
    }
    
    public CompletableFuture<Class6598> method33125(final ResourceLocation key) {
        return this.field38694.computeIfAbsent(key, p0 -> CompletableFuture.supplyAsync(() -> {
            try {
                this.field38693.method19933(class1932);
                try {
                    final Class1671 class1933;
                    class1933.method5887();
                    try {
                        final InputStream inputStream;
                        final Class1743 class1934 = new Class1743(inputStream);
                        try {
                            return new Class6598(class1934.method6170(), class1934.method6169());
                        }
                        catch (final Throwable t) {
                            throw t;
                        }
                        finally {
                            if (class1934 != null) {
                                final Throwable t2;
                                if (t2 != null) {
                                    try {
                                        class1934.close();
                                    }
                                    catch (final Throwable exception) {
                                        t2.addSuppressed(exception);
                                    }
                                }
                                else {
                                    class1934.close();
                                }
                            }
                        }
                    }
                    catch (final Throwable t3) {
                        throw t3;
                    }
                    finally {
                        final InputStream inputStream;
                        if (inputStream != null) {
                            final Throwable t4;
                            if (t4 != null) {
                                try {
                                    inputStream.close();
                                }
                                catch (final Throwable exception2) {
                                    t4.addSuppressed(exception2);
                                }
                            }
                            else {
                                inputStream.close();
                            }
                        }
                    }
                }
                catch (final Throwable t5) {
                    throw t5;
                }
                finally {
                    final Class1671 class1933;
                    if (class1933 != null) {
                        final Throwable t6;
                        if (t6 != null) {
                            try {
                                class1933.close();
                            }
                            catch (final Throwable exception3) {
                                t6.addSuppressed(exception3);
                            }
                        }
                        else {
                            class1933.close();
                        }
                    }
                }
            }
            catch (final IOException cause) {
                throw new CompletionException(cause);
            }
        }, Class8349.method27841()));
    }
    
    public CompletableFuture<Class1742> method33126(final ResourceLocation class1932) {
        return (CompletableFuture<Class1742>)CompletableFuture.supplyAsync(() -> {
            try {
                return new Class1743(this.field38693.method19933(class1933).method5887());
            }
            catch (final IOException cause) {
                throw new CompletionException(cause);
            }
        }, Class8349.method27841());
    }
    
    public void method33127() {
        this.field38694.values().forEach(completableFuture -> completableFuture.thenAccept((Consumer)Class6598::method20044));
        this.field38694.clear();
    }
    
    public CompletableFuture<?> method33128(final Collection<Class7832> collection) {
        return CompletableFuture.allOf((CompletableFuture<?>[])collection.stream().map(class7832 -> this.method33125(class7832.method25305())).toArray(CompletableFuture[]::new));
    }
}
