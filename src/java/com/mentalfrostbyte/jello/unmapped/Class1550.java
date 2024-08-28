package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.network.NetworkManager;

public class Class1550 implements Runnable {
    private static String[] field8409;

    public Class1550(boolean var1) {

    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (Client.getInstance().getClientMode() == ClientMode.PREMIUM) {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException var4) {
                    break;
                }
            } else {
                NetworkManager.premium = true;
                break;
            }
        }
    }
}
