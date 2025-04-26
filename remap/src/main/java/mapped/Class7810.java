// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.OkHttpClient;

import java.net.ProtocolException;
import java.util.Locale;
import java.util.ArrayList;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.List;

public final class Class7810 implements Class7811
{
    private static final Class1929 field31988;
    private static final Class1929 field31989;
    private static final Class1929 field31990;
    private static final Class1929 field31991;
    private static final Class1929 field31992;
    private static final Class1929 field31993;
    private static final Class1929 field31994;
    private static final Class1929 field31995;
    private static final List<Class1929> field31996;
    private static final List<Class1929> field31997;
    private final OkHttpClient field31998;
    public final StreamAllocation field31999;
    private final Class1758 field32000;
    private Class8082 field32001;
    
    public Class7810(final OkHttpClient field31998, final StreamAllocation field31999, final Class1758 field32000) {
        this.field31998 = field31998;
        this.field31999 = field31999;
        this.field32000 = field32000;
    }
    
    @Override
    public Class1676 method25220(final Request request, final long n) {
        return this.field32001.method26528();
    }
    
    @Override
    public void method25221(final Request request) throws IOException {
        if (this.field32001 == null) {
            this.field32001 = this.field32000.method6240(method25225(request), request.method29114() != null);
            this.field32001.method26525().method26297(this.field31998.method9390(), TimeUnit.MILLISECONDS);
            this.field32001.method26526().method26297(this.field31998.method9391(), TimeUnit.MILLISECONDS);
        }
    }
    
    @Override
    public void method25222() throws IOException {
        this.field32000.method6252();
    }
    
    @Override
    public void method25223() throws IOException {
        this.field32001.method26528().close();
    }
    
    @Override
    public Class9189 method25224(final boolean b) throws IOException {
        final Class9189 method25226 = method25226(this.field32001.method26522());
        if (b && Class9013.field38043.method32273(method25226) == 100) {
            return null;
        }
        return method25226;
    }
    
    public static List<Class8975> method25225(final Request request) {
        final Class6957 method29111 = request.method29111();
        final ArrayList list = new ArrayList(method29111.method21362() + 4);
        list.add((Object)new Class8975(Class8975.field37836, request.method29110()));
        list.add((Object)new Class8975(Class8975.field37837, Class7621.method23958(request.url())));
        final String method29112 = request.method29112("Host");
        if (method29112 != null) {
            list.add((Object)new Class8975(Class8975.field37839, method29112));
        }
        list.add((Object)new Class8975(Class8975.field37838, request.url().method30930()));
        for (int i = 0; i < method29111.method21362(); ++i) {
            final Class1929 method29113 = Class1929.method7741(method29111.method21363(i).toLowerCase(Locale.US));
            if (!Class7810.field31996.contains(method29113)) {
                list.add((Object)new Class8975(method29113, method29111.method21364(i)));
            }
        }
        return (List<Class8975>)list;
    }
    
    public static Class9189 method25226(final List<Class8975> list) throws IOException {
        Class8482 method28317 = null;
        Class8640 class8640 = new Class8640();
        for (int i = 0; i < list.size(); ++i) {
            final Class8975 class8641 = list.get(i);
            if (class8641 != null) {
                final Class1929 field37840 = class8641.field37840;
                final String method28318 = class8641.field37841.method7743();
                if (!field37840.equals(Class8975.field37835)) {
                    if (!Class7810.field31997.contains(field37840)) {
                        Class9013.field38043.method32265(class8640, field37840.method7743(), method28318);
                    }
                }
                else {
                    method28317 = Class8482.method28317("HTTP/1.1 " + method28318);
                }
            }
            else if (method28317 != null) {
                if (method28317.field34807 == 100) {
                    method28317 = null;
                    class8640 = new Class8640();
                }
            }
        }
        if (method28317 != null) {
            return new Class9189().method33596(Class190.field625).method33597(method28317.field34807).method33598(method28317.field34808).method33603(class8640.method29384());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }
    
    @Override
    public Class1760 method25227(final Response class1753) throws IOException {
        return new Class1761(class1753.method6195(), Class8753.method30275(new Class1695(this, this.field32001.method26527())));
    }
    
    @Override
    public void method25228() {
        if (this.field32001 != null) {
            this.field32001.method26530(Class2082.field12044);
        }
    }
    
    static {
        field31988 = Class1929.method7741("connection");
        field31989 = Class1929.method7741("host");
        field31990 = Class1929.method7741("keep-alive");
        field31991 = Class1929.method7741("proxy-connection");
        field31992 = Class1929.method7741("transfer-encoding");
        field31993 = Class1929.method7741("te");
        field31994 = Class1929.method7741("encoding");
        field31995 = Class1929.method7741("upgrade");
        field31996 = Class7690.method24438(Class7810.field31988, Class7810.field31989, Class7810.field31990, Class7810.field31991, Class7810.field31993, Class7810.field31992, Class7810.field31994, Class7810.field31995, Class8975.field37836, Class8975.field37837, Class8975.field37838, Class8975.field37839);
        field31997 = Class7690.method24438(Class7810.field31988, Class7810.field31989, Class7810.field31990, Class7810.field31991, Class7810.field31993, Class7810.field31992, Class7810.field31994, Class7810.field31995);
    }
}
