// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6489 implements Class6477
{
    private Map<String, Integer> field25846;
    
    public Class6489() {
        this.field25846 = new ConcurrentHashMap<String, Integer>();
        this.method19524("kebab");
        this.method19524("aztec");
        this.method19524("alban");
        this.method19524("aztec2");
        this.method19524("bomb");
        this.method19524("plant");
        this.method19524("wasteland");
        this.method19524("pool");
        this.method19524("courbet");
        this.method19524("sea");
        this.method19524("sunset");
        this.method19524("creebet");
        this.method19524("wanderer");
        this.method19524("graham");
        this.method19524("match");
        this.method19524("bust");
        this.method19524("stage");
        this.method19524("void");
        this.method19524("skullandroses");
        this.method19524("wither");
        this.method19524("fighters");
        this.method19524("pointer");
        this.method19524("pigscene");
        this.method19524("burningskull");
        this.method19524("skeleton");
        this.method19524("donkeykong");
    }
    
    private void method19524(final String str) {
        this.field25846.put("minecraft:" + str, this.field25846.size());
    }
    
    public Optional<Integer> method19525(String string) {
        if (!string.startsWith("minecraft:")) {
            string = "minecraft:" + string.toLowerCase(Locale.ROOT);
        }
        return (Optional<Integer>)Optional.fromNullable((Object)this.field25846.get(string));
    }
}
