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

public class Class561 extends Class527
{
    private static final List<Class9304> field3343;
    private final Class696 field3344;
    private String field3345;
    private String field3346;
    private Class611 field3347;
    private Class654 field3348;
    private Class576 field3349;
    
    public Class561(final Class696 field3344) {
        super(new Class2259("createWorld.customize.presets.title", new Object[0]));
        this.field3344 = field3344;
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        this.field3345 = Class8822.method30773("createWorld.customize.presets.share", new Object[0]);
        this.field3346 = Class8822.method30773("createWorld.customize.presets.list", new Object[0]);
        (this.field3349 = new Class576(this.field3156, 50, 40, this.field3152 - 100, 20, this.field3345)).method3397(1230);
        this.field3349.method3377(this.field3344.method3883());
        this.field3149.add(this.field3349);
        this.field3347 = new Class611(this);
        this.field3149.add(this.field3347);
        this.field3348 = this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 - 28, 150, 20, Class8822.method30773("createWorld.customize.presets.select", new Object[0]), class654 -> {
            this.field3344.method3885(this.field3349.method3378());
            this.field3150.method5244(this.field3344);
        }));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 - 28, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3150.method5244(this.field3344)));
        this.method3272(this.field3347.method3530() != null);
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        return this.field3347.method3012(n, n2, n3);
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        final String method3378 = this.field3349.method3378();
        this.method3038(class869, n, n2);
        this.field3349.method3377(method3378);
    }
    
    @Override
    public void method3028() {
        this.field3150.method5244(this.field3344);
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.field3347.method2975(n, n2, n3);
        Class8726.method30059();
        Class8726.method30065(0.0f, 0.0f, 400.0f);
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 8, 16777215);
        this.method3297(this.field3156, this.field3345, 50, 30, 10526880);
        this.method3297(this.field3156, this.field3346, 50, 70, 10526880);
        Class8726.method30060();
        this.field3349.method2975(n, n2, n3);
        super.method2975(n, n2, n3);
    }
    
    @Override
    public void method2992() {
        this.field3349.method3376();
        super.method2992();
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
        method3273(Class8822.method30773("createWorld.customize.preset.classic_flat", new Object[0]), Class7521.field29155, Class7102.field27633, Arrays.asList("village"), new Class9127(1, Class7521.field29155), new Class9127(2, Class7521.field29156), new Class9127(1, Class7521.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.tunnelers_dream", new Object[0]), Class7521.field29148, Class7102.field27635, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new Class9127(1, Class7521.field29155), new Class9127(5, Class7521.field29156), new Class9127(230, Class7521.field29148), new Class9127(1, Class7521.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.water_world", new Object[0]), Class7739.field31350, Class7102.field27656, Arrays.asList("biome_1", "oceanmonument"), new Class9127(90, Class7521.field29173), new Class9127(5, Class7521.field29175), new Class9127(5, Class7521.field29156), new Class9127(5, Class7521.field29148), new Class9127(1, Class7521.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.overworld", new Object[0]), Class7521.field29241, Class7102.field27633, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake", "pillager_outpost"), new Class9127(1, Class7521.field29155), new Class9127(3, Class7521.field29156), new Class9127(59, Class7521.field29148), new Class9127(1, Class7521.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.snowy_kingdom", new Object[0]), Class7521.field29329, Class7102.field27644, Arrays.asList("village", "biome_1"), new Class9127(1, Class7521.field29329), new Class9127(1, Class7521.field29155), new Class9127(3, Class7521.field29156), new Class9127(59, Class7521.field29148), new Class9127(1, Class7521.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.bottomless_pit", new Object[0]), Class7739.field31307, Class7102.field27633, Arrays.asList("village", "biome_1"), new Class9127(1, Class7521.field29155), new Class9127(3, Class7521.field29156), new Class9127(2, Class7521.field29159));
        method3273(Class8822.method30773("createWorld.customize.preset.desert", new Object[0]), Class7521.field29175, Class7102.field27634, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new Class9127(8, Class7521.field29175), new Class9127(52, Class7521.field29217), new Class9127(3, Class7521.field29148), new Class9127(1, Class7521.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.redstone_ready", new Object[0]), Class7739.field31354, Class7102.field27634, Collections.emptyList(), new Class9127(52, Class7521.field29217), new Class9127(3, Class7521.field29148), new Class9127(1, Class7521.field29172));
        method3273(Class8822.method30773("createWorld.customize.preset.the_void", new Object[0]), Class7521.field29517, Class7102.field27683, Arrays.asList("decoration"), new Class9127(1, Class7521.field29147));
    }
}
