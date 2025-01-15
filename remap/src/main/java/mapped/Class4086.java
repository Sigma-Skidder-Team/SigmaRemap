// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Random;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class Class4086 extends Class4085
{
    private boolean field18191;
    private boolean field18192;
    
    public Class4086(final Class8959 class8959) {
        super(class8959);
        this.field18191 = false;
        this.field18192 = false;
        this.method11705(new Class1932("pull"), (class8321, class8322, class8323) -> {
            if (class8323 != null && class8321.getItem() == this) {
                return method12296(class8321) ? 0.0f : ((class8321.method27652() - class8323.method2767()) / (float)method12308(class8321));
            }
            return 0.0f;
        });
        this.method11705(new Class1932("pulling"), (class8321, class8322, class8323) -> {
            if (class8323 != null) {
                if (class8323.method2756()) {
                    if (class8323.method2766() == class8321) {
                        if (!method12296(class8321)) {
                            return 1.0f;
                        }
                    }
                }
            }
            return 0.0f;
        });
        this.method11705(new Class1932("charged"), (class8321, class8322, class8323) -> (class8323 != null && method12296(class8321)) ? 1.0f : 0.0f);
        this.method11705(new Class1932("firework"), (class8321, class8322, class8323) -> {
            if (class8323 != null) {
                if (method12296(class8321)) {
                    if (method12301(class8321, Items.field31532)) {
                        return 1.0f;
                    }
                }
            }
            return 0.0f;
        });
    }
    
    @Override
    public Predicate<ItemStack> method12289() {
        return Class4086.field18190;
    }
    
    @Override
    public Predicate<ItemStack> method12290() {
        return Class4086.field18189;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final Class512 class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        if (method12296(method2715)) {
            method12304(class1847, class1848, class1849, method2715, method12311(method2715), 1.0f);
            method12297(method2715, false);
            return Class9355.method34675(method2715);
        }
        if (class1848.method2790(method2715).method27620()) {
            return Class9355.method34677(method2715);
        }
        if (!method12296(method2715)) {
            this.field18191 = false;
            this.field18192 = false;
            class1848.method2762(class1849);
        }
        return Class9355.method34675(method2715);
    }
    
    @Override
    public void method11727(final ItemStack class8321, final World class8322, final LivingEntity class8323, final int n) {
        if (method12310(this.method11726(class8321) - n, class8321) >= 1.0f) {
            if (!method12296(class8321)) {
                if (method12294(class8323, class8321)) {
                    method12297(class8321, true);
                    class8322.method6706(null, class8323.getPosX(), class8323.getPosY(), class8323.getPosZ(), Class8520.field35106, (class8323 instanceof Class512) ? Class286.field1585 : Class286.field1583, 1.0f, 1.0f / (Class4086.field17363.nextFloat() * 0.5f + 1.0f) + 0.2f);
                }
            }
        }
    }
    
    private static boolean method12294(final LivingEntity class511, final ItemStack class512) {
        final int n = (Class8742.method30195(Class7882.field32379, class512) != 0) ? 3 : 1;
        final boolean b = class511 instanceof Class512 && ((Class512)class511).field3025.field27304;
        ItemStack class513 = class511.method2790(class512);
        ItemStack class514 = class513.method27641();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                class513 = class514.method27641();
            }
            if (class513.method27620()) {
                if (b) {
                    class513 = new ItemStack(Items.field31280);
                    class514 = class513.method27641();
                }
            }
            if (!method12295(class511, class512, class513, i > 0, b)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean method12295(final LivingEntity class511, final ItemStack class512, final ItemStack class513, final boolean b, final boolean b2) {
        if (!class513.method27620()) {
            ItemStack class514 = null;
            Label_0083: {
                if (!b2 || !(class513.getItem() instanceof Class3824)) {
                    if (!b2) {
                        if (!b) {
                            class514 = class513.method27621(1);
                            if (!class513.method27620()) {
                                break Label_0083;
                            }
                            if (!(class511 instanceof Class512)) {
                                break Label_0083;
                            }
                            ((Class512)class511).field3006.method2365(class513);
                            break Label_0083;
                        }
                    }
                }
                class514 = class513.method27641();
            }
            method12298(class512, class514);
            return true;
        }
        return false;
    }
    
    public static boolean method12296(final ItemStack class8321) {
        final Class51 method27657 = class8321.method27657();
        return method27657 != null && method27657.method329("Charged");
    }
    
    public static void method12297(final ItemStack class8321, final boolean b) {
        class8321.method27658().method312("Charged", b);
    }
    
    private static void method12298(final ItemStack class8321, final ItemStack class8322) {
        final Class51 method27658 = class8321.method27658();
        Class52 method27659;
        if (!method27658.method316("ChargedProjectiles", 9)) {
            method27659 = new Class52();
        }
        else {
            method27659 = method27658.method328("ChargedProjectiles", 10);
        }
        final Class51 e = new Class51();
        class8322.method27627(e);
        ((AbstractList<Class51>)method27659).add(e);
        method27658.method295("ChargedProjectiles", method27659);
    }
    
    private static List<ItemStack> method12299(final ItemStack class8321) {
        final ArrayList arrayList = Lists.newArrayList();
        final Class51 method27657 = class8321.method27657();
        if (method27657 != null) {
            if (method27657.method316("ChargedProjectiles", 9)) {
                final Class52 method27658 = method27657.method328("ChargedProjectiles", 10);
                if (method27658 != null) {
                    for (int i = 0; i < method27658.size(); ++i) {
                        arrayList.add(ItemStack.method27619(method27658.method346(i)));
                    }
                }
            }
        }
        return arrayList;
    }
    
    private static void method12300(final ItemStack class8321) {
        final Class51 method27657 = class8321.method27657();
        if (method27657 != null) {
            final Class52 method27658 = method27657.method328("ChargedProjectiles", 9);
            method27658.clear();
            method27657.method295("ChargedProjectiles", method27658);
        }
    }
    
    private static boolean method12301(final ItemStack class8321, final Item class8322) {
        return method12299(class8321).stream().anyMatch(class8324 -> class8324.getItem() == class8323);
    }
    
    private static void method12302(final World class1847, final LivingEntity class1848, final Class316 class1849, final ItemStack class1850, final ItemStack class1851, final float n, final boolean b, final float n2, final float n3, final float n4) {
        if (!class1847.isRemote) {
            final boolean b2 = class1851.getItem() == Items.field31532;
            Class401 method12303;
            if (!b2) {
                method12303 = method12303(class1847, class1848, class1850, class1851);
                if (b || n4 != 0.0f) {
                    ((Class402)method12303).field2474 = Class2151.field12784;
                }
            }
            else {
                method12303 = new Class406(class1847, class1851, class1848.getPosX(), class1848.method1944() - 0.15000000596046448, class1848.getPosZ(), true);
            }
            if (!(class1848 instanceof Class774)) {
                final Quaternion class1852 = new Quaternion(new Vector3f(class1848.method1745(1.0f)), n4, true);
                final Vector3f class1853 = new Vector3f(class1848.method1741(1.0f));
                class1853.transform(class1852);
                method12303.method1958(class1853.getX(), class1853.getY(), class1853.getZ(), n2, n3);
            }
            else {
                final Class774 class1854 = (Class774)class1848;
                class1854.method4281(class1854.method4152(), class1850, method12303, n4);
            }
            class1850.method27636(b2 ? 3 : 1, class1848, class1856 -> class1856.method2795(class1855));
            class1847.method6886((Entity)method12303);
            class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35112, Class286.field1585, 1.0f, n);
        }
    }
    
    private static Class402 method12303(final World class1847, final LivingEntity class1848, final ItemStack class1849, final ItemStack class1850) {
        final Class402 method11758 = ((Class3824)((class1850.getItem() instanceof Class3824) ? class1850.getItem() : Items.field31280)).method11758(class1847, class1850, class1848);
        if (class1848 instanceof Class512) {
            method11758.method1978(true);
        }
        method11758.method1962(Class8520.field35105);
        method11758.method1988(true);
        final int method11759 = Class8742.method30195(Class7882.field32381, class1849);
        if (method11759 > 0) {
            method11758.method1979((byte)method11759);
        }
        return method11758;
    }
    
    public static void method12304(final World class1847, final LivingEntity class1848, final Class316 class1849, final ItemStack class1850, final float n, final float n2) {
        final List<ItemStack> method12299 = method12299(class1850);
        final float[] method12300 = method12305(class1848.method2633());
        for (int i = 0; i < method12299.size(); ++i) {
            final ItemStack class1851 = method12299.get(i);
            final boolean b = class1848 instanceof Class512 && ((Class512)class1848).field3025.field27304;
            if (!class1851.method27620()) {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            method12302(class1847, class1848, class1849, class1850, class1851, method12300[i], b, n, n2, 10.0f);
                        }
                    }
                    else {
                        method12302(class1847, class1848, class1849, class1850, class1851, method12300[i], b, n, n2, -10.0f);
                    }
                }
                else {
                    method12302(class1847, class1848, class1849, class1850, class1851, method12300[i], b, n, n2, 0.0f);
                }
            }
        }
        method12307(class1847, class1848, class1850);
    }
    
    private static float[] method12305(final Random random) {
        final boolean nextBoolean = random.nextBoolean();
        return new float[] { 1.0f, method12306(nextBoolean), method12306(!nextBoolean) };
    }
    
    private static float method12306(final boolean b) {
        return 1.0f / (Class4086.field17363.nextFloat() * 0.5f + 1.8f) + (b ? 0.63f : 0.43f);
    }
    
    private static void method12307(final World class1847, final LivingEntity class1848, final ItemStack class1849) {
        if (class1848 instanceof Class513) {
            final Class513 class1850 = (Class513)class1848;
            if (!class1847.isRemote) {
                Class7770.field31806.method13842(class1850, class1849);
            }
            class1850.method2859(Class8276.field33981.method8449(class1849.getItem()));
        }
        method12300(class1849);
    }
    
    @Override
    public void method11699(final World class1847, final LivingEntity class1848, final ItemStack class1849, final int n) {
        if (!class1847.isRemote) {
            final int method30195 = Class8742.method30195(Class7882.field32380, class1849);
            final Class7795 method30196 = this.method12309(method30195);
            final Class7795 class1850 = (method30195 != 0) ? null : Class8520.field35107;
            final float n2 = (class1849.method27652() - n) / (float)method12308(class1849);
            if (n2 < 0.2f) {
                this.field18191 = false;
                this.field18192 = false;
            }
            if (n2 >= 0.2f) {
                if (!this.field18191) {
                    this.field18191 = true;
                    class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), method30196, Class286.field1585, 0.5f, 1.0f);
                }
            }
            if (n2 >= 0.5f) {
                if (class1850 != null) {
                    if (!this.field18192) {
                        this.field18192 = true;
                        class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), class1850, Class286.field1585, 0.5f, 1.0f);
                    }
                }
            }
        }
    }
    
    @Override
    public int method11726(final ItemStack class8321) {
        return method12308(class8321) + 3;
    }
    
    public static int method12308(final ItemStack class8321) {
        final int method30195 = Class8742.method30195(Class7882.field32380, class8321);
        return (method30195 != 0) ? (25 - 5 * method30195) : 25;
    }
    
    @Override
    public Class1992 method11725(final ItemStack class8321) {
        return Class1992.field11160;
    }
    
    private Class7795 method12309(final int n) {
        switch (n) {
            case 1: {
                return Class8520.field35109;
            }
            case 2: {
                return Class8520.field35110;
            }
            case 3: {
                return Class8520.field35111;
            }
            default: {
                return Class8520.field35108;
            }
        }
    }
    
    private static float method12310(final int n, final ItemStack class8321) {
        float n2 = n / (float)method12308(class8321);
        if (n2 > 1.0f) {
            n2 = 1.0f;
        }
        return n2;
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        final List<ItemStack> method12299 = method12299(class8321);
        if (method12296(class8321)) {
            if (!method12299.isEmpty()) {
                final ItemStack class8324 = method12299.get(0);
                list.add(new Class2259("item.minecraft.crossbow.projectile", new Object[0]).appendText(" ").appendSibling(class8324.method27684()));
                if (class8323.method7991()) {
                    if (class8324.getItem() == Items.field31532) {
                        final ArrayList arrayList = Lists.newArrayList();
                        Items.field31532.method11728(class8324, class8322, arrayList, class8323);
                        if (!arrayList.isEmpty()) {
                            for (int i = 0; i < arrayList.size(); ++i) {
                                arrayList.set(i, new StringTextComponent("  ").appendSibling((ITextComponent)arrayList.get(i)).applyTextStyle(TextFormatting.GRAY));
                            }
                            list.addAll(arrayList);
                        }
                    }
                }
            }
        }
    }
    
    private static float method12311(final ItemStack class8321) {
        return (class8321.getItem() == Items.field31611 && method12301(class8321, Items.field31532)) ? 1.6f : 3.15f;
    }
}
