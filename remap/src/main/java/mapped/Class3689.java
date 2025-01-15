// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.hash.Hashing;
import java.io.BufferedWriter;
import java.nio.file.OpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.Objects;
import java.nio.file.Path;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.io.IOException;
import com.google.common.hash.HashFunction;

public interface Class3689
{
    public static final HashFunction field16998 = Hashing.sha1();
    
    void method11337(final Class8842 p0) throws IOException;
    
    String method11338();
    
    default void method11346(final Gson gson, final Class8842 class8842, final JsonElement jsonElement, final Path path) throws IOException {
        final String json = gson.toJson(jsonElement);
        final String string = Class3689.field16998.hashUnencodedChars((CharSequence)json).toString();
        if (!Objects.equals(class8842.method30884(path), string) || !Files.exists(path, new LinkOption[0])) {
            Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
            try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0])) {
                bufferedWriter.write(json);
            }
        }
        class8842.method30885(path, string);
    }
}
