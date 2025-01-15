// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;
import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;

public class Class5301 extends Class5260<String>
{
    private static final int field22354;
    
    public Class5301() {
        super(String.class);
    }
    
    public String method16431(final ByteBuf byteBuf) throws Exception {
        final int intValue = Class5260.field22312.method16378(byteBuf);
        Preconditions.checkArgument(intValue <= 32767 * Class5301.field22354, "Cannot receive string longer than Short.MAX_VALUE * " + Class5301.field22354 + " bytes (got %s bytes)", intValue);
        final String string = byteBuf.toString(byteBuf.readerIndex(), intValue, StandardCharsets.UTF_8);
        byteBuf.skipBytes(intValue);
        Preconditions.checkArgument(string.length() <= 32767, "Cannot receive string longer than Short.MAX_VALUE characters (got %s bytes)", string.length());
        return string;
    }
    
    public void method16432(final ByteBuf byteBuf, final String s) throws Exception {
        Preconditions.checkArgument(s.length() <= 32767, "Cannot send string longer than Short.MAX_VALUE (got %s characters)", s.length());
        final byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        Class5260.field22312.method16379(byteBuf, bytes.length);
        byteBuf.writeBytes(bytes);
    }
    
    static {
        field22354 = Character.toString('\uffff').getBytes(StandardCharsets.UTF_8).length;
    }
}
