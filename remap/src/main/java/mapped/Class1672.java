// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Class1672 implements Class1671
{
    @Override
    public void close() throws IOException {
    }
    
    @Override
    public ResourceLocation method5886() {
        return null;
    }
    
    @Override
    public InputStream method5887() {
        return new ByteArrayInputStream("{\"targets\":[\"jelloswap\",\"jello\"],\"passes\":[{\"name\":\"blur\",\"intarget\":\"minecraft:main\",\"outtarget\":\"jelloswap\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[1,0]},{\"name\":\"Radius\",\"values\":[20]}]},{\"name\":\"blur\",\"intarget\":\"jelloswap\",\"outtarget\":\"jello\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[0,1]},{\"name\":\"Radius\",\"values\":[20]}]}]}".getBytes());
    }
    
    @Override
    public <T> T method5888(final Class5092<T> class5092) {
        return null;
    }
    
    @Override
    public String method5889() {
        return null;
    }
}
