// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONObject;

public class Class4827 extends Class4825 implements Class4828
{
    public int field20650;
    public float field20651;
    public boolean field20652;
    public final Class4921 field20653;
    public TimerUtil field20654;
    
    public Class4827(final CustomGuiScreen customGuiScreen, final int n) {
        super(customGuiScreen, "verticalScrollBar", customGuiScreen.method14276() - n - 5, 5, n, customGuiScreen.method14278() - 10, false);
        this.field20654 = new TimerUtil();
        this.method14270((class4803, class4804) -> {
            class4803.method14273(class4804.method14276() - n - 5);
            class4803.method14275(5);
            class4803.method14277(n);
            class4803.method14279(class4804.method14278() - 10);
        });
        this.addToList(this.field20653 = new Class4921(this, this, n));
    }
    
    @Override
    public void method14235(final float n) {
        super.method14235(n);
        if ((this.field20475 != null && this.field20475.method14237(this.method14320(), this.method14321(), false)) || ((Class4817)this.field20475).field20614) {
            final float n2 = (float)((Class4817)this.getParent()).method14396().method14278();
            final float n3 = (float)this.getParent().method14278();
            final float n4 = (float)this.method14278();
            if (n2 == 0.0f) {
                return;
            }
            if (n3 / n2 >= 1.0f) {
                return;
            }
            this.field20650 -= Math.round((n >= 0.0f) ? (((Class4817)this.field20475).field20613 * n) : (1.0f * ((Class4817)this.field20475).field20613 * n));
            this.field20654.reset();
            this.field20654.start();
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20491 = this.method14237(n, n2, false);
        final float field20651 = this.field20651;
        float n3 = 0.0f;
        Label_0107: {
            if (this.field20653.method14278() >= this.method14278()) {
                n3 = -1.0f;
            }
            else {
                if (!this.method14308()) {
                    if (!this.field20653.method14386()) {
                        if (!this.field20654.isRunning() || this.field20654.getElapsedTime() >= 500L) {
                            n3 = -0.05f;
                            break Label_0107;
                        }
                    }
                }
                n3 = 0.05f;
            }
        }
        this.field20651 = field20651 + n3;
        this.field20651 = Math.min(Math.max(0.0f, this.field20651), 1.0f);
        final float n4 = (float)((Class4817)this.getParent()).method14396().method14278();
        final float n5 = (float)this.getParent().method14278();
        final float n6 = (float)this.method14278();
        boolean b = false;
        Label_0204: {
            if (n5 / n4 < 1.0f) {
                if (n4 > 0.0f) {
                    if (this.field20651 >= 0.0f) {
                        b = true;
                        break Label_0204;
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        this.setEnabled(b2);
        this.method14305(b2);
    }
    
    @Override
    public void draw(float n) {
        n *= this.field20651;
        final int n2 = 5;
        final int method19118 = ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.2f * n);
        int field20478 = this.x;
        int field20479 = this.field20480;
        if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
            final int n3 = 0;
            field20479 -= 8;
            field20478 += 8;
            RenderUtil.method26876((float)field20478, (float)(this.y + n3), (float)(field20478 + field20479), (float)(this.y + this.field20481 - n3), ColorUtils.applyAlpha(ClientColors.MID_GREY.color, 0.1f * n));
        }
        else {
            RenderUtil.method26904((float)field20478, (float)this.y, (float)field20479, 5.0f, ClientAssets.verticalscrollbartop, 0.45f * n);
            RenderUtil.method26904((float)field20478, (float)(this.y + this.field20481 - n2), (float)field20479, 5.0f, ClientAssets.verticalscrollbarbottom, 0.45f * n);
            RenderUtil.method26876((float)field20478, (float)(this.y + n2), (float)(field20478 + field20479), (float)(this.y + this.field20481 - n2), method19118);
        }
        super.draw(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (!super.method14211(n, n2, n3)) {
            this.field20491 = this.method14237(n, n2, false);
            if (this.method14308()) {
                final int n4 = n2 - this.method14281();
                if (n4 <= this.field20653.method14274() + this.field20653.method14278()) {
                    if (n4 < this.field20653.method14274()) {
                        this.field20650 -= (int)(((Class4817)this.field20475).method14396().method14278() / 4.0f);
                    }
                }
                else {
                    this.field20650 += (int)(((Class4817)this.field20475).method14396().method14278() / 4.0f);
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public JSONObject method14202(final JSONObject JSONObject) {
        JSONObject.put("offset", this.field20650);
        return super.method14202(JSONObject);
    }
    
    @Override
    public void method14203(final JSONObject JSONObject) {
        super.method14203(JSONObject);
        this.field20650 = CJsonUtils.getIntOrDefault(JSONObject, "offset", this.field20650);
    }
    
    @Override
    public int method14456() {
        return this.field20650;
    }
    
    @Override
    public void method14457(final int field20650) {
        this.field20650 = field20650;
    }
    
    @Override
    public boolean method14458() {
        return this.field20652;
    }
}
