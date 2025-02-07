// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4663 implements Class4659
{
    public final /* synthetic */ CombatTracker field20176;
    
    public Class4663(final CombatTracker field20176) {
        this.field20176 = field20176;
    }
    
    @Override
    public void method13945(final Object... array) {
        CombatTracker.method33666(this.field20176).method14942("my other event", "hi");
        final JSONObject JSONObject = new JSONObject();
        JSONObject.put("session", "TOMYGAMESTESTINGID");
        CombatTracker.method33666(this.field20176).method14942("login", JSONObject);
        System.out.println("hey");
    }
}
