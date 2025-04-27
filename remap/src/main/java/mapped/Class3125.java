// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.EntityType;

public final class Class3125 extends Biome
{
    private static String[] field15487;
    
    public Class3125() {
        super(new Class8927().method31462(Class6032.field24552, Class6032.field24551).method31464(Class2145.field12628).method31465(Class2140.field12593).method31466(0.1f).method31467(0.2f).method31468(0.5f).method31469(0.5f).method31470(4159204).method31471(329011).method31472(null));
        this.method9849(Class2108.field12225, Class4535.field20004.method13527(new Class5143(false, ImmutableList.of(), null)).method28610(Class7133.field27782.method21889(Class6926.field27145)));
        Class9218.method34000(this);
        this.method9839(Class1976.field10948, new Class6828(EntityType.field28977, 10, 4, 4));
    }
    
    @Override
    public int method9838() {
        return 0;
    }
}
