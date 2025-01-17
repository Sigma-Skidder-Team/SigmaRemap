// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Rectangle;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;
import slick2d.Texture;

import java.util.ArrayList;

public class Class4926 extends Class4800
{
    private int field21069;
    private int field21070;
    private boolean field21071;
    private float field21072;
    private float field21073;
    private Texture field21074;
    private Class4887 field21075;
    private Class4866 field21076;
    private Class4907 field21077;
    private Class4861 field21078;
    private boolean field21079;
    private Class9572 field21080;
    
    public Class4926() {
        super("Credits");
        this.field21069 = 0;
        this.field21070 = 0;
        this.field21071 = true;
        this.field21072 = 0.0f;
        this.field21073 = 0.0f;
        this.field21079 = false;
        this.field21080 = new Class9572(250, 250, Class2186.field12965);
        this.method14311(false);
        this.field21074 = ClientAssets.method25396("com/mentalfrostbyte/gui/resources/" + ClientAssets.getPanorama(), 0.075f, 8);
        this.method14239(this.field21075 = new Class4887(this, "login", (this.field20480 - Class4887.field20896) / 2, (this.field20481 - Class4887.field20895) / 2, Class4887.field20896, Class4887.field20895));
        this.method14239(this.field21076 = new Class4866(this, "register", (this.field20480 - Class4866.field20842) / 2, (this.field20481 - Class4866.field20841) / 2, Class4866.field20842, Class4866.field20841));
        this.method14780();
        this.method14239(this.field21078 = new Class4861(this, "continue", this.field20480 / 2 - 120, this.field20481 / 2 + 120, 240, 60, new Class6523(Class6430.method19118(Class265.field1278.field1292, 0.5f)), "Continue", ClientFonts.JelloLight25));
        this.field21078.method14297(false);
        this.field21075.method14516(class4841 -> {
            this.field21079 = true;
            this.field21078.method14297(true);
        });
        this.field21078.method14260((class4803, n) -> Minecraft.method5277().displayGuiScreen(new Class548()));
    }
    
    public void method14779() {
        this.field21075.method14297(false);
        this.field21076.method14297(true);
    }
    
    public void method14780() {
        this.field21075.method14297(true);
        this.field21076.method14297(false);
    }
    
    public void method14781(final String s, final String s2) {
        if (this.field21077 == null) {
            this.method14225(() -> {
                final ArrayList list = new ArrayList();
                list.add(new Class7976(Class294.field1678, s3, 45));
                Class6430.method19175(s4, 240, ClientFonts.JelloLight20);
                int i = 0;
                final String[] array;
                while (i < array.length) {
                    new Class7976(Class294.field1675, array[i], (i != array.length - 1) ? 14 : 35);
                    final Class7976 e;
                    final Object o;
                    ((ArrayList<Class7976>)o).add(e);
                    ++i;
                }
                list.add(new Class7976(Class294.field1677, "Ok", 55));
                final Class4907 field21077 = new Class4907(this, "modal", true, "", (Class7976[])list.toArray(new Class7976[0]));
                this.method14242(this.field21077 = field21077);
                this.field21077.method14745(class4841 -> new Thread(() -> {
                    try {
                        Thread.sleep(114L);
                        this.method14225(() -> {
                            this.method14245(this.field21077);
                            this.field21077 = null;
                        });
                    }
                    catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start());
                this.field21077.method14744(true);
            });
        }
    }
    
    @Override
    public void method14205(final float n) {
        ClientAssets.cancel.bind();
        this.field21072 = Math.max(0.0f, Math.min(this.field21072 + 0.075f, 1.0f));
        if (this.field21079) {
            this.field21080.method35855(Class2186.field12964);
        }
        this.method14782();
        float n2 = (float)Math.sin(Class7791.method25030(this.field21072, 0.0f, 1.0f, 1.0f) * 3.141592653589793 / 2.0);
        if (this.field21079) {
            n2 = 1.0f - (float)Math.sin(1.5707963267948966 + Class7791.method25031(1.0f - this.field21080.method35858(), 0.0f, 1.0f, 1.0f) * 1.5707963267948966) * 0.2f;
        }
        this.field21075.method14286(n2);
        this.field21075.method14287(n2);
        this.field21076.method14286(n2);
        this.field21076.method14287(n2);
        Rectangle rectangle = Class8154.method26863(Class8154.method26864(this.field21075), this.field21075.method14282(), this.field21075.method14284());
        if (this.field21076.method14296()) {
            rectangle = Class8154.method26863(Class8154.method26864(this.field21076), this.field21076.method14282(), this.field21076.method14284());
        }
        if (n2 > 0.1) {
            Class8154.method26915((int)(this.field20480 - rectangle.getWidth()) / 2, (int)(this.field20481 - rectangle.getHeight()) / 2, (int)rectangle.getWidth(), (int)rectangle.getHeight(), Class6430.method19118(Class265.field1278.field1292, 1.0f - this.field21080.method35858()));
        }
        if (this.field21079) {
            if (this.field21080.method35858() == 1.0f) {
                this.field21075.method14297(false);
            }
        }
        if (this.field21079) {
            final String field32930 = Client.method35173().method35201().method19347().field32930;
            final String s = "Welcome back";
            final int n3 = 100;
            final int n4 = (this.field20480 - (n3 + Math.max(ClientFonts.JelloMedium40.getWidth(s), ClientFonts.JelloLight36.getWidth(field32930)) + 10 * 10)) / 2;
            final int n5 = (this.field20481 - n3 * 2) / 2;
            Class8154.method26876(0.0f, 0.0f, (float)this.field20480, (float)this.field20481, Class6430.method19118(Class265.field1273.field1292, 0.45f * this.field21080.method35858()));
            Class8154.method26904((float)(n4 + 20), (float)(n5 + 40), (float)(n3 + 30), (float)(n3 + 30), ClientAssets.sigma, this.field21080.method35858());
            final int n6 = 165;
            final int n7 = 54;
            Class8154.method26889(ClientFonts.JelloMedium40, (float)(n4 + n6), (float)(n5 + n7), s, Class265.field1278.field1292);
            Class8154.method26889(ClientFonts.JelloLight36, (float)(n4 + n6), (float)(n5 + n7 + 45), field32930, Class265.field1278.field1292);
        }
        GL11.glPushMatrix();
        this.field21078.method14205(this.field21080.method35858());
        GL11.glPopMatrix();
        super.method14205(1.0f - this.field21080.method35858());
    }
    
    private void method14782() {
        this.field21073 = Math.max(0.0f, Math.min(this.field21073 + 0.01f, 1.0f));
        final int field21070 = this.method14320() * -1;
        final float n = this.method14321() / (float)this.method14276() * -114.0f;
        if (this.field21071) {
            this.field21069 = (int)n;
            this.field21070 = field21070;
            this.field21071 = false;
        }
        final float n2 = n - this.field21069;
        final float n3 = (float)(field21070 - this.field21070);
        final float n4 = (float)Math.sin(Class7791.method25030(this.field21073, 0.0f, 1.0f, 1.0f) * 3.141592653589793 / 2.0);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.field20480 / 2.0f, this.field20480 / 2.0f, 0.0f);
        GL11.glScalef(1.0f + n4 * 0.2f, 1.0f + n4 * 0.2f, 0.0f);
        GL11.glTranslatef(-this.field20480 / 2.0f, -this.field20480 / 2.0f, 0.0f);
        Class8154.method26898((float)this.field21070, (float)this.field21069, (float)(this.method14276() * 2), (float)(this.method14278() + 114), this.field21074, Class6430.method19118(Class265.field1278.field1292, this.field21072));
        GL11.glPopMatrix();
        final float n5 = 0.5f;
        if (n != this.field21069) {
            this.field21069 += (int)(n2 * n5);
        }
        if (field21070 != this.field21070) {
            this.field21070 += (int)(n3 * n5);
        }
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Minecraft.method5277().displayGuiScreen(new Class548());
        }
    }
}
