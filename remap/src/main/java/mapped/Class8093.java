// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.SlickException;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.Texture;

public abstract class Class8093
{
    private static Texture field33325;
    private static boolean field33326;
    
    public static void method26586() {
        if (!Class8093.field33326) {
            Renderer.get().flush();
            Class8093.field33325 = Class7777.method24927();
            Class7777.method24930();
            GL11.glPushAttrib(1048575);
            GL11.glPushClientAttrib(1048575);
            GL11.glMatrixMode(5888);
            GL11.glPushMatrix();
            GL11.glMatrixMode(5889);
            GL11.glPushMatrix();
            GL11.glMatrixMode(5888);
            Class8093.field33326 = true;
        }
    }
    
    public static void method26587() {
        if (Class8093.field33326) {
            GL11.glMatrixMode(5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glPopMatrix();
            GL11.glPopClientAttrib();
            GL11.glPopAttrib();
            if (Class8093.field33325 == null) {
                Class7777.method24930();
            }
            else {
                Class8093.field33325.bind();
            }
            Class8093.field33326 = false;
        }
    }
    
    public final void method26588() throws SlickException {
        method26586();
        this.method26589();
        method26587();
    }
    
    public abstract void method26589() throws SlickException;
    
    static {
        Class8093.field33326 = false;
    }
}
