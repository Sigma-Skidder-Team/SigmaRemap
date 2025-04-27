// 
// Decompiled by Procyon v0.6.0
// 

package org.newdawn.slick.opengl.renderer;

import org.lwjgl.opengl.EXTSecondaryColor;
import org.lwjgl.opengl.EXTTextureMirrorClamp;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.DoubleBuffer;

public interface SGL {
    int GL_TEXTURE_2D = GL11.GL_TEXTURE_2D;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_RGBA = GL11.GL_RGBA;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_RGB = GL11.GL_RGB;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_UNSIGNED_BYTE = GL11.GL_UNSIGNED_BYTE;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_LINEAR = GL11.GL_LINEAR;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_NEAREST = GL11.GL_NEAREST;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TEXTURE_MIN_FILTER = GL11.GL_TEXTURE_MIN_FILTER;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TEXTURE_MAG_FILTER = GL11.GL_TEXTURE_MAG_FILTER;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_POINT_SMOOTH = GL11.GL_POINT_SMOOTH;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_POLYGON_SMOOTH = GL11.GL_POLYGON_SMOOTH;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_LINE_SMOOTH = GL11.GL_LINE_SMOOTH;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_SCISSOR_TEST = GL11.GL_SCISSOR_TEST;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_MODULATE = GL11.GL_MODULATE;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TEXTURE_ENV = GL11.GL_TEXTURE_ENV;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TEXTURE_ENV_MODE = GL11.GL_TEXTURE_ENV_MODE;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_QUADS = GL11.GL_QUADS;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_POINTS = GL11.GL_POINTS;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_LINES = GL11.GL_LINES;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_LINE_STRIP = GL11.GL_LINE_STRIP;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TRIANGLES = GL11.GL_TRIANGLES;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TRIANGLE_FAN = GL11.GL_TRIANGLE_FAN;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_SRC_ALPHA = GL11.GL_SRC_ALPHA;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_ONE = GL11.GL_ONE;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_ONE_MINUS_DST_ALPHA = GL11.GL_ONE_MINUS_DST_ALPHA;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_DST_ALPHA = GL11.GL_DST_ALPHA;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_ONE_MINUS_SRC_ALPHA = GL11.GL_ONE_MINUS_SRC_ALPHA;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_COMPILE = GL11.GL_COMPILE;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_MAX_TEXTURE_SIZE = GL11.GL_MAX_TEXTURE_SIZE;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_COLOR_BUFFER_BIT = GL11.GL_COLOR_BUFFER_BIT;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_DEPTH_BUFFER_BIT = GL11.GL_DEPTH_BUFFER_BIT;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_BLEND = GL11.GL_BLEND;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_COLOR_CLEAR_VALUE = GL11.GL_COLOR_CLEAR_VALUE;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_LINE_WIDTH = GL11.GL_LINE_WIDTH;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_CLIP_PLANE0 = GL11.GL_CLIP_PLANE0;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_CLIP_PLANE1 = GL11.GL_CLIP_PLANE1;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_CLIP_PLANE2 = GL11.GL_CLIP_PLANE2;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_CLIP_PLANE3 = GL11.GL_CLIP_PLANE3;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_COMPILE_AND_EXECUTE = GL11.GL_COMPILE_AND_EXECUTE;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_RGBA8 = GL11.GL_RGBA;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_RGBA16 = GL11.GL_RGBA16;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_BGRA = GL12.GL_BGRA;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_MIRROR_CLAMP_TO_EDGE_EXT = EXTTextureMirrorClamp.GL_MIRROR_CLAMP_TO_EDGE_EXT;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TEXTURE_WRAP_S = GL11.GL_TEXTURE_WRAP_S;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_TEXTURE_WRAP_T = GL11.GL_TEXTURE_WRAP_T;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_CLAMP = GL11.GL_CLAMP;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_COLOR_SUM_EXT = EXTSecondaryColor.GL_COLOR_SUM_EXT;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_ALWAYS = GL11.GL_ALWAYS;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_DEPTH_TEST = GL11.GL_DEPTH_TEST;

    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_NOTEQUAL = GL11.GL_NOTEQUAL;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_EQUAL = GL11.GL_EQUAL;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_SRC_COLOR = GL11.GL_SRC_COLOR;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_ONE_MINUS_SRC_COLOR = GL11.GL_ONE_MINUS_SRC_COLOR;
    /** OpenGL Enum - @url http://www.opengl.org/documentation */
    int GL_MODELVIEW_MATRIX = GL11.GL_MODELVIEW_MATRIX;

    void flush();

    void initDisplay(final int p0, final int p1);

    void enterOrtho(final int p0, final int p1);

    void glClearColor(final float p0, final float p1, final float p2, final float p3);

    void glClipPlane(final int p0, final DoubleBuffer p1);

    void glScissor(final int p0, final int p1, final int p2, final int p3);

    void glLineWidth(final float p0);

    void glClear(final int p0);

    void glColorMask(final boolean p0, final boolean p1, final boolean p2, final boolean p3);

    void glLoadIdentity();

    void glGetInteger(final int p0, final IntBuffer p1);

    void glGetFloat(final int p0, final FloatBuffer p1);

    void glEnable(final int p0);

    void glDisable(final int p0);

    void glBindTexture(final int p0, final int p1);

    void glGetTexImage(final int p0, final int p1, final int p2, final int p3, final ByteBuffer p4);

    void glDeleteTextures(final IntBuffer p0);

    void glColor4f(final float p0, final float p1, final float p2, final float p3);

    void glTexCoord2f(final float p0, final float p1);

    void glVertex3f(final float p0, final float p1, final float p2);

    void glVertex2f(final float p0, final float p1);

    void glRotatef(final float p0, final float p1, final float p2, final float p3);

    void glTranslatef(final float p0, final float p1, final float p2);

    void glBegin(final int p0);

    void glEnd();

    void glTexEnvi(final int p0, final int p1, final int p2);

    void glPointSize(final float p0);

    void glScalef(final float p0, final float p1, final float p2);

    void glPushMatrix();

    void glPopMatrix();

    void glBlendFunc(final int p0, final int p1);

    int glGenLists(final int p0);

    void glNewList(final int p0, final int p1);

    void glEndList();

    void glCallList(final int p0);

    void glCopyTexImage2D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7);

    void glReadPixels(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final ByteBuffer p6);

    void glTexParameteri(final int p0, final int p1, final int p2);

    float[] getCurrentColor();

    void glDeleteLists(final int p0, final int p1);

    void glDepthMask(final boolean p0);

    void glClearDepth(final float p0);

    void glDepthFunc(final int p0);

    void setGlobalAlphaScale(final float p0);

    void glLoadMatrix(final FloatBuffer p0);

    void glGenTextures(final IntBuffer p0);

    void glGetError();

    void glTexImage2D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final ByteBuffer p8);

    void glTexSubImage2D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final ByteBuffer p8);

    boolean canTextureMirrorClamp();

    boolean canSecondaryColor();

    void glSecondaryColor3ubEXT(final byte p0, final byte p1, final byte p2);
}
