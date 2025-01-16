// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Objects;
import java.util.List;

public class Class534 extends Screen
{
    private static final List<ResourceLocation> field3184;
    private final Class539 field3185;
    private final CompoundNBT field3186;
    private Class621 field3187;
    private int field3188;
    private Class654 field3189;
    
    public Class534(final Class539 field3185, final CompoundNBT field3186) {
        super(new Class2259("createWorld.customize.buffet.title", new Object[0]));
        this.field3185 = field3185;
        this.field3186 = field3186;
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.addButton(new Class654((this.width - 200) / 2, 40, 200, 20, Class8822.method30773("createWorld.customize.buffet.generatortype", new Object[0]) + " " + Class8822.method30773(Util.method27836("generator", Class534.field3184.get(this.field3188)), new Object[0]), class654 -> {
            ++this.field3188;
            if (this.field3188 >= Class534.field3184.size()) {
                this.field3188 = 0;
            }
            class654.method3367(Class8822.method30773("createWorld.customize.buffet.generatortype", new Object[0]) + " " + Class8822.method30773(Util.method27836("generator", Class534.field3184.get(this.field3188)), new Object[0]));
        }));
        this.field3187 = new Class621(this, null);
        this.children.add(this.field3187);
        this.field3189 = this.addButton(new Class654(this.width / 2 - 155, this.height - 28, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> {
            this.field3185.field3231 = this.method3082();
            this.minecraft.displayGuiScreen(this.field3185);
        }));
        this.addButton(new Class654(this.width / 2 + 5, this.height - 28, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.minecraft.displayGuiScreen(this.field3185)));
        this.method3081();
        this.method3083();
    }
    
    private void method3081() {
        if (this.field3186.contains("chunk_generator", 10)) {
            if (this.field3186.getCompound("chunk_generator").contains("type", 8)) {
                final ResourceLocation class1932 = new ResourceLocation(this.field3186.getCompound("chunk_generator").getString("type"));
                for (int i = 0; i < Class534.field3184.size(); ++i) {
                    if (Class534.field3184.get(i).equals(class1932)) {
                        this.field3188 = i;
                        break;
                    }
                }
            }
        }
        if (this.field3186.contains("biome_source", 10)) {
            if (this.field3186.getCompound("biome_source").contains("biomes", 9)) {
                final ListNBT class1934 = this.field3186.getCompound("biome_source").getList("biomes", 8);
                for (int n = 0; n < class1934.size(); ++n) {
                    this.field3187.method3617(this.field3187.children().stream().filter(class1933 -> {
                        final ListNBT class1934;
                        final int n;
                        final Object o = new ResourceLocation(class1934.method353(n));
                        return Objects.equals(Class642.method3685(class1933), b);
                    }).findFirst().orElse(null));
                }
            }
        }
        this.field3186.remove("chunk_generator");
        this.field3186.remove("biome_source");
    }
    
    private CompoundNBT method3082() {
        final CompoundNBT class51 = new CompoundNBT();
        final CompoundNBT class52 = new CompoundNBT();
        class52.putString("type", Registry.field223.getKey(Class7768.field31769).toString());
        final CompoundNBT class53 = new CompoundNBT();
        final ListNBT class54 = new ListNBT();
        ((AbstractList<StringNBT>)class54).add(StringNBT.method290(Class642.method3685(this.field3187.method3530()).toString()));
        class53.put("biomes", class54);
        class52.put("options", class53);
        final CompoundNBT class55 = new CompoundNBT();
        final CompoundNBT class56 = new CompoundNBT();
        class55.putString("type", Class534.field3184.get(this.field3188).toString());
        class56.putString("default_block", "minecraft:stone");
        class56.putString("default_fluid", "minecraft:water");
        class55.put("options", class56);
        class51.put("biome_source", class52);
        class51.put("chunk_generator", class55);
        return class51;
    }
    
    public void method3083() {
        this.field3189.field3431 = (this.field3187.method3530() != null);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderDirtBackground(0);
        this.field3187.render(n, n2, n3);
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 8, 16777215);
        this.drawCenteredString(this.font, Class8822.method30773("createWorld.customize.buffet.generator", new Object[0]), this.width / 2, 30, 10526880);
        this.drawCenteredString(this.font, Class8822.method30773("createWorld.customize.buffet.biome", new Object[0]), this.width / 2, 68, 10526880);
        super.render(n, n2, n3);
    }
    
    static {
        field3184 = Registry.field225.method507().stream().filter(class1932 -> Registry.field225.getOrDefault(class1932).method29875()).collect((Collector<? super Object, ?, List<ResourceLocation>>)Collectors.toList());
    }
}
