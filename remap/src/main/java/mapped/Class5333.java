// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.Collection;
import java.util.List;

public class Class5333
{
    public static List<Class1948> method16465(final ItemStack class8321) {
        return method16467(class8321.method27657());
    }
    
    public static List<Class1948> method16466(final Class8061 class8061, final Collection<Class1948> collection) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(class8061.method26449());
        arrayList.addAll(collection);
        return arrayList;
    }
    
    public static List<Class1948> method16467(final CompoundNBT class51) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(method16475(class51).method26449());
        method16470(class51, arrayList);
        return arrayList;
    }
    
    public static List<Class1948> method16468(final ItemStack class8321) {
        return method16469(class8321.method27657());
    }
    
    public static List<Class1948> method16469(final CompoundNBT class51) {
        final ArrayList arrayList = Lists.newArrayList();
        method16470(class51, arrayList);
        return arrayList;
    }
    
    public static void method16470(final CompoundNBT class51, final List<Class1948> list) {
        if (class51 != null) {
            if (class51.contains("CustomPotionEffects", 9)) {
                final ListNBT method328 = class51.getList("CustomPotionEffects", 10);
                for (int i = 0; i < method328.size(); ++i) {
                    final Class1948 method329 = Class1948.method7918(method328.method346(i));
                    if (method329 != null) {
                        list.add(method329);
                    }
                }
            }
        }
    }
    
    public static int method16471(final ItemStack class8321) {
        final CompoundNBT method27657 = class8321.method27657();
        if (method27657 != null && method27657.contains("CustomPotionColor", 99)) {
            return method27657.getInt("CustomPotionColor");
        }
        return (method16474(class8321) != Class8644.field36250) ? method16473(method16465(class8321)) : 16253176;
    }
    
    public static int method16472(final Class8061 class8061) {
        return (class8061 != Class8644.field36250) ? method16473(class8061.method26449()) : 16253176;
    }
    
    public static int method16473(final Collection<Class1948> collection) {
        final int n = 3694022;
        if (collection.isEmpty()) {
            return Config.method28945() ? Class8763.method30377(null, n) : 3694022;
        }
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        int n5 = 0;
        for (final Class1948 class1948 : collection) {
            if (!class1948.method7910()) {
                continue;
            }
            int n6 = class1948.method7906().method16458();
            if (Config.method28945()) {
                n6 = Class8763.method30377(class1948.method7906(), n6);
            }
            final int n7 = class1948.method7908() + 1;
            n2 += n7 * (n6 >> 16 & 0xFF) / 255.0f;
            n3 += n7 * (n6 >> 8 & 0xFF) / 255.0f;
            n4 += n7 * (n6 >> 0 & 0xFF) / 255.0f;
            n5 += n7;
        }
        if (n5 != 0) {
            return (int)(n2 / n5 * 255.0f) << 16 | (int)(n3 / n5 * 255.0f) << 8 | (int)(n4 / n5 * 255.0f);
        }
        return 0;
    }
    
    public static Class8061 method16474(final ItemStack class8321) {
        return method16475(class8321.method27657());
    }
    
    public static Class8061 method16475(final CompoundNBT class51) {
        return (class51 != null) ? Class8061.method26447(class51.getString("Potion")) : Class8644.field36250;
    }
    
    public static ItemStack method16476(final ItemStack class8321, final Class8061 class8322) {
        final ResourceLocation method503 = Registry.field212.getKey(class8322);
        if (class8322 != Class8644.field36250) {
            class8321.method27658().putString("Potion", method503.toString());
        }
        else {
            class8321.method27661("Potion");
        }
        return class8321;
    }
    
    public static ItemStack method16477(final ItemStack class8321, final Collection<Class1948> collection) {
        if (!collection.isEmpty()) {
            final CompoundNBT method27658 = class8321.method27658();
            final ListNBT method27659 = method27658.getList("CustomPotionEffects", 9);
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                ((AbstractList<CompoundNBT>)method27659).add(((Class1948)iterator.next()).method7916(new CompoundNBT()));
            }
            method27658.put("CustomPotionEffects", method27659);
            return class8321;
        }
        return class8321;
    }
    
    public static void method16478(final ItemStack class8321, final List<ITextComponent> list, final float n) {
        final List<Class1948> method16465 = method16465(class8321);
        final ArrayList arrayList = Lists.newArrayList();
        if (!method16465.isEmpty()) {
            for (final Class1948 class8322 : method16465) {
                final Class2259 class8323 = new Class2259(class8322.method7915(), new Object[0]);
                final Class5328 method16466 = class8322.method7906();
                final Map<Class8725, Class7919> method16467 = method16466.method16460();
                if (!method16467.isEmpty()) {
                    for (final Map.Entry<K, Class7919> entry : method16467.entrySet()) {
                        final Class7919 class8324 = entry.getValue();
                        arrayList.add(new Class8554(((Class8725)entry.getKey()).method29978(), new Class7919(class8324.method25636(), method16466.method16463(class8322.method7908(), class8324), class8324.method25637())));
                    }
                }
                if (class8322.method7908() > 0) {
                    class8323.appendText(" ").appendSibling(new Class2259("potion.potency." + class8322.method7908(), new Object[0]));
                }
                if (class8322.method7907() > 20) {
                    class8323.appendText(" (").appendText(Class9434.method35057(class8322, n)).appendText(")");
                }
                list.add(class8323.applyTextStyle(method16466.method16457().method8161()));
            }
        }
        else {
            list.add(new Class2259("effect.none", new Object[0]).applyTextStyle(TextFormatting.GRAY));
        }
        if (!arrayList.isEmpty()) {
            list.add(new StringTextComponent(""));
            list.add(new Class2259("potion.whenDrank", new Object[0]).applyTextStyle(TextFormatting.DARK_PURPLE));
            for (final Class8554 class8325 : arrayList) {
                final Class7919 class8326 = (Class7919)class8325.method28746();
                final double method16468 = class8326.method25638();
                double method16469;
                if (class8326.method25637() != Class2157.field12810 && class8326.method25637() != Class2157.field12811) {
                    method16469 = class8326.method25638();
                }
                else {
                    method16469 = class8326.method25638() * 100.0;
                }
                if (method16468 <= 0.0) {
                    if (method16468 >= 0.0) {
                        continue;
                    }
                    list.add(new Class2259("attribute.modifier.take." + class8326.method25637().method8322(), new Object[] { ItemStack.field34175.format(method16469 * -1.0), new Class2259("attribute.name." + (String)class8325.method28745(), new Object[0]) }).applyTextStyle(TextFormatting.RED));
                }
                else {
                    list.add(new Class2259("attribute.modifier.plus." + class8326.method25637().method8322(), new Object[] { ItemStack.field34175.format(method16469), new Class2259("attribute.name." + (String)class8325.method28745(), new Object[0]) }).applyTextStyle(TextFormatting.BLUE));
                }
            }
        }
    }
}
