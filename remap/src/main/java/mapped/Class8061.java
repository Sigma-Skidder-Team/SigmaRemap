// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import com.google.common.collect.ImmutableList;

public class Class8061
{
    private static String[] field33204;
    private final String field33205;
    private final ImmutableList<Class1948> field33206;
    
    public static Class8061 method26447(final String s) {
        return Registry.field212.getOrDefault(ResourceLocation.method7795(s));
    }
    
    public Class8061(final Class1948... array) {
        this(null, array);
    }
    
    public Class8061(final String field33205, final Class1948... array) {
        this.field33205 = field33205;
        this.field33206 = (ImmutableList<Class1948>)ImmutableList.copyOf((Object[])array);
    }
    
    public String method26448(final String str) {
        return str + ((this.field33205 != null) ? this.field33205 : Registry.field212.getKey(this).method7797());
    }
    
    public List<Class1948> method26449() {
        return this.field33206;
    }
    
    public boolean method26450() {
        if (!this.field33206.isEmpty()) {
            final UnmodifiableIterator iterator = this.field33206.iterator();
            while (iterator.hasNext()) {
                if (!((Class1948) iterator.next()).method7906().method16453()) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}
