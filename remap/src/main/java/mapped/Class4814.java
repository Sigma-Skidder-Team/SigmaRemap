// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class4814 extends Class4803
{
    public final Class4859 field20584;
    public final Class4859 field20585;
    public final Class4859 field20586;
    public final Class4859 field20587;
    public final Class4859 field20588;
    public final Class4859 field20589;
    public final Class4859 field20590;
    
    public Class4814(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
        int n5 = 0;
        this.addVisualThing(this.field20584 = new Class4859(this, "Singleplayer", this.method14376(n5++), this.method14375(), 114, 140, Class9493.field40795));
        this.addVisualThing(this.field20589 = new Class4859(this, "Multiplayer", this.method14376(n5++), this.method14375(), 114, 140, Class9493.field40796));
        this.addVisualThing(this.field20587 = new Class4859(this, "Options", this.method14376(n5++), this.method14375(), 114, 140, Class9493.field40797));
        this.addVisualThing(this.field20586 = new Class4859(this, "Language", this.method14376(n5++), this.method14375(), 114, 140, Class9493.field40798));
        this.addVisualThing(this.field20588 = new Class4859(this, "Accounts", this.method14376(n5++), this.method14375() + 140 + 10, 114, 140, Class9493.field40799));
        this.addVisualThing(this.field20590 = new Class4859(this, "Agora", this.method14376(n5++), this.method14375() + 140 + 10, 114, 140, Class9493.field40803));
        this.addVisualThing(this.field20585 = new Class4859(this, "Exit", this.method14376(n5++), this.method14375() + 140 + 10, 114, 140, Class9493.field40800));
        this.field20584.method14260((class4803, n) -> this.method14372(new Class544(Minecraft.method5277().field4700)));
        this.field20589.method14260((class4803, n) -> this.method14372(new Class721(Minecraft.method5277().field4700)));
        this.field20587.method14260((class4803, n) -> this.method14372(new Class550(Minecraft.method5277().field4700, Minecraft.method5277().gameSettings)));
        this.field20588.method14260((class4803, n) -> this.method14373(new Class4936()));
        this.field20586.method14260((class4803, n) -> this.method14372(new Class704(Minecraft.method5277().field4700, Minecraft.method5277().gameSettings, Minecraft.method5277().method5295())));
        this.field20585.method14260((class4803, n) -> Minecraft.method5277().method5253());
    }
    
    public void method14372(final Screen class527) {
        Minecraft.method5277().displayGuiScreen(class527);
        this.method14374();
    }
    
    public void method14373(final Class4800 class4800) {
        Client.method35173().method35193().method32156(class4800);
        this.method14374();
    }
    
    public void method14374() {
        Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35662, 1.0f));
    }
    
    private int method14375() {
        return 150;
    }
    
    private int method14376(int n) {
        final int n2 = 4;
        final int n3 = -6;
        final int n4 = 122 * n2 + n2 * n3;
        if (n < n2) {
            return this.method14276() / 2 - n4 / 2 + (n * 122 + n * n3) - 12;
        }
        n -= n2;
        final int n5 = 3;
        final int n6 = 6;
        return this.method14276() / 2 - (122 * n5 + n5 * n6) / 2 + (n * 122 + n * n6) - 12;
    }
    
    @Override
    public void draw(final float n) {
        this.method14228();
        RenderUtil.method26905((float)(this.field20478 + (this.method14276() - 300) / 2), (float)(this.field20479 + 30), 300.0f, 97.0f, Class9493.field40802);
        super.draw(n);
    }
}
