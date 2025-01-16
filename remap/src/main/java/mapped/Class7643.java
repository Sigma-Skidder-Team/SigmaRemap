// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.commons.io.FileUtils;
import java.io.File;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Control;
import javax.sound.sampled.FloatControl;
import java.net.MalformedURLException;
import javax.imageio.ImageIO;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URL;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import java.io.IOException;
import org.lwjgl.opengl.GL11;
import javax.sound.sampled.SourceDataLine;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;

public class Class7643
{
    private static Class869 field30332;
    private boolean field30333;
    private Class9175 field30334;
    private int field30335;
    private long field30336;
    private Thread field30337;
    public BufferedImage field30338;
    public String field30339;
    private Class7776 field30340;
    private BufferedImage field30341;
    private Class7776 field30342;
    private boolean field30343;
    private boolean field30344;
    private transient volatile Thread field30345;
    private int field30346;
    private long field30347;
    private int field30348;
    private Class8681 field30349;
    private boolean field30350;
    private Class258 field30351;
    public List<double[]> field30352;
    private boolean field30353;
    public ArrayList<Double> field30354;
    public SourceDataLine field30355;
    private static final float field30356 = 32768.0f;
    private double field30357;
    private boolean field30358;
    private double field30359;
    
    public Class7643() {
        this.field30333 = false;
        this.field30335 = 50;
        this.field30336 = -1L;
        this.field30337 = new Thread();
        this.field30339 = "";
        this.field30343 = false;
        this.field30345 = null;
        this.field30347 = 0L;
        this.field30350 = true;
        this.field30351 = Class258.field1230;
        this.field30352 = new ArrayList<double[]>();
        this.field30353 = false;
        this.field30354 = new ArrayList<Double>();
        this.field30358 = false;
        this.field30359 = 0.0;
    }
    
    public void method24158() {
        Class9463.method35173().method35188().method21094(this);
        this.method24160();
        if (!this.method24195()) {
            this.method24196();
        }
        this.field30353 = false;
    }
    
    public void method24159() {
        final Class4405 class4405 = new Class4405();
        class4405.method13298("volume", this.field30335);
        class4405.method13295("spectrum", this.field30350);
        class4405.method13298("repeat", this.field30351.field1232);
        Class9463.method35173().method35206().method13301("music", class4405);
    }
    
    private void method24160() {
        if (Class9463.method35173().method35206().method13269("music")) {
            final Class4405 method13264 = Class9463.method35173().method35206().method13264("music");
            if (method13264 != null) {
                if (method13264.method13269("volume")) {
                    this.field30335 = Math.max(0, Math.min(100, method13264.method13262("volume")));
                }
                if (method13264.method13269("spectrum")) {
                    this.field30350 = method13264.method13253("spectrum");
                }
                if (method13264.method13269("repeat")) {
                    this.field30351 = Class258.method897(method13264.method13262("repeat"));
                }
            }
        }
    }
    
    @Class6753
    private void method24161(final Class5740 class5740) {
        if (Class9463.method35173().method35209() == Class2209.field13464) {
            if (this.field30333) {
                if (this.field30352.size() != 0) {
                    final double[] array = this.field30352.get(0);
                    if (this.field30354.isEmpty()) {
                        for (int i = 0; i < array.length; ++i) {
                            if (this.field30354.size() < 1024) {
                                this.field30354.add(array[i]);
                            }
                        }
                    }
                    final float n = 60.0f;
                    final Class869 field30332 = Class7643.field30332;
                    final float n2 = n / Class869.method5338();
                    for (int j = 0; j < array.length; ++j) {
                        final double n3 = this.field30354.get(j) - array[j];
                        final boolean b = this.field30354.get(j) >= Double.MAX_VALUE;
                        this.field30354.set(j, Math.min(2.256E7, Math.max(0.0, this.field30354.get(j) - n3 * Math.min(0.335f * n2, 1.0f))));
                        if (b) {
                            this.field30354.set(j, 0.0);
                        }
                    }
                    if (this.field30354.isEmpty()) {
                        return;
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method24162(final Class5734 class5734) {
        if (this.field30333) {
            if (this.field30352.size() != 0) {
                if (this.field30350) {
                    this.method24163();
                }
            }
        }
    }
    
    private void method24163() {
        if (this.field30352.size() == 0) {
            return;
        }
        if (this.field30340 == null) {
            return;
        }
        if (this.field30354.size() != 0) {
            final float n = 114.0f;
            final float n2 = (float)Math.ceil(Class7643.field30332.field4632.method7694() / n);
            for (int index = 0; index < n; ++index) {
                final float n3 = 1.0f - (index + 1) / n;
                final float n4 = ((float)(Math.sqrt(this.field30354.get(index)) / 12.0) - 5.0f) * (Class7643.field30332.field4632.method7695() / 1080.0f);
                Class8154.method26874(index * n2, Class7643.field30332.field4632.method7695() - n4, n2, n4, Class6430.method19118(Class265.field1281.field1292, 0.2f * n3));
            }
            Class8154.method26926();
            for (int index2 = 0; index2 < n; ++index2) {
                final float n5 = ((float)(Math.sqrt(this.field30354.get(index2)) / 12.0) - 5.0f) * (Class7643.field30332.field4632.method7695() / 1080.0f);
                Class8154.method26874(index2 * n2, Class7643.field30332.field4632.method7695() - n5, n2, n5, Class265.field1278.field1292);
            }
            Class8154.method26927(Class2225.field13694);
            if (this.field30340 != null) {
                if (this.field30342 != null) {
                    Class8154.method26904(0.0f, 0.0f, (float)Class7643.field30332.field4632.method7694(), (float)Class7643.field30332.field4632.method7695(), this.field30342, 0.4f);
                }
            }
            Class8154.method26928();
            double max = 0.0;
            final int n6 = 4750;
            for (int i = 0; i < 3; ++i) {
                max = Math.max(max, Math.sqrt(this.field30354.get(i)) - 1000.0);
            }
            final float n7 = 1.0f + Math.round((float)(max / (n6 - 1000)) * 0.14f * 75.0f) / 75.0f;
            GL11.glPushMatrix();
            GL11.glTranslated(60.0, (double)(Class7643.field30332.field4632.method7695() - 55), 0.0);
            GL11.glScalef(n7, n7, 0.0f);
            GL11.glTranslated(-60.0, (double)(-(Class7643.field30332.field4632.method7695() - 55)), 0.0);
            Class8154.method26905(10.0f, (float)(Class7643.field30332.field4632.method7695() - 110), 100.0f, 100.0f, this.field30340);
            Class8154.method26913(10.0f, (float)(Class7643.field30332.field4632.method7695() - 110), 100.0f, 100.0f, 14.0f, 0.3f);
            GL11.glPopMatrix();
            final String[] split = this.field30339.split(" - ");
            if (split.length <= 1) {
                Class8154.method26889(Class9400.field40328, 130.0f, (float)(Class7643.field30332.field4632.method7695() - 70), split[0], Class6430.method19118(Class265.field1273.field1292, 0.5f));
                Class8154.method26889(Class9400.field40312, 130.0f, (float)(Class7643.field30332.field4632.method7695() - 70), split[0], Class6430.method19118(Class265.field1278.field1292, 0.7f));
            }
            else {
                Class8154.method26889(Class9400.field40329, 130.0f, (float)(Class7643.field30332.field4632.method7695() - 81), split[0], Class6430.method19118(Class265.field1273.field1292, 0.45f));
                Class8154.method26889(Class9400.field40323, 130.0f, (float)(Class7643.field30332.field4632.method7695() - 81), split[0], Class6430.method19118(Class265.field1278.field1292, 0.6f));
                Class8154.method26889(Class9400.field40328, 130.0f, (float)(Class7643.field30332.field4632.method7695() - 56), split[1], Class6430.method19118(Class265.field1273.field1292, 0.5f));
                Class8154.method26889(Class9400.field40312, 130.0f, (float)(Class7643.field30332.field4632.method7695() - 56), split[1], Class6430.method19118(Class265.field1278.field1292, 0.7f));
            }
        }
    }
    
    @Class6753
    private void method24164(final Class5743 class5743) {
        if (!this.field30333) {
            this.field30352.clear();
            this.field30354.clear();
        }
        try {
            if (this.field30343 && this.field30341 != null && this.field30338 != null && this.field30349 == null) {
                if (this.field30342 != null) {
                    this.field30342.method24923();
                }
                if (this.field30340 != null) {
                    this.field30340.method24923();
                }
                this.field30342 = Class9399.method34928("picture", this.field30341);
                this.field30340 = Class9399.method34928("picture", this.field30338);
                Class9463.method35173().method35197().method25776(new Class6224("Now Playing", this.field30339, 7000, this.field30340));
                this.field30343 = false;
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        if (!this.field30343) {
            this.method24166(this.field30349);
        }
    }
    
    public Class8681 method24165() {
        final int n = 0;
        if (n >= this.field30334.field38866.size()) {
            return null;
        }
        return this.field30334.field38866.get(n);
    }
    
    private void method24166(final Class8681 class8681) {
        if (this.field30349 != null) {
            this.field30352.clear();
            new Thread(() -> this.method24174(this.field30349)).start();
        }
    }
    
    private void method24167() {
        this.field30352.clear();
        if (this.field30334 != null) {
            while (this.field30345 != null && this.field30345.isAlive()) {
                this.field30345.interrupt();
            }
            (this.field30345 = new Thread(() -> {
                if (this.field30348 < 0 || this.field30348 >= this.field30334.field38866.size()) {
                    this.field30348 = 0;
                }
                for (int i = this.field30348; i < this.field30334.field38866.size(); ++i) {
                    Class5031.method15317(this.field30334.field38866.get(i).field36486);
                    final URL url;
                    Class9463.method35174().method20243(url.toString());
                    this.field30346 = i;
                    this.field30349 = this.field30334.field38866.get(i);
                    this.field30352.clear();
                    while (!this.field30333) {
                        try {
                            Thread.sleep(300L);
                        }
                        catch (final InterruptedException ex) {}
                        final double[] array = new double[0];
                        this.field30352.clear();
                        if (Thread.interrupted()) {
                            if (this.field30355 != null) {
                                this.field30355.close();
                            }
                            return;
                        }
                    }
                    try {
                        this.method24188(url);
                        final URL url2;
                        Class9463.method35174().method20243((url2 == null) ? "No stream" : url2.toString());
                        if (url2 != null) {
                            url2.openConnection();
                            final URLConnection urlConnection;
                            urlConnection.setConnectTimeout(14000);
                            urlConnection.setReadTimeout(14000);
                            urlConnection.setUseCaches(true);
                            urlConnection.setDoOutput(true);
                            urlConnection.setRequestProperty("Connection", "Keep-Alive");
                            urlConnection.getInputStream();
                            final InputStream inputStream;
                            new Class1750(inputStream, new Class8292(this));
                            final InputStream inputStream2;
                            new Class7828(inputStream2).method25294();
                            final Class6476 class1751;
                            if (class1751.method19491().isEmpty()) {
                                Class9463.method35174().method20243("No content");
                            }
                            final Class6890 class1752 = class1751.method19491().get(1);
                            final AudioFormat format = new AudioFormat((float)class1752.method21188(), class1752.method21189(), class1752.method21187(), true, true);
                            (this.field30355 = AudioSystem.getSourceDataLine(format)).open();
                            this.field30355.start();
                            this.field30336 = (long)class1751.method19499();
                            if (this.field30336 > 1300L) {
                                ((Class1750)inputStream2).close();
                                Class9463.method35173().method35197().method25776(new Class6224("Now Playing", "Music is too long."));
                            }
                            final Class4206 class1753 = new Class4206(class1752.method21178());
                            final Class9157 class1754 = new Class9157();
                            while (class1752.method21181()) {
                                while (!this.field30333) {
                                    Thread.sleep(300L);
                                    final double[] array2 = new double[0];
                                    this.field30352.clear();
                                    if (Thread.interrupted()) {
                                        this.field30355.close();
                                        return;
                                    }
                                }
                                class1753.method12669(class1752.method21182().method7931(), class1754);
                                class1754.method33417();
                                final byte[] array3;
                                this.field30355.write(array3, 0, array3.length);
                                method24170(class1754.method33417(), format);
                                final float[] array4;
                                new Class8599(array4.length).method29128(array4);
                                final float[][] array5;
                                this.field30352.add(method24171(array5[0], array5[1]));
                                if (this.field30352.size() > 18) {
                                    this.field30352.remove(0);
                                }
                                this.method24193(this.field30355, this.field30335);
                                if (!Thread.interrupted()) {
                                    this.field30347 = Math.round(class1752.method21185());
                                    this.field30359 = class1752.method21184();
                                    if (this.field30358) {
                                        class1752.method21183(this.field30357);
                                        this.field30347 = (long)this.field30357;
                                        this.field30358 = false;
                                    }
                                }
                                if (!class1752.method21181() && (this.field30351 == Class258.field1231 || (this.field30351 == Class258.field1230 && this.field30334.field38866.size() == 1))) {
                                    class1752.method21183(0.0);
                                    this.field30347 = 0L;
                                }
                                if (Thread.interrupted()) {
                                    this.field30355.close();
                                    return;
                                }
                            }
                            this.field30355.close();
                            ((Class1750)inputStream2).close();
                        }
                        else {
                            Thread.sleep(1000L);
                        }
                    }
                    catch (final IOException ex2) {
                        if (ex2.getMessage() != null && ex2.getMessage().contains("403")) {
                            System.out.println("installing");
                            this.method24197();
                        }
                    }
                    catch (final LineUnavailableException ex3) {
                        ex3.printStackTrace();
                    }
                    catch (final InterruptedException ex4) {
                        ex4.printStackTrace();
                        break;
                    }
                    if (this.field30351 == Class258.field1231) {
                        --i;
                    }
                    else if (this.field30351 == Class258.field1230 && i == this.field30334.field38866.size() - 1) {
                        i = -1;
                    }
                    else if (this.field30351 == Class258.field1229) {
                        return;
                    }
                    if (i < -1 || i >= this.field30334.field38866.size()) {
                        i = 0;
                    }
                }
            })).start();
        }
    }
    
    public void method24168(final Class258 field30351) {
        this.field30351 = field30351;
        this.method24159();
    }
    
    public Class258 method24169() {
        return this.field30351;
    }
    
    private static float[] method24170(final byte[] array, final AudioFormat audioFormat) {
        final float[] array2 = new float[array.length / audioFormat.getFrameSize()];
        for (int i = 0; i < array.length; i += audioFormat.getFrameSize()) {
            array2[i / audioFormat.getFrameSize()] = (audioFormat.isBigEndian() ? method24173(array, i, audioFormat.getFrameSize()) : method24172(array, i, audioFormat.getFrameSize())) / 32768.0f;
        }
        return array2;
    }
    
    private static double[] method24171(final float[] array, final float[] array2) {
        final double[] array3 = new double[array.length / 2];
        for (int i = 0; i < array3.length; ++i) {
            array3[i] = Math.sqrt(array[i] * array[i] + array2[i] * array2[i]);
        }
        return array3;
    }
    
    private static int method24172(final byte[] array, final int n, final int n2) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 += (array[n + i] & 0xFF) << 8 * i;
        }
        return n3;
    }
    
    private static int method24173(final byte[] array, final int n, final int n2) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 += (array[n + i] & 0xFF) << 8 * (n2 - i - 1);
        }
        return n3;
    }
    
    public void method24174(final Class8681 class8681) {
        try {
            this.field30343 = true;
            final BufferedImage read = ImageIO.read(new URL(class8681.field36488));
            this.field30341 = Class6804.method20826(read, 15);
            this.field30341 = this.field30341.getSubimage(0, (int)(this.field30341.getHeight() * 0.75f), this.field30341.getWidth(), (int)(this.field30341.getHeight() * 0.2f));
            this.field30339 = class8681.field36487;
            if (read.getHeight() != read.getWidth()) {
                if (this.field30339.contains("[NCS Release]")) {
                    this.field30338 = read.getSubimage(1, 3, 170, 170);
                }
                else {
                    this.field30338 = read.getSubimage(70, 0, 180, 180);
                }
            }
            else {
                this.field30338 = read;
            }
            this.field30349 = null;
        }
        catch (final NumberFormatException | IOException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
    
    public void method24175(final boolean field30333) {
        if (!field30333) {
            if (this.field30355 != null) {
                this.field30355.flush();
            }
        }
        this.field30333 = field30333;
    }
    
    public void method24176(final int field30335) {
        this.field30335 = field30335;
        this.method24159();
    }
    
    public void method24177(final boolean field30350) {
        this.field30350 = field30350;
        this.method24159();
    }
    
    public boolean method24178() {
        return this.field30350;
    }
    
    public int method24179() {
        return this.field30335;
    }
    
    public void method24180() {
        if (this.field30334 != null) {
            this.field30348 = this.field30346 - 1;
            this.field30347 = 0L;
            this.field30359 = 0.0;
            this.method24167();
        }
    }
    
    public void method24181() {
        if (this.field30334 != null) {
            this.field30348 = this.field30346 + 1;
            this.field30347 = 0L;
            this.field30359 = 0.0;
            this.method24167();
        }
    }
    
    public void method24182(Class9175 field30334, final Class8681 class8681) {
        if (field30334 == null) {
            field30334 = new Class9175("temp", "temp", Class2057.field11740);
            field30334.field38866.add(class8681);
        }
        this.field30334 = field30334;
        this.field30333 = true;
        this.field30347 = 0L;
        this.field30359 = 0.0;
        for (int i = 0; i < field30334.field38866.size(); ++i) {
            if (field30334.field38866.get(i) == class8681) {
                this.field30348 = i;
            }
        }
        this.method24167();
    }
    
    public boolean method24183() {
        return true;
    }
    
    public boolean method24184() {
        return this.field30333;
    }
    
    public URL method24185() {
        return null;
    }
    
    public long method24186() {
        return this.field30347;
    }
    
    public double method24187() {
        return this.field30359;
    }
    
    public URL method24188(final URL url) {
        final Class6462 class6462 = new Class6462(url.toString(), System.getProperty("user.home"));
        class6462.method19333("g");
        class6462.method19334("no-check-certificate", " ");
        class6462.method19334("rm-cache-dir", " ");
        class6462.method19335("retries", 10);
        class6462.method19335("f", 18);
        try {
            Class8050.method26401(this.method24198());
            return new URL(Class8050.method26397(class6462).method34721());
        }
        catch (final Class2333 class6463) {
            if (class6463.getMessage() != null && class6463.getMessage().contains("ERROR: This video contains content from") && class6463.getMessage().contains("who has blocked it in your country on copyright grounds")) {
                Class9463.method35173().method35197().method25776(new Class6224("Now Playing", "Not available in your region."));
            }
            else {
                class6463.printStackTrace();
                this.method24197();
            }
        }
        catch (final MalformedURLException ex) {
            Class6430.method19106("URL E " + ex.toString());
            ex.printStackTrace();
        }
        return null;
    }
    
    public String method24189() {
        return this.field30339;
    }
    
    public Class7776 method24190() {
        return this.field30342;
    }
    
    public Class7776 method24191() {
        return this.field30340;
    }
    
    public int method24192() {
        return (int)this.field30336;
    }
    
    private void method24193(final SourceDataLine sourceDataLine, final int n) {
        try {
            final FloatControl floatControl = (FloatControl)sourceDataLine.getControl(FloatControl.Type.MASTER_GAIN);
            final BooleanControl booleanControl = (BooleanControl)sourceDataLine.getControl(BooleanControl.Type.MUTE);
            if (n == 0) {
                booleanControl.setValue(true);
            }
            else {
                booleanControl.setValue(false);
                floatControl.setValue((float)(Math.log(n / 100.0) / Math.log(10.0) * 20.0));
            }
        }
        catch (final Exception ex) {}
    }
    
    public void method24194(final double field30357) {
        this.field30357 = field30357;
        this.field30347 = (long)this.field30357;
        this.field30358 = true;
    }
    
    public boolean method24195() {
        File file = new File(Class9463.method35173().method35208() + "/music/youtube-dl");
        if (Class8349.method27845() == Class306.field1833) {
            file = new File(Class9463.method35173().method35208() + "/music/youtube-dl.exe");
        }
        return file.exists();
    }
    
    public void method24196() {
        Class9463.method35173().method35187().method20243("Updating dependencies threaded");
        new Thread(() -> this.method24197()).start();
    }
    
    public void method24197() {
        if (this.field30353) {
            return;
        }
        Class9463.method35173().method35187().method20243("Updating dependencies");
        if (Class8349.method27845() == Class306.field1833) {
            try {
                FileUtils.copyURLToFile(new URL("https://yt-dl.org/downloads/latest/youtube-dl.exe"), new File(Class9463.method35173().method35208() + "/music/youtube-dl.exe"));
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        else {
            try {
                FileUtils.copyURLToFile(new URL("https://yt-dl.org/downloads/latest/youtube-dl"), new File(Class9463.method35173().method35208() + "/music/youtube-dl"));
            }
            catch (final IOException ex2) {
                ex2.printStackTrace();
            }
        }
        System.out.println("done");
        this.field30353 = true;
    }
    
    public String method24198() {
        String s = Class9463.method35173().method35208().getAbsolutePath() + "/music/youtube-dl";
        if (Class8349.method27845() != Class306.field1833) {
            new File(s).setExecutable(true);
        }
        else {
            s += ".exe";
        }
        return s;
    }
    
    public boolean method24199() {
        if (Class8349.method27845() == Class306.field1833) {
            return true;
        }
        if (new File("/usr/local/bin/python").exists()) {
            try {
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[] { "/usr/local/bin/python", "-V" }).start().getErrorStream()));
                try {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains("2.7.17")) {
                            return true;
                        }
                    }
                }
                catch (final IOException ex) {}
            }
            catch (final IOException ex2) {}
        }
        return false;
    }
    
    public boolean method24200() {
        if (Class8349.method27845() != Class306.field1833) {
            return true;
        }
        boolean b = false;
        try {
            b = (Advapi32Util.registryGetIntValue(WinReg.HKEY_LOCAL_MACHINE, "SOFTWARE\\WOW6432Node\\Microsoft\\VisualStudio\\10.0\\VC\\VCRedist\\x86", "Installed") == 1);
        }
        catch (final RuntimeException ex) {}
        try {
            b = (b || Advapi32Util.registryGetIntValue(WinReg.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\VisualStudio\\10.0\\VC\\VCRedist\\x86", "Installed") == 1);
        }
        catch (final RuntimeException ex2) {}
        return b;
    }
    
    static {
        Class7643.field30332 = Class869.method5277();
    }
}