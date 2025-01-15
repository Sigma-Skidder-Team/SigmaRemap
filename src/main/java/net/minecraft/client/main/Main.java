// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.client.main;

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
import mapped.Class512;
import mapped.Class9583;
import java.lang.reflect.Type;
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
        final ArgumentAcceptingOptionSpec withRequiredArg = optionParser.accepts("server").withRequiredArg();
        final ArgumentAcceptingOptionSpec defaultsTo = optionParser.accepts("port").withRequiredArg().ofType((Class)Integer.class).defaultsTo((Object)25565, (Object[])new Integer[0]);
        final ArgumentAcceptingOptionSpec defaultsTo2 = optionParser.accepts("gameDir").withRequiredArg().ofType((Class)File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
        final ArgumentAcceptingOptionSpec ofType = optionParser.accepts("assetsDir").withRequiredArg().ofType((Class)File.class);
        final ArgumentAcceptingOptionSpec ofType2 = optionParser.accepts("resourcePackDir").withRequiredArg().ofType((Class)File.class);
        final ArgumentAcceptingOptionSpec withRequiredArg2 = optionParser.accepts("proxyHost").withRequiredArg();
        final ArgumentAcceptingOptionSpec ofType3 = optionParser.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType((Class)Integer.class);
        final ArgumentAcceptingOptionSpec withRequiredArg3 = optionParser.accepts("proxyUser").withRequiredArg();
        final ArgumentAcceptingOptionSpec withRequiredArg4 = optionParser.accepts("proxyPass").withRequiredArg();
        final ArgumentAcceptingOptionSpec defaultsTo3 = optionParser.accepts("username").withRequiredArg().defaultsTo((Object)("Player" + Class8349.method27837() % 1000L), (Object[])new String[0]);
        final ArgumentAcceptingOptionSpec withRequiredArg5 = optionParser.accepts("uuid").withRequiredArg();
        final ArgumentAcceptingOptionSpec required = optionParser.accepts("accessToken").withRequiredArg().required();
        final ArgumentAcceptingOptionSpec required2 = optionParser.accepts("version").withRequiredArg().required();
        final ArgumentAcceptingOptionSpec defaultsTo4 = optionParser.accepts("width").withRequiredArg().ofType((Class)Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
        final ArgumentAcceptingOptionSpec defaultsTo5 = optionParser.accepts("height").withRequiredArg().ofType((Class)Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
        final ArgumentAcceptingOptionSpec ofType4 = optionParser.accepts("fullscreenWidth").withRequiredArg().ofType((Class)Integer.class);
        final ArgumentAcceptingOptionSpec ofType5 = optionParser.accepts("fullscreenHeight").withRequiredArg().ofType((Class)Integer.class);
        final ArgumentAcceptingOptionSpec defaultsTo6 = optionParser.accepts("userProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
        final ArgumentAcceptingOptionSpec defaultsTo7 = optionParser.accepts("profileProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
        final ArgumentAcceptingOptionSpec withRequiredArg6 = optionParser.accepts("assetIndex").withRequiredArg();
        final ArgumentAcceptingOptionSpec defaultsTo8 = optionParser.accepts("userType").withRequiredArg().defaultsTo((Object)"legacy", (Object[])new String[0]);
        final ArgumentAcceptingOptionSpec defaultsTo9 = optionParser.accepts("versionType").withRequiredArg().defaultsTo((Object)"release", (Object[])new String[0]);
        final NonOptionArgumentSpec nonOptions = optionParser.nonOptions();
        final OptionSet parse = optionParser.parse(array);
        final List values = parse.valuesOf((OptionSpec)nonOptions);
        if (!values.isEmpty()) {
            System.out.println("Completely ignored arguments: " + values);
        }
        final String hostname = method9785(parse, (joptsimple.OptionSpec<String>)withRequiredArg2);
        Proxy no_PROXY = Proxy.NO_PROXY;
        if (hostname != null) {
            try {
                no_PROXY = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(hostname, method9785(parse, (joptsimple.OptionSpec<Integer>)ofType3)));
            }
            catch (final Exception ex) {}
        }
        final String s = method9785(parse, (joptsimple.OptionSpec<String>)withRequiredArg3);
        final String s2 = method9785(parse, (joptsimple.OptionSpec<String>)withRequiredArg4);
        if (!no_PROXY.equals(Proxy.NO_PROXY) && method9786(s) && method9786(s2)) {
            Authenticator.setDefault(new Class7488(s, s2));
        }
        final int intValue = method9785(parse, (joptsimple.OptionSpec<Integer>)defaultsTo4);
        final int intValue2 = method9785(parse, (joptsimple.OptionSpec<Integer>)defaultsTo5);
        final OptionalInt method9784 = method9784(method9785(parse, (joptsimple.OptionSpec<Integer>)ofType4));
        final OptionalInt method9785 = method9784(method9785(parse, (joptsimple.OptionSpec<Integer>)ofType5));
        final boolean has = parse.has("fullscreen");
        final boolean has2 = parse.has("demo");
        final String s3 = method9785(parse, (joptsimple.OptionSpec<String>)required2);
        final Gson create = new GsonBuilder().registerTypeAdapter((Type)PropertyMap.class, (Object)new PropertyMap$Serializer()).create();
        final PropertyMap propertyMap = Class9583.method35929(create, method9785(parse, (joptsimple.OptionSpec<String>)defaultsTo6), PropertyMap.class);
        final PropertyMap propertyMap2 = Class9583.method35929(create, method9785(parse, (joptsimple.OptionSpec<String>)defaultsTo7), PropertyMap.class);
        final String s4 = method9785(parse, (joptsimple.OptionSpec<String>)defaultsTo9);
        final File file = method9785(parse, (joptsimple.OptionSpec<File>)defaultsTo2);
        final File file2 = parse.has((OptionSpec)ofType) ? method9785(parse, (joptsimple.OptionSpec<File>)ofType) : new File(file, "assets/");
        final File file3 = parse.has((OptionSpec)ofType2) ? method9785(parse, (joptsimple.OptionSpec<File>)ofType2) : new File(file, "resourcepacks/");
        final String s5 = (String)(parse.has((OptionSpec)withRequiredArg5) ? ((OptionSpec)withRequiredArg5).value(parse) : Class512.method2894((String)((OptionSpec)defaultsTo3).value(parse)).toString());
        final String s6 = parse.has((OptionSpec)withRequiredArg6) ? ((String)((OptionSpec)withRequiredArg6).value(parse)) : null;
        final String s7 = method9785(parse, (joptsimple.OptionSpec<String>)withRequiredArg);
        final Integer n = method9785(parse, (joptsimple.OptionSpec<Integer>)defaultsTo);
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
            Main.field14380.warn("Failed to create window: ", (Throwable)class9410);
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
        throw;
    }
    
    private static boolean method9786(final String s) {
        return s != null && !s.isEmpty();
    }
    
    static {
        field14380 = LogManager.getLogger();
        System.setProperty("java.awt.headless", "true");
    }
}
