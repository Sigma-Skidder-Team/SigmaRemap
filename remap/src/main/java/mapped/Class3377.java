// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3377 extends Class3167
{
    public Class3377() {
        super(Class8013.field32986, "AutoLog", "Automatically logs out");
        this.method9881(new Class4996("Min Health", "Minimum health before it logs you out", 2.5f, Float.class, 0.0f, 10.0f, 0.01f));
        this.method9881(new Class4999("No Totems", "Logs out when you have no totems in inventory", false));
        this.method9881(new Class4999("One Time Use", "Disables the mod every time it saves you.", true));
    }
    
    @Class6753
    public void method10769(final Class5743 class5743) {
        if (this.method9906()) {
            if (Class3377.field15514.field4684.ticksExisted > 10) {
                if (Class3377.field15514.method5285() == null) {
                    if (Class3377.field15514.method5282() != null) {
                        if (Class3377.field15514.field4684.method2664() / Class3377.field15514.field4684.method2701() * 10.0f < this.method9886("Min Health") || Class8639.method29375(Class7739.field31590) == 0) {
                            final boolean method9883 = this.method9883("One Time Use");
                            Class3377.field15514.field4683.method6751();
                            Class3377.field15514.method5264();
                            Class3377.field15514.method5244(new Class735(new Class720(new Class548()), "disconnect.lost", new StringTextComponent("AutoLog disconnected you. " + (method9883 ? "The mod now disabled for you to reconnect." : "Disable it in a singleplayer world to reconnect."))));
                        }
                    }
                }
            }
        }
    }
}
