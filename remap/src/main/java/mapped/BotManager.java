// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.entity.Entity;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class BotManager {
    private static String[] field37637;
    public Class7814 field37638;
    public List<Entity> field37639;

    public BotManager() {
        this.field37639 = new CopyOnWriteArrayList<Entity>();
    }

    public void method31750() {
        Client.getInstance().getEventBus().registerInstance(this);
    }

    public boolean method31751(final Entity class399) {
        return this.field37639.contains(class399);
    }

    public void method31752() {
        this.field37639.clear();
    }

    @EventListener
    @HighestPriority
    private void method31753(final EventLoadWorld eventLoadWorld) {
        this.field37639.clear();
    }

    @EventListener
    @HighestPriority
    private void method31754(final EventPlayerTickI eventPlayerTick) {
        if (this.field37638 != null) {
            for (final PlayerEntity class5744 : ColorUtils.method19108()) {
                if (!this.field37638.method25239(class5744)) {
                    if (!this.field37638.method25240(class5744)) {
                        continue;
                    }
                    if (!this.field37639.contains(class5744)) {
                        continue;
                    }
                    this.field37639.remove(class5744);
                } else {
                    if (this.field37639.contains(class5744)) {
                        continue;
                    }
                    this.field37639.add(class5744);
                }
            }
        }
    }
}
