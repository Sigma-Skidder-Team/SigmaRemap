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

public class RegisterScreen extends Class4800
{
    private int field21069;
    private int field21070;
    private boolean field21071;
    private float field21072;
    private float field21073;
    private Texture field21074;
    private Class4887 field21075;
    private LoginScreen field21076;
    private Class4907 field21077;
    private UIButton field21078;
    private boolean field21079;
    private Animation field21080;
    
    public RegisterScreen() {
        super("Credits");
        this.field21069 = 0;
        this.field21070 = 0;
        this.field21071 = true;
        this.field21072 = 0.0f;
        this.field21073 = 0.0f;
        this.field21079 = false;
        this.field21080 = new Animation(250, 250, Direction.FORWARDS);
        this.setListening(false);
        this.field21074 = ClientAssets.method25396("com/mentalfrostbyte/gui/resources/" + ClientAssets.getPanorama(), 0.075f, 8);
        this.addToList(this.field21075 = new Class4887(this, "login", (this.field20480 - Class4887.field20896) / 2, (this.field20481 - Class4887.field20895) / 2, Class4887.field20896, Class4887.field20895));
        this.addToList(this.field21076 = new LoginScreen(this, "register", (this.field20480 - LoginScreen.field20842) / 2, (this.field20481 - LoginScreen.field20841) / 2, LoginScreen.field20842, LoginScreen.field20841));
        this.method14780();
        this.addToList(this.field21078 = new UIButton(this, "continue", this.field20480 / 2 - 120, this.field20481 / 2 + 120, 240, 60, new ColorHelper(ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f)), "Continue", ClientFonts.JelloLight25));
        this.field21078.setEnabled(false);
        this.field21075.method14516(class4841 -> {
            this.field21079 = true;
            this.field21078.setEnabled(true);
        });
        this.field21078.doThis((class4803, n) -> Minecraft.method5277().displayGuiScreen(new Class548()));
    }
    
    public void method14779() {
        this.field21075.setEnabled(false);
        this.field21076.setEnabled(true);
    }
    
    public void method14780() {
        this.field21075.setEnabled(true);
        this.field21076.setEnabled(false);
    }
    
    public void method14781(final String s, final String s2) {
        if (this.field21077 == null) {
            this.runThisOnDimensionUpdate(() -> {
                final ArrayList list = new ArrayList();
                list.add(new Class7976(Class294.field1678, s3, 45));
                ColorUtils.method19175(s4, 240, ClientFonts.JelloLight20);
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
                        this.runThisOnDimensionUpdate(() -> {
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
    public void draw(final float n) {
        ClientAssets.cancel.bind();
        this.field21072 = Math.max(0.0f, Math.min(this.field21072 + 0.075f, 1.0f));
        if (this.field21079) {
            this.field21080.changeDirection(Direction.BACKWARDS);
        }
        this.method14782();
        float n2 = (float)Math.sin(Class7791.method25030(this.field21072, 0.0f, 1.0f, 1.0f) * 3.141592653589793 / 2.0);
        if (this.field21079) {
            n2 = 1.0f - (float)Math.sin(1.5707963267948966 + Class7791.method25031(1.0f - this.field21080.calcPercent(), 0.0f, 1.0f, 1.0f) * 1.5707963267948966) * 0.2f;
        }
        this.field21075.method14286(n2);
        this.field21075.method14287(n2);
        this.field21076.method14286(n2);
        this.field21076.method14287(n2);
        Rectangle rectangle = RenderUtil.method26863(RenderUtil.method26864(this.field21075), this.field21075.method14282(), this.field21075.method14284());
        if (this.field21076.method14296()) {
            rectangle = RenderUtil.method26863(RenderUtil.method26864(this.field21076), this.field21076.method14282(), this.field21076.method14284());
        }
        if (n2 > 0.1) {
            RenderUtil.method26915((int)(this.field20480 - rectangle.getWidth()) / 2, (int)(this.field20481 - rectangle.getHeight()) / 2, (int)rectangle.getWidth(), (int)rectangle.getHeight(), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 1.0f - this.field21080.calcPercent()));
        }
        if (this.field21079) {
            if (this.field21080.calcPercent() == 1.0f) {
                this.field21075.setEnabled(false);
            }
        }
        if (this.field21079) {
            final String field32930 = Client.getInstance().getNetworkManager().method19347().username;
            final String s = "Welcome back";
            final int n3 = 100;
            final int n4 = (this.field20480 - (n3 + Math.max(ClientFonts.JelloMedium40.getWidth(s), ClientFonts.JelloLight36.getWidth(field32930)) + 10 * 10)) / 2;
            final int n5 = (this.field20481 - n3 * 2) / 2;
            RenderUtil.method26876(0.0f, 0.0f, (float)this.field20480, (float)this.field20481, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.45f * this.field21080.calcPercent()));
            RenderUtil.method26904((float)(n4 + 20), (float)(n5 + 40), (float)(n3 + 30), (float)(n3 + 30), ClientAssets.sigma, this.field21080.calcPercent());
            final int n6 = 165;
            final int n7 = 54;
            RenderUtil.drawString(ClientFonts.JelloMedium40, (float)(n4 + n6), (float)(n5 + n7), s, ClientColors.LIGHT_GREYISH_BLUE.color);
            RenderUtil.drawString(ClientFonts.JelloLight36, (float)(n4 + n6), (float)(n5 + n7 + 45), field32930, ClientColors.LIGHT_GREYISH_BLUE.color);
        }
        GL11.glPushMatrix();
        this.field21078.draw(this.field21080.calcPercent());
        GL11.glPopMatrix();
        super.draw(1.0f - this.field21080.calcPercent());
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
        RenderUtil.method26898((float)this.field21070, (float)this.field21069, (float)(this.method14276() * 2), (float)(this.method14278() + 114), this.field21074, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, this.field21072));
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
