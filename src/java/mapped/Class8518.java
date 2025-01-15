// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.newdawn.slick.SlickException;

public class Class8518 extends Class8519
{
    private Class7764 field34934;
    private int field34935;
    private boolean field34936;
    
    public Class8518(final Class7764 field34934) throws SlickException {
        super(field34934.method24852().method24922(), field34934.method24852().method24921());
        this.field34936 = true;
        this.field34934 = field34934;
        Class8452.method28208("Creating FBO " + field34934.method24843() + "x" + field34934.method24844());
        if (true) {
            this.method28448();
            return;
        }
        throw new Class2324("Your OpenGL card does not support FBO and hence can't handle the dynamic images required for this application.");
    }
    
    private void method28447() throws SlickException {
        final int glCheckFramebufferStatusEXT = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
        switch (glCheckFramebufferStatusEXT) {
            case 36053: {
                return;
            }
            case 36054: {
                throw new Class2324("FrameBuffer: " + this.field34935 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT exception");
            }
            case 36055: {
                throw new Class2324("FrameBuffer: " + this.field34935 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT exception");
            }
            case 36057: {
                throw new Class2324("FrameBuffer: " + this.field34935 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT exception");
            }
            case 36059: {
                throw new Class2324("FrameBuffer: " + this.field34935 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT exception");
            }
            case 36058: {
                throw new Class2324("FrameBuffer: " + this.field34935 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT exception");
            }
            case 36060: {
                throw new Class2324("FrameBuffer: " + this.field34935 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT exception");
            }
            default: {
                throw new Class2324("Unexpected reply from glCheckFramebufferStatusEXT: " + glCheckFramebufferStatusEXT);
            }
        }
    }
    
    private void method28448() throws SlickException {
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        EXTFramebufferObject.glGenFramebuffersEXT(intBuffer);
        this.field34935 = intBuffer.get();
        try {
            final Class7776 method24230 = Class7649.method24214().method24230(this.field34934.method24843(), this.field34934.method24844(), this.field34934.method24801());
            EXTFramebufferObject.glBindFramebufferEXT(36160, this.field34935);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, method24230.method24924(), 0);
            this.method28447();
            this.method28450();
            this.method28466();
            this.method28456();
            this.method28519(this.field34934, 0.0f, 0.0f);
            this.field34934.method24853(method24230);
        }
        catch (final Exception ex) {
            throw new Class2324("Failed to create new texture for FBO");
        }
    }
    
    private void method28449() {
        EXTFramebufferObject.glBindFramebufferEXT(36160, this.field34935);
        GL11.glReadBuffer(36064);
    }
    
    private void method28450() {
        EXTFramebufferObject.glBindFramebufferEXT(36160, 0);
        GL11.glReadBuffer(1029);
    }
    
    @Override
    public void method28451() {
        Class8518.field34937.method19250();
        this.method28450();
        GL11.glPopClientAttrib();
        GL11.glPopAttrib();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        Class8093.method26587();
    }
    
    @Override
    public void method28452() {
        if (this.field34936) {
            Class8093.method26586();
            GL11.glPushAttrib(1048575);
            GL11.glPushClientAttrib(1048575);
            GL11.glMatrixMode(5889);
            GL11.glPushMatrix();
            GL11.glMatrixMode(5888);
            GL11.glPushMatrix();
            this.method28449();
            this.method28453();
            return;
        }
        throw new RuntimeException("Attempt to use a destroy()ed offscreen graphics context.");
    }
    
    public void method28453() {
        GL11.glEnable(3553);
        GL11.glShadeModel(7425);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1.0);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glViewport(0, 0, this.field34952, this.field34953);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        this.method28454();
    }
    
    public void method28454() {
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, (double)this.field34952, 0.0, (double)this.field34953, 1.0, -1.0);
        GL11.glMatrixMode(5888);
    }
    
    @Override
    public void method28455() {
        super.method28455();
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        intBuffer.put(this.field34935);
        intBuffer.flip();
        EXTFramebufferObject.glDeleteFramebuffersEXT(intBuffer);
        this.field34936 = false;
    }
    
    @Override
    public void method28456() {
        super.method28456();
        this.field34934.method24858();
    }
}
