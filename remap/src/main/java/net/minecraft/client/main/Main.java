// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.client.main;

import com.mojang.authlib.properties.PropertyMap;
import joptsimple.*;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import com.google.gson.Gson;
import java.util.OptionalInt;
import java.util.List;
import mapped.Class914;
import mapped.Class2367;
import mapped.Class869;
import mapped.Class8726;
import mapped.Class9567;
import mapped.Class8239;
import mapped.Class900;
import mapped.Class9408;
import mapped.Class7918;
import mapped.Class5836;
import mapped.Class8852;
import mapped.Class9154;
import mapped.Class8515;
import mapped.Class9212;
import mapped.Class7689;
import mapped.PlayerEntity;
import mapped.Class9583;
import com.google.gson.GsonBuilder;
import java.net.Authenticator;
import mapped.Class7488;
import java.net.InetSocketAddress;
import java.net.Proxy;
import mapped.Class8349;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Main
{
    private static final Logger field14380;
    
    public static void main(final String[] array) {
        final OptionParser optionParser = new OptionParser();
        optionParser.allowsUnrecognizedOptions();
        optionParser.accepts("demo");
        optionParser.accepts("fullscreen");
        optionParser.accepts("checkGlErrors");
        final ArgumentAcceptingOptionSpec<String> withRequiredArg = optionParser.accepts("server").withRequiredArg();
        final ArgumentAcceptingOptionSpec<Integer> defaultsTo = optionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(25565);
        final ArgumentAcceptingOptionSpec<File> defaultsTo2 = optionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."));
        final ArgumentAcceptingOptionSpec<File> ofType = optionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
        final ArgumentAcceptingOptionSpec<File> ofType2 = optionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
        final ArgumentAcceptingOptionSpec<String> withRequiredArg2 = optionParser.accepts("proxyHost").withRequiredArg();
        final ArgumentAcceptingOptionSpec<Integer> ofType3 = optionParser.accepts("proxyPort").withRequiredArg().defaultsTo("8080").ofType(Integer.class);
        final ArgumentAcceptingOptionSpec<String> withRequiredArg3 = optionParser.accepts("proxyUser").withRequiredArg();
        final ArgumentAcceptingOptionSpec<String> withRequiredArg4 = optionParser.accepts("proxyPass").withRequiredArg();
        final ArgumentAcceptingOptionSpec<String> defaultsTo3 = optionParser.accepts("username").withRequiredArg().defaultsTo(("Player" + Class8349.method27837() % 1000L));
        final ArgumentAcceptingOptionSpec<String> withRequiredArg5 = optionParser.accepts("uuid").withRequiredArg();
        final ArgumentAcceptingOptionSpec<String> required = optionParser.accepts("accessToken").withRequiredArg().required();
        final ArgumentAcceptingOptionSpec<String> required2 = optionParser.accepts("version").withRequiredArg().required();
        final ArgumentAcceptingOptionSpec<Integer> defaultsTo4 = optionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854);
        final ArgumentAcceptingOptionSpec<Integer> defaultsTo5 = optionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480);
        final ArgumentAcceptingOptionSpec<Integer> ofType4 = optionParser.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
        final ArgumentAcceptingOptionSpec<Integer> ofType5 = optionParser.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
        final ArgumentAcceptingOptionSpec<String> defaultsTo6 = optionParser.accepts("userProperties").withRequiredArg().defaultsTo("{}");
        final ArgumentAcceptingOptionSpec<String> defaultsTo7 = optionParser.accepts("profileProperties").withRequiredArg().defaultsTo("{}");
        final ArgumentAcceptingOptionSpec<String> withRequiredArg6 = optionParser.accepts("assetIndex").withRequiredArg();
        final ArgumentAcceptingOptionSpec<String> defaultsTo8 = optionParser.accepts("userType").withRequiredArg().defaultsTo("legacy");
        final ArgumentAcceptingOptionSpec<String> defaultsTo9 = optionParser.accepts("versionType").withRequiredArg().defaultsTo("release");
        final NonOptionArgumentSpec<String> nonOptions = optionParser.nonOptions();
        final OptionSet parse = optionParser.parse(array);
        final List values = parse.valuesOf((OptionSpec)nonOptions);
        if (!values.isEmpty()) {
            System.out.println("Completely ignored arguments: " + values);
        }
        final String hostname = method9785(parse, withRequiredArg2);
        Proxy no_PROXY = Proxy.NO_PROXY;
        if (hostname != null) {
            try {
                no_PROXY = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(hostname, method9785(parse, ofType3)));
            }
            catch (final Exception ex) {}
        }
        final String s = method9785(parse, withRequiredArg3);
        final String s2 = method9785(parse, withRequiredArg4);
        if (!no_PROXY.equals(Proxy.NO_PROXY) && method9786(s) && method9786(s2)) {
            Authenticator.setDefault(new Class7488(s, s2));
        }
        final int intValue = method9785(parse, defaultsTo4);
        final int intValue2 = method9785(parse, defaultsTo5);
        final OptionalInt method9784 = method9784(method9785(parse, ofType4));
        final OptionalInt method9785 = method9784(method9785(parse, ofType5));
        final boolean has = parse.has("fullscreen");
        final boolean has2 = parse.has("demo");
        final String s3 = method9785(parse, required2);
        final Gson create = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new PropertyMap.Serializer()).create();
        final PropertyMap propertyMap = Class9583.method35929(create, method9785(parse, defaultsTo6), PropertyMap.class);
        final PropertyMap propertyMap2 = Class9583.method35929(create, method9785(parse, defaultsTo7), PropertyMap.class);
        final String s4 = method9785(parse, defaultsTo9);
        final File file = method9785(parse, defaultsTo2);
        final File file2 = parse.has(ofType) ? method9785(parse, ofType) : new File(file, "assets/");
        final File file3 = parse.has(ofType2) ? method9785(parse, ofType2) : new File(file, "resourcepacks/");
        final String s5 = (String)(parse.has(withRequiredArg5) ? ((OptionSpec)withRequiredArg5).value(parse) : PlayerEntity.method2894((String)((OptionSpec)defaultsTo3).value(parse)).toString());
        final String s6 = parse.has(withRequiredArg6) ? ((String)((OptionSpec)withRequiredArg6).value(parse)) : null;
        final String s7 = method9785(parse, withRequiredArg);
        final Integer n = method9785(parse, defaultsTo);
        Class7689.method24422();
        final Class9408 class9408 = new Class9408(new Class8515(new Class9212((String)((OptionSpec)defaultsTo3).value(parse), s5, (String)((OptionSpec)required).value(parse), (String)((OptionSpec)defaultsTo8).value(parse)), propertyMap, propertyMap2, no_PROXY), new Class9154(intValue, intValue2, method9784, method9785, has), new Class8852(file, file3, file2, s6), new Class5836(has2, s3, s4), new Class7918(s7, n));
        final Class900 hook = new Class900("Client Shutdown Thread");
        hook.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Main.field14380));
        Runtime.getRuntime().addShutdownHook(hook);
        new Class9567();
        Class869 class9409;
        try {
            Thread.currentThread().setName("Render thread");
            Class8726.method29983();
            Class8726.method30113();
            class9409 = new Class869(class9408);
            Class8726.method30114();
        }
        catch (final Class2367 class9410) {
            Main.field14380.warn("Failed to create window: ", class9410);
            return;
        }
        catch (final Throwable t) {
            final Class7689 method9786 = Class7689.method24421(t, "Initializing game");
            method9786.method24418("Initialization");
            Class869.method5276(null, class9408.field40380.field23928, null, method9786);
            Class869.method5239(method9786);
            return;
        }
        Label_1345: {
            if (class9409.method5331()) {
                final Thread thread = new Class914("Game thread", class9409);
                thread.start();
                while (class9409.method5254()) {}
                break Label_1345;
            }
            final Thread thread = null;
            try {
                Class8726.method29986(false);
                class9409.run();
            }
            catch (final Throwable t2) {
                Main.field14380.error("Unhandled game exception", t2);
            }
            try {
                class9409.method5253();
                if (thread != null) {
                    thread.join();
                }
            }
            catch (final InterruptedException ex2) {
                Main.field14380.error("Exception during client thread shutdown", (Throwable)ex2);
            }
            finally {
                class9409.method5246();
            }
        }
    }
    
    private static OptionalInt method9784(final Integer n) {
        return (n == null) ? OptionalInt.empty() : OptionalInt.of(n);
    }
    
    @Nullable
    private static <T> T method9785(final OptionSet set, final OptionSpec<T> optionSpec) {
        try {
            return (T)set.valueOf((OptionSpec)optionSpec);
        }
        catch (final Throwable t) {
            if (optionSpec instanceof ArgumentAcceptingOptionSpec) {
                final List defaultValues = ((ArgumentAcceptingOptionSpec)optionSpec).defaultValues();
                if (!defaultValues.isEmpty()) {
                    return (T)defaultValues.get(0);
                }
            }
        }
        return null;
    }
    
    private static boolean method9786(final String s) {
        return s != null && !s.isEmpty();
    }
    
    static {
        field14380 = LogManager.getLogger();
        System.setProperty("java.awt.headless", "true");
    }
}
