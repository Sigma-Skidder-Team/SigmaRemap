// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;

public class Class3217 extends Class3167
{
    private Class3264 field15666;
    
    public Class3217() {
        super(Class8013.field32988, "Cubecraft", "Gameplay for Cubecraft");
    }
    
    @Override
    public void method9917() {
        this.field15666 = (Class3264)this.method9914();
    }
    
    @Class6753
    private void method10140(final Class5723 class5723) {
        if (this.method9906() && Class3217.field15514.field4684 != null) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4378) {
                final Class4378 class5724 = (Class4378)method16998;
                final String string = class5724.method13164().getString();
                final String method16999 = class5724.method13164().getFormattedText();
                final String lowerCase = Class3217.field15514.field4684.getName().getFormattedText().toLowerCase();
                Label_0100: {
                    if (this.field15666.method9883("AutoL")) {
                        if (!string.toLowerCase().contains("was slain by " + lowerCase)) {
                            if (!string.toLowerCase().contains("burned to death while fighting " + lowerCase)) {
                                if (!string.toLowerCase().contains("was shot by " + lowerCase)) {
                                    if (!string.toLowerCase().contains("burnt to a crisp while fighting " + lowerCase)) {
                                        if (!string.toLowerCase().contains("couldn't fly while escaping " + lowerCase)) {
                                            if (!string.toLowerCase().contains("thought they could survive in the void while escaping " + lowerCase)) {
                                                if (!string.toLowerCase().contains("fell to their death while escaping " + lowerCase)) {
                                                    if (!string.toLowerCase().contains("died in the void while escaping " + lowerCase)) {
                                                        break Label_0100;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.field15666.method10296(string);
                    }
                }
                if (method16999.contains("§a§lPlay Again §r§8\u2022 §r§6§lAuto Mode §r§8\u2022 §r§c§lLeave")) {
                    if (this.field15666.method9883("Auto Join")) {
                        final Iterator<ITextComponent> iterator = class5724.method13164().iterator();
                        while (iterator.hasNext()) {
                            final Class9485 method17000 = iterator.next().getStyle().method30410();
                            if (method17000 == null) {
                                continue;
                            }
                            if (method17000.method35309() != Class2075.field11973) {
                                continue;
                            }
                            if (!method17000.method35310().contains("playagain")) {
                                continue;
                            }
                            this.field15666.method10294(new Class7674(method17000.method35310(), (long)this.field15666.method9886("Auto Join delay") * 1000L));
                            Class9463.method35173().method35197().method25776(new Class6224("Auto Join", "Joining a new game in 3 seconds.", (int)(this.field15666.method9886("Auto Join delay") - 1.0f) * 1000));
                            break;
                        }
                    }
                }
                if (this.field15666.method9883("AutoGG")) {
                    if (method16999.equalsIgnoreCase("§e" + Class3217.field15514.field4684.getName().getFormattedText() + "§r§a won the game!§r")) {
                        this.field15666.method10295();
                    }
                }
            }
        }
    }
}
