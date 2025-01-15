// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Iterator;
import java.io.IOException;
import java.util.regex.Matcher;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class Class6732
{
    private static final Pattern field26468;
    private static final Pattern field26469;
    
    public static String method20421(final Path path, String input, final String str) throws IOException {
        final char[] field41022 = Class9528.field41022;
        for (int length = field41022.length, i = 0; i < length; ++i) {
            input = input.replace(field41022[i], '_');
        }
        input = input.replaceAll("[./\"]", "_");
        if (Class6732.field26469.matcher(input).matches()) {
            input = "_" + input + "_";
        }
        final Matcher matcher = Class6732.field26468.matcher(input);
        int int1 = 0;
        if (matcher.matches()) {
            input = matcher.group("name");
            int1 = Integer.parseInt(matcher.group("count"));
        }
        if (input.length() > 255 - str.length()) {
            input = input.substring(0, 255 - str.length());
        }
        while (true) {
            String s = input;
            if (int1 != 0) {
                final String string = " (" + int1 + ")";
                final int endIndex = 255 - string.length();
                if (input.length() > endIndex) {
                    s = input.substring(0, endIndex);
                }
                s += string;
            }
            final Path resolve = path.resolve(s + str);
            try {
                final Path directory = Files.createDirectory(resolve, (FileAttribute<?>[])new FileAttribute[0]);
                Files.deleteIfExists(directory);
                return path.relativize(directory).toString();
            }
            catch (final FileAlreadyExistsException ex) {
                ++int1;
            }
        }
    }
    
    public static boolean method20422(final Path path) {
        return path.normalize().equals(path);
    }
    
    public static boolean method20423(final Path path) {
        final Iterator<Path> iterator = path.iterator();
        while (iterator.hasNext()) {
            if (!Class6732.field26469.matcher(iterator.next().toString()).matches()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public static Path method20424(final Path path, final String str, final String s) {
        final String string = str + s;
        final Path value = Paths.get(string, new String[0]);
        if (!value.endsWith(s)) {
            return path.resolve(value);
        }
        throw new InvalidPathException(string, "empty resource name");
    }
    
    static {
        field26468 = Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", 66);
        field26469 = Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", 2);
    }
}
