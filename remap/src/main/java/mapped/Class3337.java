// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;

import net.minecraft.entity.LivingEntity;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import java.util.Map;

public class Class3337 extends Class3167
{
    private static Map<Class512, float[][]> field15939;
    
    public Class3337() {
        super(Class8013.field32984, "Skeleton", "Skeleton ESP.");
        this.method9881(new Class5003("Color", "The Skeleton color", Class265.field1278.field1292));
        this.method9881(new Class4999("CSGO", "Add a CSGO look.", true));
    }
    
    @Class6753
    public void method10560(final Class5739 class5739) {
        if (this.method9906()) {
            return;
        }
    }
    
    private void method10561(final Class5739 class5739, final Class512 class5740) {
        final Color color = new Color(Class9463.method35173().method35190().method29879(class5740.getName().getFormattedText()) ? -8401409 : (class5740.getName().getFormattedText().equalsIgnoreCase(Class3337.field15514.field4684.getName().getFormattedText()) ? -6684775 : new Color(16775672).getRGB()));
        if (!class5740.method1823()) {
            final float[][] array = Class3337.field15939.get(class5740);
            if (array != null) {
                if (class5740.method1768()) {
                    if (class5740 != Class3337.field15514.field4684) {
                        if (!class5740.method2783()) {
                            GL11.glPushMatrix();
                            GL11.glLineWidth(2.0f);
                            GL11.glColor4f((float)(color.getRed() / 255), (float)(color.getGreen() / 255), (float)(color.getBlue() / 255), 1.0f);
                            final Class9407 method10562 = this.method10562(class5739, class5740);
                            GL11.glTranslated(method10562.method34993() - Class3337.field15514.method5306().field35906.method18161().x, method10562.method34994() - Class3337.field15514.method5306().field35906.method18161().y, method10562.method34995() - Class3337.field15514.method5306().field35906.method18161().z);
                            final float n = class5740.field2952 + (class5740.field2951 - class5740.field2952) * Class3337.field15514.method5314();
                            GL11.glRotatef(-n, 0.0f, 1.0f, 0.0f);
                            GL11.glTranslated(0.0, 0.0, class5740.method1809() ? -0.235 : 0.0);
                            final float n2 = class5740.method1809() ? 0.6f : 0.75f;
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(-0.125, (double)n2, 0.0);
                            if (array[3][0] != 0.0f) {
                                GL11.glRotatef(array[3][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[3][1] != 0.0f) {
                                GL11.glRotatef(array[3][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[3][2] != 0.0f) {
                                GL11.glRotatef(array[3][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, (double)(-n2), 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.125, (double)n2, 0.0);
                            if (array[4][0] != 0.0f) {
                                GL11.glRotatef(array[4][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[4][1] != 0.0f) {
                                GL11.glRotatef(array[4][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[4][2] != 0.0f) {
                                GL11.glRotatef(array[4][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, (double)(-n2), 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glTranslated(0.0, 0.0, class5740.method1809() ? 0.25 : 0.0);
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.0, class5740.method1809() ? -0.05 : 0.0, class5740.method1809() ? -0.01725 : 0.0);
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(-0.375, n2 + 0.55, 0.0);
                            if (array[1][0] != 0.0f) {
                                GL11.glRotatef(array[1][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[1][1] != 0.0f) {
                                GL11.glRotatef(array[1][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[1][2] != 0.0f) {
                                GL11.glRotatef(-array[1][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, -0.5, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glTranslated(0.375, n2 + 0.55, 0.0);
                            if (array[2][0] != 0.0f) {
                                GL11.glRotatef(array[2][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[2][1] != 0.0f) {
                                GL11.glRotatef(array[2][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[2][2] != 0.0f) {
                                GL11.glRotatef(-array[2][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, -0.5, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glRotatef(n - class5740.field2953, 0.0f, 1.0f, 0.0f);
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.0, n2 + 0.55, 0.0);
                            if (array[0][0] != 0.0f) {
                                GL11.glRotatef(array[0][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, 0.3, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPopMatrix();
                            GL11.glRotatef(class5740.method1809() ? 25.0f : 0.0f, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslated(0.0, class5740.method1809() ? -0.16175 : 0.0, class5740.method1809() ? -0.48025 : 0.0);
                            GL11.glPushMatrix();
                            GL11.glTranslated(0.0, (double)n2, 0.0);
                            GL11.glBegin(3);
                            GL11.glVertex3d(-0.125, 0.0, 0.0);
                            GL11.glVertex3d(0.125, 0.0, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.0, (double)n2, 0.0);
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, 0.55, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glTranslated(0.0, n2 + 0.55, 0.0);
                            GL11.glBegin(3);
                            GL11.glVertex3d(-0.375, 0.0, 0.0);
                            GL11.glVertex3d(0.375, 0.0, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPopMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        }
                    }
                }
            }
        }
    }
    
    private Class9407 method10562(final Class5739 class5739, final Class512 class5740) {
        final float method5314 = Class3337.field15514.method5314();
        return new Class9407(class5740.lastTickPosX + (class5740.posX - class5740.lastTickPosX) * method5314, class5740.lastTickPosY + (class5740.posY - class5740.lastTickPosY) * method5314, class5740.lastTickPosZ + (class5740.posZ - class5740.lastTickPosZ) * method5314);
    }
    
    public static void method10563(final Class512 class512, final Class5860<Class512> class513) {
        Class3337.field15939.put(class512, new float[][] { { class513.field23993.field25183, class513.field23993.field25184, class513.field23993.field25185 }, { class513.field23996.field25183, class513.field23996.field25184, class513.field23996.field25185 }, { class513.field23997.field25183, class513.field23997.field25184, class513.field23997.field25185 }, { class513.field23998.field25183, class513.field23998.field25184, class513.field23998.field25185 }, { class513.field23999.field25183, class513.field23999.field25184, class513.field23999.field25185 } });
    }
    
    private boolean method10564(final Class512 class512) {
        return !Class3337.field15514.field4683.method6840().contains(class512);
    }
    
    private void method10565(final boolean b) {
        if (!b) {
            GL11.glDisable(3042);
            GL11.glDisable(2848);
            GL11.glEnable(2929);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
        }
        else {
            GL11.glPopMatrix();
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glHint(3154, 4354);
        }
        GL11.glDepthMask(b);
    }
    
    private int method10566(final LivingEntity class511) {
        final float method2664 = class511.method2664();
        final float method2665 = class511.method2701();
        return Color.HSBtoRGB(Math.max(0.0f, Math.min(method2664, method2665) / method2665) / 3.0f, 1.0f, 1.0f) | 0xFF000000;
    }
    
    static {
        Class3337.field15939 = new HashMap<Class512, float[][]>();
    }
}
