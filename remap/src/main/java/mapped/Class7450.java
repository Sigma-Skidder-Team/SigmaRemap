// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.text.ParseException;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Date;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.io.FileNotFoundException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.Collection;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import com.google.common.io.Files;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Class7450
{
    private static final Logger field28749;
    public static final File field28750;
    public static final File field28751;
    public static final File field28752;
    public static final File field28753;
    
    public static List<String> method22918(final File file, final Map<String, String[]> map) throws IOException {
        final List lines = Files.readLines(file, StandardCharsets.UTF_8);
        final Iterator iterator = lines.iterator();
        while (iterator.hasNext()) {
            final String trim = ((String)iterator.next()).trim();
            if (trim.startsWith("#")) {
                continue;
            }
            if (trim.length() < 1) {
                continue;
            }
            final String[] split = trim.split("\\|");
            map.put(split[0].toLowerCase(Locale.ROOT), split);
        }
        return lines;
    }
    
    private static void method22919(final MinecraftServer class394, final Collection<String> collection, final ProfileLookupCallback profileLookupCallback) {
        final String[] array = collection.stream().filter(s2 -> !Class8272.method27500(s2)).toArray(String[]::new);
        if (!class394.method1518()) {
            for (final String s : array) {
                profileLookupCallback.onProfileLookupSucceeded(new GameProfile(Class512.method2893(new GameProfile((UUID)null, s)), s));
            }
        }
        else {
            class394.method1555().findProfilesByNames(array, Agent.MINECRAFT, profileLookupCallback);
        }
    }
    
    public static boolean method22920(final MinecraftServer class394) {
        final Class8007 class395 = new Class8007(Class6765.field26556);
        if (Class7450.field28751.exists() && Class7450.field28751.isFile()) {
            if (class395.method26205().exists()) {
                try {
                    class395.method26218();
                }
                catch (final FileNotFoundException ex) {
                    Class7450.field28749.warn("Could not load existing file {}", (Object)class395.method26205().getName(), (Object)ex);
                }
            }
            try {
                final HashMap hashMap = Maps.newHashMap();
                method22918(Class7450.field28751, hashMap);
                method22919(class394, hashMap.keySet(), (ProfileLookupCallback)new Class6578(class394, hashMap, class395));
                class395.method26217();
                method22931(Class7450.field28751);
                return true;
            }
            catch (final IOException ex2) {
                Class7450.field28749.warn("Could not read old user banlist to convert it!", (Throwable)ex2);
                return false;
            }
            catch (final Class2371 class396) {
                Class7450.field28749.error("Conversion failed, please try again later", (Throwable)class396);
                return false;
            }
        }
        return true;
    }
    
    public static boolean method22921(final MinecraftServer class394) {
        final Class8009 class395 = new Class8009(Class6765.field26557);
        if (Class7450.field28750.exists() && Class7450.field28750.isFile()) {
            if (class395.method26205().exists()) {
                try {
                    class395.method26218();
                }
                catch (final FileNotFoundException ex) {
                    Class7450.field28749.warn("Could not load existing file {}", (Object)class395.method26205().getName(), (Object)ex);
                }
            }
            try {
                final HashMap hashMap = Maps.newHashMap();
                method22918(Class7450.field28750, hashMap);
                for (final String s : hashMap.keySet()) {
                    final String[] array = (String[])hashMap.get(s);
                    ((Class8006<K, Class6026>)class395).method26206(new Class6026(s, (array.length > 1) ? method22932(array[1], null) : null, (array.length > 2) ? array[2] : null, (array.length > 3) ? method22932(array[3], null) : null, (array.length > 4) ? array[4] : null));
                }
                class395.method26217();
                method22931(Class7450.field28750);
                return true;
            }
            catch (final IOException ex2) {
                Class7450.field28749.warn("Could not parse old ip banlist to convert it!", (Throwable)ex2);
                return false;
            }
        }
        return true;
    }
    
    public static boolean method22922(final MinecraftServer class394) {
        final Class8008 class395 = new Class8008(Class6765.field26558);
        if (Class7450.field28752.exists() && Class7450.field28752.isFile()) {
            if (class395.method26205().exists()) {
                try {
                    class395.method26218();
                }
                catch (final FileNotFoundException ex) {
                    Class7450.field28749.warn("Could not load existing file {}", (Object)class395.method26205().getName(), (Object)ex);
                }
            }
            try {
                method22919(class394, Files.readLines(Class7450.field28752, StandardCharsets.UTF_8), (ProfileLookupCallback)new Class8358(class394, class395));
                class395.method26217();
                method22931(Class7450.field28752);
                return true;
            }
            catch (final IOException ex2) {
                Class7450.field28749.warn("Could not read old oplist to convert it!", (Throwable)ex2);
                return false;
            }
            catch (final Class2371 class396) {
                Class7450.field28749.error("Conversion failed, please try again later", (Throwable)class396);
                return false;
            }
        }
        return true;
    }
    
    public static boolean method22923(final MinecraftServer class394) {
        final Class8010 class395 = new Class8010(Class6765.field26559);
        if (Class7450.field28753.exists() && Class7450.field28753.isFile()) {
            if (class395.method26205().exists()) {
                try {
                    class395.method26218();
                }
                catch (final FileNotFoundException ex) {
                    Class7450.field28749.warn("Could not load existing file {}", (Object)class395.method26205().getName(), (Object)ex);
                }
            }
            try {
                method22919(class394, Files.readLines(Class7450.field28753, StandardCharsets.UTF_8), (ProfileLookupCallback)new Class7973(class394, class395));
                class395.method26217();
                method22931(Class7450.field28753);
                return true;
            }
            catch (final IOException ex2) {
                Class7450.field28749.warn("Could not read old whitelist to convert it!", (Throwable)ex2);
                return false;
            }
            catch (final Class2371 class396) {
                Class7450.field28749.error("Conversion failed, please try again later", (Throwable)class396);
                return false;
            }
        }
        return true;
    }
    
    public static String method22924(final MinecraftServer class394, final String s) {
        if (Class8272.method27500(s) || s.length() > 16) {
            return s;
        }
        final GameProfile method29195 = class394.method1556().method29195(s);
        if (method29195 != null && method29195.getId() != null) {
            return method29195.getId().toString();
        }
        if (!class394.method1500() && class394.method1518()) {
            final ArrayList arrayList = Lists.newArrayList();
            method22919(class394, Lists.newArrayList((Object[])new String[] { s }), (ProfileLookupCallback)new Class8994(class394, arrayList));
            return (!arrayList.isEmpty() && ((GameProfile)arrayList.get(0)).getId() != null) ? ((GameProfile)arrayList.get(0)).getId().toString() : "";
        }
        return Class512.method2893(new GameProfile((UUID)null, s)).toString();
    }
    
    public static boolean method22925(final Class395 class395) {
        final File method22930 = method22930(class395);
        final File file = new File(method22930.getParentFile(), "playerdata");
        final File file2 = new File(method22930.getParentFile(), "unknownplayers");
        if (method22930.exists() && method22930.isDirectory()) {
            final File[] listFiles = method22930.listFiles();
            final ArrayList arrayList = Lists.newArrayList();
            final File[] array = listFiles;
            for (int length = array.length, i = 0; i < length; ++i) {
                final String name = array[i].getName();
                if (name.toLowerCase(Locale.ROOT).endsWith(".dat")) {
                    final String substring = name.substring(0, name.length() - ".dat".length());
                    if (!substring.isEmpty()) {
                        arrayList.add(substring);
                    }
                }
            }
            try {
                final String[] array2 = (String[])arrayList.toArray(new String[arrayList.size()]);
                method22919(class395, Lists.newArrayList((Object[])array2), (ProfileLookupCallback)new Class9372(class395, file, file2, method22930, array2));
                return true;
            }
            catch (final Class2371 class396) {
                Class7450.field28749.error("Conversion failed, please try again later", (Throwable)class396);
                return false;
            }
        }
        return true;
    }
    
    private static void method22926(final File file) {
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new Class2371("Can't create directory " + file.getName() + " in world save directory.", (Class6578)null);
            }
        }
        else if (!file.isDirectory()) {
            throw new Class2371("Can't create directory " + file.getName() + " in world save directory.", (Class6578)null);
        }
    }
    
    public static boolean method22927(final MinecraftServer class394) {
        return method22928() && method22929(class394);
    }
    
    private static boolean method22928() {
        boolean b = false;
        if (Class7450.field28751.exists()) {
            if (Class7450.field28751.isFile()) {
                b = true;
            }
        }
        boolean b2 = false;
        if (Class7450.field28750.exists()) {
            if (Class7450.field28750.isFile()) {
                b2 = true;
            }
        }
        boolean b3 = false;
        if (Class7450.field28752.exists()) {
            if (Class7450.field28752.isFile()) {
                b3 = true;
            }
        }
        boolean b4 = false;
        if (Class7450.field28753.exists()) {
            if (Class7450.field28753.isFile()) {
                b4 = true;
            }
        }
        if (!b) {
            if (!b2) {
                if (!b3) {
                    if (!b4) {
                        return true;
                    }
                }
            }
        }
        Class7450.field28749.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
        Class7450.field28749.warn("** please remove the following files and restart the server:");
        if (b) {
            Class7450.field28749.warn("* {}", (Object)Class7450.field28751.getName());
        }
        if (b2) {
            Class7450.field28749.warn("* {}", (Object)Class7450.field28750.getName());
        }
        if (b3) {
            Class7450.field28749.warn("* {}", (Object)Class7450.field28752.getName());
        }
        if (b4) {
            Class7450.field28749.warn("* {}", (Object)Class7450.field28753.getName());
        }
        return false;
    }
    
    private static boolean method22929(final MinecraftServer class394) {
        final File method22930 = method22930(class394);
        if (method22930.exists()) {
            if (method22930.isDirectory()) {
                if (method22930.list().length > 0 || !method22930.delete()) {
                    Class7450.field28749.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
                    Class7450.field28749.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
                    Class7450.field28749.warn("** please restart the server and if the problem persists, remove the directory '{}'", (Object)method22930.getPath());
                    return false;
                }
            }
        }
        return true;
    }
    
    private static File method22930(final MinecraftServer class394) {
        return new File(new File(class394.method1501()), "players");
    }
    
    private static void method22931(final File file) {
        file.renameTo(new File(file.getName() + ".converted"));
    }
    
    private static Date method22932(final String source, final Date date) {
        Date parse;
        try {
            parse = Class6024.field24514.parse(source);
        }
        catch (final ParseException ex) {
            parse = date;
        }
        return parse;
    }
    
    static {
        field28749 = LogManager.getLogger();
        field28750 = new File("banned-ips.txt");
        field28751 = new File("banned-players.txt");
        field28752 = new File("ops.txt");
        field28753 = new File("white-list.txt");
    }
}
