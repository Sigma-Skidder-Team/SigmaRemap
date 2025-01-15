// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.HashSet;

import it.unimi.dsi.fastutil.chars.CharArrayList;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.chars.CharList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.Logger;

public class Class1923 implements AutoCloseable
{
    private static final Logger field10454;
    private static final Class8049 field10455;
    private static final Class2023 field10456;
    private static final Random field10457;
    private final Class1663 field10458;
    public final Class1932 field10459;
    private Class8048 field10460;
    private Class8048 field10461;
    private final List<Class1737> field10462;
    private final Char2ObjectMap<Class8048> field10463;
    private final Char2ObjectMap<Class2023> field10464;
    private final Int2ObjectMap<CharList> field10465;
    private final List<Class1667> field10466;
    
    public Class1923(final Class1663 field10458, final Class1932 field10459) {
        this.field10462 = Lists.newArrayList();
        this.field10463 = (Char2ObjectMap<Class8048>)new Char2ObjectOpenHashMap();
        this.field10464 = (Char2ObjectMap<Class2023>)new Char2ObjectOpenHashMap();
        this.field10465 = (Int2ObjectMap<CharList>)new Int2ObjectOpenHashMap();
        this.field10466 = Lists.newArrayList();
        this.field10458 = field10458;
        this.field10459 = field10459;
    }
    
    public void method7627(final List<Class1737> list) {
        this.method7628();
        this.method7629();
        this.field10463.clear();
        this.field10464.clear();
        this.field10465.clear();
        this.field10460 = this.method7633(Class2021.field11532);
        this.field10461 = this.method7633(Class2025.field11537);
        final HashSet hashSet = Sets.newHashSet();
        for (char c = '\0'; c < '\uffff'; ++c) {
            for (final Class1737 class1737 : list) {
                final Class2023 class1738 = (c != ' ') ? class1737.method6150(c) : Class1923.field10456;
                if (class1738 == null) {
                    continue;
                }
                hashSet.add(class1737);
                if (class1738 == Class2021.field11532) {
                    break;
                }
                ((CharList)this.field10465.computeIfAbsent(MathHelper.method35649(class1738.method8080(false)), p0 -> new CharArrayList())).add(c);
                break;
            }
        }
        list.stream().filter(hashSet::contains).forEach(this.field10462::add);
    }
    
    @Override
    public void close() {
        this.method7628();
        this.method7629();
    }
    
    private void method7628() {
        final Iterator<Class1737> iterator = this.field10462.iterator();
        while (iterator.hasNext()) {
            iterator.next().close();
        }
        this.field10462.clear();
    }
    
    private void method7629() {
        final Iterator<Class1667> iterator = this.field10466.iterator();
        while (iterator.hasNext()) {
            iterator.next().close();
        }
        this.field10466.clear();
    }
    
    public Class2023 method7630(final char c) {
        Class2023 class2023 = (Class2023)this.field10464.get(c);
        if (class2023 == null) {
            if (c != ' ') {
                class2023 = this.method7631(c);
            }
            else {
                class2023 = Class1923.field10456;
            }
            this.field10464.put(c, (Object)class2023);
        }
        return class2023;
    }
    
    private Class2022 method7631(final char c) {
        final Iterator<Class1737> iterator = this.field10462.iterator();
        while (iterator.hasNext()) {
            final Class2022 method6150 = iterator.next().method6150(c);
            if (method6150 == null) {
                continue;
            }
            return method6150;
        }
        return Class2021.field11532;
    }
    
    public Class8048 method7632(final char c) {
        Class8048 class8048 = (Class8048)this.field10463.get(c);
        if (class8048 == null) {
            if (c != ' ') {
                class8048 = this.method7633(this.method7631(c));
            }
            else {
                class8048 = Class1923.field10455;
            }
            this.field10463.put(c, (Object)class8048);
        }
        return class8048;
    }
    
    private Class8048 method7633(final Class2022 class2022) {
        final Iterator<Class1667> iterator = this.field10466.iterator();
        while (iterator.hasNext()) {
            final Class8048 method5879 = iterator.next().method5879(class2022);
            if (method5879 == null) {
                continue;
            }
            return method5879;
        }
        final Class1667 class2023 = new Class1667(new Class1932(this.field10459.method7798(), this.field10459.method7797() + "/" + this.field10466.size()), class2022.method8073());
        this.field10466.add(class2023);
        this.field10458.method5851(class2023.method5880(), class2023);
        final Class8048 method5880 = class2023.method5879(class2022);
        return (method5880 != null) ? method5880 : this.field10460;
    }
    
    public Class8048 method7634(final Class2023 class2023) {
        final CharList list = (CharList)this.field10465.get(MathHelper.method35649(class2023.method8080(false)));
        return (list != null && !list.isEmpty()) ? this.method7632(list.get(Class1923.field10457.nextInt(list.size()))) : this.field10460;
    }
    
    public Class8048 method7635() {
        return this.field10461;
    }
    
    static {
        field10454 = LogManager.getLogger();
        field10455 = new Class8049();
        field10456 = (() -> 4.0f);
        field10457 = new Random();
    }
}
