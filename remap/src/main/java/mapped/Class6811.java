// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6811 extends Class6810<MinecraftServer, Class8184>
{
    public Class6811() {
        super(new ResourceLocation("function"), Class8184.class);
    }
    
    public void method20846(final CompoundNBT class51, final Class8184 class52) {
        class51.putString("Name", Class8184.method27100(class52).toString());
    }
    
    public Class8184 method20847(final CompoundNBT class51) {
        return new Class8184(new ResourceLocation(class51.getString("Name")));
    }
}
