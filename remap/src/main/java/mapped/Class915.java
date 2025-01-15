// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.sound.sampled.Line;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat;
import java.util.logging.Level;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.io.FileInputStream;
import java.io.File;

public class Class915 extends Thread
{
    public final /* synthetic */ Class2416 field4877;
    
    public Class915(final Class2416 field4877) {
        this.field4877 = field4877;
    }
    
    @Override
    public void run() {
        InputStream openStream = null;
        try {
            final InputStream value;
            synchronized (this.field4877) {
                value = Class2416.access$100(this.field4877).get(Class2416.access$000(this.field4877));
            }
            if (value instanceof File) {
                openStream = new FileInputStream((File)value);
            }
            else if (value instanceof URL) {
                openStream = ((URL)value).openStream();
            }
            else {
                if (!(value instanceof InputStream)) {
                    throw new IOException("this is impossible; how come the play list contains this kind of object? :: " + value.getClass());
                }
                openStream = value;
            }
            final Class2341 class2341 = new Class2341(openStream);
            final Class2344 class2342 = new Class2344();
        Label_0207_Outer:
            while (true) {
                synchronized (this.field4877) {
                    if (Class2416.access$200(this.field4877)) {
                        break;
                    }
                    if (Class2416.access$300(this.field4877)) {
                        while (true) {
                            if (Class2416.method9696(this.field4877) != null) {
                                try {
                                    this.field4877.wait();
                                }
                                catch (final InterruptedException thrown) {
                                    Class2416.method9697().log(Level.SEVERE, "wait() failed", thrown);
                                }
                                continue Label_0207_Outer;
                            }
                            continue;
                        }
                    }
                }
                try {
                    final Class8664 method9460 = class2341.method9460();
                    if (method9460 != null) {
                        if (Class2416.method9696(this.field4877) == null) {
                            final AudioFormat format = new AudioFormat((float)method9460.method29641(), 16, (method9460.method29642() == 3) ? 1 : 2, true, false);
                            final Line line = AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, format));
                            Class2416.method9700(this.field4877, (SourceDataLine)line);
                            Class2416.method9696(this.field4877).open(format);
                            if (line != null) {
                                Class2416.method9696(this.field4877).start();
                            }
                            Class2416.method9702(this.field4877, Class2416.method9696(this.field4877), Class2416.method9701(this.field4877));
                        }
                        final Class7036 class2343 = (Class7036)class2342.method9480(method9460, class2341);
                        final short[] method9461 = class2343.method21521();
                        final int n = 0;
                        final int method9462 = class2343.method21522();
                        if (Class2416.method9696(this.field4877) != null) {
                            Class2416.method9696(this.field4877).write(Class2416.method9703(this.field4877, method9461, n, method9462), 0, method9462 * 2);
                        }
                        class2341.method9464();
                        continue;
                    }
                    Class2416.method9698(this.field4877, true);
                    Thread.sleep(214L);
                    Class2416.method9699(this.field4877, true);
                }
                catch (final Exception ex) {}
                break;
            }
            try {
                class2341.method9459();
            }
            catch (final Exception thrown2) {
                Class2416.method9697().log(Level.WARNING, "error closing the sound stream", thrown2);
            }
        }
        catch (final IOException thrown3) {
            Class2416.method9697().log(Level.SEVERE, "unable to open the input stream", thrown3);
        }
        finally {
            if (openStream != null) {
                try {
                    openStream.close();
                }
                catch (final Exception thrown4) {
                    Class2416.method9697().log(Level.WARNING, "error closing the input stream", thrown4);
                }
            }
        }
        final boolean b;
        synchronized (this.field4877) {
            b = !Class2416.access$200(this.field4877);
            Class2416.method9704(this.field4877, false);
            Class2416.method9698(this.field4877, true);
        }
        Class2416.method9705(this.field4877, null);
        if (b) {
            this.field4877.method9683();
        }
    }
}
