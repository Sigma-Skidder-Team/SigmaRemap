// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashBiMap;
import javax.annotation.Nullable;
import java.util.function.Consumer;
import com.google.common.collect.BiMap;

public class Class7104
{
    private static final BiMap<ResourceLocation, Class8212> field27709;
    public static final Class8212 field27710;
    public static final Class8212 field27711;
    public static final Class8212 field27712;
    public static final Class8212 field27713;
    public static final Class8212 field27714;
    public static final Class8212 field27715;
    public static final Class8212 field27716;
    public static final Class8212 field27717;
    public static final Class8212 field27718;
    public static final Class8212 field27719;
    
    private static Class8212 method21809(final String s, final Consumer<Class7724> consumer) {
        final Class7724 class7724 = new Class7724();
        consumer.accept(class7724);
        final Class8212 method24661 = class7724.method24661();
        final ResourceLocation obj = new ResourceLocation(s);
        if (Class7104.field27709.put((Object)obj, (Object)method24661) == null) {
            return method24661;
        }
        throw new IllegalStateException("Loot table parameter set " + obj + " is already registered");
    }
    
    @Nullable
    public static Class8212 method21810(final ResourceLocation class1932) {
        return Class7104.field27709.get(class1932);
    }
    
    @Nullable
    public static ResourceLocation method21811(final Class8212 class8212) {
        return Class7104.field27709.inverse().get(class8212);
    }
    
    static {
        field27709 = HashBiMap.create();
        field27710 = method21809("empty", p0 -> {});
        field27711 = method21809("chest", class7724 -> class7724.method24659(Class6683.field26367).method24660(Class6683.field26362));
        field27712 = method21809("command", class7725 -> class7725.method24659(Class6683.field26367).method24660(Class6683.field26362));
        field27713 = method21809("selector", class7726 -> class7726.method24659(Class6683.field26367).method24659(Class6683.field26362));
        field27714 = method21809("fishing", class7727 -> class7727.method24659(Class6683.field26367).method24659(Class6683.field26370));
        field27715 = method21809("entity", class7728 -> class7728.method24659(Class6683.field26362).method24659(Class6683.field26367).method24659(Class6683.field26364).method24660(Class6683.field26365).method24660(Class6683.field26366).method24660(Class6683.field26363));
        field27716 = method21809("gift", class7729 -> class7729.method24659(Class6683.field26367).method24659(Class6683.field26362));
        field27717 = method21809("advancement_reward", class7730 -> class7730.method24659(Class6683.field26362).method24659(Class6683.field26367));
        field27718 = method21809("generic", class7731 -> class7731.method24659(Class6683.field26362).method24659(Class6683.field26363).method24659(Class6683.field26364).method24659(Class6683.field26365).method24659(Class6683.field26366).method24659(Class6683.field26367).method24659(Class6683.field26368).method24659(Class6683.field26369).method24659(Class6683.field26370).method24659(Class6683.field26371));
        field27719 = method21809("block", class7732 -> class7732.method24659(Class6683.field26368).method24659(Class6683.field26367).method24659(Class6683.field26370).method24660(Class6683.field26362).method24660(Class6683.field26369).method24660(Class6683.field26371));
    }
}
