// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.player.Blink;
import com.mentalfrostbyte.jello.mods.impl.player.OldHitting;
import com.mentalfrostbyte.jello.mods.impl.render.Freecam;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.Chunk;

import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

public class Class8491
{
    private static String[] field34855;
    public Minecraft field34856;
    public List<BlockPos> field34857;
    public static List<Entity> field34858;
    public static int field34859;
    public final Class7614 field34860;
    public Class4265 field34861;
    private UUID field34862;
    public boolean field34863;
    public boolean field34864;
    
    public Class8491() {
        this.field34856 = Minecraft.getInstance();
        this.field34857 = new ArrayList<BlockPos>();
        this.field34863 = false;
        this.field34860 = new Class7614(this);
    }
    
    public void method28365() {
        Client.getInstance().getEventBus().register2(this);
        new Class9367(null);
    }
    
    @EventListener
    public void method28366(final Class5751 class5751) {
        if (Class9367.method34762() == Class7906.field32452.method25613()) {
            if (this.field34856.player.method2768() <= 1) {
                class5751.setCancelled(true);
            }
        }
    }
    
    @EventListener
    public void method28367(final Class5752 class5752) {
        if (class5752.method17061() == this.field34856.gameSettings.field23442.field2161.method26047()) {
            if (Class9367.method34762() < Class7906.field32462.method25613()) {
                this.field34856.method5269().method17292(new Class4323(Class2218.field13623));
            }
        }
        if (Class9367.method34762() == Class7906.field32452.method25613()) {
            if (class5752.method17061() == 258) {
                if (this.field34861 != null) {
                    if (this.field34856.currentScreen instanceof ChatScreen) {
                        this.field34856.method5269().getNetworkManager().method11176(this.field34861);
                        this.field34861 = null;
                    }
                }
            }
        }
    }
    
    @EventListener
    @Class6763
    public void method28368(final Class5732 class5732) {
        Class8491.field34859 = 0;
        this.field34860.method23919();
    }
    
    @EventListener
    @Class6763
    public void method28369(final Class5740 class5740) {
        if (this.field34856.player != null) {
            if (this.field34856.player.method1654() == Pose.field1666) {
                if (Class9367.method34762() < Class7906.field32463.method25613() || ColorUtils.method19146()) {
                    this.field34856.player.method1653(Pose.field1663);
                }
            }
        }
    }
    
    @EventListener
    @Class6763
    public void method28370(final Class5753 class5753) {
        if (this.field34856.world != null && this.field34856.player != null) {
            final Block method21696 = this.field34856.world.getBlockState(class5753.method17064()).method21696();
            if (Class9367.method34762() == Class7906.field32452.method25613()) {
                if (method21696 instanceof Class3971) {
                    class5753.method17067(VoxelShapes.method24488(0.0, 0.0, 0.0, 1.0, 1.0, 1.0));
                }
            }
            if (Class9367.method34762() == Class7906.field32452.method25613()) {
                if (this.field34856.player.boundingBox.maxY - this.field34856.player.boundingBox.minY == 1.5) {
                    this.field34856.player.boundingBox = this.field34856.player.boundingBox.expand(0.0, 0.2999999523162842, 0.0);
                }
                if (this.field34856.player.eyeHeight == 1.27f) {
                    this.field34856.player.eyeHeight = 1.38f;
                }
            }
        }
    }
    
    @EventListener
    @Class6763
    public void method28371(final Class5743 class5743) {
        if (!this.method28375()) {
            return;
        }
        for (int size = Class8491.field34858.size(), i = 0; i < size; ++i) {
            final Entity class5744 = Class8491.field34858.get(i);
            if (!ColorUtils.method19138().contains(class5744)) {
                Class8491.field34858.remove(class5744);
                --size;
                --i;
            }
            else {
                final Iterator<ItemStack> iterator = class5744.method1800().iterator();
                boolean b = false;
                while (iterator.hasNext()) {
                    if (iterator.next().getItem() instanceof Class4077) {
                        b = true;
                    }
                }
                if (!b) {
                    Class8491.field34858.remove(class5744);
                    --size;
                    --i;
                }
            }
        }
        try {
            this.field34860.method23918();
        }
        catch (final ConcurrentModificationException ex) {}
        this.field34860.method23920();
        for (int j = -5; j < 5; ++j) {
            for (int k = -5; k < 5; ++k) {
                final Chunk method6686 = this.field34856.world.method6686(this.field34856.player.chunkCoordX + j, this.field34856.player.chunkCoordZ + k);
                if (method6686 instanceof Class1864) {
                    this.field34856.world.method6835().field10344.method34013(this.field34856.world.method6835().field10344.method34012(this.field34856.player.chunkCoordX + j, this.field34856.player.chunkCoordZ + k), new Class1863(this.field34856.world, new ChunkPos(this.field34856.player.chunkCoordX + j, this.field34856.player.chunkCoordZ + k), method6686.method7024().clone()));
                }
            }
        }
    }
    
    @EventListener
    public void method28372(final Class5721 class5721) {
        if (class5721.method16990() instanceof Class4321) {
            final int method12985 = ((Class4321)class5721.method16990()).method12985();
            if (Class464.method2352(method12985)) {
                Class8491.field34859 = method12985;
            }
        }
        if (class5721.method16990() instanceof Class4265) {
            if (((Class4265)class5721.method16990()).method12802().length() == 1) {
                return;
            }
            this.field34861 = (Class4265)class5721.method16990();
            class5721.setCancelled(true);
        }
    }
    
    @EventListener
    @Class6763
    public void method28373(final Class5723 class5723) {
        if (!Client.getInstance().moduleManager().getModuleByClass(OldHitting.class).isEnabled() && Class9367.method34762() != Class7906.field32452.method25613()) {
            if (!Class8491.field34858.isEmpty()) {
                Class8491.field34858.clear();
            }
        }
        else if (class5723.method16998() instanceof Class4402) {
            final Class4402 class5724 = (Class4402)class5723.method16998();
            if (class5724.method13249() == Class2215.field13601) {
                if (class5724.method13247() != null) {
                    if (Client.getInstance().moduleManager().getModuleByClass(OldHitting.class).isEnabled() || Class9367.method34762() == Class7906.field32452.method25613()) {
                        if (!(class5724.method13247().getItem() instanceof Class4100)) {
                            final Entity method6741 = this.field34856.world.getEntityByID(class5724.method13248());
                            if (Class8491.field34858.contains(method6741)) {
                                Class8491.field34858.remove(method6741);
                            }
                        }
                        else {
                            final Entity method6742 = this.field34856.world.getEntityByID(class5724.method13248());
                            if (!Class8491.field34858.contains(method6742)) {
                                if (!ColorUtils.method19149()) {
                                    Class8491.field34858.add(method6742);
                                }
                            }
                            class5723.setCancelled(true);
                        }
                    }
                }
            }
        }
        if (this.method28375()) {
            Class8090.method26583(class5723, this.field34860);
            if (!(class5723.method16998() instanceof Class4388)) {
                if (class5723.method16998() instanceof Class4288 && ColorUtils.method19147()) {
                    class5723.setCancelled(true);
                }
                else if (!(class5723.method16998() instanceof Class4289)) {
                    if (class5723.method16998() instanceof Class4379 && this.field34856.player != null) {
                        final Class4379 class5725 = (Class4379)class5723.method16998();
                    }
                    else if (!(class5723.method16998() instanceof Class4332)) {
                        if (class5723.method16998() instanceof Class4301) {
                            final Class4301 class5726 = (Class4301)class5723.method16998();
                            if (class5726.method12932() != Class1994.field11169) {
                                if (this.field34862 != null && class5726.method12932() == Class1994.field11170) {
                                    if (this.field34862.compareTo(class5726.method12931()) != 0) {
                                        class5723.setCancelled(true);
                                    }
                                    else {
                                        this.field34862 = null;
                                    }
                                }
                                else if (this.field34862 != null) {
                                    if (this.field34862.compareTo(class5726.method12931()) != 0) {
                                        class5723.setCancelled(true);
                                    }
                                }
                            }
                            else if (this.field34862 != null) {
                                class5723.setCancelled(true);
                            }
                            else {
                                this.field34862 = class5726.method12931();
                            }
                        }
                    }
                    else {
                        final Class4332 class5727 = (Class4332)class5723.method16998();
                    }
                }
                else {
                    final Class4289 class5728 = (Class4289)class5723.method16998();
                    if (this.field34856.world.getEntityByID(class5728.method12878()) != null) {
                        if (class5728.method12879() == 3) {
                            if (Class9367.method34762() == Class7906.field32452.method25613()) {
                                class5723.setCancelled(true);
                            }
                        }
                    }
                }
            }
            else {
                final int method6743 = ((Class4388)class5723.method16998()).method13205();
                if (Class464.method2352(method6743)) {
                    Class8491.field34859 = method6743;
                }
            }
        }
    }
    
    @EventListener
    @Class6763
    public void method28374(final Class5717 class5717) {
        if (Class9367.method34762() < Class7906.field32463.method25613() || ColorUtils.method19146()) {
            if (this.field34856.player.method1706()) {
                this.field34863 = true;
                final double field2396 = this.field34856.player.posY;
                float method34827 = Class9379.method34827();
                float n = 0.02f;
                float n2 = (float)Class8742.method30210(this.field34856.player);
                if (n2 > 3.0f) {
                    n2 = 3.0f;
                }
                if (!this.field34856.player.onGround) {
                    n2 *= 0.5f;
                }
                if (n2 > 0.0f) {
                    method34827 += (0.54600006f - method34827) * n2 / 3.0f;
                    n += (this.field34856.player.method2732() - n) * n2 / 3.0f;
                }
                if (!this.field34856.gameSettings.field23441.method1056()) {
                    if (this.field34856.player.field2968 == 0.0f) {
                        if (this.field34856.player.field2970 == 0.0f) {
                            this.field34856.player.method1816(false);
                        }
                    }
                }
                else {
                    this.field34856.player.method1816(true);
                }
                Class9379.method34822(this.field34856.player.field2968, this.field34856.player.field2969, this.field34856.player.field2970, n * (this.field34856.player.method1815() ? (this.field34856.player.onGround ? 1.5f : 1.3f) : 1.0f));
                Class9379.method34825(Class9379.field40221, Class9379.field40222, Class9379.field40223);
                Class9379.field40221 *= method34827;
                Class9379.field40222 *= 0.800000011920929;
                Class9379.field40223 *= method34827;
                if (!this.field34856.player.method1698()) {
                    Class9379.field40222 -= 0.02;
                }
                if (this.field34856.player.collidedHorizontally) {
                    if (this.field34856.player.method1669(Class9379.field40221, Class9379.field40222 + 0.6000000238418579 - this.field34856.player.posY + field2396, Class9379.field40223)) {
                        Class9379.field40222 = 0.30000001192092896;
                    }
                }
                if (this.field34856.player.field2967) {
                    Class9379.method34826();
                }
                class5717.method16973(Class9379.field40221);
                class5717.method16975(Class9379.field40222);
                class5717.method16977(Class9379.field40223);
            }
            else {
                Class9379.field40222 = this.field34856.player.getMotion().y;
                if (this.field34863) {
                    if (Class9379.method34828()) {
                        ColorUtils.method19155(Class9379.field40222 = 0.20000000298023224);
                    }
                }
                Class9379.field40221 = this.field34856.player.getMotion().x;
                Class9379.field40223 = this.field34856.player.getMotion().z;
                this.field34863 = false;
            }
        }
        if (Class9367.method34762() == Class7906.field32452.method25613()) {
            if (Math.abs(class5717.method16972()) < 0.005) {
                class5717.method16973(0.0);
                ColorUtils.method19154(class5717.method16972());
            }
            if (Math.abs(class5717.method16974()) < 0.005) {
                class5717.method16975(0.0);
                ColorUtils.method19155(class5717.method16974());
            }
            if (Math.abs(class5717.method16976()) < 0.005) {
                class5717.method16977(0.0);
                ColorUtils.method19156(class5717.method16976());
            }
        }
    }
    
    public boolean method28375() {
        return Class9367.method34762() <= Class7906.field32462.method25613();
    }
    
    @EventListener
    @Class6763
    public void method28376(final Class5729 class5729) {
        if (class5729.method17016() != this.field34856.player) {
            if (class5729.method17016() != Freecam.field15901) {
                if (class5729.method17016() != Blink.field15771) {
                    return;
                }
            }
        }
        if (class5729.method17011() != 1.0f) {
            if (UpdateWalkingEvent.field23324 - this.field34856.player.field2953 == 0.0f) {
                if (this.field34864) {
                    class5729.method17012(MathHelper.method35706(class5729.method17011(), UpdateWalkingEvent.field23326, class5729.method17016().field2951));
                    class5729.method17013(MathHelper.method35706(class5729.method17011(), UpdateWalkingEvent.field23326, class5729.method17016().field2953));
                    class5729.method17015(MathHelper.method35700(class5729.method17011(), UpdateWalkingEvent.field23327, class5729.method17016().rotationPitch));
                    class5729.method17014(class5729.method17008() - class5729.method17007());
                    class5729.method17016().prevRotationPitch = UpdateWalkingEvent.field23327;
                    class5729.method17016().prevRotationYaw = UpdateWalkingEvent.field23326;
                    class5729.method17016().field2954 = UpdateWalkingEvent.field23326;
                    class5729.method17016().field2952 = UpdateWalkingEvent.field23326;
                    this.field34864 = !this.field34864;
                }
            }
            else {
                class5729.method17012(MathHelper.method35706(class5729.method17011(), UpdateWalkingEvent.field23326, UpdateWalkingEvent.field23324));
                class5729.method17013(MathHelper.method35706(class5729.method17011(), UpdateWalkingEvent.field23326, UpdateWalkingEvent.field23324));
                class5729.method17015(MathHelper.method35700(class5729.method17011(), UpdateWalkingEvent.field23327, UpdateWalkingEvent.field23325));
                class5729.method17014(class5729.method17008() - class5729.method17007());
                this.field34864 = true;
            }
        }
    }
    
    static {
        Class8491.field34858 = new ArrayList<Entity>();
        Class8491.field34859 = 0;
    }
}
