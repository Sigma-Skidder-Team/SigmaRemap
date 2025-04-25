// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class4814 extends CustomGuiScreen
{
    public final Class4859 field20584;
    public final Class4859 field20585;
    public final Class4859 field20586;
    public final Class4859 field20587;
    public final Class4859 field20588;
    public final Class4859 field20589;
    public final Class4859 field20590;
    
    public Class4814(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4);
        int n5 = 0;
        this.addToList(this.field20584 = new Class4859(this, "Singleplayer", this.method14376(n5++), this.method14375(), 114, 140, ClassicAssets.field40795));
        this.addToList(this.field20589 = new Class4859(this, "Multiplayer", this.method14376(n5++), this.method14375(), 114, 140, ClassicAssets.field40796));
        this.addToList(this.field20587 = new Class4859(this, "Options", this.method14376(n5++), this.method14375(), 114, 140, ClassicAssets.field40797));
        this.addToList(this.field20586 = new Class4859(this, "Language", this.method14376(n5++), this.method14375(), 114, 140, ClassicAssets.field40798));
        this.addToList(this.field20588 = new Class4859(this, "Accounts", this.method14376(n5++), this.method14375() + 140 + 10, 114, 140, ClassicAssets.field40799));
        this.addToList(this.field20590 = new Class4859(this, "Agora", this.method14376(n5++), this.method14375() + 140 + 10, 114, 140, ClassicAssets.field40803));
        this.addToList(this.field20585 = new Class4859(this, "Exit", this.method14376(n5++), this.method14375() + 140 + 10, 114, 140, ClassicAssets.field40800));
        this.field20584.doThis((class4803, n) -> this.method14372(new Class544(Minecraft.getInstance().currentScreen)));
        this.field20589.doThis((class4803, n) -> this.method14372(new Class721(Minecraft.getInstance().currentScreen)));
        this.field20587.doThis((class4803, n) -> this.method14372(new Class550(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings)));
        this.field20588.doThis((class4803, n) -> this.method14373(new Class4936()));
        this.field20586.doThis((class4803, n) -> this.method14372(new Class704(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings, Minecraft.getInstance().method5295())));
        this.field20585.doThis((class4803, n) -> Minecraft.getInstance().method5253());
    }
    
    public void method14372(final Screen class527) {
        Minecraft.getInstance().displayGuiScreen(class527);
        this.method14374();
    }
    
    public void method14373(final Class4800 class4800) {
        Client.getInstance().getScreenManager().method32156(class4800);
        this.method14374();
    }
    
    public void method14374() {
        Minecraft.getInstance().method5299().method6422(Class6836.method20933(Class8520.field35662, 1.0f));
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
        RenderUtil.method26905((float)(this.x + (this.method14276() - 300) / 2), (float)(this.y + 30), 300.0f, 97.0f, ClassicAssets.field40802);
        super.draw(n);
    }
}
