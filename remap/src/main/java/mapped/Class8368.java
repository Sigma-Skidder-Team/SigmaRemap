// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.util.Properties;
import java.nio.ByteBuffer;

public class Class8368
{
    private String field34309;
    private String field34310;
    public ResourceLocation field34311;
    private int field34312;
    private int field34313;
    private int field34314;
    private int field34315;
    private int field34316;
    private Class8363[] field34317;
    private int field34318;
    private boolean field34319;
    private int field34320;
    private ByteBuffer field34321;
    public byte[] field34322;
    private ByteBuffer field34323;
    private boolean field34324;
    private boolean field34325;
    
    public Class8368(final String field34309, final byte[] field34310, final String field34311, final ResourceLocation field34312, final int field34313, final int field34314, final int n, final int n2, final Properties properties) {
        this.field34309 = null;
        this.field34310 = null;
        this.field34311 = null;
        this.field34312 = -1;
        this.field34313 = 0;
        this.field34314 = 0;
        this.field34315 = 0;
        this.field34316 = 0;
        this.field34317 = null;
        this.field34318 = 0;
        this.field34319 = false;
        this.field34320 = 0;
        this.field34321 = null;
        this.field34322 = null;
        this.field34323 = null;
        this.field34324 = true;
        this.field34325 = true;
        this.field34309 = field34309;
        this.field34310 = field34311;
        this.field34311 = field34312;
        this.field34313 = field34313;
        this.field34314 = field34314;
        this.field34315 = n;
        this.field34316 = n2;
        final int n3 = n * n2 * 4;
        if (field34310.length % n3 != 0) {
            Config.warn("Invalid animated texture length: " + field34310.length + ", frameWidth: " + n + ", frameHeight: " + n2);
        }
        this.field34322 = field34310;
        int n4 = field34310.length / n3;
        if (properties.get("tile.0") != null) {
            for (int i = 0; properties.get("tile." + i) != null; ++i) {
                n4 = i + 1;
            }
        }
        final int max = Math.max(Config.method28933((String)properties.get("duration"), 1), 1);
        this.field34317 = new Class8363[n4];
        for (int j = 0; j < this.field34317.length; ++j) {
            this.field34317[j] = new Class8363(Config.method28933((String)properties.get("tile." + j), j), Math.max(Config.method28933((String)properties.get("duration." + j), max), 1));
        }
        this.field34319 = Config.method28935(properties.getProperty("interpolate"), false);
        this.field34320 = Config.method28933(properties.getProperty("skip"), 0);
        if (this.field34319) {
            this.field34321 = Class9078.method32715(n3);
        }
    }
    
    public boolean method27901() {
        final Class8363 method27902 = this.method27902();
        if (method27902 == null) {
            return false;
        }
        final Class8363 class8363 = method27902;
        ++class8363.field34299;
        if (method27902.field34299 >= method27902.field34298) {
            method27902.field34299 = 0;
            ++this.field34318;
            if (this.field34318 >= this.field34317.length) {
                this.field34318 = 0;
            }
            return true;
        }
        return this.field34319;
    }
    
    public Class8363 method27902() {
        return this.method27903(this.field34318);
    }
    
    public Class8363 method27903(int n) {
        if (this.field34317.length > 0) {
            if (n < 0 || n >= this.field34317.length) {
                n = 0;
            }
            return this.field34317[n];
        }
        return null;
    }
    
    public int method27904() {
        return this.field34317.length;
    }
    
    public void method27905() {
        if (this.field34325) {
            if (this.field34312 < 0) {
                final Class1666 method31823 = Class8969.method31823(this.field34311);
                if (method31823 == null) {
                    this.field34325 = false;
                    return;
                }
                this.field34312 = method31823.method5869();
            }
            if (this.field34323 == null) {
                (this.field34323 = Class9078.method32715(this.field34322.length)).put(this.field34322);
                this.field34323.flip();
                this.field34322 = null;
            }
            this.field34324 = (!Class7663.method24283() || Class7663.method24290(this.field34312));
            if (this.method27901()) {
                if (this.field34324) {
                    final int n = this.field34315 * this.field34316 * 4;
                    final Class8363 method31824 = this.method27902();
                    if (method31824 != null) {
                        final int n2 = n * method31824.field34297;
                        if (n2 + n <= this.field34323.limit()) {
                            if (this.field34319 && method31824.field34299 > 0) {
                                if (this.field34320 <= 1 || method31824.field34299 % this.field34320 == 0) {
                                    this.method27906(method31824, this.method27903(this.field34318 + 1), 1.0 * method31824.field34299 / method31824.field34298);
                                }
                            }
                            else {
                                this.field34323.position();
                                Class8933.method31617(this.field34312);
                                Class8969.method31850();
                                GL11.glTexSubImage2D(3553, 0, this.field34313, this.field34314, this.field34315, this.field34316, 6408, 5121, this.field34323);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method27906(final Class8363 class8363, final Class8363 class8364, final double n) {
        final int n2 = this.field34315 * this.field34316 * 4;
        final int n3 = n2 * class8363.field34297;
        if (n3 + n2 > this.field34323.limit()) {
            return;
        }
        final int n4 = n2 * class8364.field34297;
        if (n4 + n2 <= this.field34323.limit()) {
            this.field34321.clear();
            for (int i = 0; i < n2; ++i) {
                this.field34321.put((byte)this.method27907(this.field34323.get(n3 + i) & 0xFF, this.field34323.get(n4 + i) & 0xFF, n));
            }
            this.field34321.flip();
            Class8933.method31617(this.field34312);
            Class8969.method31850();
            GL11.glTexSubImage2D(3553, 0, this.field34313, this.field34314, this.field34315, this.field34316, 6408, 5121, this.field34321);
        }
    }
    
    private int method27907(final int n, final int n2, final double n3) {
        return (int)(n * (1.0 - n3) + n2 * n3);
    }
    
    public String method27908() {
        return this.field34309;
    }
    
    public String method27909() {
        return this.field34310;
    }
    
    public ResourceLocation method27910() {
        return this.field34311;
    }
    
    public boolean method27911() {
        return this.field34324;
    }
}
