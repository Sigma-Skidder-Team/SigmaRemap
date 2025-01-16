// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Objects;
import java.util.List;

public class Class534 extends Class527
{
    private static final List<ResourceLocation> field3184;
    private final Class539 field3185;
    private final Class51 field3186;
    private Class621 field3187;
    private int field3188;
    private Class654 field3189;
    
    public Class534(final Class539 field3185, final Class51 field3186) {
        super(new Class2259("createWorld.customize.buffet.title", new Object[0]));
        this.field3185 = field3185;
        this.field3186 = field3186;
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        this.method3029(new Class654((this.field3152 - 200) / 2, 40, 200, 20, Class8822.method30773("createWorld.customize.buffet.generatortype", new Object[0]) + " " + Class8822.method30773(Class8349.method27836("generator", Class534.field3184.get(this.field3188)), new Object[0]), class654 -> {
            ++this.field3188;
            if (this.field3188 >= Class534.field3184.size()) {
                this.field3188 = 0;
            }
            class654.method3367(Class8822.method30773("createWorld.customize.buffet.generatortype", new Object[0]) + " " + Class8822.method30773(Class8349.method27836("generator", Class534.field3184.get(this.field3188)), new Object[0]));
        }));
        this.field3187 = new Class621(this, null);
        this.field3149.add(this.field3187);
        this.field3189 = this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 - 28, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> {
            this.field3185.field3231 = this.method3082();
            this.field3150.method5244(this.field3185);
        }));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 - 28, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3150.method5244(this.field3185)));
        this.method3081();
        this.method3083();
    }
    
    private void method3081() {
        if (this.field3186.method316("chunk_generator", 10)) {
            if (this.field3186.method327("chunk_generator").method316("type", 8)) {
                final ResourceLocation class1932 = new ResourceLocation(this.field3186.method327("chunk_generator").method323("type"));
                for (int i = 0; i < Class534.field3184.size(); ++i) {
                    if (Class534.field3184.get(i).equals(class1932)) {
                        this.field3188 = i;
                        break;
                    }
                }
            }
        }
        if (this.field3186.method316("biome_source", 10)) {
            if (this.field3186.method327("biome_source").method316("biomes", 9)) {
                final Class52 class1934 = this.field3186.method327("biome_source").method328("biomes", 8);
                for (int n = 0; n < class1934.size(); ++n) {
                    this.field3187.method3617(this.field3187.method3040().stream().filter(class1933 -> {
                        final Class52 class1934;
                        final int n;
                        final Object o = new ResourceLocation(class1934.method353(n));
                        return Objects.equals(Class642.method3685(class1933), b);
                    }).findFirst().orElse(null));
                }
            }
        }
        this.field3186.method330("chunk_generator");
        this.field3186.method330("biome_source");
    }
    
    private Class51 method3082() {
        final Class51 class51 = new Class51();
        final Class51 class52 = new Class51();
        class52.method306("type", Registry.field223.getKey(Class7768.field31769).toString());
        final Class51 class53 = new Class51();
        final Class52 class54 = new Class52();
        ((AbstractList<Class50>)class54).add(Class50.method290(Class642.method3685(this.field3187.method3530()).toString()));
        class53.method295("biomes", class54);
        class52.method295("options", class53);
        final Class51 class55 = new Class51();
        final Class51 class56 = new Class51();
        class55.method306("type", Class534.field3184.get(this.field3188).toString());
        class56.method306("default_block", "minecraft:stone");
        class56.method306("default_fluid", "minecraft:water");
        class55.method295("options", class56);
        class51.method295("biome_source", class52);
        class51.method295("chunk_generator", class55);
        return class51;
    }
    
    public void method3083() {
        this.field3189.field3431 = (this.field3187.method3530() != null);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3043(0);
        this.field3187.method2975(n, n2, n3);
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 8, 16777215);
        this.method3295(this.field3156, Class8822.method30773("createWorld.customize.buffet.generator", new Object[0]), this.field3152 / 2, 30, 10526880);
        this.method3295(this.field3156, Class8822.method30773("createWorld.customize.buffet.biome", new Object[0]), this.field3152 / 2, 68, 10526880);
        super.method2975(n, n2, n3);
    }
    
    static {
        field3184 = Registry.field225.method507().stream().filter(class1932 -> Registry.field225.getOrDefault(class1932).method29875()).collect((Collector<? super Object, ?, List<ResourceLocation>>)Collectors.toList());
    }
}
