// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class7939 implements Class7938
{
    private final Class1728 field32614;
    
    public Class7939() {
        this.field32614 = new Class1728(new String[] { "minecraft" });
    }
    
    @Override
    public <T extends Class1921> void method25739(final Map<String, T> map, final Class6712<T> class6712) {
        final Class1921 method7615 = Class1921.method7615("vanilla", false, () -> this.field32614, class6712, Class2043.field11643);
        if (method7615 != null) {
            map.put("vanilla", (T)method7615);
        }
    }
}
