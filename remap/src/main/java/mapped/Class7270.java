// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class Class7270 extends Class7266
{
    private static final Pattern field28163;
    private String field28164;
    
    public static Class7266[] method22273(final String s) {
        return method22274(s, Class300.field1733);
    }
    
    public static Class7266[] method22274(final String input, final Class300 class300) {
        final ArrayList list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        Class7270 e = new Class7270();
        final Matcher matcher = Class7270.field28163.matcher(input);
        for (int i = 0; i < input.length(); ++i) {
            final char char1 = input.charAt(i);
            if (char1 == '§') {
                if (++i >= input.length()) {
                    break;
                }
                char char2 = input.charAt(i);
                if (char2 >= 'A' && char2 <= 'Z') {
                    char2 += ' ';
                }
                Class300 method956 = Class300.method956(char2);
                if (method956 != null) {
                    if (sb.length() > 0) {
                        final Class7270 e2 = e;
                        e = new Class7270(e2);
                        e2.method22276(sb.toString());
                        sb = new StringBuilder();
                        list.add(e2);
                    }
                    switch (Class9209.field39012[method956.ordinal()]) {
                        case 1: {
                            e.method22249(true);
                            continue;
                        }
                        case 2: {
                            e.method22250(true);
                            continue;
                        }
                        case 3: {
                            e.method22251(true);
                            continue;
                        }
                        case 4: {
                            e.method22252(true);
                            continue;
                        }
                        case 5: {
                            e.method22253(true);
                            continue;
                        }
                        case 6: {
                            method956 = class300;
                            break;
                        }
                    }
                    e = new Class7270();
                    e.method22248(method956);
                }
            }
            else {
                int n = input.indexOf(32, i);
                if (n == -1) {
                    n = input.length();
                }
                if (matcher.region(i, n).find()) {
                    if (sb.length() > 0) {
                        final Class7270 e3 = e;
                        e = new Class7270(e3);
                        e3.method22276(sb.toString());
                        sb = new StringBuilder();
                        list.add(e3);
                    }
                    final Class7270 class301 = e;
                    final Class7270 e4 = new Class7270(class301);
                    final String substring = input.substring(i, n);
                    e4.method22276(substring);
                    e4.method22255(new Class8698(Class1995.field11176, substring.startsWith("http") ? substring : ("http://" + substring)));
                    list.add(e4);
                    i += n - i - 1;
                    e = class301;
                }
                else {
                    sb.append(char1);
                }
            }
        }
        e.method22276(sb.toString());
        list.add(e);
        return list.toArray(new Class7266[list.size()]);
    }
    
    public Class7270() {
        this.field28164 = "";
    }
    
    public Class7270(final Class7270 class7270) {
        super(class7270);
        this.method22276(class7270.method22275());
    }
    
    public Class7270(final Class7266... a) {
        this.method22276("");
        this.method22242(new ArrayList<Class7266>(Arrays.asList(a)));
    }
    
    @Override
    public Class7266 method22212() {
        return new Class7270(this);
    }
    
    @Override
    public void method22216(final StringBuilder sb) {
        sb.append(this.field28164);
        super.method22216(sb);
    }
    
    @Override
    public void method22217(final StringBuilder sb) {
        sb.append(this.method22230());
        if (this.method22232()) {
            sb.append(Class300.field1735);
        }
        if (this.method22234()) {
            sb.append(Class300.field1738);
        }
        if (this.method22236()) {
            sb.append(Class300.field1737);
        }
        if (this.method22238()) {
            sb.append(Class300.field1736);
        }
        if (this.method22240()) {
            sb.append(Class300.field1734);
        }
        sb.append(this.field28164);
        super.method22217(sb);
    }
    
    @Override
    public String toString() {
        return String.format("TextComponent{text=%s, %s}", this.field28164, super.toString());
    }
    
    public String method22275() {
        return this.field28164;
    }
    
    public void method22276(final String field28164) {
        this.field28164 = field28164;
    }
    
    public Class7270(final String field28164) {
        this.field28164 = field28164;
    }
    
    static {
        field28163 = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,4})(/\\S*)?$");
    }
}
