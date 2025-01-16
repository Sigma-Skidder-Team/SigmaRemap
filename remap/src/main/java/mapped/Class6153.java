// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6153
{
    public int field24884;
    public int field24885;
    public int field24886;
    public int field24887;
    public final boolean field24888;
    public int field24889;
    public int field24890;
    public int field24891;
    public final float[] field24892;
    public int field24893;
    
    public Class6153(final int n, final int n2, final boolean field24888, final boolean b) {
        RenderSystem.method29989(RenderSystem::method29985);
        this.field24888 = field24888;
        this.field24889 = -1;
        this.field24890 = -1;
        this.field24891 = -1;
        (this.field24892 = new float[4])[0] = 1.0f;
        this.field24892[1] = 1.0f;
        this.field24892[2] = 1.0f;
        this.field24892[3] = 0.0f;
        this.method18387(n, n2, b);
    }
    
    public void method18387(final int n, final int n2, final boolean b) {
        if (RenderSystem.method29984()) {
            this.method18388(n, n2, b);
        }
        else {
            RenderSystem.method29991(() -> this.method18388(n, n2, b));
        }
    }
    
    private void method18388(final int n, final int n2, final boolean b) {
        RenderSystem.method29989(RenderSystem::method29985);
        Class8933.method31515();
        if (this.field24889 >= 0) {
            this.method18389();
        }
        this.method18390(n, n2, b);
        Class8933.method31554(Class9026.field38160, 0);
    }
    
    public void method18389() {
        RenderSystem.method29989(RenderSystem::method29985);
        this.method18394();
        this.method18397();
        if (this.field24891 > -1) {
            Class8933.method31556(this.field24891);
            this.field24891 = -1;
        }
        if (this.field24890 > -1) {
            Class8995.method32102(this.field24890);
            this.field24890 = -1;
        }
        if (this.field24889 > -1) {
            Class8933.method31554(Class9026.field38160, 0);
            Class8933.method31557(this.field24889);
            this.field24889 = -1;
        }
    }
    
    public void method18390(final int n, final int n2, final boolean b) {
        RenderSystem.method29989(RenderSystem::method29985);
        this.field24886 = n;
        this.field24887 = n2;
        this.field24884 = n;
        this.field24885 = n2;
        this.field24889 = Class8933.method31558();
        this.field24890 = Class8995.method32101();
        if (this.field24888) {
            this.field24891 = Class8933.method31559();
        }
        this.method18391(9728);
        Class8933.method31617(this.field24890);
        Class8933.method31618(3553, 0, 32856, this.field24884, this.field24885, 0, 6408, 5121, null);
        Class8933.method31554(Class9026.field38160, this.field24889);
        Class8933.method31563(Class9026.field38160, Class9026.field38162, 3553, this.field24890, 0);
        if (this.field24888) {
            Class8933.method31555(Class9026.field38161, this.field24891);
            Class8933.method31560(Class9026.field38161, 33190, this.field24884, this.field24885);
            Class8933.method31561(Class9026.field38160, Class9026.field38163, Class9026.field38161, this.field24891);
        }
        this.method18392();
        this.method18402(b);
        this.method18394();
    }
    
    public void method18391(final int field24893) {
        RenderSystem.method29989(RenderSystem::method29985);
        this.field24893 = field24893;
        Class8933.method31617(this.field24890);
        Class8933.method31613(3553, 10241, field24893);
        Class8933.method31613(3553, 10240, field24893);
        Class8933.method31613(3553, 10242, 10496);
        Class8933.method31613(3553, 10243, 10496);
        Class8933.method31617(0);
    }
    
    public void method18392() {
        RenderSystem.method29989(RenderSystem::method29985);
        final int method31562 = Class8933.method31562(Class9026.field38160);
        if (method31562 == Class9026.field38164) {
            return;
        }
        if (method31562 == Class9026.field38165) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
        }
        if (method31562 == Class9026.field38166) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
        }
        if (method31562 == Class9026.field38167) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
        }
        if (method31562 != Class9026.field38168) {
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + method31562);
        }
        throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
    }
    
    public void method18393() {
        RenderSystem.method29989(RenderSystem::method29984);
        Class8933.method31617(this.field24890);
    }
    
    public void method18394() {
        RenderSystem.method29989(RenderSystem::method29985);
        Class8933.method31617(0);
    }
    
    public void method18395(final boolean b) {
        if (RenderSystem.method29984()) {
            this.method18396(b);
        }
        else {
            RenderSystem.method29991(() -> this.method18396(b));
        }
    }
    
    private void method18396(final boolean b) {
        RenderSystem.method29989(RenderSystem::method29985);
        Class8933.method31554(Class9026.field38160, this.field24889);
        if (b) {
            Class8933.method31624(0, 0, this.field24886, this.field24887);
        }
    }
    
    public void method18397() {
        if (RenderSystem.method29984()) {
            Class8933.method31554(Class9026.field38160, 0);
        }
        else {
            RenderSystem.method29991(() -> Class8933.method31554(Class9026.field38160, 0));
        }
    }
    
    public void method18398(final float n, final float n2, final float n3, final float n4) {
        this.field24892[0] = n;
        this.field24892[1] = n2;
        this.field24892[2] = n3;
        this.field24892[3] = n4;
    }
    
    public void method18399(final int n, final int n2) {
        this.method18400(n, n2, true);
    }
    
    public void method18400(final int n, final int n2, final boolean b) {
        RenderSystem.method29989(RenderSystem::method29988);
        if (RenderSystem.method29990()) {
            this.method18401(n, n2, b);
        }
        else {
            RenderSystem.method29991(() -> this.method18401(n, n2, b));
        }
    }
    
    private void method18401(final int n, final int n2, final boolean b) {
        RenderSystem.method29989(RenderSystem::method29984);
        Class8933.method31625(true, true, true, false);
        Class8933.method31514();
        Class8933.method31517(false);
        Class8933.method31633(5889);
        Class8933.method31634();
        Class8933.method31638(0.0, n, n2, 0.0, 1000.0, 3000.0);
        Class8933.method31633(5888);
        Class8933.method31634();
        Class8933.method31642(0.0f, 0.0f, -2000.0f);
        Class8933.method31624(0, 0, n, n2);
        Class8933.method31609();
        Class8933.method31506();
        Class8933.method31502();
        if (b) {
            Class8933.method31518();
            Class8933.method31508();
        }
        Class8933.method31646(1.0f, 1.0f, 1.0f, 1.0f);
        this.method18393();
        final float n3 = (float)n;
        final float n4 = (float)n2;
        final float n5 = this.field24886 / (float)this.field24884;
        final float n6 = this.field24887 / (float)this.field24885;
        final Tessellator method30116 = RenderSystem.method30116();
        final BufferBuilder method30117 = method30116.getBuffer();
        method30117.begin(7, DefaultVertexFormats.field39619);
        method30117.pos(0.0, n4, 0.0).tex(0.0f, 0.0f).method12399(255, 255, 255, 255).endVertex();
        method30117.pos(n3, n4, 0.0).tex(n5, 0.0f).method12399(255, 255, 255, 255).endVertex();
        method30117.pos(n3, 0.0, 0.0).tex(n5, n6).method12399(255, 255, 255, 255).endVertex();
        method30117.pos(0.0, 0.0, 0.0).tex(0.0f, n6).method12399(255, 255, 255, 255).endVertex();
        method30116.draw();
        this.method18394();
        Class8933.method31517(true);
        Class8933.method31625(true, true, true, true);
    }
    
    public void method18402(final boolean b) {
        RenderSystem.method29989(RenderSystem::method29985);
        this.method18395(true);
        Class8933.method31630(this.field24892[0], this.field24892[1], this.field24892[2], this.field24892[3]);
        int n = 16384;
        if (this.field24888) {
            Class8933.method31629(1.0);
            n |= 0x100;
        }
        Class8933.method31632(n, b);
        this.method18397();
    }
}
