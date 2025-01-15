// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.io.IOException;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Class4847 extends Class4841
{
    public int field20767;
    public List<Class7015> field20768;
    public int field20769;
    public boolean field20770;
    private Class7776 field20771;
    
    public Class4847(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20768 = new ArrayList<Class7015>();
        this.field20769 = 0;
        this.field20770 = true;
        this.method14311(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20492) {
            if (this.field20769 <= 0) {
                if (n2 >= this.method14281() + this.method14278() / 2) {
                    ((Class4901)this.field20475).method14717(false);
                    this.field20768.add(new Class7015(this, false));
                }
                else {
                    ((Class4901)this.field20475).method14717(true);
                    this.field20768.add(new Class7015(this, true));
                }
                if (this.field20769 != 0) {
                    this.field20769 = 14;
                }
                else {
                    this.field20769 = 3;
                }
            }
        }
        --this.field20769;
        if (!this.field20492) {
            this.field20769 = -1;
        }
    }
    
    public void finalize() throws Throwable {
        try {
            if (this.field20771 != null) {
                Class9463.method35173().method35182(this.field20771);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public void method14205(final float n) {
        final Iterator<Class7015> iterator = this.field20768.iterator();
        final int n2 = 8;
        try {
            if (this.field20770) {
                final BufferedImage method20833 = Class6804.method20833(this.method14280(), this.method14281(), this.field20480, this.field20481, 3, 10, true);
                this.field20767 = Class6430.method19110(new Color(method20833.getRGB(6, 7)), new Color(method20833.getRGB(6, 22))).getRGB();
                this.field20767 = Class6430.method19121(this.field20767, 0.25f);
                if (this.field20771 != null) {
                    this.field20771.method24923();
                }
                this.field20771 = Class9399.method34928("blur", method20833);
                this.field20770 = false;
            }
            if (this.field20771 != null) {
                Class8154.method26913((float)(this.field20478 + n2), (float)(this.field20479 + n2), (float)(this.field20480 - n2 * 2), (float)(this.field20481 - n2 * 2), 20.0f, n * 0.5f);
                Class8154.method26913((float)(this.field20478 + n2), (float)(this.field20479 + n2), (float)(this.field20480 - n2 * 2), (float)(this.field20481 - n2 * 2), 14.0f, n);
                GL11.glPushMatrix();
                Class8154.method26926();
                Class8154.method26924((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 8.0f, Class265.field1278.field1292);
                Class8154.method26927(Class2225.field13694);
                Class8154.method26898((float)(this.field20478 - 1), (float)(this.field20479 - 1), (float)(this.field20480 + 2), (float)(this.field20481 + 2), this.field20771, Class265.field1278.field1292);
                while (iterator.hasNext()) {
                    final Class7015 class7015 = iterator.next();
                    final int n3 = this.field20481 / 2;
                    final int n4 = this.field20479 + (class7015.field27351 ? 0 : n3);
                    final int n5 = this.field20480 / 2;
                    Class8154.method26871(this.field20478, n4, this.field20478 + this.field20480, n4 + n3, true);
                    Class8154.method26886((float)(this.field20478 + n5), (float)(n4 + this.field20481 / 4), (n5 * 2 - 4) * class7015.field27350 + 4.0f, Class6430.method19118(Class265.field1278.field1292, (1.0f - class7015.field27350 * (0.5f + class7015.field27350 * 0.5f)) * 0.4f));
                    Class8154.method26872();
                    class7015.field27350 = Math.min(class7015.field27350 + 3.0f / Class869.method5338(), 1.0f);
                    if (class7015.field27350 == 1.0f) {
                        iterator.remove();
                    }
                }
                Class8154.method26928();
                Class8154.method26925((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 6.0f, Class6430.method19118(Class265.field1273.field1292, 0.3f));
                GL11.glPopMatrix();
                Class8154.method26889(Class9400.field40323, (float)(this.field20478 + 14), (float)(this.field20479 + 8), "+", Class6430.method19118(Class265.field1278.field1292, 0.8f));
                Class8154.method26874((float)(this.field20478 + 16), (float)(this.field20479 + 65), 8.0f, 2.0f, Class6430.method19118(Class265.field1278.field1292, 0.8f));
            }
        }
        catch (final IOException ex) {}
        super.method14205(n);
    }
}
