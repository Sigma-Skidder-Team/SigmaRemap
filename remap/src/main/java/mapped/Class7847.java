// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.time.Duration;
import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.net.Proxy;

public class Class7847
{
    private static final Class8098 field32144;
    
    public static boolean method25351() {
        return Class869.method5277().field4648.field23429;
    }
    
    public static Proxy method25352() {
        return Class869.method5277().method5289();
    }
    
    public static String method25353() {
        final Class9212 method5287 = Class869.method5277().method5287();
        return (method5287 != null) ? method5287.method33690() : null;
    }
    
    public static String method25354() {
        final Class9212 method5287 = Class869.method5277().method5287();
        return (method5287 != null) ? method5287.method33692() : null;
    }
    
    public static long method25355() {
        return Util.method27837();
    }
    
    public static String method25356() {
        return Class869.method5277().method5287().method33690();
    }
    
    public static String method25357() {
        return Class869.method5277().method5287().method33691();
    }
    
    public static String method25358() {
        return Class869.method5277().method5287().method33692();
    }
    
    public static String method25359(final String s) {
        return Class869.method5277().method5301().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(s), (String)null), false).getName();
    }
    
    public static <V> CompletableFuture<V> method25360(final Supplier<V> supplier) {
        return Class869.method5277().method5377(supplier);
    }
    
    public static void method25361(final Runnable runnable) {
        Class869.method5277().execute(runnable);
    }
    
    public static void method25362(final Class5046 class5046) {
        method25360(() -> {
            method25363(class5047);
            return null;
        });
    }
    
    public static void method25363(final Class5046 class5046) {
        Class869.method5277().method5244(class5046.method15403());
    }
    
    public static String method25364() {
        return Class869.method5277().field4652.getAbsolutePath();
    }
    
    public static int method25365() {
        return Class101.field298.method585();
    }
    
    public static int method25366() {
        return Class101.field299.method585();
    }
    
    public static int method25367() {
        return Class101.field300.method585();
    }
    
    public static int method25368() {
        return Class101.field301.method585();
    }
    
    public static void method25369(final boolean b) {
        Class869.method5277().method5312(b);
    }
    
    public static CompletableFuture<?> method25370(final String s, final String s2) {
        return Class869.method5277().method5293().method25742(s, s2);
    }
    
    public static void method25371() {
        Class869.method5277().method5293().method25744();
    }
    
    public static boolean method25372() {
        return Class869.method5277().field4648.field23424;
    }
    
    public static boolean method25373() {
        return Class869.method5277().field4700 != null && Class869.method5277().field4700 instanceof Class548;
    }
    
    public static void method25374(final File file) {
        if (file.exists()) {
            try {
                final CompoundNBT method26590 = Class8097.method26590(new FileInputStream(file));
                method26590.getCompound("Data").remove("Player");
                Class8097.method26591(method26590, new FileOutputStream(file));
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void method25375(final String s) {
        Util.method27845().method980(s);
    }
    
    public static void method25376(final String s) {
        Class869.method5277().field4651.method22508(s);
    }
    
    public static String method25377() {
        return Class9528.method35579().getName();
    }
    
    public static ResourceLocation method25378(final String s) {
        return new ResourceLocation(s);
    }
    
    public static String method25379(final String s, final Object... array) {
        return Class8822.method30773(s, array);
    }
    
    public static void method25380(final String s) {
        Class869.method5277().method5290().method5849(new ResourceLocation(s));
    }
    
    public static void method25381(final String s) {
        final Class7895 field32404 = Class7895.field32404;
        field32404.method25561();
        field32404.method25555(Class285.field1573, new StringTextComponent(method25382(s)));
    }
    
    private static String method25382(final String s) {
        return s.replace("\\n", System.lineSeparator());
    }
    
    public static void method25383(final String... a) {
        method25384(Arrays.asList(a));
    }
    
    public static void method25384(final Iterable<String> iterable) {
        method25381(method25385(iterable));
    }
    
    public static String method25385(final Iterable<String> elements) {
        return String.join(System.lineSeparator(), elements);
    }
    
    public static void method25386(final String s) {
        Class7847.field32144.method26600(method25382(s));
    }
    
    static {
        field32144 = new Class8098(Duration.ofSeconds(5L));
    }
}
