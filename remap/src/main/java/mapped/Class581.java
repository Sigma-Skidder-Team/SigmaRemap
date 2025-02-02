// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collection;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Locale;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Class581 extends AbstractGui implements IRenderable, IGuiEventListener, Class586, Class587<Ingredient>
{
    public static final ResourceLocation field3462;
    private int field3463;
    private int field3464;
    private int field3465;
    public final Class7877 field3466;
    private final List<Class646> field3467;
    private Class646 field3468;
    public Class645 field3469;
    public Class3426<?> field3470;
    public Minecraft field3471;
    private Class576 field3472;
    private String field3473;
    public Class6520 field3474;
    public final Class9257 field3475;
    public final Class5024 field3476;
    private int field3477;
    private boolean field3478;
    
    public Class581() {
        this.field3466 = new Class7877();
        this.field3467 = Lists.newArrayList();
        this.field3473 = "";
        this.field3475 = new Class9257();
        this.field3476 = new Class5024();
    }
    
    public void method3415(final int field3464, final int field3465, final Minecraft field3466, final boolean b, final Class3426<?> class3426) {
        this.field3471 = field3466;
        this.field3464 = field3464;
        this.field3465 = field3465;
        this.field3470 = class3426;
        field3466.player.field3009 = class3426;
        this.field3474 = field3466.player.method4122();
        this.field3477 = field3466.player.inventory.method2373();
        if (this.method3421()) {
            this.method3416(b);
        }
        field3466.field4651.method22505(true);
    }
    
    public void method3416(final boolean b) {
        this.field3463 = (b ? 0 : 86);
        final int n = (this.field3464 - 147) / 2 - this.field3463;
        final int n2 = (this.field3465 - 166) / 2;
        this.field3476.method15254();
        this.field3471.player.inventory.method2379(this.field3476);
        this.field3470.method10934(this.field3476);
        final String s = (this.field3472 == null) ? "" : this.field3472.method3378();
        (this.field3472 = new Class576(this.field3471.fontRenderer, n + 25, n2 + 14, 80, 14, Class8822.method30773("itemGroup.search", new Object[0]))).method3397(50);
        this.field3472.method3401(false);
        this.field3472.method3410(true);
        this.field3472.method3402(16777215);
        this.field3472.method3377(s);
        this.field3475.method34148(this.field3471, n, n2);
        this.field3475.method34149(this);
        this.field3469 = new Class645(n + 110, n2 + 12, 26, 16, this.field3474.method19705(this.field3470));
        this.method3417();
        this.field3467.clear();
        final Iterator<Class1956> iterator = Class6520.method19687(this.field3470).iterator();
        while (iterator.hasNext()) {
            this.field3467.add(new Class646(iterator.next()));
        }
        if (this.field3468 != null) {
            this.field3468 = this.field3467.stream().filter(class646 -> class646.method3696().equals(this.field3468.method3696())).findFirst().orElse(null);
        }
        if (this.field3468 == null) {
            this.field3468 = this.field3467.get(0);
        }
        this.field3468.method3691(true);
        this.method3424(false);
        this.method3425();
    }
    
    @Override
    public boolean changeFocus(final boolean b) {
        return false;
    }
    
    public void method3417() {
        this.field3469.method3690(152, 41, 28, 18, Class581.field3462);
    }
    
    public void method3418() {
        this.field3472 = null;
        this.field3468 = null;
        this.field3471.field4651.method22505(false);
    }
    
    public int method3419(final boolean b, final int n, final int n2) {
        int n3;
        if (this.method3421() && !b) {
            n3 = 177 + (n - n2 - 200) / 2;
        }
        else {
            n3 = (n - n2) / 2;
        }
        return n3;
    }
    
    public void method3420() {
        this.method3422(!this.method3421());
    }
    
    public boolean method3421() {
        return this.field3474.method19703();
    }
    
    public void method3422(final boolean b) {
        this.field3474.method19704(b);
        if (!b) {
            this.field3475.method34157();
        }
        this.method3441();
    }
    
    public void method3423(final Class6601 class6601) {
        if (class6601 != null) {
            if (class6601.field26174 < this.field3470.method10940()) {
                this.field3466.method25520();
                if (this.method3421()) {
                    this.method3427();
                }
            }
        }
    }
    
    private void method3424(final boolean b) {
        final List<Class9586> method19689 = this.field3474.method19689(this.field3468.method3696());
        method19689.forEach(class9586 -> class9586.method35941(this.field3476, this.field3470.method10938(), this.field3470.method10939(), this.field3474));
        final ArrayList arrayList = Lists.newArrayList((Iterable)method19689);
        arrayList.removeIf(class9587 -> !class9587.method35939());
        arrayList.removeIf(class9588 -> !class9588.method35944());
        if (!this.field3472.method3378().isEmpty()) {
            arrayList.removeIf(class9589 -> {
                final String s;
                final Object o = new ObjectLinkedOpenHashSet((Collection)this.field3471.method5309(Class1659.field9377).method31456(s.toLowerCase(Locale.ROOT)));
                return !set.contains((Object)class9589);
            });
        }
        if (this.field3474.method19705(this.field3470)) {
            arrayList.removeIf(class9590 -> !class9590.method35943());
        }
        this.field3475.method34150(arrayList, b);
    }
    
    private void method3425() {
        final int n = (this.field3464 - 147) / 2 - this.field3463 - 30;
        final int n2 = (this.field3465 - 166) / 2 + 3;
        int n3 = 0;
        for (final Class646 class646 : this.field3467) {
            final Class1956 method3696 = class646.method3696();
            if (method3696 != Class1956.field10648 && method3696 != Class1956.field10653) {
                if (!class646.method3697(this.field3474)) {
                    continue;
                }
                class646.method3693(n, n2 + 27 * n3++);
                class646.method3694(this.field3471);
            }
            else {
                class646.field3432 = true;
                class646.method3693(n, n2 + 27 * n3++);
            }
        }
    }
    
    public void method3426() {
        if (this.method3421()) {
            if (this.field3477 != this.field3471.player.inventory.method2373()) {
                this.method3427();
                this.field3477 = this.field3471.player.inventory.method2373();
            }
        }
    }
    
    private void method3427() {
        this.field3476.method15254();
        this.field3471.player.inventory.method2379(this.field3476);
        this.field3470.method10934(this.field3476);
        this.method3424(false);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (this.method3421()) {
            RenderSystem.method30059();
            RenderSystem.method30065(0.0f, 0.0f, 100.0f);
            this.field3471.method5290().method5849(Class581.field3462);
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            final int n4 = (this.field3464 - 147) / 2 - this.field3463;
            final int n5 = (this.field3465 - 166) / 2;
            this.blit(n4, n5, 1, 1, 147, 166);
            this.field3472.render(n, n2, n3);
            final Iterator<Class646> iterator = this.field3467.iterator();
            while (iterator.hasNext()) {
                iterator.next().render(n, n2, n3);
            }
            this.field3469.render(n, n2, n3);
            this.field3475.method34153(n4, n5, n, n2, n3);
            RenderSystem.method30060();
        }
    }
    
    public void method3428(final int n, final int n2, final int n3, final int n4) {
        if (this.method3421()) {
            this.field3475.method34154(n3, n4);
            if (this.field3469.method3360()) {
                final String method3429 = this.method3429();
                if (this.field3471.currentScreen != null) {
                    this.field3471.currentScreen.renderTooltip(method3429, n3, n4);
                }
            }
            this.method3430(n, n2, n3, n4);
        }
    }
    
    public String method3429() {
        return Class8822.method30773(this.field3469.method3692() ? "gui.recipebook.toggleRecipes.craftable" : "gui.recipebook.toggleRecipes.all", new Object[0]);
    }
    
    private void method3430(final int n, final int n2, final int n3, final int n4) {
        ItemStack method26164 = null;
        for (int i = 0; i < this.field3466.method25523(); ++i) {
            final Class7997 method26165 = this.field3466.method25522(i);
            final int n5 = method26165.method26162() + n;
            final int n6 = method26165.method26163() + n2;
            if (n3 >= n5) {
                if (n4 >= n6) {
                    if (n3 < n5 + 16) {
                        if (n4 < n6 + 16) {
                            method26164 = method26165.method26164();
                        }
                    }
                }
            }
        }
        if (method26164 != null) {
            if (this.field3471.currentScreen != null) {
                this.field3471.currentScreen.renderTooltip(this.field3471.currentScreen.getTooltipFromItem(method26164), n3, n4);
            }
        }
    }
    
    public void method3431(final int n, final int n2, final boolean b, final float n3) {
        this.field3466.method25526(this.field3471, n, n2, b, n3);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (!this.method3421() || this.field3471.player.isSpectator()) {
            return false;
        }
        if (this.field3475.method34158(n, n2, n3, (this.field3464 - 147) / 2 - this.field3463, (this.field3465 - 166) / 2, 147, 166)) {
            final IRecipe<?> method34155 = this.field3475.method34155();
            final Class9586 method34156 = this.field3475.method34156();
            if (method34155 != null) {
                if (method34156 != null) {
                    if (!method34156.method35942(method34155) && this.field3466.method25524() == method34155) {
                        return false;
                    }
                    this.field3466.method25520();
                    this.field3471.playerController.method27325(this.field3471.player.field3009.field16154, method34155, Screen.hasShiftDown());
                    if (!this.method3436()) {
                        this.method3422(false);
                    }
                }
            }
            return true;
        }
        if (this.field3472.mouseClicked(n, n2, n3)) {
            return true;
        }
        if (!this.field3469.mouseClicked(n, n2, n3)) {
            for (final Class646 field3468 : this.field3467) {
                if (!field3468.mouseClicked(n, n2, n3)) {
                    continue;
                }
                if (this.field3468 != field3468) {
                    this.field3468.method3691(false);
                    (this.field3468 = field3468).method3691(true);
                    this.method3424(true);
                }
                return true;
            }
            return false;
        }
        this.field3469.method3691(this.method3432());
        this.method3441();
        this.method3424(false);
        return true;
    }
    
    public boolean method3432() {
        final boolean b = !this.field3474.method19706();
        this.field3474.method19707(b);
        return b;
    }
    
    public boolean method3433(final double n, final double n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (this.method3421()) {
            boolean b = false;
            Label_0070: {
                if (n >= n3) {
                    if (n2 >= n4) {
                        if (n < n3 + n5) {
                            if (n2 < n4 + n6) {
                                b = false;
                                break Label_0070;
                            }
                        }
                    }
                }
                b = true;
            }
            final boolean b2 = b;
            boolean b3 = false;
            Label_0129: {
                if (n3 - 147 < n) {
                    if (n < n3) {
                        if (n4 < n2) {
                            if (n2 < n4 + n6) {
                                b3 = true;
                                break Label_0129;
                            }
                        }
                    }
                }
                b3 = false;
            }
            final boolean b4 = b3;
            if (b2) {
                if (!b4) {
                    if (!this.field3468.method3360()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        this.field3478 = false;
        if (!this.method3421() || this.field3471.player.isSpectator()) {
            return false;
        }
        if (n == 256 && !this.method3436()) {
            this.method3422(false);
            return true;
        }
        if (this.field3472.keyPressed(n, n2, n3)) {
            this.method3434();
            return true;
        }
        if (this.field3472.method3370()) {
            if (this.field3472.method3409()) {
                if (n != 256) {
                    return true;
                }
            }
        }
        if (this.field3471.gameSettings.field23448.method1066(n, n2) && !this.field3472.method3370()) {
            this.field3478 = true;
            this.field3472.method3395(true);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean keyReleased(final int n, final int n2, final int n3) {
        this.field3478 = false;
        return super.method3007(n, n2, n3);
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        if (this.field3478) {
            return false;
        }
        if (!this.method3421() || this.field3471.player.isSpectator()) {
            return false;
        }
        if (!this.field3472.charTyped(c, n)) {
            return super.method3004(c, n);
        }
        this.method3434();
        return true;
    }
    
    @Override
    public boolean isMouseOver(final double n, final double n2) {
        return false;
    }
    
    private void method3434() {
        final String lowerCase = this.field3472.method3378().toLowerCase(Locale.ROOT);
        this.method3435(lowerCase);
        if (!lowerCase.equals(this.field3473)) {
            this.method3424(false);
            this.field3473 = lowerCase;
        }
    }
    
    private void method3435(final String anObject) {
        if ("excitedze".equals(anObject)) {
            final Class1661 method5295 = this.field3471.method5295();
            final Class1947 method5296 = method5295.method5847("en_pt");
            if (method5295.method5845().compareTo(method5296) == 0) {
                return;
            }
            method5295.method5844(method5296);
            this.field3471.gameSettings.field23476 = method5296.getCode();
            this.field3471.method5241();
            this.field3471.fontRenderer.method6625(method5295.method5843());
            this.field3471.gameSettings.method17121();
        }
    }
    
    private boolean method3436() {
        return this.field3463 == 86;
    }
    
    public void method3437() {
        this.method3425();
        if (this.method3421()) {
            this.method3424(false);
        }
    }
    
    @Override
    public void method3438(final List<IRecipe<?>> list) {
        final Iterator<IRecipe<?>> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.field3471.player.method4123(iterator.next());
        }
    }
    
    public void method3439(final IRecipe<?> class3662, final List<Class6601> list) {
        final ItemStack method11292 = class3662.getRecipeOutput();
        this.field3466.method25525(class3662);
        this.field3466.method25521(Ingredient.method619(method11292), list.get(0).field26175, list.get(0).field26176);
        this.method3455(this.field3470.method10938(), this.field3470.method10939(), this.field3470.method10937(), class3662, class3662.getIngredients().iterator(), 0);
    }
    
    @Override
    public void method3440(final Iterator<Ingredient> iterator, final int n, final int n2, final int n3, final int n4) {
        final Ingredient class120 = iterator.next();
        if (!class120.method616()) {
            final Class6601 class121 = this.field3470.field16151.get(n);
            this.field3466.method25521(class120, class121.field26175, class121.field26176);
        }
    }
    
    public void method3441() {
        if (this.field3471.method5269() != null) {
            this.field3471.method5269().method17292(new Class4397(this.field3474.method19703(), this.field3474.method19706(), this.field3474.method19708(), this.field3474.method19710(), this.field3474.method19712(), this.field3474.method19714()));
        }
    }
    
    static {
        field3462 = new ResourceLocation("textures/gui/recipe_book.png");
    }
}
