// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.*;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class Class6515 extends Class6516
{
    private static String[] field25926;
    private final MinecraftServer field25927;
    private final Set<Class9290> field25928;
    private Runnable[] field25929;
    
    public Class6515(final MinecraftServer field25927) {
        this.field25928 = Sets.newHashSet();
        this.field25929 = new Runnable[0];
        this.field25927 = field25927;
    }
    
    @Override
    public void method19611(final Class7628 class7628) {
        super.method19611(class7628);
        if (this.field25928.contains(class7628.method23972())) {
            this.field25927.method1537().method20586(new Class4377(Class2142.field12614, class7628.method23972().method34312(), class7628.method23973(), class7628.method23969()));
        }
        this.method19624();
    }
    
    @Override
    public void method19612(final String s) {
        super.method19612(s);
        this.field25927.method1537().method20586(new Class4377(Class2142.field12615, null, s, 0));
        this.method19624();
    }
    
    @Override
    public void method19613(final String s, final Class9290 class9290) {
        super.method19613(s, class9290);
        if (this.field25928.contains(class9290)) {
            this.field25927.method1537().method20586(new Class4377(Class2142.field12615, class9290.method34312(), s, 0));
        }
        this.method19624();
    }
    
    @Override
    public void method19614(final int n, final Class9290 class9290) {
        final Class9290 method19644 = this.method19644(n);
        super.method19614(n, class9290);
        if (method19644 != class9290) {
            if (method19644 != null) {
                if (this.method19629(method19644) <= 0) {
                    this.method19628(method19644);
                }
                else {
                    this.field25927.method1537().method20586(new Class4253(n, class9290));
                }
            }
        }
        if (class9290 != null) {
            if (!this.field25928.contains(class9290)) {
                this.method19626(class9290);
            }
            else {
                this.field25927.method1537().method20586(new Class4253(n, class9290));
            }
        }
        this.method19624();
    }
    
    @Override
    public boolean method19615(final String s, final Class6749 class6749) {
        if (!super.method19615(s, class6749)) {
            return false;
        }
        this.field25927.method1537().method20586(new Class4290(class6749, Collections.singletonList(s), 3));
        this.method19624();
        return true;
    }
    
    @Override
    public void method19616(final String s, final Class6749 class6749) {
        super.method19616(s, class6749);
        this.field25927.method1537().method20586(new Class4290(class6749, Collections.singletonList(s), 4));
        this.method19624();
    }
    
    @Override
    public void method19617(final Class9290 class9290) {
        super.method19617(class9290);
        this.method19624();
    }
    
    @Override
    public void method19618(final Class9290 class9290) {
        super.method19618(class9290);
        if (this.field25928.contains(class9290)) {
            this.field25927.method1537().method20586(new Class4400(class9290, 2));
        }
        this.method19624();
    }
    
    @Override
    public void method19619(final Class9290 class9290) {
        super.method19619(class9290);
        if (this.field25928.contains(class9290)) {
            this.method19628(class9290);
        }
        this.method19624();
    }
    
    @Override
    public void method19620(final Class6749 class6749) {
        super.method19620(class6749);
        this.field25927.method1537().method20586(new Class4290(class6749, 0));
        this.method19624();
    }
    
    @Override
    public void method19621(final Class6749 class6749) {
        super.method19621(class6749);
        this.field25927.method1537().method20586(new Class4290(class6749, 2));
        this.method19624();
    }
    
    @Override
    public void method19622(final Class6749 class6749) {
        super.method19622(class6749);
        this.field25927.method1537().method20586(new Class4290(class6749, 1));
        this.method19624();
    }
    
    public void method19623(final Runnable runnable) {
        (this.field25929 = Arrays.copyOf(this.field25929, this.field25929.length + 1))[this.field25929.length - 1] = runnable;
    }
    
    public void method19624() {
        final Runnable[] field25929 = this.field25929;
        for (int length = field25929.length, i = 0; i < length; ++i) {
            field25929[i].run();
        }
    }
    
    public List<IPacket<?>> method19625(final Class9290 class9290) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new Class4400(class9290, 0));
        for (int i = 0; i < 19; ++i) {
            if (this.method19644(i) == class9290) {
                arrayList.add(new Class4253(i, class9290));
            }
        }
        for (final Class7628 class9291 : this.method19637(class9290)) {
            arrayList.add(new Class4377(Class2142.field12614, class9291.method23972().method34312(), class9291.method23973(), class9291.method23969()));
        }
        return arrayList;
    }
    
    public void method19626(final Class9290 class9290) {
        final List<IPacket<?>> method19625 = this.method19625(class9290);
        for (final Class513 class9291 : this.field25927.method1537().method20623()) {
            final Iterator<IPacket<?>> iterator2 = method19625.iterator();
            while (iterator2.hasNext()) {
                class9291.field3039.method17469(iterator2.next());
            }
        }
        this.field25928.add(class9290);
    }
    
    public List<IPacket<?>> method19627(final Class9290 class9290) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new Class4400(class9290, 1));
        for (int i = 0; i < 19; ++i) {
            if (this.method19644(i) == class9290) {
                arrayList.add(new Class4253(i, class9290));
            }
        }
        return arrayList;
    }
    
    public void method19628(final Class9290 class9290) {
        final List<IPacket<?>> method19627 = this.method19627(class9290);
        for (final Class513 class9291 : this.field25927.method1537().method20623()) {
            final Iterator<IPacket<?>> iterator2 = method19627.iterator();
            while (iterator2.hasNext()) {
                class9291.field3039.method17469(iterator2.next());
            }
        }
        this.field25928.remove(class9290);
    }
    
    public int method19629(final Class9290 class9290) {
        int n = 0;
        for (int i = 0; i < 19; ++i) {
            if (this.method19644(i) == class9290) {
                ++n;
            }
        }
        return n;
    }
}
