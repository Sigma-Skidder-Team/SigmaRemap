// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class Class3442
{
    private static String[] field16260;
    private final Class9226 field16261;
    public final SortedMap<Class6332, Class4148> field16262;
    private final Class7808 field16263;
    private final Class7808 field16264;
    private final Class7809 field16265;
    
    public Class3442() {
        this.field16261 = new Class9226();
        this.field16262 = Util.method27851((SortedMap<Class6332, Class4148>)new Object2ObjectLinkedOpenHashMap(), object2ObjectLinkedOpenHashMap -> {
            object2ObjectLinkedOpenHashMap.put((Object)Class8752.method30263(), (Object)this.field16261.method34024(Class6332.method18761()));
            object2ObjectLinkedOpenHashMap.put((Object)Class8752.method30264(), (Object)this.field16261.method34024(Class6332.method18763()));
            object2ObjectLinkedOpenHashMap.put((Object)Class8752.method30257(), (Object)this.field16261.method34024(Class6332.method18762()));
            object2ObjectLinkedOpenHashMap.put((Object)Class8752.method30265(), (Object)this.field16261.method34024(Class6332.method18765()));
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class8752.method30258());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class8752.method30259());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class8752.method30260());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class8752.method30261());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class8752.method30262());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class6332.method18766());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class6332.method18784());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class6332.method18785());
            method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap, Class6332.method18782());
            Class7637.field30247.forEach(class6332 -> method11004((Object2ObjectLinkedOpenHashMap<Class6332, Class4148>)object2ObjectLinkedOpenHashMap2, class6332));
            return;
        });
        this.field16263 = Class7807.method25213(this.field16262, new Class4148(256));
        this.field16264 = Class7807.method25212(new Class4148(256));
        this.field16265 = new Class7809(this.field16263);
    }
    
    private static void method11004(final Object2ObjectLinkedOpenHashMap<Class6332, Class4148> object2ObjectLinkedOpenHashMap, final Class6332 class6332) {
        object2ObjectLinkedOpenHashMap.put((Object)class6332, (Object)new Class4148(class6332.method18796()));
    }
    
    public Class9226 method11005() {
        return this.field16261;
    }
    
    public Class7808 method11006() {
        return this.field16263;
    }
    
    public Class7808 method11007() {
        return this.field16264;
    }
    
    public Class7809 method11008() {
        return this.field16265;
    }
}
