// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.util.Random;

public class Class4810 extends Class4803
{
    public Class4909 field20561;
    public Class4909 field20562;
    public Class4909 field20563;
    public Class4909 field20564;
    public Class4909 field20565;
    public Class4909 field20566;
    public Class4909 field20567;
    public Class4909 field20568;
    public Class4909 field20569;
    
    public Class4810(final Class4803 class4803, final String s, final int n, final int n2) {
        super(class4803, s, n, n2, 760, 87);
        this.addVisualThing(this.field20561 = new Class4909(this, "reload", 0, 0, 120, 40, "Reload", ClientColors.field1273.color));
        this.addVisualThing(this.field20562 = new Class4909(this, "back", 0, 48, 120, 40, "Back", ClientColors.field1273.color));
        final int n3 = 200;
        final int n4 = 146;
        final int n5 = this.method14276() - 625;
        this.addVisualThing(this.field20563 = new Class4909(this, "login", n5, 0, n3, 40, "Login", ClientColors.field1273.color));
        this.addVisualThing(this.field20566 = new Class4909(this, "direct", n5 + n3 + 16, 0, n3, 40, "Direct Login", ClientColors.field1273.color));
        this.addVisualThing(this.field20568 = new Class4909(this, "add", n5 + n3 * 2 + 32, 0, n3, 40, "Add", ClientColors.field1273.color));
        this.addVisualThing(this.field20564 = new Class4909(this, "random", n5, 48, n4, 40, "Random", ClientColors.field1273.color));
        this.addVisualThing(this.field20565 = new Class4909(this, "remove", n5 + n4 + 16, 48, n4, 40, "Remove", ClientColors.field1273.color));
        this.addVisualThing(this.field20567 = new Class4909(this, "edit", n5 + n4 * 2 + 32, 48, n4, 40, "Edit", ClientColors.field1273.color));
        this.addVisualThing(this.field20569 = new Class4909(this, "alpha", n5 + n4 * 3 + 48, 48, n4, 40, "Alphalts", ClientColors.field1273.color));
        final Class4936 class4804 = (Class4936)this.method14267();
        this.field20564.method14260((class4937, n) -> class4804.method14848(Client.getInstance().method35198().method25466().get(new Random().nextInt(Client.getInstance().method35198().method25466().size()))));
        this.field20562.method14260((class4803, n) -> Minecraft.method5277().displayGuiScreen(new Class548()));
        this.field20563.method14260((class4937, n) -> class4804.method14845());
        this.field20565.method14260((class4937, n) -> class4804.method14846());
        this.field20567.method14260((class4937, n) -> {
            final Class4836 method14855 = class4804.method14855();
            if (method14855 != null) {
                Client.getInstance().getGuimanager().method32156(new Class4933(method14855.field20723));
            }
        });
        this.field20568.method14260((class4803, n) -> Client.getInstance().getGuimanager().method32156(new Class4938()));
        this.field20566.method14260((class4803, n) -> Client.getInstance().getGuimanager().method32156(new Class4931()));
    }
    
    @Override
    public void method14305(final boolean b) {
        this.field20565.method14305(b);
        this.field20567.method14305(b);
        this.field20563.method14305(b);
    }
    
    public boolean method14340() {
        return this.field20565.isHovered();
    }
}
