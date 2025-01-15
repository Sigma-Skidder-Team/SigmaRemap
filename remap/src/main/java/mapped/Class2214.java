// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2214
{
    field13594((class6997, class6998, class6999, class7000) -> class6999), 
    field13595((class6997, class6998, class6999, class7000) -> {
        if (class6998.getX() != class6997.minX) {
            if (class6998.getX() != class6997.maxX) {
                if (class6998.getY() != class6997.minY) {
                    if (class6998.getY() != class6997.maxY) {
                        if (class6998.getZ() != class6997.minZ) {
                            if (class6998.getZ() != class6997.maxZ) {
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return class6999;
    }), 
    field13596((class6997, class6998, class6999, class7000) -> {
        if (class6998.getX() != class6997.minX) {
            if (class6998.getX() != class6997.maxX) {
                if (class6998.getY() != class6997.minY) {
                    if (class6998.getY() != class6997.maxY) {
                        if (class6998.getZ() != class6997.minZ) {
                            if (class6998.getZ() != class6997.maxZ) {
                                return Class8232.method27284();
                            }
                        }
                    }
                }
            }
        }
        return class6999;
    }), 
    field13597((class6997, class6998, class6999, class7000) -> {
        class7000.method7149(class6998, true);
        return class6999;
    });
    
    public final Class7415 field13598;
    
    private Class2214(final Class7415 field13598) {
        this.field13598 = field13598;
    }
}
