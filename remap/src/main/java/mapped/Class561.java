// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Arrays;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.List;

public class Class561 extends Screen
{
    private static final List<Class9304> field3343;
    private final Class696 field3344;
    private String field3345;
    private String field3346;
    private Class611 field3347;
    private Class654 field3348;
    private Class576 field3349;
    
    public Class561(final Class696 field3344) {
        super(new Class2259("createWorld.customize.presets.title"));
        this.field3344 = field3344;
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.field3345 = Class8822.method30773("createWorld.customize.presets.share");
        this.field3346 = Class8822.method30773("createWorld.customize.presets.list");
        (this.field3349 = new Class576(this.font, 50, 40, this.width - 100, 20, this.field3345)).method3397(1230);
        this.field3349.method3377(this.field3344.method3883());
        this.children.add(this.field3349);
        this.field3347 = new Class611(this);
        this.children.add(this.field3347);
        this.field3348 = this.addButton(new Class654(this.width / 2 - 155, this.height - 28, 150, 20, Class8822.method30773("createWorld.customize.presets.select"), class654 -> {
            this.field3344.method3885(this.field3349.method3378());
            this.minecraft.displayGuiScreen(this.field3344);
        }));
        this.addButton(new Class654(this.width / 2 + 5, this.height - 28, 150, 20, Class8822.method30773("gui.cancel"), class654 -> this.minecraft.displayGuiScreen(this.field3344)));
        this.method3272(this.field3347.method3530() != null);
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return this.field3347.mouseScrolled(n, n2, n3);
    }
    
    @Override
    public void method2970(final Minecraft class869, final int n, final int n2) {
        final String method3378 = this.field3349.method3378();
        this.init(class869, n, n2);
        this.field3349.method3377(method3378);
    }
    
    @Override
    public void onClose() {
        this.minecraft.displayGuiScreen(this.field3344);
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.field3347.render(n, n2, n3);
        RenderSystem.pushMatrix();
        RenderSystem.translatef(0.0f, 0.0f, 400.0f);
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 8, 16777215);
        this.drawString(this.font, this.field3345, 50, 30, 10526880);
        this.drawString(this.font, this.field3346, 50, 70, 10526880);
        RenderSystem.popMatrix();
        this.field3349.render(n, n2, n3);
        super.render(n, n2, n3);
    }
    
    @Override
    public void tick() {
        this.field3349.method3376();
        super.tick();
    }
    
    public void method3272(final boolean b) {
        this.field3348.field3431 = (b || this.field3349.method3378().length() > 1);
    }
    
    private static void method3273(final String s, final Class3832 class3832, final Class3090 class3833, final List<String> list, final Class9127... array) {
        final Class7067 class3834 = Class8705.field36578.method29874();
        for (int i = array.length - 1; i >= 0; --i) {
            class3834.method21590().add(array[i]);
        }
        class3834.method21588(class3833);
        class3834.method21591();
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            class3834.method21589().put(iterator.next(), Maps.newHashMap());
        }
        Class561.field3343.add(new Class9304(class3832.method11704(), s, class3834.toString()));
    }
    
    static {
        field3343 = Lists.newArrayList();
        method3273(Class8822.method30773("createWorld.customize.preset.classic_flat"), Blocks.GRASS_BLOCK, Class7102.field27633, Collections.singletonList("village"), new Class9127(1, Blocks.GRASS_BLOCK), new Class9127(2, Blocks.DIRT), new Class9127(1, Blocks.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.tunnelers_dream"), Blocks.STONE, Class7102.field27635, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new Class9127(1, Blocks.GRASS_BLOCK), new Class9127(5, Blocks.DIRT), new Class9127(230, Blocks.STONE), new Class9127(1, Blocks.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.water_world"), Items.field31350, Class7102.field27656, Arrays.asList("biome_1", "oceanmonument"), new Class9127(90, Blocks.field29173), new Class9127(5, Blocks.field29175), new Class9127(5, Blocks.DIRT), new Class9127(5, Blocks.STONE), new Class9127(1, Blocks.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.overworld"), Blocks.field29241, Class7102.field27633, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake", "pillager_outpost"), new Class9127(1, Blocks.GRASS_BLOCK), new Class9127(3, Blocks.DIRT), new Class9127(59, Blocks.STONE), new Class9127(1, Blocks.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.snowy_kingdom"), Blocks.field29329, Class7102.field27644, Arrays.asList("village", "biome_1"), new Class9127(1, Blocks.field29329), new Class9127(1, Blocks.GRASS_BLOCK), new Class9127(3, Blocks.DIRT), new Class9127(59, Blocks.STONE), new Class9127(1, Blocks.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.bottomless_pit"), Items.field31307, Class7102.field27633, Arrays.asList("village", "biome_1"), new Class9127(1, Blocks.GRASS_BLOCK), new Class9127(3, Blocks.DIRT), new Class9127(2, Blocks.COBBLESTONE));
        method3273(Class8822.method30773("createWorld.customize.preset.desert"), Blocks.field29175, Class7102.field27634, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new Class9127(8, Blocks.field29175), new Class9127(52, Blocks.field29217), new Class9127(3, Blocks.STONE), new Class9127(1, Blocks.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.redstone_ready"), Items.field31354, Class7102.field27634, Collections.emptyList(), new Class9127(52, Blocks.field29217), new Class9127(3, Blocks.STONE), new Class9127(1, Blocks.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.the_void"), Blocks.field29517, Class7102.field27683, Collections.singletonList("decoration"), new Class9127(1, Blocks.AIR));
    }
}
