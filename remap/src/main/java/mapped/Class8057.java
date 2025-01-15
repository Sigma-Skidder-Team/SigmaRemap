// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.GZIPInputStream;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import javax.annotation.Nullable;
import java.io.OutputStream;
import java.io.InputStream;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

public class Class8057
{
    private static String[] field33144;
    private static final Int2ObjectMap<Class8057> field33145;
    public static final Class8057 field33146;
    public static final Class8057 field33147;
    public static final Class8057 field33148;
    private final int field33149;
    private final Class9376<InputStream> field33150;
    private final Class9376<OutputStream> field33151;
    
    private Class8057(final int field33149, final Class9376<InputStream> field33150, final Class9376<OutputStream> field33151) {
        this.field33149 = field33149;
        this.field33150 = field33150;
        this.field33151 = field33151;
    }
    
    private static Class8057 method26429(final Class8057 class8057) {
        Class8057.field33145.put(class8057.field33149, (Object)class8057);
        return class8057;
    }
    
    @Nullable
    public static Class8057 method26430(final int n) {
        return (Class8057)Class8057.field33145.get(n);
    }
    
    public static boolean method26431(final int n) {
        return Class8057.field33145.containsKey(n);
    }
    
    public int method26432() {
        return this.field33149;
    }
    
    public OutputStream method26433(final OutputStream outputStream) throws IOException {
        return this.field33151.method34813(outputStream);
    }
    
    public InputStream method26434(final InputStream inputStream) throws IOException {
        return this.field33150.method34813(inputStream);
    }
    
    static {
        field33145 = (Int2ObjectMap)new Int2ObjectOpenHashMap();
        field33146 = method26429(new Class8057(1, GZIPInputStream::new, GZIPOutputStream::new));
        field33147 = method26429(new Class8057(2, InflaterInputStream::new, DeflaterOutputStream::new));
        field33148 = method26429(new Class8057(3, inputStream -> inputStream, outputStream -> outputStream));
    }
}
