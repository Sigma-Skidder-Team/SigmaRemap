// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.Gson;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

public class Class4403 implements IPacket<Class5811>
{
    private static String[] field19725;
    private static final Gson field19726;
    private Class7787 field19727;
    
    public Class4403() {
    }
    
    public Class4403(final Class7787 field19727) {
        this.field19727 = field19727;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19727 = Class9583.method35929(Class4403.field19726, class8654.method29513(32767), Class7787.class);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29514(Class4403.field19726.toJson((Object)this.field19727));
    }
    
    public void method12826(final Class5811 class5811) {
        class5811.method17415(this);
    }
    
    public Class7787 method13250() {
        return this.field19727;
    }
    
    static {
        field19726 = new GsonBuilder().registerTypeAdapter((Type)Class9315.class, (Object)new Class5954()).registerTypeAdapter((Type)Class8499.class, (Object)new Class5956()).registerTypeAdapter((Type)Class7787.class, (Object)new Class5978()).registerTypeHierarchyAdapter((Class) ITextComponent.class, (Object)new Class5953()).registerTypeHierarchyAdapter((Class) Style.class, (Object)new Class5982()).registerTypeAdapterFactory((TypeAdapterFactory)new Class8818()).create();
    }
}
