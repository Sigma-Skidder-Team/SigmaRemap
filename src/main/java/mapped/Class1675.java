// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.LinkedHashMap;
import java.io.File;
import java.util.regex.Pattern;
import java.io.Flushable;
import java.io.Closeable;

public final class Class1675 implements Closeable, Flushable
{
    public static final String field9470 = "journal";
    public static final String field9471 = "journal.tmp";
    public static final String field9472 = "journal.bkp";
    public static final String field9473 = "libcore.io.DiskLruCache";
    public static final String field9474 = "1";
    public static final long field9475 = -1L;
    public static final Pattern field9476;
    private static final String field9477 = "CLEAN";
    private static final String field9478 = "DIRTY";
    private static final String field9479 = "REMOVE";
    private static final String field9480 = "READ";
    public final Class6940 field9481;
    public final File field9482;
    private final File field9483;
    private final File field9484;
    private final File field9485;
    private final int field9486;
    private long field9487;
    public final int field9488;
    private long field9489;
    public Class1679 field9490;
    public final LinkedHashMap<String, Class9067> field9491;
    public int field9492;
    public boolean field9493;
    public boolean field9494;
    public boolean field9495;
    public boolean field9496;
    public boolean field9497;
    private long field9498;
    private final Executor field9499;
    private final Runnable field9500;
    public static final /* synthetic */ boolean field9501;
    
    public Class1675(final Class6940 field9481, final File file, final int field9482, final int field9483, final long field9484, final Executor field9485) {
        this.field9489 = 0L;
        this.field9491 = new LinkedHashMap<String, Class9067>(0, 0.75f, true);
        this.field9498 = 0L;
        this.field9500 = new Class967(this);
        this.field9481 = field9481;
        this.field9482 = file;
        this.field9486 = field9482;
        this.field9483 = new File(file, "journal");
        this.field9484 = new File(file, "journal.tmp");
        this.field9485 = new File(file, "journal.bkp");
        this.field9488 = field9483;
        this.field9487 = field9484;
        this.field9499 = field9485;
    }
    
    public synchronized void method5895() throws IOException {
        if (!Class1675.field9501 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.field9494) {
            return;
        }
        if (this.field9481.method21317(this.field9485)) {
            if (this.field9481.method21317(this.field9483)) {
                this.field9481.method21316(this.field9485);
            }
            else {
                this.field9481.method21319(this.field9485, this.field9483);
            }
        }
        Label_0200: {
            if (this.field9481.method21317(this.field9483)) {
                try {
                    this.method5897();
                    this.method5900();
                    this.field9494 = true;
                    return;
                }
                catch (final IOException ex) {
                    Class6550.method19842().method19846(5, "DiskLruCache " + this.field9482 + " is corrupt: " + ex.getMessage() + ", removing", ex);
                    final Class1675 class1675 = this;
                    class1675.method5916();
                    break Label_0200;
                }
                try {
                    final Class1675 class1675 = this;
                    class1675.method5916();
                }
                finally {
                    this.field9495 = false;
                }
            }
        }
        this.method5901();
        this.field9494 = true;
    }
    
    public static Class1675 method5896(final Class6940 class6940, final File file, final int n, final int n2, final long n3) {
        if (n3 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (n2 > 0) {
            return new Class1675(class6940, file, n, n2, n3, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Class7690.method24439("OkHttp DiskLruCache", true)));
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }
    
    private void method5897() throws IOException {
        final Class1681 method30275 = Class8753.method30275(this.field9481.method21313(this.field9483));
        try {
            final String method30276 = method30275.method5985();
            final String method30277 = method30275.method5985();
            final String method30278 = method30275.method5985();
            final String method30279 = method30275.method5985();
            final String method30280 = method30275.method5985();
            if (!"libcore.io.DiskLruCache".equals(method30276) || !"1".equals(method30277) || !Integer.toString(this.field9486).equals(method30278) || !Integer.toString(this.field9488).equals(method30279) || !"".equals(method30280)) {
                throw new IOException("unexpected journal header: [" + method30276 + ", " + method30277 + ", " + method30279 + ", " + method30280 + "]");
            }
            int n = 0;
            try {
                while (true) {
                    this.method5899(method30275.method5985());
                    ++n;
                }
            }
            catch (final EOFException ex) {
                this.field9492 = n - this.field9491.size();
                if (!method30275.method5951()) {
                    this.method5901();
                }
                else {
                    this.field9490 = this.method5898();
                }
            }
        }
        finally {
            Class7690.method24432(method30275);
        }
    }
    
    private Class1679 method5898() throws FileNotFoundException {
        return Class8753.method30276(new Class1706(this, this.field9481.method21315(this.field9483)));
    }
    
    private void method5899(final String s) throws IOException {
        final int index = s.indexOf(32);
        if (index != -1) {
            final int beginIndex = index + 1;
            final int index2 = s.indexOf(32, beginIndex);
            String key;
            if (index2 != -1) {
                key = s.substring(beginIndex, index2);
            }
            else {
                key = s.substring(beginIndex);
                if (index == "REMOVE".length()) {
                    if (s.startsWith("REMOVE")) {
                        this.field9491.remove(key);
                        return;
                    }
                }
            }
            Class9067 value = this.field9491.get(key);
            if (value == null) {
                value = new Class9067(this, key);
                this.field9491.put(key, value);
            }
            if (index2 != -1) {
                if (index == "CLEAN".length()) {
                    if (s.startsWith("CLEAN")) {
                        final String[] split = s.substring(index2 + 1).split(" ");
                        value.field38403 = true;
                        value.field38404 = null;
                        value.method32658(split);
                        return;
                    }
                }
            }
            if (index2 == -1) {
                if (index == "DIRTY".length()) {
                    if (s.startsWith("DIRTY")) {
                        value.field38404 = new Class9541(this, value);
                        return;
                    }
                }
            }
            if (index2 == -1) {
                if (index == "READ".length()) {
                    if (s.startsWith("READ")) {
                        return;
                    }
                }
            }
            throw new IOException("unexpected journal line: " + s);
        }
        throw new IOException("unexpected journal line: " + s);
    }
    
    private void method5900() throws IOException {
        this.field9481.method21316(this.field9484);
        final Iterator<Class9067> iterator = this.field9491.values().iterator();
        while (iterator.hasNext()) {
            final Class9067 class9067 = iterator.next();
            if (class9067.field38404 != null) {
                class9067.field38404 = null;
                for (int i = 0; i < this.field9488; ++i) {
                    this.field9481.method21316(class9067.field38401[i]);
                    this.field9481.method21316(class9067.field38402[i]);
                }
                iterator.remove();
            }
            else {
                for (int j = 0; j < this.field9488; ++j) {
                    this.field9489 += class9067.field38400[j];
                }
            }
        }
    }
    
    public synchronized void method5901() throws IOException {
        if (this.field9490 != null) {
            this.field9490.close();
        }
        final Class1679 method30276 = Class8753.method30276(this.field9481.method21314(this.field9484));
        try {
            method30276.method5932("libcore.io.DiskLruCache").method5937(10);
            method30276.method5932("1").method5937(10);
            method30276.method5944(this.field9486).method5937(10);
            method30276.method5944(this.field9488).method5937(10);
            method30276.method5937(10);
            for (final Class9067 class9067 : this.field9491.values()) {
                if (class9067.field38404 != null) {
                    method30276.method5932("DIRTY").method5937(32);
                    method30276.method5932(class9067.field38399);
                    method30276.method5937(10);
                }
                else {
                    method30276.method5932("CLEAN").method5937(32);
                    method30276.method5932(class9067.field38399);
                    class9067.method32659(method30276);
                    method30276.method5937(10);
                }
            }
        }
        finally {
            method30276.close();
        }
        if (this.field9481.method21317(this.field9483)) {
            this.field9481.method21319(this.field9483, this.field9485);
        }
        this.field9481.method21319(this.field9484, this.field9483);
        this.field9481.method21316(this.field9485);
        this.field9490 = this.method5898();
        this.field9493 = false;
        this.field9497 = false;
    }
    
    public synchronized Class1668 method5902(final String key) throws IOException {
        this.method5895();
        this.method5914();
        this.method5918(key);
        final Class9067 class9067 = this.field9491.get(key);
        if (class9067 == null || !class9067.field38403) {
            return null;
        }
        final Class1668 method32661 = class9067.method32661();
        if (method32661 != null) {
            ++this.field9492;
            this.field9490.method5932("READ").method5937(32).method5932(key).method5937(10);
            if (this.method5910()) {
                this.field9499.execute(this.field9500);
            }
            return method32661;
        }
        return null;
    }
    
    @Nullable
    public Class9541 method5903(final String s) throws IOException {
        return this.method5904(s, -1L);
    }
    
    public synchronized Class9541 method5904(final String s, final long n) throws IOException {
        this.method5895();
        this.method5914();
        this.method5918(s);
        Class9067 value = this.field9491.get(s);
        if (n != -1L && (value == null || value.field38405 != n)) {
            return null;
        }
        if (value != null && value.field38404 != null) {
            return null;
        }
        if (this.field9496 || this.field9497) {
            this.field9499.execute(this.field9500);
            return null;
        }
        this.field9490.method5932("DIRTY").method5937(32).method5932(s).method5937(10);
        this.field9490.flush();
        if (!this.field9493) {
            if (value == null) {
                value = new Class9067(this, s);
                this.field9491.put(s, value);
            }
            return value.field38404 = new Class9541(this, value);
        }
        return null;
    }
    
    public File method5905() {
        return this.field9482;
    }
    
    public synchronized long method5906() {
        return this.field9487;
    }
    
    public synchronized void method5907(final long field9487) {
        this.field9487 = field9487;
        if (this.field9494) {
            this.field9499.execute(this.field9500);
        }
    }
    
    public synchronized long method5908() throws IOException {
        this.method5895();
        return this.field9489;
    }
    
    public synchronized void method5909(final Class9541 class9541, final boolean b) throws IOException {
        final Class9067 field41072 = class9541.field41072;
        if (field41072.field38404 == class9541) {
            if (b) {
                if (!field41072.field38403) {
                    for (int i = 0; i < this.field9488; ++i) {
                        if (!class9541.field41073[i]) {
                            class9541.method35622();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        }
                        if (!this.field9481.method21317(field41072.field38402[i])) {
                            class9541.method35622();
                            return;
                        }
                    }
                }
            }
            for (int j = 0; j < this.field9488; ++j) {
                final File file = field41072.field38402[j];
                if (!b) {
                    this.field9481.method21316(file);
                }
                else if (this.field9481.method21317(file)) {
                    final File file2 = field41072.field38401[j];
                    this.field9481.method21319(file, file2);
                    final long n = field41072.field38400[j];
                    final long method21318 = this.field9481.method21318(file2);
                    field41072.field38400[j] = method21318;
                    this.field9489 = this.field9489 - n + method21318;
                }
            }
            ++this.field9492;
            field41072.field38404 = null;
            if (!(field41072.field38403 | b)) {
                this.field9491.remove(field41072.field38399);
                this.field9490.method5932("REMOVE").method5937(32);
                this.field9490.method5932(field41072.field38399);
                this.field9490.method5937(10);
            }
            else {
                field41072.field38403 = true;
                this.field9490.method5932("CLEAN").method5937(32);
                this.field9490.method5932(field41072.field38399);
                field41072.method32659(this.field9490);
                this.field9490.method5937(10);
                if (b) {
                    field41072.field38405 = this.field9498++;
                }
            }
            this.field9490.flush();
            if (this.field9489 > this.field9487 || this.method5910()) {
                this.field9499.execute(this.field9500);
            }
            return;
        }
        throw new IllegalStateException();
    }
    
    public boolean method5910() {
        return this.field9492 >= 2000 && this.field9492 >= this.field9491.size();
    }
    
    public synchronized boolean method5911(final String key) throws IOException {
        this.method5895();
        this.method5914();
        this.method5918(key);
        final Class9067 class9067 = this.field9491.get(key);
        if (class9067 != null) {
            final boolean method5912 = this.method5912(class9067);
            if (method5912) {
                if (this.field9489 <= this.field9487) {
                    this.field9496 = false;
                }
            }
            return method5912;
        }
        return false;
    }
    
    public boolean method5912(final Class9067 class9067) throws IOException {
        if (class9067.field38404 != null) {
            class9067.field38404.method35618();
        }
        for (int i = 0; i < this.field9488; ++i) {
            this.field9481.method21316(class9067.field38401[i]);
            this.field9489 -= class9067.field38400[i];
            class9067.field38400[i] = 0L;
        }
        ++this.field9492;
        this.field9490.method5932("REMOVE").method5937(32).method5932(class9067.field38399).method5937(10);
        this.field9491.remove(class9067.field38399);
        if (this.method5910()) {
            this.field9499.execute(this.field9500);
        }
        return true;
    }
    
    public synchronized boolean method5913() {
        return this.field9495;
    }
    
    private synchronized void method5914() {
        if (!this.method5913()) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }
    
    @Override
    public synchronized void flush() throws IOException {
        if (this.field9494) {
            this.method5914();
            this.method5915();
            this.field9490.flush();
        }
    }
    
    @Override
    public synchronized void close() throws IOException {
        if (this.field9494 && !this.field9495) {
            for (final Class9067 class9067 : this.field9491.values().toArray(new Class9067[this.field9491.size()])) {
                if (class9067.field38404 != null) {
                    class9067.field38404.method35622();
                }
            }
            this.method5915();
            this.field9490.close();
            this.field9490 = null;
            this.field9495 = true;
            return;
        }
        this.field9495 = true;
    }
    
    public void method5915() throws IOException {
        while (this.field9489 > this.field9487) {
            this.method5912(this.field9491.values().iterator().next());
        }
        this.field9496 = false;
    }
    
    public void method5916() throws IOException {
        this.close();
        this.field9481.method21320(this.field9482);
    }
    
    public synchronized void method5917() throws IOException {
        this.method5895();
        final Class9067[] array = this.field9491.values().toArray(new Class9067[this.field9491.size()]);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.method5912(array[i]);
        }
        this.field9496 = false;
    }
    
    private void method5918(final String s) {
        if (Class1675.field9476.matcher(s).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + s + "\"");
    }
    
    public synchronized Iterator<Class1668> method5919() throws IOException {
        this.method5895();
        return new Class7242(this);
    }
    
    static {
        field9501 = !Class1675.class.desiredAssertionStatus();
        field9476 = Pattern.compile("[a-z0-9_-]{1,120}");
    }
}
