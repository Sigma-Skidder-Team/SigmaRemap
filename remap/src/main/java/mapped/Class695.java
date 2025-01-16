// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.util.math.MathHelper;

public class Class695 extends Screen
{
    private final Class6461 field3823;
    private long field3824;
    private static final Object2IntMap<ChunkStatus> field3825;
    
    public Class695(final Class6461 field3823) {
        super(NarratorChatListener.EMPTY);
        this.field3824 = -1L;
        this.field3823 = field3823;
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public void removed() {
        NarratorChatListener.field32404.method25556(Class8822.method30773("narrator.loading.done", new Object[0]));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        final String string = MathHelper.method35651(this.field3823.method19326(), 0, 100) + "%";
        final long method27837 = Util.method27837();
        if (method27837 - this.field3824 > 2000L) {
            this.field3824 = method27837;
            NarratorChatListener.field32404.method25556(new Class2259("narrator.loading", new Object[] { string }).getString());
        }
        final int n4 = this.width / 2;
        final int n5 = this.height / 2;
        method3881(this.field3823, n4, n5 + 30, 2, 0);
        this.method3295(this.font, string, n4, n5 - 4 - 30, 16777215);
    }
    
    public static void method3881(final Class6461 class6461, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n3 + n4;
        final int n6 = class6461.method19324() * n5 - n4;
        final int method19325 = class6461.method19325();
        final int n7 = method19325 * n5 - n4;
        final int n8 = n - n7 / 2;
        final int n9 = n2 - n7 / 2;
        final int n10 = n6 / 2 + 1;
        if (n4 != 0) {
            Class565.method3293(n - n10, n2 - n10, n - n10 + 1, n2 + n10, -16772609);
            Class565.method3293(n + n10 - 1, n2 - n10, n + n10, n2 + n10, -16772609);
            Class565.method3293(n - n10, n2 - n10, n + n10, n2 - n10 + 1, -16772609);
            Class565.method3293(n - n10, n2 + n10 - 1, n + n10, n2 + n10, -16772609);
        }
        for (int i = 0; i < method19325; ++i) {
            for (int j = 0; j < method19325; ++j) {
                final ChunkStatus method19326 = class6461.method19327(i, j);
                final int n11 = n8 + i * n5;
                final int n12 = n9 + j * n5;
                Class565.method3293(n11, n12, n11 + n3, n12 + n3, Class695.field3825.getInt((Object)method19326) | 0xFF000000);
            }
        }
    }
    
    static {
        field3825 = Util.method27851((Object2IntMap)new Object2IntOpenHashMap(), object2IntOpenHashMap -> {
            object2IntOpenHashMap.defaultReturnValue(0);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39977, 5526612);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39978, 10066329);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39979, 6250897);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39980, 8434258);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39981, 13750737);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39982, 7497737);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39983, 7169628);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39984, 3159410);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39985, 2213376);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39986, 13421772);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39987, 15884384);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39988, 15658734);
            object2IntOpenHashMap.put((Object) ChunkStatus.field39989, 16777215);
        });
    }
}
