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

public class Realms
{
    private static final Class8098 field32144;
    
    public static boolean method25351() {
        return Minecraft.getInstance().gameSettings.field23429;
    }
    
    public static Proxy method25352() {
        return Minecraft.getInstance().method5289();
    }
    
    public static String method25353() {
        final Session method5287 = Minecraft.getInstance().method5287();
        return (method5287 != null) ? method5287.getSessionID() : null;
    }
    
    public static String method25354() {
        final Session method5287 = Minecraft.getInstance().method5287();
        return (method5287 != null) ? method5287.getUsername() : null;
    }
    
    public static long method25355() {
        return Util.method27837();
    }
    
    public static String method25356() {
        return Minecraft.getInstance().method5287().getSessionID();
    }
    
    public static String method25357() {
        return Minecraft.getInstance().method5287().getPlayerID();
    }
    
    public static String method25358() {
        return Minecraft.getInstance().method5287().getUsername();
    }
    
    public static String method25359(final String s) {
        return Minecraft.getInstance().method5301().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(s), null), false).getName();
    }
    
    public static <V> CompletableFuture<V> method25360(final Supplier<V> supplier) {
        return Minecraft.getInstance().method5377(supplier);
    }
    
    public static void method25361(final Runnable runnable) {
        Minecraft.getInstance().execute(runnable);
    }
    
    public static void setScreen(final RealmsScreen class5046) {
        method25360(() -> {
            method25363(class5047);
            return null;
        });
    }
    
    public static void method25363(final RealmsScreen class5046) {
        Minecraft.getInstance().displayGuiScreen(class5046.getProxy());
    }
    
    public static String method25364() {
        return Minecraft.getInstance().field4652.getAbsolutePath();
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
        Minecraft.getInstance().method5312(b);
    }
    
    public static CompletableFuture<?> method25370(final String s, final String s2) {
        return Minecraft.getInstance().method5293().method25742(s, s2);
    }
    
    public static void method25371() {
        Minecraft.getInstance().method5293().method25744();
    }
    
    public static boolean method25372() {
        return Minecraft.getInstance().gameSettings.field23424;
    }
    
    public static boolean method25373() {
        return Minecraft.getInstance().currentScreen != null && Minecraft.getInstance().currentScreen instanceof MainMenu;
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
        Minecraft.getInstance().field4651.method22508(s);
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
        Minecraft.getInstance().method5290().method5849(new ResourceLocation(s));
    }
    
    public static void narrateNow(final String s) {
        final NarratorChatListener field32404 = NarratorChatListener.field32404;
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
        narrateNow(method25385(iterable));
    }
    
    public static String method25385(final Iterable<String> elements) {
        return String.join(System.lineSeparator(), elements);
    }
    
    public static void method25386(final String s) {
        Realms.field32144.method26600(method25382(s));
    }
    
    static {
        field32144 = new Class8098(Duration.ofSeconds(5L));
    }
}
