// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6118 implements Class6113
{
    private static String[] field24834;
    private final Minecraft field24835;
    
    public Class6118(final Minecraft field24835) {
        this.field24835 = field24835;
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        final Class1848 field4683 = this.field24835.world;
        RenderSystem.method30059();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        final BlockPos class7353 = new BlockPos(n, 0.0, n3);
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        method22695.begin(5, DefaultVertexFormats.POSITION_COLOR);
        for (final BlockPos class7354 : BlockPos.getAllInBoxMutable(class7353.add(-40, 0, -40), class7353.add(40, 0, 40))) {
            final int method22696 = field4683.method6699(Class2020.field11521, class7354.getX(), class7354.getZ());
            if (!field4683.getBlockState(class7354.add(0, method22696, 0).method1139()).method21706()) {
                Class1656.method5734(method22695, class7354.getX() + 0.25f - n, method22696 - n2, class7354.getZ() + 0.25f - n3, class7354.getX() + 0.75f - n, method22696 + 0.09375 - n2, class7354.getZ() + 0.75f - n3, 0.0f, 1.0f, 0.0f, 0.5f);
            }
            else {
                Class1656.method5734(method22695, class7354.getX() + 0.25f - n, method22696 - n2, class7354.getZ() + 0.25f - n3, class7354.getX() + 0.75f - n, method22696 + 0.09375 - n2, class7354.getZ() + 0.75f - n3, 0.0f, 0.0f, 1.0f, 0.5f);
            }
        }
        method22694.draw();
        RenderSystem.enableTexture();
        RenderSystem.method30060();
    }
}
