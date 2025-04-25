// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

public class Class4663 implements Class4659
{
    public final /* synthetic */ IRCManager field20176;
    
    public Class4663(final IRCManager field20176) {
        this.field20176 = field20176;
    }
    
    @Override
    public void method13945(final Object... array) {
        IRCManager.method33666(this.field20176).method14942("my other event", "hi");
        final JSONObject JSONObject = new JSONObject();
        JSONObject.put("session", "TOMYGAMESTESTINGID");
        IRCManager.method33666(this.field20176).method14942("login", JSONObject);
        System.out.println("hey");
    }
}
