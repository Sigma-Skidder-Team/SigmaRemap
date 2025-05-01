// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth;

import com.mentalfrostbyte.Client;
import mapped.BufferedImageUtil;
import org.newdawn.slick.Texture;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.image.BufferedImage;

public class Challenge
{
    private final String uid;
    private boolean captcha;
    private final long creationDate = System.currentTimeMillis();
    private boolean valid = true;
    private String answer = "";
    private BufferedImage bufferedImage;
    private Texture captchaLoc;
    
    public Challenge(final String uid, final boolean captcha) {
        this.uid = uid;
        if (this.captcha == captcha) {
            new Thread(() -> {
                try {
                    final URL input = new URL("https://jelloprg.sigmaclient.info/captcha/" + uid + ".png");
                    this.bufferedImage = ImageIO.read(input);
                }
                catch (final IOException ignored) {}
            }).start();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (this.captchaLoc != null) {
                Client.getInstance().addTexture(this.captchaLoc);
            }
        }
        finally {
            super.finalize();
        }
    }

    public Texture getCaptcha() {
        if (this.captchaLoc == null && this.bufferedImage != null) {
            try {
                this.captchaLoc = BufferedImageUtil.getTexture("", this.bufferedImage);
            }
            catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return this.captchaLoc;
    }

    public boolean isCaptcha() {
        return this.captcha;
    }
    
    public boolean isValid() {
        return this.valid && this.creationDate > System.currentTimeMillis() - 300000L;
    }
    
    public void setValid(final boolean valid) {
        this.valid = valid;
    }
    
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(final String answer) {
        this.answer = answer;
    }
    
    public String getUid() {
        return this.uid;
    }
}
