// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ResourceLocation implements Comparable<ResourceLocation>
{
    private static final SimpleCommandExceptionType field10541;
    public final String field10542;
    public final String field10543;
    
    public ResourceLocation(final String[] array) {
        this.field10542 = (StringUtils.isEmpty(array[0]) ? "minecraft" : array[0]);
        this.field10543 = array[1];
        if (this.field10543.equals("DUMMY")) {
            if (!method7802(this.field10542)) {
                throw new Class2357("Non [a-z0-9_.-] character in namespace of location: " + this.field10542 + ':' + this.field10543);
            }
            if (!method7801(this.field10543)) {
                throw new Class2357("Non [a-z0-9/._-] character in path of location: " + this.field10542 + ':' + this.field10543);
            }
        }
    }
    
    public ResourceLocation(final String s) {
        this(method7796(s, ':'));
    }
    
    public ResourceLocation(final String s, final String s2) {
        this(new String[] { s, s2 });
    }
    
    public static ResourceLocation method7794(final String s, final char c) {
        return new ResourceLocation(method7796(s, c));
    }
    
    @Nullable
    public static ResourceLocation method7795(final String s) {
        try {
            return new ResourceLocation(s);
        }
        catch (final Class2357 class2357) {
            return null;
        }
    }
    
    public static String[] method7796(final String s, final char ch) {
        final String[] array = { "minecraft", s };
        final int index = s.indexOf(ch);
        if (index >= 0) {
            array[1] = s.substring(index + 1);
            if (index >= 1) {
                array[0] = s.substring(0, index);
            }
        }
        return array;
    }
    
    public String method7797() {
        return this.field10543;
    }
    
    public String method7798() {
        return this.field10542;
    }
    
    @Override
    public String toString() {
        return this.field10542 + ':' + this.field10543;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof ResourceLocation) {
            final ResourceLocation class1932 = (ResourceLocation)o;
            return this.field10542.equals(class1932.field10542) && this.field10543.equals(class1932.field10543);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.field10542.hashCode() + this.field10543.hashCode();
    }
    
    @Override
    public int compareTo(final ResourceLocation class1932) {
        int n = this.field10543.compareTo(class1932.field10543);
        if (n == 0) {
            n = this.field10542.compareTo(class1932.field10542);
        }
        return n;
    }
    
    public static ResourceLocation method7799(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        while (stringReader.canRead() && method7800(stringReader.peek())) {
            stringReader.skip();
        }
        final String substring = stringReader.getString().substring(cursor, stringReader.getCursor());
        try {
            return new ResourceLocation(substring);
        }
        catch (final Class2357 class2357) {
            stringReader.setCursor(cursor);
            throw ResourceLocation.field10541.createWithContext(stringReader);
        }
    }
    
    public static boolean method7800(final char c) {
        if (c < '0' || c > '9') {
            if (c < 'a' || c > 'z') {
                if (c != '_') {
                    if (c != ':') {
                        if (c != '/') {
                            if (c != '.') {
                                return c == '-';
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private static boolean method7801(final String s) {
        return s.chars().allMatch(n -> {
            final boolean b;
            if (n != 95) {
                if (n != 45) {
                    if (n < 97 || n > 122) {
                        if (n < 48 || n > 57) {
                            if (n != 47) {
                                if (n != 46) {
                                    return b;
                                }
                            }
                        }
                    }
                }
            }
            return b;
        });
    }
    
    private static boolean method7802(final String s) {
        return s.chars().allMatch(n -> {
            final boolean b;
            if (n != 95) {
                if (n != 45) {
                    if (n < 97 || n > 122) {
                        if (n < 48 || n > 57) {
                            if (n != 46) {
                                return b;
                            }
                        }
                    }
                }
            }
            return b;
        });
    }
    
    public static boolean method7803(final String s) {
        final String[] method7796 = method7796(s, ':');
        return method7802(StringUtils.isEmpty(method7796[0]) ? "minecraft" : method7796[0]) && method7801(method7796[1]);
    }
    
    static {
        field10541 = new SimpleCommandExceptionType(new Class2259("argument.id.invalid", new Object[0]));
    }
}
