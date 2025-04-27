// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.glfw.GLFW;
import org.newdawn.slick.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

public class TextField extends Class4825
{
    public static final ColorHelper field20670;
    public static final ColorHelper field20671;
    private String field20672;
    private float field20673;
    private final float field20674 = 2.0f;
    private float field20675;
    private float field20676;
    private final float field20677 = 2.0f;
    private int field20678;
    private int field20679;
    private int field20680;
    private boolean field20681;
    private boolean field20682;
    private boolean field20683;
    private String field20684;
    private TimerUtil field20685;
    private final List<Class8992> field20686;
    private boolean field20687;
    
    public TextField(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, TextField.field20670, "", false);
        this.field20672 = "";
        this.field20683 = false;
        this.field20684 = Character.toString('·');
        this.field20685 = new TimerUtil();
        this.field20686 = new ArrayList<Class8992>();
        this.field20687 = true;
        this.field20685.start();
    }
    
    public TextField(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, "", false);
        this.field20672 = "";
        this.field20683 = false;
        this.field20684 = Character.toString('·');
        this.field20685 = new TimerUtil();
        this.field20686 = new ArrayList<Class8992>();
        this.field20687 = true;
        this.field20685.start();
    }
    
    public TextField(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
        this.field20672 = "";
        this.field20683 = false;
        this.field20684 = Character.toString('·');
        this.field20685 = new TimerUtil();
        this.field20686 = new ArrayList<Class8992>();
        this.field20687 = true;
        this.field20685.start();
    }
    
    public TextField(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final String field20672) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, ClientFonts.JelloLight25, false);
        this.field20672 = "";
        this.field20683 = false;
        this.field20684 = Character.toString('·');
        this.field20685 = new TimerUtil();
        this.field20686 = new ArrayList<Class8992>();
        this.field20687 = true;
        this.field20672 = field20672;
        this.field20685.start();
    }
    
    public TextField(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final String field20672, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
        this.field20672 = "";
        this.field20683 = false;
        this.field20684 = Character.toString('·');
        this.field20685 = new TimerUtil();
        this.field20686 = new ArrayList<Class8992>();
        this.field20687 = true;
        this.field20672 = field20672;
        this.field20685.start();
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        String s = this.field20495;
        if (this.field20683) {
            s = this.field20495.replaceAll(".", this.field20684);
        }
        if (this.method14308() && this.field20488) {
            Client.getInstance().getScreenManager().method32133(ScreenManager.field37991);
        }
        this.field20673 += ((this.field20488 ? 1.0f : 0.0f) - this.field20673) / 2.0f;
        if (!this.field20488) {
            this.field20678 = 0;
            this.field20679 = 0;
            this.field20676 = 0.0f;
        }
        else if (this.field20681) {
            this.field20678 = Class9274.method34216(s, this.field20496, (float)this.method14280(), n, this.field20675);
        }
        this.field20678 = Math.min(Math.max(0, this.field20678), s.length());
        this.field20680 = this.field20678;
    }
    
    public void method14469() {
        this.field20675 = 0.0f;
    }
    
    public void method14470(final String field20684) {
        this.field20684 = field20684;
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (super.method14211(n, n2, n3)) {
            return true;
        }
        String s = this.field20495;
        if (this.field20683) {
            s = this.field20495.replaceAll(".", this.field20684);
        }
        this.field20681 = true;
        this.field20678 = Class9274.method34216(s, this.field20496, (float)this.method14280(), n, this.field20675);
        if (!Class8341.method27798(Minecraft.getInstance().window.getHandle(), 340) && !Class8341.method27798(Minecraft.getInstance().window.getHandle(), 344)) {
            this.field20679 = this.field20678;
        }
        return false;
    }
    
    public void method14471() {
        this.method14251();
        this.field20678 = this.field20495.length();
        this.field20679 = 0;
        this.field20680 = this.field20678;
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        super.method14233(n, n2, n3);
        this.field20681 = false;
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (this.field20488) {
            switch (n) {
                case 256: {
                    this.method14307(false);
                    break;
                }
                case 259: {
                    if (this.field20495.length() > 0) {
                        if (this.field20679 != this.field20680) {
                            this.field20495 = Class9274.method34215(this.field20495, "", this.field20679, this.field20680);
                            if (this.field20678 > this.field20679) {
                                this.field20678 -= Math.max(this.field20679, this.field20680) - Math.min(this.field20679, this.field20680);
                            }
                        }
                        else if (this.method14472()) {
                            int field20678 = -1;
                            for (int i = Math.max(this.field20678 - 1, 0); i >= 0; --i) {
                                if ((String.valueOf(this.field20495.charAt(i)).equalsIgnoreCase(" ") || i == 0) && Math.abs(this.field20678 - i) > 1) {
                                    field20678 = i + ((i != 0) ? 1 : 0);
                                    break;
                                }
                            }
                            if (field20678 != -1) {
                                this.field20495 = Class9274.method34215(this.field20495, "", field20678, this.field20678);
                                this.field20678 = field20678;
                            }
                        }
                        else {
                            this.field20495 = Class9274.method34215(this.field20495, "", this.field20678 - 1, this.field20678);
                            --this.field20678;
                        }
                        this.method14474();
                    }
                    this.field20679 = this.field20678;
                    break;
                }
                case 268: {
                    this.field20678 = 0;
                    if (!Class8341.method27798(Minecraft.getInstance().window.getHandle(), 340) && !Class8341.method27798(Minecraft.getInstance().window.getHandle(), 344)) {
                        this.field20679 = this.field20678;
                        break;
                    }
                    break;
                }
                case 269: {
                    this.field20678 = this.field20495.length();
                    if (!Class8341.method27798(Minecraft.getInstance().window.getHandle(), 340) && !Class8341.method27798(Minecraft.getInstance().window.getHandle(), 344)) {
                        this.field20679 = this.field20678;
                        break;
                    }
                    break;
                }
                case 263: {
                    if (this.method14472()) {
                        int field20679 = -1;
                        for (int j = Math.max(this.field20678 - 1, 0); j >= 0; --j) {
                            try {
                                if ((String.valueOf(this.field20495.charAt(j)).equalsIgnoreCase(" ") || j == 0) && Math.abs(this.field20678 - j) > 1) {
                                    field20679 = j;
                                    break;
                                }
                            }
                            catch (final Exception ex) {
                                break;
                            }
                        }
                        if (field20679 != -1) {
                            this.field20678 = field20679;
                        }
                    }
                    else {
                        --this.field20678;
                    }
                    if (!Class8341.method27798(Minecraft.getInstance().window.getHandle(), 340) && !Class8341.method27798(Minecraft.getInstance().window.getHandle(), 344)) {
                        this.field20679 = this.field20678;
                        break;
                    }
                    break;
                }
                case 262: {
                    if (this.method14472()) {
                        int field20680 = -1;
                        for (int k = this.field20678; k < this.field20495.length(); ++k) {
                            try {
                                if ((String.valueOf(this.field20495.charAt(k)).equalsIgnoreCase(" ") || k == this.field20495.length() - 1) && (Math.abs(this.field20678 - k) > 1 || k == this.field20495.length() - 1)) {
                                    field20680 = k + 1;
                                    break;
                                }
                            }
                            catch (final Exception ex2) {
                                break;
                            }
                        }
                        if (field20680 != -1) {
                            this.field20678 = field20680;
                        }
                    }
                    else {
                        ++this.field20678;
                    }
                    if (!Class8341.method27798(Minecraft.getInstance().window.getHandle(), 340) && !Class8341.method27798(Minecraft.getInstance().window.getHandle(), 344)) {
                        this.field20679 = this.field20678;
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.method14472()) {
                        this.field20678 = this.field20495.length();
                        this.field20679 = 0;
                        this.field20680 = this.field20678;
                        break;
                    }
                    break;
                }
                case 88: {
                    if (this.method14472() && this.field20679 != this.field20680) {
                        GLFW.glfwSetClipboardString(Minecraft.getInstance().window.getHandle(), (CharSequence)this.field20495.substring(Math.min(this.field20679, this.field20680), Math.max(this.field20679, this.field20680)));
                        this.field20495 = Class9274.method34215(this.field20495, "", this.field20679, this.field20680);
                        if (this.field20678 > this.field20679) {
                            this.field20678 -= Math.max(this.field20679, this.field20680) - Math.min(this.field20679, this.field20680);
                        }
                        this.field20679 = this.field20678;
                        this.field20680 = this.field20678;
                        this.method14474();
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.method14472() && this.field20679 != this.field20680) {
                        GLFW.glfwSetClipboardString(Minecraft.getInstance().window.getHandle(), (CharSequence)this.field20495.substring(Math.min(this.field20679, this.field20680), Math.max(this.field20679, this.field20680)));
                        break;
                    }
                    break;
                }
                case 86: {
                    if (!this.method14472()) {
                        break;
                    }
                    String glfwGetClipboardString = "";
                    try {
                        glfwGetClipboardString = GLFW.glfwGetClipboardString(Minecraft.getInstance().window.getHandle());
                        if (glfwGetClipboardString == null) {
                            glfwGetClipboardString = "";
                        }
                    }
                    catch (final Exception ex3) {}
                    if (glfwGetClipboardString != "") {
                        if (this.field20679 != this.field20680) {
                            this.field20495 = Class9274.method34215(this.field20495, glfwGetClipboardString, this.field20679, this.field20680);
                            if (this.field20678 > this.field20679) {
                                this.field20678 -= Math.max(this.field20679, this.field20680) - Math.min(this.field20679, this.field20680);
                            }
                            this.field20678 += glfwGetClipboardString.length();
                            this.field20679 = this.field20678;
                        }
                        else {
                            this.field20495 = Class9274.method34214(this.field20495, glfwGetClipboardString, this.field20678);
                            this.field20678 += glfwGetClipboardString.length();
                            this.field20679 = this.field20678;
                        }
                        this.method14474();
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public boolean method14472() {
        return Class8341.method27798(Minecraft.getInstance().window.getHandle(), 341) || Class8341.method27798(Minecraft.getInstance().window.getHandle(), 345) || Class8341.method27798(Minecraft.getInstance().window.getHandle(), 343);
    }
    
    @Override
    public void method14232(final char c) {
        super.method14232(c);
        if (this.method14306() && Class9274.method34208(c)) {
            if (this.field20679 != this.field20680) {
                this.field20495 = Class9274.method34215(this.field20495, Character.toString(c), this.field20679, this.field20680);
            }
            else {
                this.field20495 = Class9274.method34214(this.field20495, Character.toString(c), this.field20678);
            }
            ++this.field20678;
            this.field20679 = this.field20678;
            this.method14474();
        }
    }
    
    @Override
    public void draw(final float n) {
        this.method14228();
        final float n2 = 1000.0f;
        final boolean b = this.field20488 && this.field20685.getElapsedTime() > n2 / 2.0f;
        if (this.field20685.getElapsedTime() > n2) {
            this.field20685.reset();
        }
        String s = this.field20495;
        if (this.field20683) {
            s = this.field20495.replaceAll(".", this.field20684);
        }
        RenderUtil.method26871(this.method14272(), this.method14274(), this.method14272() + this.field20480, this.method14274() + this.field20481, true);
        final int n3 = this.x + 4;
        final int n4 = this.field20480 - 4;
        final float n5 = n3 + this.field20675 + this.field20496.getWidth(s.substring(0, this.field20678));
        if (this.method14306()) {
            RenderUtil.method26876(n5 + (s.isEmpty() ? 0 : -1), (float)(this.y + this.field20481 / 2 - this.field20496.getHeight(s) / 2 + 2), n5 + (float)(s.isEmpty() ? 1 : 0), (float)(this.y + this.field20481 / 2 + this.field20496.getHeight(s) / 2 - 1), ColorUtils.applyAlpha(this.field20497.method19733(), b ? 0.8f : (0.1f * n)));
            final float n6 = n3 + this.field20496.getWidth(s.substring(0, this.field20678)) + this.field20676;
            if (n6 < n3) {
                this.field20676 += n3 - n6;
                this.field20676 -= Math.min((float)n4, this.field20676);
            }
            if (n6 > n3 + n4) {
                this.field20676 += n3 + n4 - n6;
            }
        }
        this.field20675 += (this.field20676 - this.field20675) / 2.0f;
        this.field20679 = Math.min(Math.max(0, this.field20679), s.length());
        this.field20680 = Math.min(Math.max(0, this.field20680), s.length());
        RenderUtil.method26876(n3 + this.field20675 + this.field20496.getWidth(s.substring(0, this.field20679)), (float)(this.y + this.field20481 / 2 - this.field20496.getHeight(s) / 2), n3 + this.field20675 + this.field20496.getWidth(s.substring(0, this.field20680)), (float)(this.y + this.field20481 / 2 + this.field20496.getHeight(s) / 2), ColorUtils.applyAlpha(-5516546, n));
        RenderUtil.method26890(this.field20496, n3 + this.field20675, (float)(this.y + this.field20481 / 2), (s.length() != 0 || (this.field20488 && s.length() > 0)) ? s : this.field20672, ColorUtils.applyAlpha(this.field20497.method19733(), (this.field20673 / 2.0f + 0.4f) * n * ((this.field20488 && s.length() > 0) ? 1.0f : 0.5f)), this.field20497.method19735(), this.field20497.method19737());
        RenderUtil.endScissor();
        if (this.field20687) {
            RenderUtil.method26876((float)this.x, (float)(this.y + this.field20481 - 2), (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(this.field20497.method19729(), (this.field20673 / 2.0f + 0.5f) * n));
        }
        super.draw(n);
    }
    
    public final void method14473(final Class8992 class8992) {
        this.field20686.add(class8992);
    }
    
    public void method14474() {
        final Iterator<Class8992> iterator = this.field20686.iterator();
        while (iterator.hasNext()) {
            iterator.next().method32082(this);
        }
    }
    
    public String method14475() {
        return this.field20672;
    }
    
    public void method14476(final String field20672) {
        this.field20672 = field20672;
    }
    
    public void method14477(final boolean field20683) {
        this.field20683 = field20683;
    }
    
    public void method14478(final boolean field20687) {
        this.field20687 = field20687;
    }
    
    static {
        field20670 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.DEEP_TEAL.color, Class2056.field11734, Class2056.field11738);
        field20671 = new ColorHelper(-1, -1, -1, ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11734, Class2056.field11738);
    }
}
