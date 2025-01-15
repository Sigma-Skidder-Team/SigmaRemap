// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import com.google.gson.stream.JsonWriter;
import java.util.Map;
import com.google.gson.TypeAdapter;

public class Class7905 extends TypeAdapter<Object>
{
    private static String[] field32447;
    public final /* synthetic */ Map field32448;
    public final /* synthetic */ Class8818 field32449;
    
    public Class7905(final Class8818 field32449, final Map field32450) {
        this.field32449 = field32449;
        this.field32448 = field32450;
    }
    
    public void write(final JsonWriter jsonWriter, final Object o) throws IOException {
        if (o != null) {
            jsonWriter.value(Class8818.method30761(this.field32449, o));
        }
        else {
            jsonWriter.nullValue();
        }
    }
    
    @Nullable
    public Object read(final JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return this.field32448.get(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }
}
