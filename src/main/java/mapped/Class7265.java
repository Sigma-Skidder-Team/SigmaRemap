// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class Class7265 extends Class7266
{
    private final Pattern field28144;
    private String field28145;
    private List<Class7266> field28146;
    
    public Class7265(final Class7265 class7265) {
        super(class7265);
        this.field28144 = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
        this.method22222(class7265.method22220());
        if (class7265.method22221() != null) {
            final ArrayList list = new ArrayList();
            final Iterator<Class7266> iterator = class7265.method22221().iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().method22212());
            }
            this.method22213(list);
        }
    }
    
    public Class7265(final String s, final Object... array) {
        this.field28144 = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
        this.method22222(s);
        if (array != null) {
            if (array.length != 0) {
                final ArrayList list = new ArrayList();
                for (final Object obj : array) {
                    if (!(obj instanceof Class7266)) {
                        list.add(new Class7270(String.valueOf(obj)));
                    }
                    else {
                        list.add(obj);
                    }
                }
                this.method22213(list);
            }
        }
    }
    
    @Override
    public Class7266 method22212() {
        return new Class7265(this);
    }
    
    public void method22213(final List<Class7266> field28146) {
        final Iterator<Class7266> iterator = field28146.iterator();
        while (iterator.hasNext()) {
            iterator.next().field28147 = this;
        }
        this.field28146 = field28146;
    }
    
    public void method22214(final String s) {
        this.method22215(new Class7270(s));
    }
    
    public void method22215(final Class7266 class7266) {
        if (this.field28146 == null) {
            this.field28146 = new ArrayList<Class7266>();
        }
        class7266.field28147 = this;
        this.field28146.add(class7266);
    }
    
    @Override
    public void method22216(final StringBuilder sb) {
        final String method25737 = Class7936.field32604.method25737(this.field28145);
        final Matcher matcher = this.field28144.matcher(method25737);
        int end = 0;
        int n = 0;
        while (matcher.find(end)) {
            final int start = matcher.start();
            if (start != end) {
                sb.append(method25737.substring(end, start));
            }
            end = matcher.end();
            switch (matcher.group(2).charAt(0)) {
                case 'd':
                case 's': {
                    final String group = matcher.group(1);
                    this.field28146.get((group != null) ? (Integer.parseInt(group) - 1) : n++).method22216(sb);
                    continue;
                }
                case '%': {
                    sb.append('%');
                    continue;
                }
            }
        }
        if (method25737.length() != end) {
            sb.append(method25737.substring(end, method25737.length()));
        }
        super.method22216(sb);
    }
    
    @Override
    public void method22217(final StringBuilder sb) {
        final String method25737 = Class7936.field32604.method25737(this.field28145);
        final Matcher matcher = this.field28144.matcher(method25737);
        int end = 0;
        int n = 0;
        while (matcher.find(end)) {
            final int start = matcher.start();
            if (start != end) {
                this.method22218(sb);
                sb.append(method25737.substring(end, start));
            }
            end = matcher.end();
            switch (matcher.group(2).charAt(0)) {
                case 'd':
                case 's': {
                    final String group = matcher.group(1);
                    this.field28146.get((group != null) ? (Integer.parseInt(group) - 1) : n++).method22217(sb);
                    continue;
                }
                case '%': {
                    this.method22218(sb);
                    sb.append('%');
                    continue;
                }
            }
        }
        if (method25737.length() != end) {
            this.method22218(sb);
            sb.append(method25737.substring(end, method25737.length()));
        }
        super.method22217(sb);
    }
    
    private void method22218(final StringBuilder sb) {
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
    }
    
    public Pattern method22219() {
        return this.field28144;
    }
    
    public String method22220() {
        return this.field28145;
    }
    
    public List<Class7266> method22221() {
        return this.field28146;
    }
    
    public void method22222(final String field28145) {
        this.field28145 = field28145;
    }
    
    @Override
    public String toString() {
        return "TranslatableComponent(format=" + this.method22219() + ", translate=" + this.method22220() + ", with=" + this.method22221() + ")";
    }
    
    public Class7265() {
        this.field28144 = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
    }
}
