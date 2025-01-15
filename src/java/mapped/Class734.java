// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class734 extends Class527
{
    public Class734() {
        super(new Class2260("Out of memory!"));
    }
    
    @Override
    public void method2969() {
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 / 4 + 120 + 12, 150, 20, Class8822.method30773("gui.toTitle", new Object[0]), class654 -> this.field3150.method5244(new Class548())));
        this.method3029(new Class654(this.field3152 / 2 - 155 + 160, this.field3153 / 4 + 120 + 12, 150, 20, Class8822.method30773("menu.quit", new Object[0]), class654 -> this.field3150.method5253()));
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, this.field3153 / 4 - 60 + 20, 16777215);
        this.method3297(this.field3156, "Minecraft has run out of memory.", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 0, 10526880);
        this.method3297(this.field3156, "This could be caused by a bug in the game or by the", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 18, 10526880);
        this.method3297(this.field3156, "Java Virtual Machine not being allocated enough", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 27, 10526880);
        this.method3297(this.field3156, "memory.", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 36, 10526880);
        this.method3297(this.field3156, "To prevent level corruption, the current game has quit.", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 54, 10526880);
        this.method3297(this.field3156, "We've tried to free up enough memory to let you go back to", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 63, 10526880);
        this.method3297(this.field3156, "the main menu and back to playing, but this may not have worked.", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 72, 10526880);
        this.method3297(this.field3156, "Please restart the game if you see this message again.", this.field3152 / 2 - 140, this.field3153 / 4 - 60 + 60 + 81, 10526880);
        super.method2975(n, n2, n3);
    }
}
