// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.ARBShaderObjects;
import java.util.ArrayList;

public class Class9034
{
    private static String[] field38206;
    public ArrayList<Class8472<?>> field38207;
    public final int field38208;
    
    public Class9034(final Class7101 class7101, final Class7101 class7102) {
        this.field38207 = new ArrayList<Class8472<?>>();
        ARBShaderObjects.glAttachObjectARB(this.field38208 = ARBShaderObjects.glCreateProgramObjectARB(), class7101.field27630);
        ARBShaderObjects.glAttachObjectARB(this.field38208, class7102.field27630);
        ARBShaderObjects.glLinkProgramARB(this.field38208);
        ARBShaderObjects.glValidateProgramARB(this.field38208);
    }
    
    public void method32457() {
        GL11.glPushMatrix();
        GL20.glUseProgram(this.field38208);
        for (final Class8472 class8472 : this.field38207) {
            if (!class8472.field34781) {
                continue;
            }
            class8472.field34781 = false;
            class8472.field34782.accept(this.field38208, class8472.field34780);
        }
    }
    
    public void method32458() {
        GL20.glUseProgram(0);
        GL11.glPopMatrix();
    }
    
    public Class8472<Float> method32459(final String s, final float f) {
        final Class8472 e = new Class8472(this, f, s, (n, n2) -> GL20.glUniform1f((int)n, (float)n2));
        this.field38207.add(e);
        return e;
    }
    
    public Class8472<Integer> method32460(final String s, final int i) {
        final Class8472 e = new Class8472(this, i, s, (n, n2) -> GL20.glUniform1i((int)n, (int)n2));
        this.field38207.add(e);
        return e;
    }
    
    public Class8472<Vec2f> method32461(final String s, final Vec2f class9544) {
        final Class8472 e = new Class8472(this, class9544, s, (n, class9545) -> GL20.glUniform2f((int)n, class9545.field41091, class9545.field41092));
        this.field38207.add(e);
        return e;
    }
    
    public Class8472<Boolean> method32462(final String s, final boolean b) {
        final Class8472 e = new Class8472(this, b, s, (n, b2) -> GL20.glUniform1i((int)n, ((boolean)b2) ? 1 : 0));
        this.field38207.add(e);
        return e;
    }
}
