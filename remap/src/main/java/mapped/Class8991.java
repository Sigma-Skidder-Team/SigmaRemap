// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.Charset;
import javax.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.Locale;
import java.util.regex.Pattern;

public final class Class8991
{
    private static final String field37934 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final String field37935 = "\"([^\"]*)\"";
    private static final Pattern field37936;
    private static final Pattern field37937;
    private final String field37938;
    private final String field37939;
    private final String field37940;
    private final String field37941;
    
    private Class8991(final String field37938, final String field37939, final String field37940, final String field37941) {
        this.field37938 = field37938;
        this.field37939 = field37939;
        this.field37940 = field37940;
        this.field37941 = field37941;
    }
    
    @Nullable
    public static Class8991 method32077(final String s) {
        final Matcher matcher = Class8991.field37936.matcher(s);
        if (matcher.lookingAt()) {
            final String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            final String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String anotherString = null;
            final Matcher matcher2 = Class8991.field37937.matcher(s);
            for (int i = matcher.end(); i < s.length(); i = matcher2.end()) {
                matcher2.region(i, s.length());
                if (!matcher2.lookingAt()) {
                    return null;
                }
                final String group = matcher2.group(1);
                if (group != null) {
                    if (group.equalsIgnoreCase("charset")) {
                        final String group2 = matcher2.group(2);
                        String group3;
                        if (group2 == null) {
                            group3 = matcher2.group(3);
                        }
                        else {
                            String substring = null;
                            Label_0233: {
                                if (group2.startsWith("'")) {
                                    if (group2.endsWith("'")) {
                                        if (group2.length() > 2) {
                                            substring = group2.substring(1, group2.length() - 1);
                                            break Label_0233;
                                        }
                                    }
                                }
                                substring = group2;
                            }
                            group3 = substring;
                        }
                        if (anotherString != null && !group3.equalsIgnoreCase(anotherString)) {
                            return null;
                        }
                        anotherString = group3;
                    }
                }
            }
            return new Class8991(s, lowerCase, lowerCase2, anotherString);
        }
        return null;
    }
    
    public String method32078() {
        return this.field37939;
    }
    
    public String method32079() {
        return this.field37940;
    }
    
    @Nullable
    public Charset method32080() {
        return this.method32081(null);
    }
    
    @Nullable
    public Charset method32081(final Charset charset) {
        try {
            return (this.field37941 != null) ? Charset.forName(this.field37941) : charset;
        }
        catch (final IllegalArgumentException ex) {
            return charset;
        }
    }
    
    @Override
    public String toString() {
        return this.field37938;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class8991 && ((Class8991)o).field37938.equals(this.field37938);
    }
    
    @Override
    public int hashCode() {
        return this.field37938.hashCode();
    }
    
    static {
        field37936 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        field37937 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }
}
