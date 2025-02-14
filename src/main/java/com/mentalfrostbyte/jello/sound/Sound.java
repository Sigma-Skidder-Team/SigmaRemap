package com.mentalfrostbyte.jello.sound;

import mapped.Class362;
import mapped.Class368;
import mapped.Class4380;
import mapped.Class4381;

import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sound extends JPanel {
    private static final long field16637 = 1L;
    private static final Logger field16638 = Logger.getLogger(Sound.class.getName());
    private static final Random field16639 = new Random();
    private final List<Object> field16640 = new ArrayList<Object>();
    private transient boolean field16641 = false;
    private transient boolean field16642 = true;
    private transient boolean field16643 = true;
    private transient volatile int field16644 = 50;
    private transient volatile boolean field16645 = false;
    private transient volatile boolean field16646 = true;
    private transient volatile Thread field16647 = null;
    private transient volatile int field16648 = 0;
    private transient volatile SourceDataLine field16649 = null;

    public Sound() {
        this.method10517();
    }

    public Sound(File var1) {
        this.add(var1);
        this.method10517();
    }

    public Sound(File... var1) {
        for (File var7 : var1) {
            this.add(var7);
        }

        this.method10517();
    }

    public Sound(URL var1) {
        this.add(var1);
        this.method10517();
    }

    public Sound(InputStream var1) {
        this.add(var1);
        this.method10517();
    }

    public Sound(URL... var1) {
        for (URL var7 : var1) {
            this.add(var7);
        }

        this.method10517();
    }

    // $VF: synthetic method
    public static int access$000(Sound var0) {
        return var0.field16648;
    }

    // $VF: synthetic method
    public static List access$100(Sound var0) {
        return var0.field16640;
    }

    // $VF: synthetic method
    public static boolean access$200(Sound var0) {
        return var0.field16642;
    }

    // $VF: synthetic method
    public static boolean access$300(Sound var0) {
        return var0.field16641;
    }

    // $VF: synthetic method
    public static SourceDataLine method10540(Sound var0) {
        return var0.field16649;
    }

    // $VF: synthetic method
    public static Logger method10541() {
        return field16638;
    }

    // $VF: synthetic method
    public static boolean method10542(Sound var0, boolean var1) {
        return var0.field16642 = var1;
    }

    // $VF: synthetic method
    public static boolean method10543(Sound var0, boolean var1) {
        return var0.field16643 = var1;
    }

    // $VF: synthetic method
    public static SourceDataLine method10544(Sound var0, SourceDataLine var1) {
        return var0.field16649 = var1;
    }

    // $VF: synthetic method
    public static int method10545(Sound var0) {
        return var0.field16644;
    }

    // $VF: synthetic method
    public static void method10546(Sound var0, SourceDataLine var1, int var2) {
        var0.method10536(var1, var2);
    }

    // $VF: synthetic method
    public static byte[] method10547(Sound var0, short[] var1, int var2, int var3) {
        return var0.method10538(var1, var2, var3);
    }

    // $VF: synthetic method
    public static boolean method10548(Sound var0, boolean var1) {
        return var0.field16641 = var1;
    }

    // $VF: synthetic method
    public static Thread method10549(Sound var0, Thread var1) {
        return var0.field16647 = var1;
    }

    private void method10517() {
        new Class4381().method13744(this);
    }

    public Sound add(File var1, boolean var2) {
        if (var1.isFile()) {
            if (var1.getName().endsWith(".mp3")) {
                synchronized (this) {
                    this.field16640.add(var1);
                }
            }
        } else {
            if (!var1.isDirectory()) {
                throw new IllegalArgumentException("WTF is this? ( " + var1 + " )");
            }

            File[] var5 = var1.listFiles();

            for (File var9 : var5) {
                if (var9.isFile() || var2) {
                    this.add(var9, var2);
                }
            }
        }

        return this;
    }

    public Sound add(File var1) {
        this.add(var1, true);
        return this;
    }

    public Sound add(URL var1) {
        synchronized (this) {
            this.field16640.add(var1);
            return this;
        }
    }

    public Sound method10518(InputStream var1) {
        synchronized (this) {
            this.field16640.clear();
            this.field16640.add(var1);
            return this;
        }
    }

    public Sound add(InputStream var1) {
        synchronized (this) {
            this.field16640.add(var1);
            return this;
        }
    }

    public void method10519(Class4380 var1) {
        this.removeAll();
        var1.method13744(this);
        this.revalidate();
        this.repaint();
    }

    public boolean method10520() {
        return this.field16643;
    }

    public void method10521() {
        synchronized (this) {
            if (this.field16641) {
                this.field16641 = false;
                this.notifyAll();
                return;
            }
        }

        this.field16643 = false;
        this.method10525();
        if (this.field16640.size() != 0) {
            synchronized (this) {
                this.field16642 = false;
            }

            if (this.field16647 == null) {
                this.field16647 = new Class362(this);
                this.field16647.start();
            }
        }
    }

    public boolean method10522() {
        synchronized (this) {
            return !this.field16641 && !this.field16642;
        }
    }

    public void method10523() {
        if (this.method10522()) {
            synchronized (this) {
                this.field16641 = true;
                this.notifyAll();
            }
        }
    }

    public boolean method10524() {
        synchronized (this) {
            return this.field16641;
        }
    }

    public void method10525() {
        synchronized (this) {
            this.field16641 = false;
            this.field16642 = true;
            this.notifyAll();
        }

        if (this.field16647 != null) {
            try {
                this.field16647.join();
            } catch (InterruptedException var5) {
                field16638.log(Level.SEVERE, "join() failed", var5);
            }
        }
    }

    public boolean method10526() {
        synchronized (this) {
            return this.field16642;
        }
    }

    public void method10527() {
        this.method10529(1);
    }

    public void method10528() {
        this.method10529(-1);
    }

    private void method10529(int var1) {
        if (this.field16640.size() != 0) {
            boolean var4 = this.method10522();
            if (!this.field16645) {
                this.field16648 += var1;
                if (this.field16648 <= this.field16640.size() - 1) {
                    if (this.field16648 < 0) {
                        if (!this.field16646) {
                            this.field16648 = 0;
                            var4 = false;
                        } else {
                            this.field16648 = this.field16640.size() - 1;
                        }
                    }
                } else if (!this.field16646) {
                    this.field16648 = this.field16640.size() - 1;
                    var4 = false;
                } else {
                    this.field16648 = 0;
                }
            } else {
                this.field16648 = field16639.nextInt(this.field16640.size());
            }

            this.method10525();
            if (var4) {
                this.method10521();
            }
        }
    }

    public Sound method10530(int var1) {
        if (var1 >= 0 && var1 <= 100) {
            this.field16644 = var1;
            return this;
        } else {
            throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
        }
    }

    public int method10531() {
        return this.field16644;
    }

    public Sound method10532(boolean var1) {
        this.field16645 = var1;
        return this;
    }

    public boolean method10533() {
        return this.field16645;
    }

    public Sound method10534(boolean var1) {
        this.field16646 = var1;
        return this;
    }

    public boolean method10535() {
        return this.field16646;
    }

    private void method10536(SourceDataLine var1, int var2) {
        try {
            FloatControl var5 = (FloatControl) var1.getControl(Type.MASTER_GAIN);
            BooleanControl var6 = (BooleanControl) var1.getControl(javax.sound.sampled.BooleanControl.Type.MUTE);
            if (var2 == 0) {
                var6.setValue(true);
            } else {
                var6.setValue(false);
                var5.setValue((float) (Math.log((double) var2 / 100.0) / Math.log(10.0) * 20.0));
            }
        } catch (Exception var7) {
            field16638.log(Level.WARNING, "unable to set the volume to the provided source", var7);
        }
    }

    public int method10537() {
        int var3 = 0;
        if (this.field16649 != null) {
            var3 = (int) (this.field16649.getMicrosecondPosition() / 1000L);
        }

        return var3;
    }

    private byte[] method10538(short[] var1, int var2, int var3) {
        byte[] var6 = new byte[var3 * 2];
        int var7 = 0;

        while (var3-- > 0) {
            short var8 = var1[var2++];
            var6[var7++] = (byte) var8;
            var6[var7++] = (byte) (var8 >>> 8);
        }

        return var6;
    }

    private void readObject(ObjectInputStream var1) throws ClassNotFoundException, IOException {
        var1.defaultReadObject();
    }

    public void method10539() {
        if (this.field16649 != null) {
            this.field16647 = new Class368(this);
            this.field16647.start();
        }
    }
}
