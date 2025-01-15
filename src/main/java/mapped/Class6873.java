// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Pattern;
import java.io.StringReader;
import java.io.Reader;
import java.io.InputStream;
import java.util.List;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.ArrayList;

public class Class6873
{
    public final Class8735 field26924;
    private String field26925;
    public Class6586 field26926;
    public Class7354 field26927;
    public Class7902 field26928;
    public Class7898 field26929;
    
    public Class6873() {
        this(new Class6589(), new Class7354(), new Class7902(), new Class7898(), new Class8735());
    }
    
    public Class6873(final Class7902 class7902) {
        this(new Class6589(), new Class7354(), class7902);
    }
    
    public Class6873(final Class7898 class7898) {
        this(new Class6589(), new Class7354(), new Class7902(), class7898);
    }
    
    public Class6873(final Class7354 class7354) {
        this(new Class6589(), class7354);
    }
    
    public Class6873(final Class6586 class6586) {
        this(class6586, new Class7354());
    }
    
    public Class6873(final Class6586 class6586, final Class7354 class6587) {
        this(class6586, class6587, method20987(class6587));
    }
    
    private static Class7902 method20987(final Class7354 class7354) {
        final Class7902 class7355 = new Class7902();
        class7355.method25592(class7354.method22581());
        class7355.method25576(class7354.method22579());
        class7355.method25602(class7354.method22583().method15359());
        class7355.method25604(class7354.method22587());
        return class7355;
    }
    
    public Class6873(final Class7354 class7354, final Class7902 class7355) {
        this(new Class6589(), class7354, class7355, new Class7898(), new Class8735());
    }
    
    public Class6873(final Class6586 class6586, final Class7354 class6587, final Class7902 class6588) {
        this(class6586, class6587, class6588, new Class7898(), new Class8735());
    }
    
    public Class6873(final Class6586 class6586, final Class7354 class6587, final Class7902 class6588, final Class7898 class6589) {
        this(class6586, class6587, class6588, class6589, new Class8735());
    }
    
    public Class6873(final Class6586 class6586, final Class7354 class6587, final Class7902 class6588, final Class8735 class6589) {
        this(class6586, class6587, class6588, new Class7898(), class6589);
    }
    
    public Class6873(final Class6586 field26926, final Class7354 field26927, final Class7902 field26928, final Class7898 field26929, final Class8735 field26930) {
        if (field26926.method20010()) {
            if (!field26927.method22584()) {
                field26927.method22582(field26926.method20008());
            }
        }
        else {
            field26926.method20007(field26927.method22583());
        }
        (this.field26926 = field26926).method20012(field26929.method25565());
        if (field26928.method25578() > field26928.method25580()) {
            field26927.method22580(field26928.method25593());
            field26927.method22578(field26928.method25575());
            field26927.method22583().method15358(field26928.method25601());
            field26927.method22588(field26928.method25603());
            this.field26927 = field26927;
            this.field26928 = field26928;
            this.field26929 = field26929;
            this.field26924 = field26930;
            this.field26925 = "Yaml:" + System.identityHashCode(this);
            return;
        }
        throw new Class2386("Indicator indent must be smaller then indent.");
    }
    
    public String method20988(final Object o) {
        final ArrayList list = new ArrayList(1);
        list.add(o);
        return this.method20990(list.iterator());
    }
    
    public Class7576 method20989(final Object o) {
        return this.field26927.method22572(o);
    }
    
    public String method20990(final Iterator<?> iterator) {
        final StringWriter stringWriter = new StringWriter();
        this.method20993(iterator, stringWriter, null);
        return stringWriter.toString();
    }
    
    public void method20991(final Object o, final Writer writer) {
        final ArrayList list = new ArrayList(1);
        list.add(o);
        this.method20993(list.iterator(), writer, null);
    }
    
    public void method20992(final Iterator<?> iterator, final Writer writer) {
        this.method20993(iterator, writer, null);
    }
    
    private void method20993(final Iterator<?> iterator, final Writer writer, final Class8542 class8542) {
        final Class8084 class8543 = new Class8084(new Class6065(writer, this.field26928), this.field26924, this.field26928, class8542);
        try {
            class8543.method26540();
            while (iterator.hasNext()) {
                class8543.method26542(this.field26927.method22572(iterator.next()));
            }
            class8543.method26541();
        }
        catch (final IOException ex) {
            throw new Class2386(ex);
        }
    }
    
    public String method20994(final Object o, final Class8542 class8542, final Class227 class8543) {
        final Class227 method22581 = this.field26927.method22581();
        if (class8543 != null) {
            this.field26927.method22580(class8543);
        }
        final ArrayList list = new ArrayList(1);
        list.add(o);
        final StringWriter stringWriter = new StringWriter();
        this.method20993(list.iterator(), stringWriter, class8542);
        this.field26927.method22580(method22581);
        return stringWriter.toString();
    }
    
    public String method20995(final Object o) {
        return this.method20994(o, Class8542.field35877, Class227.field801);
    }
    
    public List<Class6287> method20996(final Class7576 class7576) {
        final Class6064 class7577 = new Class6064(null);
        final Class8084 class7578 = new Class8084(class7577, this.field26924, this.field26928, null);
        try {
            class7578.method26540();
            class7578.method26542(class7576);
            class7578.method26541();
        }
        catch (final IOException ex) {
            throw new Class2386(ex);
        }
        return class7577.method18053();
    }
    
    public <T> T method20997(final String s) {
        return (T)this.method21003(new Class8028(s), Object.class);
    }
    
    public <T> T method20998(final InputStream inputStream) {
        return (T)this.method21003(new Class8028(new Class1765(inputStream)), Object.class);
    }
    
    public <T> T method20999(final Reader reader) {
        return (T)this.method21003(new Class8028(reader), Object.class);
    }
    
    public <T> T method21000(final Reader reader, final Class<T> clazz) {
        return (T)this.method21003(new Class8028(reader), clazz);
    }
    
    public <T> T method21001(final String s, final Class<T> clazz) {
        return (T)this.method21003(new Class8028(s), clazz);
    }
    
    public <T> T method21002(final InputStream inputStream, final Class<T> clazz) {
        return (T)this.method21003(new Class8028(new Class1765(inputStream)), clazz);
    }
    
    private Object method21003(final Class8028 class8028, final Class<?> clazz) {
        this.field26926.method19977(new Class8828(new Class7508(class8028), this.field26924));
        return this.field26926.method19980(clazz);
    }
    
    public Iterable<Object> method21004(final Reader reader) {
        this.field26926.method19977(new Class8828(new Class7508(new Class8028(reader)), this.field26924));
        return new Class76(new Class7243(this));
    }
    
    public Iterable<Object> method21005(final String s) {
        return this.method21004(new StringReader(s));
    }
    
    public Iterable<Object> method21006(final InputStream inputStream) {
        return this.method21004(new Class1765(inputStream));
    }
    
    public Class7576 method21007(final Reader reader) {
        return new Class8828(new Class7508(new Class8028(reader)), this.field26924).method30803();
    }
    
    public Iterable<Class7576> method21008(final Reader reader) {
        return new Class78(new Class7241(this, new Class8828(new Class7508(new Class8028(reader)), this.field26924)));
    }
    
    public void method21009(final Class8542 class8542, final Pattern pattern, final String s) {
        this.field26924.method30182(class8542, pattern, s);
    }
    
    @Override
    public String toString() {
        return this.field26925;
    }
    
    public String method21010() {
        return this.field26925;
    }
    
    public void method21011(final String field26925) {
        this.field26925 = field26925;
    }
    
    public Iterable<Class6287> method21012(final Reader reader) {
        return new Class77(new Class7254(this, new Class7508(new Class8028(reader))));
    }
    
    public void method21013(final Class2175 class2175) {
        this.field26926.method20008().method15357(class2175);
        this.field26927.method22583().method15357(class2175);
    }
    
    public void method21014(final Class8051 class8051) {
        this.field26926.method20009(class8051);
        this.field26927.method22589(class8051);
    }
}
