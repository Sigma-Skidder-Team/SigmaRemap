// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6452 implements Class6451
{
    @Override
    public void method19304(final BufferBuilder class4148, final Class1663 class4149) {
        RenderSystem.method30010(true);
        class4149.method5849(Class1774.field9854);
        RenderSystem.enableBlend();
        RenderSystem.method30013(Class2050.field11693, Class2135.field12460);
        RenderSystem.method30000(516, 0.003921569f);
        class4148.begin(7, DefaultVertexFormats.field39613);
    }
    
    @Override
    public void method19305(final Tessellator class7392) {
        class7392.draw();
    }
    
    @Override
    public String toString() {
        return "PARTICLE_SHEET_TRANSLUCENT";
    }
}
