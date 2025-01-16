// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3331 extends Class3167
{
    public Class3331() {
        super(Class8013.field32986, "Legit", "Increase the knockback you give to players");
    }
    
    @Class6753
    private void method10546(final Class5743 class5743) {
        if (this.method9906()) {
            Class3331.field15514.gameSettings.field23441.field2162 = true;
            if (Class3331.field15514.player.field2935 != 1) {
                if (Class3331.field15514.player.field2935 == 0) {
                    Class3331.field15514.gameSettings.field23435.field2162 = Class8341.method27798(Minecraft.method5277().field4632.method7690(), Class3331.field15514.gameSettings.field23435.field2161.field32860);
                }
            }
            else {
                Class3331.field15514.gameSettings.field23435.field2162 = false;
            }
        }
    }
}
