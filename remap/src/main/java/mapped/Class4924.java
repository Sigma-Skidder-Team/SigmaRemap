// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.util.List;

public class Class4924 extends Class4815
{
    public final Category field21061;
    public Class4821 field21062;
    public float field21063;
    public static final int field21064 = 60;
    public int field21065;
    public int field21066;
    private int field21067;
    private final List<Class5098> field21068;
    
    public Class4924(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final Category field21061) {
        super(customGuiScreen, s, n, n2, 200, 350, true);
        this.field21068 = new ArrayList<Class5098>();
        this.method14277(200);
        this.method14279(350);
        this.field20602 = true;
        this.field21061 = field21061;
        this.method14773();
    }
    
    public void method14772() {
        this.runThisOnDimensionUpdate(() -> {
            this.method14245(this.field21062);
            final Class4821 field21062 = new Class4821(this, "modListView", 0, 60, this.method14276(), this.method14278() - 60, this.field21061);
            this.addToList(this.field21062 = field21062);
        });
    }
    
    private void method14773() {
        this.addToList(this.field21062 = new Class4821(this, "modListView", 0, 60, this.method14276(), this.method14278() - 60, this.field21061));
        this.field21062.method14270(new Class6508());
        this.field21062.method14270((class4803, class4804) -> {
            class4803.method14275(60);
            class4803.method14279(class4804.method14278() - 60);
        });
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (this.field21063 < 1.0f) {
            this.method14385(false);
            this.field20492 = false;
        }
        else {
            this.field21065 = this.method14272();
            this.field21066 = this.method14274();
            this.method14385(true);
        }
        final int n3 = (int)(200.0f + 140.0f * (1.0f - this.field21063));
        final int n4 = (int)(320.0f + 320.0f * (0.1f * (1.0f - this.field21063)));
        int field21066 = this.field21066;
        int n5 = (int)(this.field21065 - (n3 - 200.0f) / 2.0f + 0.5f);
        if (this.field21063 < 1.0f) {
            if (n5 < 0) {
                n5 = 0;
            }
            if (n5 + n3 > this.field20475.method14276()) {
                n5 = this.field20475.method14276() - n3;
            }
            if (field21066 + n4 > this.field20475.method14278()) {
                field21066 = this.field20475.method14278() - n4;
            }
        }
        this.method14277(n3);
        this.method14279(n4);
        this.method14273(n5);
        this.method14275(field21066);
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float partialTicks) {
        super.method14227();
        super.translate();
        final int n2 = (int)(1.0f + 10.0f * (1.0f - this.field21063));
        RenderUtil.method26913((float)(this.method14272() + (n2 - 1)), (float)(this.method14274() + (n2 - 1)), (float)(this.method14276() - (n2 - 1) * 2), (float)(this.method14278() - (n2 - 1) * 2), this.field21067 + (1.0f - this.field21063) * n2, partialTicks);
        RenderUtil.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + 60), AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, Math.min(1.0f, partialTicks * 0.9f * this.field21063)));
        RenderUtil.method26874((float)this.method14272(), this.method14274() + 60.0f * this.field21063, (float)this.method14276(), this.method14278() - 60.0f * this.field21063, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        if (this.field21063 <= 0.8f) {
            if (this.field21063 < 0.2f) {
                this.field21067 = 30;
            }
        }
        else {
            this.field21067 = 20;
        }
        RenderUtil.method26890(ClientFonts.JelloLight25, (float)(this.method14272() + 20), (float)(this.method14274() + 30), this.method14774().getName(), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, partialTicks * 0.5f * this.field21063), Class2056.field11734, Class2056.field11738);
        GL11.glPushMatrix();
        super.draw(partialTicks * partialTicks);
        GL11.glPopMatrix();
        if (this.field21062.method14392() > 0) {
            RenderUtil.drawImage((float)this.method14272(), (float)(this.method14274() + 60), (float)this.method14276(), 18.0f, ClientAssets.shadow_bottom, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks * this.field21063 * 0.5f));
        }
    }
    
    public Category method14774() {
        return this.field21061;
    }
    
    public final void method14775(final Class5098 class5098) {
        this.field21068.add(class5098);
    }
    
    public final void method14776(final Module class3167) {
        final Iterator<Class5098> iterator = this.field21068.iterator();
        while (iterator.hasNext()) {
            iterator.next().method15976(class3167);
        }
    }
}
