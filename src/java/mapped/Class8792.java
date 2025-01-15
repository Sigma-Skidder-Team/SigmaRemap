// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.function.Function;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.function.Predicate;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.Set;
import java.util.Map;

public class Class8792
{
    private static final Class2259 field36948;
    private static final Class2259 field36949;
    private static final Class2259 field36950;
    private static final Class2250 field36951;
    private static final Class2250 field36952;
    private final Map<Integer, Class776> field36953;
    private final Map<Integer, Set<Class776>> field36954;
    private final Set<UUID> field36955;
    private long field36956;
    private Class354 field36957;
    private final Class1849 field36958;
    private boolean field36959;
    private final int field36960;
    private float field36961;
    private int field36962;
    private boolean field36963;
    private int field36964;
    private final Class6879 field36965;
    private int field36966;
    private int field36967;
    private final Random field36968;
    private final int field36969;
    private Class302 field36970;
    private int field36971;
    private Optional<Class354> field36972;
    
    public Class8792(final int field36960, final Class1849 field36961, final Class354 field36962) {
        this.field36953 = Maps.newHashMap();
        this.field36954 = Maps.newHashMap();
        this.field36955 = Sets.newHashSet();
        this.field36965 = new Class6879(Class8792.field36948, Class2200.field13392, Class342.field2107);
        this.field36968 = new Random();
        this.field36972 = Optional.empty();
        this.field36960 = field36960;
        this.field36958 = field36961;
        this.field36963 = true;
        this.field36967 = 300;
        this.field36965.method21064(0.0f);
        this.field36957 = field36962;
        this.field36969 = this.method30665(field36961.method6954());
        this.field36970 = Class302.field1758;
    }
    
    public Class8792(final Class1849 field36958, final Class51 class51) {
        this.field36953 = Maps.newHashMap();
        this.field36954 = Maps.newHashMap();
        this.field36955 = Sets.newHashSet();
        this.field36965 = new Class6879(Class8792.field36948, Class2200.field13392, Class342.field2107);
        this.field36968 = new Random();
        this.field36972 = Optional.empty();
        this.field36958 = field36958;
        this.field36960 = class51.method319("Id");
        this.field36959 = class51.method329("Started");
        this.field36963 = class51.method329("Active");
        this.field36956 = class51.method320("TicksActive");
        this.field36962 = class51.method319("BadOmenLevel");
        this.field36964 = class51.method319("GroupsSpawned");
        this.field36967 = class51.method319("PreRaidTicks");
        this.field36966 = class51.method319("PostRaidTicks");
        this.field36961 = class51.method321("TotalHealth");
        this.field36957 = new Class354(class51.method319("CX"), class51.method319("CY"), class51.method319("CZ"));
        this.field36969 = class51.method319("NumGroups");
        this.field36970 = Class302.method960(class51.method323("Status"));
        this.field36955.clear();
        if (class51.method316("HeroesOfTheVillage", 9)) {
            final Class52 method328 = class51.method328("HeroesOfTheVillage", 10);
            for (int i = 0; i < method328.size(); ++i) {
                this.field36955.add(method328.method346(i).method301("UUID"));
            }
        }
    }
    
    public boolean method30618() {
        return this.method30622() || this.method30623();
    }
    
    public boolean method30619() {
        if (this.method30620()) {
            if (this.method30648() == 0) {
                if (this.field36967 > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean method30620() {
        return this.field36964 > 0;
    }
    
    public boolean method30621() {
        return this.field36970 == Class302.field1761;
    }
    
    public boolean method30622() {
        return this.field36970 == Class302.field1759;
    }
    
    public boolean method30623() {
        return this.field36970 == Class302.field1760;
    }
    
    public Class1847 method30624() {
        return this.field36958;
    }
    
    public boolean method30625() {
        return this.field36959;
    }
    
    public int method30626() {
        return this.field36964;
    }
    
    private Predicate<Class513> method30627() {
        return class513 -> {
            final Class354 class514 = new Class354(class513);
            return class513.method1768() && this.field36958.method6927(class514) == this;
        };
    }
    
    private void method30628() {
        final HashSet hashSet = Sets.newHashSet((Iterable)this.field36965.method21074());
        final List<Class513> method6883 = this.field36958.method6883(this.method30627());
        for (final Class513 class513 : method6883) {
            if (hashSet.contains(class513)) {
                continue;
            }
            this.field36965.method21049(class513);
        }
        for (final Class513 class514 : hashSet) {
            if (method6883.contains(class514)) {
                continue;
            }
            this.field36965.method21051(class514);
        }
    }
    
    public int method30629() {
        return 5;
    }
    
    public int method30630() {
        return this.field36962;
    }
    
    public void method30631(final Class512 class512) {
        if (class512.method2653(Class9439.field40504)) {
            this.field36962 += class512.method2654(Class9439.field40504).method7908() + 1;
            this.field36962 = Class9546.method35651(this.field36962, 0, this.method30629());
        }
        class512.method2659(Class9439.field40504);
    }
    
    public void method30632() {
        this.field36963 = false;
        this.field36965.method21052();
        this.field36970 = Class302.field1761;
    }
    
    public void method30633() {
        if (!this.method30621()) {
            if (this.field36970 != Class302.field1758) {
                if (this.method30618()) {
                    ++this.field36971;
                    if (this.field36971 >= 600) {
                        this.method30632();
                        return;
                    }
                    if (this.field36971 % 20 == 0) {
                        this.method30628();
                        this.field36965.method21073(true);
                        if (!this.method30622()) {
                            this.field36965.method21070(Class8792.field36952);
                        }
                        else {
                            this.field36965.method21064(0.0f);
                            this.field36965.method21070(Class8792.field36951);
                        }
                    }
                }
            }
            else {
                final boolean field36963 = this.field36963;
                this.field36963 = this.field36958.method6971(this.field36957);
                if (this.field36958.method6954() == Class2113.field12290) {
                    this.method30632();
                    return;
                }
                if (field36963 != this.field36963) {
                    this.field36965.method21073(this.field36963);
                }
                if (!this.field36963) {
                    return;
                }
                if (!this.field36958.method6922(this.field36957)) {
                    this.method30634();
                }
                if (!this.field36958.method6922(this.field36957)) {
                    if (this.field36964 <= 0) {
                        this.method30632();
                    }
                    else {
                        this.field36970 = Class302.field1760;
                    }
                }
                ++this.field36956;
                if (this.field36956 >= 48000L) {
                    this.method30632();
                    return;
                }
                final int method30648 = this.method30648();
                if (method30648 == 0) {
                    if (this.method30636()) {
                        if (this.field36967 > 0) {
                            final boolean present = this.field36972.isPresent();
                            int n = (!present && this.field36967 % 5 == 0) ? 1 : 0;
                            if (present) {
                                if (!this.field36958.method6904().method7409(new Class7859(this.field36972.get()))) {
                                    n = 1;
                                }
                            }
                            if (n != 0) {
                                int n2 = 0;
                                if (this.field36967 >= 100) {
                                    if (this.field36967 < 40) {
                                        n2 = 2;
                                    }
                                }
                                else {
                                    n2 = 1;
                                }
                                this.field36972 = this.method30635(n2);
                            }
                            if (this.field36967 == 300 || this.field36967 % 20 == 0) {
                                this.method30628();
                            }
                            --this.field36967;
                            this.field36965.method21064(Class9546.method35653((300 - this.field36967) / 300.0f, 0.0f, 1.0f));
                        }
                        else if (this.field36967 == 0) {
                            if (this.field36964 > 0) {
                                this.field36967 = 300;
                                this.field36965.method21070(Class8792.field36948);
                                return;
                            }
                        }
                    }
                }
                if (this.field36956 % 20L == 0L) {
                    this.method30628();
                    this.method30641();
                    if (method30648 <= 0) {
                        this.field36965.method21070(Class8792.field36948);
                    }
                    else if (method30648 > 2) {
                        this.field36965.method21070(Class8792.field36948);
                    }
                    else {
                        this.field36965.method21070(Class8792.field36948.method8495().method8457(" - ").method8458(new Class2259("event.minecraft.raid.raiders_remaining", new Object[] { method30648 })));
                    }
                }
                int n3 = 0;
                int n4 = 0;
                while (this.method30647()) {
                    final Class354 class354 = this.field36972.isPresent() ? this.field36972.get() : this.method30653(n4, 20);
                    if (class354 == null) {
                        ++n4;
                    }
                    else {
                        this.field36959 = true;
                        this.method30643(class354);
                        if (n3 == 0) {
                            this.method30642(class354);
                            n3 = 1;
                        }
                    }
                    if (n4 <= 3) {
                        continue;
                    }
                    this.method30632();
                    break;
                }
                if (this.method30625()) {
                    if (!this.method30636()) {
                        if (method30648 == 0) {
                            if (this.field36966 >= 40) {
                                this.field36970 = Class302.field1759;
                                final Iterator<UUID> iterator = this.field36955.iterator();
                                while (iterator.hasNext()) {
                                    final Class399 method30649 = this.field36958.method6914(iterator.next());
                                    if (!(method30649 instanceof Class511)) {
                                        continue;
                                    }
                                    if (method30649.method1639()) {
                                        continue;
                                    }
                                    final Class511 class355 = (Class511)method30649;
                                    class355.method2655(new Class1948(Class9439.field40505, 48000, this.field36962 - 1, false, false, true));
                                    if (!(class355 instanceof Class513)) {
                                        continue;
                                    }
                                    final Class513 class356 = (Class513)class355;
                                    class356.method2857(Class8276.field34056);
                                    Class7770.field31808.method13827(class356);
                                }
                            }
                            else {
                                ++this.field36966;
                            }
                        }
                    }
                }
                this.method30650();
            }
        }
    }
    
    private void method30634() {
        Class353.method1119(Class353.method1089(this.field36957), 2).filter(this.field36958::method6923).map((Function<? super Class353, ?>)Class353::method1114).min(Comparator.comparingDouble(class354 -> class354.method1083(this.field36957))).ifPresent((Consumer<? super Object>)this::method30659);
    }
    
    private Optional<Class354> method30635(final int n) {
        for (int i = 0; i < 3; ++i) {
            final Class354 method30653 = this.method30653(n, 1);
            if (method30653 != null) {
                return Optional.of(method30653);
            }
        }
        return Optional.empty();
    }
    
    private boolean method30636() {
        if (!this.method30638()) {
            return !this.method30637();
        }
        return !this.method30639();
    }
    
    private boolean method30637() {
        return this.method30626() == this.field36969;
    }
    
    private boolean method30638() {
        return this.field36962 > 1;
    }
    
    private boolean method30639() {
        return this.method30626() > this.field36969;
    }
    
    private boolean method30640() {
        if (this.method30637()) {
            if (this.method30648() == 0) {
                if (this.method30638()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void method30641() {
        final Iterator<Set<Class776>> iterator = this.field36954.values().iterator();
        final HashSet hashSet = Sets.newHashSet();
        while (iterator.hasNext()) {
            for (final Class776 class776 : iterator.next()) {
                final Class354 class777 = new Class354(class776);
                if (!class776.field2410) {
                    if (class776.field2452 == this.field36958.method6789().method20487()) {
                        if (this.field36957.method1083(class777) < 12544.0) {
                            if (class776.field2424 <= 600) {
                                continue;
                            }
                            if (this.field36958.method6914(class776.method1865()) == null) {
                                hashSet.add(class776);
                            }
                            if (!this.field36958.method6922(class777)) {
                                if (class776.method2640() > 2400) {
                                    class776.method4299(class776.method4298() + 1);
                                }
                            }
                            if (class776.method4298() < 30) {
                                continue;
                            }
                            hashSet.add(class776);
                            continue;
                        }
                    }
                }
                hashSet.add(class776);
            }
        }
        final Iterator iterator3 = hashSet.iterator();
        while (iterator3.hasNext()) {
            this.method30649((Class776)iterator3.next(), true);
        }
    }
    
    private void method30642(final Class354 class354) {
        final Collection<Class513> method21074 = this.field36965.method21074();
        for (final Class513 class355 : this.field36958.method6840()) {
            final Class5487 method21075 = class355.method1934();
            final Class5487 class356 = new Class5487(class354);
            final float method21076 = Class9546.method35641((class356.field22770 - method21075.field22770) * (class356.field22770 - method21075.field22770) + (class356.field22772 - method21075.field22772) * (class356.field22772 - method21075.field22772));
            final double n = method21075.field22770 + 13.0f / method21076 * (class356.field22770 - method21075.field22770);
            final double n2 = method21075.field22772 + 13.0f / method21076 * (class356.field22772 - method21075.field22772);
            if (method21076 > 64.0f && !method21074.contains(class355)) {
                continue;
            }
            class355.field3039.method17469(new Class4282(Class8520.field35512, Class286.field1584, n, class355.method1941(), n2, 64.0f, 1.0f));
        }
    }
    
    private void method30643(final Class354 class354) {
        int n = 0;
        final int n2 = this.field36964 + 1;
        this.field36961 = 0.0f;
        final Class9592 method6784 = this.field36958.method6784(class354);
        final boolean method6785 = this.method30640();
        for (final Class1990 class355 : Class1990.method8010()) {
            final int n3 = this.method30661(class355, n2, method6785) + this.method30662(class355, this.field36968, n2, method6784, method6785);
            int n4 = 0;
            for (int j = 0; j < n3; ++j) {
                final Class776 class356 = Class1990.method8011(class355).method23371(this.field36958);
                if (n == 0) {
                    if (class356.method4308()) {
                        class356.method4313(true);
                        this.method30656(n2, class356);
                        n = 1;
                    }
                }
                this.method30644(n2, class356, class354, false);
                if (Class1990.method8011(class355) == Class7499.field29056) {
                    Class776 class357 = null;
                    if (n2 != this.method30665(Class2113.field12292)) {
                        if (n2 >= this.method30665(Class2113.field12293)) {
                            if (n4 != 0) {
                                class357 = Class7499.field29044.method23371(this.field36958);
                            }
                            else {
                                class357 = Class7499.field28980.method23371(this.field36958);
                            }
                        }
                    }
                    else {
                        class357 = Class7499.field29045.method23371(this.field36958);
                    }
                    ++n4;
                    if (class357 != null) {
                        this.method30644(n2, class357, class354, false);
                        class357.method1729(class354, 0.0f, 0.0f);
                        class357.method1778(class356);
                    }
                }
            }
        }
        this.field36972 = Optional.empty();
        ++this.field36964;
        this.method30645();
        this.method30650();
    }
    
    public void method30644(final int n, final Class776 class776, final Class354 class777, final boolean b) {
        if (this.method30654(n, class776)) {
            class776.method4291(this);
            class776.method4294(n);
            class776.method4289(true);
            class776.method4299(0);
            if (!b) {
                if (class777 != null) {
                    class776.method1656(class777.method1074() + 0.5, class777.method1075() + 1.0, class777.method1076() + 0.5);
                    class776.method4188(this.field36958, this.field36958.method6784(class777), Class2101.field12181, null, null);
                    class776.method4263(n, false);
                    class776.field2404 = true;
                    this.field36958.method6886(class776);
                }
            }
        }
    }
    
    public void method30645() {
        this.field36965.method21064(Class9546.method35653(this.method30646() / this.field36961, 0.0f, 1.0f));
    }
    
    public float method30646() {
        float n = 0.0f;
        final Iterator<Set<Class776>> iterator = this.field36954.values().iterator();
        while (iterator.hasNext()) {
            final Iterator iterator2 = iterator.next().iterator();
            while (iterator2.hasNext()) {
                n += ((Class776)iterator2.next()).method2664();
            }
        }
        return n;
    }
    
    private boolean method30647() {
        if (this.field36967 == 0) {
            if (this.field36964 < this.field36969 || this.method30640()) {
                if (this.method30648() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int method30648() {
        return this.field36954.values().stream().mapToInt(Set::size).sum();
    }
    
    public void method30649(final Class776 class776, final boolean b) {
        final Set set = this.field36954.get(class776.method4295());
        if (set != null) {
            if (set.remove(class776)) {
                if (b) {
                    this.field36961 -= class776.method2664();
                }
                class776.method4291(null);
                this.method30645();
                this.method30650();
            }
        }
    }
    
    private void method30650() {
        this.field36958.method6926().method18903();
    }
    
    public static Class8321 method30651() {
        final Class8321 class8321 = new Class8321(Class7739.field31556);
        class8321.method27659("BlockEntityTag").method295("Patterns", new Class9142().method33336(Class230.field837, Class181.field546).method33336(Class230.field817, Class181.field545).method33336(Class230.field821, Class181.field544).method33336(Class230.field842, Class181.field545).method33336(Class230.field822, Class181.field552).method33336(Class230.field839, Class181.field545).method33336(Class230.field836, Class181.field545).method33336(Class230.field842, Class181.field552).method33337());
        class8321.method27665(new Class2259("block.minecraft.ominous_banner", new Object[0]).method8469(Class2116.field12315));
        return class8321;
    }
    
    @Nullable
    public Class776 method30652(final int i) {
        return this.field36953.get(i);
    }
    
    @Nullable
    private Class354 method30653(final int n, final int n2) {
        final int n3 = (n != 0) ? (2 - n) : 2;
        final Class385 class385 = new Class385();
        for (int i = 0; i < n2; ++i) {
            final float n4 = this.field36958.field10062.nextFloat() * 6.2831855f;
            final int n5 = this.field36957.method1074() + Class9546.method35642(Class9546.method35639(n4) * 32.0f * n3) + this.field36958.field10062.nextInt(5);
            final int n6 = this.field36957.method1076() + Class9546.method35642(Class9546.method35638(n4) * 32.0f * n3) + this.field36958.field10062.nextInt(5);
            class385.method1284(n5, this.field36958.method6699(Class2020.field11522, n5, n6), n6);
            if (!this.field36958.method6922(class385) || n >= 2) {
                if (this.field36958.method6973(class385.method1074() - 10, class385.method1075() - 10, class385.method1076() - 10, class385.method1074() + 10, class385.method1075() + 10, class385.method1076() + 10)) {
                    if (this.field36958.method6904().method7409(new Class7859(class385))) {
                        if (!Class8532.method28621(Class2194.field13354, this.field36958, class385, Class7499.field29056)) {
                            if (this.field36958.method6701(class385.method1139()).method21696() != Class7521.field29329) {
                                continue;
                            }
                            if (!this.field36958.method6701(class385).method21706()) {
                                continue;
                            }
                        }
                        return class385;
                    }
                }
            }
        }
        return null;
    }
    
    private boolean method30654(final int n, final Class776 class776) {
        return this.method30655(n, class776, true);
    }
    
    public boolean method30655(final int n, final Class776 class776, final boolean b) {
        this.field36954.computeIfAbsent(n, p0 -> Sets.newHashSet());
        final Set set = this.field36954.get(n);
        Object o = null;
        for (final Class776 class777 : set) {
            if (!class777.method1865().equals(class776.method1865())) {
                continue;
            }
            o = class777;
            break;
        }
        if (o != null) {
            set.remove(o);
            set.add(class776);
        }
        set.add(class776);
        if (b) {
            this.field36961 += class776.method2664();
        }
        this.method30645();
        this.method30650();
        return true;
    }
    
    public void method30656(final int i, final Class776 class776) {
        this.field36953.put(i, class776);
        class776.method1803(Class2215.field13605, method30651());
        class776.method4191(Class2215.field13605, 2.0f);
    }
    
    public void method30657(final int i) {
        this.field36953.remove(i);
    }
    
    public Class354 method30658() {
        return this.field36957;
    }
    
    private void method30659(final Class354 field36957) {
        this.field36957 = field36957;
    }
    
    public int method30660() {
        return this.field36960;
    }
    
    private int method30661(final Class1990 class1990, final int n, final boolean b) {
        return b ? Class1990.method8012(class1990)[this.field36969] : Class1990.method8012(class1990)[n];
    }
    
    private int method30662(final Class1990 class1990, final Random random, final int n, final Class9592 class1991, final boolean b) {
        final Class2113 method35972 = class1991.method35972();
        final boolean b2 = method35972 == Class2113.field12291;
        final boolean b3 = method35972 == Class2113.field12292;
        int nextInt = 0;
        switch (Class8079.field33271[class1990.ordinal()]) {
            case 1: {
                if (b2 || n <= 2 || n == 4) {
                    return 0;
                }
                nextInt = 1;
                break;
            }
            case 2:
            case 3: {
                if (b2) {
                    nextInt = random.nextInt(2);
                    break;
                }
                if (b3) {
                    nextInt = 1;
                    break;
                }
                nextInt = 2;
                break;
            }
            case 4: {
                nextInt = ((!b2 && b) ? 1 : 0);
                break;
            }
            default: {
                return 0;
            }
        }
        return (nextInt > 0) ? random.nextInt(nextInt + 1) : 0;
    }
    
    public boolean method30663() {
        return this.field36963;
    }
    
    public Class51 method30664(final Class51 class51) {
        class51.method298("Id", this.field36960);
        class51.method312("Started", this.field36959);
        class51.method312("Active", this.field36963);
        class51.method299("TicksActive", this.field36956);
        class51.method298("BadOmenLevel", this.field36962);
        class51.method298("GroupsSpawned", this.field36964);
        class51.method298("PreRaidTicks", this.field36967);
        class51.method298("PostRaidTicks", this.field36966);
        class51.method304("TotalHealth", this.field36961);
        class51.method298("NumGroups", this.field36969);
        class51.method306("Status", this.field36970.method959());
        class51.method298("CX", this.field36957.method1074());
        class51.method298("CY", this.field36957.method1075());
        class51.method298("CZ", this.field36957.method1076());
        final Class52 class52 = new Class52();
        for (final UUID uuid : this.field36955) {
            final Class51 e = new Class51();
            e.method300("UUID", uuid);
            ((AbstractList<Class51>)class52).add(e);
        }
        class51.method295("HeroesOfTheVillage", class52);
        return class51;
    }
    
    public int method30665(final Class2113 class2113) {
        switch (Class8079.field33272[class2113.ordinal()]) {
            case 1: {
                return 3;
            }
            case 2: {
                return 5;
            }
            case 3: {
                return 7;
            }
            default: {
                return 0;
            }
        }
    }
    
    public float method30666() {
        final int method30630 = this.method30630();
        if (method30630 == 2) {
            return 0.1f;
        }
        if (method30630 == 3) {
            return 0.25f;
        }
        if (method30630 != 4) {
            return (method30630 != 5) ? 0.0f : 0.75f;
        }
        return 0.5f;
    }
    
    public void method30667(final Class399 class399) {
        this.field36955.add(class399.method1865());
    }
    
    static {
        field36948 = new Class2259("event.minecraft.raid", new Object[0]);
        field36949 = new Class2259("event.minecraft.raid.victory", new Object[0]);
        field36950 = new Class2259("event.minecraft.raid.defeat", new Object[0]);
        field36951 = Class8792.field36948.method8495().method8457(Class8792.\ub327\u3df9\u97e7\u6a3c\u5691\uca70[16]).method8458(Class8792.field36949);
        field36952 = Class8792.field36948.method8495().method8457(Class8792.\ub327\u3df9\u97e7\u6a3c\u5691\uca70[16]).method8458(Class8792.field36950);
    }
}
