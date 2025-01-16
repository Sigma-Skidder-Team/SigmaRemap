// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class8088
{
    private Minecraft field33313;
    private List<Class8733> field33314;
    public float field33315;
    public float field33316;
    private BlockPos field33317;
    private boolean field33318;
    public Class2049 field33319;
    
    public Class8088() {
        this.field33313 = Minecraft.method5277();
        this.field33314 = new ArrayList<Class8733>();
        this.field33315 = -999.0f;
        this.field33316 = -999.0f;
        this.field33318 = false;
        this.field33319 = Class2049.field11676;
    }
    
    public void method26554() {
        Client.method35173().method35188().method21094(this);
    }
    
    public void method26555() {
        this.field33314.clear();
        this.field33315 = -999.0f;
        this.field33316 = -999.0f;
        Client.method35173().method35189().method21551(BlockFly.class).method9907(false);
        Client.method35173().method35189().method21551(Fly.class).method9907(false);
    }
    
    public void method26556(final List<Class8733> field33314) {
        this.method26555();
        this.method26557(false);
        this.field33314 = field33314;
        this.field33319 = Class2049.field11676;
    }
    
    public void method26557(final boolean field33318) {
        this.field33318 = field33318;
    }
    
    public boolean method26558() {
        return this.field33318;
    }
    
    public boolean method26559() {
        return this.field33314 != null && !this.field33314.isEmpty();
    }
    
    private boolean method26560() {
        return this.method26559() && !this.method26558();
    }
    
    public float method26561() {
        if (this.method26560()) {
            return this.field33315;
        }
        return -999.0f;
    }
    
    @EventListener
    private void method26562(final Class5742 class5742) {
        if (!this.method26560()) {
            return;
        }
        final double sqrt = Math.sqrt(this.field33313.player.getMotion().x * this.field33313.player.getMotion().x + this.field33313.player.getMotion().z * this.field33313.player.getMotion().z);
        final int n = this.field33314.size() - 1;
        Class8733 class5743 = this.field33314.get(n);
        Class2049 class5744 = class5743.field36691;
        boolean equals = class5743.field36684.method30692().equals(this.field33313.player.method1894());
        if (class5744 == Class2049.field11679 && this.field33313.world.getBlockState(class5743.field36684.method30692().method1139()).method21706()) {
            equals = false;
        }
        final boolean b = (this.method26566() == Class2049.field11677 || this.method26566() == Class2049.field11678 || this.method26566() == Class2049.field11679) && !this.field33313.player.onGround;
        if (equals && !b) {
            this.field33314.remove(n);
            if (this.field33314.size() == 0) {
                Class6430.method19154(0.0);
                Class6430.method19156(0.0);
                this.method26555();
                return;
            }
            class5743 = this.field33314.get(this.field33314.size() - 1);
            class5744 = class5743.field36691;
            if (this.field33313.player.onGround) {
                final float n2 = Class8845.method30920(this.field33313.player.method1934(), class5743.field36684.method30686())[0];
                final double n3 = Math.cos(Math.toRadians(n2 + 90.0f)) * sqrt;
                final double n4 = Math.sin(Math.toRadians(n2 + 90.0f)) * sqrt;
                Class6430.method19154(n3);
                Class6430.method19156(n4);
            }
        }
        if (!this.field33313.player.onGround && this.method26563(class5743.field36684.method30692())) {
            this.field33313.player.field2970 = 0.0f;
            this.field33313.player.field2968 = 0.0f;
            Class6430.method19106("STOPED");
            return;
        }
        this.field33313.player.method1816(true);
        final double method16745 = class5743.field36684.method30686().distanceTo(this.field33313.player.method1934());
        final Vec3d method16746 = class5743.field36684.method30686().subtract(this.field33313.player.method1934());
        final double n5 = Math.abs(method16746.x) + Math.abs(method16746.z);
        final float field33315 = Class8845.method30920(this.field33313.player.method1934(), class5743.field36684.method30686())[0];
        final double n6 = Math.min(method16745 * 0.75, Class7482.method23137()) * 0.8999999761581421;
        this.field33315 = field33315;
        if (class5743.field36684.method30692().add(0, -class5743.field36684.method30692().getY(), 0).equals(this.field33313.player.method1894().add(0, -this.field33313.player.method1894().getY(), 0)) && this.field33313.player.fallDistance > 0.0f) {}
        final double cos = Math.cos(Math.toRadians(this.field33313.player.rotationYaw - field33315));
        final double sin = Math.sin(Math.toRadians(this.field33313.player.rotationYaw - field33315));
        final double min = Math.min(1.0 / Math.abs(cos), 1.0 / Math.abs(sin));
        this.field33313.player.field2970 = (float)(cos * min);
        this.field33313.player.field2968 = (float)(sin * min);
        final double n7 = Math.cos(Math.toRadians(field33315 + 90.0f)) * sqrt;
        final double n8 = Math.sin(Math.toRadians(field33315 + 90.0f)) * sqrt;
        final boolean method16747 = Class8353.method27876();
        final boolean method16748 = Class8353.method27875(class5743);
        final boolean b2 = this.field33313.world.method6981(this.field33313.player, this.field33313.player.getBoundingBox().offset(n7, -1.0, n8)).count() == 0L;
        boolean b3 = false;
        boolean b4 = false;
        final float field33316 = this.field33313.player.rotationYaw;
        this.field33313.player.rotationYaw = field33315;
        switch (Class8126.field33476[class5744.ordinal()]) {
            case 1: {
                if (method16748 && method16747) {
                    this.field33313.player.method2725();
                    final Class2049 field33317 = Class2049.field11676;
                    break;
                }
                break;
            }
            case 2: {
                if (method16748 && method16747 && b2) {
                    this.field33313.player.method2725();
                    final Class2049 field33318 = Class2049.field11676;
                    break;
                }
                break;
            }
            case 3: {
                b4 = true;
                break;
            }
            case 4: {
                b3 = true;
                break;
            }
        }
        this.field33313.player.rotationYaw = field33316;
        if (b4 && !this.field33313.player.onGround && !Client.method35173().method35189().method21551(Fly.class).method9906()) {
            Class6430.method19154(0.0);
            Class6430.method19156(0.0);
            return;
        }
        if (Client.method35173().method35189().method21551(Fly.class).method9906() && !Class6430.method19160(this.field33313.player, 5.0f)) {
            b4 = true;
        }
        Client.method35173().method35189().method21551(BlockFly.class).method9907(b3);
        Client.method35173().method35189().method21551(Fly.class).method9907(b4);
        if (b && equals) {
            Class6430.method19154(0.0);
            Class6430.method19156(0.0);
            Class6430.method19106("qzd: " + n5 % 1.0);
            return;
        }
        if (this.field33317 != null) {
            return;
        }
        this.field33315 = field33315;
        if (method16745 > 10.0) {
            this.method26555();
        }
    }
    
    public boolean method26563(final BlockPos class354) {
        final float n = class354.getX() + 0.5f;
        final float n2 = class354.getZ() + 0.5f;
        double field22770 = this.field33313.player.getMotion().x;
        double field22771 = this.field33313.player.getMotion().z;
        double field22772 = this.field33313.player.posX;
        double field22773 = this.field33313.player.posZ;
        while (Math.abs(field22770) + Math.abs(field22771) > 0.05) {
            field22770 *= 0.8999999761581421;
            field22771 *= 0.8999999761581421;
            field22772 += field22770;
            field22773 += field22771;
            final double abs = Math.abs(field22772 - n);
            final double abs2 = Math.abs(field22773 - n2);
            Math.sqrt(abs + abs2);
            if (abs <= 0.3 && abs2 <= 0.3) {
                return true;
            }
        }
        return false;
    }
    
    @EventListener
    private void method26564(final Class5744 class5744) {
        if (!class5744.method17046()) {
            return;
        }
        if (this.method26560()) {
            final ArrayList list = new ArrayList();
            final Class8733 class5745 = this.field33314.get(this.field33314.size() - 1);
            if (this.field33316 != -999.0f) {
                if (class5745.field36691 == Class2049.field11679) {}
            }
            final Iterator<Long> iterator = class5745.field36693.iterator();
            while (iterator.hasNext()) {
                final BlockPos method1129 = BlockPos.fromLong(iterator.next());
                if (this.field33313.player.method1934().squareDistanceTo(method1129.getX(), method1129.getY(), method1129.getZ()) >= 9.0) {
                    continue;
                }
                if (Class8797.method30696(method1129)) {
                    continue;
                }
                if (this.field33313.world.getBlockState(method1129).method21706()) {
                    continue;
                }
                list.add(method1129);
            }
            Class4609.method13675(list);
            if (list.isEmpty()) {
                this.field33317 = null;
            }
            else if (this.field33317 != null) {
                if (this.field33313.world.getBlockState(this.field33317).method21706() || Math.sqrt(this.field33313.player.method1733(this.field33317.getX() + 0.5, this.field33317.getY() + 0.5, this.field33317.getZ() + 0.5)) > 6.0) {
                    this.field33317 = (BlockPos)list.get(0);
                }
                final float[] method1130 = Class4609.method13672(this.field33317, Class4609.method13710(this.field33317));
                class5744.method17043(method1130[0]);
                class5744.method17041(method1130[1]);
                this.field33313.player.method2707(Class316.field1877);
                this.field33313.field4682.method27314(this.field33317, Class4609.method13710(this.field33317));
            }
            else {
                this.field33317 = (BlockPos)list.get(0);
                final float[] method1131 = Class4609.method13672(this.field33317, Class4609.method13710(this.field33317));
                class5744.method17043(method1131[0]);
                class5744.method17041(method1131[1]);
                Client.method35173().method35188().method21097(new Class5752(0, false, this.field33317));
            }
            if (class5745.field36691 != Class2049.field11679) {
                this.field33316 = class5744.method17040();
                this.field33315 = class5744.method17042();
            }
        }
    }
    
    @EventListener
    public void method26565(final Class5738 class5738) {
        if (this.method26560() && this.field33313.player.onGround) {
            if (this.field33314.get(this.field33314.size() - 1).field36691 == Class2049.field11679) {
                class5738.method17026(true);
            }
        }
    }
    
    public Class2049 method26566() {
        if (this.field33314.size() <= 1) {
            return Class2049.field11676;
        }
        return this.field33314.get(this.field33314.size() - 2).field36691;
    }
    
    @EventListener
    public void method26567(final Class5739 class5739) {
        if (!this.method26560()) {
            return;
        }
        if (this.field33314 != null) {
            for (final Class8733 class5740 : this.field33314) {
                this.method26568(class5740.field36684.method30683(), class5740.field36684.method30684(), class5740.field36684.method30685(), class5740.field36691 + "");
            }
        }
        if (Class4609.method13694(this.field33313.player.rotationYaw, this.field33313.player.rotationPitch, 100.0f) != null) {
            if (this.field33314 != null) {
                if (this.field33314.size() > 0) {
                    final int method19118 = Class6430.method19118(Class265.field1285.field1292, 0.02f);
                    final int method19119 = Class6430.method19118(Class265.field1276.field1292, 0.02f);
                    GL11.glPushMatrix();
                    GL11.glDisable(2929);
                    final Iterator<Long> iterator2 = this.field33314.get(0).field36694.iterator();
                    while (iterator2.hasNext()) {
                        final BlockPos method19120 = BlockPos.fromLong(iterator2.next());
                        if (!this.field33313.world.getBlockState(method19120).method21706()) {
                            final double n = method19120.getX() - this.field33313.field4644.method5833().method18161().getX();
                            final double n2 = method19120.getY() - this.field33313.field4644.method5833().method18161().getY();
                            final double n3 = method19120.getZ() - this.field33313.field4644.method5833().method18161().getZ();
                            Class8154.method26909(new Class7644(n, n2, n3, n + 1.0, n2 + 1.0, n3 + 1.0), method19118);
                        }
                    }
                    final Iterator<Long> iterator3 = this.field33314.get(0).field36695.iterator();
                    while (iterator3.hasNext()) {
                        final BlockPos method19121 = BlockPos.fromLong(iterator3.next());
                        if (this.field33313.world.getBlockState(method19121).method21706()) {
                            final double n4 = method19121.getX() - this.field33313.field4644.method5833().method18161().getX();
                            final double n5 = method19121.getY() - this.field33313.field4644.method5833().method18161().getY();
                            final double n6 = method19121.getZ() - this.field33313.field4644.method5833().method18161().getZ();
                            Class8154.method26909(new Class7644(n4, n5, n6, n4 + 1.0, n5 + 1.0, n6 + 1.0), method19119);
                        }
                    }
                    GL11.glEnable(2929);
                    GL11.glPopMatrix();
                }
            }
        }
    }
    
    public void method26568(final double n, final double n2, final double n3, final String s) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glAlphaFunc(519, 0.0f);
        GL11.glPushMatrix();
        GL11.glTranslated(n - this.field33313.field4644.method5833().method18161().getX() + 0.5, n2 - this.field33313.field4644.method5833().method18161().getY(), n3 - this.field33313.field4644.method5833().method18161().getZ() + 0.5);
        GL11.glAlphaFunc(519, 0.0f);
        GL11.glRotatef(this.field33313.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
        GL11.glRotatef(this.field33313.field4644.method5833().method18163(), 1.0f, 0.0f, 0.0f);
        final Class7524 field40314 = Class9400.field40314;
        GL11.glPushMatrix();
        GL11.glScalef(-0.01f, -0.01f, -0.01f);
        Class8154.method26876((float)(-field40314.method23505(s) / 2 - 10), 0.0f, (float)(field40314.method23505(s) / 2 + 10), (float)(field40314.method23539() + 2), Class6430.method19118(Class265.field1273.field1292, 0.1f));
        GL11.glTranslated((double)(-field40314.method23505(s) / 2), 0.0, 0.0);
        Class8154.method26889(field40314, 0.0f, 0.0f, s, Class6430.method19118(Class265.field1278.field1292, 0.3f));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
}
