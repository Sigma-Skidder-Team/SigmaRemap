// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.BiFunction;
import org.apache.logging.log4j.Logger;

public class Class9317
{
    private static final Logger field40008;
    public static final Class9317 field40009;
    public static final Class8212 field40010;
    private final Class8212 field40011;
    private final Class9320[] field40012;
    private final Class125[] field40013;
    private final BiFunction<ItemStack, Class7529, ItemStack> field40014;
    
    private Class9317(final Class8212 field40011, final Class9320[] field40012, final Class125[] field40013) {
        this.field40011 = field40011;
        this.field40012 = field40012;
        this.field40013 = field40013;
        this.field40014 = Class7463.method22991(field40013);
    }
    
    public static Consumer<ItemStack> method34482(final Consumer<ItemStack> consumer) {
        return class8321 -> {
            if (class8321.method27690() >= class8321.method27628()) {
                class8321.method27690();
                int i = 0;
                while (i > 0) {
                    class8321.method27641();
                    final ItemStack class8322;
                    class8322.method27691(Math.min(class8321.method27628(), i));
                    i -= class8322.method27690();
                    consumer2.accept(class8322);
                }
            }
            else {
                consumer2.accept(class8321);
            }
        };
    }
    
    public void method34483(final Class7529 class7529, final Consumer<ItemStack> consumer) {
        if (!class7529.method23580(this)) {
            Class9317.field40008.warn("Detected infinite loop in loot tables");
        }
        else {
            final Consumer<ItemStack> method637 = Class125.method637(this.field40014, consumer, class7529);
            final Class9320[] field40012 = this.field40012;
            for (int length = field40012.length, i = 0; i < length; ++i) {
                field40012[i].method34512(method637, class7529);
            }
            class7529.method23581(this);
        }
    }
    
    public void method34484(final Class7529 class7529, final Consumer<ItemStack> consumer) {
        this.method34483(class7529, method34482(consumer));
    }
    
    public List<ItemStack> method34485(final Class7529 class7529) {
        final ArrayList arrayList = Lists.newArrayList();
        this.method34484(class7529, (Consumer<ItemStack>)arrayList::add);
        return arrayList;
    }
    
    public Class8212 method34486() {
        return this.field40011;
    }
    
    public void method34487(final Class7790 class7790) {
        for (int i = 0; i < this.field40012.length; ++i) {
            this.field40012[i].method34513(class7790.method25015(".pools[" + i + "]"));
        }
        for (int j = 0; j < this.field40013.length; ++j) {
            this.field40013[j].method636(class7790.method25015(".functions[" + j + "]"));
        }
    }
    
    public void method34488(final Class446 class446, final Class7529 class447) {
        final List<ItemStack> method34485 = this.method34485(class447);
        final Random method34486 = class447.method23586();
        final List<Integer> method34487 = this.method34490(class446, method34486);
        this.method34489(method34485, method34487.size(), method34486);
        for (final ItemStack class448 : method34485) {
            if (method34487.isEmpty()) {
                Class9317.field40008.warn("Tried to over-fill a container");
                return;
            }
            if (!class448.method27620()) {
                class446.method2160(method34487.remove(method34487.size() - 1), class448);
            }
            else {
                class446.method2160((int)method34487.remove(method34487.size() - 1), ItemStack.field34174);
            }
        }
    }
    
    private void method34489(final List<ItemStack> list, final int n, final Random rnd) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final ItemStack class8321 = (ItemStack)iterator.next();
            if (!class8321.method27620()) {
                if (class8321.method27690() <= 1) {
                    continue;
                }
                arrayList.add(class8321);
                iterator.remove();
            }
            else {
                iterator.remove();
            }
        }
        while (n - list.size() - arrayList.size() > 0 && !arrayList.isEmpty()) {
            final ItemStack class8322 = (ItemStack)arrayList.remove(MathHelper.method35658(rnd, 0, arrayList.size() - 1));
            final ItemStack method27621 = class8322.method27621(MathHelper.method35658(rnd, 1, class8322.method27690() / 2));
            if (class8322.method27690() > 1 && rnd.nextBoolean()) {
                arrayList.add(class8322);
            }
            else {
                list.add(class8322);
            }
            if (method27621.method27690() > 1 && rnd.nextBoolean()) {
                arrayList.add(method27621);
            }
            else {
                list.add(method27621);
            }
        }
        list.addAll(arrayList);
        Collections.shuffle(list, rnd);
    }
    
    private List<Integer> method34490(final Class446 class446, final Random rnd) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class446.method2239(); ++i) {
            if (class446.method2157(i).method27620()) {
                arrayList.add(i);
            }
        }
        Collections.shuffle(arrayList, rnd);
        return arrayList;
    }
    
    public static Class4947 method34491() {
        return new Class4947();
    }
    
    static {
        field40008 = LogManager.getLogger();
        field40009 = new Class9317(Class7104.field27710, new Class9320[0], new Class125[0]);
        field40010 = Class7104.field27718;
    }
}
