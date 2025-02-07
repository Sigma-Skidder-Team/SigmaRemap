// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import net.minecraft.util.math.Vec3i;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Class4818 extends Class4817
{
    private List<Class4846> field20615;
    public final int field20616;
    public Animation field20617;
    public boolean field20618;
    public Class4846 field20619;
    
    public Class4818(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.field20615 = new ArrayList<Class4846>();
        this.field20616 = 70;
        (this.field20617 = new Animation(300, 300)).changeDirection(Direction.FORWARDS);
        this.field20599 = true;
        this.setListening(false);
        this.method14390();
    }
    
    public void method14390() {
    }
    
    public void method14398(final String s, final Vec3i class352, final int n) {
        final String string = "waypoint x" + class352.getX() + " z" + class352.getZ();
        if (this.field20610.method14224(string) == null) {
            final Class4846 class353 = new Class4846(this, string, this.x, this.method14250().get(0).method14250().size() * this.field20616, this.field20480, this.field20616, s, class352, n);
            class353.field20760 = class353.method14274();
            this.field20615.add(class353);
            this.addToList(class353);
            class353.doThis((class4820, n) -> ((Class4843)class4818.method14267()).field20752.method14718(class353.field20764.getX(), class353.field20764.getZ()));
            class353.method14516(class4848 -> {
                Client.getInstance().method35200().method24266(new Class8124(class353.field20763, class353.field20764.getX(), class353.field20764.getZ(), class353.field20765));
                class4847.field20610.method14246(class353);
                this.field20615.remove(class4848);
            });
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20615.sort((class4848, class4849) -> (class4848.field20760 < class4849.field20760 + class4848.method14278() / 2) ? -1 : 1);
        int n3 = 0;
        if (this.field20619 != null) {
            if (!this.field20619.method14386()) {
                if (this.field20618) {
                    this.field20619.method14533();
                    this.field20619 = null;
                    this.field20618 = false;
                }
            }
        }
        for (final Class4846 class4846 : this.field20615) {
            if (!class4846.method14386() && class4846.field20762.getDirection() == Direction.FORWARDS) {
                class4846.field20760 = n3 + 5;
            }
            else {
                class4846.field20760 = class4846.method14274();
            }
            n3 += class4846.method14278();
        }
        for (final Class4846 field20619 : this.field20615) {
            if (field20619.method14386()) {
                this.field20617.changeDirection(Direction.BACKWARDS);
                if (n > this.method14280() + 10) {
                    if (n < this.method14280() + 50) {
                        if (n2 < this.method14281() + this.method14278() - 10) {
                            if (n2 > this.method14281() + this.method14278() - 50) {
                                this.field20618 = true;
                                this.field20619 = field20619;
                                break;
                            }
                        }
                    }
                }
                this.field20618 = false;
                this.field20619 = null;
                break;
            }
            if (!field20619.method14386()) {
                if (this.field20617.getDirection() == Direction.BACKWARDS) {
                    Client.getInstance().method35200().method24262().clear();
                    for (final Class4846 class4847 : this.field20615) {
                        Client.getInstance().method35200().method24262().add(new Class8124(class4847.field20763, class4847.field20764.getX(), class4847.field20764.getZ(), class4847.field20765));
                    }
                    Collections.reverse(Client.getInstance().method35200().method24262());
                    Client.getInstance().method35200().method24264();
                }
            }
            this.field20617.changeDirection(Direction.FORWARDS);
        }
    }
    
    @Override
    public void draw(final float n) {
        final float min = Math.min(1.0f, 0.21f * (60.0f / Minecraft.method5338()));
        for (final Class4846 class4846 : this.field20615) {
            if (!class4846.method14386()) {
                float n2 = (class4846.method14274() - class4846.field20760) * min;
                if (Math.round(n2) == 0 && n2 > 0.0f) {
                    n2 = 1.0f;
                }
                else if (Math.round(n2) == 0) {
                    if (n2 < 0.0f) {
                        n2 = -1.0f;
                    }
                }
                class4846.method14275(Math.round(class4846.method14274() - n2));
            }
        }
        super.draw(n);
        RenderUtil.method26900((float)(this.x - Math.round(Class7791.method25029(1.0f - this.field20617.calcPercent(), 0.0f, 1.0f, 1.0f) * 30.0f) + 18), (float)(this.field20481 - 46), 22.0f, 26.0f, ClientAssets.trashcan, ColorUtils.applyAlpha(this.field20618 ? ClientColors.PALE_YELLOW.color : ClientColors.DEEP_TEAL.color, this.field20617.calcPercent() * 0.5f), false);
    }
}
