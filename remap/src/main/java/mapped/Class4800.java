// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

public abstract class Class4800 extends CustomGuiScreen
{
    public static int field20458;
    
    public Class4800(final String s) {
        super(null, s, 0, 0, Minecraft.getInstance().window.method7694(), Minecraft.getInstance().window.method7695());
    }
    
    public int getFPS() {
        return 30;
    }
    
    @Override
    public void method14203(final JSONObject JSONObject) {
        super.method14203(JSONObject);
        this.method14277(Minecraft.getInstance().window.method7694());
        this.method14279(Minecraft.getInstance().window.method7695());
    }
    
    @Override
    public void onKeyPress(final int key) {
        if (key == Minecraft.getInstance().gameSettings.field23454.field2161.field32860) {
            Minecraft.getInstance().window.method7685();
            Minecraft.getInstance().gameSettings.field23430 = Minecraft.getInstance().window.method7691();
        }
        super.onKeyPress(key);
    }
    
    static {
        Class4800.field20458 = 0;
    }
}
