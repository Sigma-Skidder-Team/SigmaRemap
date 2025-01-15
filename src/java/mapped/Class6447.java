// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.EXTSecondaryColor;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.DoubleBuffer;
import org.lwjgl.opengl.GL11;

public class Class6447 implements Class6448
{
    private static String[] field25597;
    private int field25598;
    private int field25599;
    private float[] field25600;
    public float field25601;
    
    public Class6447() {
        this.field25600 = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        this.field25601 = 1.0f;
    }
    
    @Override
    public void method19246(final int field25598, final int field25599) {
        this.field25598 = field25598;
        this.field25599 = field25599;
        GL11.glGetString(7939);
        GL11.glEnable(3553);
        GL11.glShadeModel(7425);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1.0);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glViewport(0, 0, field25598, field25599);
        GL11.glMatrixMode(5888);
    }
    
    @Override
    public void method19279(final int n, final int n2) {
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, (double)this.field25598, (double)this.field25599, 0.0, 1.0, -1.0);
        GL11.glMatrixMode(5888);
        GL11.glTranslatef((float)((this.field25598 - n) / 2), (float)((this.field25599 - n2) / 2), 0.0f);
    }
    
    @Override
    public void method19251(final int n) {
        GL11.glBegin(n);
    }
    
    @Override
    public void method19258(final int n, final int n2) {
        GL11.glBindTexture(n, n2);
    }
    
    @Override
    public void method19259(final int n, final int n2) {
        GL11.glBlendFunc(n, n2);
    }
    
    @Override
    public void method19260(final int n) {
        GL11.glCallList(n);
    }
    
    @Override
    public void method19261(final int n) {
        GL11.glClear(n);
    }
    
    @Override
    public void method19280(final float n, final float n2, final float n3, final float n4) {
        GL11.glClearColor(n, n2, n3, n4);
    }
    
    @Override
    public void method19262(final int n, final DoubleBuffer doubleBuffer) {
        GL11.glClipPlane(n, doubleBuffer);
    }
    
    @Override
    public void method19252(final float n, final float n2, final float n3, float n4) {
        n4 *= this.field25601;
        GL11.glColor4f(this.field25600[0] = n, this.field25600[1] = n2, this.field25600[2] = n3, this.field25600[3] = n4);
    }
    
    @Override
    public void method19263(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        GL11.glColorMask(b, b2, b3, b4);
    }
    
    @Override
    public void method19281(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        GL11.glCopyTexImage2D(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    @Override
    public void method19282(final IntBuffer intBuffer) {
        GL11.glDeleteTextures(intBuffer);
    }
    
    @Override
    public void method19264(final int n) {
        GL11.glDisable(n);
    }
    
    @Override
    public void method19265(final int n) {
        GL11.glEnable(n);
    }
    
    @Override
    public void method19253() {
        GL11.glEnd();
    }
    
    @Override
    public void method19275() {
        GL11.glEndList();
    }
    
    @Override
    public int method19283(final int n) {
        return GL11.glGenLists(n);
    }
    
    @Override
    public void method19284(final int n, final FloatBuffer floatBuffer) {
        GL11.glGetFloat(n);
    }
    
    @Override
    public void method19285(final int n, final IntBuffer intBuffer) {
        GL11.glGetInteger(n);
    }
    
    @Override
    public void method19286(final int n, final int n2, final int n3, final int n4, final ByteBuffer byteBuffer) {
        GL11.glGetTexImage(n, n2, n3, n4, byteBuffer);
    }
    
    @Override
    public void method19266(final float n) {
        GL11.glLineWidth(n);
    }
    
    @Override
    public void method19287() {
        GL11.glLoadIdentity();
    }
    
    @Override
    public void method19276(final int n, final int n2) {
        GL11.glNewList(n, n2);
    }
    
    @Override
    public void method19267(final float n) {
        GL11.glPointSize(n);
    }
    
    @Override
    public void method19268() {
        GL11.glPopMatrix();
    }
    
    @Override
    public void method19269() {
        GL11.glPushMatrix();
    }
    
    @Override
    public void method19288(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final ByteBuffer byteBuffer) {
        GL11.glReadPixels(n, n2, n3, n4, n5, n6, byteBuffer);
    }
    
    @Override
    public void method19270(final float n, final float n2, final float n3, final float n4) {
        GL11.glRotatef(n, n2, n3, n4);
    }
    
    @Override
    public void method19271(final float n, final float n2, final float n3) {
        GL11.glScalef(n, n2, n3);
    }
    
    @Override
    public void method19272(final int n, final int n2, final int n3, final int n4) {
        GL11.glScissor(n, n2, n3, n4);
    }
    
    @Override
    public void method19254(final float n, final float n2) {
        GL11.glTexCoord2f(n, n2);
    }
    
    @Override
    public void method19273(final int n, final int n2, final int n3) {
        GL11.glTexEnvi(n, n2, n3);
    }
    
    @Override
    public void method19274(final float n, final float n2, final float n3) {
        GL11.glTranslatef(n, n2, n3);
    }
    
    @Override
    public void method19255(final float n, final float n2) {
        GL11.glVertex2f(n, n2);
    }
    
    @Override
    public void method19256(final float n, final float n2, final float n3) {
        GL11.glVertex3f(n, n2, n3);
    }
    
    @Override
    public void method19250() {
    }
    
    @Override
    public void method19289(final int n, final int n2, final int n3) {
        GL11.glTexParameteri(n, n2, n3);
    }
    
    @Override
    public float[] method19277() {
        return this.field25600;
    }
    
    @Override
    public void method19290(final int n, final int n2) {
        GL11.glDeleteLists(n, n2);
    }
    
    @Override
    public void method19291(final float n) {
        GL11.glClearDepth((double)n);
    }
    
    @Override
    public void method19292(final int n) {
        GL11.glDepthFunc(n);
    }
    
    @Override
    public void method19293(final boolean b) {
        GL11.glDepthMask(b);
    }
    
    @Override
    public void method19294(final float field25601) {
        this.field25601 = field25601;
    }
    
    @Override
    public void method19278(final FloatBuffer floatBuffer) {
        GL11.glLoadMatrixf(floatBuffer);
    }
    
    @Override
    public void method19295(final IntBuffer intBuffer) {
        GL11.glGenTextures(intBuffer);
    }
    
    @Override
    public void method19296() {
        GL11.glGetError();
    }
    
    @Override
    public void method19297(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final ByteBuffer byteBuffer) {
        GL11.glTexImage2D(n, n2, n3, n4, n5, n6, n7, n8, byteBuffer);
    }
    
    @Override
    public void method19298(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final ByteBuffer byteBuffer) {
        GL11.glTexSubImage2D(n, n2, n3, n4, n5, n6, n7, n8, byteBuffer);
    }
    
    @Override
    public boolean method19299() {
        return false;
    }
    
    @Override
    public boolean method19300() {
        return false;
    }
    
    @Override
    public void method19301(final byte b, final byte b2, final byte b3) {
        EXTSecondaryColor.glSecondaryColor3ubEXT(b, b2, b3);
    }
}
