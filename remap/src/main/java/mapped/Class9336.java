// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class9336
{
    private final ResourceLocation field40089;
    private int field40090;
    private int field40091;
    private final Class8637 field40092;
    private double field40093;
    
    public Class9336(final ResourceLocation field40089, final int field40090, final int field40091, final Class8637 field40092) {
        this.field40093 = 1.0;
        this.field40089 = field40089;
        this.field40090 = field40090;
        this.field40091 = field40091;
        this.field40092 = field40092;
    }
    
    public ResourceLocation method34591() {
        return this.field40089;
    }
    
    public int method34592() {
        return this.field40090;
    }
    
    public int method34593() {
        return this.field40091;
    }
    
    public void method34594(final int field40090) {
        this.field40090 = field40090;
    }
    
    public void method34595(final int field40091) {
        this.field40091 = field40091;
    }
    
    public Class8637 method34596() {
        return this.field40092;
    }
    
    public double method34597() {
        return this.field40093;
    }
    
    public void method34598(final double field40093) {
        this.field40093 = field40093;
    }
    
    @Override
    public String toString() {
        return "" + this.field40089 + ", width: " + this.field40090 + ", height: " + this.field40091 + ", frames: " + this.field40092.method29306() + ", scale: " + this.field40093;
    }
}
