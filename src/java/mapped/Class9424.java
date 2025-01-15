// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class9424<T extends Class8117<T>>
{
    private static String[] field40423;
    private final String field40424;
    
    public Class9424(final String field40424) {
        this.field40424 = field40424;
    }
    
    @Override
    public String toString() {
        return this.field40424;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class9424 && ((Class9424)o).field40424.equals(this.field40424));
    }
    
    @Override
    public int hashCode() {
        return this.field40424.hashCode();
    }
    
    public String method35022() {
        return this.field40424;
    }
}
