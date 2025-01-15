// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.GsonBuilder;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import org.apache.logging.log4j.LogManager;

import java.lang.reflect.Type;
import java.util.Collection;
import javax.annotation.Nullable;
import java.util.HashMap;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.util.Map;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class1781 extends Class1779
{
    private static final Logger field9879;
    private static final Gson field9886;
    private Class6518 field9887;
    
    public Class1781() {
        super(Class1781.field9886, "advancements");
        this.field9887 = new Class6518();
    }
    
    public void method6377(final Map<Class1932, JsonObject> map, final Class6582 class6582, final IProfiler class6583) {
        final HashMap hashMap = Maps.newHashMap();
        map.forEach((class6585, jsonObject) -> {
            try {
                map2.put(class6585, Class1781.field9886.fromJson((JsonElement)jsonObject, (Class)Class6056.class));
            }
            catch (final IllegalArgumentException | JsonParseException ex) {
                Class1781.field9879.error("Parsing error loading custom advancement {}: {}", (Object)class6585, (Object)((Throwable)ex).getMessage());
            }
            return;
        });
        final Class6518 field9887 = new Class6518();
        field9887.method19671(hashMap);
        for (final Class8863 class6584 : field9887.method19673()) {
            if (class6584.method31036() == null) {
                continue;
            }
            Class6309.method18682(class6584);
        }
        this.field9887 = field9887;
    }
    
    @Nullable
    public Class8863 method6398(final Class1932 class1932) {
        return this.field9887.method19675(class1932);
    }
    
    public Collection<Class8863> method6399() {
        return this.field9887.method19674();
    }
    
    static {
        field9879 = LogManager.getLogger();
        field9886 = new GsonBuilder().registerTypeHierarchyAdapter((Class)Class6056.class, (Object)((jsonElement, type, jsonDeserializationContext) -> Class6056.method18017(Class9583.method35913(jsonElement, "advancement"), jsonDeserializationContext))).registerTypeAdapter((Type)Class9032.class, (Object)new Class5992()).registerTypeHierarchyAdapter((Class) ITextComponent.class, (Object)new Class5953()).registerTypeHierarchyAdapter((Class) Style.class, (Object)new Class5982()).registerTypeAdapterFactory((TypeAdapterFactory)new Class8818()).create();
    }
}
