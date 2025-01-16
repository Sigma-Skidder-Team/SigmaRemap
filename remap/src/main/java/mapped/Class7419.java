// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7419 implements Class7420
{
    @Override
    public CompoundNBT method22833(final String s, final CompoundNBT class51) {
        return s.startsWith("data/minecraft/structures/") ? method22835(method22834(class51)) : class51;
    }
    
    private static CompoundNBT method22834(final CompoundNBT class51) {
        if (!class51.contains("DataVersion", 99)) {
            class51.putInt("DataVersion", 500);
        }
        return class51;
    }
    
    private static CompoundNBT method22835(final CompoundNBT class51) {
        final Class6585 class52 = new Class6585();
        class52.method19969(Class9346.method34651(Class5494.method16768(), Class1959.field10680, class51, class51.getInt("DataVersion")));
        return class52.method19968(new CompoundNBT());
    }
}
