// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Locale;
import java.util.Enumeration;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Class9084
{
    public static String[] method32775(final String s, final String s2) {
        return method32776(new String[] { s }, new String[] { s2 });
    }
    
    public static String[] method32776(final String[] array, final String[] array2) {
        final LinkedHashSet set = new LinkedHashSet();
        final Class1727[] method28903 = Config.method28903();
        for (int i = 0; i < method28903.length; ++i) {
            set.addAll(Arrays.asList(method32779(method28903[i], array, array2, null)));
        }
        return (String[])set.toArray(new String[set.size()]);
    }
    
    public static String[] method32777(final Class1727 class1727, final String s, final String s2, final String[] array) {
        return method32779(class1727, new String[] { s }, new String[] { s2 }, array);
    }
    
    public static String[] method32778(final Class1727 class1727, final String[] array, final String[] array2) {
        return method32779(class1727, array, array2, null);
    }
    
    public static String[] method32779(Class1727 obj, final String[] array, final String[] array2, final String[] array3) {
        if (obj instanceof Class1728) {
            return method32780(obj, array3);
        }
        if (obj instanceof Class1730) {
            final Class1727 class1727 = (Class1727)Class9570.method35828(obj, Class9570.field41440);
            if (class1727 == null) {
                Config.warn("LegacyResourcePackWrapper base resource pack not found: " + obj);
                return new String[0];
            }
            obj = class1727;
        }
        if (obj instanceof Class1731) {
            final Class1727 class1728 = (Class1727)Class9570.method35828(obj, Class9570.field41442);
            if (class1728 == null) {
                Config.warn("LegacyResourcePackWrapperV4 base resource pack not found: " + obj);
                return new String[0];
            }
            obj = class1728;
        }
        if (!(obj instanceof Class1732)) {
            Config.warn("Unknown resource pack type: " + obj);
            return new String[0];
        }
        final File field9679 = ((Class1732)obj).field9679;
        if (field9679 == null) {
            return new String[0];
        }
        if (field9679.isDirectory()) {
            return method32781(field9679, "", array, array2);
        }
        if (!field9679.isFile()) {
            Config.warn("Unknown resource pack file: " + field9679);
            return new String[0];
        }
        return method32782(field9679, array, array2);
    }
    
    private static String[] method32780(final Class1727 class1727, final String[] array) {
        if (array != null) {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < array.length; ++i) {
                final String str = array[i];
                if (method32783(str)) {
                    if (class1727.method6099(Class346.field2137, new ResourceLocation(str))) {
                        list.add(str);
                    }
                }
                else {
                    Config.warn("Skipping non-lowercase path: " + str);
                }
            }
            return (String[])list.toArray(new String[list.size()]);
        }
        return new String[0];
    }
    
    private static String[] method32781(final File file, final String s, final String[] array, final String[] array2) {
        final ArrayList list = new ArrayList();
        final String prefix = "assets/minecraft/";
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; ++i) {
                final File file2 = listFiles[i];
                if (!file2.isFile()) {
                    if (file2.isDirectory()) {
                        final String[] method32781 = method32781(file2, s + file2.getName() + "/", array, array2);
                        for (int j = 0; j < method32781.length; ++j) {
                            list.add(method32781[j]);
                        }
                    }
                }
                else {
                    final String string = s + file2.getName();
                    if (string.startsWith(prefix)) {
                        final String substring = string.substring(prefix.length());
                        if (Class9518.method35515(substring, array)) {
                            if (Class9518.method35516(substring, array2)) {
                                if (method32783(substring)) {
                                    list.add(substring);
                                }
                                else {
                                    Config.warn("Skipping non-lowercase path: " + substring);
                                }
                            }
                        }
                    }
                }
            }
            return (String[])list.toArray(new String[list.size()]);
        }
        return new String[0];
    }
    
    private static String[] method32782(final File file, final String[] array, final String[] array2) {
        final ArrayList list = new ArrayList();
        final String prefix = "assets/minecraft/";
        try {
            final ZipFile zipFile = new ZipFile(file);
            final Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                final String name = ((ZipEntry)entries.nextElement()).getName();
                if (name.startsWith(prefix)) {
                    final String substring = name.substring(prefix.length());
                    if (!Class9518.method35515(substring, array) || !Class9518.method35516(substring, array2)) {
                        continue;
                    }
                    if (!method32783(substring)) {
                        Config.warn("Skipping non-lowercase path: " + substring);
                    }
                    else {
                        list.add(substring);
                    }
                }
            }
            zipFile.close();
            return (String[])list.toArray(new String[list.size()]);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return new String[0];
        }
    }
    
    private static boolean method32783(final String s) {
        return s.equals(s.toLowerCase(Locale.ROOT));
    }
    
    public static Properties method32784(final String s, final String s2) {
        final ResourceLocation class1932 = new ResourceLocation(s);
        try {
            final InputStream method28897 = Config.method28897(class1932);
            if (method28897 == null) {
                return null;
            }
            final Class27 class1933 = new Class27();
            class1933.load(method28897);
            method28897.close();
            Config.method28847("" + s2 + ": Loading " + s);
            return class1933;
        }
        catch (final FileNotFoundException ex) {
            return null;
        }
        catch (final IOException ex2) {
            Config.warn("" + s2 + ": Error reading " + s);
            return null;
        }
    }
    
    public static Properties method32785(final InputStream inStream, final String s) {
        if (inStream == null) {
            return null;
        }
        try {
            final Class27 class27 = new Class27();
            class27.load(inStream);
            inStream.close();
            return class27;
        }
        catch (final FileNotFoundException ex) {
            return null;
        }
        catch (final IOException ex2) {
            return null;
        }
    }
}
