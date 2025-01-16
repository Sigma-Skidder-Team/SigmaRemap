// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.List;

public abstract class RealmsScreen extends RealmsGuiEventListener implements RealmsConfirmResultListener
{
    public static final int field21624 = 8;
    public static final int field21625 = 8;
    public static final int field21626 = 8;
    public static final int field21627 = 8;
    public static final int field21628 = 40;
    public static final int field21629 = 8;
    public static final int field21630 = 8;
    public static final int field21631 = 8;
    public static final int field21632 = 64;
    public static final int field21633 = 64;
    private Minecraft minecraft;
    public int width;
    public int height;
    private final RealmsScreenProxy proxy;
    
    public RealmsScreen() {
        this.proxy = new RealmsScreenProxy(this);
    }
    
    public RealmsScreenProxy getProxy() {
        return this.proxy;
    }
    
    public void init() {
    }
    
    public void init(final Minecraft field21634, final int n, final int n2) {
        this.minecraft = field21634;
    }
    
    public void drawCenteredString(final String s, final int n, final int n2, final int n3) {
        this.proxy.drawCenteredString(s, n, n2, n3);
    }
    
    public int method15406(final String s, final int n, final int n2, final int n3, final boolean b) {
        return this.proxy.method3205(s, n, n2, n3, b);
    }
    
    public void method15407(final String s, final int n, final int n2, final int n3) {
        this.method15408(s, n, n2, n3, true);
    }
    
    public void method15408(final String s, final int n, final int n2, final int n3, final boolean b) {
        this.proxy.method3185(s, n, n2, n3, false);
    }
    
    public void method15409(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.proxy.blit(n, n2, n3, n4, n5, n6);
    }
    
    public static void method15410(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        AbstractGui.blit(n, n2, n7, n8, n3, n4, n5, n6, n9, n10);
    }
    
    public static void method15411(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8) {
        AbstractGui.blit(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void method15412(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.proxy.fillGradient(n, n2, n3, n4, n5, n6);
    }
    
    public void method15413() {
        this.proxy.renderBackground();
    }
    
    public boolean method15414() {
        return this.proxy.method2991();
    }
    
    public void method15415(final int n) {
        this.proxy.renderBackground(n);
    }
    
    public void render(final int n, final int n2, final float n3) {
        for (int i = 0; i < this.proxy.method3202().size(); ++i) {
            this.proxy.method3202().get(i).method16920(n, n2, n3);
        }
    }
    
    public void method15416(final ItemStack class8321, final int n, final int n2) {
        this.proxy.renderTooltip(class8321, n, n2);
    }
    
    public void method15417(final String s, final int n, final int n2) {
        this.proxy.renderTooltip(s, n, n2);
    }
    
    public void method15418(final List<String> list, final int n, final int n2) {
        this.proxy.renderTooltip(list, n, n2);
    }
    
    public static void method15419(final String s) {
        Realms.method25380(s);
    }
    
    public void tick() {
        this.method15420();
    }
    
    public void method15420() {
        final Iterator<Class5610<?>> iterator = this.method15432().iterator();
        while (iterator.hasNext()) {
            iterator.next().method16922();
        }
    }
    
    public int width() {
        return this.proxy.width;
    }
    
    public int height() {
        return this.proxy.height;
    }
    
    public int method15423() {
        return this.proxy.method3192();
    }
    
    public int method15424(final String s) {
        return this.proxy.method3193(s);
    }
    
    public void method15425(final String s, final int n, final int n2, final int n3) {
        this.proxy.method3194(s, n, n2, n3);
    }
    
    public List<String> method15426(final String s, final int n) {
        return this.proxy.method3195(s, n);
    }
    
    public void method15427() {
        this.proxy.method3196();
    }
    
    public void method15428(final RealmsGuiEventListener class5053) {
        this.proxy.method3197(class5053);
    }
    
    public void method15429(final RealmsGuiEventListener class5053) {
        this.proxy.method3199(class5053);
    }
    
    public boolean method15430(final RealmsGuiEventListener class5053) {
        return this.proxy.method3200(class5053);
    }
    
    public void buttonsAdd(final Class5610<?> class5610) {
        this.proxy.method3201(class5610);
    }
    
    public List<Class5610<?>> method15432() {
        return this.proxy.method3202();
    }
    
    public void method15433() {
        this.proxy.method3203();
    }
    
    public void method15434(final RealmsGuiEventListener class5053) {
        this.proxy.func_212932_b(class5053.getProxy());
    }
    
    public Class5065 method15435(final int n, final int n2, final int n3, final int n4, final int n5) {
        return this.method15436(n, n2, n3, n4, n5, "");
    }
    
    public Class5065 method15436(final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        return new Class5065(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void confirmResult(final boolean b, final int n) {
    }
    
    public static String getLocalizedString(final String s) {
        return Realms.method25379(s, new Object[0]);
    }
    
    public static String method15439(final String s, final Object... array) {
        return Realms.method25379(s, array);
    }
    
    public List<String> method15440(final String s, final int n) {
        return this.minecraft.fontRenderer.method6626(Class8822.method30773(s, new Object[0]), n);
    }
    
    public Class7417 method15441() {
        return new Class7417(Minecraft.method5277().method5243());
    }
    
    public void method15442() {
    }
    
    public void method15443(final Class5611 class5611) {
        this.proxy.method3204(class5611);
    }
    
    public void method15444(final boolean b) {
        this.minecraft.field4651.method22505(b);
    }
    
    public boolean method15445(final int n) {
        return Class8341.method27798(Minecraft.method5277().method5332().method7690(), n);
    }
    
    public void method15446() {
        this.getProxy().method3198();
    }
    
    public boolean method15447(final RealmsGuiEventListener class5053) {
        return this.getProxy().getFocused() == class5053.getProxy();
    }
}
