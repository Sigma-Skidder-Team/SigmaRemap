// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import net.minecraft.util.Direction;
import org.apache.logging.log4j.LogManager;
import java.util.Optional;
import java.util.ArrayList;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.stream.Collectors;
import com.mojang.datafixers.util.Pair;
import java.util.Set;
import java.util.function.Function;
import java.util.Iterator;
import java.util.HashSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.io.StringReader;
import java.io.Reader;
import com.mojang.datafixers.util.Either;
import java.util.Map;
import java.util.List;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class7685 implements Class7684
{
    private static final Logger field30515;
    private static final Class6225 field30516;
    public static final Gson field30517;
    private final List<Class9219> field30518;
    private final Class240 field30519;
    private final boolean field30520;
    private final Class7503 field30521;
    private final List<Class6559> field30522;
    public String field30523;
    public final Map<String, Either<Class3687, String>> field30524;
    public Class7685 field30525;
    public ResourceLocation field30526;
    
    public static Class7685 method24385(final Reader reader) {
        return Class9583.method35928(Class7685.field30517, reader, Class7685.class);
    }
    
    public static Class7685 method24386(final String s) {
        return method24385(new StringReader(s));
    }
    
    public Class7685(final ResourceLocation field30526, final List<Class9219> field30527, final Map<String, Either<Class3687, String>> field30528, final boolean field30529, final Class240 field30530, final Class7503 field30531, final List<Class6559> field30532) {
        this.field30523 = "";
        this.field30518 = field30527;
        this.field30520 = field30529;
        this.field30519 = field30530;
        this.field30524 = field30528;
        this.field30526 = field30526;
        this.field30521 = field30531;
        this.field30522 = field30532;
    }
    
    public List<Class9219> method24387() {
        return (this.field30518.isEmpty() && this.field30525 != null) ? this.field30525.method24387() : this.field30518;
    }
    
    public boolean method24388() {
        return (this.field30525 == null) ? this.field30520 : this.field30525.method24388();
    }
    
    public Class240 method24389() {
        if (this.field30519 == null) {
            return (this.field30525 == null) ? Class240.field1178 : this.field30525.method24389();
        }
        return this.field30519;
    }
    
    public List<Class6559> method24390() {
        return this.field30522;
    }
    
    private Class9168 method24391(final Class7637 class7637, final Class7685 class7638) {
        return this.field30522.isEmpty() ? Class9168.field38839 : new Class9168(class7637, class7638, class7637::method24014, this.field30522);
    }
    
    @Override
    public Collection<ResourceLocation> method24381() {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<Class6559> iterator = this.field30522.iterator();
        while (iterator.hasNext()) {
            hashSet.add(iterator.next().method19882());
        }
        if (this.field30526 != null) {
            hashSet.add(this.field30526);
        }
        return hashSet;
    }
    
    @Override
    public Collection<Class3687> method24382(final Function<ResourceLocation, Class7684> function, final Set<Pair<String, String>> set) {
        final LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        for (Class7685 field30525 = this; field30525.field30526 != null && field30525.field30525 == null; field30525 = field30525.field30525) {
            linkedHashSet.add(field30525);
            Class7684 class7684 = function.apply(field30525.field30526);
            if (class7684 == null) {
                Class7685.field30515.warn("No parent '{}' while loading model '{}'", this.field30526, field30525);
            }
            if (linkedHashSet.contains(class7684)) {
                Class7685.field30515.warn("Found 'parent' loop while loading model '{}' in chain: {} -> {}", field30525, linkedHashSet.stream().map(Object::toString).collect(Collectors.joining(" -> ")), this.field30526);
                class7684 = null;
            }
            if (class7684 == null) {
                field30525.field30526 = Class7637.field30250;
                class7684 = function.apply(field30525.field30526);
            }
            if (!(class7684 instanceof Class7685)) {
                throw new IllegalStateException("BlockModel parent has to be a block model.");
            }
            field30525.field30525 = (Class7685)class7684;
        }
        final HashSet hashSet = Sets.newHashSet((Object[])new Class3687[] { this.method24395("particle") });
        final Iterator<Class9219> iterator = this.method24387().iterator();
        while (iterator.hasNext()) {
            for (final Class8111 class7685 : iterator.next().field39556.values()) {
                final Class3687 method24395 = this.method24395(class7685.field33425);
                if (Objects.equals(method24395.method11331(), Class1913.method7551())) {
                    set.add((Pair<String, String>)Pair.of((Object)class7685.field33425, (Object)this.field30523));
                }
                hashSet.add(method24395);
            }
        }
        this.field30522.forEach(class7686 -> {
            final Class7684 a = function2.apply(class7686.method19882());
            if (!Objects.equals(a, this)) {
                set2.addAll(a.method24382(function2, set3));
            }
        });
        if (this.method24398() == Class7637.field30256) {
            Class8163.field33624.forEach(s -> set4.add(this.method24395(s)));
        }
        return hashSet;
    }
    
    @Override
    public Class6313 method24383(final Class7637 class7637, final Function<Class3687, TextureAtlasSprite> function, final Class2123 class7638, final ResourceLocation class7639) {
        return this.method24392(class7637, this, function, class7638, class7639, true);
    }
    
    public Class6313 method24392(final Class7637 class7637, final Class7685 class7638, final Function<Class3687, TextureAtlasSprite> function, final Class2123 class7639, final ResourceLocation class7640, final boolean b) {
        final TextureAtlasSprite class7641 = function.apply(this.method24395("particle"));
        if (this.method24398() != Class7637.field30257) {
            final Class7878 method25530 = new Class7878(this, this.method24391(class7637, class7638), b).method25530(class7641);
            for (final Class9219 class7642 : this.method24387()) {
                for (final Direction class7643 : class7642.field39556.keySet()) {
                    final Class8111 class7644 = class7642.field39556.get(class7643);
                    final TextureAtlasSprite class7645 = function.apply(this.method24395(class7644.field33425));
                    if (class7644.field33423 != null) {
                        method25530.method25528(Direction.rotateFace(class7639.method8274().getMatrix(), class7644.field33423), method24393(class7642, class7644, class7645, class7643, class7639, class7640));
                    }
                    else {
                        method25530.method25529(method24393(class7642, class7644, class7645, class7643, class7639, class7640));
                    }
                }
            }
            return method25530.method25531();
        }
        return new Class6317(this.method24399(), this.method24391(class7637, class7638), class7641, this.method24389().method889());
    }
    
    private static Class8754 method24393(final Class9219 class9219, final Class8111 class9220, final TextureAtlasSprite class9221, final Direction class9222, final Class2123 class9223, final ResourceLocation class9224) {
        return Class7685.field30516.method18519(class9219.field39554, class9219.field39555, class9220, class9221, class9222, class9223, class9219.field39557, class9219.field39558, class9224);
    }
    
    public boolean method24394(final String s) {
        return !Class1913.method7551().equals(this.method24395(s).method11331());
    }
    
    public Class3687 method24395(String substring) {
        if (method24397(substring)) {
            substring = substring.substring(1);
        }
        final ArrayList arrayList = Lists.newArrayList();
        while (true) {
            final Either<Class3687, String> method24396 = this.method24396(substring);
            final Optional left = method24396.left();
            if (left.isPresent()) {
                return (Class3687)left.get();
            }
            substring = method24396.right().get();
            if (arrayList.contains(substring)) {
                Class7685.field30515.warn("Unable to resolve texture due to reference chain {}->{} in {}", Joiner.on("->").join(arrayList), substring, this.field30523);
                return new Class3687(Class1774.field9853, Class1913.method7551());
            }
            arrayList.add(substring);
        }
    }
    
    private Either<Class3687, String> method24396(final String s) {
        for (Class7685 field30525 = this; field30525 != null; field30525 = field30525.field30525) {
            final Either either = field30525.field30524.get(s);
            if (either != null) {
                return (Either<Class3687, String>)either;
            }
        }
        return (Either<Class3687, String>)Either.left((Object)new Class3687(Class1774.field9853, Class1913.method7551()));
    }
    
    private static boolean method24397(final String s) {
        return s.charAt(0) == '#';
    }
    
    public Class7685 method24398() {
        return (this.field30525 != null) ? this.field30525.method24398() : this;
    }
    
    public Class7503 method24399() {
        return new Class7503(this.method24400(Class2016.field11487), this.method24400(Class2016.field11488), this.method24400(Class2016.field11489), this.method24400(Class2016.field11490), this.method24400(Class2016.field11491), this.method24400(Class2016.field11492), this.method24400(Class2016.field11493), this.method24400(Class2016.field11494));
    }
    
    private Class6429 method24400(final Class2016 class2016) {
        return (this.field30525 != null && !this.field30521.method23403(class2016)) ? this.field30525.method24400(class2016) : this.field30521.method23402(class2016);
    }
    
    @Override
    public String toString() {
        return this.field30523;
    }
    
    static {
        field30515 = LogManager.getLogger();
        field30516 = new Class6225();
        field30517 = new GsonBuilder().registerTypeAdapter(Class7685.class, new Class5985()).registerTypeAdapter(Class9219.class, new Class5970()).registerTypeAdapter(Class8111.class, new Class5990()).registerTypeAdapter(Class8435.class, new Class5972()).registerTypeAdapter(Class6429.class, new Class5983()).registerTypeAdapter(Class7503.class, new Class5979()).registerTypeAdapter(Class6559.class, new Class5968()).create();
    }
}
