// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.PushbackInputStream;
import java.io.FileInputStream;
import javax.annotation.Nullable;
import java.util.function.Supplier;
import com.google.common.collect.Maps;
import java.io.File;
import com.mojang.datafixers.DataFixer;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class8213
{
    private static final Logger field33753;
    private final Map<String, Class6354> field33754;
    private final DataFixer field33755;
    private final File field33756;
    
    public Class8213(final File field33756, final DataFixer field33757) {
        this.field33754 = Maps.newHashMap();
        this.field33755 = field33757;
        this.field33756 = field33756;
    }
    
    private File method27207(final String str) {
        return new File(this.field33756, str + ".dat");
    }
    
    public <T extends Class6354> T method27208(final Supplier<T> supplier, final String s) {
        final Class6354 method27209 = this.method27209((Supplier<Class6354>)supplier, s);
        if (method27209 == null) {
            final Class6354 class6354 = supplier.get();
            this.method27211(class6354);
            return (T)class6354;
        }
        return (T)method27209;
    }
    
    @Nullable
    public <T extends Class6354> T method27209(final Supplier<T> supplier, final String s) {
        Class6354 method27210 = this.field33754.get(s);
        if (method27210 == null) {
            if (!this.field33754.containsKey(s)) {
                method27210 = this.method27210((Supplier<Class6354>)supplier, s);
                this.field33754.put(s, method27210);
            }
        }
        return (T)method27210;
    }
    
    @Nullable
    private <T extends Class6354> T method27210(final Supplier<T> supplier, final String s) {
        try {
            if (this.method27207(s).exists()) {
                final Class6354 class6354 = supplier.get();
                class6354.method18901(this.method27212(s, Class9528.method35579().getWorldVersion()).getCompound("data"));
                return (T)class6354;
            }
        }
        catch (final Exception ex) {
            Class8213.field33753.error("Error loading saved data: {}", s, ex);
        }
        return null;
    }
    
    public void method27211(final Class6354 class6354) {
        this.field33754.put(class6354.method18906(), class6354);
    }
    
    public CompoundNBT method27212(final String s, final int n) throws IOException {
        CompoundNBT method34652;
        try (final PushbackInputStream in = new PushbackInputStream(new FileInputStream(this.method27207(s)), 2)) {
            CompoundNBT class51;
            if (this.method27213(in)) {
                class51 = Class8097.method26590(in);
            }
            else {
                try (final DataInputStream dataInputStream = new DataInputStream(in)) {
                    class51 = Class8097.method26595(dataInputStream);
                }
            }
            method34652 = Class9346.method34652(this.field33755, Class1959.field10682, class51, class51.contains("DataVersion", 99) ? class51.getInt("DataVersion") : 1343, n);
        }
        return method34652;
    }
    
    private boolean method27213(final PushbackInputStream pushbackInputStream) throws IOException {
        final byte[] array = new byte[2];
        boolean b = false;
        final int read = pushbackInputStream.read(array, 0, 2);
        if (read == 2) {
            if (((array[1] & 0xFF) << 8 | (array[0] & 0xFF)) == 0x8B1F) {
                b = true;
            }
        }
        if (read != 0) {
            pushbackInputStream.unread(array, 0, read);
        }
        return b;
    }
    
    public void method27214() {
        for (final Class6354 class6354 : this.field33754.values()) {
            if (class6354 == null) {
                continue;
            }
            class6354.method18907(this.method27207(class6354.method18906()));
        }
    }
    
    static {
        field33753 = LogManager.getLogger();
    }
}
