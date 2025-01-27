// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class4800 extends Class4803
{
    public static int field20458;
    
    public Class4800(final String s) {
        super(null, s, 0, 0, Minecraft.method5277().field4632.method7694(), Minecraft.method5277().field4632.method7695());
    }
    
    public int method14201() {
        return 30;
    }
    
    @Override
    public void method14203(final JSONObject JSONObject) {
        super.method14203(JSONObject);
        this.method14277(Minecraft.method5277().field4632.method7694());
        this.method14279(Minecraft.method5277().field4632.method7695());
    }
    
    @Override
    public void method14204(final int n) {
        if (n == Minecraft.method5277().gameSettings.field23454.field2161.field32860) {
            Minecraft.method5277().field4632.method7685();
            Minecraft.method5277().gameSettings.field23430 = Minecraft.method5277().field4632.method7691();
        }
        super.method14204(n);
    }
    
    static {
        Class4800.field20458 = 0;
    }
}
