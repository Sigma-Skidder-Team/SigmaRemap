// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class RealmsScreenProxy extends Screen
{
    private final RealmsScreen screen;
    private static final Logger LOGGER;
    
    public RealmsScreenProxy(final RealmsScreen field3288) {
        super(NarratorChatListener.EMPTY);
        this.screen = field3288;
    }
    
    public RealmsScreen getScreen() {
        return this.screen;
    }
    
    @Override
    public void init(final Minecraft class869, final int n, final int n2) {
        this.screen.init(class869, n, n2);
        super.init(class869, n, n2);
    }
    
    @Override
    public void init() {
        this.screen.init();
        super.init();
    }
    
    public void drawCenteredString(final String s, final int n, final int n2, final int n3) {
        super.method3295(this.font, s, n, n2, n3);
    }
    
    public void method3185(final String s, final int n, final int n2, final int n3, final boolean b) {
        if (!b) {
            this.font.method6610(s, (float)n, (float)n2, n3);
        }
        else {
            super.method3297(this.font, s, n, n2, n3);
        }
    }
    
    @Override
    public void method3186(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.screen.method15409(n, n2, n3, n4, n5, n6);
        super.method3186(n, n2, n3, n4, n5, n6);
    }
    
    public static void method3187(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        Class565.method3300(n, n2, n7, n8, n3, n4, n5, n6, n9, n10);
    }
    
    public static void method3188(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8) {
        Class565.method3188(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    @Override
    public void method3189(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        super.method3189(n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void renderBackground() {
        super.renderBackground();
    }
    
    @Override
    public boolean method2991() {
        return super.method2991();
    }
    
    @Override
    public void renderBackground(final int n) {
        super.renderBackground(n);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.screen.render(n, n2, n3);
    }
    
    @Override
    public void method3014(final ItemStack class8321, final int n, final int n2) {
        super.method3014(class8321, n, n2);
    }
    
    @Override
    public void method3031(final String s, final int n, final int n2) {
        super.method3031(s, n, n2);
    }
    
    @Override
    public void method3032(final List<String> list, final int n, final int n2) {
        super.method3032(list, n, n2);
    }
    
    @Override
    public void tick() {
        this.screen.tick();
        super.tick();
    }
    
    public int method3190() {
        return this.width;
    }
    
    public int method3191() {
        return this.height;
    }
    
    public int method3192() {
        return 9;
    }
    
    public int method3193(final String s) {
        return this.font.method6617(s);
    }
    
    public void method3194(final String s, final int n, final int n2, final int n3) {
        this.font.method6609(s, (float)n, (float)n2, n3);
    }
    
    public List<String> method3195(final String s, final int n) {
        return this.font.method6626(s, n);
    }
    
    public void method3196() {
        this.children.clear();
    }
    
    public void method3197(final RealmsGuiEventListener obj) {
        if (this.method3200(obj) || !this.children.add(obj.getProxy())) {
            RealmsScreenProxy.LOGGER.error("Tried to add the same widget multiple times: " + obj);
        }
    }
    
    public void method3198() {
        Realms.method25384((Iterable<String>)this.children.stream().filter(class574 -> class574 instanceof Class575).map(class575 -> ((Class575)class575).method3373().method15594()).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
    }
    
    public void method3199(final RealmsGuiEventListener obj) {
        if (!this.method3200(obj) || !this.children.remove(obj.getProxy())) {
            RealmsScreenProxy.LOGGER.error("Tried to add the same widget multiple times: " + obj);
        }
    }
    
    public boolean method3200(final RealmsGuiEventListener class5053) {
        return this.children.contains(class5053.getProxy());
    }
    
    public void method3201(final Class5610<?> class5610) {
        this.method3029(class5610.method16915());
    }
    
    public List<Class5610<?>> method3202() {
        final ArrayList arrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(this.buttons.size());
        final Iterator<Class573> iterator = this.buttons.iterator();
        while (iterator.hasNext()) {
            arrayListWithExpectedSize.add(((Class664<Object>)iterator.next()).method3725());
        }
        return arrayListWithExpectedSize;
    }
    
    public void method3203() {
        this.children.removeIf(Sets.newHashSet((Iterable)this.buttons)::contains);
        this.buttons.clear();
    }
    
    public void method3204(final Class5611 class5611) {
        this.children.remove(class5611.method16923());
        this.buttons.remove(class5611.method16923());
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.screen.mouseClicked(n, n2, n3) || super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        return this.screen.mouseReleased(n, n2, n3);
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.screen.mouseDragged(n, n2, n3, n4, n5) || super.mouseDragged(n, n2, n3, n4, n5);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        return this.screen.keyPressed(n, n2, n3) || super.keyPressed(n, n2, n3);
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        return this.screen.charTyped(c, n) || super.charTyped(c, n);
    }
    
    @Override
    public void removed() {
        this.screen.method15442();
        super.removed();
    }
    
    public int method3205(final String s, final int n, final int n2, final int n3, final boolean b) {
        return b ? this.font.method6609(s, (float)n, (float)n2, n3) : this.font.method6610(s, (float)n, (float)n2, n3);
    }
    
    public Class1844 method3206() {
        return this.font;
    }
    
    static {
        LOGGER = LogManager.getLogger();
    }
}
