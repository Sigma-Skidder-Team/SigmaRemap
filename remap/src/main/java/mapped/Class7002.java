// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;

public class Class7002 implements Class7003
{
    private static String[] field27313;
    private long field27314;
    private long field27315;
    private final Object2LongOpenHashMap<String> field27316;
    
    private Class7002() {
        this.field27316 = (Object2LongOpenHashMap<String>)new Object2LongOpenHashMap();
    }
    
    @Override
    public long method21438() {
        return this.field27314;
    }
    
    @Override
    public long method21439() {
        return this.field27315;
    }
    
    @Override
    public Object2LongMap<String> method21440() {
        return (Object2LongMap<String>)Object2LongMaps.unmodifiable((Object2LongMap)this.field27316);
    }
}
