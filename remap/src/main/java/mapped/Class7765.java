// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.IOException;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import slick2d.Texture;

import java.net.URL;

public class Class7765 extends Class7764
{
    private int field31749;
    private int field31750;
    private int field31751;
    private Class7764[][] field31752;
    private int field31753;
    private Class7764 field31754;
    
    public Class7765(final URL url, final int n, final int n2) throws SlickException, IOException {
        this(new Class7764(url.openStream(), url.toString(), false), n, n2);
    }
    
    public Class7765(final Class7764 field31754, final int field31755, final int field31756) {
        super(field31754);
        this.field31751 = 0;
        this.field31754 = field31754;
        this.field31749 = field31755;
        this.field31750 = field31756;
        this.method24814();
    }
    
    public Class7765(final Class7764 field31754, final int field31755, final int field31756, final int field31757, final int field31758) {
        super(field31754);
        this.field31751 = 0;
        this.field31754 = field31754;
        this.field31749 = field31755;
        this.field31750 = field31756;
        this.field31753 = field31757;
        this.field31751 = field31758;
        this.method24814();
    }
    
    public Class7765(final Class7764 class7764, final int n, final int n2, final int n3) {
        this(class7764, n, n2, n3, 0);
    }
    
    public Class7765(final String s, final int n, final int n2, final int n3) throws SlickException {
        this(s, n, n2, null, n3);
    }
    
    public Class7765(final String s, final int n, final int n2) throws SlickException {
        this(s, n, n2, null);
    }
    
    public Class7765(final String s, final int n, final int n2, final Color color) throws SlickException {
        this(s, n, n2, color, 0);
    }
    
    public Class7765(final String s, final int field31749, final int field31750, final Color color, final int field31751) throws SlickException {
        super(s, false, 2, color);
        this.field31751 = 0;
        this.field31754 = this;
        this.field31749 = field31749;
        this.field31750 = field31750;
        this.field31753 = field31751;
    }
    
    public Class7765(final String s, final InputStream inputStream, final int field31749, final int field31750) throws SlickException {
        super(inputStream, s, false);
        this.field31751 = 0;
        this.field31754 = this;
        this.field31749 = field31749;
        this.field31750 = field31750;
    }
    
    @Override
    public void method24814() {
        if (this.field31752 == null) {
            final int n = (this.method24843() - this.field31751 * 2 - this.field31749) / (this.field31749 + this.field31753) + 1;
            int n2 = (this.method24844() - this.field31751 * 2 - this.field31750) / (this.field31750 + this.field31753) + 1;
            if ((this.method24844() - this.field31750) % (this.field31750 + this.field31753) != 0) {
                ++n2;
            }
            this.field31752 = new Class7764[n][n2];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n2; ++j) {
                    this.field31752[i][j] = this.method24860(i, j);
                }
            }
        }
    }
    
    public Class7764 method24859(final int n, final int n2) {
        this.method24813();
        if (n < 0 || n >= this.field31752.length) {
            throw new RuntimeException("SubImage out of sheet bounds: " + n + "," + n2);
        }
        if (n2 >= 0 && n2 < this.field31752[0].length) {
            return this.field31752[n][n2];
        }
        throw new RuntimeException("SubImage out of sheet bounds: " + n + "," + n2);
    }
    
    public Class7764 method24860(final int n, final int n2) {
        this.field31754.method24813();
        this.method24814();
        if (n < 0 || n >= this.field31752.length) {
            throw new RuntimeException("SubImage out of sheet bounds: " + n + "," + n2);
        }
        if (n2 >= 0 && n2 < this.field31752[0].length) {
            return this.field31754.method24836(n * (this.field31749 + this.field31753) + this.field31751, n2 * (this.field31750 + this.field31753) + this.field31751, this.field31749, this.field31750);
        }
        throw new RuntimeException("SubImage out of sheet bounds: " + n + "," + n2);
    }
    
    public int method24861() {
        this.field31754.method24813();
        this.method24814();
        return this.field31752.length;
    }
    
    public int method24862() {
        this.field31754.method24813();
        this.method24814();
        return this.field31752[0].length;
    }
    
    public void method24863(final int n, final int n2, final int n3, final int n4) {
        this.field31752[n3][n4].method24816((float)n, (float)n2, (float)this.field31749, (float)this.field31750);
    }
    
    @Override
    public void method24850() {
        if (this.field31754 != this) {
            this.field31754.method24850();
            return;
        }
        super.method24850();
    }
    
    @Override
    public void method24851() {
        if (this.field31754 != this) {
            this.field31754.method24851();
            return;
        }
        super.method24851();
    }
    
    @Override
    public void method24853(final Texture class7776) {
        if (this.field31754 != this) {
            this.field31754.method24853(class7776);
            return;
        }
        super.method24853(class7776);
    }
}
