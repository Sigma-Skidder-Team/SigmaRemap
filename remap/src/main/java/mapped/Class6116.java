// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class6116 implements Class6113
{
    private static String[] field24828;
    private final Minecraft field24829;
    
    public Class6116(final Minecraft field24829) {
        this.field24829 = field24829;
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        final ClientWorld field4683 = this.field24829.world;
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        final BlockPos class7353 = new BlockPos(n, n2, n3);
        final LongOpenHashSet set = new LongOpenHashSet();
        for (final BlockPos class7354 : BlockPos.getAllInBoxMutable(class7353.add(-10, -10, -10), class7353.add(10, 10, 10))) {
            final int method6992 = field4683.method6992(Class237.field911, class7354);
            final int method6993 = MathHelper.method35697((15 - method6992) / 15.0f * 0.5f + 0.16f, 0.9f, 0.9f);
            final long method6994 = Class353.method1111(class7354.toLong());
            if (set.add(method6994)) {
                Class7282.method22340(field4683.getChunkProvider().getLightManager().method7289(Class237.field911, Class353.method1092(method6994)), Class353.method1099(method6994) * 16 + 8, Class353.method1100(method6994) * 16 + 8, Class353.method1101(method6994) * 16 + 8, 16711680, 0.3f);
            }
            if (method6992 == 15) {
                continue;
            }
            Class7282.method22339(String.valueOf(method6992), class7354.getX() + 0.5, class7354.getY() + 0.25, class7354.getZ() + 0.5, method6993);
        }
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }
}
