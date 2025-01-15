// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.net.URL;
import java.io.File;
import java.util.List;

public class Class7494 extends Class7495 implements Class7493
{
    private static List<String> field28940;
    
    public Class7494(final File parent) {
        super(new File(parent, "config.yml"));
        this.method23324();
    }
    
    @Override
    public URL method23314() {
        return this.getClass().getClassLoader().getResource("assets/viaversion/config.yml");
    }
    
    @Override
    public void method23315(final Map<String, Object> map) {
        Map map2;
        if (!(map.get("velocity-servers") instanceof Map)) {
            map2 = new HashMap();
        }
        else {
            map2 = map.get("velocity-servers");
        }
        for (final Map.Entry<K, String> entry : new HashSet(map2.entrySet())) {
            if (!(entry.getValue() instanceof Integer)) {
                if (entry.getValue() instanceof String) {
                    final Class7906 method25612 = Class7906.method25612(entry.getValue());
                    if (method25612 != null) {
                        map2.put(entry.getKey(), method25612.method25613());
                    }
                    else {
                        map2.remove(entry.getKey());
                    }
                }
                else {
                    map2.remove(entry.getKey());
                }
            }
        }
        if (!map2.containsKey("default")) {
            try {
                map2.put("default", Class8751.method30256());
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        map.put("velocity-servers", map2);
    }
    
    @Override
    public List<String> method23316() {
        return Class7494.field28940;
    }
    
    @Override
    public boolean method23262() {
        return this.method23327("checkforupdates", false);
    }
    
    @Override
    public boolean method23263() {
        return this.method23327("prevent-collision", true);
    }
    
    @Override
    public boolean method23264() {
        return this.method23327("use-new-effect-indicator", true);
    }
    
    @Override
    public boolean method23265() {
        return this.method23327("use-new-deathmessages", true);
    }
    
    @Override
    public boolean method23266() {
        return true;
    }
    
    @Override
    public boolean method23267() {
        return this.method23327("shield-blocking", true);
    }
    
    @Override
    public boolean method23268() {
        return true;
    }
    
    @Override
    public boolean method23269() {
        return this.method23327("piston-animation-patch", false);
    }
    
    @Override
    public boolean method23270() {
        return true;
    }
    
    @Override
    public boolean method23271() {
        return this.method23327("bossbar-anti-flicker", false);
    }
    
    @Override
    public boolean method23272() {
        return false;
    }
    
    @Override
    public double method23273() {
        return this.method23330("hologram-y", -0.96);
    }
    
    @Override
    public boolean method23275() {
        return false;
    }
    
    @Override
    public int method23276() {
        return this.method23329("max-pps", 800);
    }
    
    @Override
    public String method23277() {
        return this.method23328("max-pps-kick-msg", "Sending packets too fast? lag?");
    }
    
    @Override
    public int method23278() {
        return this.method23329("tracking-period", 6);
    }
    
    @Override
    public int method23279() {
        return this.method23329("tracking-warning-pps", 120);
    }
    
    @Override
    public int method23280() {
        return this.method23329("tracking-max-warnings", 3);
    }
    
    @Override
    public String method23281() {
        return this.method23328("tracking-max-kick-msg", "You are sending too many packets, :(");
    }
    
    @Override
    public boolean method23282() {
        return false;
    }
    
    @Override
    public boolean method23283() {
        return this.method23327("send-supported-versions", false);
    }
    
    @Override
    public boolean method23284() {
        return this.method23327("simulate-pt", true);
    }
    
    @Override
    public boolean method23285() {
        return false;
    }
    
    @Override
    public boolean method23286() {
        return false;
    }
    
    @Override
    public boolean method23287() {
        return this.method23327("replace-pistons", false);
    }
    
    @Override
    public int method23288() {
        return this.method23329("replacement-piston-id", 0);
    }
    
    @Override
    public boolean method23274() {
        return this.method23263() && this.method23327("auto-team", true);
    }
    
    @Override
    public boolean method23289() {
        return this.method23327("force-json-transform", false);
    }
    
    @Override
    public boolean method23290() {
        return this.method23327("chat-nbt-fix", true);
    }
    
    @Override
    public boolean method23292() {
        return false;
    }
    
    @Override
    public List<Integer> method23293() {
        return this.method23331("block-protocols");
    }
    
    @Override
    public String method23294() {
        return this.method23328("block-disconnect-msg", "You are using an unsupported Minecraft version!");
    }
    
    @Override
    public String method23295() {
        return this.method23328("reload-disconnect-msg", "Server reload, please rejoin!");
    }
    
    @Override
    public boolean method23298() {
        return this.method23327("minimize-cooldown", true);
    }
    
    public int method23317() {
        return this.method23329("velocity-ping-interval", 60);
    }
    
    public boolean method23318() {
        return this.method23327("velocity-ping-save", true);
    }
    
    public Map<String, Integer> method23319() {
        return this.method23326("velocity-servers", (Class<HashMap>)Map.class, new HashMap());
    }
    
    @Override
    public boolean method23291() {
        return this.method23327("team-colour-fix", true);
    }
    
    @Override
    public boolean method23296() {
        return this.method23327("suppress-1_13-conversion-errors", false);
    }
    
    @Override
    public boolean method23297() {
        return this.method23327("disable-1_13-auto-complete", false);
    }
    
    @Override
    public boolean method23299() {
        return this.method23327("serverside-blockconnections", true);
    }
    
    @Override
    public String method23300() {
        return "packet";
    }
    
    @Override
    public boolean method23301() {
        return this.method23327("reduce-blockstorage-memory", false);
    }
    
    @Override
    public boolean method23302() {
        return this.method23327("flowerstem-when-block-above", false);
    }
    
    @Override
    public boolean method23303() {
        return this.method23327("fix-low-snow-collision", false);
    }
    
    @Override
    public int method23305() {
        return this.method23329("1_13-tab-complete-delay", 0);
    }
    
    @Override
    public boolean method23306() {
        return this.method23327("truncate-1_14-books", false);
    }
    
    @Override
    public boolean method23307() {
        return this.method23327("left-handed-handling", true);
    }
    
    @Override
    public boolean method23308() {
        return true;
    }
    
    @Override
    public boolean method23309() {
        return true;
    }
    
    @Override
    public boolean method23310() {
        return false;
    }
    
    @Override
    public boolean method23311() {
        return true;
    }
    
    @Override
    public boolean method23312() {
        return false;
    }
    
    @Override
    public boolean method23304() {
        return false;
    }
    
    @Override
    public boolean method23313() {
        return false;
    }
    
    static {
        Class7494.field28940 = Arrays.asList("nms-player-ticking", "item-cache", "anti-xray-patch", "quick-move-action-fix", "bungee-ping-interval", "bungee-ping-save", "bungee-servers", "blockconnection-method", "change-1_9-hitbox", "change-1_14-hitbox");
    }
}
