package org.newdawn.slick.opengl.renderer;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/**
 * The description of the OpenGL functions used Slick. Any other rendering method will
 * need to emulate these.
 *
 * @author kevin
 */
public interface SGL {
//   int GL_TEXTURE_2D = 3553;
//   int field25739 = 6408;
//   int field25740 = 6407;
//   int field25741 = 5121;
//   int field25742 = 9729;
//   int field25743 = 9728;
//   int field25744 = 10241;
//   int field25745 = 10240;
//   int field25746 = 2832;
//   int field25747 = 2881;
//   int field25748 = 2848;
//   int field25749 = 3089;
//   int field25750 = 8448;
//   int field25751 = 8960;
//   int field25752 = 8704;
//   int field25753 = 7;
//   int field25754 = 0;
//   int field25755 = 1;
//   int field25756 = 3;
//   int field25757 = 4;
//   int field25758 = 6;
//   int field25759 = 770;
//   int field25760 = 1;
//   int field25761 = 773;
//   int field25762 = 772;
//   int field25763 = 771;
//   int field25764 = 4864;
//   int field25765 = 3379;
//   int field25766 = 16384;
//   int field25767 = 256;
//   int field25768 = 3042;
//   int field25769 = 3106;
//   int field25770 = 2849;
//   int field25771 = 12288;
//   int field25772 = 12289;
//   int field25773 = 12290;
//   int field25774 = 12291;
//   int field25775 = 4865;
//   int field25776 = 6408;
//   int field25777 = 32859;
//   int field25778 = 32993;
//   int field25779 = 34627;
//   int field25780 = 10242;
//   int field25781 = 10243;
//   int field25782 = 10496;
//   int field25783 = 33880;
//   int field25784 = 519;
//   int field25785 = 2929;
//   int field25786 = 517;
//   int field25787 = 514;
//   int field25788 = 768;
//   int field25789 = 769;
//   int field25790 = 2982;

   void flush();

   void initDisplay(int var1, int var2);

   void enterOrtho(int var1, int var2);

   void glClearColor(float var1, float var2, float var3, float var4);

   void glClipPlane(int var1, DoubleBuffer var2);

   void glScissor(int var1, int var2, int var3, int var4);

   void glLineWidth(float var1);

   void glClear(int var1);

   void glColorMask(boolean var1, boolean var2, boolean var3, boolean var4);

   void glLoadIdentity();

   void glGetInteger(int var1, IntBuffer var2);

   void glGetFloat(int var1, FloatBuffer var2);

   void glEnable(int var1);

   void glDisable(int var1);

   void glBindTexture(int var1, int var2);

   void glGetTexImage(int var1, int var2, int var3, int var4, ByteBuffer var5);

   void glDeleteTextures(IntBuffer var1);

   void glColor4f(float var1, float var2, float var3, float var4);

   void glTexCoord2f(float var1, float var2);

   void glVertex3f(float var1, float var2, float var3);

   void glVertex2f(float var1, float var2);

   void glRotatef(float var1, float var2, float var3, float var4);

   void glTranslatef(float var1, float var2, float var3);

   void glBegin(int geomType);

   void glEnd();

   void glTexEnvi(int var1, int var2, int var3);

   void glPointSize(float var1);

   void glScalef(float var1, float var2, float var3);

   void glPushMatrix();

   void glPopMatrix();

   void glBlendFunc(int src, int dest);

   int glGenLists(int count);

   void glNewList(int id, int option);

   void glEndList();

   void glCallList(int var1);

   void glCopyTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   void glReadPixels(int var1, int var2, int var3, int var4, int var5, int var6, ByteBuffer var7);

   void glTexParameteri(int var1, int var2, int var3);

   float[] getCurrentColor();

   void glDeleteLists(int list, int count);

   void glDepthMask(boolean var1);

   void glClearDepth(float var1);

   void glDepthFunc(int func);

   void setGlobalAlphaScale(float var1);

   void glLoadMatrix(FloatBuffer var1);

   void glGenTextures(IntBuffer var1);

   void glGetError();

   void glTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9);

   void glTexSubImage2D(int glTexture2d, int i, int pageX, int pageY, int width, int height, int glBgra, int glUnsignedByte, ByteBuffer scratchByteBuffer);

   boolean canTextureMirrorClamp();

   boolean canSecondaryColor();

   void glSecondaryColor3ubEXT(byte b, byte c, byte d);
}
