// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class734 extends Screen
{
    public Class734() {
        super(new StringTextComponent("Out of memory!"));
    }
    
    @Override
    public void init() {
        this.addButton(new Class654(this.width / 2 - 155, this.height / 4 + 120 + 12, 150, 20, Class8822.method30773("gui.toTitle"), class654 -> this.minecraft.displayGuiScreen(new MainMenu())));
        this.addButton(new Class654(this.width / 2 - 155 + 160, this.height / 4 + 120 + 12, 150, 20, Class8822.method30773("menu.quit"), class654 -> this.minecraft.method5253()));
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, this.height / 4 - 60 + 20, 16777215);
        this.drawString(this.font, "Minecraft has run out of memory.", this.width / 2 - 140, this.height / 4 - 60 + 60, 10526880);
        this.drawString(this.font, "This could be caused by a bug in the game or by the", this.width / 2 - 140, this.height / 4 - 60 + 60 + 18, 10526880);
        this.drawString(this.font, "Java Virtual Machine not being allocated enough", this.width / 2 - 140, this.height / 4 - 60 + 60 + 27, 10526880);
        this.drawString(this.font, "memory.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 36, 10526880);
        this.drawString(this.font, "To prevent level corruption, the current game has quit.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 54, 10526880);
        this.drawString(this.font, "We've tried to free up enough memory to let you go back to", this.width / 2 - 140, this.height / 4 - 60 + 60 + 63, 10526880);
        this.drawString(this.font, "the main menu and back to playing, but this may not have worked.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 72, 10526880);
        this.drawString(this.font, "Please restart the game if you see this message again.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 81, 10526880);
        super.render(n, n2, n3);
    }
}
