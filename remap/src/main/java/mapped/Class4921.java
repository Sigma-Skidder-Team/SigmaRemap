// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;

public class Class4921 extends Class4825
{
    private final Class4817 field21055;
    public final /* synthetic */ Class4827 field21056;
    
    public Class4921(final Class4827 field21056, final Class4827 class4827, final int n) {
        this.field21056 = field21056;
        super(class4827, "verticalScrollBarButton", 0, 0, n, 10, true);
        this.field20602 = true;
        this.field21055 = (Class4817)class4827.getParent();
        this.setListening(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        final float n3 = (float)this.field21055.method14396().method14278();
        final float n4 = (float)this.field20475.getParent().method14278();
        final float n5 = (float)this.field20475.method14278();
        float n6 = n5 * (n4 / n3);
        final float n7 = n5;
        if (n6 >= 20.0f) {
            if (n6 > n7) {
                n6 = n7;
            }
        }
        else {
            n6 = 20.0f;
        }
        this.method14279((int)n6);
        if (!this.field20593 && this.method14278() != this.field20475.method14278()) {
            if (this.field21056.field20650 >= 0) {
                if (this.field21056.field20650 + this.field20475.getParent().method14278() > this.field21055.method14396().method14278()) {
                    this.field21056.field20650 = this.field21055.method14396().method14278() - this.field20475.getParent().method14278();
                }
            }
            else {
                this.field21056.field20650 = 0;
            }
            this.method14275((int)((this.field20475.method14278() - this.method14278()) * (this.field21056.field20650 / (n3 - n4)) + 0.5f));
        }
        else if (this.method14386()) {
            this.field21056.field20650 = (int)(this.method14274() / (float)this.field20475.method14278() * this.field21055.method14396().method14278());
            if (this.field21056.field20650 >= 0) {
                if (this.field21056.field20650 + this.field20475.getParent().method14278() > this.field21055.method14396().method14278()) {
                    this.field21056.field20650 = this.field21055.method14396().method14278() - this.field20475.getParent().method14278();
                }
            }
            else {
                this.field21056.field20650 = 0;
            }
            this.field21056.field20654.reset();
            this.field21056.field20654.start();
        }
    }
    
    @Override
    public void draw(float n) {
        final int n2 = 5;
        n *= (this.field20593 ? 0.75f : (this.field20491 ? 0.7f : 0.3f));
        int field20478 = this.x;
        int field20479 = this.field20480;
        if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
            final int n3 = 0;
            field20479 -= 7;
            field20478 += 7;
            RenderUtil.method26876((float)field20478, (float)(this.y + n3), (float)(field20478 + field20479), (float)(this.y + this.method14278() - n3), ColorUtils.applyAlpha(ClientColors.MID_GREY.color, n));
        }
        else {
            RenderUtil.method26904((float)field20478, (float)this.y, (float)field20479, (float)n2, ClientAssets.verticalscrollbartop, n);
            RenderUtil.method26904((float)field20478, (float)(this.y + this.field20481 - n2), (float)field20479, (float)n2, ClientAssets.verticalscrollbarbottom, n);
            RenderUtil.method26876((float)field20478, (float)(this.y + n2), (float)(field20478 + field20479), (float)(this.y + this.method14278() - n2), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.45f * n));
        }
        super.draw(n);
    }
}
