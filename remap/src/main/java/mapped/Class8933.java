// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.Vector4f;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.ARBCopyBuffer;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.GL30;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL15;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

import java.util.ArrayList;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL11;
import java.nio.FloatBuffer;

public class Class8933
{
    private static final FloatBuffer field37544;
    private static final Class9248 field37545;
    private static final Class8824 field37546;
    private static final Class8824[] field37547;
    private static final Class7317 field37548;
    private static final Class8334 field37549;
    private static final Class8553 field37550;
    private static final Class8373 field37551;
    private static final Class8320 field37552;
    private static final Class8666 field37553;
    private static final Class9202 field37554;
    private static final Class7598 field37555;
    private static final Class8766 field37556;
    private static final Class7656 field37557;
    private static final FloatBuffer field37558;
    private static final Vector3f field37559;
    private static final Vector3f field37560;
    private static int field37561;
    private static final Class8887[] field37562;
    private static int field37563;
    private static final Class8824 field37564;
    private static final Class7972 field37565;
    private static final Class6386 field37566;
    private static Class191 field37567;
    public static boolean field37568;
    private static Class8072 field37569;
    private static Class6684 field37570;
    private static Class8072 field37571;
    private static Class9075 field37572;
    private static boolean field37573;
    public static float field37574;
    public static float field37575;
    public static boolean field37576;
    public static boolean field37577;
    public static int field37578;
    public static int field37579;
    public static int field37580;
    public static int field37581;
    private static boolean field37582;
    public static final int field37583 = 7;
    public static final int field37584 = 4;
    public static final int field37585 = 33984;
    public static final int field37586 = 33985;
    public static final int field37587 = 33986;
    
    @Deprecated
    public static void method31499() {
        Class8726.method29989(Class8726::method29984);
        GL11.glPushAttrib(8256);
    }
    
    @Deprecated
    public static void method31500() {
        Class8726.method29989(Class8726::method29984);
        GL11.glPushAttrib(270336);
    }
    
    @Deprecated
    public static void method31501() {
        Class8726.method29989(Class8726::method29984);
        GL11.glPopAttrib();
    }
    
    @Deprecated
    public static void method31502() {
        Class8726.method29989(Class8726::method29984);
        if (!Class8933.field37569.method26492()) {
            Class8933.field37545.field39658.method30776();
        }
        else {
            Class8933.field37570.method20331();
        }
    }
    
    @Deprecated
    public static void method31503() {
        Class8726.method29989(Class8726::method29985);
        if (!Class8933.field37569.method26492()) {
            Class8933.field37545.field39658.method30777();
        }
        else {
            Class8933.field37570.method20330();
        }
    }
    
    @Deprecated
    public static void method31504(final int field39659, final float field39660) {
        Class8726.method29989(Class8726::method29985);
        if (!Class8933.field37569.method26492()) {
            if (field39659 != Class8933.field37545.field39659 || field39660 != Class8933.field37545.field39660) {
                GL11.glAlphaFunc(Class8933.field37545.field39659 = field39659, Class8933.field37545.field39660 = field39660);
            }
        }
        else {
            Class8933.field37570.method20328(field39659, field39660);
        }
    }
    
    @Deprecated
    public static void method31505() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37546.method30777();
    }
    
    @Deprecated
    public static void method31506() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37546.method30776();
    }
    
    @Deprecated
    public static void method31507(final int n) {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37547[n].method30777();
    }
    
    @Deprecated
    public static void method31508() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37548.field28305.method30777();
    }
    
    @Deprecated
    public static void method31509() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37548.field28305.method30776();
    }
    
    @Deprecated
    public static void method31510(final int field28306, final int field28307) {
        Class8726.method29989(Class8726::method29984);
        if (field28306 != Class8933.field37548.field28306 || field28307 != Class8933.field37548.field28307) {
            GL11.glColorMaterial(Class8933.field37548.field28306 = field28306, Class8933.field37548.field28307 = field28307);
        }
    }
    
    @Deprecated
    public static void method31511(final int n, final int n2, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL11.glLightfv(n, n2, floatBuffer);
    }
    
    @Deprecated
    public static void method31512(final int n, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL11.glLightModelfv(n, floatBuffer);
    }
    
    @Deprecated
    public static void method31513(final float n, final float n2, final float n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glNormal3f(n, n2, n3);
    }
    
    public static void method31514() {
        Class8726.method29989(Class8726::method29985);
        Class8933.field37550.field35926.method30776();
    }
    
    public static void method31515() {
        Class8726.method29989(Class8726::method29985);
        Class8933.field37550.field35926.method30777();
    }
    
    public static void method31516(final int field35928) {
        Class8726.method29989(Class8726::method29985);
        if (field35928 != Class8933.field37550.field35928) {
            GL11.glDepthFunc(Class8933.field37550.field35928 = field35928);
        }
    }
    
    public static void method31517(final boolean field35927) {
        Class8726.method29989(Class8726::method29984);
        if (field35927 != Class8933.field37550.field35927) {
            GL11.glDepthMask(Class8933.field37550.field35927 = field35927);
        }
    }
    
    public static void method31518() {
        Class8726.method29989(Class8726::method29984);
        if (!Class8933.field37571.method26492()) {
            Class8933.field37549.field34216.method30776();
        }
        else {
            Class8933.field37572.method32691();
        }
    }
    
    public static void method31519() {
        Class8726.method29989(Class8726::method29984);
        if (!Class8933.field37571.method26492()) {
            Class8933.field37549.field34216.method30777();
        }
        else {
            Class8933.field37572.method32690();
        }
    }
    
    public static void method31520(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        if (!Class8933.field37571.method26492()) {
            if (n == Class8933.field37549.field34217) {
                if (n2 == Class8933.field37549.field34218) {
                    if (n == Class8933.field37549.field34219) {
                        if (n2 == Class8933.field37549.field34220) {
                            return;
                        }
                    }
                }
            }
            Class8933.field37549.field34217 = n;
            Class8933.field37549.field34218 = n2;
            Class8933.field37549.field34219 = n;
            Class8933.field37549.field34220 = n2;
            if (Class8571.method28955()) {
                Class9216.field39212.method16097(n, n2, n, n2);
            }
            GL11.glBlendFunc(n, n2);
        }
        else {
            Class8933.field37572.method32692(n, n2);
        }
    }
    
    public static void method31521(final int field34217, final int field34218, final int field34219, final int field34220) {
        Class8726.method29989(Class8726::method29984);
        if (!Class8933.field37571.method26492()) {
            if (field34217 == Class8933.field37549.field34217) {
                if (field34218 == Class8933.field37549.field34218) {
                    if (field34219 == Class8933.field37549.field34219) {
                        if (field34220 == Class8933.field37549.field34220) {
                            return;
                        }
                    }
                }
            }
            Class8933.field37549.field34217 = field34217;
            Class8933.field37549.field34218 = field34218;
            Class8933.field37549.field34219 = field34219;
            Class8933.field37549.field34220 = field34220;
            if (Class8571.method28955()) {
                Class9216.field39212.method16097(field34217, field34218, field34219, field34220);
            }
            method31567(field34217, field34218, field34219, field34220);
        }
        else {
            Class8933.field37572.method32693(field34217, field34218, field34219, field34220);
        }
    }
    
    public static void method31522(final float n, final float n2, final float n3, final float n4) {
        GL14.glBlendColor(n, n2, n3, n4);
    }
    
    public static void method31523(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL14.glBlendEquation(n);
    }
    
    public static String method31524(final GLCapabilities glCapabilities) {
        Class8726.method29989(Class8726::method29990);
        Class8571.method28817();
        if (!(Class8933.field37576 = glCapabilities.OpenGL31)) {
            Class8933.field37578 = 36662;
            Class8933.field37579 = 36663;
        }
        else {
            Class8933.field37578 = 36662;
            Class8933.field37579 = 36663;
        }
        if (!glCapabilities.OpenGL15) {
            Class8933.field37580 = 34962;
            Class8933.field37581 = 35044;
        }
        else {
            Class8933.field37580 = 34962;
            Class8933.field37581 = 35044;
        }
        final boolean b = Class8933.field37576 || glCapabilities.GL_ARB_copy_buffer;
        final boolean openGL14 = glCapabilities.OpenGL14;
        Class8933.field37577 = (b && openGL14);
        if (!Class8933.field37577) {
            final ArrayList list = new ArrayList();
            if (!b) {
                list.add("OpenGL 1.3, ARB_copy_buffer");
            }
            if (!openGL14) {
                list.add("OpenGL 1.4");
            }
            final String string = "VboRegions not supported, missing: " + Class8571.method28886(list);
            Class8571.method28847(string);
            list.add(string);
        }
        if (glCapabilities.OpenGL30) {
            Class8933.field37567 = Class191.field628;
            Class9026.field38160 = 36160;
            Class9026.field38161 = 36161;
            Class9026.field38162 = 36064;
            Class9026.field38163 = 36096;
            Class9026.field38164 = 36053;
            Class9026.field38165 = 36054;
            Class9026.field38166 = 36055;
            Class9026.field38167 = 36059;
            Class9026.field38168 = 36060;
            return "OpenGL 3.0";
        }
        if (glCapabilities.GL_ARB_framebuffer_object) {
            Class8933.field37567 = Class191.field629;
            Class9026.field38160 = 36160;
            Class9026.field38161 = 36161;
            Class9026.field38162 = 36064;
            Class9026.field38163 = 36096;
            Class9026.field38164 = 36053;
            Class9026.field38166 = 36055;
            Class9026.field38165 = 36054;
            Class9026.field38167 = 36059;
            Class9026.field38168 = 36060;
            return "ARB_framebuffer_object extension";
        }
        if (!glCapabilities.GL_EXT_framebuffer_object) {
            throw new IllegalStateException("Could not initialize framebuffer support.");
        }
        Class8933.field37567 = Class191.field630;
        Class9026.field38160 = 36160;
        Class9026.field38161 = 36161;
        Class9026.field38162 = 36064;
        Class9026.field38163 = 36096;
        Class9026.field38164 = 36053;
        Class9026.field38166 = 36055;
        Class9026.field38165 = 36054;
        Class9026.field38167 = 36059;
        Class9026.field38168 = 36060;
        return "EXT_framebuffer_object extension";
    }
    
    public static int method31525(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        return GL20.glGetProgrami(n, n2);
    }
    
    public static void method31526(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        GL20.glAttachShader(n, n2);
    }
    
    public static void method31527(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL20.glDeleteShader(n);
    }
    
    public static int method31528(final int n) {
        Class8726.method29989(Class8726::method29984);
        return GL20.glCreateShader(n);
    }
    
    public static void method31529(final int n, final CharSequence charSequence) {
        Class8726.method29989(Class8726::method29984);
        GL20.glShaderSource(n, charSequence);
    }
    
    public static void method31530(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL20.glCompileShader(n);
    }
    
    public static int method31531(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        return GL20.glGetShaderi(n, n2);
    }
    
    public static void method31532(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUseProgram(n);
    }
    
    public static int method31533() {
        Class8726.method29989(Class8726::method29984);
        return GL20.glCreateProgram();
    }
    
    public static void method31534(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL20.glDeleteProgram(n);
    }
    
    public static void method31535(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL20.glLinkProgram(n);
    }
    
    public static int method31536(final int n, final CharSequence charSequence) {
        Class8726.method29989(Class8726::method29984);
        return GL20.glGetUniformLocation(n, charSequence);
    }
    
    public static void method31537(final int n, final IntBuffer intBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform1iv(n, intBuffer);
    }
    
    public static void method31538(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform1i(n, n2);
    }
    
    public static void method31539(final int n, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform1fv(n, floatBuffer);
    }
    
    public static void method31540(final int n, final IntBuffer intBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform2iv(n, intBuffer);
    }
    
    public static void method31541(final int n, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform2fv(n, floatBuffer);
    }
    
    public static void method31542(final int n, final IntBuffer intBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform3iv(n, intBuffer);
    }
    
    public static void method31543(final int n, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform3fv(n, floatBuffer);
    }
    
    public static void method31544(final int n, final IntBuffer intBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform4iv(n, intBuffer);
    }
    
    public static void method31545(final int n, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniform4fv(n, floatBuffer);
    }
    
    public static void method31546(final int n, final boolean b, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniformMatrix2fv(n, b, floatBuffer);
    }
    
    public static void method31547(final int n, final boolean b, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniformMatrix3fv(n, b, floatBuffer);
    }
    
    public static void method31548(final int n, final boolean b, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL20.glUniformMatrix4fv(n, b, floatBuffer);
    }
    
    public static int method31549(final int n, final CharSequence charSequence) {
        Class8726.method29989(Class8726::method29984);
        return GL20.glGetAttribLocation(n, charSequence);
    }
    
    public static int method31550() {
        Class8726.method29989(Class8726::method29985);
        return GL15.glGenBuffers();
    }
    
    public static void method31551(final int n, final int n2) {
        Class8726.method29989(Class8726::method29985);
        GL15.glBindBuffer(n, n2);
    }
    
    public static void method31552(final int n, final ByteBuffer byteBuffer, final int n2) {
        Class8726.method29989(Class8726::method29985);
        GL15.glBufferData(n, byteBuffer, n2);
    }
    
    public static void method31553(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL15.glDeleteBuffers(n);
    }
    
    public static void method31554(final int n, final int n2) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                GL30.glBindFramebuffer(n, n2);
                break;
            }
            case 2: {
                ARBFramebufferObject.glBindFramebuffer(n, n2);
                break;
            }
            case 3: {
                EXTFramebufferObject.glBindFramebufferEXT(n, n2);
                break;
            }
        }
    }
    
    public static void method31555(final int n, final int n2) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                GL30.glBindRenderbuffer(n, n2);
                break;
            }
            case 2: {
                ARBFramebufferObject.glBindRenderbuffer(n, n2);
                break;
            }
            case 3: {
                EXTFramebufferObject.glBindRenderbufferEXT(n, n2);
                break;
            }
        }
    }
    
    public static void method31556(final int n) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                GL30.glDeleteRenderbuffers(n);
                break;
            }
            case 2: {
                ARBFramebufferObject.glDeleteRenderbuffers(n);
                break;
            }
            case 3: {
                EXTFramebufferObject.glDeleteRenderbuffersEXT(n);
                break;
            }
        }
    }
    
    public static void method31557(final int n) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                GL30.glDeleteFramebuffers(n);
                break;
            }
            case 2: {
                ARBFramebufferObject.glDeleteFramebuffers(n);
                break;
            }
            case 3: {
                EXTFramebufferObject.glDeleteFramebuffersEXT(n);
                break;
            }
        }
    }
    
    public static int method31558() {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                return GL30.glGenFramebuffers();
            }
            case 2: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 3: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
            default: {
                return -1;
            }
        }
    }
    
    public static int method31559() {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                return GL30.glGenRenderbuffers();
            }
            case 2: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 3: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
            default: {
                return -1;
            }
        }
    }
    
    public static void method31560(final int n, final int n2, final int n3, final int n4) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                GL30.glRenderbufferStorage(n, n2, n3, n4);
                break;
            }
            case 2: {
                ARBFramebufferObject.glRenderbufferStorage(n, n2, n3, n4);
                break;
            }
            case 3: {
                EXTFramebufferObject.glRenderbufferStorageEXT(n, n2, n3, n4);
                break;
            }
        }
    }
    
    public static void method31561(final int n, final int n2, final int n3, final int n4) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                GL30.glFramebufferRenderbuffer(n, n2, n3, n4);
                break;
            }
            case 2: {
                ARBFramebufferObject.glFramebufferRenderbuffer(n, n2, n3, n4);
                break;
            }
            case 3: {
                EXTFramebufferObject.glFramebufferRenderbufferEXT(n, n2, n3, n4);
                break;
            }
        }
    }
    
    public static int method31562(final int n) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                return GL30.glCheckFramebufferStatus(n);
            }
            case 2: {
                return ARBFramebufferObject.glCheckFramebufferStatus(n);
            }
            case 3: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT(n);
            }
            default: {
                return -1;
            }
        }
    }
    
    public static void method31563(final int n, final int n2, final int n3, final int n4, final int n5) {
        Class8726.method29989(Class8726::method29985);
        switch (Class9180.field38900[Class8933.field37567.ordinal()]) {
            case 1: {
                GL30.glFramebufferTexture2D(n, n2, n3, n4, n5);
                break;
            }
            case 2: {
                ARBFramebufferObject.glFramebufferTexture2D(n, n2, n3, n4, n5);
                break;
            }
            case 3: {
                EXTFramebufferObject.glFramebufferTexture2DEXT(n, n2, n3, n4, n5);
                break;
            }
        }
    }
    
    public static void method31564(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL13.glActiveTexture(n);
    }
    
    @Deprecated
    public static void method31565(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL13.glClientActiveTexture(n);
    }
    
    @Deprecated
    public static void method31566(final int n, final float field37574, final float field37575) {
        Class8726.method29989(Class8726::method29984);
        GL13.glMultiTexCoord2f(n, field37574, field37575);
        if (n == 33986) {
            Class8933.field37574 = field37574;
            Class8933.field37575 = field37575;
        }
    }
    
    public static void method31567(final int n, final int n2, final int n3, final int n4) {
        Class8726.method29989(Class8726::method29984);
        GL14.glBlendFuncSeparate(n, n2, n3, n4);
    }
    
    public static String method31568(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        return GL20.glGetShaderInfoLog(n, n2);
    }
    
    public static String method31569(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        return GL20.glGetProgramInfoLog(n, n2);
    }
    
    public static void method31570() {
        Class8726.method29989(Class8726::method29984);
        method31611(8960, 8704, 34160);
        method31574(7681, 34168);
    }
    
    public static void method31571() {
        Class8726.method29989(Class8726::method29984);
        method31611(8960, 8704, 8448);
        method31575(8448, 5890, 34168, 34166);
    }
    
    public static void method31572(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        method31608(33985);
        method31609();
        method31633(5890);
        method31634();
        final float n3 = 1.0f / (n2 - 1);
        method31640(n3, n3, n3);
        method31633(5888);
        method31617(n);
        method31613(3553, 10241, 9728);
        method31613(3553, 10240, 9728);
        method31613(3553, 10242, 10496);
        method31613(3553, 10243, 10496);
        method31611(8960, 8704, 34160);
        method31575(34165, 34168, 5890, 5890);
        method31576(7681, 34168);
        method31608(33984);
    }
    
    public static void method31573() {
        Class8726.method29989(Class8726::method29984);
        method31608(33985);
        method31610();
        method31608(33984);
    }
    
    private static void method31574(final int n, final int n2) {
        method31611(8960, 34161, n);
        method31611(8960, 34176, n2);
        method31611(8960, 34192, 768);
    }
    
    private static void method31575(final int n, final int n2, final int n3, final int n4) {
        method31611(8960, 34161, n);
        method31611(8960, 34176, n2);
        method31611(8960, 34192, 768);
        method31611(8960, 34177, n3);
        method31611(8960, 34193, 768);
        method31611(8960, 34178, n4);
        method31611(8960, 34194, 770);
    }
    
    private static void method31576(final int n, final int n2) {
        method31611(8960, 34162, n);
        method31611(8960, 34184, n2);
        method31611(8960, 34200, 770);
    }
    
    public static void method31577(final Matrix4f class6789) {
        Class8726.method29989(Class8726::method29984);
        method31635();
        method31634();
        method31507(0);
        method31507(1);
        final Vector4f class6790 = new Vector4f(Class8933.field37559);
        class6790.method28603(class6789);
        method31511(16384, 4611, method31580(class6790.method28595(), class6790.method28596(), class6790.method28597(), 0.0f));
        method31511(16384, 4609, method31580(0.6f, 0.6f, 0.6f, 1.0f));
        method31511(16384, 4608, method31580(0.0f, 0.0f, 0.0f, 1.0f));
        method31511(16384, 4610, method31580(0.0f, 0.0f, 0.0f, 1.0f));
        final Vector4f class6791 = new Vector4f(Class8933.field37560);
        class6791.method28603(class6789);
        method31511(16385, 4611, method31580(class6791.method28595(), class6791.method28596(), class6791.method28597(), 0.0f));
        method31511(16385, 4609, method31580(0.6f, 0.6f, 0.6f, 1.0f));
        method31511(16385, 4608, method31580(0.0f, 0.0f, 0.0f, 1.0f));
        method31511(16385, 4610, method31580(0.0f, 0.0f, 0.0f, 1.0f));
        method31621(7424);
        method31512(2899, method31580(0.4f, 0.4f, 0.4f, 1.0f));
        method31636();
    }
    
    public static void method31578() {
        Class8726.method29989(Class8726::method29984);
        final Matrix4f class6789 = new Matrix4f();
        class6789.method20748();
        class6789.method20752(Matrix4f.method20759(1.0f, -1.0f, 1.0f));
        class6789.method20753(Vector3f.YP.rotationDegrees(-22.5f));
        class6789.method20753(Vector3f.XP.rotationDegrees(135.0f));
        method31577(class6789);
    }
    
    public static void method31579() {
        Class8726.method29989(Class8726::method29984);
        final Matrix4f class6789 = new Matrix4f();
        class6789.method20748();
        class6789.method20753(Vector3f.YP.rotationDegrees(62.0f));
        class6789.method20753(Vector3f.XP.rotationDegrees(185.5f));
        class6789.method20752(Matrix4f.method20759(1.0f, -1.0f, 1.0f));
        class6789.method20753(Vector3f.YP.rotationDegrees(-22.5f));
        class6789.method20753(Vector3f.XP.rotationDegrees(135.0f));
        method31577(class6789);
    }
    
    private static FloatBuffer method31580(final float n, final float n2, final float n3, final float n4) {
        Class8933.field37558.clear();
        Class8933.field37558.put(n).put(n2).put(n3).put(n4);
        Class8933.field37558.flip();
        return Class8933.field37558;
    }
    
    public static void method31581() {
        method31605(Class2138.field12575, 9216);
        method31605(Class2138.field12576, 9216);
        method31605(Class2138.field12577, 9216);
        method31606(Class2138.field12575, 9474, method31580(1.0f, 0.0f, 0.0f, 0.0f));
        method31606(Class2138.field12576, 9474, method31580(0.0f, 1.0f, 0.0f, 0.0f));
        method31606(Class2138.field12577, 9474, method31580(0.0f, 0.0f, 1.0f, 0.0f));
        method31603(Class2138.field12575);
        method31603(Class2138.field12576);
        method31603(Class2138.field12577);
    }
    
    public static void method31582() {
        method31604(Class2138.field12575);
        method31604(Class2138.field12576);
        method31604(Class2138.field12577);
    }
    
    public static void method31583() {
        method31637(2983, Class8933.field37544);
        method31644(Class8933.field37544);
        method31637(2982, Class8933.field37544);
        method31644(Class8933.field37544);
    }
    
    @Deprecated
    public static void method31584() {
        if (Class8933.field37582) {
            Class8726.method29989(Class8726::method29984);
            Class8933.field37551.field34336.method30777();
        }
    }
    
    @Deprecated
    public static void method31585() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37551.field34336.method30776();
    }
    
    @Deprecated
    public static void method31586(final int field34337) {
        Class8726.method29989(Class8726::method29984);
        if (field34337 != Class8933.field37551.field34337) {
            method31591(2917, Class8933.field37551.field34337 = field34337);
            if (Class8571.method28955()) {
                Class9216.method33802(field34337);
            }
        }
    }
    
    @Deprecated
    public static void method31587(float field34338) {
        Class8726.method29989(Class8726::method29984);
        if (field34338 < 0.0f) {
            field34338 = 0.0f;
        }
        if (field34338 != Class8933.field37551.field34338) {
            GL11.glFogf(2914, Class8933.field37551.field34338 = field34338);
            if (Class8571.method28955()) {
                Class9216.method33878(field34338);
            }
        }
    }
    
    @Deprecated
    public static void method31588(final float field34339) {
        Class8726.method29989(Class8726::method29984);
        if (field34339 != Class8933.field37551.field34339) {
            GL11.glFogf(2915, Class8933.field37551.field34339 = field34339);
        }
    }
    
    @Deprecated
    public static void method31589(final float field34340) {
        Class8726.method29989(Class8726::method29984);
        if (field34340 != Class8933.field37551.field34340) {
            GL11.glFogf(2916, Class8933.field37551.field34340 = field34340);
        }
    }
    
    @Deprecated
    public static void method31590(final int n, final float[] array) {
        Class8726.method29989(Class8726::method29984);
        GL11.glFogfv(n, array);
    }
    
    @Deprecated
    public static void method31591(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        GL11.glFogi(n, n2);
    }
    
    public static void method31592() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37552.field34171.method30777();
    }
    
    public static void method31593() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37552.field34171.method30776();
    }
    
    public static void method31594(final int n, final int n2) {
        Class8726.method29989(Class8726::method29984);
        GL11.glPolygonMode(n, n2);
    }
    
    public static void method31595() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37553.field36442.method30777();
    }
    
    public static void method31596() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37553.field36442.method30776();
    }
    
    public static void method31597() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37553.field36443.method30777();
    }
    
    public static void method31598() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37553.field36443.method30776();
    }
    
    public static void method31599(final float field36444, final float field36445) {
        Class8726.method29989(Class8726::method29984);
        if (field36444 != Class8933.field37553.field36444 || field36445 != Class8933.field37553.field36445) {
            GL11.glPolygonOffset(Class8933.field37553.field36444 = field36444, Class8933.field37553.field36445 = field36445);
        }
    }
    
    public static void method31600() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37554.field38993.method30777();
    }
    
    public static void method31601() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37554.field38993.method30776();
    }
    
    public static void method31602(final int field38994) {
        Class8726.method29989(Class8726::method29984);
        if (field38994 != Class8933.field37554.field38994) {
            GL11.glLogicOp(Class8933.field37554.field38994 = field38994);
        }
    }
    
    @Deprecated
    public static void method31603(final Class2138 class2138) {
        Class8726.method29989(Class8726::method29984);
        method31607(class2138).field36621.method30777();
    }
    
    @Deprecated
    public static void method31604(final Class2138 class2138) {
        Class8726.method29989(Class8726::method29984);
        method31607(class2138).field36621.method30776();
    }
    
    @Deprecated
    public static void method31605(final Class2138 class2138, final int field36623) {
        Class8726.method29989(Class8726::method29984);
        final Class8715 method31607 = method31607(class2138);
        if (field36623 != method31607.field36623) {
            method31607.field36623 = field36623;
            GL11.glTexGeni(method31607.field36622, 9472, field36623);
        }
    }
    
    @Deprecated
    public static void method31606(final Class2138 class2138, final int n, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL11.glTexGenfv(method31607(class2138).field36622, n, floatBuffer);
    }
    
    @Deprecated
    private static Class8715 method31607(final Class2138 class2138) {
        Class8726.method29989(Class8726::method29984);
        switch (Class9180.field38901[class2138.ordinal()]) {
            case 1: {
                return Class8933.field37555.field30129;
            }
            case 2: {
                return Class8933.field37555.field30130;
            }
            case 3: {
                return Class8933.field37555.field30131;
            }
            case 4: {
                return Class8933.field37555.field30132;
            }
            default: {
                return Class8933.field37555.field30129;
            }
        }
    }
    
    public static void method31608(final int n) {
        Class8726.method29989(Class8726::method29984);
        if (Class8933.field37561 != n - 33984) {
            Class8933.field37561 = n - 33984;
            method31564(n);
        }
    }
    
    public static void method31609() {
        Class8726.method29989(Class8726::method29985);
        Class8933.field37562[Class8933.field37561].field37387.method30777();
    }
    
    public static void method31610() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37562[Class8933.field37561].field37387.method30776();
    }
    
    @Deprecated
    public static void method31611(final int n, final int n2, final int n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glTexEnvi(n, n2, n3);
    }
    
    public static void method31612(final int n, final int n2, final float n3) {
        Class8726.method29989(Class8726::method29985);
        GL11.glTexParameterf(n, n2, n3);
    }
    
    public static void method31613(final int n, final int n2, final int n3) {
        Class8726.method29989(Class8726::method29985);
        GL11.glTexParameteri(n, n2, n3);
    }
    
    public static int method31614(final int n, final int n2, final int n3) {
        Class8726.method29989(Class8726::method29990);
        return GL11.glGetTexLevelParameteri(n, n2, n3);
    }
    
    public static int method31615() {
        Class8726.method29989(Class8726::method29985);
        return GL11.glGenTextures();
    }
    
    public static void method31616(final int n) {
        Class8726.method29989(Class8726::method29985);
        if (n != 0) {
            GL11.glDeleteTextures(n);
            for (final Class8887 class8887 : Class8933.field37562) {
                if (class8887.field37388 == n) {
                    class8887.field37388 = 0;
                }
            }
        }
    }
    
    public static void method31617(final int field37388) {
        Class8726.method29989(Class8726::method29985);
        if (field37388 != Class8933.field37562[Class8933.field37561].field37388) {
            GL11.glBindTexture(3553, Class8933.field37562[Class8933.field37561].field37388 = field37388);
            if (Class7663.method24283()) {
                Class7663.method24289(field37388);
            }
        }
    }
    
    public static void method31618(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final IntBuffer intBuffer) {
        Class8726.method29989(Class8726::method29985);
        GL11.glTexImage2D(n, n2, n3, n4, n5, n6, n7, n8, intBuffer);
    }
    
    public static void method31619(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        Class8726.method29989(Class8726::method29985);
        GL11.glTexSubImage2D(n, n2, n3, n4, n5, n6, n7, n8, n9);
    }
    
    public static void method31620(final int n, final int n2, final int n3, final int n4, final long n5) {
        Class8726.method29989(Class8726::method29984);
        GL11.glGetTexImage(n, n2, n3, n4, n5);
    }
    
    @Deprecated
    public static void method31621(final int field37563) {
        Class8726.method29989(Class8726::method29985);
        if (field37563 != Class8933.field37563) {
            GL11.glShadeModel(Class8933.field37563 = field37563);
        }
    }
    
    @Deprecated
    public static void method31622() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37564.method30777();
    }
    
    @Deprecated
    public static void method31623() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37564.method30776();
    }
    
    public static void method31624(final int field12446, final int field12447, final int field12448, final int field12449) {
        Class8726.method29989(Class8726::method29985);
        GL11.glViewport(Class2134.field12445.field12446 = field12446, Class2134.field12445.field12447 = field12447, Class2134.field12445.field12448 = field12448, Class2134.field12445.field12449 = field12449);
    }
    
    public static void method31625(final boolean field32801, final boolean field32802, final boolean field32803, final boolean field32804) {
        Class8726.method29989(Class8726::method29984);
        if (field32801 == Class8933.field37565.field32801) {
            if (field32802 == Class8933.field37565.field32802) {
                if (field32803 == Class8933.field37565.field32803) {
                    if (field32804 == Class8933.field37565.field32804) {
                        return;
                    }
                }
            }
        }
        GL11.glColorMask(Class8933.field37565.field32801 = field32801, Class8933.field37565.field32802 = field32802, Class8933.field37565.field32803 = field32803, Class8933.field37565.field32804 = field32804);
    }
    
    public static void method31626(final int field41788, final int field41789, final int field41790) {
        Class8726.method29989(Class8726::method29984);
        if (field41788 == Class8933.field37557.field30390.field41788) {
            if (field41788 == Class8933.field37557.field30390.field41789) {
                if (field41788 == Class8933.field37557.field30390.field41790) {
                    return;
                }
            }
        }
        GL11.glStencilFunc(Class8933.field37557.field30390.field41788 = field41788, Class8933.field37557.field30390.field41789 = field41789, Class8933.field37557.field30390.field41790 = field41790);
    }
    
    public static void method31627(final int field30391) {
        Class8726.method29989(Class8726::method29984);
        if (field30391 != Class8933.field37557.field30391) {
            GL11.glStencilMask(Class8933.field37557.field30391 = field30391);
        }
    }
    
    public static void method31628(final int field30392, final int field30393, final int field30394) {
        Class8726.method29989(Class8726::method29984);
        if (field30392 == Class8933.field37557.field30392) {
            if (field30393 == Class8933.field37557.field30393) {
                if (field30394 == Class8933.field37557.field30394) {
                    return;
                }
            }
        }
        GL11.glStencilOp(Class8933.field37557.field30392 = field30392, Class8933.field37557.field30393 = field30393, Class8933.field37557.field30394 = field30394);
    }
    
    public static void method31629(final double field36852) {
        Class8726.method29989(Class8726::method29985);
        if (field36852 != Class8933.field37556.field36852) {
            GL11.glClearDepth(Class8933.field37556.field36852 = field36852);
        }
    }
    
    public static void method31630(final float field25496, final float field25497, final float field25498, final float field25499) {
        Class8726.method29989(Class8726::method29985);
        if (field25496 == Class8933.field37556.field36853.field25496) {
            if (field25497 == Class8933.field37556.field36853.field25497) {
                if (field25498 == Class8933.field37556.field36853.field25498) {
                    if (field25499 == Class8933.field37556.field36853.field25499) {
                        return;
                    }
                }
            }
        }
        GL11.glClearColor(Class8933.field37556.field36853.field25496 = field25496, Class8933.field37556.field36853.field25497 = field25497, Class8933.field37556.field36853.field25498 = field25498, Class8933.field37556.field36853.field25499 = field25499);
    }
    
    public static void method31631(final int field36854) {
        Class8726.method29989(Class8726::method29984);
        if (field36854 != Class8933.field37556.field36854) {
            GL11.glClearStencil(Class8933.field37556.field36854 = field36854);
        }
    }
    
    public static void method31632(final int n, final boolean b) {
        Class8726.method29989(Class8726::method29985);
        if (Class8933.field37568) {
            GL11.glClear(n);
            if (b) {
                method31662();
            }
        }
    }
    
    @Deprecated
    public static void method31633(final int n) {
        Class8726.method29989(Class8726::method29985);
        GL11.glMatrixMode(n);
    }
    
    @Deprecated
    public static void method31634() {
        Class8726.method29989(Class8726::method29985);
        GL11.glLoadIdentity();
    }
    
    @Deprecated
    public static void method31635() {
        Class8726.method29989(Class8726::method29984);
        GL11.glPushMatrix();
    }
    
    @Deprecated
    public static void method31636() {
        Class8726.method29989(Class8726::method29984);
        GL11.glPopMatrix();
    }
    
    @Deprecated
    public static void method31637(final int n, final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL11.glGetFloatv(n, floatBuffer);
    }
    
    @Deprecated
    public static void method31638(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        Class8726.method29989(Class8726::method29984);
        GL11.glOrtho(n, n2, n3, n4, n5, n6);
    }
    
    @Deprecated
    public static void method31639(final float n, final float n2, final float n3, final float n4) {
        Class8726.method29989(Class8726::method29984);
        GL11.glRotatef(n, n2, n3, n4);
    }
    
    @Deprecated
    public static void method31640(final float n, final float n2, final float n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glScalef(n, n2, n3);
    }
    
    @Deprecated
    public static void method31641(final double n, final double n2, final double n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glScaled(n, n2, n3);
    }
    
    @Deprecated
    public static void method31642(final float n, final float n2, final float n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glTranslatef(n, n2, n3);
    }
    
    @Deprecated
    public static void method31643(final double n, final double n2, final double n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glTranslated(n, n2, n3);
    }
    
    @Deprecated
    public static void method31644(final FloatBuffer floatBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL11.glMultMatrixf(floatBuffer);
    }
    
    @Deprecated
    public static void method31645(final Matrix4f class6789) {
        Class8726.method29989(Class8726::method29984);
        class6789.method20747(Class8933.field37544);
        Class8933.field37544.rewind();
        method31644(Class8933.field37544);
    }
    
    @Deprecated
    public static void method31646(final float field25496, final float field25497, final float field25498, final float field25499) {
        Class8726.method29989(Class8726::method29984);
        if (field25496 == Class8933.field37566.field25496) {
            if (field25497 == Class8933.field37566.field25497) {
                if (field25498 == Class8933.field37566.field25498) {
                    if (field25499 == Class8933.field37566.field25499) {
                        return;
                    }
                }
            }
        }
        GL11.glColor4f(Class8933.field37566.field25496 = field25496, Class8933.field37566.field25497 = field25497, Class8933.field37566.field25498 = field25498, Class8933.field37566.field25499 = field25499);
    }
    
    @Deprecated
    public static void method31647() {
        Class8726.method29989(Class8726::method29984);
        Class8933.field37566.field25496 = -1.0f;
        Class8933.field37566.field25497 = -1.0f;
        Class8933.field37566.field25498 = -1.0f;
        Class8933.field37566.field25499 = -1.0f;
    }
    
    @Deprecated
    public static void method31648(final int n, final int n2, final long n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glNormalPointer(n, n2, n3);
    }
    
    @Deprecated
    public static void method31649(final int n, final int n2, final int n3, final long n4) {
        Class8726.method29989(Class8726::method29984);
        GL11.glTexCoordPointer(n, n2, n3, n4);
    }
    
    @Deprecated
    public static void method31650(final int n, final int n2, final int n3, final long n4) {
        Class8726.method29989(Class8726::method29984);
        GL11.glVertexPointer(n, n2, n3, n4);
    }
    
    @Deprecated
    public static void method31651(final int n, final int n2, final int n3, final long n4) {
        Class8726.method29989(Class8726::method29984);
        GL11.glColorPointer(n, n2, n3, n4);
    }
    
    public static void method31652(final int n, final int n2, final int n3, final boolean b, final int n4, final long n5) {
        Class8726.method29989(Class8726::method29984);
        GL20.glVertexAttribPointer(n, n2, n3, b, n4, n5);
    }
    
    @Deprecated
    public static void method31653(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL11.glEnableClientState(n);
    }
    
    @Deprecated
    public static void method31654(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL11.glDisableClientState(n);
    }
    
    public static void method31655(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL20.glEnableVertexAttribArray(n);
    }
    
    public static void method31656(final int n) {
        Class8726.method29989(Class8726::method29984);
        GL20.glEnableVertexAttribArray(n);
    }
    
    public static void method31657(final int n, final int n2, final int n3) {
        Class8726.method29989(Class8726::method29984);
        GL11.glDrawArrays(n, n2, n3);
        if (Class8571.method28955()) {
            if (!Class8933.field37573) {
                final int method32335 = Class9216.field39287.method32335();
                if (method32335 > 1) {
                    for (int i = 1; i < method32335; ++i) {
                        Class9216.field39213.method16099(i);
                        GL11.glDrawArrays(n, n2, n3);
                    }
                    Class9216.field39213.method16099(0);
                }
            }
        }
    }
    
    public static void method31658(final float n) {
        Class8726.method29989(Class8726::method29984);
        GL11.glLineWidth(n);
    }
    
    public static void method31659(final int n, final int n2) {
        Class8726.method29989(Class8726::method29985);
        GL11.glPixelStorei(n, n2);
    }
    
    public static void method31660(final int n, final float n2) {
        Class8726.method29989(Class8726::method29984);
        GL11.glPixelTransferf(n, n2);
    }
    
    public static void method31661(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final ByteBuffer byteBuffer) {
        Class8726.method29989(Class8726::method29984);
        GL11.glReadPixels(n, n2, n3, n4, n5, n6, byteBuffer);
    }
    
    public static int method31662() {
        Class8726.method29989(Class8726::method29984);
        return GL11.glGetError();
    }
    
    public static String method31663(final int n) {
        Class8726.method29989(Class8726::method29984);
        return GL11.glGetString(n);
    }
    
    public static int method31664(final int n) {
        Class8726.method29989(Class8726::method29985);
        return GL11.glGetInteger(n);
    }
    
    public static int method31665() {
        return 33984 + Class8933.field37561;
    }
    
    public static void method31666() {
        GL11.glBindTexture(3553, Class8933.field37562[Class8933.field37561].field37388);
    }
    
    public static int method31667() {
        return Class8933.field37562[Class8933.field37561].field37388;
    }
    
    public static void method31668() {
        if (Class8571.method28834()) {
            final int glGetInteger = GL11.glGetInteger(34016);
            final int glGetInteger2 = GL11.glGetInteger(32873);
            final int method31665 = method31665();
            final int method31666 = method31667();
            if (method31666 > 0) {
                if (glGetInteger != method31665 || glGetInteger2 != method31666) {
                    Class8571.method28847("checkTexture: act: " + method31665 + ", glAct: " + glGetInteger + ", tex: " + method31666 + ", glTex: " + glGetInteger2);
                }
            }
        }
    }
    
    public static void method31669(final IntBuffer intBuffer) {
        intBuffer.rewind();
        while (intBuffer.position() < intBuffer.limit()) {
            method31616(intBuffer.get());
        }
        intBuffer.rewind();
    }
    
    public static boolean method31670() {
        return Class8824.method30779(Class8933.field37551.field34336);
    }
    
    public static void method31671(final boolean b) {
        Class8933.field37551.field34336.method30778(b);
    }
    
    public static void method31672(final Class6684 class6684) {
        if (!Class8933.field37569.method26492()) {
            method31674(Class8933.field37570);
            method31675(class6684);
            Class8933.field37569.method26490();
        }
    }
    
    public static void method31673() {
        if (Class8933.field37569.method26491()) {
            method31675(Class8933.field37570);
        }
    }
    
    public static void method31674(final Class6684 class6684) {
        if (!Class8933.field37569.method26492()) {
            class6684.method20326(Class8824.method30779(Class8933.field37545.field39658), Class8933.field37545.field39659, Class8933.field37545.field39660);
        }
        else {
            class6684.method20327(Class8933.field37570);
        }
    }
    
    public static void method31675(final Class6684 class6684) {
        if (!Class8933.field37569.method26492()) {
            Class8933.field37545.field39658.method30778(class6684.method20332());
            method31504(class6684.method20333(), class6684.method20334());
        }
        else {
            Class8933.field37570.method20327(class6684);
        }
    }
    
    public static void method31676(final Class9075 class9075) {
        if (!Class8933.field37571.method26492()) {
            method31678(Class8933.field37572);
            method31679(class9075);
            Class8933.field37571.method26490();
        }
    }
    
    public static void method31677() {
        if (Class8933.field37571.method26491()) {
            method31679(Class8933.field37572);
        }
    }
    
    public static void method31678(final Class9075 class9075) {
        if (!Class8933.field37571.method26492()) {
            class9075.method32687(Class8824.method30779(Class8933.field37549.field34216), Class8933.field37549.field34217, Class8933.field37549.field34218, Class8933.field37549.field34219, Class8933.field37549.field34220);
        }
        else {
            class9075.method32688(Class8933.field37572);
        }
    }
    
    public static void method31679(final Class9075 class9075) {
        if (!Class8933.field37571.method26492()) {
            Class8933.field37549.field34216.method30778(class9075.method32694());
            if (class9075.method32699()) {
                method31521(class9075.method32695(), class9075.method32696(), class9075.method32697(), class9075.method32698());
            }
            else {
                method31520(class9075.method32695(), class9075.method32696());
            }
        }
        else {
            Class8933.field37572.method32688(class9075);
        }
    }
    
    public static void method31680(final int n, final IntBuffer intBuffer, final IntBuffer intBuffer2) {
        GL14.glMultiDrawArrays(n, intBuffer, intBuffer2);
        if (Class8571.method28955()) {
            if (!Class8933.field37573) {
                final int method32335 = Class9216.field39287.method32335();
                if (method32335 > 1) {
                    for (int i = 1; i < method32335; ++i) {
                        Class9216.field39213.method16099(i);
                        GL14.glMultiDrawArrays(n, intBuffer, intBuffer2);
                    }
                    Class9216.field39213.method16099(0);
                }
            }
        }
    }
    
    public static void method31681(final int n) {
        method31632(n, false);
    }
    
    public static void method31682(final IntBuffer intBuffer) {
        GL11.glCallLists(intBuffer);
        if (Class8571.method28955()) {
            if (!Class8933.field37573) {
                final int method32335 = Class9216.field39287.method32335();
                if (method32335 > 1) {
                    for (int i = 1; i < method32335; ++i) {
                        Class9216.field39213.method16099(i);
                        GL11.glCallLists(intBuffer);
                    }
                    Class9216.field39213.method16099(0);
                }
            }
        }
    }
    
    public static void method31683(final int n, final long n2, final int n3) {
        GL15.glBufferData(n, n2, n3);
    }
    
    public static void method31684(final int n, final long n2, final ByteBuffer byteBuffer) {
        GL15.glBufferSubData(n, n2, byteBuffer);
    }
    
    public static void method31685(final int n, final int n2, final long n3, final long n4, final long n5) {
        if (!Class8933.field37576) {
            ARBCopyBuffer.glCopyBufferSubData(n, n2, n3, n4, n5);
        }
        else {
            GL31.glCopyBufferSubData(n, n2, n3, n4, n5);
        }
    }
    
    public static boolean method31686() {
        return Class8933.field37582;
    }
    
    public static void method31687(final boolean field37582) {
        Class8933.field37582 = field37582;
    }
    
    static {
        field37544 = Class8543.method28675(MemoryUtil.memAllocFloat(16), floatBuffer -> Class7308.method22414(MemoryUtil.memAddress(floatBuffer)));
        field37545 = new Class9248(null);
        field37546 = new Class8824(2896);
        field37547 = IntStream.range(0, 8).mapToObj(n -> new Class8824(16384 + n)).toArray(Class8824[]::new);
        field37548 = new Class7317(null);
        field37549 = new Class8334(null);
        field37550 = new Class8553(null);
        field37551 = new Class8373(null);
        field37552 = new Class8320(null);
        field37553 = new Class8666(null);
        field37554 = new Class9202(null);
        field37555 = new Class7598(null);
        field37556 = new Class8766(null);
        field37557 = new Class7656(null);
        field37558 = Class9078.method32716(4);
        field37559 = Class8349.method27851(new Vector3f(0.2f, 1.0f, -0.7f), Vector3f::normalize);
        field37560 = Class8349.method27851(new Vector3f(-0.2f, 1.0f, 0.7f), Vector3f::normalize);
        field37562 = IntStream.range(0, 32).mapToObj(p0 -> new Class8887(null)).toArray(Class8887[]::new);
        Class8933.field37563 = 7425;
        field37564 = new Class8824(32826);
        field37565 = new Class7972(null);
        field37566 = new Class6386();
        Class8933.field37568 = true;
        Class8933.field37569 = new Class8072();
        Class8933.field37570 = new Class6684();
        Class8933.field37571 = new Class8072();
        Class8933.field37572 = new Class9075();
        Class8933.field37573 = false;
        Class8933.field37574 = 0.0f;
        Class8933.field37575 = 0.0f;
        Class8933.field37582 = true;
    }
}
