// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

public class Class7904 extends TypeAdapter<Class2065>
{
    private static String[] field32446;
    
    public void write(final JsonWriter jsonWriter, final Class2065 class2065) throws IOException {
        jsonWriter.value(Class2065.method8155(class2065));
    }
    
    public Class2065 read(final JsonReader jsonReader) throws IOException {
        return Class2065.method8154(jsonReader.nextString());
    }
}
