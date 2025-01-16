// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class Class3285 extends Class3167
{
    public List<Class6731> field15793;
    public Set<Class7859> field15794;
    
    public Class3285() {
        super(Class8013.field32984, "Search", "Searches blocks through the world");
        this.field15793 = new ArrayList<Class6731>();
        this.field15794 = new HashSet<Class7859>();
        final Class4996 class4996;
        this.method9881(class4996 = new Class4996("Chunk Range", "Range at which search scans blocks", 5.0f, (Class<? extends T>)Float.class, 1.0f, 12.0f, 1.0f));
        final Class4999 class4997;
        this.method9881(class4997 = new Class4999("Holes", "Shows 1x1 explosion protection holes", false));
        this.method9881(new Class5003("Color", "The rendered block color", Class265.field1281.field1292, true));
        final Class5000 class4998;
        this.method9881(class4998 = new Class5000("Blocks", "Blocks to render", true, new String[0]));
        class4998.method15195(class4997 -> this.field15793.clear());
        class4996.method15195(class4997 -> this.field15793.clear());
        class4997.method15195(class4997 -> this.field15793.clear());
    }
    
    @Class6753
    public void method10370(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4271) {
                this.method10371(Class3285.field15514.world.method6685(((Class4271)class5723.method16998()).method12818()).method7019());
            }
            if (class5723.method16998() instanceof Class4312) {
                this.method10371(((Class4312)class5723.method16998()).field19330);
            }
            if (class5723.method16998() instanceof Class4298) {
                if (Minecraft.method5277().world != null) {
                    final Class4298 class5724 = (Class4298)class5723.method16998();
                    this.method10371(new Class7859(class5724.method12909(), class5724.method12910()));
                }
            }
        }
    }
    
    public void method10371(final Class7859 class7859) {
        for (final Class6731 class7860 : this.field15793) {
            if (!class7860.method20418(class7859)) {
                continue;
            }
            this.field15794.add(class7860.method20420());
        }
    }
    
    @Class6753
    public void method10372(final Class5732 class5732) {
        this.field15793.clear();
        this.field15794.clear();
    }
    
    public List<BlockPos> method10373(final Class7859 class7859) {
        final ArrayList list = new ArrayList();
        final int n = class7859.field32290 * 16;
        final int n2 = class7859.field32291 * 16;
        final int n3 = 1;
        final int n4 = n + 15;
        final int n5 = n2 + 15;
        final int n6 = 255;
        for (float n7 = (float)n3; n7 <= n6 && n7 <= 100.0f; ++n7) {
            for (float n8 = (float)n; n8 <= n4; ++n8) {
                for (float n9 = (float)n2; n9 <= n5; ++n9) {
                    list.add(new BlockPos(n8, n7, n9));
                }
            }
        }
        return list;
    }
    
    public List<BlockPos> method10374(final Class7859 class7859) {
        final ArrayList list = new ArrayList();
        if (class7859 != null) {
            final List list2 = (List)this.method9882("Blocks");
            for (final BlockPos class7860 : this.method10373(class7859)) {
                if (!list2.contains(Registry.BLOCK.getKey(Class3285.field15514.world.getBlockState(class7860).method21696()).toString())) {
                    continue;
                }
                list.add(class7860);
            }
            if (this.method9883("Holes")) {
            Label_0145:
                for (final BlockPos class7861 : this.method10373(class7859)) {
                    if (Class3285.field15514.world.getBlockState(class7861).method21696() != Class7521.field29147) {
                        continue;
                    }
                    for (final Direction class7862 : Direction.values()) {
                        if (class7862 != Direction.UP) {
                            if (Class3285.field15514.world.getBlockState(class7861.add(class7862.getDirectionVec())).method21696() != Class7521.field29286) {
                                if (Class3285.field15514.world.getBlockState(class7861.add(class7862.getDirectionVec())).method21696() != Class7521.field29172) {
                                    continue Label_0145;
                                }
                            }
                        }
                    }
                    list.add(class7861.method1139());
                }
            }
            return list;
        }
        return null;
    }
    
    @Class6753
    public void method10375(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (Class3285.field15514.player.ticksExisted >= 20) {
            final int n = (int)this.method9886("Chunk Range");
            final ArrayList list = new ArrayList();
            for (int i = -5; i < 5; ++i) {
                for (int j = -5; j < 5; ++j) {
                    list.add(new Class7859(Class3285.field15514.player.chunkCoordX + i, Class3285.field15514.player.chunkCoordZ + j));
                }
            }
            final Iterator<Class6731> iterator = this.field15793.iterator();
            while (iterator.hasNext()) {
                final Class6731 class5744 = iterator.next();
                if (class5744.method20419(new Class7859(Class3285.field15514.player.chunkCoordX, Class3285.field15514.player.chunkCoordZ)) <= 7 && !this.field15794.contains(class5744.method20420())) {
                    continue;
                }
                iterator.remove();
            }
            this.field15794.clear();
        Label_0259:
            for (final Class7859 class5745 : list) {
                final Iterator<Class6731> iterator3 = this.field15793.iterator();
                while (iterator3.hasNext()) {
                    if (!iterator3.next().method20418(class5745)) {
                        continue;
                    }
                    continue Label_0259;
                }
                this.field15793.add(new Class6731(class5745.field32290, class5745.field32291, this.method10374(class5745)));
                break;
            }
            return;
        }
        this.field15793.clear();
    }
    
    @Override
    public void method9879() {
        this.field15793.clear();
        this.field15794.clear();
    }
    
    @Class6753
    public void method10376(final Class5739 class5739) {
        if (this.method9906()) {
            this.method10377();
        }
    }
    
    public void method10377() {
        final int method19118 = Class6430.method19118(this.method9885("Color"), 0.14f);
        GL11.glPushMatrix();
        GL11.glDisable(2929);
        final Iterator<Class6731> iterator = this.field15793.iterator();
        while (iterator.hasNext()) {
            for (final BlockPos class354 : iterator.next().field26467) {
                final double n = class354.getX() - Class3285.field15514.field4644.method5833().method18161().getX();
                final double n2 = class354.getY() - Class3285.field15514.field4644.method5833().method18161().getY();
                final double n3 = class354.getZ() - Class3285.field15514.field4644.method5833().method18161().getZ();
                Class8154.method26909(new Class7644(n, n2, n3, n + 1.0, n2 + 1.0, n3 + 1.0), method19118);
            }
        }
        GL11.glEnable(2929);
        GL11.glPopMatrix();
    }
}
