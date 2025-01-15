// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.function.Predicate;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class545 extends Class527
{
    private final Class5046 field3288;
    private static final Logger field3289;
    
    public Class545(final Class5046 field3288) {
        super(Class7895.field32402);
        this.field3288 = field3288;
    }
    
    public Class5046 method3183() {
        return this.field3288;
    }
    
    @Override
    public void method3038(final Class869 class869, final int n, final int n2) {
        this.field3288.method15404(class869, n, n2);
        super.method3038(class869, n, n2);
    }
    
    @Override
    public void method2969() {
        this.field3288.method15369();
        super.method2969();
    }
    
    public void method3184(final String s, final int n, final int n2, final int n3) {
        super.method3295(this.field3156, s, n, n2, n3);
    }
    
    public void method3185(final String s, final int n, final int n2, final int n3, final boolean b) {
        if (!b) {
            this.field3156.method6610(s, (float)n, (float)n2, n3);
        }
        else {
            super.method3297(this.field3156, s, n, n2, n3);
        }
    }
    
    @Override
    public void method3186(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.field3288.method15409(n, n2, n3, n4, n5, n6);
        super.method3186(n, n2, n3, n4, n5, n6);
    }
    
    public static void method3187(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        Class565.method3300(n, n2, n7, n8, n3, n4, n5, n6, n9, n10);
    }
    
    public static void method3188(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8) {
        Class565.method3188(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    @Override
    public void method3189(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        super.method3189(n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void method3041() {
        super.method3041();
    }
    
    @Override
    public boolean method2991() {
        return super.method2991();
    }
    
    @Override
    public void method3042(final int n) {
        super.method3042(n);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.field3288.method15383(n, n2, n3);
    }
    
    @Override
    public void method3014(final Class8321 class8321, final int n, final int n2) {
        super.method3014(class8321, n, n2);
    }
    
    @Override
    public void method3031(final String s, final int n, final int n2) {
        super.method3031(s, n, n2);
    }
    
    @Override
    public void method3032(final List<String> list, final int n, final int n2) {
        super.method3032(list, n, n2);
    }
    
    @Override
    public void method2992() {
        this.field3288.method15375();
        super.method2992();
    }
    
    public int method3190() {
        return this.field3152;
    }
    
    public int method3191() {
        return this.field3153;
    }
    
    public int method3192() {
        return 9;
    }
    
    public int method3193(final String s) {
        return this.field3156.method6617(s);
    }
    
    public void method3194(final String s, final int n, final int n2, final int n3) {
        this.field3156.method6609(s, (float)n, (float)n2, n3);
    }
    
    public List<String> method3195(final String s, final int n) {
        return this.field3156.method6626(s, n);
    }
    
    public void method3196() {
        this.field3149.clear();
    }
    
    public void method3197(final Class5053 obj) {
        if (this.method3200(obj) || !this.field3149.add(obj.method15448())) {
            Class545.field3289.error("Tried to add the same widget multiple times: " + obj);
        }
    }
    
    public void method3198() {
        Class7847.method25384((Iterable<String>)this.field3149.stream().filter(class574 -> class574 instanceof Class575).map(class575 -> ((Class575)class575).method3373().method15594()).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
    }
    
    public void method3199(final Class5053 obj) {
        if (!this.method3200(obj) || !this.field3149.remove(obj.method15448())) {
            Class545.field3289.error("Tried to add the same widget multiple times: " + obj);
        }
    }
    
    public boolean method3200(final Class5053 class5053) {
        return this.field3149.contains(class5053.method15448());
    }
    
    public void method3201(final Class5610<?> class5610) {
        this.method3029(class5610.method16915());
    }
    
    public List<Class5610<?>> method3202() {
        final ArrayList arrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(this.field3154.size());
        final Iterator<Class573> iterator = this.field3154.iterator();
        while (iterator.hasNext()) {
            arrayListWithExpectedSize.add(((Class664<Object>)iterator.next()).method3725());
        }
        return arrayListWithExpectedSize;
    }
    
    public void method3203() {
        this.field3149.removeIf(Sets.newHashSet((Iterable)this.field3154)::contains);
        this.field3154.clear();
    }
    
    public void method3204(final Class5611 class5611) {
        this.field3149.remove(class5611.method16923());
        this.field3154.remove(class5611.method16923());
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        return this.field3288.method15368(n, n2, n3) || super.method2982(n, n2, n3);
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        return this.field3288.method15492(n, n2, n3);
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.field3288.method15493(n, n2, n3, n4, n5) || super.method2984(n, n2, n3, n4, n5);
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        return this.field3288.method15376(n, n2, n3) || super.method2972(n, n2, n3);
    }
    
    @Override
    public boolean method3004(final char c, final int n) {
        return this.field3288.method15496(c, n) || super.method3004(c, n);
    }
    
    @Override
    public void method2971() {
        this.field3288.method15442();
        super.method2971();
    }
    
    public int method3205(final String s, final int n, final int n2, final int n3, final boolean b) {
        return b ? this.field3156.method6609(s, (float)n, (float)n2, n3) : this.field3156.method6610(s, (float)n, (float)n2, n3);
    }
    
    public Class1844 method3206() {
        return this.field3156;
    }
    
    static {
        field3289 = LogManager.getLogger();
    }
}
