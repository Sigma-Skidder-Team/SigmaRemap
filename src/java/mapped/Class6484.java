// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public class Class6484 extends Class6483
{
    private static String[] field25842;
    
    @Override
    public void method19517(final Class6108 class6108, final UUID uuid) {
        if (class6108.method18208(Class6650.class)) {
            final Class6650 class6109 = class6108.method18207(Class6650.class);
            if (class6109.method20205() != null) {
                class6109.method20205().add(uuid);
            }
        }
    }
    
    @Override
    public void method19518(final Class6108 class6108, final UUID uuid) {
        if (class6108.method18208(Class6650.class)) {
            final Class6650 class6109 = class6108.method18207(Class6650.class);
            if (class6109.method20205() != null) {
                class6109.method20205().remove(uuid);
            }
        }
    }
}
