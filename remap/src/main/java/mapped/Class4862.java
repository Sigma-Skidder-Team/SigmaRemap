// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Class4862 extends Class4841
{
    private List<Class4868> field20819;
    private final Date field20820;
    private boolean field20821;
    private Date field20822;
    public Vec3i field20823;
    public TextField field20824;
    public TextField field20825;
    public Class4905 field20826;
    private final List<Class8197> field20827;
    
    public Class4862(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final Vec3i field20823) {
        super(customGuiScreen, s, n - 107, n2 + 10, 214, 170, ColorHelper.field25964, "", false);
        this.field20819 = new ArrayList<Class4868>();
        this.field20821 = false;
        this.field20827 = new ArrayList<Class8197>();
        this.field20823 = field20823;
        if (this.y + this.field20481 <= Minecraft.method5277().window.method7695()) {
            this.y += 10;
        }
        else {
            this.y -= this.field20481 + 27;
            this.field20821 = true;
        }
        this.field20820 = new Date();
        this.method14301(true);
        this.setListening(false);
        final UIButton class4804;
        this.addToList(class4804 = new UIButton(this, "addButton", this.field20480 - 66, this.field20481 - 60, ClientFonts.JelloLight25.getWidth("Add"), 50, ColorHelper.field25964, "Add", ClientFonts.JelloLight25));
        class4804.doThis((class4803, n) -> this.method14581(this.field20825.getTypedText(), this.method14579(), this.field20826.field20984));
        this.addToList(this.field20825 = new TextField(this, "Name", 20, 7, this.field20480 - 40, 60, TextField.field20670, "My waypoint", "My waypoint"));
        this.field20825.method14471();
        this.field20825.method14478(false);
        this.addToList(this.field20826 = new Class4905(this, "badgeSelect", 0, 86));
        this.addToList(this.field20824 = new TextField(this, "Cords", 20, this.field20481 - 44, this.field20480 - 100, 20, TextField.field20670, field20823.getX() + " " + field20823.getZ(), field20823.getX() + " " + field20823.getZ()));
        this.field20824.method14478(false);
        this.field20824.setFont(ClientFonts.JelloLight18);
    }
    
    public Vec3i method14579() {
        if (this.field20824.getTypedText() != null) {
            if (this.field20824.getTypedText().contains(" ")) {
                final String[] split = this.field20824.getTypedText().split(" ");
                if (split.length == 2) {
                    if (split[0].matches("-?\\d+")) {
                        if (split[1].matches("-?\\d+")) {
                            return new Vec3i(Integer.valueOf(split[0]), 0, Integer.valueOf(split[1]));
                        }
                    }
                }
            }
        }
        return this.field20823;
    }
    
    @Override
    public void draw(float method35859) {
        method35859 = Animation.method35859(this.field20820, this.field20822, 250.0f, 120.0f);
        final float method35860 = Class7707.method24584(method35859, 0.0f, 1.0f, 1.0f);
        this.method14288(0.8f + method35860 * 0.2f, 0.8f + method35860 * 0.2f);
        this.method14293((int)(this.field20480 * 0.2f * (1.0f - method35860)) * (this.field20821 ? -1 : 1));
        super.method14227();
        final int n = 10;
        final int method35861 = ColorUtils.applyAlpha(-723724, Class7791.method25030(method35859, 0.0f, 1.0f, 1.0f));
        RenderUtil.method26913((float)(this.x + n / 2), (float)(this.y + n / 2), (float)(this.field20480 - n), (float)(this.field20481 - n), 35.0f, method35859);
        RenderUtil.method26876((float)(this.x + n / 2), (float)(this.y + n / 2), (float)(this.x - n / 2 + this.field20480), (float)(this.y - n / 2 + this.field20481), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, method35859 * 0.25f));
        RenderUtil.method26925((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, (float)n, method35861);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.x, (float)this.y, 0.0f);
        GL11.glRotatef(this.field20821 ? 90.0f : -90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-this.x), (float)(-this.y), 0.0f);
        RenderUtil.drawImage((float)(this.x + (this.field20821 ? this.field20481 : 0)), this.y + (this.field20480 - 47) / 2 * (this.field20821 ? -1.58f : 1.0f), 18.0f, 47.0f, ClientAssets.select, method35861);
        GL11.glPopMatrix();
        RenderUtil.method26876((float)(this.x + 25), (float)(this.y + 68), (float)(this.x + this.field20480 - 25), (float)(this.y + 69), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.05f * method35859));
        super.draw(method35859);
    }
    
    public final void method14580(final Class8197 class8197) {
        this.field20827.add(class8197);
    }
    
    public final void method14581(final String s, final Vec3i class352, final int n) {
        final Iterator<Class8197> iterator = this.field20827.iterator();
        while (iterator.hasNext()) {
            iterator.next().method27147(this, s, class352, n);
        }
    }
}
