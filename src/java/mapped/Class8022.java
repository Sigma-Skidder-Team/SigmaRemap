// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Class8022 extends Class8020
{
    private Class8020 field33039;
    
    public Class8022(final Class8020 field33039) {
        if (field33039 != null) {
            this.field33039 = field33039;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
    
    public final Class8020 method26307() {
        return this.field33039;
    }
    
    public final Class8022 method26308(final Class8020 field33039) {
        if (field33039 != null) {
            this.field33039 = field33039;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
    
    @Override
    public Class8020 method26297(final long n, final TimeUnit timeUnit) {
        return this.field33039.method26297(n, timeUnit);
    }
    
    @Override
    public long method26298() {
        return this.field33039.method26298();
    }
    
    @Override
    public boolean method26299() {
        return this.field33039.method26299();
    }
    
    @Override
    public long method26300() {
        return this.field33039.method26300();
    }
    
    @Override
    public Class8020 method26301(final long n) {
        return this.field33039.method26301(n);
    }
    
    @Override
    public Class8020 method26303() {
        return this.field33039.method26303();
    }
    
    @Override
    public Class8020 method26304() {
        return this.field33039.method26304();
    }
    
    @Override
    public void method26305() throws IOException {
        this.field33039.method26305();
    }
}
