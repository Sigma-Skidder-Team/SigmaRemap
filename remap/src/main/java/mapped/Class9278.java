// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Map;
import java.util.Objects;
import java.util.function.UnaryOperator;
import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;
import java.util.function.IntFunction;
import java.util.function.Function;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Properties;
import org.apache.logging.log4j.Logger;

public abstract class Class9278<T extends Class9278<T>>
{
    private static final Logger field39811;
    private final Properties field39812;
    
    public Class9278(final Properties field39812) {
        this.field39812 = field39812;
    }
    
    public static Properties method34228(final Path path) {
        final Properties properties = new Properties();
        try (final InputStream inputStream = Files.newInputStream(path)) {
            properties.load(inputStream);
        }
        catch (final IOException ex) {
            Class9278.field39811.error("Failed to load properties from file: " + path);
        }
        return properties;
    }
    
    public void method34229(final Path path) {
        try (final OutputStream outputStream = Files.newOutputStream(path)) {
            this.field39812.store(outputStream, "Minecraft server properties");
        }
        catch (final IOException ex) {
            Class9278.field39811.error("Failed to store properties to file: " + path);
        }
    }
    
    private static <V extends Number> Function<String, V> method34230(final Function<String, V> function) {
        return (Function<String, V>)(s2 -> {
            try {
                return (Number)function2.apply(s2);
            }
            catch (final NumberFormatException ex) {
                return null;
            }
        });
    }
    
    public static <V> Function<String, V> method34231(final IntFunction<V> intFunction, final Function<String, V> function) {
        return s2 -> {
            try {
                return intFunction2.apply(Integer.parseInt(s2));
            }
            catch (final NumberFormatException ex) {
                return function2.apply(s2);
            }
        };
    }
    
    @Nullable
    private String method34232(final String key) {
        return (String)this.field39812.get(key);
    }
    
    @Nullable
    public <V> V method34233(final String key, final Function<String, V> function) {
        final String method34232 = this.method34232(key);
        if (method34232 != null) {
            this.field39812.remove(key);
            return function.apply(method34232);
        }
        return null;
    }
    
    public <V> V method34234(final String key, final Function<String, V> function, final Function<V, String> function2, final V v) {
        final String method34232 = this.method34232(key);
        final Object firstNonNull = MoreObjects.firstNonNull((method34232 == null) ? null : function.apply(method34232), (Object)v);
        this.field39812.put(key, function2.apply((V)firstNonNull));
        return (V)firstNonNull;
    }
    
    public <V> Class9278$Property<V> method34235(final String key, final Function<String, V> function, final Function<V, String> function2, final V v) {
        final String method34232 = this.method34232(key);
        final Object firstNonNull = MoreObjects.firstNonNull((method34232 == null) ? null : function.apply(method34232), (Object)v);
        this.field39812.put(key, function2.apply((V)firstNonNull));
        return (Class9278$Property<V>)new Class8147(this, key, firstNonNull, function2, null);
    }
    
    public <V> V method34236(final String s, final Function<String, V> function, final UnaryOperator<V> unaryOperator, final Function<V, String> function2, final V v) {
        return this.method34234(s, s3 -> {
            function3.apply(s3);
            final Object o;
            return (o == null) ? null : unaryOperator2.apply(o);
        }, function2, v);
    }
    
    public <V> V method34237(final String s, final Function<String, V> function, final V v) {
        return this.method34234(s, function, Objects::toString, v);
    }
    
    public <V> Class9278$Property<V> method34238(final String s, final Function<String, V> function, final V v) {
        return (Class9278$Property<V>)this.method34235(s, (Function)function, (Function)Objects::toString, (Object)v);
    }
    
    public String method34239(final String s, final String s2) {
        return this.method34234(s, Function.identity(), Function.identity(), s2);
    }
    
    @Nullable
    public String method34240(final String s) {
        return this.method34233(s, Function.identity());
    }
    
    public int method34241(final String s, final int i) {
        return this.method34237(s, (Function<String, Integer>)method34230((Function<String, V>)Integer::parseInt), i);
    }
    
    public Class9278$Property<Integer> method34242(final String s, final int i) {
        return (Class9278$Property<Integer>)this.method34238(s, (Function)method34230(Integer::parseInt), (Object)i);
    }
    
    public int method34243(final String s, final UnaryOperator<Integer> unaryOperator, final int i) {
        return this.method34236(s, (Function<String, Integer>)method34230((Function<String, V>)Integer::parseInt), unaryOperator, Objects::toString, i);
    }
    
    public long method34244(final String s, final long l) {
        return this.method34237(s, (Function<String, Long>)method34230((Function<String, V>)Long::parseLong), l);
    }
    
    public boolean method34245(final String s, final boolean b) {
        return this.method34237(s, Boolean::valueOf, b);
    }
    
    public Class9278$Property<Boolean> method34246(final String s, final boolean b) {
        return (Class9278$Property<Boolean>)this.method34238(s, (Function)Boolean::valueOf, (Object)b);
    }
    
    @Nullable
    public Boolean method34247(final String s) {
        return this.method34233(s, Boolean::valueOf);
    }
    
    public Properties method34248() {
        final Properties properties = new Properties();
        properties.putAll(this.field39812);
        return properties;
    }
    
    public abstract T method34225(final Properties p0);
    
    static {
        field39811 = LogManager.getLogger();
    }
}
