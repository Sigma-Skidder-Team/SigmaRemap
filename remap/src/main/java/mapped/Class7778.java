// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL20;
import java.util.List;
import java.util.Iterator;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL30;

public class Class7778
{
    private static final ResourceLocation field31852;
    
    public static void method24943(final Class8902 class8902, final double n, final double n2, final double n3) {
        class8902.method31349(n, n2, n3);
    }
    
    public static void method24944() {
        if (Class9216.field39045) {
            Class9216.field39108 = true;
            Class9216.method33776(Class9216.field39262);
        }
    }
    
    public static void method24945() {
        if (Class9216.field39045) {
            Class9216.method33776(Class9216.field39262);
        }
    }
    
    public static void method24946() {
        if (Class9216.field39045) {
            Class9216.method33776(Class9216.field39262);
        }
    }
    
    public static void method24947() {
        if (Class9216.field39045) {
            Class9216.method33776(Class9216.field39258);
        }
    }
    
    public static void method24948() {
        if (Class9216.field39045) {
            Class9216.method33776(Class9216.field39279);
        }
    }
    
    public static void method24949() {
        if (Class9216.field39045) {
            Class9216.method33776(Class9216.field39258);
        }
    }
    
    public static void method24950(final Class1660 class1660, final Class7351 class1661, final Class6092 class1662, final float n) {
        if (!Class9216.field39049) {
            final boolean method33903 = Class9216.method33903();
            final boolean method33904 = Class9216.method33904();
            if (!method33903 || !method33904) {
                Class9216.method33853();
                Class9216.method33861(class1661, false);
                GL30.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                Class9216.method33909(method33903, method33904);
                class1660.method5813(class1661, class1662, n, true, false, false);
                Class9216.method33862(class1661);
                Class9216.method33910(!method33903, !method33904);
                Class9216.method33909(false, false);
            }
        }
    }
    
    public static void method24951(final Class1660 class1660, final Class7351 class1661, final Class6092 class1662, final float n) {
        if (!Class9216.field39049) {
            if (!Class9216.method33905()) {
                Class9216.method33853();
                Class8933.method31519();
                Class9216.method33861(class1661, true);
                GL30.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                Class9216.method33909(Class9216.method33911(), Class9216.method33912());
                class1660.method5813(class1661, class1662, n, true, false, true);
                Class9216.method33862(class1661);
                Class9216.method33910(true, true);
                Class9216.method33909(false, false);
            }
        }
    }
    
    public static void method24952(final Class9458 class9458, final float n, final Class7351 class9459, final Class7808 class9460, final Class756 class9461, final int n2, final boolean b) {
        Class8933.method31517(true);
        if (b) {
            Class8933.method31516(519);
            class9459.method22567();
            final IntBuffer field39291 = Class9216.field39291;
            Class9216.method33775(Class9216.field39417);
            Class9216.field39057 = true;
            class9458.method35153(n, class9459, class9460, class9461, n2);
            Class9216.field39057 = false;
            Class9216.method33775(field39291);
            class9459.method22568();
        }
        Class8933.method31516(515);
        GL30.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        class9458.method35153(n, class9459, class9460, class9461, n2);
    }
    
    public static void method24953(final Class1660 class1660, final Class7351 class1661, final Class6092 class1662, final float n) {
        if (!Class9216.field39049) {
            Class9216.method33863();
            class1660.method5813(class1661, class1662, n, false, true, false);
            Class9216.method33864();
        }
    }
    
    public static void method24954() {
        if (Class9216.field39045) {
            Class9216.method33776(Class9216.field39266);
            if (Class9216.field39266.method32329() == Class9216.field39262.method32329()) {
                Class9216.method33775(Class9216.field39418);
                Class8933.method31517(false);
            }
        }
    }
    
    public static void method24955() {
        if (Class9216.field39045) {
            Class8933.method31517(true);
            Class9216.method33776(Class9216.field39258);
        }
    }
    
    public static void method24956(final Class1660 class1660, final Class6092 class1661, final int n, final float n2, final long n3) {
        if (Class9216.field39243 > 0) {
            if (--Class9216.field39232 <= 0) {
                final Class869 method5277 = Class869.method5277();
                method5277.method5327().method15300("shadow pass");
                final Class1656 field4636 = method5277.field4636;
                Class9216.field39049 = true;
                Class9216.field39232 = Class9216.field39222;
                Class9216.method33739("pre shadow");
                GL30.glMatrixMode(5889);
                GL11.glPushMatrix();
                GL30.glMatrixMode(5888);
                GL11.glPushMatrix();
                method5277.method5327().method15300("shadow clear");
                EXTFramebufferObject.glBindFramebufferEXT(36160, Class9216.field39247);
                Class9216.method33739("shadow bind sfb");
                method5277.method5327().method15300("shadow camera");
                method24957(class1661, method5277, n2);
                final Class7351 class1662 = new Class7351();
                Class9216.method33809(class1662, class1661, n2);
                Class9216.method33739("shadow camera");
                Class9216.method33776(Class9216.field39253);
                GL30.glDrawBuffers(Class9216.field39416);
                Class9216.method33739("shadow drawbuffers");
                GL30.glReadBuffer(0);
                Class9216.method33739("shadow readbuffer");
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Class9216.field39414.get(0), 0);
                if (Class9216.field39242 != 0) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Class9216.field39413.get(0), 0);
                }
                Class9216.method33738("shadow fb");
                GL30.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
                GL30.glClear((Class9216.field39242 == 0) ? 256 : 16640);
                Class9216.method33739("shadow clear");
                method5277.method5327().method15300("shadow frustum");
                final Class6663 class1663 = new Class6663();
                method5277.method5327().method15300("shadow culling");
                final Vec3d method5278 = class1661.method18161();
                class1663.method20262(method5278.x, method5278.y, method5278.z);
                Class8933.method31621(7425);
                Class8933.method31515();
                Class8933.method31516(515);
                Class8933.method31517(true);
                Class8933.method31625(true, true, true, true);
                Class8933.method31593();
                Class8933.method31676(new Class9075(false));
                method5277.method5327().method15300("shadow prepareterrain");
                method5277.method5290().method5849(Class1774.field9853);
                method5277.method5327().method15300("shadow setupterrain");
                field4636.method5707(class1661, class1663, false, method5277.field4636.method5769(), method5277.field4684.isSpectator());
                method5277.method5327().method15300("shadow updatechunks");
                method5277.method5327().method15300("shadow terrain");
                final double method5279 = method5278.getX();
                final double method5280 = method5278.getY();
                final double method5281 = method5278.getZ();
                Class8933.method31633(5888);
                Class8933.method31635();
                Class8933.method31502();
                field4636.method5714(Class9484.field40759, class1662, method5279, method5280, method5281);
                Class9216.method33739("shadow terrain solid");
                Class8933.method31503();
                field4636.method5714(Class9484.field40760, class1662, method5279, method5280, method5281);
                Class9216.method33739("shadow terrain cutoutmipped");
                method5277.method5290().method5853(Class1774.field9853).method5868(false, false);
                field4636.method5714(Class9484.field40761, class1662, method5279, method5280, method5281);
                Class9216.method33739("shadow terrain cutout");
                method5277.method5290().method5853(Class1774.field9853).method5876();
                Class8933.method31621(7424);
                Class8933.method31504(516, 0.1f);
                Class8933.method31633(5888);
                Class8933.method31636();
                Class8933.method31635();
                method5277.method5327().method15300("shadow entities");
                final Class1656 field4637 = method5277.field4636;
                final Class8551 method5282 = method5277.method5306();
                final Class7808 method5283 = field4637.method5770().method11006();
                for (final Entity field4638 : method5277.field4683.method6806()) {
                    if (!method5282.method28705(field4638, class1663, method5279, method5280, method5281) && !field4638.method1917(method5277.field4684)) {
                        continue;
                    }
                    if (field4638 == class1661.method18166()) {
                        if (!Class9216.field39049) {
                            if (!class1661.method18168()) {
                                if (!(class1661.method18166() instanceof LivingEntity)) {
                                    continue;
                                }
                                if (!((LivingEntity)class1661.method18166()).method2783()) {
                                    continue;
                                }
                            }
                        }
                    }
                    if (field4638 instanceof Class756 && class1661.method18166() != field4638) {
                        continue;
                    }
                    Class9216.method33835(field4637.field9343 = field4638);
                    field4637.method5713(field4638, method5279, method5280, method5281, n2, class1662, method5283);
                    field4637.field9343 = null;
                }
                field4637.method5712(class1662);
                method5283.method25217(Class6332.method18767(Class1774.field9853));
                method5283.method25217(Class6332.method18768(Class1774.field9853));
                method5283.method25217(Class6332.method18770(Class1774.field9853));
                method5283.method25217(Class6332.method18774(Class1774.field9853));
                Class9216.method33839();
                Class9216.method33845();
                Class4159.method12463();
                final boolean method5284 = Class9570.field41359.method22605();
                final Class6663 class1664 = class1663;
                final Iterator<Class9071> iterator2 = field4637.method5771().iterator();
                while (iterator2.hasNext()) {
                    final List<TileEntity> method5285 = iterator2.next().field38417.method31870().method32214();
                    if (method5285.isEmpty()) {
                        continue;
                    }
                    for (final TileEntity class1665 : method5285) {
                        if (method5284) {
                            final AxisAlignedBB class1666 = (AxisAlignedBB)Class9570.method35826(class1665, Class9570.field41359, new Object[0]);
                            if (class1666 != null) {
                                if (!class1664.method20261(class1666)) {
                                    continue;
                                }
                            }
                        }
                        Class9216.method33846(class1665);
                        final BlockPos method5286 = class1665.getPos();
                        class1662.method22567();
                        class1662.method22564(method5286.getX() - method5279, method5286.getY() - method5280, method5286.getZ() - method5281);
                        Class9550.field41126.method35726(class1665, n2, class1662, method5283);
                        class1662.method22568();
                    }
                }
                field4637.method5712(class1662);
                method5283.method25217(Class6332.method18761());
                method5283.method25217(Class8752.method30263());
                method5283.method25217(Class8752.method30264());
                method5283.method25217(Class8752.method30259());
                method5283.method25217(Class8752.method30260());
                method5283.method25217(Class8752.method30261());
                method5283.method25217(Class8752.method30262());
                method5283.method25216();
                Class9216.method33739("shadow entities");
                Class8933.method31633(5888);
                Class8933.method31636();
                Class8933.method31517(true);
                Class8933.method31518();
                Class8933.method31592();
                Class8933.method31521(770, 771, 1, 0);
                Class8933.method31504(516, 0.1f);
                if (Class9216.field39243 >= 2) {
                    Class8933.method31608(33989);
                    Class9216.method33739("pre copy shadow depth");
                    GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Class9216.field39224, Class9216.field39225);
                    Class9216.method33739("copy shadow depth");
                    Class8933.method31608(33984);
                }
                Class8933.method31518();
                Class8933.method31517(true);
                method5277.method5290().method5849(Class1774.field9853);
                Class8933.method31621(7425);
                Class9216.method33739("shadow pre-translucent");
                GL30.glDrawBuffers(Class9216.field39416);
                Class9216.method33739("shadow drawbuffers pre-translucent");
                Class9216.method33738("shadow pre-translucent");
                if (Class9216.method33751()) {
                    method5277.method5327().method15300("shadow translucent");
                    field4636.method5714(Class9484.field40762, class1662, method5279, method5280, method5281);
                    Class9216.method33739("shadow translucent");
                }
                Class8933.method31677();
                Class8933.method31621(7424);
                Class8933.method31517(true);
                Class8933.method31592();
                Class8933.method31518();
                GL30.glFlush();
                Class9216.method33739("shadow flush");
                Class9216.field39049 = false;
                method5277.method5327().method15300("shadow postprocess");
                if (Class9216.field39039) {
                    if (Class9216.field39243 >= 1) {
                        if (Class9216.field39297[0]) {
                            Class8933.method31608(33988);
                            Class8933.method31617(Class9216.field39414.get(0));
                            GL30.glGenerateMipmap(3553);
                            GL30.glTexParameteri(3553, 10241, Class9216.field39298[0] ? 9984 : 9987);
                        }
                        if (Class9216.field39243 >= 2) {
                            if (Class9216.field39297[1]) {
                                Class8933.method31608(33989);
                                Class8933.method31617(Class9216.field39414.get(1));
                                GL30.glGenerateMipmap(3553);
                                GL30.glTexParameteri(3553, 10241, Class9216.field39298[1] ? 9984 : 9987);
                            }
                        }
                        Class8933.method31608(33984);
                    }
                    if (Class9216.field39242 >= 1) {
                        if (Class9216.field39299[0]) {
                            Class8933.method31608(33997);
                            Class8933.method31617(Class9216.field39413.get(0));
                            GL30.glGenerateMipmap(3553);
                            GL30.glTexParameteri(3553, 10241, Class9216.field39300[0] ? 9984 : 9987);
                        }
                        if (Class9216.field39242 >= 2) {
                            if (Class9216.field39299[1]) {
                                Class8933.method31608(33998);
                                Class8933.method31617(Class9216.field39413.get(1));
                                GL30.glGenerateMipmap(3553);
                                GL30.glTexParameteri(3553, 10241, Class9216.field39300[1] ? 9984 : 9987);
                            }
                        }
                        Class8933.method31608(33984);
                    }
                }
                Class9216.method33739("shadow postprocess");
                EXTFramebufferObject.glBindFramebufferEXT(36160, Class9216.field39246);
                GL11.glViewport(0, 0, Class9216.field39043, Class9216.field39044);
                Class9216.field39291 = null;
                method5277.method5290().method5849(Class1774.field9853);
                Class9216.method33776(Class9216.field39262);
                GL30.glMatrixMode(5888);
                GL11.glPopMatrix();
                GL30.glMatrixMode(5889);
                GL11.glPopMatrix();
                GL30.glMatrixMode(5888);
                Class9216.method33739("shadow end");
            }
        }
    }
    
    public static void method24957(final Class6092 class6092, final Class869 class6093, final float n) {
        class6092.method18154(class6093.field4683, (class6093.method5303() != null) ? class6093.method5303() : class6093.field4684, class6093.field4648.field23465 > 0, class6093.field4648.field23465 == 2, n);
    }
    
    public static void method24958(final Class6332 class6332) {
        if (class6332 == Class9484.field40759) {
            method24944();
        }
        if (class6332 == Class9484.field40760) {
            method24945();
        }
        if (class6332 == Class9484.field40761) {
            method24946();
        }
        if (class6332 == Class9484.field40762) {
            method24948();
        }
        if (Class9216.method33756(class6332)) {
            Class8933.method31593();
        }
        if (Class8543.method28677()) {
            GL20.glEnableVertexAttribArray(Class9216.field39111);
            GL20.glEnableVertexAttribArray(Class9216.field39112);
            GL20.glEnableVertexAttribArray(Class9216.field39110);
        }
    }
    
    public static void method24959(final Class6332 class6332) {
        if (Class8543.method28677()) {
            GL20.glDisableVertexAttribArray(Class9216.field39111);
            GL20.glDisableVertexAttribArray(Class9216.field39112);
            GL20.glDisableVertexAttribArray(Class9216.field39110);
        }
        if (Class9216.method33756(class6332)) {
            Class8933.method31592();
        }
    }
    
    public static void method24960(final Class6332 class6332, final Class4148 class6333) {
        if (Class9216.field39045) {
            if (!Class9216.field39049) {
                if (class6332 != Class6332.method18784()) {
                    if (class6332 != Class6332.method18785()) {
                        if (class6332.method18712().equals("eyes")) {
                            Class9216.method33837();
                        }
                    }
                    else {
                        method24968();
                    }
                }
                else {
                    method24968();
                }
            }
        }
    }
    
    public static void method24961(final Class6332 class6332, final Class4148 class6333) {
        if (Class9216.field39045) {
            if (!Class9216.field39049) {
                if (class6332 != Class6332.method18784()) {
                    if (class6332 != Class6332.method18785()) {
                        if (class6332.method18712().equals("eyes")) {
                            Class9216.method33838();
                        }
                    }
                    else {
                        method24969();
                    }
                }
                else {
                    method24969();
                }
            }
        }
    }
    
    public static void method24962() {
        GL20.glVertexAttribPointer(Class9216.field39111, 2, 5126, false, 64, 36L);
        GL20.glVertexAttribPointer(Class9216.field39112, 4, 5122, false, 64, 44L);
        GL20.glVertexAttribPointer(Class9216.field39110, 3, 5122, false, 64, 52L);
    }
    
    public static void method24963() {
        Class9216.method33776(Class9216.field39268);
    }
    
    public static void method24964() {
    }
    
    public static void method24965() {
    }
    
    public static void method24966() {
    }
    
    public static void method24967() {
        Class8933.method31518();
    }
    
    public static void method24968() {
        Class9216.method33776(Class9216.field39272);
    }
    
    public static void method24969() {
        if (!Class9216.field39045) {
            Class9216.method33776(Class9216.field39252);
        }
        else if (Class9216.method33915() && Class9216.method33908()) {
            Class9216.method33776(Class9216.field39274);
        }
        else {
            Class9216.method33776(Class9216.field39270);
        }
    }
    
    public static boolean method24970(final Class489 class489, final float n, final float n2, final Class7351 class490, final Class7807 class491, final int n3, final int n4) {
        if (!Class9216.field39049 && Class9216.field39287.method32329() == 0) {
            return false;
        }
        Class8933.method31506();
        final Class8996 method22569 = class490.method22569();
        final Matrix4f method22570 = method22569.method32111();
        final Matrix3f method22571 = method22569.method32112();
        final Class4150 method22572 = class491.method25214(Class6332.method18767(Class7778.field31852));
        final float n5 = 0.5f;
        final float n6 = n5 * 0.15f;
        final float n7 = n5 * 0.3f;
        final float n8 = n5 * 0.4f;
        final float n9 = 0.0f;
        final float n10 = 0.2f;
        final float n11 = System.currentTimeMillis() % 100000L / 100000.0f;
        final float n12 = 0.0f;
        final float n13 = 0.0f;
        final float n14 = 0.0f;
        if (class489.method2444(Direction.SOUTH)) {
            final Vec3i method22573 = Direction.SOUTH.getDirectionVec();
            final float n15 = (float)method22573.getX();
            final float n16 = (float)method22573.getY();
            final float n17 = (float)method22573.getZ();
            final float method22574 = method22571.getTransformX(n15, n16, n17);
            final float method22575 = method22571.getTransformY(n15, n16, n17);
            final float method22576 = method22571.getTransformZ(n15, n16, n17);
            method22572.method12444(method22570, n12, n13, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22574, method22575, method22576).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22574, method22575, method22576).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13 + 1.0f, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22574, method22575, method22576).method12397();
            method22572.method12444(method22570, n12, n13 + 1.0f, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22574, method22575, method22576).method12397();
        }
        if (class489.method2444(Direction.NORTH)) {
            final Vec3i method22577 = Direction.NORTH.getDirectionVec();
            final float n18 = (float)method22577.getX();
            final float n19 = (float)method22577.getY();
            final float n20 = (float)method22577.getZ();
            final float method22578 = method22571.getTransformX(n18, n19, n20);
            final float method22579 = method22571.getTransformY(n18, n19, n20);
            final float method22580 = method22571.getTransformZ(n18, n19, n20);
            method22572.method12444(method22570, n12, n13 + 1.0f, n14).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22578, method22579, method22580).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13 + 1.0f, n14).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22578, method22579, method22580).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13, n14).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22578, method22579, method22580).method12397();
            method22572.method12444(method22570, n12, n13, n14).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22578, method22579, method22580).method12397();
        }
        if (class489.method2444(Direction.EAST)) {
            final Vec3i method22581 = Direction.EAST.getDirectionVec();
            final float n21 = (float)method22581.getX();
            final float n22 = (float)method22581.getY();
            final float n23 = (float)method22581.getZ();
            final float method22582 = method22571.getTransformX(n21, n22, n23);
            final float method22583 = method22571.getTransformY(n21, n22, n23);
            final float method22584 = method22571.getTransformZ(n21, n22, n23);
            method22572.method12444(method22570, n12 + 1.0f, n13 + 1.0f, n14).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22582, method22583, method22584).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13 + 1.0f, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22582, method22583, method22584).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22582, method22583, method22584).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13, n14).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22582, method22583, method22584).method12397();
        }
        if (class489.method2444(Direction.WEST)) {
            final Vec3i method22585 = Direction.WEST.getDirectionVec();
            final float n24 = (float)method22585.getX();
            final float n25 = (float)method22585.getY();
            final float n26 = (float)method22585.getZ();
            final float method22586 = method22571.getTransformX(n24, n25, n26);
            final float method22587 = method22571.getTransformY(n24, n25, n26);
            final float method22588 = method22571.getTransformZ(n24, n25, n26);
            method22572.method12444(method22570, n12, n13, n14).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22586, method22587, method22588).method12397();
            method22572.method12444(method22570, n12, n13, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22586, method22587, method22588).method12397();
            method22572.method12444(method22570, n12, n13 + 1.0f, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22586, method22587, method22588).method12397();
            method22572.method12444(method22570, n12, n13 + 1.0f, n14).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22586, method22587, method22588).method12397();
        }
        if (class489.method2444(Direction.DOWN)) {
            final Vec3i method22589 = Direction.DOWN.getDirectionVec();
            final float n27 = (float)method22589.getX();
            final float n28 = (float)method22589.getY();
            final float n29 = (float)method22589.getZ();
            final float method22590 = method22571.getTransformX(n27, n28, n29);
            final float method22591 = method22571.getTransformY(n27, n28, n29);
            final float method22592 = method22571.getTransformZ(n27, n28, n29);
            method22572.method12444(method22570, n12, n13, n14).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22590, method22591, method22592).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13, n14).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22590, method22591, method22592).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22590, method22591, method22592).method12397();
            method22572.method12444(method22570, n12, n13, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22590, method22591, method22592).method12397();
        }
        if (class489.method2444(Direction.UP)) {
            final Vec3i method22593 = Direction.UP.getDirectionVec();
            final float n30 = (float)method22593.getX();
            final float n31 = (float)method22593.getY();
            final float n32 = (float)method22593.getZ();
            final float method22594 = method22571.getTransformX(n30, n31, n32);
            final float method22595 = method22571.getTransformY(n30, n31, n32);
            final float method22596 = method22571.getTransformZ(n30, n31, n32);
            method22572.method12444(method22570, n12, n13 + n2, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22594, method22595, method22596).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13 + n2, n14 + 1.0f).method12439(n6, n7, n8, 1.0f).method12391(n9 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22594, method22595, method22596).method12397();
            method22572.method12444(method22570, n12 + 1.0f, n13 + n2, n14).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n10 + n11).method12441(n4).method12440(n3).method12436(method22594, method22595, method22596).method12397();
            method22572.method12444(method22570, n12, n13 + n2, n14).method12439(n6, n7, n8, 1.0f).method12391(n10 + n11, n9 + n11).method12441(n4).method12440(n3).method12436(method22594, method22595, method22596).method12397();
        }
        Class8933.method31505();
        return true;
    }
    
    static {
        field31852 = new ResourceLocation("textures/entity/end_portal.png");
    }
}
