// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

public class Class7264
{
    private static String[] field28140;
    public final Int2ObjectMap<Class1933> field28141;
    private final Int2ObjectMap<Class6313> field28142;
    private final Class1790 field28143;
    
    public Class7264(final Class1790 field28143) {
        this.field28141 = (Int2ObjectMap<Class1933>)new Int2ObjectOpenHashMap(256);
        this.field28142 = (Int2ObjectMap<Class6313>)new Int2ObjectOpenHashMap(256);
        this.field28143 = field28143;
    }
    
    public Class1912 method22204(final Class3832 class3832) {
        return this.method22205(new ItemStack(class3832));
    }
    
    public Class1912 method22205(final ItemStack class8321) {
        final Class6313 method22206 = this.method22206(class8321);
        return (method22206 == this.field28143.method6452() && class8321.method27622() instanceof Class4036) ? this.field28143.method6453().method35427(((Class4036)class8321.method27622()).method12240().method11878()) : method22206.method18696();
    }
    
    public Class6313 method22206(final ItemStack class8321) {
        final Class6313 method22207 = this.method22207(class8321.method27622());
        return (method22207 != null) ? method22207 : this.field28143.method6452();
    }
    
    @Nullable
    public Class6313 method22207(final Class3820 class3820) {
        return (Class6313)this.field28142.get(method22208(class3820));
    }
    
    private static int method22208(final Class3820 class3820) {
        return Class3820.method11696(class3820);
    }
    
    public void method22209(final Class3820 class3820, final Class1933 class3821) {
        this.field28141.put(method22208(class3820), (Object)class3821);
    }
    
    public Class1790 method22210() {
        return this.field28143;
    }
    
    public void method22211() {
        this.field28142.clear();
        for (final Map.Entry<Integer, V> entry : this.field28141.entrySet()) {
            this.field28142.put(Integer.valueOf(entry.getKey()), (Object)this.field28143.method6451((Class1933)entry.getValue()));
        }
    }
}
