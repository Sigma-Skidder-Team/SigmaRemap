// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Class4918 extends Class4825
{
    public Class7776 field21042;
    public Class7776 field21043;
    public Class7776 field21044;
    public Class7776 field21045;
    public Class7776 field21046;
    public TreeMap<Long, Double> field21047;
    public float field21048;
    public float field21049;
    public long field21050;
    
    public Class4918(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class4803, s, n, n2, 700, 512, false);
        this.field21047 = new TreeMap<Long, Double>();
        this.field21048 = 0.5f;
        this.field21049 = 0.0f;
        this.field21050 = System.currentTimeMillis();
        this.field21042 = Class7853.method25392("com/mentalfrostbyte/gui/resources/games/bg.png");
        this.field21043 = Class7853.method25392("com/mentalfrostbyte/gui/resources/games/fg.png");
        this.field21044 = Class7853.method25392("com/mentalfrostbyte/gui/resources/games/pipe.png");
        this.field21045 = Class7853.method25392("com/mentalfrostbyte/gui/resources/games/pipe2.png");
        this.field21046 = Class7853.method25392("com/mentalfrostbyte/gui/resources/games/bird.png");
    }
    
    private void method14770() {
    }
    
    private void method14771() {
        final int n = 2200;
        final int n2 = 2;
        if (this.field21047.isEmpty()) {
            this.field21047.put(System.currentTimeMillis() + n * 2, 0.25 + Math.random() * 0.5);
        }
        for (long n3 = this.field21047.lastKey(); n3 < System.currentTimeMillis() + n * n2; n3 = this.field21047.lastKey()) {
            this.field21047.put(n3 + n, 0.25 + Math.random() * 0.5);
        }
        final Iterator<Map.Entry<Long, Double>> iterator = this.field21047.entrySet().iterator();
        while (iterator.hasNext()) {
            if (((Map.Entry<Long, V>)iterator.next()).getKey() >= System.currentTimeMillis() - n * 2) {
                continue;
            }
            iterator.remove();
        }
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 32) {
            this.field21049 = 0.045f;
        }
    }
    
    @Override
    public void method14205(final float n) {
        this.method14771();
        Class8154.method26865(this);
        for (int i = 0; i < 3; ++i) {
            Class8154.method26905((float)(this.field20478 + 288 * i), (float)this.field20479, 288.0f, 512.0f, this.field21042);
        }
        final float n2 = 0.026f * (60.0f / Class869.method5338());
        this.field21048 = Math.max(Math.min(1.0f, this.field21048 + this.field21049 - n2), 0.0f);
        this.field21049 = Math.max(-n2, this.field21049 * 0.965f);
        final int n3 = 100;
        final int n4 = 2200;
        final int n5 = this.field20481 - 112;
        for (final Map.Entry<Long, V> entry : this.field21047.entrySet()) {
            final float n6 = (int)(entry.getKey() - System.currentTimeMillis()) / 12.0f;
            final float n7 = n4 / 12.0f;
            Class8154.method26899(this.field20478 + n7 + n6, (float)(this.field20479 - 320 + (int)(n5 * (double)entry.getValue()) - n3 / 2), 52.0f, 320.0f, this.field21044, Class265.field1278.field1292);
            Class8154.method26899(this.field20478 + n7 + n6, (float)(this.field20479 + (int)(n5 * (double)entry.getValue()) + n3 / 2), 52.0f, 320.0f, this.field21045, Class265.field1278.field1292);
            if (n6 <= -52.0f) {
                continue;
            }
            if (n6 >= 0.0f) {
                continue;
            }
            final float n8 = (n3 - 24) / (float)n5;
            if (this.field21048 < (double)entry.getValue() - n8 / 2.0f || this.field21048 > (double)entry.getValue() + n8 / 2.0f) {
                continue;
            }
        }
        final int n9 = 3400;
        final float n10 = System.currentTimeMillis() % n9 / (float)n9;
        for (int j = 0; j < 4; ++j) {
            Class8154.method26905(this.field20478 + 288 * j - 288.0f * n10, (float)(this.field20479 + n5), 288.0f, 112.0f, this.field21043);
        }
        Class8154.method26886(this.field20478 + n4 / 12.0f, this.field20479 + n5 * (1.0f - this.field21048), 10.0f, Class265.field1283.field1292);
        Class8154.method26872();
        this.field21050 = System.currentTimeMillis();
        super.method14205(n);
    }
}