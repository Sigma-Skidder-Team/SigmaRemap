// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class8156
{
    Class8156 field33590 = method26932("zombie_villager_cured");
    Class8156 field33591 = method26932("golem_killed");
    Class8156 field33592 = method26932("villager_hurt");
    Class8156 field33593 = method26932("villager_killed");
    Class8156 field33594 = method26932("trade");
    
    default Class8156 method26932(final String s) {
        return new Class8155(s);
    }
}
