// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class2738 extends Class2466
{
    public final /* synthetic */ Class3012 field14922;
    
    public Class2738(final Class3012 field14922) {
        this.field14922 = field14922;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6651 class8700 = class8699.method29841().method18207(Class6651.class);
        final String s = class8699.method29818(Class5260.field22308, 0);
        try {
            Object o = Class8557.method28750().fromJson(s, (Class)JsonElement.class);
            int intValue = 0;
            JsonObject asJsonObject;
            if (((JsonElement)o).isJsonObject()) {
                if (((JsonElement)o).getAsJsonObject().has("version")) {
                    asJsonObject = ((JsonElement)o).getAsJsonObject().get("version").getAsJsonObject();
                    if (asJsonObject.has("protocol")) {
                        intValue = asJsonObject.get("protocol").getAsLong().intValue();
                    }
                }
                else {
                    asJsonObject = new JsonObject();
                    ((JsonElement)o).getAsJsonObject().add("version", asJsonObject);
                }
            }
            else {
                o = new JsonObject();
                asJsonObject = new JsonObject();
                ((JsonElement)o).getAsJsonObject().add("version", asJsonObject);
            }
            if (Class8563.method28792().method23283()) {
                asJsonObject.add("supportedVersions", Class8557.method28750().toJsonTree(Class8563.method28791().method31746()));
            }
            if (Class8626.field36206 == -1) {
                Class8626.field36206 = intValue;
            }
            if (Class8563.method28794().method33549().method29950(Class6493.class) == null) {
                class8699.method29841().method18234(false);
                return;
            }
            final int method19535 = Class8563.method28794().method33549().method29950(Class6493.class).method19535(class8699.method29841());
            List<Class7803<Integer, Class5207>> method19536 = null;
            if (class8700.method20207() >= method19535 || Class8563.method28793().method34760()) {
                method19536 = Class8626.method29280(class8700.method20207(), method19535);
            }
            if (method19536 != null) {
                if (intValue == method19535 || intValue == 0) {
                    asJsonObject.addProperty("protocol", class8700.method20207());
                }
            }
            else {
                class8699.method29841().method18234(false);
            }
            if (Class8563.method28792().method23293().contains(class8700.method20207())) {
                asJsonObject.addProperty("protocol", -1);
            }
            class8699.method29821(Class5260.field22308, 0, Class8557.method28750().toJson((JsonElement)o));
        }
        catch (final JsonParseException ex) {
            ex.printStackTrace();
        }
    }
}
