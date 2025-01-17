// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

import com.mentalfrostbyte.jello.mods.impl.gui.MusicParticles;
import org.lwjgl.opengl.GL11;

public class Class7386
{
    private static String[] field28454;
    public final float field28455;
    public final float field28456;
    public final int field28457;
    public final int field28458;
    public float field28459;
    
    public Class7386() {
        this.field28455 = (float)(0.10000000149011612 + Math.random() * 0.8999999761581421);
        this.field28456 = (float)(0.5 + Math.random() * 0.5);
        this.field28457 = (int)(MusicParticles.method10686().field4632.method7694() * Math.random());
        this.field28458 = (int)(MusicParticles.method10687().field4632.method7695() * Math.random());
    }
    
    public void method22684(final float n) {
        this.field28459 += 0.02f * n * this.field28455;
    }
    
    public void method22685() {
        final float n = 0.3f + this.field28459 * 0.7f;
        float n2 = 1.0f;
        if (this.field28459 >= 0.1f) {
            if (this.field28459 > 0.75f) {
                n2 = 1.0f - (this.field28459 - 0.75f) / 0.25f;
            }
        }
        else {
            n2 = this.field28459 / 0.1f;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(MusicParticles.method10688().field4632.method7694() / 2), (float)(MusicParticles.method10689().field4632.method7695() / 2), 0.0f);
        GL11.glScalef(n, n, 1.0f);
        GL11.glTranslatef((float)(-MusicParticles.method10690().field4632.method7694() / 2), (float)(-MusicParticles.method10691().field4632.method7695() / 2), 0.0f);
        final int rgb = Color.getHSBColor(System.currentTimeMillis() % 4000L / 4000.0f, 0.3f, 1.0f).getRGB();
        final float n3 = 60.0f * this.field28456;
        Class8154.method26899(this.field28457 - n3 / 2.0f, this.field28458 - n3 / 2.0f, n3, n3, ClientAssets.particle, Class6430.method19118(rgb, n2 * 0.9f));
        GL11.glPopMatrix();
    }
    
    public boolean method22686() {
        return this.field28459 >= 1.0f;
    }
}
