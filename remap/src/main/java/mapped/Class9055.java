// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class9055
{
    private static String[] field38327;
    private final Class357 field38328;
    private final Class373 field38329;
    private Set<Class3833> field38330;
    private Set<BlockState> field38331;
    private int field38332;
    private int field38333;
    private int field38334;
    private int field38335;
    private boolean field38336;
    private boolean field38337;
    private boolean field38338;
    
    public Class9055(final Class357 field38328, final Class373 field38329) {
        this.field38330 = (Set<Class3833>)ImmutableSet.of();
        this.field38331 = (Set<BlockState>)ImmutableSet.of();
        this.field38332 = 64;
        this.field38333 = 7;
        this.field38334 = 3;
        this.field38335 = 7;
        this.field38337 = true;
        this.field38338 = false;
        this.field38328 = field38328;
        this.field38329 = field38329;
    }
    
    public Class9055 method32578(final Set<Class3833> field38330) {
        this.field38330 = field38330;
        return this;
    }
    
    public Class9055 method32579(final Set<BlockState> field38331) {
        this.field38331 = field38331;
        return this;
    }
    
    public Class9055 method32580(final int field38332) {
        this.field38332 = field38332;
        return this;
    }
    
    public Class9055 method32581(final int field38333) {
        this.field38333 = field38333;
        return this;
    }
    
    public Class9055 method32582(final int field38334) {
        this.field38334 = field38334;
        return this;
    }
    
    public Class9055 method32583(final int field38335) {
        this.field38335 = field38335;
        return this;
    }
    
    public Class9055 method32584() {
        this.field38336 = true;
        return this;
    }
    
    public Class9055 method32585() {
        this.field38337 = false;
        return this;
    }
    
    public Class9055 method32586() {
        this.field38338 = true;
        return this;
    }
    
    public Class5144 method32587() {
        return new Class5144(this.field38328, this.field38329, this.field38330, this.field38331, this.field38332, this.field38333, this.field38334, this.field38335, this.field38336, this.field38337, this.field38338, null);
    }
}
