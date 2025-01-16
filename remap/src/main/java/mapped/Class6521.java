// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class Class6521
{
    private static String[] field25950;
    public final Set<ResourceLocation> field25951;
    public final Set<ResourceLocation> field25952;
    public boolean field25953;
    public boolean field25954;
    public boolean field25955;
    public boolean field25956;
    public boolean field25957;
    public boolean field25958;
    public boolean field25959;
    public boolean field25960;
    
    public Class6521() {
        this.field25951 = Sets.newHashSet();
        this.field25952 = Sets.newHashSet();
    }
    
    public void method19692(final Class6521 class6521) {
        this.field25951.clear();
        this.field25952.clear();
        this.field25951.addAll(class6521.field25951);
        this.field25952.addAll(class6521.field25952);
    }
    
    public void method19693(final IRecipe<?> class3662) {
        if (!class3662.isDynamic()) {
            this.method19694(class3662.getId());
        }
    }
    
    public void method19694(final ResourceLocation class1932) {
        this.field25951.add(class1932);
    }
    
    public boolean method19695(final IRecipe<?> class3662) {
        return class3662 != null && this.field25951.contains(class3662.getId());
    }
    
    public boolean method19696(final ResourceLocation class1932) {
        return this.field25951.contains(class1932);
    }
    
    public void method19697(final IRecipe<?> class3662) {
        this.method19698(class3662.getId());
    }
    
    public void method19698(final ResourceLocation class1932) {
        this.field25951.remove(class1932);
        this.field25952.remove(class1932);
    }
    
    public boolean method19699(final IRecipe<?> class3662) {
        return this.field25952.contains(class3662.getId());
    }
    
    public void method19700(final IRecipe<?> class3662) {
        this.field25952.remove(class3662.getId());
    }
    
    public void method19701(final IRecipe<?> class3662) {
        this.method19702(class3662.getId());
    }
    
    public void method19702(final ResourceLocation class1932) {
        this.field25952.add(class1932);
    }
    
    public boolean method19703() {
        return this.field25953;
    }
    
    public void method19704(final boolean field25953) {
        this.field25953 = field25953;
    }
    
    public boolean method19705(final Class3426<?> class3426) {
        if (class3426 instanceof Class3432) {
            return this.field25956;
        }
        if (!(class3426 instanceof Class3430)) {
            return (class3426 instanceof Class3431) ? this.field25960 : this.field25954;
        }
        return this.field25958;
    }
    
    public boolean method19706() {
        return this.field25954;
    }
    
    public void method19707(final boolean field25954) {
        this.field25954 = field25954;
    }
    
    public boolean method19708() {
        return this.field25955;
    }
    
    public void method19709(final boolean field25955) {
        this.field25955 = field25955;
    }
    
    public boolean method19710() {
        return this.field25956;
    }
    
    public void method19711(final boolean field25956) {
        this.field25956 = field25956;
    }
    
    public boolean method19712() {
        return this.field25957;
    }
    
    public void method19713(final boolean field25957) {
        this.field25957 = field25957;
    }
    
    public boolean method19714() {
        return this.field25958;
    }
    
    public void method19715(final boolean field25958) {
        this.field25958 = field25958;
    }
    
    public boolean method19716() {
        return this.field25959;
    }
    
    public void method19717(final boolean field25959) {
        this.field25959 = field25959;
    }
    
    public boolean method19718() {
        return this.field25960;
    }
    
    public void method19719(final boolean field25960) {
        this.field25960 = field25960;
    }
}
