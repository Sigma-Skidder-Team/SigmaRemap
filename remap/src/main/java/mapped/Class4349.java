// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.lighting.WorldLightManager;

import java.util.List;

public class Class4349 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19476;
    private int field19477;
    private int field19478;
    private int field19479;
    private int field19480;
    private int field19481;
    private int field19482;
    private List<byte[]> field19483;
    private List<byte[]> field19484;
    
    public Class4349() {
    }
    
    public Class4349(final ChunkPos class7859, final WorldLightManager class7860) {
        this.field19477 = class7859.field32290;
        this.field19478 = class7859.field32291;
        this.field19483 = Lists.newArrayList();
        this.field19484 = Lists.newArrayList();
        for (int i = 0; i < 18; ++i) {
            final Class7281 method7292 = class7860.method7288(Class237.field911).method7292(Class353.method1090(class7859, -1 + i));
            final Class7281 method7293 = class7860.method7288(Class237.field912).method7292(Class353.method1090(class7859, -1 + i));
            if (method7292 != null) {
                if (!method7292.method22329()) {
                    this.field19479 |= 1 << i;
                    this.field19483.add(method7292.method22321().clone());
                }
                else {
                    this.field19481 |= 1 << i;
                }
            }
            if (method7293 != null) {
                if (!method7293.method22329()) {
                    this.field19480 |= 1 << i;
                    this.field19484.add(method7293.method22321().clone());
                }
                else {
                    this.field19482 |= 1 << i;
                }
            }
        }
    }
    
    public Class4349(final ChunkPos class7859, final WorldLightManager class7860, final int field19479, final int field19480) {
        this.field19477 = class7859.field32290;
        this.field19478 = class7859.field32291;
        this.field19479 = field19479;
        this.field19480 = field19480;
        this.field19483 = Lists.newArrayList();
        this.field19484 = Lists.newArrayList();
        for (int i = 0; i < 18; ++i) {
            if ((this.field19479 & 1 << i) != 0x0) {
                final Class7281 method7292 = class7860.method7288(Class237.field911).method7292(Class353.method1090(class7859, -1 + i));
                if (method7292 != null && !method7292.method22329()) {
                    this.field19483.add(method7292.method22321().clone());
                }
                else {
                    this.field19479 &= ~(1 << i);
                    if (method7292 != null) {
                        this.field19481 |= 1 << i;
                    }
                }
            }
            if ((this.field19480 & 1 << i) != 0x0) {
                final Class7281 method7293 = class7860.method7288(Class237.field912).method7292(Class353.method1090(class7859, -1 + i));
                if (method7293 != null && !method7293.method22329()) {
                    this.field19484.add(method7293.method22321().clone());
                }
                else {
                    this.field19480 &= ~(1 << i);
                    if (method7293 != null) {
                        this.field19482 |= 1 << i;
                    }
                }
            }
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19477 = class8654.readVarInt();
        this.field19478 = class8654.readVarInt();
        this.field19479 = class8654.readVarInt();
        this.field19480 = class8654.readVarInt();
        this.field19481 = class8654.readVarInt();
        this.field19482 = class8654.readVarInt();
        this.field19483 = Lists.newArrayList();
        for (int i = 0; i < 18; ++i) {
            if ((this.field19479 & 1 << i) != 0x0) {
                this.field19483.add(class8654.method29487(2048));
            }
        }
        this.field19484 = Lists.newArrayList();
        for (int j = 0; j < 18; ++j) {
            if ((this.field19480 & 1 << j) != 0x0) {
                this.field19484.add(class8654.method29487(2048));
            }
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19477);
        class8654.writeVarInt(this.field19478);
        class8654.writeVarInt(this.field19479);
        class8654.writeVarInt(this.field19480);
        class8654.writeVarInt(this.field19481);
        class8654.writeVarInt(this.field19482);
        final Iterator<byte[]> iterator = this.field19483.iterator();
        while (iterator.hasNext()) {
            class8654.method29485(iterator.next());
        }
        final Iterator<byte[]> iterator2 = this.field19484.iterator();
        while (iterator2.hasNext()) {
            class8654.method29485(iterator2.next());
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17363(this);
    }
    
    public int method13059() {
        return this.field19477;
    }
    
    public int method13060() {
        return this.field19478;
    }
    
    public int method13061() {
        return this.field19479;
    }
    
    public int method13062() {
        return this.field19481;
    }
    
    public List<byte[]> method13063() {
        return this.field19483;
    }
    
    public int method13064() {
        return this.field19480;
    }
    
    public int method13065() {
        return this.field19482;
    }
    
    public List<byte[]> method13066() {
        return this.field19484;
    }
}
