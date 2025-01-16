// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.InputStream;
import org.apache.commons.compress.utils.IOUtils;
import java.io.FileInputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import com.google.common.util.concurrent.RateLimiter;
import org.apache.logging.log4j.Logger;

public class Class5086 extends RealmsScreen
{
    private static final Logger field21939;
    private final Class5078 field21940;
    private final Class1951 field21941;
    private final long field21942;
    private final int field21943;
    private final Class8908 field21944;
    private final RateLimiter field21945;
    private volatile String field21946;
    private volatile String field21947;
    private volatile String field21948;
    private volatile boolean field21949;
    private volatile boolean field21950;
    private volatile boolean field21951;
    private volatile boolean field21952;
    private Class5611 field21953;
    private Class5611 field21954;
    private int field21955;
    private static final String[] field21956;
    private int field21957;
    private Long field21958;
    private Long field21959;
    private long field21960;
    private static final ReentrantLock field21961;
    
    public Class5086(final long field21942, final int field21943, final Class5078 field21944, final Class1951 field21945) {
        this.field21951 = true;
        this.field21942 = field21942;
        this.field21943 = field21943;
        this.field21940 = field21944;
        this.field21941 = field21945;
        this.field21944 = new Class8908();
        this.field21945 = RateLimiter.create(0.10000000149011612);
    }
    
    @Override
    public void init() {
        this.method15444(true);
        this.field21953 = new Class5662(this, 1, this.width() / 2 - 100, this.height() - 42, 200, 20, RealmsScreen.getLocalizedString("gui.back"));
        this.buttonsAdd(this.field21954 = new Class5676(this, 0, this.width() / 2 - 100, this.height() - 42, 200, 20, RealmsScreen.getLocalizedString("gui.cancel")));
        if (!this.field21952) {
            if (this.field21940.field21818 != -1) {
                this.field21940.method15727(this);
            }
            else {
                this.method15921();
            }
        }
    }
    
    @Override
    public void confirmResult(final boolean b, final int n) {
        if (b) {
            if (!this.field21952) {
                this.field21952 = true;
                Realms.setScreen(this);
                this.method15921();
            }
        }
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    private void method15911() {
        this.field21940.confirmResult(true, 0);
    }
    
    private void method15912() {
        this.field21949 = true;
        Realms.setScreen(this.field21940);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        if (!this.field21951) {
            this.method15911();
        }
        else {
            this.method15912();
        }
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        if (!this.field21950) {
            if (this.field21944.field37451 != 0L) {
                if (this.field21944.field37451 == this.field21944.field37452) {
                    this.field21947 = RealmsScreen.getLocalizedString("mco.upload.verifying");
                    this.field21954.method16917(false);
                }
            }
        }
        this.drawCenteredString(this.field21947, this.width() / 2, 50, 16777215);
        if (this.field21951) {
            this.method15913();
        }
        if (this.field21944.field37451 != 0L) {
            if (!this.field21949) {
                this.method15914();
                this.method15915();
            }
        }
        if (this.field21946 != null) {
            final String[] split = this.field21946.split("\\\\n");
            for (int i = 0; i < split.length; ++i) {
                this.drawCenteredString(split[i], this.width() / 2, 110 + 12 * i, 16711680);
            }
        }
        super.render(n, n2, n3);
    }
    
    private void method15913() {
        final int method15424 = this.method15424(this.field21947);
        if (this.field21955 % 10 == 0) {
            ++this.field21957;
        }
        this.method15407(Class5086.field21956[this.field21957 % Class5086.field21956.length], this.width() / 2 + method15424 / 2 + 5, 50, 16777215);
    }
    
    private void method15914() {
        double d = this.field21944.field37451 / (double)this.field21944.field37452 * 100.0;
        if (d > 100.0) {
            d = 100.0;
        }
        this.field21948 = String.format(Locale.ROOT, "%.1f", d);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.disableTexture();
        final double n = this.width() / 2 - 100;
        final Class7710 field30674 = Class7710.field30674;
        field30674.method24611(7, Class7785.field31865);
        field30674.method24610(n - 0.5, 95.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0 + 0.5, 95.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0 + 0.5, 79.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n - 0.5, 79.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n, 95.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0, 95.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0, 80.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24610(n, 80.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24609();
        RenderSystem.enableTexture();
        this.drawCenteredString(this.field21948 + " %", this.width() / 2, 84, 16777215);
    }
    
    private void method15915() {
        if (this.field21955 % 20 != 0) {
            this.method15916(this.field21960);
        }
        else {
            if (this.field21958 != null) {
                long n = System.currentTimeMillis() - this.field21959;
                if (n == 0L) {
                    n = 1L;
                }
                this.method15916(this.field21960 = 1000L * (this.field21944.field37451 - this.field21958) / n);
            }
            this.field21958 = this.field21944.field37451;
            this.field21959 = System.currentTimeMillis();
        }
    }
    
    private void method15916(final long n) {
        if (n > 0L) {
            this.method15407("(" + method15917(n) + ")", this.width() / 2 + this.method15424(this.field21948) / 2 + 15, 84, 16777215);
        }
    }
    
    public static String method15917(final long lng) {
        if (lng >= 1024L) {
            final int n = (int)(Math.log((double)lng) / Math.log(1024.0));
            return String.format(Locale.ROOT, "%.1f %sB/s", lng / Math.pow(1024.0, n), "KMGTPE".charAt(n - 1) + "");
        }
        return lng + " B";
    }
    
    @Override
    public void tick() {
        super.tick();
        ++this.field21955;
        if (this.field21947 != null) {
            if (this.field21945.tryAcquire(1)) {
                final ArrayList arrayList = Lists.newArrayList();
                arrayList.add(this.field21947);
                if (this.field21948 != null) {
                    arrayList.add(this.field21948 + "%");
                }
                if (this.field21946 != null) {
                    arrayList.add(this.field21946);
                }
                Realms.narrateNow(String.join(System.lineSeparator(), arrayList));
            }
        }
    }
    
    public static Class2121 method15918(final long n) {
        if (n < 1024L) {
            return Class2121.field12366;
        }
        final String string = "KMGTPE".charAt((int)(Math.log((double)n) / Math.log(1024.0)) - 1) + "";
        try {
            return Class2121.valueOf(string + "B");
        }
        catch (final Exception ex) {
            return Class2121.field12369;
        }
    }
    
    public static double method15919(final long n, final Class2121 class2121) {
        return class2121.equals(Class2121.field12366) ? ((double)n) : (n / Math.pow(1024.0, class2121.ordinal()));
    }
    
    public static String method15920(final long n, final Class2121 class2121) {
        return String.format("%." + (class2121.equals(Class2121.field12369) ? "1" : "0") + "f %s", method15919(n, class2121), class2121.name());
    }
    
    private void method15921() {
        this.field21952 = true;
        new Thread(() -> {
            RealmsClient.func_224911_a();
            final long field21942 = this.field21942;
            try {
                if (Class5086.field21961.tryLock(1L, TimeUnit.SECONDS)) {
                    this.field21947 = RealmsScreen.getLocalizedString("mco.upload.preparing");
                    int i = 0;
                    final File file;
                    Class7444 method35477 = null;
                    while (i < 20) {
                        try {
                            if (this.field21949) {
                                this.method15922();
                                this.field21950 = true;
                                if (Class5086.field21961.isHeldByCurrentThread()) {
                                    Class5086.field21961.unlock();
                                    this.field21951 = false;
                                    this.method15427();
                                    this.buttonsAdd(this.field21953);
                                    if (file != null) {
                                        Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                        file.delete();
                                    }
                                }
                                return;
                            }
                            else {
                                final RealmsClient class9513;
                                method35477 = class9513.method35477(field21942, Class9461.method35164(field21942));
                            }
                        }
                        catch (final RetryCallException class9514) {
                            Thread.sleep(class9514.field_224985_e * 1000);
                            ++i;
                            continue;
                        }
                        break;
                    }
                    if (method35477 == null) {
                        this.field21947 = RealmsScreen.getLocalizedString("mco.upload.close.failure");
                        this.field21950 = true;
                        if (Class5086.field21961.isHeldByCurrentThread()) {
                            Class5086.field21961.unlock();
                            this.field21951 = false;
                            this.method15427();
                            this.buttonsAdd(this.field21953);
                            if (file != null) {
                                Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                file.delete();
                            }
                        }
                    }
                    else {
                        Class9461.method35166(field21942, method35477.method22891());
                        if (!method35477.method22893()) {
                            this.field21947 = RealmsScreen.getLocalizedString("mco.upload.close.failure");
                            this.field21950 = true;
                            if (Class5086.field21961.isHeldByCurrentThread()) {
                                Class5086.field21961.unlock();
                                this.field21951 = false;
                                this.method15427();
                                this.buttonsAdd(this.field21953);
                                if (file != null) {
                                    Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                    file.delete();
                                }
                            }
                        }
                        else if (this.field21949) {
                            this.method15922();
                            this.field21950 = true;
                            if (Class5086.field21961.isHeldByCurrentThread()) {
                                Class5086.field21961.unlock();
                                this.field21951 = false;
                                this.method15427();
                                this.buttonsAdd(this.field21953);
                                if (file != null) {
                                    Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                    file.delete();
                                }
                            }
                        }
                        else {
                            this.method15924(new File(new File(Realms.method25364(), "saves"), this.field21941.method7933()));
                            if (this.field21949) {
                                this.method15922();
                                this.field21950 = true;
                                if (Class5086.field21961.isHeldByCurrentThread()) {
                                    Class5086.field21961.unlock();
                                    this.field21951 = false;
                                    this.method15427();
                                    this.buttonsAdd(this.field21953);
                                    if (file != null) {
                                        Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                        file.delete();
                                    }
                                }
                            }
                            else if (this.method15923(file)) {
                                this.field21947 = RealmsScreen.method15439("mco.upload.uploading", this.field21941.method7937());
                                final Class7585 class9515 = new Class7585(file, this.field21942, this.field21943, method35477, Realms.method25356(), Realms.method25358(), Realms.method25377(), this.field21944);
                                class9515.method23862(class9520 -> {
                                    if (class9520.field40461 >= 200 && class9520.field40461 < 300) {
                                        this.field21950 = (1 != 0);
                                        this.field21947 = RealmsScreen.getLocalizedString("mco.upload.done");
                                        this.field21953.method16925(RealmsScreen.getLocalizedString("gui.done"));
                                        Class9461.method35165(n2);
                                    }
                                    else if (class9520.field40461 == 400 && class9520.field40462 != null) {
                                        this.field21946 = RealmsScreen.method15439("mco.upload.failed", class9520.field40462);
                                    }
                                    else {
                                        this.field21946 = RealmsScreen.method15439("mco.upload.failed", class9520.field40461);
                                    }
                                    return;
                                });
                                while (!class9515.method23871()) {
                                    if (this.field21949) {
                                        class9515.method23863();
                                        this.method15922();
                                        this.field21950 = true;
                                        if (Class5086.field21961.isHeldByCurrentThread()) {
                                            Class5086.field21961.unlock();
                                            this.field21951 = false;
                                            this.method15427();
                                            this.buttonsAdd(this.field21953);
                                            if (file != null) {
                                                Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                                file.delete();
                                            }
                                        }
                                        return;
                                    }
                                    else {
                                        try {
                                            Thread.sleep(500L);
                                        }
                                        catch (final InterruptedException ex) {
                                            Class5086.field21939.error("Failed to check Realms file upload status");
                                        }
                                    }
                                }
                                this.field21950 = true;
                                if (Class5086.field21961.isHeldByCurrentThread()) {
                                    Class5086.field21961.unlock();
                                    this.field21951 = false;
                                    this.method15427();
                                    this.buttonsAdd(this.field21953);
                                    if (file != null) {
                                        Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                        file.delete();
                                    }
                                }
                            }
                            else {
                                file.length();
                                final long n;
                                method15918(n);
                                method15918(5368709120L);
                                final Class2121 class9516;
                                final Class2121 class9517;
                                if (method15920(n, class9516).equals(method15920(5368709120L, class9517)) && class9516 != Class2121.field12366) {
                                    final Class2121 class9518 = Class2121.values()[class9516.ordinal() - 1];
                                    this.field21946 = RealmsScreen.method15439("mco.upload.size.failure.line1", this.field21941.method7937()) + "\\n" + RealmsScreen.method15439("mco.upload.size.failure.line2", method15920(n, class9518), method15920(5368709120L, class9518));
                                    this.field21950 = true;
                                    if (Class5086.field21961.isHeldByCurrentThread()) {
                                        Class5086.field21961.unlock();
                                        this.field21951 = false;
                                        this.method15427();
                                        this.buttonsAdd(this.field21953);
                                        if (file != null) {
                                            Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                            file.delete();
                                        }
                                    }
                                }
                                else {
                                    this.field21946 = RealmsScreen.method15439("mco.upload.size.failure.line1", this.field21941.method7937()) + "\\n" + RealmsScreen.method15439("mco.upload.size.failure.line2", method15920(n, class9516), method15920(5368709120L, class9517));
                                    this.field21950 = true;
                                    if (Class5086.field21961.isHeldByCurrentThread()) {
                                        Class5086.field21961.unlock();
                                        this.field21951 = false;
                                        this.method15427();
                                        this.buttonsAdd(this.field21953);
                                        if (file != null) {
                                            Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                                            file.delete();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    this.field21950 = true;
                    if (Class5086.field21961.isHeldByCurrentThread()) {
                        Class5086.field21961.unlock();
                        this.field21951 = false;
                        this.method15427();
                        this.buttonsAdd(this.field21953);
                        final File file;
                        if (file != null) {
                            Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                            file.delete();
                        }
                    }
                }
            }
            catch (final IOException ex2) {
                this.field21946 = RealmsScreen.method15439("mco.upload.failed", ex2.getMessage());
            }
            catch (final RealmsServiceException class9519) {
                this.field21946 = RealmsScreen.method15439("mco.upload.failed", class9519.toString());
            }
            catch (final InterruptedException ex3) {
                Class5086.field21939.error("Could not acquire upload lock");
            }
            finally {
                this.field21950 = true;
                if (Class5086.field21961.isHeldByCurrentThread()) {
                    Class5086.field21961.unlock();
                    this.field21951 = false;
                    this.method15427();
                    this.buttonsAdd(this.field21953);
                    final File file;
                    if (file != null) {
                        Class5086.field21939.debug("Deleting file " + file.getAbsolutePath());
                        file.delete();
                    }
                }
            }
        }).start();
    }
    
    private void method15922() {
        this.field21947 = RealmsScreen.getLocalizedString("mco.upload.cancelled");
        Class5086.field21939.debug("Upload was cancelled");
    }
    
    private boolean method15923(final File file) {
        return file.length() < 5368709120L;
    }
    
    private File method15924(final File file) throws IOException {
        TarArchiveOutputStream tarArchiveOutputStream = null;
        File file2;
        try {
            final File tempFile = File.createTempFile("realms-upload-file", ".tar.gz");
            tarArchiveOutputStream = new TarArchiveOutputStream((OutputStream)new GZIPOutputStream(new FileOutputStream(tempFile)));
            tarArchiveOutputStream.setLongFileMode(3);
            this.method15925(tarArchiveOutputStream, file.getAbsolutePath(), "world", true);
            tarArchiveOutputStream.finish();
            file2 = tempFile;
        }
        finally {
            if (tarArchiveOutputStream != null) {
                tarArchiveOutputStream.close();
            }
        }
        return file2;
    }
    
    private void method15925(final TarArchiveOutputStream tarArchiveOutputStream, final String pathname, final String str, final boolean b) throws IOException {
        if (!this.field21949) {
            final File file = new File(pathname);
            final String str2 = b ? str : (str + file.getName());
            tarArchiveOutputStream.putArchiveEntry((ArchiveEntry)new TarArchiveEntry(file, str2));
            if (!file.isFile()) {
                tarArchiveOutputStream.closeArchiveEntry();
                final File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    final File[] array = listFiles;
                    for (int length = array.length, i = 0; i < length; ++i) {
                        this.method15925(tarArchiveOutputStream, array[i].getAbsolutePath(), str2 + "/", false);
                    }
                }
            }
            else {
                IOUtils.copy((InputStream)new FileInputStream(file), (OutputStream)tarArchiveOutputStream);
                tarArchiveOutputStream.closeArchiveEntry();
            }
        }
    }
    
    static {
        field21939 = LogManager.getLogger();
        field21956 = new String[] { Class5086.\u88ec\u7544\u7a2c\ub23a\u3a84\u7834[10], ".", ". .", ". . ." };
        field21961 = new ReentrantLock();
    }
}
