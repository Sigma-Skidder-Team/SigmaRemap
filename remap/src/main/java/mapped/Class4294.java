// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.UUID;

public class Class4294 implements IPacket<Class5813>
{
    private static String[] field19257;
    private UUID field19258;
    
    public Class4294() {
    }
    
    public Class4294(final UUID field19258) {
        this.field19258 = field19258;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19258 = class8654.method29504();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29503(this.field19258);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17439(this);
    }
    
    @Nullable
    public Entity method12899(final Class1849 class1849) {
        return class1849.method6914(this.field19258);
    }
}