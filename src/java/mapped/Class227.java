// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class227
{
    field800(Boolean.TRUE), 
    field801(Boolean.FALSE), 
    field802((Boolean)null);
    
    private Boolean field803;
    
    private Class227(final Boolean field803) {
        this.field803 = field803;
    }
    
    public Boolean method856() {
        return this.field803;
    }
    
    @Override
    public String toString() {
        return "Flow style: '" + this.field803 + "'";
    }
}
