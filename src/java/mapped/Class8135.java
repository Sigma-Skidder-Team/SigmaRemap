// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8135
{
    private static String[] field33516;
    private Boolean field33517;
    private Boolean field33518;
    private Boolean field33519;
    private Boolean field33520;
    private Boolean field33521;
    private Boolean field33522;
    private Boolean field33523;
    private Boolean field33524;
    private Class8172 field33525;
    private Class8172 field33526;
    
    public Class8135() {
        this.field33525 = Class8172.field33663;
        this.field33526 = Class8172.field33663;
    }
    
    public static Class8135 method26811() {
        return new Class8135();
    }
    
    public Class8135 method26812(final Boolean field33517) {
        this.field33517 = field33517;
        return this;
    }
    
    public Class8135 method26813(final Boolean field33524) {
        this.field33524 = field33524;
        return this;
    }
    
    public Class8135 method26814(final Class5754 class5754) {
        this.field33525 = class5754.method17082();
        return this;
    }
    
    public Class9089 method26815() {
        return new Class9089(this.field33517, this.field33518, this.field33519, this.field33520, this.field33521, this.field33522, this.field33523, this.field33524, this.field33525, this.field33526);
    }
}
