// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.List;
import java.net.Proxy;

public class Class6794
{
    private String field26708;
    private int field26709;
    private Proxy field26710;
    private List<Class8821> field26711;
    private List<Class8821> field26712;
    private Socket field26713;
    private InputStream field26714;
    private OutputStream field26715;
    private Class919 field26716;
    private Class910 field26717;
    private int field26718;
    private boolean field26719;
    private long field26720;
    private int field26721;
    private long field26722;
    private boolean field26723;
    private static final String field26724 = "\n";
    public static final int field26725 = 5000;
    public static final int field26726 = 5000;
    private static final Pattern field26727;
    
    public Class6794(final String s, final int n) {
        this(s, n, Proxy.NO_PROXY);
    }
    
    public Class6794(final String field26708, final int field26709, final Proxy field26710) {
        this.field26708 = null;
        this.field26709 = 0;
        this.field26710 = Proxy.NO_PROXY;
        this.field26711 = new LinkedList<Class8821>();
        this.field26712 = new LinkedList<Class8821>();
        this.field26713 = null;
        this.field26714 = null;
        this.field26715 = null;
        this.field26716 = null;
        this.field26717 = null;
        this.field26718 = 0;
        this.field26719 = false;
        this.field26720 = 5000L;
        this.field26721 = 1000;
        this.field26722 = System.currentTimeMillis();
        this.field26723 = false;
        this.field26708 = field26708;
        this.field26709 = field26709;
        this.field26710 = field26710;
        (this.field26716 = new Class919(this)).start();
        (this.field26717 = new Class910(this)).start();
    }
    
    public synchronized boolean method20797(final Class8821 class8821) {
        if (!this.method20816()) {
            this.method20798(class8821, this.field26711);
            this.method20798(class8821, this.field26712);
            ++this.field26718;
            return true;
        }
        return false;
    }
    
    private void method20798(final Class8821 class8821, final List<Class8821> list) {
        list.add(class8821);
        this.notifyAll();
    }
    
    public synchronized void method20799(final Socket field26713) throws IOException {
        if (!this.field26723) {
            if (this.field26713 != null) {
                throw new IllegalArgumentException("Already connected");
            }
            (this.field26713 = field26713).setTcpNoDelay(true);
            this.field26714 = this.field26713.getInputStream();
            this.field26715 = new BufferedOutputStream(this.field26713.getOutputStream());
            this.method20806();
            this.notifyAll();
        }
    }
    
    public synchronized OutputStream method20800() throws IOException, InterruptedException {
        while (this.field26715 == null) {
            this.method20805();
            this.wait(1000L);
        }
        return this.field26715;
    }
    
    public synchronized InputStream method20801() throws IOException, InterruptedException {
        while (this.field26714 == null) {
            this.method20805();
            this.wait(1000L);
        }
        return this.field26714;
    }
    
    public synchronized Class8821 method20802() throws InterruptedException, IOException {
        if (this.field26712.size() <= 0) {
            if (this.field26715 != null) {
                this.field26715.flush();
            }
        }
        return this.method20804(this.field26712, true);
    }
    
    public synchronized Class8821 method20803() throws InterruptedException {
        return this.method20804(this.field26711, false);
    }
    
    private Class8821 method20804(final List<Class8821> list, final boolean b) throws InterruptedException {
        while (list.size() <= 0) {
            this.method20805();
            this.wait(1000L);
        }
        this.method20806();
        return b ? list.remove(0) : list.get(0);
    }
    
    private void method20805() {
        if (this.field26713 != null) {
            long field26720 = this.field26720;
            if (this.field26711.size() > 0) {
                field26720 = 5000L;
            }
            if (System.currentTimeMillis() > this.field26722 + field26720) {
                this.method20814(new InterruptedException("Timeout " + field26720));
            }
        }
    }
    
    private void method20806() {
        this.field26722 = System.currentTimeMillis();
    }
    
    public synchronized void method20807(final Class8821 class8821) {
        if (!this.field26723) {
            this.method20806();
        }
    }
    
    public synchronized void method20808(final Class8821 obj, final Class8215 class8215) {
        if (!this.field26723) {
            this.field26719 = true;
            this.method20806();
            if (this.field26711.size() <= 0 || this.field26711.get(0) != obj) {
                throw new IllegalArgumentException("Response out of order: " + obj);
            }
            this.field26711.remove(0);
            obj.method30771(true);
            final String method27219 = class8215.method27219("Location");
            if (class8215.method27216() / 100 == 3 && method27219 != null && obj.method30768().method26858() < 5) {
                try {
                    final Class8153 method27220 = Class6579.method19919(this.method20809(method27219, obj.method30768()), obj.method30768().method26860());
                    method27220.method26859(obj.method30768().method26858() + 1);
                    Class6579.method19920(new Class8821(method27220, obj.method30769()));
                }
                catch (final IOException ex) {
                    obj.method30769().method30753(obj.method30768(), ex);
                }
            }
            else {
                obj.method30769().method30752(obj.method30768(), class8215);
            }
            this.method20810(class8215);
        }
    }
    
    private String method20809(final String str, final Class8153 class8153) {
        if (Class6794.field26727.matcher(str).matches()) {
            return str;
        }
        if (str.startsWith("//")) {
            return "http:" + str;
        }
        String s = class8153.method26851();
        if (class8153.method26852() != 80) {
            s = s + ":" + class8153.method26852();
        }
        if (!str.startsWith("/")) {
            final String method26854 = class8153.method26854();
            final int lastIndex = method26854.lastIndexOf("/");
            return (lastIndex < 0) ? ("http://" + s + "/" + str) : ("http://" + s + method26854.substring(0, lastIndex + 1) + str);
        }
        return "http://" + s + str;
    }
    
    private void method20810(final Class8215 class8215) {
        final String method27219 = class8215.method27219("Connection");
        if (method27219 != null) {
            if (!method27219.toLowerCase().equals("keep-alive")) {
                this.method20814(new EOFException("Connection not keep-alive"));
            }
        }
        final String method27220 = class8215.method27219("Keep-Alive");
        if (method27220 != null) {
            final String[] method27221 = Class8571.method28937(method27220, ",;");
            for (int i = 0; i < method27221.length; ++i) {
                final String[] method27222 = this.method20811(method27221[i], '=');
                if (method27222.length >= 2) {
                    if (method27222[0].equals("timeout")) {
                        final int method27223 = Class8571.method28933(method27222[1], -1);
                        if (method27223 > 0) {
                            this.field26720 = method27223 * 1000;
                        }
                    }
                    if (method27222[0].equals("max")) {
                        final int method27224 = Class8571.method28933(method27222[1], -1);
                        if (method27224 > 0) {
                            this.field26721 = method27224;
                        }
                    }
                }
            }
        }
    }
    
    private String[] method20811(final String s, final char ch) {
        final int index = s.indexOf(ch);
        if (index >= 0) {
            return new String[] { s.substring(0, index), s.substring(index + 1) };
        }
        return new String[] { s };
    }
    
    public synchronized void method20812(final Class8821 class8821, final Exception ex) {
        this.method20814(ex);
    }
    
    public synchronized void method20813(final Class8821 class8821, final Exception ex) {
        this.method20814(ex);
    }
    
    private synchronized void method20814(final Exception ex) {
        if (!this.field26723) {
            this.field26723 = true;
            this.method20815(ex);
            if (this.field26716 != null) {
                this.field26716.interrupt();
            }
            if (this.field26717 != null) {
                this.field26717.interrupt();
            }
            try {
                if (this.field26713 != null) {
                    this.field26713.close();
                }
            }
            catch (final IOException ex2) {}
            this.field26713 = null;
            this.field26714 = null;
            this.field26715 = null;
        }
    }
    
    private void method20815(final Exception ex) {
        if (this.field26711.size() > 0) {
            if (!this.field26719) {
                final Class8821 class8821 = this.field26711.remove(0);
                class8821.method30769().method30753(class8821.method30768(), ex);
                class8821.method30771(true);
            }
            while (this.field26711.size() > 0) {
                Class6579.method19920(this.field26711.remove(0));
            }
        }
    }
    
    public synchronized boolean method20816() {
        return this.field26723 || this.field26718 >= this.field26721;
    }
    
    public int method20817() {
        return this.field26718;
    }
    
    public synchronized boolean method20818() {
        return this.field26711.size() > 0;
    }
    
    public String method20819() {
        return this.field26708;
    }
    
    public int method20820() {
        return this.field26709;
    }
    
    public Proxy method20821() {
        return this.field26710;
    }
    
    static {
        field26727 = Pattern.compile("^[a-zA-Z]+://.*");
    }
}
