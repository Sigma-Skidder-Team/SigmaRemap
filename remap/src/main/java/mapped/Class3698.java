// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.Gson;

public class Class3698 implements Class3689
{
    private static final Gson field17014;
    private final Class7203 field17015;
    
    public Class3698(final Class7203 field17015) {
        this.field17015 = field17015;
    }
    
    @Override
    public void method11337(final Class8842 class8842) throws IOException {
        final JsonObject jsonObject = new JsonObject();
        for (final Block class8843 : Registry.BLOCK) {
            final ResourceLocation method503 = Registry.BLOCK.getKey(class8843);
            final JsonObject jsonObject2 = new JsonObject();
            final StateContainer<Block, BlockState> method504 = class8843.getStateContainer();
            if (!method504.method32905().isEmpty()) {
                final JsonObject jsonObject3 = new JsonObject();
                for (final IProperty class8844 : method504.method32905()) {
                    final JsonArray jsonArray = new JsonArray();
                    final Iterator iterator3 = class8844.getAllowedValues().iterator();
                    while (iterator3.hasNext()) {
                        jsonArray.add(Util.method27835((IProperty<Comparable>)class8844, iterator3.next()));
                    }
                    jsonObject3.add(class8844.getName(), (JsonElement)jsonArray);
                }
                jsonObject2.add("properties", (JsonElement)jsonObject3);
            }
            final JsonArray jsonArray2 = new JsonArray();
            for (final BlockState class8845 : method504.method32902()) {
                final JsonObject jsonObject4 = new JsonObject();
                final JsonObject jsonObject5 = new JsonObject();
                for (final IProperty class8846 : method504.method32905()) {
                    jsonObject5.addProperty(class8846.getName(), Util.method27835((IProperty<Comparable>)class8846, class8845.get((IProperty<Object>)class8846)));
                }
                if (jsonObject5.size() > 0) {
                    jsonObject4.add("properties", (JsonElement)jsonObject5);
                }
                jsonObject4.addProperty("id", (Number) Block.method11774(class8845));
                if (class8845 == class8843.getDefaultState()) {
                    jsonObject4.addProperty("default", Boolean.valueOf(true));
                }
                jsonArray2.add((JsonElement)jsonObject4);
            }
            jsonObject2.add("states", (JsonElement)jsonArray2);
            jsonObject.add(method503.toString(), (JsonElement)jsonObject2);
        }
        Class3689.method11346(Class3698.field17014, class8842, (JsonElement)jsonObject, this.field17015.method22099().resolve("reports/blocks.json"));
    }
    
    @Override
    public String method11338() {
        return "Block List";
    }
    
    static {
        field17014 = new GsonBuilder().setPrettyPrinting().create();
    }
}
