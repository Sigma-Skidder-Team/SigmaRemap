// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.ObjectInputStream;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Control;
import javax.sound.sampled.FloatControl;
import java.util.logging.Level;
import java.io.InputStream;
import java.net.URL;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.SourceDataLine;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Class2416 extends JPanel
{
    private static final long field14292 = 1L;
    private static final Logger field14293;
    private static final Random field14294;
    private List<Object> field14295;
    private transient boolean field14296;
    private transient boolean field14297;
    private transient boolean field14298;
    private transient volatile int field14299;
    private transient volatile boolean field14300;
    private transient volatile boolean field14301;
    private transient volatile Thread field14302;
    private transient volatile int field14303;
    private transient volatile SourceDataLine field14304;
    
    public Class2416() {
        this.field14295 = new ArrayList<Object>();
        this.field14296 = false;
        this.field14297 = true;
        this.field14298 = true;
        this.field14299 = 50;
        this.field14300 = false;
        this.field14301 = true;
        this.field14302 = null;
        this.field14303 = 0;
        this.field14304 = null;
        this.method9673();
    }
    
    public Class2416(final File file) {
        this.field14295 = new ArrayList<Object>();
        this.field14296 = false;
        this.field14297 = true;
        this.field14298 = true;
        this.field14299 = 50;
        this.field14300 = false;
        this.field14301 = true;
        this.field14302 = null;
        this.field14303 = 0;
        this.field14304 = null;
        this.add(file);
        this.method9673();
    }
    
    public Class2416(final File... array) {
        this.field14295 = new ArrayList<Object>();
        this.field14296 = false;
        this.field14297 = true;
        this.field14298 = true;
        this.field14299 = 50;
        this.field14300 = false;
        this.field14301 = true;
        this.field14302 = null;
        this.field14303 = 0;
        this.field14304 = null;
        for (int length = array.length, i = 0; i < length; ++i) {
            this.add(array[i]);
        }
        this.method9673();
    }
    
    public Class2416(final URL url) {
        this.field14295 = new ArrayList<Object>();
        this.field14296 = false;
        this.field14297 = true;
        this.field14298 = true;
        this.field14299 = 50;
        this.field14300 = false;
        this.field14301 = true;
        this.field14302 = null;
        this.field14303 = 0;
        this.field14304 = null;
        this.add(url);
        this.method9673();
    }
    
    public Class2416(final InputStream inputStream) {
        this.field14295 = new ArrayList<Object>();
        this.field14296 = false;
        this.field14297 = true;
        this.field14298 = true;
        this.field14299 = 50;
        this.field14300 = false;
        this.field14301 = true;
        this.field14302 = null;
        this.field14303 = 0;
        this.field14304 = null;
        this.add(inputStream);
        this.method9673();
    }
    
    public Class2416(final URL... array) {
        this.field14295 = new ArrayList<Object>();
        this.field14296 = false;
        this.field14297 = true;
        this.field14298 = true;
        this.field14299 = 50;
        this.field14300 = false;
        this.field14301 = true;
        this.field14302 = null;
        this.field14303 = 0;
        this.field14304 = null;
        for (int length = array.length, i = 0; i < length; ++i) {
            this.add(array[i]);
        }
        this.method9673();
    }
    
    private void method9673() {
        new Class8284().method27532(this);
    }
    
    public Class2416 add(final File obj, final boolean b) {
        if (obj.isFile()) {
            if (obj.getName().endsWith(".mp3")) {
                synchronized (this) {
                    this.field14295.add(obj);
                }
            }
        }
        else {
            if (!obj.isDirectory()) {
                throw new IllegalArgumentException("WTF is this? ( " + obj + " )");
            }
            for (final File file : obj.listFiles()) {
                if (file.isFile() || b) {
                    this.add(file, b);
                }
            }
        }
        return this;
    }
    
    public Class2416 add(final File file) {
        this.add(file, true);
        return this;
    }
    
    public Class2416 add(final URL url) {
        synchronized (this) {
            this.field14295.add(url);
        }
        return this;
    }
    
    public Class2416 method9674(final InputStream inputStream) {
        synchronized (this) {
            this.field14295.clear();
            this.field14295.add(inputStream);
        }
        return this;
    }
    
    public Class2416 add(final InputStream inputStream) {
        synchronized (this) {
            this.field14295.add(inputStream);
        }
        return this;
    }
    
    public void method9675(final Class8285 class8285) {
        this.removeAll();
        class8285.method27532(this);
        this.revalidate();
        this.repaint();
    }
    
    public boolean method9676() {
        return this.field14298;
    }
    
    public void method9677() {
        synchronized (this) {
            if (this.field14296) {
                this.field14296 = false;
                this.notifyAll();
                return;
            }
        }
        this.field14298 = false;
        this.method9681();
        if (this.field14295.size() == 0) {
            return;
        }
        synchronized (this) {
            this.field14297 = false;
        }
        if (this.field14302 == null) {
            (this.field14302 = new Class915(this)).start();
        }
    }
    
    public boolean method9678() {
        synchronized (this) {
            return !this.field14296 && !this.field14297;
        }
    }
    
    public void method9679() {
        if (!this.method9678()) {
            return;
        }
        synchronized (this) {
            this.field14296 = true;
            this.notifyAll();
        }
    }
    
    public boolean method9680() {
        synchronized (this) {
            return this.field14296;
        }
    }
    
    public void method9681() {
        synchronized (this) {
            this.field14296 = false;
            this.field14297 = true;
            this.notifyAll();
        }
        if (this.field14302 != null) {
            try {
                this.field14302.join();
            }
            catch (final InterruptedException thrown) {
                Class2416.field14293.log(Level.SEVERE, "join() failed", thrown);
            }
        }
    }
    
    public boolean method9682() {
        synchronized (this) {
            return this.field14297;
        }
    }
    
    public void method9683() {
        this.method9685(1);
    }
    
    public void method9684() {
        this.method9685(-1);
    }
    
    private void method9685(final int n) {
        if (this.field14295.size() != 0) {
            int method9678 = this.method9678() ? 1 : 0;
            if (!this.field14300) {
                this.field14303 += n;
                if (this.field14303 <= this.field14295.size() - 1) {
                    if (this.field14303 < 0) {
                        if (!this.field14301) {
                            this.field14303 = 0;
                            method9678 = 0;
                        }
                        else {
                            this.field14303 = this.field14295.size() - 1;
                        }
                    }
                }
                else if (!this.field14301) {
                    this.field14303 = this.field14295.size() - 1;
                    method9678 = 0;
                }
                else {
                    this.field14303 = 0;
                }
            }
            else {
                this.field14303 = Class2416.field14294.nextInt(this.field14295.size());
            }
            this.method9681();
            if (method9678 != 0) {
                this.method9677();
            }
        }
    }
    
    public Class2416 method9686(final int field14299) {
        if (field14299 >= 0 && field14299 <= 100) {
            this.field14299 = field14299;
            return this;
        }
        throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
    }
    
    public int method9687() {
        return this.field14299;
    }
    
    public Class2416 method9688(final boolean field14300) {
        this.field14300 = field14300;
        return this;
    }
    
    public boolean method9689() {
        return this.field14300;
    }
    
    public Class2416 method9690(final boolean field14301) {
        this.field14301 = field14301;
        return this;
    }
    
    public boolean method9691() {
        return this.field14301;
    }
    
    private void method9692(final SourceDataLine sourceDataLine, final int n) {
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
        catch (final Exception thrown) {
            Class2416.field14293.log(Level.WARNING, "unable to set the volume to the provided source", thrown);
        }
    }
    
    public int method9693() {
        int n = 0;
        if (this.field14304 != null) {
            n = (int)(this.field14304.getMicrosecondPosition() / 1000L);
        }
        return n;
    }
    
    private byte[] method9694(final short[] array, int n, int n2) {
        final byte[] array2 = new byte[n2 * 2];
        int n3 = 0;
        while (n2-- > 0) {
            final short n4 = array[n++];
            array2[n3++] = (byte)n4;
            array2[n3++] = (byte)(n4 >>> 8);
        }
        return array2;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
    
    public void method9695() {
        if (this.field14304 != null) {
            (this.field14302 = new Class916(this)).start();
        }
    }
    
    static {
        field14293 = Logger.getLogger(Class2416.class.getName());
        field14294 = new Random();
    }
}
