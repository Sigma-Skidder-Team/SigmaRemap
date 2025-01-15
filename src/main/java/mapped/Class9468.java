// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.HashSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import javax.annotation.Nullable;
import java.util.Set;
import java.util.List;

public class Class9468
{
    private final List<Class6772> field40714;
    private Class6772[] field40715;
    private Class6772[] field40716;
    private Set<Class6773> field40717;
    private int field40718;
    private final Class354 field40719;
    private final float field40720;
    private final boolean field40721;
    
    public Class9468(final List<Class6772> field40714, final Class354 field40715, final boolean field40716) {
        this.field40715 = new Class6772[0];
        this.field40716 = new Class6772[0];
        this.field40714 = field40714;
        this.field40719 = field40715;
        this.field40720 = (field40714.isEmpty() ? Float.MAX_VALUE : this.field40714.get(this.field40714.size() - 1).method20670(this.field40719));
        this.field40721 = field40716;
    }
    
    public void method35214() {
        ++this.field40718;
    }
    
    public boolean method35215() {
        return this.field40718 >= this.field40714.size();
    }
    
    @Nullable
    public Class6772 method35216() {
        return this.field40714.isEmpty() ? null : this.field40714.get(this.field40714.size() - 1);
    }
    
    public Class6772 method35217(final int n) {
        return this.field40714.get(n);
    }
    
    public List<Class6772> method35218() {
        return this.field40714;
    }
    
    public void method35219(final int n) {
        if (this.field40714.size() > n) {
            this.field40714.subList(n, this.field40714.size()).clear();
        }
    }
    
    public void method35220(final int n, final Class6772 class6772) {
        this.field40714.set(n, class6772);
    }
    
    public int method35221() {
        return this.field40714.size();
    }
    
    public int method35222() {
        return this.field40718;
    }
    
    public void method35223(final int field40718) {
        this.field40718 = field40718;
    }
    
    public Class5487 method35224(final Class399 class399, final int n) {
        final Class6772 class400 = this.field40714.get(n);
        return new Class5487(class400.field26589 + (int)(class399.method1930() + 1.0f) * 0.5, class400.field26590, class400.field26591 + (int)(class399.method1930() + 1.0f) * 0.5);
    }
    
    public Class5487 method35225(final Class399 class399) {
        return this.method35224(class399, this.field40718);
    }
    
    public Class5487 method35226() {
        final Class6772 class6772 = this.field40714.get(this.field40718);
        return new Class5487(class6772.field26589, class6772.field26590, class6772.field26591);
    }
    
    public boolean method35227(final Class9468 class9468) {
        if (class9468 == null) {
            return false;
        }
        if (class9468.field40714.size() == this.field40714.size()) {
            int i = 0;
            while (i < this.field40714.size()) {
                final Class6772 class9469 = this.field40714.get(i);
                final Class6772 class9470 = class9468.field40714.get(i);
                if (class9469.field26589 == class9470.field26589) {
                    if (class9469.field26590 == class9470.field26590) {
                        if (class9469.field26591 == class9470.field26591) {
                            ++i;
                            continue;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method35228() {
        return this.field40721;
    }
    
    public Class6772[] method35229() {
        return this.field40715;
    }
    
    public Class6772[] method35230() {
        return this.field40716;
    }
    
    public static Class9468 method35231(final Class8654 class8654) {
        final boolean boolean1 = class8654.readBoolean();
        final int int1 = class8654.readInt();
        final int int2 = class8654.readInt();
        final HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < int2; ++i) {
            hashSet.add(Class6773.method20678(class8654));
        }
        final Class354 class8655 = new Class354(class8654.readInt(), class8654.readInt(), class8654.readInt());
        final ArrayList arrayList = Lists.newArrayList();
        for (int int3 = class8654.readInt(), j = 0; j < int3; ++j) {
            arrayList.add(Class6772.method20673(class8654));
        }
        final Class6772[] field40715 = new Class6772[class8654.readInt()];
        for (int k = 0; k < field40715.length; ++k) {
            field40715[k] = Class6772.method20673(class8654);
        }
        final Class6772[] field40716 = new Class6772[class8654.readInt()];
        for (int l = 0; l < field40716.length; ++l) {
            field40716[l] = Class6772.method20673(class8654);
        }
        final Class9468 class8656 = new Class9468(arrayList, class8655, boolean1);
        class8656.field40715 = field40715;
        class8656.field40716 = field40716;
        class8656.field40717 = hashSet;
        class8656.field40718 = int1;
        return class8656;
    }
    
    @Override
    public String toString() {
        return "Path(length=" + this.field40714.size() + ")";
    }
    
    public Class354 method35232() {
        return this.field40719;
    }
    
    public float method35233() {
        return this.field40720;
    }
}
