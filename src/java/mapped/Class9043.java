// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.UUID;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Class9043
{
    private static String[] field38269;
    private final int field38270;
    private final boolean field38271;
    private final boolean field38272;
    private final Predicate<Class399> field38273;
    private final Class8683 field38274;
    private final Function<Class5487, Class5487> field38275;
    private final Class6221 field38276;
    private final BiConsumer<Class5487, List<? extends Class399>> field38277;
    private final boolean field38278;
    private final String field38279;
    private final UUID field38280;
    private final Class7499<?> field38281;
    private final boolean field38282;
    
    public Class9043(final int field38270, final boolean field38271, final boolean field38272, final Predicate<Class399> field38273, final Class8683 field38274, final Function<Class5487, Class5487> field38275, final Class6221 field38276, final BiConsumer<Class5487, List<? extends Class399>> field38277, final boolean field38278, final String field38279, final UUID field38280, final Class7499<?> field38281, final boolean field38282) {
        this.field38270 = field38270;
        this.field38271 = field38271;
        this.field38272 = field38272;
        this.field38273 = field38273;
        this.field38274 = field38274;
        this.field38275 = field38275;
        this.field38276 = field38276;
        this.field38277 = field38277;
        this.field38278 = field38278;
        this.field38279 = field38279;
        this.field38280 = field38280;
        this.field38281 = field38281;
        this.field38282 = field38282;
    }
    
    public int method32505() {
        return this.field38270;
    }
    
    public boolean method32506() {
        return this.field38271;
    }
    
    public boolean method32507() {
        return this.field38278;
    }
    
    public boolean method32508() {
        return this.field38272;
    }
    
    private void method32509(final Class7492 class7492) throws CommandSyntaxException {
        if (this.field38282 && !class7492.method23210(2)) {
            throw Class6886.field27006.create();
        }
    }
    
    public Class399 method32510(final Class7492 class7492) throws CommandSyntaxException {
        this.method32509(class7492);
        final List<? extends Class399> method32511 = this.method32511(class7492);
        if (method32511.isEmpty()) {
            throw Class6886.field27004.create();
        }
        if (method32511.size() <= 1) {
            return (Class399)method32511.get(0);
        }
        throw Class6886.field27001.create();
    }
    
    public List<? extends Class399> method32511(final Class7492 class7492) throws CommandSyntaxException {
        this.method32509(class7492);
        if (!this.field38271) {
            return this.method32514(class7492);
        }
        if (this.field38279 != null) {
            final Class513 method20598 = class7492.method23255().method1537().method20598(this.field38279);
            return (List<? extends Class399>)((method20598 != null) ? Lists.newArrayList((Object[])new Class513[] { method20598 }) : Collections.emptyList());
        }
        if (this.field38280 != null) {
            final Iterator<Class1849> iterator = class7492.method23255().method1482().iterator();
            while (iterator.hasNext()) {
                final Class399 method20599 = iterator.next().method6914(this.field38280);
                if (method20599 == null) {
                    continue;
                }
                return Lists.newArrayList((Object[])new Class399[] { method20599 });
            }
            return Collections.emptyList();
        }
        final Class5487 class7493 = this.field38275.apply(class7492.method23249());
        final Predicate<Class399> method20600 = this.method32515(class7493);
        if (!this.field38278) {
            final ArrayList arrayList = Lists.newArrayList();
            if (!this.method32508()) {
                final Iterator<Class1849> iterator2 = class7492.method23255().method1482().iterator();
                while (iterator2.hasNext()) {
                    this.method32512(arrayList, iterator2.next(), class7493, method20600);
                }
            }
            else {
                this.method32512(arrayList, class7492.method23250(), class7493, method20600);
            }
            return this.method32516(class7493, (List<? extends Class399>)arrayList);
        }
        return (List<? extends Class399>)((class7492.method23251() != null && method20600.test(class7492.method23251())) ? Lists.newArrayList((Object[])new Class399[] { class7492.method23251() }) : Collections.emptyList());
    }
    
    private void method32512(final List<Class399> list, final Class1849 class1849, final Class5487 class1850, final Predicate<Class399> predicate) {
        if (this.field38276 == null) {
            list.addAll(class1849.method6881(this.field38281, predicate));
        }
        else {
            list.addAll((Collection<? extends Class399>)class1849.method6738(this.field38281, this.field38276.method18501(class1850), predicate));
        }
    }
    
    public Class513 method32513(final Class7492 class7492) throws CommandSyntaxException {
        this.method32509(class7492);
        final List<Class513> method32514 = this.method32514(class7492);
        if (method32514.size() == 1) {
            return method32514.get(0);
        }
        throw Class6886.field27005.create();
    }
    
    public List<Class513> method32514(final Class7492 class7492) throws CommandSyntaxException {
        this.method32509(class7492);
        if (this.field38279 != null) {
            final Class513 method20598 = class7492.method23255().method1537().method20598(this.field38279);
            return (List<Class513>)((method20598 != null) ? Lists.newArrayList((Object[])new Class513[] { method20598 }) : Collections.emptyList());
        }
        if (this.field38280 != null) {
            final Class513 method20599 = class7492.method23255().method1537().method20624(this.field38280);
            return (List<Class513>)((method20599 != null) ? Lists.newArrayList((Object[])new Class513[] { method20599 }) : Collections.emptyList());
        }
        final Class5487 class7493 = this.field38275.apply(class7492.method23249());
        final Predicate<Class399> method20600 = this.method32515(class7493);
        if (!this.field38278) {
            List<Class513> list;
            if (!this.method32508()) {
                list = Lists.newArrayList();
                for (final Class513 class7494 : class7492.method23255().method1537().method20623()) {
                    if (!method20600.test(class7494)) {
                        continue;
                    }
                    list.add(class7494);
                }
            }
            else {
                list = class7492.method23250().method6883(method20600::test);
            }
            return this.method32516(class7493, list);
        }
        if (class7492.method23251() instanceof Class513) {
            final Class513 class7495 = (Class513)class7492.method23251();
            if (method20600.test(class7495)) {
                return Lists.newArrayList((Object[])new Class513[] { class7495 });
            }
        }
        return Collections.emptyList();
    }
    
    private Predicate<Class399> method32515(final Class5487 class5487) {
        Predicate<Class399> predicate = this.field38273;
        if (this.field38276 != null) {
            predicate = predicate.and(class5490 -> {
                this.field38276.method18501(class5489);
                return class5488.method18502(class5490.method1886());
            });
        }
        if (!this.field38274.method29744()) {
            predicate = predicate.and(class5492 -> this.field38274.method29737(class5492.method1735(class5491)));
        }
        return predicate;
    }
    
    private <T extends Class399> List<T> method32516(final Class5487 class5487, final List<T> list) {
        if (list.size() > 1) {
            this.field38277.accept(class5487, list);
        }
        return list.subList(0, Math.min(this.field38270, list.size()));
    }
    
    public static Class2250 method32517(final List<? extends Class399> list) {
        return Class9479.method35298((Collection<Object>)list, Class399::method1871);
    }
}
