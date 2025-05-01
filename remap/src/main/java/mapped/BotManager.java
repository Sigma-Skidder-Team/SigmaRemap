// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.entity.Entity;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class BotManager {
    public List<Entity> bots = new CopyOnWriteArrayList<>();
    public AntiBotBase antiBot;

    public void init() {
        Client.getInstance().getEventBus().registerInstance(this);
    }

    public boolean isBot(Entity entity) {
        return this.bots.contains(entity);
    }

    public void clearBots() {
        this.bots.clear();
    }

    @EventListener
    @HighestPriority
    private void onLoadWorld(EventLoadWorld eventLoadWorld) {
        this.bots.clear();
    }

    @EventListener
    @HighestPriority
    private void onTIck(EventPlayerTick event) {
        if (this.antiBot != null) {
            for (PlayerEntity entity : AllUtils.getPlayerEntities()) {
                if (!this.antiBot.isBot(entity)) {
                    if (this.antiBot.isNotBot(entity)) {
                        this.bots.remove(entity);
                    }
                } else if (!this.bots.contains(entity)) {
                    this.bots.add(entity);
                }
            }
        }
    }
}
