// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.ArrayUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import java.util.Arrays;
import java.util.Iterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import java.util.function.Function;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class6056
{
    private ResourceLocation field24612;
    private Class8863 field24613;
    private Class7339 field24614;
    private Class9032 field24615;
    private Map<String, Class8832> field24616;
    private String[][] field24617;
    private Class6526 field24618;
    
    private Class6056(final ResourceLocation field24612, final Class7339 field24613, final Class9032 field24614, final Map<String, Class8832> field24615, final String[][] field24616) {
        this.field24615 = Class9032.field38193;
        this.field24616 = Maps.newLinkedHashMap();
        this.field24618 = Class6526.field25975;
        this.field24612 = field24612;
        this.field24614 = field24613;
        this.field24615 = field24614;
        this.field24616 = field24615;
        this.field24617 = field24616;
    }
    
    private Class6056() {
        this.field24615 = Class9032.field38193;
        this.field24616 = Maps.newLinkedHashMap();
        this.field24618 = Class6526.field25975;
    }
    
    public static Class6056 method18001() {
        return new Class6056();
    }
    
    public Class6056 method18002(final Class8863 field24613) {
        this.field24613 = field24613;
        return this;
    }
    
    public Class6056 method18003(final ResourceLocation field24612) {
        this.field24612 = field24612;
        return this;
    }
    
    public Class6056 method18004(final ItemStack class8321, final ITextComponent class8322, final ITextComponent class8323, final ResourceLocation class8324, final Class1993 class8325, final boolean b, final boolean b2, final boolean b3) {
        return this.method18006(new Class7339(class8321, class8322, class8323, class8324, class8325, b, b2, b3));
    }
    
    public Class6056 method18005(final Class3832 class3832, final ITextComponent class3833, final ITextComponent class3834, final ResourceLocation class3835, final Class1993 class3836, final boolean b, final boolean b2, final boolean b3) {
        return this.method18006(new Class7339(new ItemStack(class3832.method11704()), class3833, class3834, class3835, class3836, b, b2, b3));
    }
    
    public Class6056 method18006(final Class7339 field24614) {
        this.field24614 = field24614;
        return this;
    }
    
    public Class6056 method18007(final Class6467 class6467) {
        return this.method18008(class6467.method19357());
    }
    
    public Class6056 method18008(final Class9032 field24615) {
        this.field24615 = field24615;
        return this;
    }
    
    public Class6056 method18009(final String s, final Class4220 class4220) {
        return this.method18010(s, new Class8832(class4220));
    }
    
    public Class6056 method18010(final String str, final Class8832 class8832) {
        if (!this.field24616.containsKey(str)) {
            this.field24616.put(str, class8832);
            return this;
        }
        throw new IllegalArgumentException("Duplicate criterion " + str);
    }
    
    public Class6056 method18011(final Class6526 field24618) {
        this.field24618 = field24618;
        return this;
    }
    
    public boolean method18012(final Function<ResourceLocation, Class8863> function) {
        if (this.field24612 != null) {
            if (this.field24613 == null) {
                this.field24613 = function.apply(this.field24612);
            }
            return this.field24613 != null;
        }
        return true;
    }
    
    public Class8863 method18013(final ResourceLocation class1932) {
        if (this.method18012(p0 -> null)) {
            if (this.field24617 == null) {
                this.field24617 = this.field24618.method19745(this.field24616.keySet());
            }
            return new Class8863(class1932, this.field24613, this.field24614, this.field24615, this.field24616, this.field24617);
        }
        throw new IllegalStateException("Tried to build incomplete advancement!");
    }
    
    public Class8863 method18014(final Consumer<Class8863> consumer, final String s) {
        final Class8863 method18013 = this.method18013(new ResourceLocation(s));
        consumer.accept(method18013);
        return method18013;
    }
    
    public JsonObject method18015() {
        if (this.field24617 == null) {
            this.field24617 = this.field24618.method19745(this.field24616.keySet());
        }
        final JsonObject jsonObject = new JsonObject();
        if (this.field24613 == null) {
            if (this.field24612 != null) {
                jsonObject.addProperty("parent", this.field24612.toString());
            }
        }
        else {
            jsonObject.addProperty("parent", this.field24613.method31042().toString());
        }
        if (this.field24614 != null) {
            jsonObject.add("display", this.field24614.method22541());
        }
        jsonObject.add("rewards", this.field24615.method32434());
        final JsonObject jsonObject2 = new JsonObject();
        for (final Map.Entry<String, V> entry : this.field24616.entrySet()) {
            jsonObject2.add((String)entry.getKey(), ((Class8832)entry.getValue()).method30845());
        }
        jsonObject.add("criteria", (JsonElement)jsonObject2);
        final JsonArray jsonArray = new JsonArray();
        for (final String[] array : this.field24617) {
            final JsonArray jsonArray2 = new JsonArray();
            final String[] array2 = array;
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                jsonArray2.add(array2[j]);
            }
            jsonArray.add((JsonElement)jsonArray2);
        }
        jsonObject.add("requirements", (JsonElement)jsonArray);
        return jsonObject;
    }
    
    public void method18016(final PacketBuffer class8654) {
        if (this.field24612 != null) {
            class8654.writeBoolean(true);
            class8654.method29517(this.field24612);
        }
        else {
            class8654.writeBoolean(false);
        }
        if (this.field24614 != null) {
            class8654.writeBoolean(true);
            this.field24614.method22539(class8654);
        }
        else {
            class8654.writeBoolean(false);
        }
        Class8832.method30843(this.field24616, class8654);
        class8654.writeVarInt(this.field24617.length);
        for (final String[] array : this.field24617) {
            class8654.writeVarInt(array.length);
            final String[] array2 = array;
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                class8654.method29514(array2[j]);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Task Advancement{parentId=" + this.field24612 + ", display=" + this.field24614 + ", rewards=" + this.field24615 + ", criteria=" + this.field24616 + ", requirements=" + Arrays.deepToString(this.field24617) + '}';
    }
    
    public static Class6056 method18017(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        final ResourceLocation class1932 = jsonObject.has("parent") ? new ResourceLocation(Class9583.method35895(jsonObject, "parent")) : null;
        final Class7339 class1933 = jsonObject.has("display") ? Class7339.method22537(Class9583.method35914(jsonObject, "display"), jsonDeserializationContext) : null;
        final Class9032 class1934 = Class9583.method35921(jsonObject, "rewards", Class9032.field38193, jsonDeserializationContext, Class9032.class);
        final Map<String, Class8832> method30841 = Class8832.method30841(Class9583.method35914(jsonObject, "criteria"), jsonDeserializationContext);
        if (!method30841.isEmpty()) {
            final JsonArray method30842 = Class9583.method35918(jsonObject, "requirements", new JsonArray());
            String[][] array = new String[method30842.size()][];
            for (int i = 0; i < method30842.size(); ++i) {
                final JsonArray method30843 = Class9583.method35916(method30842.get(i), "requirements[" + i + "]");
                array[i] = new String[method30843.size()];
                for (int j = 0; j < method30843.size(); ++j) {
                    array[i][j] = Class9583.method35894(method30843.get(j), "requirements[" + i + "][" + j + "]");
                }
            }
            if (array.length == 0) {
                array = new String[method30841.size()][];
                int n = 0;
                final Iterator iterator = method30841.keySet().iterator();
                while (iterator.hasNext()) {
                    array[n++] = new String[] { (String)iterator.next() };
                }
            }
            for (final String[] array3 : array) {
                if (array3.length == 0 && method30841.isEmpty()) {
                    throw new JsonSyntaxException("Requirement entry cannot be empty");
                }
                for (final String str : array3) {
                    if (!method30841.containsKey(str)) {
                        throw new JsonSyntaxException("Unknown required criterion '" + str + "'");
                    }
                }
            }
            for (final String str2 : method30841.keySet()) {
                int n2 = 0;
                final String[][] array5 = array;
                for (int length3 = array5.length, n3 = 0; n3 < length3; ++n3) {
                    if (ArrayUtils.contains((Object[])array5[n3], (Object)str2)) {
                        n2 = 1;
                        break;
                    }
                }
                if (n2 != 0) {
                    continue;
                }
                throw new JsonSyntaxException("Criterion '" + str2 + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required.");
            }
            return new Class6056(class1932, class1933, class1934, method30841, array);
        }
        throw new JsonSyntaxException("Advancement criteria cannot be empty");
    }
    
    public static Class6056 method18018(final PacketBuffer class8654) {
        final ResourceLocation class8655 = class8654.readBoolean() ? class8654.method29516() : null;
        final Class7339 class8656 = class8654.readBoolean() ? Class7339.method22540(class8654) : null;
        final Map<String, Class8832> method30842 = Class8832.method30842(class8654);
        final String[][] array = new String[class8654.readVarInt()][];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new String[class8654.readVarInt()];
            for (int j = 0; j < array[i].length; ++j) {
                array[i][j] = class8654.method29513(32767);
            }
        }
        return new Class6056(class8655, class8656, Class9032.field38193, method30842, array);
    }
    
    public Map<String, Class8832> method18019() {
        return this.field24616;
    }
}
