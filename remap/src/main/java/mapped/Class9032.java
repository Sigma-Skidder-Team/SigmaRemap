// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.item.ItemStack;

import java.util.Arrays;

public class Class9032
{
    public static final Class9032 field38193;
    private final int field38194;
    private final ResourceLocation[] field38195;
    private final ResourceLocation[] field38196;
    private final Class9360 field38197;
    
    public Class9032(final int field38194, final ResourceLocation[] field38195, final ResourceLocation[] field38196, final Class9360 field38197) {
        this.field38194 = field38194;
        this.field38195 = field38195;
        this.field38196 = field38196;
        this.field38197 = field38197;
    }
    
    public void method32433(final Class513 class513) {
        class513.method2871(this.field38194);
        final Class7529 method32883 = new Class9098(class513.method2940()).method32877(Class6683.field26362, class513).method32877(Class6683.field26367, new BlockPos(class513)).method32873(class513.method2633()).method32883(Class7104.field27717);
        int n = 0;
        final ResourceLocation[] field38195 = this.field38195;
        for (int length = field38195.length, i = 0; i < length; ++i) {
            for (final ItemStack class514 : class513.field3040.method1581().method6402(field38195[i]).method34485(method32883)) {
                if (!class513.method2885(class514)) {
                    final Class427 method32884 = class513.method2822(class514, false);
                    if (method32884 == null) {
                        continue;
                    }
                    method32884.method2115();
                    method32884.method2110(class513.method1865());
                }
                else {
                    class513.world.method6706(null, class513.getPosX(), class513.getPosY(), class513.getPosZ(), Class8520.field35327, Class286.field1585, 0.2f, ((class513.method2633().nextFloat() - class513.method2633().nextFloat()) * 0.7f + 1.0f) * 2.0f);
                    n = 1;
                }
            }
        }
        if (n != 0) {
            class513.field3008.method10876();
        }
        if (this.field38196.length > 0) {
            class513.method2863(this.field38196);
        }
        this.field38197.method34708(class513.field3040.method1567()).ifPresent(class517 -> class515.method1567().method6508(class517, class516.method1924().method23240().method23241(2)));
    }
    
    @Override
    public String toString() {
        return "AdvancementRewards{experience=" + this.field38194 + ", loot=" + Arrays.toString(this.field38195) + ", recipes=" + Arrays.toString(this.field38196) + ", function=" + this.field38197 + '}';
    }
    
    public JsonElement method32434() {
        if (this != Class9032.field38193) {
            final JsonObject jsonObject = new JsonObject();
            if (this.field38194 != 0) {
                jsonObject.addProperty("experience", (Number)this.field38194);
            }
            if (this.field38195.length > 0) {
                final JsonArray jsonArray = new JsonArray();
                final ResourceLocation[] field38195 = this.field38195;
                for (int length = field38195.length, i = 0; i < length; ++i) {
                    jsonArray.add(field38195[i].toString());
                }
                jsonObject.add("loot", (JsonElement)jsonArray);
            }
            if (this.field38196.length > 0) {
                final JsonArray jsonArray2 = new JsonArray();
                final ResourceLocation[] field38196 = this.field38196;
                for (int length2 = field38196.length, j = 0; j < length2; ++j) {
                    jsonArray2.add(field38196[j].toString());
                }
                jsonObject.add("recipes", (JsonElement)jsonArray2);
            }
            if (this.field38197.method34709() != null) {
                jsonObject.addProperty("function", this.field38197.method34709().toString());
            }
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field38193 = new Class9032(0, new ResourceLocation[0], new ResourceLocation[0], Class9360.field40145);
    }
}
