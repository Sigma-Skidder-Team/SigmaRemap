// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.Logger;

public class Class1673 implements Class1671
{
    private static final Logger field9459;
    public static final Executor field9460;
    private final String field9461;
    private final ResourceLocation field9462;
    private final InputStream field9463;
    private final InputStream field9464;
    private boolean field9465;
    private JsonObject field9466;
    
    public Class1673(final String field9461, final ResourceLocation field9462, final InputStream field9463, final InputStream field9464) {
        this.field9461 = field9461;
        this.field9462 = field9462;
        this.field9463 = field9463;
        this.field9464 = field9464;
    }
    
    @Override
    public ResourceLocation method5886() {
        return this.field9462;
    }
    
    @Override
    public InputStream method5887() {
        return this.field9463;
    }
    
    public boolean method5890() {
        return this.field9464 != null;
    }
    
    @Nullable
    @Override
    public <T> T method5888(final Class5092<T> class5092) {
        if (!this.method5890()) {
            return null;
        }
        if (this.field9466 == null && !this.field9465) {
            this.field9465 = true;
            Reader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(this.field9464, StandardCharsets.UTF_8));
                this.field9466 = Class9583.method35933(reader);
            }
            finally {
                IOUtils.closeQuietly(reader);
            }
        }
        if (this.field9466 == null) {
            return null;
        }
        final String method15968 = class5092.method15968();
        return this.field9466.has(method15968) ? class5092.method15969(Class9583.method35914(this.field9466, method15968)) : null;
    }
    
    @Override
    public String method5889() {
        return this.field9461;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class1673) {
            final Class1673 class1673 = (Class1673)o;
            if (this.field9462 == null) {
                if (class1673.field9462 != null) {
                    return false;
                }
            }
            else if (!this.field9462.equals(class1673.field9462)) {
                return false;
            }
            if (this.field9461 == null) {
                return class1673.field9461 == null;
            }
            else return this.field9461.equals(class1673.field9461);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * ((this.field9461 == null) ? 0 : this.field9461.hashCode()) + ((this.field9462 == null) ? 0 : this.field9462.hashCode());
    }
    
    @Override
    public void close() throws IOException {
        this.field9463.close();
        if (this.field9464 != null) {
            this.field9464.close();
        }
    }
    
    static {
        field9459 = LogManager.getLogger();
        field9460 = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Resource IO {0}").setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class1673.field9459)).build());
    }
}
