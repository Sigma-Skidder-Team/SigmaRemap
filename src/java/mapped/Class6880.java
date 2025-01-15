// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public abstract class Class6880
{
    private final UUID field26955;
    public Class2250 field26956;
    public float field26957;
    public Class2200 field26958;
    public Class342 field26959;
    public boolean field26960;
    public boolean field26961;
    public boolean field26962;
    
    public Class6880(final UUID field26955, final Class2250 field26956, final Class2200 field26957, final Class342 field26958) {
        this.field26955 = field26955;
        this.field26956 = field26956;
        this.field26958 = field26957;
        this.field26959 = field26958;
        this.field26957 = 1.0f;
    }
    
    public UUID method21075() {
        return this.field26955;
    }
    
    public Class2250 method21076() {
        return this.field26956;
    }
    
    public void method21070(final Class2250 field26956) {
        this.field26956 = field26956;
    }
    
    public float method21077() {
        return this.field26957;
    }
    
    public void method21064(final float field26957) {
        this.field26957 = field26957;
    }
    
    public Class2200 method21078() {
        return this.field26958;
    }
    
    public void method21065(final Class2200 field26958) {
        this.field26958 = field26958;
    }
    
    public Class342 method21079() {
        return this.field26959;
    }
    
    public void method21066(final Class342 field26959) {
        this.field26959 = field26959;
    }
    
    public boolean method21080() {
        return this.field26960;
    }
    
    public Class6880 method21067(final boolean field26960) {
        this.field26960 = field26960;
        return this;
    }
    
    public boolean method21081() {
        return this.field26961;
    }
    
    public Class6880 method21068(final boolean field26961) {
        this.field26961 = field26961;
        return this;
    }
    
    public Class6880 method21069(final boolean field26962) {
        this.field26962 = field26962;
        return this;
    }
    
    public boolean method21082() {
        return this.field26962;
    }
}
