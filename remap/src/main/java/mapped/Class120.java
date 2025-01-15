// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import java.util.Spliterator;
import java.util.stream.StreamSupport;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Comparator;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.function.Predicate;

public final class Class120 implements Predicate<ItemStack>
{
    private static final Predicate<? super Class7452> field373;
    public static final Class120 field374;
    private final Class7452[] field375;
    private ItemStack[] field376;
    private IntList field377;
    
    private Class120(final Stream<? extends Class7452> stream) {
        this.field375 = stream.filter(Class120.field373).toArray(Class7452[]::new);
    }
    
    public ItemStack[] method611() {
        this.method612();
        return this.field376;
    }
    
    private void method612() {
        if (this.field376 == null) {
            this.field376 = Arrays.stream(this.field375).flatMap(class7452 -> class7452.method22938().stream()).distinct().toArray(ItemStack[]::new);
        }
    }
    
    @Override
    public boolean test(final ItemStack class8321) {
        if (class8321 == null) {
            return false;
        }
        if (this.field375.length != 0) {
            this.method612();
            final ItemStack[] field376 = this.field376;
            for (int length = field376.length, i = 0; i < length; ++i) {
                if (field376[i].method27622() == class8321.method27622()) {
                    return true;
                }
            }
            return false;
        }
        return class8321.method27620();
    }
    
    public IntList method613() {
        if (this.field377 == null) {
            this.method612();
            this.field377 = (IntList)new IntArrayList(this.field376.length);
            final ItemStack[] field376 = this.field376;
            for (int length = field376.length, i = 0; i < length; ++i) {
                this.field377.add(Class5024.method15245(field376[i]));
            }
            this.field377.sort((Comparator)IntComparators.NATURAL_COMPARATOR);
        }
        return this.field377;
    }
    
    public void method614(final Class8654 class8654) {
        this.method612();
        class8654.method29505(this.field376.length);
        for (int i = 0; i < this.field376.length; ++i) {
            class8654.method29509(this.field376[i]);
        }
    }
    
    public JsonElement method615() {
        if (this.field375.length != 1) {
            final JsonArray jsonArray = new JsonArray();
            final Class7452[] field375 = this.field375;
            for (int length = field375.length, i = 0; i < length; ++i) {
                jsonArray.add((JsonElement)field375[i].method22939());
            }
            return (JsonElement)jsonArray;
        }
        return (JsonElement)this.field375[0].method22939();
    }
    
    public boolean method616() {
        if (this.field375.length == 0) {
            if (this.field376 == null || this.field376.length == 0) {
                if (this.field377 == null || this.field377.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static Class120 method617(final Stream<? extends Class7452> stream) {
        final Class120 class120 = new Class120(stream);
        return (class120.field375.length != 0) ? class120 : Class120.field374;
    }
    
    public static Class120 method618(final Class3832... array) {
        return method617(Arrays.stream(array).map(class3832 -> {
            new Class7453(new ItemStack(class3832), null);
            return;
        }));
    }
    
    public static Class120 method619(final ItemStack... array) {
        return method617(Arrays.stream(array).map(class8321 -> new Class7453(class8321, null)));
    }
    
    public static Class120 method620(final Class7909<Class3820> class7909) {
        return method617(Stream.of(new Class7451(class7909, null)));
    }
    
    public static Class120 method621(final Class8654 class8654) {
        return method617((Stream<? extends Class7452>)Stream.generate(() -> new Class7453(class8655.method29511(), null)).limit(class8654.method29501()));
    }
    
    public static Class120 method622(final JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            throw new JsonSyntaxException("Item cannot be null");
        }
        if (jsonElement.isJsonObject()) {
            return method617(Stream.of(method623(jsonElement.getAsJsonObject())));
        }
        if (!jsonElement.isJsonArray()) {
            throw new JsonSyntaxException("Expected item to be object or array of objects");
        }
        final JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() != 0) {
            return method617((Stream<? extends Class7452>)StreamSupport.stream((Spliterator<Object>)asJsonArray.spliterator(), false).map(jsonElement2 -> method623(Class9583.method35913(jsonElement2, "item"))));
        }
        throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
    }
    
    public static Class7452 method623(final JsonObject jsonObject) {
        if (jsonObject.has("item") && jsonObject.has("tag")) {
            throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
        }
        if (jsonObject.has("item")) {
            return new Class7453(new ItemStack(Class90.field211.method506(new Class1932(Class9583.method35895(jsonObject, "item"))).orElseThrow(() -> {
                new JsonSyntaxException("Unknown item '" + obj2 + "'");
                return;
            })), null);
        }
        if (!jsonObject.has("tag")) {
            throw new JsonParseException("An ingredient entry needs either a tag or an item");
        }
        final Class1932 obj = new Class1932(Class9583.method35895(jsonObject, "tag"));
        final Class7909<Class3820> method18460 = Class7855.method25402().method18460(obj);
        if (method18460 != null) {
            return new Class7451(method18460, null);
        }
        throw new JsonSyntaxException("Unknown item tag '" + obj + "'");
    }
    
    static {
        field373 = (class7452 -> !class7452.method22938().stream().allMatch(ItemStack::method27620));
        field374 = new Class120(Stream.empty());
    }
}
