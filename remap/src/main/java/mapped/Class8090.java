// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.Chunk;

public class Class8090
{
    private static String[] field33320;
    
    public static void method26583(final EventReceivePacket eventReceivePacket, final Class7614 class5724) {
        if (eventReceivePacket.getPacket() instanceof Class4271) {
            final Class4271 class5725 = (Class4271) eventReceivePacket.getPacket();
            if (class5724.method23925(class5725.method12817())) {
                class5724.method23926(class5725.method12818(), class5725.method12817());
            }
            if (class5724 != null) {
                class5724.method23917();
            }
            eventReceivePacket.setPacket(class5724.method23923(eventReceivePacket.getPacket()));
        }
        if (eventReceivePacket.getPacket() instanceof Class4312) {
            for (final Class7870 class5726 : ((Class4312) eventReceivePacket.getPacket()).method12963()) {
                if (class5724.method23925(class5726.method25491())) {
                    class5724.method23926(class5726.method25489(), class5726.method25491());
                }
            }
            class5724.method23917();
            eventReceivePacket.setPacket(class5724.method23923(eventReceivePacket.getPacket()));
        }
        if (eventReceivePacket.getPacket() instanceof Class4298) {
            if (Minecraft.getInstance().world != null) {
                final Class4298 class5727 = (Class4298) eventReceivePacket.getPacket();
                final Chunk class5728 = new Chunk(Minecraft.getInstance().world, new ChunkPos(class5727.method12909(), class5727.method12910()), class5727.method12915());
                class5728.method7063(class5727.method12915(), new PacketBuffer(class5727.method12905().copy()), class5727.method12913(), class5727.method12911());
                if (class5728 != null) {
                    int n = 0;
                    for (final Class8199 class5729 : class5728.method7014()) {
                        if (class5729 != null) {
                            if (!class5729.method27154()) {
                                for (float n2 = 0.0f; n2 <= 15.0f; ++n2) {
                                    for (float n3 = 0.0f; n3 <= 15.0f; ++n3) {
                                        for (float n4 = 0.0f; n4 <= 15.0f; ++n4) {
                                            final BlockState method12965 = class5728.getBlockState(new BlockPos(n3, n * 16 + n2, n4));
                                            if (class5724.method23925(method12965)) {
                                                class5724.method23926(new BlockPos(class5728.method7019().field32290 * 16 + n3, n * 16 + n2, class5728.method7019().field32291 * 16 + n4), method12965);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ++n;
                    }
                    class5724.method23917();
                    class5724.method23928(class5728);
                    if (class5728 == null) {
                        return;
                    }
                    final Class4298 class5730 = new Class4298(class5728, (class5728.method7024() != null) ? 65535 : 65534);
                    class5730.field19274 = class5727.method12912();
                    class5730.field19273 = class5727.method12914();
                    eventReceivePacket.setPacket(class5730);
                }
            }
        }
    }
}
